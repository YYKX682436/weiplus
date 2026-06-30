package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public class Storyline {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f48403a;

    public Storyline(com.tencent.maas.moviecomposing.Timeline timeline) {
        this.f48403a = new java.lang.ref.WeakReference(timeline);
    }

    public static java.lang.Boolean a(com.tencent.maas.moviecomposing.Storyline storyline, com.tencent.maas.moviecomposing.segments.Segment segment, com.tencent.maas.moviecomposing.Timeline timeline) {
        storyline.getClass();
        return java.lang.Boolean.valueOf(storyline.nativeContainsStorySegment(timeline, segment.f48532a.value()));
    }

    public static java.lang.Integer b(com.tencent.maas.moviecomposing.Storyline storyline, com.tencent.maas.moviecomposing.segments.Segment segment, com.tencent.maas.moviecomposing.Timeline timeline) {
        storyline.getClass();
        return java.lang.Integer.valueOf(storyline.nativeGetSegmentIndexByID(timeline, segment.f48532a.value()));
    }

    public static /* synthetic */ com.tencent.maas.model.time.MJTimeRange d(com.tencent.maas.moviecomposing.Storyline storyline, com.tencent.maas.moviecomposing.Timeline timeline) {
        com.tencent.maas.model.time.MJTimeRange nativeGetPresentationTimeRange = storyline.nativeGetPresentationTimeRange(timeline);
        return nativeGetPresentationTimeRange == null ? com.tencent.maas.model.time.MJTimeRange.ZeroTimeRange : nativeGetPresentationTimeRange;
    }

    public static /* synthetic */ com.tencent.maas.moviecomposing.segments.MusicSegment f(com.tencent.maas.moviecomposing.Storyline storyline, com.tencent.maas.moviecomposing.Timeline timeline) {
        return (com.tencent.maas.moviecomposing.segments.MusicSegment) ug.k.a(ug.m.Music, storyline.nativeGetMusicSegmentID(timeline), timeline);
    }

    public static /* synthetic */ com.tencent.maas.moviecomposing.segments.MovieTitleSegment i(com.tencent.maas.moviecomposing.Storyline storyline, com.tencent.maas.moviecomposing.Timeline timeline) {
        return (com.tencent.maas.moviecomposing.segments.MovieTitleSegment) ug.k.a(ug.m.MovieTitle, storyline.nativeGetMovieTitleSegmentID(timeline), timeline);
    }

    public static /* synthetic */ com.tencent.maas.moviecomposing.segments.Segment[] j(com.tencent.maas.moviecomposing.Storyline storyline, com.tencent.maas.moviecomposing.segments.Segment[] segmentArr, com.tencent.maas.moviecomposing.Timeline timeline) {
        java.lang.String[] nativeGetAllStorySegmentIDs = storyline.nativeGetAllStorySegmentIDs(timeline);
        if (nativeGetAllStorySegmentIDs != null) {
            segmentArr = new com.tencent.maas.moviecomposing.segments.Segment[nativeGetAllStorySegmentIDs.length];
            for (int i17 = 0; i17 < nativeGetAllStorySegmentIDs.length; i17++) {
                segmentArr[i17] = timeline.m(com.tencent.maas.base.MJID.of(nativeGetAllStorySegmentIDs[i17]));
            }
        }
        return segmentArr;
    }

    private native boolean nativeCheckIfHasDifferentClipSegment(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeContainsStorySegment(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native java.lang.String[] nativeGetAllStorySegmentIDs(com.tencent.maas.moviecomposing.Timeline timeline);

    private native java.lang.String[] nativeGetAllTransitionSegmentIDs(com.tencent.maas.moviecomposing.Timeline timeline);

    private native java.lang.String nativeGetMovieTitleSegmentID(com.tencent.maas.moviecomposing.Timeline timeline);

    private native java.lang.String nativeGetMusicSegmentID(com.tencent.maas.moviecomposing.Timeline timeline);

    private native java.lang.String nativeGetNextContentSegmentID(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native com.tencent.maas.model.time.MJTimeRange nativeGetPresentationTimeRange(com.tencent.maas.moviecomposing.Timeline timeline);

    private native java.lang.String nativeGetSegmentIDByIndex(com.tencent.maas.moviecomposing.Timeline timeline, int i17);

    private native int nativeGetSegmentIndexByID(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    /* JADX INFO: Access modifiers changed from: private */
    public native int nativeGetSegmentSize(com.tencent.maas.moviecomposing.Timeline timeline);

    private native java.lang.String nativeGetStorySegmentIDByTime(com.tencent.maas.moviecomposing.Timeline timeline, com.tencent.maas.model.time.MJTime mJTime);

    /* JADX INFO: Access modifiers changed from: private */
    public native boolean nativeHasMovieTitleSegment(com.tencent.maas.moviecomposing.Timeline timeline);

    private native boolean nativeHasMusicSegment(com.tencent.maas.moviecomposing.Timeline timeline);

    public final java.lang.Object k(java.lang.Object obj, r.a aVar) {
        com.tencent.maas.moviecomposing.Timeline timeline = (com.tencent.maas.moviecomposing.Timeline) this.f48403a.get();
        return timeline != null ? aVar.apply(timeline) : obj;
    }

    public com.tencent.maas.moviecomposing.segments.Segment[] l() {
        final com.tencent.maas.moviecomposing.segments.Segment[] segmentArr = new com.tencent.maas.moviecomposing.segments.Segment[0];
        return (com.tencent.maas.moviecomposing.segments.Segment[]) k(segmentArr, new r.a() { // from class: com.tencent.maas.moviecomposing.Storyline$$c
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.Storyline.j(com.tencent.maas.moviecomposing.Storyline.this, segmentArr, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        });
    }

    public com.tencent.maas.moviecomposing.segments.MusicSegment m() {
        return (com.tencent.maas.moviecomposing.segments.MusicSegment) k(null, new r.a() { // from class: com.tencent.maas.moviecomposing.Storyline$$a
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.tencent.maas.moviecomposing.Storyline.f(com.tencent.maas.moviecomposing.Storyline.this, (com.tencent.maas.moviecomposing.Timeline) obj);
            }
        });
    }

    public com.tencent.maas.model.time.MJTimeRange n() {
        com.tencent.maas.model.time.MJTimeRange mJTimeRange = com.tencent.maas.model.time.MJTimeRange.ZeroTimeRange;
        com.tencent.maas.moviecomposing.Timeline timeline = (com.tencent.maas.moviecomposing.Timeline) this.f48403a.get();
        return timeline != null ? d(this, timeline) : mJTimeRange;
    }

    public com.tencent.maas.moviecomposing.segments.Segment o(final int i17) {
        return (com.tencent.maas.moviecomposing.segments.Segment) k(null, new r.a() { // from class: com.tencent.maas.moviecomposing.Storyline$$b
            @Override // r.a
            public final java.lang.Object apply(java.lang.Object obj) {
                com.tencent.maas.moviecomposing.segments.Segment m17;
                int i18 = i17;
                m17 = r3.m(com.tencent.maas.base.MJID.of(com.tencent.maas.moviecomposing.Storyline.this.nativeGetSegmentIDByIndex((com.tencent.maas.moviecomposing.Timeline) obj, i18)));
                return m17;
            }
        });
    }

    public int p() {
        com.tencent.maas.moviecomposing.Timeline timeline = (com.tencent.maas.moviecomposing.Timeline) this.f48403a.get();
        return (timeline != null ? java.lang.Integer.valueOf(nativeGetSegmentSize(timeline)) : 0).intValue();
    }
}
