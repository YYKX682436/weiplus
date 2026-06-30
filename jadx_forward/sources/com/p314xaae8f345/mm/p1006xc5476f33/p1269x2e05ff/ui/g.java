package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui;

/* loaded from: classes14.dex */
public class g extends gp1.c0 {

    /* renamed from: a, reason: collision with root package name */
    public int f174824a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n f174825b;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar) {
        this.f174825b = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    @Override // gp1.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r13, int r14, int r15, int r16, boolean r17, boolean r18, int r19, int r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.g.a(int, int, int, int, boolean, boolean, int, int, boolean, boolean):void");
    }

    @Override // gp1.b0
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, int i17, int i18) {
        if (c12886x91aa2b6d == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallContainer", "onCollapseStateChanged current: %d, old: %d, new: %d", java.lang.Integer.valueOf(this.f174824a), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if ((this.f174824a == 0) && gp1.i.a(i18)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.h.b(c12886x91aa2b6d, 17);
        } else if (gp1.i.a(this.f174824a)) {
            if (i18 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.h.b(c12886x91aa2b6d, 18);
            }
        }
        if (!gp1.i.a(i18)) {
            if (!(i18 == 0)) {
                return;
            }
        }
        this.f174824a = i18;
    }

    @Override // gp1.b0
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallContainer", "onCollapsedViewClicked-normal");
        this.f174825b.n();
    }

    @Override // gp1.b0
    public void d(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = this.f174825b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallContainer", "onBallDragStart needProcessFloatViewFlags: %b", java.lang.Boolean.valueOf(nVar.f174857i));
        if (nVar.f174857i) {
            qp1.j.a(131072, nVar.f174851c);
            qp1.j.a(131072, nVar.f174853e);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7 = nVar.f174853e;
        if (c12917x19ac03e7 != null && !c12917x19ac03e7.w()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7.I(c12917x19ac03e7, false, c12917x19ac03e7.A, false, true, null, false, null, 116, null);
        }
        nVar.n();
    }

    @Override // gp1.c0, gp1.b0
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallContainer", "onBallLongPressed");
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = this.f174825b;
        op1.a aVar = nVar.f174861m;
        aVar.getClass();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        aVar.f428768a = java.lang.System.currentTimeMillis();
        nVar.l(false);
        nVar.f174851c.H(false, null);
        nVar.f174852d.m54206xad762f83(true);
        nVar.f174852d.h(null);
    }

    @Override // gp1.b0
    public void f() {
        gp1.v vVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = this.f174825b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallContainer", "onBallDragEnd needProcessFloatViewFlags: %b", java.lang.Boolean.valueOf(nVar.f174857i));
        if (!nVar.f174857i || (vVar = nVar.f174850b) == null || vVar.v(true, new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.f(this))) {
            return;
        }
        nVar.m(131072);
    }

    @Override // gp1.c0, gp1.b0
    public void g(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallContainer", "onBallLongPressTouchEvent");
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700 c12931xa4a39700 = this.f174825b.f174852d;
        if (c12931xa4a39700.f175128z) {
            int action = motionEvent.getAction();
            if (action != 1) {
                if (action == 2) {
                    c12931xa4a39700.e(motionEvent);
                    return;
                } else {
                    if (action != 3) {
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatMenuView", "onBallLongPressTouchEvent, CANCEL(%s, %s)", java.lang.Float.valueOf(motionEvent.getRawX()), java.lang.Float.valueOf(motionEvent.getRawY()));
                    return;
                }
            }
            c12931xa4a39700.e(motionEvent);
            android.view.View view = c12931xa4a39700.C;
            if (view == null || !(view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatMenuView", "no lastTouchedItemView, call back pressed");
                c12931xa4a39700.d();
            } else {
                c12931xa4a39700.g(c12931xa4a39700.C);
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) c12931xa4a39700.C.getTag();
                if (c12886x91aa2b6d.I) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatMenuView", "passive ballInfo, call back pressed");
                    c12931xa4a39700.d();
                } else {
                    c12886x91aa2b6d.M.f174623m = 2;
                    java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) c12931xa4a39700.f175119q).iterator();
                    while (it.hasNext()) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.d) ((mp1.f) it.next())).a(c12886x91aa2b6d);
                    }
                }
            }
            c12931xa4a39700.f175128z = false;
            c12931xa4a39700.C = null;
            c12931xa4a39700.D = -1;
        }
    }

    @Override // gp1.b0
    public void h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallContainer", "onBallClicked");
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = this.f174825b;
        op1.a aVar = nVar.f174861m;
        aVar.getClass();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        aVar.f428768a = java.lang.System.currentTimeMillis();
        if (nVar.f174860l) {
            nVar.f174851c.i0(false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7 = nVar.f174853e;
            if (c12917x19ac03e7 != null && c12917x19ac03e7.y() && nVar.f174853e.s() && nVar.f174853e.x()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12919x6cd8224f c12919x6cd8224f = nVar.f174855g;
                if (c12919x6cd8224f != null) {
                    c12919x6cd8224f.m54123x9a37dfc1(true);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e72 = nVar.f174853e;
                if (c12917x19ac03e72 != null) {
                    c12917x19ac03e72.h();
                }
            }
        } else {
            nVar.f174851c.H(false, null);
            nVar.l(false);
        }
        nVar.f174852d.m54206xad762f83(false);
        nVar.f174852d.h(null);
    }

    @Override // gp1.c0, gp1.b0
    /* renamed from: onOrientationChange */
    public void mo54080x15072581(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n.a(this.f174825b, i17);
    }
}
