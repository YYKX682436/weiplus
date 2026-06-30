package bx0;

/* loaded from: classes5.dex */
public final class h implements bx0.d {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView f36274a;

    /* renamed from: b, reason: collision with root package name */
    public final ex0.a0 f36275b;

    /* renamed from: c, reason: collision with root package name */
    public final bx0.i f36276c;

    /* renamed from: d, reason: collision with root package name */
    public final bx0.f f36277d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f36278e;

    /* renamed from: f, reason: collision with root package name */
    public double f36279f;

    /* renamed from: g, reason: collision with root package name */
    public int f36280g;

    /* renamed from: h, reason: collision with root package name */
    public final int f36281h;

    /* renamed from: i, reason: collision with root package name */
    public final int f36282i;

    /* renamed from: j, reason: collision with root package name */
    public final android.graphics.Rect f36283j;

    /* renamed from: k, reason: collision with root package name */
    public int f36284k;

    /* renamed from: l, reason: collision with root package name */
    public int f36285l;

    /* renamed from: m, reason: collision with root package name */
    public int f36286m;

    /* renamed from: n, reason: collision with root package name */
    public int f36287n;

    public h(com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView timelineView, ex0.a0 timelineVM, bx0.j uiStyle, bx0.i layoutType, boolean z17) {
        kotlin.jvm.internal.o.g(timelineView, "timelineView");
        kotlin.jvm.internal.o.g(timelineVM, "timelineVM");
        kotlin.jvm.internal.o.g(uiStyle, "uiStyle");
        kotlin.jvm.internal.o.g(layoutType, "layoutType");
        this.f36274a = timelineView;
        this.f36275b = timelineVM;
        this.f36276c = layoutType;
        bx0.f fVar = new bx0.f(timelineVM.f257092b, this, false, uiStyle, layoutType, z17);
        this.f36277d = fVar;
        this.f36278e = new java.util.concurrent.ConcurrentHashMap();
        this.f36280g = (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 16);
        this.f36281h = (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 36);
        this.f36282i = (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 14);
        this.f36283j = new android.graphics.Rect();
        e3.d insets = timelineView.getInsets();
        kotlin.jvm.internal.o.g(insets, "<set-?>");
        fVar.f36266r = insets;
        timelineVM.f257115y.observeForever(new bx0.g(this));
    }

    public static /* synthetic */ android.graphics.Rect c(bx0.h hVar, com.tencent.maas.base.MJID mjid, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        return hVar.b(mjid, z17);
    }

    public final void a() {
        bx0.f fVar = this.f36277d;
        fVar.f36265q = true;
        fVar.f36267s.markSequenceMapperDirty();
        fVar.b();
    }

    public final android.graphics.Rect b(com.tencent.maas.base.MJID segmentID, boolean z17) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        bx0.f fVar = this.f36277d;
        android.graphics.Rect d17 = fVar.d(segmentID);
        if (!z17) {
            return d17;
        }
        int max = java.lang.Math.max(fVar.f36266r.f247044a, d17.left);
        int i17 = d17.top;
        int min = java.lang.Math.min(e() - fVar.f36266r.f247046c, d17.right);
        int i18 = d17.bottom;
        android.graphics.Rect rect = this.f36283j;
        rect.set(max, i17, min, i18);
        return rect;
    }

    public final android.graphics.Rect d(com.tencent.maas.base.MJID segmentID, boolean z17) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        android.graphics.Rect b17 = b(segmentID, z17);
        int ordinal = this.f36276c.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2) {
                int i17 = b17.left;
                int i18 = b17.top;
                int i19 = this.f36277d.f36268t;
                int i27 = this.f36282i;
                b17.set(i17, i18 + i19 + i27, b17.right, i18 + i19 + this.f36281h + i27);
            } else if (ordinal != 3 && ordinal != 4 && ordinal != 5) {
                throw new jz5.j();
            }
        }
        return b17;
    }

    public final int e() {
        com.tencent.maas.model.time.MJTime mJTime;
        ex0.v vVar = this.f36275b.f257097g;
        ex0.r rVar = (ex0.r) kz5.n0.k0(vVar.f257177e);
        if (rVar == null || (mJTime = rVar.l().getEndTime()) == null) {
            mJTime = com.tencent.maas.model.time.MJTime.ZeroTime;
        }
        com.tencent.maas.model.time.MJTime sub = vVar.c().sub(mJTime);
        kotlin.jvm.internal.o.f(sub, "sub(...)");
        double seconds = sub.toSeconds() * r0.s(this.f36274a.getTimelineLayoutType());
        bx0.f fVar = this.f36277d;
        double d17 = fVar.f36267s.getPixelOffsetRangeBoundary().f48510b;
        e3.d dVar = fVar.f36266r;
        return (int) (((int) (d17 + dVar.f247044a + dVar.f247046c)) + seconds);
    }

    public android.graphics.Rect f() {
        com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView baseTimelineView = this.f36274a;
        float x17 = baseTimelineView.getX();
        float y17 = baseTimelineView.getY();
        return new android.graphics.Rect((int) x17, (int) y17, (int) (x17 + baseTimelineView.getWidth()), (int) (y17 + baseTimelineView.getHeight()));
    }

    public final void g(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        this.f36287n = b(segmentID, false).left;
        this.f36286m = b(segmentID, false).width();
    }
}
