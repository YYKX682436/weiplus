package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class c2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f84534d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        super(0);
        this.f84534d = o6Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.launching.w1 w1Var = new com.tencent.mm.plugin.appbrand.launching.w1();
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f84534d;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeLaunchConditionForCommLib", "obtainTask create new instance(" + w1Var.hashCode() + ") with appId(" + o6Var.f74803n + ')');
        w1Var.b(new com.tencent.mm.plugin.appbrand.launching.z1(o6Var));
        com.tencent.mm.plugin.appbrand.launching.b2 b2Var = new com.tencent.mm.plugin.appbrand.launching.b2(w1Var, o6Var);
        java.lang.String str = o6Var.f74803n;
        kotlin.jvm.internal.o.f(str, "getAppId(...)");
        cf.m mVar = new cf.m(str);
        b2Var.invoke(mVar);
        o6Var.N.a(mVar);
        return w1Var;
    }
}
