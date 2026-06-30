package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class c6 implements com.p314xaae8f345.mm.ui.p2740x696c9db.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b f282366a;

    public c6(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b) {
        this.f282366a = viewOnClickListenerC21748xb3d38e6b;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.n4
    public void a() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.n4
    /* renamed from: onAnimationEnd */
    public void mo54453xbb3aa236() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryUI", "runExitAnimation onAnimationEnd");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f282366a;
        viewOnClickListenerC21748xb3d38e6b.f282169m4.mo50293x3498a0(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.b6(this));
        viewOnClickListenerC21748xb3d38e6b.f282198v = false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.n4
    /* renamed from: onAnimationStart */
    public void mo54454xd7e2f2fd() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e;
        android.view.View e17;
        android.widget.LinearLayout linearLayout;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f282366a;
        viewOnClickListenerC21748xb3d38e6b.f282198v = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryUI", "onAnimationStart!!");
        try {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var = viewOnClickListenerC21748xb3d38e6b.f282144g;
            if (k1Var != null && (c21520x5bb48e5e = viewOnClickListenerC21748xb3d38e6b.f282170n) != null && (e17 = k1Var.e(c21520x5bb48e5e.m80830xfda78ef6())) != null && (e17.getTag() instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta) && (linearLayout = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta) e17.getTag()).f282981z) != null) {
                linearLayout.setVisibility(8);
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageGalleryUI", "hide image failed view error: " + e18.getMessage());
        }
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.a6(this), 20L);
    }
}
