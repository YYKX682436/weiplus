package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class m5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.q5 f86876d;

    public m5(com.tencent.mm.plugin.appbrand.page.q5 q5Var) {
        this.f86876d = q5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.x1 x1Var;
        com.tencent.mm.plugin.appbrand.page.q5 q5Var = this.f86876d;
        if (q5Var.f87035d && (x1Var = q5Var.f87036e.N) != null) {
            x1Var.cancel();
            q5Var.f87036e.N = null;
        }
        q5Var.f87032a.cancel();
    }
}
