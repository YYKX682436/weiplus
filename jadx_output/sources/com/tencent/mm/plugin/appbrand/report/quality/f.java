package com.tencent.mm.plugin.appbrand.report.quality;

/* loaded from: classes7.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime f88181d;

    public f(com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime qualitySessionRuntime) {
        this.f88181d = qualitySessionRuntime;
    }

    @Override // java.lang.Runnable
    public void run() {
        yd.b0 b0Var = (yd.b0) cf.i.a("MemoryInspector.getMemoryMB", new yd.a0(yd.c0.INST));
        this.f88181d.f88152x = b0Var == null ? 0 : b0Var.f460918a;
    }
}
