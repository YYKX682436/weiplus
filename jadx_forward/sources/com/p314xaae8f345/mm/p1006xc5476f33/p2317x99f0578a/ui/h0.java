package com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui;

/* loaded from: classes5.dex */
public final class h0 extends c.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 f256967a;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 v0Var) {
        this.f256967a = v0Var;
    }

    @Override // c.c
    public void a(android.view.View bottomSheet, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomSheet, "bottomSheet");
        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 v0Var = this.f256967a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.x xVar = v0Var.S;
        p001xcca8366f.p003x91727fcf.p004xb069c1be.p005xd1075a44.C0029xbc4672a6 c0029xbc4672a6 = v0Var.R;
        if (c0029xbc4672a6 != null && c0029xbc4672a6.f90424o == 1) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.x.f257037d == xVar) {
                v0Var.T = 0.7f >= f17;
                android.view.Window window = v0Var.getWindow();
                if (window != null) {
                    window.setDimAmount((float) (0.5d - ((1 - f17) / 2.0d)));
                }
            }
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.x.f257038e == v0Var.S) {
                v0Var.V = 0.8f >= f17;
                if (0.9f < f17) {
                    if (v0Var.U) {
                        v0Var.U = false;
                        v0Var.M(true);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0.G(v0Var, true);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0.F(v0Var, false);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0.I(v0Var, false);
                        return;
                    }
                    return;
                }
                if (v0Var.U) {
                    return;
                }
                v0Var.U = true;
                v0Var.M(false);
                com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0.G(v0Var, false);
                com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0.F(v0Var, false);
                com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0.I(v0Var, false);
                android.widget.ImageView imageView = v0Var.f257022r;
                if (imageView != null) {
                    imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562768o1);
                }
            }
        }
    }

    @Override // c.c
    public void b(android.view.View bottomSheet, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomSheet, "bottomSheet");
        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 v0Var = this.f256967a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.x xVar = v0Var.S;
        boolean z17 = v0Var.T;
        boolean z18 = v0Var.U;
        boolean z19 = v0Var.V;
        if (i17 == 1) {
            v0Var.T = false;
            v0Var.U = false;
            v0Var.V = false;
        } else if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.x xVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.x.f257037d;
            if (xVar2 == v0Var.S && v0Var.T) {
                v0Var.K(6);
            }
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.x.f257038e == v0Var.S && v0Var.U) {
                if (v0Var.V) {
                    v0Var.S = xVar2;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0.F(v0Var, true);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0.G(v0Var, false);
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = v0Var.f257024t;
                    if (abstractC19636xc6b37291 != null) {
                        abstractC19636xc6b37291.setVisibility(8);
                    }
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = v0Var.f257017n;
                    if (c22621x7603e017 != null) {
                        c22621x7603e017.setCursorVisible(false);
                    }
                    v0Var.J(false);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.C18779x30970864 c18779x30970864 = v0Var.f257016m;
                    if (c18779x30970864 != null) {
                        c18779x30970864.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.g0(v0Var), 200L);
                    }
                } else {
                    v0Var.M(true);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0.G(v0Var, true);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0.F(v0Var, false);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0.I(v0Var, false);
                }
            }
        }
        if (1 == i17 || 3 == i17) {
            return;
        }
        if (v0Var.T) {
            v0Var.K(6);
            return;
        }
        android.view.Window window = v0Var.getWindow();
        if (window != null) {
            window.setDimAmount(0.5f);
        }
        p001xcca8366f.p003x91727fcf.p004xb069c1be.p005xd1075a44.C0029xbc4672a6 c0029xbc4672a6 = v0Var.R;
        if (c0029xbc4672a6 == null) {
            return;
        }
        c0029xbc4672a6.C(3);
    }
}
