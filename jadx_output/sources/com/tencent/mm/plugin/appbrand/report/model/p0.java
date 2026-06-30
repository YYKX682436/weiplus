package com.tencent.mm.plugin.appbrand.report.model;

/* loaded from: classes7.dex */
public abstract class p0 implements com.tencent.mm.plugin.appbrand.report.model.o0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f88065a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f88066b = false;

    public p0(com.tencent.mm.plugin.appbrand.report.model.m0 m0Var) {
    }

    public final void a() {
        if (this.f88066b || this.f88065a) {
            return;
        }
        com.tencent.mm.plugin.appbrand.report.model.kv_14609 kv_14609Var = ((com.tencent.mm.plugin.appbrand.report.model.m0) this).f88062c;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Report.kv_14609", "report %s", kv_14609Var.toString());
        jx3.f.INSTANCE.d(14609, kv_14609Var.f88029g, java.lang.Integer.valueOf(kv_14609Var.f88030h), com.tencent.mm.plugin.appbrand.report.q2.b(com.tencent.mm.sdk.platformtools.x2.f193071a), java.lang.Integer.valueOf(kv_14609Var.f88032m), java.lang.Integer.valueOf(kv_14609Var.f88033n), java.lang.Long.valueOf(kv_14609Var.f88034o), java.lang.Integer.valueOf(kv_14609Var.f88035p ? 1 : 0), java.lang.Integer.valueOf(kv_14609Var.f88036q ? 1 : 0), java.lang.Integer.valueOf(kv_14609Var.f88037r ? 1 : 0), java.lang.Integer.valueOf(kv_14609Var.f88038s), java.lang.Integer.valueOf(kv_14609Var.f88039t), java.lang.Integer.valueOf(kv_14609Var.f88040u), kv_14609Var.f88031i, java.lang.Long.valueOf(kv_14609Var.f88041v), java.lang.Long.valueOf(kv_14609Var.f88042w), kv_14609Var.A, java.lang.Long.valueOf(kv_14609Var.f88043x), java.lang.Long.valueOf(kv_14609Var.f88044y), java.lang.Integer.valueOf(kv_14609Var.f88045z), java.lang.Integer.valueOf(kv_14609Var.B), java.lang.Integer.valueOf(kv_14609Var.C), java.lang.Integer.valueOf(kv_14609Var.D), java.lang.Long.valueOf(kv_14609Var.E), java.lang.Integer.valueOf(kv_14609Var.F), java.lang.Integer.valueOf(kv_14609Var.G), java.lang.Integer.valueOf(kv_14609Var.H), java.lang.Integer.valueOf(kv_14609Var.I), java.lang.Long.valueOf(kv_14609Var.f88025J), java.lang.Integer.valueOf(kv_14609Var.K), java.lang.Integer.valueOf(kv_14609Var.L ? 1 : 0));
        this.f88065a = true;
    }
}
