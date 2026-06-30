package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class b8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f282349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b f282350e;

    public b8(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b, int i17) {
        this.f282350e = viewOnClickListenerC21748xb3d38e6b;
        this.f282349d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f282350e;
        if (viewOnClickListenerC21748xb3d38e6b.f282198v) {
            return;
        }
        int i17 = this.f282349d;
        if (i17 >= 100) {
            i17 = 99;
        }
        ((c35.m) i95.n0.c(c35.m.class)).getClass();
        viewOnClickListenerC21748xb3d38e6b.h9(viewOnClickListenerC21748xb3d38e6b.P, 8);
        android.view.Display display = viewOnClickListenerC21748xb3d38e6b.m78513xc2a54588().getDisplay();
        if (display != null && display.getRotation() != 0 && display.getRotation() != 2 && viewOnClickListenerC21748xb3d38e6b.Q.getVisibility() != 0 && viewOnClickListenerC21748xb3d38e6b.S.getVisibility() != 0) {
            ((c35.m) i95.n0.c(c35.m.class)).getClass();
        }
        ((c35.m) i95.n0.c(c35.m.class)).getClass();
        viewOnClickListenerC21748xb3d38e6b.h9(viewOnClickListenerC21748xb3d38e6b.S, 0);
        viewOnClickListenerC21748xb3d38e6b.R.setText(i17 + "%");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.q3.c(viewOnClickListenerC21748xb3d38e6b.f282138e3, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.C21754x69515198(), java.lang.Integer.valueOf(i17), java.lang.Boolean.FALSE);
    }
}
