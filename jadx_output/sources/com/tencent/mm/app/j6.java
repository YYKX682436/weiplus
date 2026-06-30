package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class j6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.u6 f53464d;

    public j6(com.tencent.mm.app.u6 u6Var) {
        this.f53464d = u6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.app.p5.e("MicroMsg.StartupCostReporter", "[tomys] Switch out too long, skip report this time.", new java.lang.Object[0]);
        this.f53464d.f53840t = true;
    }
}
