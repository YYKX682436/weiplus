package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class f9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewParent f89709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.c9 f89710e;

    public f9(com.tencent.mm.plugin.appbrand.ui.c9 c9Var, android.view.ViewParent viewParent) {
        this.f89710e = c9Var;
        this.f89709d = viewParent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUILoadingSplash", "animateHide, remove splash");
        com.tencent.mm.plugin.appbrand.ui.c9 c9Var = this.f89710e;
        c9Var.setVisibility(8);
        ((android.view.ViewGroup) this.f89709d).removeView(c9Var);
        com.tencent.mm.plugin.appbrand.ui.c9.K(c9Var);
    }
}
