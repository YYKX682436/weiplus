package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class q5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.f6 f282830d;

    public q5(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.f6 f6Var) {
        this.f282830d = f6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.f6 f6Var = this.f282830d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = f6Var.f282452a.f282184q2;
        if (k0Var == null || !k0Var.i()) {
            return;
        }
        f6Var.f282452a.n9(false);
        if (!f6Var.f282452a.u8() || f6Var.f282452a.H3 == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryUI", "scanCode onSuccess, hide enhance bottomSheet");
        f6Var.f282452a.H3.o(zh1.y0.HIDE);
    }
}
