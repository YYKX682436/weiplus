package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public final class z8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja f283146d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f283147e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f283148f;

    public z8(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja jaVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17) {
        this.f283146d = jaVar;
        this.f283147e = f9Var;
        this.f283148f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja jaVar = this.f283146d;
        yd5.p pVar = jaVar.f282575e;
        if (pVar != null) {
            pVar.a();
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var = jaVar.f282419d;
        if (k1Var == null || (viewOnClickListenerC21748xb3d38e6b = k1Var.f282625g) == null) {
            return;
        }
        viewOnClickListenerC21748xb3d38e6b.Z = false;
        viewOnClickListenerC21748xb3d38e6b.Y.setVisibility(8);
        jaVar.f282419d.f282625g.o9(false);
        jaVar.A(this.f283147e, this.f283148f);
    }
}
