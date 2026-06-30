package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class b4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.j3 f76761d;

    public b4(com.tencent.mm.plugin.appbrand.j3 j3Var) {
        this.f76761d = j3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f76761d.f78452d) {
            return;
        }
        if (this.f76761d.f78455g == null) {
            try {
                com.tencent.mm.plugin.appbrand.report.quality.e.a(this.f76761d.f78450b).E = com.tencent.mm.plugin.appbrand.report.quality.o0.CreateOnRuntimeInit;
            } catch (java.lang.Exception unused) {
            }
        }
        this.f76761d.h("countDown == 0, notify process ready", new java.lang.Object[0]);
        this.f76761d.d();
    }
}
