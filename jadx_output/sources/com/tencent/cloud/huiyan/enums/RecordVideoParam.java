package com.tencent.cloud.huiyan.enums;

/* loaded from: classes14.dex */
public class RecordVideoParam {
    private final int bitRate;
    private final int frameRate;

    /* loaded from: classes14.dex */
    public static class Builder {
        private int bitRate = 500000;
        private int frameRate = 20;

        public com.tencent.cloud.huiyan.enums.RecordVideoParam.Builder bitRate(int i17) {
            this.bitRate = i17;
            return this;
        }

        public com.tencent.cloud.huiyan.enums.RecordVideoParam build() {
            return new com.tencent.cloud.huiyan.enums.RecordVideoParam(this);
        }

        public com.tencent.cloud.huiyan.enums.RecordVideoParam.Builder frameRate(int i17) {
            this.frameRate = i17;
            return this;
        }
    }

    public static com.tencent.cloud.huiyan.enums.RecordVideoParam.Builder builder() {
        return new com.tencent.cloud.huiyan.enums.RecordVideoParam.Builder();
    }

    public int getBitRate() {
        return this.bitRate;
    }

    public int getFrameRate() {
        return this.frameRate;
    }

    private RecordVideoParam(com.tencent.cloud.huiyan.enums.RecordVideoParam.Builder builder) {
        this.bitRate = builder.bitRate;
        this.frameRate = builder.frameRate;
    }
}
