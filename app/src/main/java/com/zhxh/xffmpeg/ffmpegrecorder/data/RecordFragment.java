package com.zhxh.xffmpeg.ffmpegrecorder.data;

/**
 * Created by zhxh on 2018/5/21.
 */
public class RecordFragment {
    private long startTimestamp;
    private long endTimestamp;

    public void setStartTimestamp(long startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    public long getStartTimestamp() {
        return startTimestamp;
    }

    public void setEndTimestamp(long endTimestamp) {
        this.endTimestamp = endTimestamp;
    }

    public long getEndTimestamp() {
        return endTimestamp;
    }

    public long getDuration() {
        return endTimestamp - startTimestamp;
    }
}
