package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class o8 implements zh1.c1 {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f282776b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Runnable f282777c = null;

    public o8(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b) {
        this.f282776b = new java.lang.ref.WeakReference(viewOnClickListenerC21748xb3d38e6b);
    }

    @Override // zh1.c1
    public void a(java.lang.Runnable runnable) {
        int i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryUI", "executeOrDefer");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b) this.f282776b.get();
        if (viewOnClickListenerC21748xb3d38e6b == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryUI", "executeOrDefer, ui is null");
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 w17 = viewOnClickListenerC21748xb3d38e6b.f282144g.w();
        if (w17 == null || !w17.m78014x7b98c171()) {
            if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
                runnable.run();
                return;
            } else {
                ((ku5.t0) ku5.t0.f394148d).B(runnable);
                return;
            }
        }
        t21.v2 h17 = t21.d3.h(w17.z0());
        if (h17 == null || (i17 = h17.f496544i) == 199 || i17 == 199) {
            if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
                runnable.run();
                return;
            } else {
                ((ku5.t0) ku5.t0.f394148d).B(runnable);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryUI", "executeOrDefer, video start download and waiting");
        viewOnClickListenerC21748xb3d38e6b.P2 = t21.d3.d(w17.m124847x74d37ac6(), 4);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var = viewOnClickListenerC21748xb3d38e6b.f282144g;
        int m80830xfda78ef6 = viewOnClickListenerC21748xb3d38e6b.f282170n.m80830xfda78ef6();
        k1Var.f282631p.B(k1Var.y(m80830xfda78ef6), m80830xfda78ef6, true);
        this.f282777c = runnable;
    }
}
