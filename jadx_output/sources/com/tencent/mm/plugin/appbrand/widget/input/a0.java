package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.b0 f91277d;

    public a0(com.tencent.mm.plugin.appbrand.widget.input.b0 b0Var) {
        this.f91277d = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.widget.input.b0 b0Var = this.f91277d;
        java.lang.ref.WeakReference weakReference = b0Var.f91364a.f91610o;
        if (weakReference == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandInputInvokeHandler", "postDelayed scroll up found page is null");
            return;
        }
        com.tencent.mm.plugin.appbrand.widget.input.d1.b(weakReference).e(b0Var.f91364a.f91611p, false, false);
        com.tencent.mm.plugin.appbrand.widget.input.q0 q0Var = b0Var.f91364a;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        q0Var.f91615t = android.os.SystemClock.elapsedRealtime();
    }
}
