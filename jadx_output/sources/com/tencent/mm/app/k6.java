package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class k6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.u6 f53485d;

    public k6(com.tencent.mm.app.u6 u6Var) {
        this.f53485d = u6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.app.p5.e("MicroMsg.StartupCostReporter", "[tomys] All activity was destroyed, next startup may be warm.", new java.lang.Object[0]);
        com.tencent.mm.app.u6 u6Var = this.f53485d;
        u6Var.f53840t = false;
        u6Var.f53839s = false;
    }
}
