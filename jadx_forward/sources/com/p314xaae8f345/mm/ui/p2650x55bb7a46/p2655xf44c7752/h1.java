package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f282508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f282509e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta f282510f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f282511g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.j1 f282512h;

    public h1(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.j1 j1Var, int i17, boolean z17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f282512h = j1Var;
        this.f282508d = i17;
        this.f282509e = z17;
        this.f282510f = taVar;
        this.f282511g = f9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.j1 j1Var = this.f282512h;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var = j1Var.f282419d;
        if (k1Var != null && (viewOnClickListenerC21748xb3d38e6b = k1Var.f282625g) != null) {
            if (this.f282508d == 0) {
                viewOnClickListenerC21748xb3d38e6b.getClass();
                t23.p0.n().c(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d8(viewOnClickListenerC21748xb3d38e6b));
            } else {
                java.lang.String charSequence = this.f282509e ? viewOnClickListenerC21748xb3d38e6b.getText(com.p314xaae8f345.mm.R.C30867xcad56011.on9).toString() : viewOnClickListenerC21748xb3d38e6b.getText(com.p314xaae8f345.mm.R.C30867xcad56011.on_).toString();
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b2 = j1Var.f282419d.f282625g;
                viewOnClickListenerC21748xb3d38e6b2.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageGalleryUI", "originVideoLoadingFailed");
                t23.p0.n().c(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.f8(viewOnClickListenerC21748xb3d38e6b2, charSequence));
            }
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar = this.f282510f;
        j1Var.y(taVar);
        j1Var.A(this.f282511g, taVar.f282958c);
    }
}
