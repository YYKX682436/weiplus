package com.tencent.liteav.videobase.utils;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::video")
/* loaded from: classes13.dex */
public class ConsumerChainTimestamp {
    private java.util.concurrent.atomic.AtomicLong mDeliverTimestamp = new java.util.concurrent.atomic.AtomicLong(0);
    private java.util.concurrent.atomic.AtomicLong mDecodeFinishTimestamp = new java.util.concurrent.atomic.AtomicLong(0);
    private java.util.concurrent.atomic.AtomicLong mRenderFinishTimestamp = new java.util.concurrent.atomic.AtomicLong(0);

    public void copy(com.tencent.liteav.videobase.utils.ConsumerChainTimestamp consumerChainTimestamp) {
        this.mDeliverTimestamp = consumerChainTimestamp.mDeliverTimestamp;
        this.mDecodeFinishTimestamp = consumerChainTimestamp.mDecodeFinishTimestamp;
        this.mRenderFinishTimestamp = consumerChainTimestamp.mRenderFinishTimestamp;
    }

    public long getDecodeFinishTimestamp() {
        return this.mDecodeFinishTimestamp.get();
    }

    public long getDeliverTimestamp() {
        return this.mDeliverTimestamp.get();
    }

    public long getRenderFinishTimestamp() {
        return this.mRenderFinishTimestamp.get();
    }

    public void setDecodeFinishTimestamp(long j17) {
        this.mDecodeFinishTimestamp.set(j17);
    }

    public void setDeliverTimestamp(long j17) {
        this.mDeliverTimestamp.set(j17);
    }

    public void setRenderFinishTimestamp(long j17) {
        this.mRenderFinishTimestamp.set(j17);
    }
}
