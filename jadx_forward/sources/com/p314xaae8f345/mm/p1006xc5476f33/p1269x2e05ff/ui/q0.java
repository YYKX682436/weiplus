package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui;

/* loaded from: classes14.dex */
public class q0 implements gp1.y {

    /* renamed from: h, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0 f174878h;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n f174879d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f174880e = false;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f174881f = false;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f174882g = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).wi();

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0 e() {
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.class) {
            if (f174878h == null) {
                synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.class) {
                    f174878h = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0();
                }
            }
        }
        return f174878h;
    }

    @Override // gp1.y
    public void X(java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.g0 g0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.g0(this, list, c12886x91aa2b6d);
        java.lang.Boolean bool = qp1.w.f447288a;
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            g0Var.run();
        } else {
            ((ku5.t0) ku5.t0.f394148d).B(g0Var);
        }
    }

    public final void a() {
        if (this.f174879d == null) {
            this.f174879d = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallUIManager", "attachFloatBallContainer new floatBallContainer");
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = this.f174879d;
            nVar.f174852d.setVisibility(8);
            nVar.f174855g.setVisibility(8);
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12919x6cd8224f c12919x6cd8224f = nVar.f174855g;
            android.view.WindowManager windowManager = nVar.f174849a;
            qp1.j.b(windowManager, c12919x6cd8224f);
            nVar.f174851c.setVisibility(8);
            qp1.j.c(windowManager, nVar.f174851c, qp1.w.k(), qp1.w.l(), null, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12925xf55305ed c12925xf55305ed = nVar.f174851c.L;
            if (c12925xf55305ed != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallCollapseView", "attachFloatBallCollapseViewToWindow");
                qp1.j.c(c12925xf55305ed.f175014d, c12925xf55305ed, 0, 0, null, null);
            }
            qp1.j.b(windowManager, nVar.f174852d);
            nVar.b();
            java.util.Set<gp1.b0> y07 = nVar.f174850b.y0();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallContainer", "attachToWindow, add floatBallViewListeners %s", java.lang.Integer.valueOf(y07.size()));
            for (gp1.b0 listener : y07) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0 = nVar.f174851c;
                if (c12929x567537a0 != null) {
                    ((java.util.concurrent.CopyOnWriteArraySet) c12929x567537a0.f175079p).add(listener);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7 = nVar.f174853e;
                if (c12917x19ac03e7 != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
                    ((java.util.concurrent.CopyOnWriteArraySet) c12917x19ac03e7.f174960o).add(listener);
                }
            }
        }
        h();
    }

    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = this.f174879d;
        if (nVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FloatBallUIManager", "clearVOIPView, container is null");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0 = nVar.f174851c;
        if (c12929x567537a0 != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("MicroMsg.FloatBallView", "clearCustomView", new java.lang.Object[0]);
            android.widget.FrameLayout frameLayout = c12929x567537a0.f175093w;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
                c12929x567537a0.f175083q = null;
                c12929x567537a0.O1 = null;
                c12929x567537a0.q0(false);
                if (!c12929x567537a0.c0(c12929x567537a0.f175057d)) {
                    c12929x567537a0.setVisibility(8);
                }
                c12929x567537a0.V = true;
            }
        }
    }

    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallUIManager", "detachFloatBallContainer");
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.p0(this));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = this.f174879d;
        if (nVar != null) {
            nVar.f();
            this.f174879d = null;
        }
        h();
    }

    public final void d(boolean z17, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700 c12931xa4a39700;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = this.f174879d;
        boolean z18 = false;
        if (nVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12931xa4a39700 c12931xa4a397002 = nVar.f174852d;
            if (c12931xa4a397002 != null && c12931xa4a397002.getVisibility() == 0) {
                z18 = true;
            }
        }
        if (!z18) {
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationEnd(null);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar2 = this.f174879d;
        if (nVar2 == null || (c12931xa4a39700 = nVar2.f174852d) == null) {
            return;
        }
        if (z17) {
            c12931xa4a39700.c(animatorListenerAdapter);
        } else if (c12931xa4a39700.getVisibility() == 8) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatMenuView", "float menu already hide");
        } else {
            c12931xa4a39700.setVisibility(8);
        }
    }

    public boolean f() {
        return this.f174879d != null;
    }

    public final void g(java.util.List list, java.util.List list2, java.util.List list3, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        gp1.v vVar;
        gp1.v vVar2;
        if (f()) {
            if (this.f174882g) {
                this.f174879d.k(list3, c12886x91aa2b6d);
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = this.f174879d;
                nVar.getClass();
                java.util.List e17 = qp1.w.e(list2);
                if (qp1.w.a(list2)) {
                    list2.size();
                }
                ((java.util.Vector) e17).size();
                boolean z17 = false;
                if (qp1.w.a(e17)) {
                    boolean z18 = com.p314xaae8f345.mm.app.w.INSTANCE.f135422n;
                    boolean z19 = nVar.c() || ((vVar2 = nVar.f174850b) != null && vVar2.z0());
                    nVar.f174859k = true;
                    if (!z18 || z19 || (vVar = nVar.f174850b) == null || vVar.f0()) {
                        java.lang.Object[] objArr = new java.lang.Object[3];
                        objArr[0] = java.lang.Boolean.valueOf(z18);
                        objArr[1] = java.lang.Boolean.valueOf(z19);
                        gp1.v vVar3 = nVar.f174850b;
                        if (vVar3 != null && vVar3.f0()) {
                            z17 = true;
                        }
                        objArr[2] = java.lang.Boolean.valueOf(z17);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallContainer", "onFloatBallInfoChanged-content, foreground:%s, canNotShowFloatBall:%s, forceHideAllFloatBall: %b", objArr);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallContainer", "onFloatBallInfoChanged-content, show FloatBallView %b", java.lang.Boolean.FALSE);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7 = nVar.f174853e;
                        if (c12917x19ac03e7 != null) {
                            c12917x19ac03e7.J(false, true, null);
                        }
                    }
                } else {
                    nVar.f174859k = false;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e72 = nVar.f174853e;
                    if (c12917x19ac03e72 != null && c12917x19ac03e72.getVisibility() == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallContainer", "onFloatBallInfoChanged-content, hide FloatBallView");
                        nVar.f174853e.t(false, null);
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e73 = nVar.f174853e;
                if (c12917x19ac03e73 != null) {
                    c12917x19ac03e73.X(list2, c12886x91aa2b6d);
                }
                nVar.o(list2);
            } else {
                this.f174879d.k(list, c12886x91aa2b6d);
            }
            h();
        }
    }

    public final void h() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = this.f174879d;
        if (nVar != null) {
            boolean z17 = this.f174880e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0 = nVar.f174851c;
            if (c12929x567537a0 != null) {
                c12929x567537a0.m54202x2e48800e(z17);
            }
        }
        this.f174880e = false;
    }
}
