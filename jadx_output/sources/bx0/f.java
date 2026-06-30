package bx0;

/* loaded from: classes5.dex */
public final class f implements tg.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.Timeline f36249a;

    /* renamed from: b, reason: collision with root package name */
    public final bx0.d f36250b;

    /* renamed from: c, reason: collision with root package name */
    public final bx0.i f36251c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f36252d;

    /* renamed from: e, reason: collision with root package name */
    public final float f36253e;

    /* renamed from: f, reason: collision with root package name */
    public final double f36254f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.maas.moviecomposing.layout.OffsetRange f36255g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.maas.moviecomposing.layout.OffsetRange f36256h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.maas.moviecomposing.layout.OffsetRange f36257i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.maas.moviecomposing.layout.OffsetRange f36258j;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.maas.moviecomposing.layout.OffsetRange f36259k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.Map f36260l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f36261m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f36262n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f36263o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Map f36264p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f36265q;

    /* renamed from: r, reason: collision with root package name */
    public e3.d f36266r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.layout.SegmentSequenceTimeOffsetMapper f36267s;

    /* renamed from: t, reason: collision with root package name */
    public final int f36268t;

    /* renamed from: u, reason: collision with root package name */
    public final float f36269u;

    /* renamed from: v, reason: collision with root package name */
    public final float f36270v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f36271w;

    /* renamed from: x, reason: collision with root package name */
    public final bx0.e f36272x;

    public f(com.tencent.maas.moviecomposing.Timeline timeline, bx0.d dataSource, boolean z17, bx0.j uiStyle, bx0.i layoutType, boolean z18) {
        kotlin.jvm.internal.o.g(timeline, "timeline");
        kotlin.jvm.internal.o.g(dataSource, "dataSource");
        kotlin.jvm.internal.o.g(uiStyle, "uiStyle");
        kotlin.jvm.internal.o.g(layoutType, "layoutType");
        this.f36249a = timeline;
        this.f36250b = dataSource;
        this.f36251c = layoutType;
        this.f36252d = z18;
        this.f36253e = 1.0f;
        double d17 = android.content.res.Resources.getSystem().getDisplayMetrics().density;
        this.f36254f = d17;
        com.tencent.maas.moviecomposing.layout.OffsetRange.c();
        this.f36255g = com.tencent.maas.moviecomposing.layout.OffsetRange.c();
        this.f36256h = com.tencent.maas.moviecomposing.layout.OffsetRange.c();
        com.tencent.maas.moviecomposing.layout.OffsetRange.c();
        this.f36257i = com.tencent.maas.moviecomposing.layout.OffsetRange.c();
        this.f36258j = com.tencent.maas.moviecomposing.layout.OffsetRange.c();
        this.f36259k = com.tencent.maas.moviecomposing.layout.OffsetRange.c();
        this.f36260l = new java.util.LinkedHashMap();
        this.f36261m = new java.util.LinkedHashMap();
        this.f36262n = new java.util.LinkedHashMap();
        this.f36263o = new java.util.LinkedHashMap();
        this.f36264p = new java.util.LinkedHashMap();
        this.f36265q = true;
        this.f36266r = e3.d.f247043e;
        com.tencent.maas.moviecomposing.layout.SegmentSequenceTimeOffsetMapper segmentSequenceTimeOffsetMapper = new com.tencent.maas.moviecomposing.layout.SegmentSequenceTimeOffsetMapper();
        segmentSequenceTimeOffsetMapper.setDataSource(this);
        this.f36267s = segmentSequenceTimeOffsetMapper;
        this.f36268t = z17 ? (int) (50.0f * d17) : uiStyle.f36296b;
        float f17 = (int) d17;
        this.f36269u = 24.0f * f17;
        this.f36270v = f17 * 22.0f;
        ((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).getClass();
        this.f36271w = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.mjpublisher.movie_composing.RepairerConfigMovieComposingTransitionEnable()) == 1;
        this.f36272x = bx0.e.f36247d;
    }

    public final void a(com.tencent.maas.moviecomposing.Storyline storyline) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(storyline, "<this>");
        ug.l lVar = new ug.l();
        int p17 = storyline.p();
        int i17 = 0;
        while (true) {
            arrayList = lVar.f427431a;
            if (i17 >= p17) {
                break;
            }
            com.tencent.maas.moviecomposing.segments.Segment o17 = storyline.o(i17);
            if (o17 != null && o17.C() == ug.m.Caption) {
                arrayList.add(o17);
            }
            i17++;
        }
        if (!(!arrayList.isEmpty())) {
            lVar = null;
        }
        if (lVar == null || this.f36258j.a()) {
            return;
        }
        com.tencent.maas.moviecomposing.layout.OffsetRange offsetRange = this.f36258j;
        double d17 = offsetRange.f48509a;
        double d18 = offsetRange.f48510b;
        java.util.Iterator it = lVar.f427431a.iterator();
        while (it.hasNext()) {
            com.tencent.maas.moviecomposing.segments.Segment segment = (com.tencent.maas.moviecomposing.segments.Segment) it.next();
            com.tencent.maas.moviecomposing.layout.OffsetRange b17 = this.f36267s.pixelOffsetRangeForTimeRange(segment.B()).b();
            android.graphics.Rect a17 = bx0.b.a(b17.f48509a, d17, b17.f48510b, d18);
            java.util.Map map = this.f36262n;
            com.tencent.maas.base.MJID mjid = segment.f48532a;
            kotlin.jvm.internal.o.f(mjid, "getSegmentID(...)");
            map.put(mjid, a17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x019b, code lost:
    
        if (r2 != null) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 1248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bx0.f.b():void");
    }

    public final void c(com.tencent.maas.moviecomposing.Storyline storyline) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(storyline, "<this>");
        ug.l lVar = new ug.l();
        int p17 = storyline.p();
        int i17 = 0;
        while (true) {
            arrayList = lVar.f427431a;
            if (i17 >= p17) {
                break;
            }
            com.tencent.maas.moviecomposing.segments.Segment o17 = storyline.o(i17);
            if (o17 != null && o17.C() == ug.m.Narration) {
                arrayList.add(o17);
            }
            i17++;
        }
        if (!(!arrayList.isEmpty())) {
            lVar = null;
        }
        if (lVar == null || this.f36257i.a()) {
            return;
        }
        com.tencent.maas.moviecomposing.layout.OffsetRange offsetRange = this.f36257i;
        double d17 = offsetRange.f48509a;
        double d18 = offsetRange.f48510b;
        java.util.Iterator it = lVar.f427431a.iterator();
        while (it.hasNext()) {
            com.tencent.maas.moviecomposing.segments.Segment segment = (com.tencent.maas.moviecomposing.segments.Segment) it.next();
            com.tencent.maas.model.time.MJTime endTime = storyline.n().getEndTime();
            com.tencent.maas.model.time.MJTime A = segment.A();
            kotlin.jvm.internal.o.f(A, "getPresentationStartTime(...)");
            kotlin.jvm.internal.o.d(endTime);
            com.tencent.maas.model.time.MJTime b17 = ou0.f.b(A, endTime);
            com.tencent.maas.model.time.MJTime endTime2 = segment.B().getEndTime();
            kotlin.jvm.internal.o.f(endTime2, "getEndTime(...)");
            com.tencent.maas.moviecomposing.layout.OffsetRange b18 = this.f36267s.pixelOffsetRangeForTimeRange(new com.tencent.maas.model.time.MJTimeRange(b17, ou0.f.b(endTime2, endTime).sub(b17))).b();
            android.graphics.Rect a17 = bx0.b.a(b18.f48509a, d17, b18.f48510b, d18);
            java.util.Map map = this.f36262n;
            com.tencent.maas.base.MJID mjid = segment.f48532a;
            kotlin.jvm.internal.o.f(mjid, "getSegmentID(...)");
            map.put(mjid, a17);
        }
    }

    public final android.graphics.Rect d(com.tencent.maas.base.MJID segmentID) {
        android.graphics.Rect rect;
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        java.util.Map map = this.f36262n;
        return (map.containsKey(segmentID) && (rect = (android.graphics.Rect) ((java.util.LinkedHashMap) map).get(segmentID)) != null) ? rect : new android.graphics.Rect(0, 0, 0, 0);
    }

    public final boolean e() {
        return this.f36249a.f48414a.p() == 0;
    }
}
