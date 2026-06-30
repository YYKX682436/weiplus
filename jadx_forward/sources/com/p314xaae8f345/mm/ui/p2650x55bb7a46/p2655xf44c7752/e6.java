package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class e6 implements com.p314xaae8f345.mm.ui.p2740x696c9db.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b f282424a;

    public e6(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b) {
        this.f282424a = viewOnClickListenerC21748xb3d38e6b;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.p3
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ImageGalleryUI", "runExitAnimation, onAnimationCancel");
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.p3
    public void b(float f17) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.p3
    /* renamed from: onAnimationEnd */
    public void mo79588xbb3aa236() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryUI", "runExitAnimation, onAnimationEnd");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f282424a;
        viewOnClickListenerC21748xb3d38e6b.f282169m4.mo50293x3498a0(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d6(this));
        viewOnClickListenerC21748xb3d38e6b.f282198v = false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.p3
    /* renamed from: onAnimationStart */
    public void mo79589xd7e2f2fd() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e;
        android.view.View e17;
        android.widget.LinearLayout linearLayout;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f282424a;
        try {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var = viewOnClickListenerC21748xb3d38e6b.f282144g;
            if (k1Var != null && (c21520x5bb48e5e = viewOnClickListenerC21748xb3d38e6b.f282170n) != null && (e17 = k1Var.e(c21520x5bb48e5e.m80830xfda78ef6())) != null && (e17.getTag() instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta) && (linearLayout = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta) e17.getTag()).f282981z) != null) {
                linearLayout.setVisibility(8);
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageGalleryUI", "runExitAnimation: hide image failed view error: " + e18.getMessage());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryUI", "runExitAnimation, onAnimationStart");
        viewOnClickListenerC21748xb3d38e6b.f282198v = true;
    }
}
