package com.tencent.liteav.videobase.utils;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::video")
/* loaded from: classes13.dex */
public class ProducerChainTimestamp {
    private java.util.concurrent.atomic.AtomicLong mCaptureTimestamp = new java.util.concurrent.atomic.AtomicLong(0);
    private java.util.concurrent.atomic.AtomicLong mPreprocessTimestamp = new java.util.concurrent.atomic.AtomicLong(0);
    private java.util.concurrent.atomic.AtomicLong mEncodeTimestamp = new java.util.concurrent.atomic.AtomicLong(0);
    private java.util.concurrent.atomic.AtomicLong mEncodeFinishTimestamp = new java.util.concurrent.atomic.AtomicLong(0);

    public void copy(com.tencent.liteav.videobase.utils.ProducerChainTimestamp producerChainTimestamp) {
        this.mCaptureTimestamp = producerChainTimestamp.mCaptureTimestamp;
        this.mPreprocessTimestamp = producerChainTimestamp.mPreprocessTimestamp;
        this.mEncodeTimestamp = producerChainTimestamp.mEncodeTimestamp;
        this.mEncodeFinishTimestamp = producerChainTimestamp.mEncodeFinishTimestamp;
    }

    public long getCaptureTimestamp() {
        return this.mCaptureTimestamp.get();
    }

    public long getEncodeFinishTimestamp() {
        return this.mEncodeFinishTimestamp.get();
    }

    public long getEncodeTimestamp() {
        return this.mEncodeTimestamp.get();
    }

    public long getPreprocessTimestamp() {
        return this.mPreprocessTimestamp.get();
    }

    public void setCaptureTimestamp(long j17) {
        this.mCaptureTimestamp.set(j17);
    }

    public void setEncodeFinishTimestamp(long j17) {
        this.mEncodeFinishTimestamp.set(j17);
    }

    public void setEncodeTimestamp(long j17) {
        this.mEncodeTimestamp.set(j17);
    }

    public void setPreprocessTimestamp(long j17) {
        this.mPreprocessTimestamp.set(j17);
    }
}
