package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class a6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f86398d;

    public a6(com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        this.f86398d = v5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f86398d;
        if (!v5Var.isRunning()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandPageView", "onInitReady but not running, return, appId[%s] url[%s]", v5Var.getAppId(), v5Var.X1());
            return;
        }
        fl1.g2 dialogContainer = v5Var.getRuntime().getDialogContainer();
        ((x.d) ((fl1.c0) dialogContainer).f263722q).add(v5Var.f87168y1);
        if (v5Var.Q1() != null) {
            v5Var.Q1().x();
        }
        v5Var.O2();
        v5Var.Z();
    }
}
