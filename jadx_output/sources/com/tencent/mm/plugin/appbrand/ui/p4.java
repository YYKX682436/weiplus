package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class p4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.q4 f89917d;

    public p4(com.tencent.mm.plugin.appbrand.ui.q4 q4Var) {
        this.f89917d = q4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandGameUILoadingSplash", "animateHide, remove splash");
        com.tencent.mm.plugin.appbrand.ui.q4 q4Var = this.f89917d;
        q4Var.f89950e.f89978e.setVisibility(8);
        ((android.view.ViewGroup) q4Var.f89949d).removeView(q4Var.f89950e.f89978e);
        yz5.a aVar = q4Var.f89950e.f89977d;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
