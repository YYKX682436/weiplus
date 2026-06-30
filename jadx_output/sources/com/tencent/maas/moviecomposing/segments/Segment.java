package com.tencent.maas.moviecomposing.segments;

/* loaded from: classes5.dex */
public class Segment {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.base.MJID f48532a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f48533b;

    public Segment(java.lang.String str, com.tencent.maas.moviecomposing.Timeline timeline) {
        this.f48532a = com.tencent.maas.base.MJID.of(str);
        this.f48533b = new java.lang.ref.WeakReference(timeline);
    }

    public static com.tencent.maas.model.time.MJTime m(com.tencent.maas.moviecomposing.segments.Segment segment, com.tencent.maas.moviecomposing.Timeline timeline) {
        com.tencent.maas.model.time.MJTime nativeGetDuration = segment.nativeGetDuration(timeline, segment.f48532a.value());
        return nativeGetDuration == null ? com.tencent.maas.model.time.MJTime.ZeroTime : nativeGetDuration;
    }

    private native com.tencent.maas.model.time.MJTimeRange nativeGetAbsoluteTimeRange(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native com.tencent.maas.model.time.MJTime nativeGetDuration(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native int nativeGetLayerID(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native com.tencent.maas.model.time.MJTimeRange nativeGetPresentationTimeRange(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String nativeGetSegmentTitle(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native int nativeGetSegmentType(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeIsAnchored(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeIsClipSegment(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeIsElementSegment(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeIsTransitionSegment(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native void nativeSetLayerID(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, int i17);

    private native void nativeSetSegmentTitle(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str, java.lang.String str2);

    public static java.lang.String o(com.tencent.maas.moviecomposing.segments.Segment segment, com.tencent.maas.moviecomposing.Timeline timeline) {
        java.lang.String nativeGetSegmentTitle = segment.nativeGetSegmentTitle(timeline, segment.f48532a.value());
        return nativeGetSegmentTitle == null ? "" : nativeGetSegmentTitle;
    }

    public static com.tencent.maas.model.time.MJTimeRange p(com.tencent.maas.moviecomposing.segments.Segment segment, com.tencent.maas.moviecomposing.Timeline timeline) {
        com.tencent.maas.model.time.MJTimeRange nativeGetAbsoluteTimeRange = segment.nativeGetAbsoluteTimeRange(timeline, segment.f48532a.value());
        return nativeGetAbsoluteTimeRange == null ? com.tencent.maas.model.time.MJTimeRange.ZeroTimeRange : nativeGetAbsoluteTimeRange;
    }

    public static com.tencent.maas.model.time.MJTimeRange r(com.tencent.maas.moviecomposing.segments.Segment segment, com.tencent.maas.moviecomposing.Timeline timeline) {
        com.tencent.maas.model.time.MJTimeRange nativeGetPresentationTimeRange = segment.nativeGetPresentationTimeRange(timeline, segment.f48532a.value());
        return nativeGetPresentationTimeRange == null ? com.tencent.maas.model.time.MJTimeRange.ZeroTimeRange : nativeGetPresentationTimeRange;
    }

    public static ug.m s(com.tencent.maas.moviecomposing.segments.Segment segment, com.tencent.maas.moviecomposing.Timeline timeline) {
        int nativeGetSegmentType = segment.nativeGetSegmentType(timeline, segment.f48532a.value());
        for (ug.m mVar : ug.m.values()) {
            if (mVar.f427446d == nativeGetSegmentType) {
                return mVar;
            }
        }
        return ug.m.None;
    }

    public com.tencent.maas.model.time.MJTime A() {
        return B().getStartTime();
    }

    public com.tencent.maas.model.time.MJTimeRange B() {
        return (com.tencent.maas.model.time.MJTimeRange) u(com.tencent.maas.model.time.MJTimeRange.ZeroTimeRange, new r.a() { // from class: ug.j$$b
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.Segment.r(com.tencent.maas.moviecomposing.segments.Segment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        });
    }

    public ug.m C() {
        return (ug.m) u(ug.m.None, new r.a() { // from class: ug.j$$d
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.Segment.s(com.tencent.maas.moviecomposing.segments.Segment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        });
    }

    public com.tencent.maas.moviecomposing.Timeline D() {
        return (com.tencent.maas.moviecomposing.Timeline) this.f48533b.get();
    }

    public java.lang.Object u(java.lang.Object obj, r.a aVar) {
        com.tencent.maas.moviecomposing.Timeline D = D();
        return D != null ? aVar.apply(D) : obj;
    }

    public com.tencent.maas.model.time.MJTimeRange v() {
        return (com.tencent.maas.model.time.MJTimeRange) u(com.tencent.maas.model.time.MJTimeRange.ZeroTimeRange, new r.a() { // from class: ug.j$$f
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.Segment.p(com.tencent.maas.moviecomposing.segments.Segment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        });
    }

    public com.tencent.maas.model.time.MJTime w() {
        return (com.tencent.maas.model.time.MJTime) u(com.tencent.maas.model.time.MJTime.ZeroTime, new r.a() { // from class: ug.j$$a
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.segments.Segment.m(com.tencent.maas.moviecomposing.segments.Segment.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        });
    }

    public boolean x() {
        return ((java.lang.Boolean) u(java.lang.Boolean.FALSE, new r.a() { // from class: ug.j$$e
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Boolean valueOf;
                valueOf = java.lang.Boolean.valueOf(r0.nativeIsAnchored((com.tencent.maas.moviecomposing.Timeline) obj, com.tencent.maas.moviecomposing.segments.Segment.this.f48532a.value()));
                return valueOf;
            }
        })).booleanValue();
    }

    public boolean y() {
        return ((java.lang.Boolean) u(java.lang.Boolean.FALSE, new r.a() { // from class: ug.j$$c
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Boolean valueOf;
                valueOf = java.lang.Boolean.valueOf(r0.nativeIsElementSegment((com.tencent.maas.moviecomposing.Timeline) obj, com.tencent.maas.moviecomposing.segments.Segment.this.f48532a.value()));
                return valueOf;
            }
        })).booleanValue();
    }

    public com.tencent.maas.model.time.MJTime z() {
        return B().getDuration();
    }
}
