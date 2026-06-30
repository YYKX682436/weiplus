package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class g6 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b f282490d;

    public g6(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b) {
        this.f282490d = viewOnClickListenerC21748xb3d38e6b;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        g4Var.clear();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f282490d;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 w17 = viewOnClickListenerC21748xb3d38e6b.f282144g.w();
        int l17 = c01.ia.l(w17);
        if (!(l17 == 3 || l17 == 4) && !c01.ia.C(w17) && !c01.ia.e(w17)) {
            g4Var.f(0, viewOnClickListenerC21748xb3d38e6b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i29));
            java.lang.String string = viewOnClickListenerC21748xb3d38e6b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i8c);
            if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.L(w17) || com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.G(w17)) {
                string = viewOnClickListenerC21748xb3d38e6b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i89);
            } else if ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.N(w17) || com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.M(w17)) && !w17.M2()) {
                string = viewOnClickListenerC21748xb3d38e6b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i8d);
            }
            if (!w17.M2()) {
                g4Var.f(1, string);
            }
        }
        g4Var.g(5, viewOnClickListenerC21748xb3d38e6b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b2b), com.p314xaae8f345.mm.R.raw.f80047x8e8a2dc3);
    }
}
