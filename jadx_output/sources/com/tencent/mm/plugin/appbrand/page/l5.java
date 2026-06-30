package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class l5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.q5 f86855d;

    public l5(com.tencent.mm.plugin.appbrand.page.q5 q5Var) {
        this.f86855d = q5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.q5 q5Var = this.f86855d;
        if (q5Var.f87035d) {
            q5Var.f87032a.setAnimationEnabled(false);
        }
        q5Var.f87032a.a();
    }
}
