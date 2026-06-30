package bx0;

/* loaded from: classes5.dex */
public final class h implements bx0.d {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817 f117807a;

    /* renamed from: b, reason: collision with root package name */
    public final ex0.a0 f117808b;

    /* renamed from: c, reason: collision with root package name */
    public final bx0.i f117809c;

    /* renamed from: d, reason: collision with root package name */
    public final bx0.f f117810d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f117811e;

    /* renamed from: f, reason: collision with root package name */
    public double f117812f;

    /* renamed from: g, reason: collision with root package name */
    public int f117813g;

    /* renamed from: h, reason: collision with root package name */
    public final int f117814h;

    /* renamed from: i, reason: collision with root package name */
    public final int f117815i;

    /* renamed from: j, reason: collision with root package name */
    public final android.graphics.Rect f117816j;

    /* renamed from: k, reason: collision with root package name */
    public int f117817k;

    /* renamed from: l, reason: collision with root package name */
    public int f117818l;

    /* renamed from: m, reason: collision with root package name */
    public int f117819m;

    /* renamed from: n, reason: collision with root package name */
    public int f117820n;

    public h(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817 timelineView, ex0.a0 timelineVM, bx0.j uiStyle, bx0.i layoutType, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timelineView, "timelineView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timelineVM, "timelineVM");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiStyle, "uiStyle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutType, "layoutType");
        this.f117807a = timelineView;
        this.f117808b = timelineVM;
        this.f117809c = layoutType;
        bx0.f fVar = new bx0.f(timelineVM.f338625b, this, false, uiStyle, layoutType, z17);
        this.f117810d = fVar;
        this.f117811e = new java.util.concurrent.ConcurrentHashMap();
        this.f117813g = (int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 16);
        this.f117814h = (int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 36);
        this.f117815i = (int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 14);
        this.f117816j = new android.graphics.Rect();
        e3.d m47432x1e87e5ec = timelineView.m47432x1e87e5ec();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m47432x1e87e5ec, "<set-?>");
        fVar.f117799r = m47432x1e87e5ec;
        timelineVM.f338648y.mo7807xc74540ab(new bx0.g(this));
    }

    public static /* synthetic */ android.graphics.Rect c(bx0.h hVar, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        return hVar.b(c3971x241f78, z17);
    }

    public final void a() {
        bx0.f fVar = this.f117810d;
        fVar.f117798q = true;
        fVar.f117800s.m34344xfffbdf83();
        fVar.b();
    }

    public final android.graphics.Rect b(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        bx0.f fVar = this.f117810d;
        android.graphics.Rect d17 = fVar.d(segmentID);
        if (!z17) {
            return d17;
        }
        int max = java.lang.Math.max(fVar.f117799r.f328577a, d17.left);
        int i17 = d17.top;
        int min = java.lang.Math.min(e() - fVar.f117799r.f328579c, d17.right);
        int i18 = d17.bottom;
        android.graphics.Rect rect = this.f117816j;
        rect.set(max, i17, min, i18);
        return rect;
    }

    public final android.graphics.Rect d(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        android.graphics.Rect b17 = b(segmentID, z17);
        int ordinal = this.f117809c.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2) {
                int i17 = b17.left;
                int i18 = b17.top;
                int i19 = this.f117810d.f117801t;
                int i27 = this.f117815i;
                b17.set(i17, i18 + i19 + i27, b17.right, i18 + i19 + this.f117814h + i27);
            } else if (ordinal != 3 && ordinal != 4 && ordinal != 5) {
                throw new jz5.j();
            }
        }
        return b17;
    }

    public final int e() {
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a;
        ex0.v vVar = this.f117808b.f338630g;
        ex0.r rVar = (ex0.r) kz5.n0.k0(vVar.f338710e);
        if (rVar == null || (c4128x879fba0a = rVar.l().m34007xde00a612()) == null) {
            c4128x879fba0a = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a sub = vVar.c().sub(c4128x879fba0a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sub, "sub(...)");
        double m33988x124aa384 = sub.m33988x124aa384() * r0.s(this.f117807a.getTimelineLayoutType());
        bx0.f fVar = this.f117810d;
        double d17 = fVar.f117800s.m34341x453987c4().f130043b;
        e3.d dVar = fVar.f117799r;
        return (int) (((int) (d17 + dVar.f328577a + dVar.f328579c)) + m33988x124aa384);
    }

    public android.graphics.Rect f() {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817 abstractC11003x25486817 = this.f117807a;
        float x17 = abstractC11003x25486817.getX();
        float y17 = abstractC11003x25486817.getY();
        return new android.graphics.Rect((int) x17, (int) y17, (int) (x17 + abstractC11003x25486817.getWidth()), (int) (y17 + abstractC11003x25486817.getHeight()));
    }

    public final void g(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        this.f117820n = b(segmentID, false).left;
        this.f117819m = b(segmentID, false).width();
    }
}
