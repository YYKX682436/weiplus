package com.tencent.mm.plugin.appbrand.task;

/* loaded from: classes7.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f89170d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.task.u0 f89171e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.processes.x f89172f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.processes.s f89173g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f89174h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.task.k f89175i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f89176m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f89177n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.AppBrandStatObject f89178o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, com.tencent.mm.plugin.appbrand.task.u0 u0Var, com.tencent.luggage.sdk.processes.x xVar, com.tencent.luggage.sdk.processes.s sVar, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.plugin.appbrand.task.k kVar, android.content.Intent intent, androidx.appcompat.app.AppCompatActivity appCompatActivity, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject) {
        super(1);
        this.f89170d = atomicBoolean;
        this.f89171e = u0Var;
        this.f89172f = xVar;
        this.f89173g = sVar;
        this.f89174h = appBrandInitConfigWC;
        this.f89175i = kVar;
        this.f89176m = intent;
        this.f89177n = appCompatActivity;
        this.f89178o = appBrandStatObject;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String reason = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(reason, "reason");
        if (!this.f89170d.getAndSet(true)) {
            com.tencent.mm.plugin.appbrand.task.u0 u0Var = this.f89171e;
            u0Var.v(new com.tencent.mm.plugin.appbrand.task.q0(reason, this.f89172f, this.f89173g, u0Var, this.f89174h, this.f89175i, this.f89176m, this.f89177n, this.f89178o));
        }
        return jz5.f0.f302826a;
    }
}
