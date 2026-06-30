package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class w5 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b f283068d;

    public w5(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f283068d = viewOnClickListenerC21748xb3d38e6b;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        db5.f0 f0Var;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f283068d;
        viewOnClickListenerC21748xb3d38e6b.f282170n.getViewTreeObserver().removeOnPreDrawListener(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryUI", "[handleAnimation] -> onPreDraw, isBackFromGrid:" + viewOnClickListenerC21748xb3d38e6b.C2);
        viewOnClickListenerC21748xb3d38e6b.Z1 = viewOnClickListenerC21748xb3d38e6b.f282170n.getWidth();
        viewOnClickListenerC21748xb3d38e6b.f282123a2 = viewOnClickListenerC21748xb3d38e6b.f282170n.getHeight();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var = viewOnClickListenerC21748xb3d38e6b.f282144g;
        if (k1Var == null) {
            return true;
        }
        if (k1Var.w().Y2()) {
            viewOnClickListenerC21748xb3d38e6b.f282123a2 = (int) ((viewOnClickListenerC21748xb3d38e6b.Z1 / viewOnClickListenerC21748xb3d38e6b.f282145g2) * viewOnClickListenerC21748xb3d38e6b.f282149h2);
        }
        if (viewOnClickListenerC21748xb3d38e6b.f282144g.w().J2() && (f0Var = (db5.f0) viewOnClickListenerC21748xb3d38e6b.K7(viewOnClickListenerC21748xb3d38e6b.f282144g, viewOnClickListenerC21748xb3d38e6b.f282170n)) != null) {
            int mo79182x97cbed21 = (int) ((viewOnClickListenerC21748xb3d38e6b.Z1 / f0Var.mo79182x97cbed21()) * f0Var.mo79180x47e2bd2c());
            viewOnClickListenerC21748xb3d38e6b.f282123a2 = mo79182x97cbed21;
            if (mo79182x97cbed21 > viewOnClickListenerC21748xb3d38e6b.f282170n.getHeight()) {
                viewOnClickListenerC21748xb3d38e6b.f282123a2 = viewOnClickListenerC21748xb3d38e6b.f282170n.getHeight();
            }
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.s4 s4Var = viewOnClickListenerC21748xb3d38e6b.f282167m2;
        int i17 = viewOnClickListenerC21748xb3d38e6b.Z1;
        int i18 = viewOnClickListenerC21748xb3d38e6b.f282123a2;
        s4Var.f292232f = i17;
        s4Var.f292233g = i18;
        if (!viewOnClickListenerC21748xb3d38e6b.C2) {
            s4Var.c(viewOnClickListenerC21748xb3d38e6b.f282170n, viewOnClickListenerC21748xb3d38e6b.W1, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.v5(this));
        }
        viewOnClickListenerC21748xb3d38e6b.f282170n.m79168x9bfee16e(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.x5(viewOnClickListenerC21748xb3d38e6b, viewOnClickListenerC21748xb3d38e6b.c8()));
        return true;
    }
}
