package bx0;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView f36236a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Rect f36237b;

    /* renamed from: c, reason: collision with root package name */
    public final int f36238c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.layout.SegmentSequenceTimeOffsetMapper f36239d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.SortedSet f36240e;

    /* renamed from: f, reason: collision with root package name */
    public final ex0.f f36241f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.layout.SegmentTimeOffsetMapper f36242g;

    /* renamed from: h, reason: collision with root package name */
    public final int f36243h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.layout.OffsetRange f36244i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f36245j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f36246k;

    public c(com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView timelineView, ex0.v storylineVM, ex0.f segmentVM, android.graphics.Rect originSegmentFrame, int i17, com.tencent.maas.moviecomposing.layout.SegmentSequenceTimeOffsetMapper timeOffsetMapper, com.tencent.maas.moviecomposing.layout.SegmentTimeOffsetMapper segmentTimeOffsetMapper, java.util.List list) {
        kotlin.jvm.internal.o.g(timelineView, "timelineView");
        kotlin.jvm.internal.o.g(storylineVM, "storylineVM");
        kotlin.jvm.internal.o.g(segmentVM, "segmentVM");
        kotlin.jvm.internal.o.g(originSegmentFrame, "originSegmentFrame");
        kotlin.jvm.internal.o.g(timeOffsetMapper, "timeOffsetMapper");
        kotlin.jvm.internal.o.g(segmentTimeOffsetMapper, "segmentTimeOffsetMapper");
        this.f36236a = timelineView;
        this.f36237b = originSegmentFrame;
        this.f36238c = i17;
        this.f36239d = timeOffsetMapper;
        java.util.TreeSet treeSet = new java.util.TreeSet(new bx0.a());
        kz5.z.u0(new com.tencent.maas.model.time.MJTime[0], treeSet);
        this.f36240e = treeSet;
        this.f36241f = segmentVM;
        this.f36242g = segmentTimeOffsetMapper;
        this.f36243h = (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 5);
        com.tencent.maas.moviecomposing.layout.OffsetRange pixelOffsetRangeForTimeRange = timeOffsetMapper.pixelOffsetRangeForTimeRange(segmentVM.l());
        kotlin.jvm.internal.o.f(pixelOffsetRangeForTimeRange, "pixelOffsetRangeForTimeRange(...)");
        this.f36244i = pixelOffsetRangeForTimeRange;
        java.util.Iterator it = ((java.util.ArrayList) storylineVM.f257177e).iterator();
        while (it.hasNext()) {
            com.tencent.maas.model.time.MJTimeRange l17 = ((ex0.r) it.next()).l();
            ((java.util.TreeSet) this.f36240e).add(l17.getStartTime());
            ((java.util.TreeSet) this.f36240e).add(l17.getEndTime());
        }
        if (list != null) {
            ((java.util.TreeSet) this.f36240e).addAll(list);
        }
        this.f36242g.rebuildWithTimeRange(segmentTimeOffsetMapper.getTimeRange(), segmentTimeOffsetMapper.getPixelOffsetRange());
    }

    public final com.tencent.maas.model.time.MJTime a(double d17) {
        java.lang.Object obj;
        java.lang.Object obj2;
        com.tencent.maas.moviecomposing.layout.SegmentSequenceTimeOffsetMapper segmentSequenceTimeOffsetMapper = this.f36239d;
        com.tencent.maas.model.time.MJTime timeForPixelOffset = segmentSequenceTimeOffsetMapper.timeForPixelOffset(d17);
        java.util.TreeSet treeSet = (java.util.TreeSet) this.f36240e;
        java.util.Iterator it = treeSet.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            com.tencent.maas.model.time.MJTime mJTime = (com.tencent.maas.model.time.MJTime) obj2;
            kotlin.jvm.internal.o.d(mJTime);
            kotlin.jvm.internal.o.d(timeForPixelOffset);
            if (mJTime.compare(timeForPixelOffset) >= 0) {
                break;
            }
        }
        com.tencent.maas.model.time.MJTime mJTime2 = (com.tencent.maas.model.time.MJTime) obj2;
        if (mJTime2 == null) {
            mJTime2 = com.tencent.maas.model.time.MJTime.InvalidTime;
        }
        for (java.lang.Object obj3 : treeSet) {
            com.tencent.maas.model.time.MJTime mJTime3 = (com.tencent.maas.model.time.MJTime) obj3;
            kotlin.jvm.internal.o.d(mJTime3);
            kotlin.jvm.internal.o.d(timeForPixelOffset);
            if (mJTime3.compare(timeForPixelOffset) <= 0) {
                obj = obj3;
            }
        }
        com.tencent.maas.model.time.MJTime mJTime4 = (com.tencent.maas.model.time.MJTime) obj;
        if (mJTime4 == null) {
            mJTime4 = com.tencent.maas.model.time.MJTime.InvalidTime;
        }
        if (!mJTime2.isValid() || !mJTime4.isValid()) {
            com.tencent.mars.xlog.Log.w("SegmentTrimContext", "find snap point. x = " + d17 + ", invalid time");
            this.f36245j = false;
            return mJTime2;
        }
        double pixelOffsetForTime = segmentSequenceTimeOffsetMapper.pixelOffsetForTime(mJTime2);
        double pixelOffsetForTime2 = segmentSequenceTimeOffsetMapper.pixelOffsetForTime(mJTime4);
        double d18 = pixelOffsetForTime - d17;
        double d19 = d17 - pixelOffsetForTime2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("try to find a snap point. range = [");
        sb6.append(pixelOffsetForTime2);
        sb6.append(", ");
        sb6.append(pixelOffsetForTime);
        sb6.append("], target = ");
        sb6.append(d17);
        sb6.append(", threshold = ");
        int i17 = this.f36243h;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("SegmentTrimContext", sb6.toString());
        double d27 = i17;
        com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView baseTimelineView = this.f36236a;
        if (d18 < d27) {
            if (this.f36245j) {
                return mJTime2;
            }
            kotlin.jvm.internal.o.g(baseTimelineView, "<this>");
            baseTimelineView.performHapticFeedback(0, 2);
            this.f36245j = true;
            return mJTime2;
        }
        if (d19 >= d27) {
            this.f36245j = false;
            com.tencent.maas.model.time.MJTime mJTime5 = com.tencent.maas.model.time.MJTime.InvalidTime;
            kotlin.jvm.internal.o.d(mJTime5);
            return mJTime5;
        }
        if (!this.f36245j) {
            kotlin.jvm.internal.o.g(baseTimelineView, "<this>");
            baseTimelineView.performHapticFeedback(0, 2);
            this.f36245j = true;
        }
        return mJTime4;
    }
}
