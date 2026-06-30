package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class o5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.x1 f86952d;

    public o5(com.tencent.mm.plugin.appbrand.page.p5 p5Var, com.tencent.mm.plugin.appbrand.page.x1 x1Var) {
        this.f86952d = x1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.x1 x1Var = this.f86952d;
        if (x1Var != null) {
            x1Var.setVisibility(8);
            x1Var.i();
        }
    }
}
