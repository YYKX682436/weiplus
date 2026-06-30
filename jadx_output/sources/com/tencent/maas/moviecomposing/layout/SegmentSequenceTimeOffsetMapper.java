package com.tencent.maas.moviecomposing.layout;

/* loaded from: classes5.dex */
public class SegmentSequenceTimeOffsetMapper {
    private static final java.lang.String TAG = "SegSeqT2OMapper";
    private final java.util.Map<com.tencent.maas.moviecomposing.layout.OffsetRange, com.tencent.maas.model.time.MJTimeRange> timeRangesByPixelOffsetRange = new java.util.HashMap();
    private final java.util.Map<com.tencent.maas.model.time.MJTimeRange, com.tencent.maas.moviecomposing.layout.OffsetRange> pixelOffsetRangesByTimeRange = new java.util.HashMap();
    private com.tencent.maas.moviecomposing.layout.OffsetRange pixelOffsetRangeBoundary = com.tencent.maas.moviecomposing.layout.OffsetRange.c();
    private com.tencent.maas.model.time.MJTimeRange timeRangeBoundary = com.tencent.maas.model.time.MJTimeRange.InvalidTimeRange;
    private com.tencent.maas.moviecomposing.layout.SegmentTimeOffsetMapper[] segmentViewMappers = null;
    private boolean isSequenceMapperDirty = true;
    private boolean isSequenceEmpty = true;
    private tg.a dataSource = null;
    private final com.facebook.jni.HybridData mHybridData = initHybrid();

    private native com.facebook.jni.HybridData initHybrid();

    private native com.tencent.maas.model.time.MJTime nativeMapPixelOffsetToTime(double d17);

    private native double nativeMapTimeToPixelOffset(com.tencent.maas.model.time.MJTime mJTime);

    private native void nativeMapperAddMappingForRange(com.tencent.maas.model.time.MJTimeRange mJTimeRange, double d17, double d18, com.tencent.maas.moviecomposing.layout.SegmentTimeOffsetMapper segmentTimeOffsetMapper);

    private native void nativeMapperClear();

    private double pixelOffsetForBackingTimeOutOfBoundary(com.tencent.maas.model.time.MJTime mJTime) {
        if (this.timeRangeBoundary.containsTime(mJTime)) {
            throw new java.lang.IllegalArgumentException("timeRangeBoundary " + this.timeRangeBoundary + " do not contains time " + mJTime);
        }
        com.tencent.maas.model.time.MJTime startTime = this.timeRangeBoundary.getStartTime();
        com.tencent.maas.model.time.MJTime endTime = this.timeRangeBoundary.getEndTime();
        ((bx0.f) this.dataSource).getClass();
        bx0.f fVar = (bx0.f) this.dataSource;
        fVar.getClass();
        bx0.h hVar = (bx0.h) fVar.f36250b;
        double s17 = hVar.f36275b.s(hVar.f36276c);
        if (mJTime.compare(startTime) < 0) {
            return this.pixelOffsetRangeBoundary.f48509a - java.lang.Math.round(startTime.sub(mJTime).toSeconds() * s17);
        }
        double round = java.lang.Math.round(mJTime.sub(endTime).toSeconds() * s17);
        com.tencent.maas.moviecomposing.layout.OffsetRange offsetRange = this.pixelOffsetRangeBoundary;
        return offsetRange.f48509a + offsetRange.f48510b + round;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0285  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void rebuild() {
        /*
            Method dump skipped, instructions count: 842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.moviecomposing.layout.SegmentSequenceTimeOffsetMapper.rebuild():void");
    }

    private void setSequenceMapperDirty(boolean z17) {
        if (this.isSequenceMapperDirty == z17) {
            return;
        }
        this.isSequenceMapperDirty = z17;
        if (z17) {
            nativeMapperClear();
            this.timeRangesByPixelOffsetRange.clear();
            this.pixelOffsetRangesByTimeRange.clear();
            this.timeRangeBoundary = com.tencent.maas.model.time.MJTimeRange.InvalidTimeRange;
            this.pixelOffsetRangeBoundary = com.tencent.maas.moviecomposing.layout.OffsetRange.c();
            this.isSequenceEmpty = true;
        }
    }

    public tg.a getDataSource() {
        return this.dataSource;
    }

    public boolean getIsSequenceEmpty() {
        return this.isSequenceEmpty;
    }

    public boolean getIsSequenceMapperDirty() {
        return this.isSequenceMapperDirty;
    }

    public com.tencent.maas.moviecomposing.layout.OffsetRange getPixelOffsetRangeBoundary() {
        return this.pixelOffsetRangeBoundary;
    }

    public com.tencent.maas.moviecomposing.layout.SegmentTimeOffsetMapper[] getSegmentViewMappers() {
        return this.segmentViewMappers;
    }

    public com.tencent.maas.model.time.MJTimeRange getTimeRangeBoundary() {
        return this.timeRangeBoundary;
    }

    public void markSequenceMapperDirty() {
        setSequenceMapperDirty(true);
    }

    public double pixelOffsetForTime(com.tencent.maas.model.time.MJTime mJTime) {
        rebuildIfNeeded();
        if (this.isSequenceEmpty) {
            return 0.0d;
        }
        double round = this.timeRangeBoundary.containsTime(mJTime) ? java.lang.Math.round(nativeMapTimeToPixelOffset(mJTime)) : pixelOffsetForBackingTimeOutOfBoundary(mJTime);
        if (java.lang.Double.isNaN(round)) {
            return 0.0d;
        }
        return round;
    }

    public com.tencent.maas.moviecomposing.layout.OffsetRange pixelOffsetRangeForTimeRange(com.tencent.maas.model.time.MJTimeRange mJTimeRange) {
        rebuildIfNeeded();
        if (this.pixelOffsetRangesByTimeRange.containsKey(mJTimeRange)) {
            return this.pixelOffsetRangesByTimeRange.get(mJTimeRange);
        }
        double pixelOffsetForTime = pixelOffsetForTime(mJTimeRange.getStartTime());
        return new com.tencent.maas.moviecomposing.layout.OffsetRange(pixelOffsetForTime, pixelOffsetForTime(mJTimeRange.getEndTime()) - pixelOffsetForTime);
    }

    public void rebuildIfNeeded() {
        if (this.isSequenceMapperDirty) {
            rebuild();
            this.isSequenceEmpty = this.segmentViewMappers.length == 0;
            setSequenceMapperDirty(false);
        }
    }

    public void setDataSource(tg.a aVar) {
        this.dataSource = aVar;
    }

    public com.tencent.maas.model.time.MJTime timeForPixelOffset(double d17) {
        rebuildIfNeeded();
        if (this.isSequenceEmpty) {
            return com.tencent.maas.model.time.MJTime.ZeroTime;
        }
        com.tencent.maas.moviecomposing.layout.OffsetRange offsetRange = this.pixelOffsetRangeBoundary;
        double d18 = offsetRange.f48509a;
        double d19 = offsetRange.f48510b;
        if (d17 >= d18 && d17 < d19 + d18) {
            return nativeMapPixelOffsetToTime(d17);
        }
        double d27 = d19 + d18;
        ((bx0.f) this.dataSource).getClass();
        bx0.f fVar = (bx0.f) this.dataSource;
        fVar.getClass();
        bx0.h hVar = (bx0.h) fVar.f36250b;
        double s17 = hVar.f36275b.s(hVar.f36276c);
        if (java.lang.Double.compare(d17, d18) < 0) {
            return this.timeRangeBoundary.getStartTime().sub(com.tencent.maas.model.time.MJTime.fromSeconds((d18 - d17) / s17));
        }
        return this.timeRangeBoundary.getEndTime().add(com.tencent.maas.model.time.MJTime.fromSeconds((d17 - d27) / s17));
    }

    public com.tencent.maas.model.time.MJTimeRange timeRangeForPixelOffsetRange(com.tencent.maas.moviecomposing.layout.OffsetRange offsetRange) {
        rebuildIfNeeded();
        return this.timeRangesByPixelOffsetRange.containsKey(offsetRange) ? this.timeRangesByPixelOffsetRange.get(offsetRange) : com.tencent.maas.model.time.MJTimeRange.fromStartEnd(timeForPixelOffset(offsetRange.f48509a), timeForPixelOffset(offsetRange.f48509a + offsetRange.f48510b));
    }
}
