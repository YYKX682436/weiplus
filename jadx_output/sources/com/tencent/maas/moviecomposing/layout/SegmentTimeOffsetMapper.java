package com.tencent.maas.moviecomposing.layout;

/* loaded from: classes5.dex */
public class SegmentTimeOffsetMapper {
    private com.tencent.maas.model.time.MJTimeRange timeRange = com.tencent.maas.model.time.MJTimeRange.InvalidTimeRange;
    private com.tencent.maas.moviecomposing.layout.OffsetRange pixelOffsetRange = com.tencent.maas.moviecomposing.layout.OffsetRange.c();
    private final com.facebook.jni.HybridData mHybridData = initHybrid();

    private native com.facebook.jni.HybridData initHybrid();

    private native double nativePixelOffsetForTime(com.tencent.maas.model.time.MJTime mJTime);

    private native void nativeRebuildWithTimeRange(com.tencent.maas.model.time.MJTimeRange mJTimeRange, double d17, double d18);

    private native com.tencent.maas.model.time.MJTime nativeTimeForPixelOffset(double d17);

    public com.tencent.maas.model.time.MJTime deltaTimeForDeltaPointOffset(double d17) {
        if (java.lang.Double.compare(d17, 0.0d) == 0) {
            return com.tencent.maas.model.time.MJTime.ZeroTime;
        }
        double d18 = this.pixelOffsetRange.f48510b;
        if (java.lang.Double.compare(d18, 0.0d) == 0) {
            return com.tencent.maas.model.time.MJTime.ZeroTime;
        }
        return com.tencent.maas.model.time.MJTime.fromSeconds((d17 / d18) * this.timeRange.getDuration().toSeconds());
    }

    public com.tencent.maas.moviecomposing.layout.OffsetRange getPixelOffsetRange() {
        return this.pixelOffsetRange;
    }

    public com.tencent.maas.model.time.MJTimeRange getTimeRange() {
        return this.timeRange;
    }

    public double pixelOffsetForTime(com.tencent.maas.model.time.MJTime mJTime) {
        return nativePixelOffsetForTime(mJTime);
    }

    public void rebuildWithTimeRange(com.tencent.maas.model.time.MJTimeRange mJTimeRange, com.tencent.maas.moviecomposing.layout.OffsetRange offsetRange) {
        this.timeRange = mJTimeRange;
        this.pixelOffsetRange = offsetRange;
        nativeRebuildWithTimeRange(mJTimeRange, offsetRange.f48509a, offsetRange.f48510b);
    }

    public com.tencent.maas.model.time.MJTime timeForPixelOffset(double d17) {
        return nativeTimeForPixelOffset(d17);
    }
}
