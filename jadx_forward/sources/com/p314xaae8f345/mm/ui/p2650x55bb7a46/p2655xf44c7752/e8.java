package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class e8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.i8 f282426d;

    public e8(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.i8 i8Var) {
        this.f282426d = i8Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int n17 = gm0.j1.d().n();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.i8 i8Var = this.f282426d;
        if (n17 != 6 && gm0.j1.d().n() != 4) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = i8Var.f282559d;
            if (viewOnClickListenerC21748xb3d38e6b.M2 == 1) {
                db5.e1.s(viewOnClickListenerC21748xb3d38e6b, viewOnClickListenerC21748xb3d38e6b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572033wu), "");
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b2 = i8Var.f282559d;
                viewOnClickListenerC21748xb3d38e6b2.y7(false);
                viewOnClickListenerC21748xb3d38e6b2.f282124a3.a(2);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b3 = i8Var.f282559d;
        if (viewOnClickListenerC21748xb3d38e6b3.f282144g == null) {
            return;
        }
        int I7 = viewOnClickListenerC21748xb3d38e6b3.I7();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b4 = i8Var.f282559d;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 y17 = viewOnClickListenerC21748xb3d38e6b4.f282144g.y(I7);
        if (y17 == null || !y17.M2()) {
            return;
        }
        if (viewOnClickListenerC21748xb3d38e6b4.f282144g.v() == null) {
            viewOnClickListenerC21748xb3d38e6b4.f282144g.v().d();
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta v17 = viewOnClickListenerC21748xb3d38e6b4.f282144g.v();
        v17.d();
        if (v17.f282972q.getVisibility() != 0) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta v18 = viewOnClickListenerC21748xb3d38e6b4.f282144g.v();
            v18.d();
            if (v18.f282980y.getVisibility() != 0) {
                return;
            }
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var = viewOnClickListenerC21748xb3d38e6b4.f282144g;
        k1Var.f282631p.A(k1Var.y(I7), I7);
    }
}
