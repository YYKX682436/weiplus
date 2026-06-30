package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class a2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.w1 f84482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f84483e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(com.tencent.mm.plugin.appbrand.launching.w1 w1Var, com.tencent.mm.plugin.appbrand.o6 o6Var) {
        super(0);
        this.f84482d = w1Var;
        this.f84483e = o6Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f84482d.a();
        com.tencent.mm.plugin.appbrand.launching.s1 s1Var = com.tencent.mm.plugin.appbrand.launching.d2.f84564a;
        com.tencent.mm.plugin.appbrand.o6 key = this.f84483e;
        com.tencent.mm.plugin.appbrand.launching.y1 y1Var = (com.tencent.mm.plugin.appbrand.launching.y1) s1Var;
        y1Var.getClass();
        kotlin.jvm.internal.o.g(key, "key");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeLaunchConditionForCommLib", "task(" + this.f84482d.hashCode() + ") interrupted, appId=" + this.f84483e.f74803n);
        return jz5.f0.f302826a;
    }
}
