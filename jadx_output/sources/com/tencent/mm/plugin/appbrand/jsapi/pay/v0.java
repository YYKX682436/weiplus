package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes7.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82682d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.pay.x0 f82683e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f82684f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(java.lang.String str, com.tencent.mm.plugin.appbrand.jsapi.pay.x0 x0Var, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var) {
        super(1);
        this.f82682d = str;
        this.f82683e = x0Var;
        this.f82684f = d0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        cf.m lifecycle = (cf.m) obj;
        kotlin.jvm.internal.o.g(lifecycle, "$this$lifecycle");
        java.lang.String str = this.f82682d;
        com.tencent.mm.plugin.appbrand.jsapi.pay.x0 x0Var = this.f82683e;
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = this.f82684f;
        com.tencent.mm.plugin.appbrand.jsapi.pay.s0 s0Var = new com.tencent.mm.plugin.appbrand.jsapi.pay.s0(str, x0Var, d0Var);
        lifecycle.f40830g = s0Var;
        lifecycle.b(new com.tencent.mm.plugin.appbrand.jsapi.pay.t0(str, x0Var, d0Var));
        lifecycle.a(new com.tencent.mm.plugin.appbrand.jsapi.pay.u0(d0Var, str, x0Var));
        return jz5.f0.f302826a;
    }
}
