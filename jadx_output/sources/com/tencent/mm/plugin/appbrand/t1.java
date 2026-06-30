package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f88960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l81.v0 f88961e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(int i17, l81.v0 v0Var) {
        super(3);
        this.f88960d = i17;
        this.f88961e = v0Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC config = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) obj;
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject stat = (com.tencent.mm.plugin.appbrand.report.AppBrandStatObject) obj2;
        com.tencent.mm.plugin.appbrand.task.k kVar = (com.tencent.mm.plugin.appbrand.task.k) obj3;
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(stat, "stat");
        int i17 = this.f88960d;
        if (kVar == null || (str = kVar.i()) == null) {
            str = com.tencent.mm.sdk.platformtools.w9.f193058f;
        }
        kotlin.jvm.internal.o.d(str);
        l81.v0 v0Var = this.f88961e;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPreRenderColdStartService", "bindRemoteService id:" + i17 + ", appId:" + config.f77278d + ", remoteProcessName:" + str);
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
        com.tencent.mm.plugin.appbrand.r1 r1Var = new com.tencent.mm.plugin.appbrand.r1(str, i17, atomicBoolean, v0Var);
        com.tencent.mm.ipcinvoker.d0.a(str, r1Var);
        com.tencent.mm.ipcinvoker.d0.d(str, new com.tencent.mm.plugin.appbrand.BindRemoteServiceData(config, stat, i17), com.tencent.mm.plugin.appbrand.p1.f86308d.getClass(), new com.tencent.mm.plugin.appbrand.q1(i17, v0Var, atomicBoolean, str, r1Var));
        return jz5.f0.f302826a;
    }
}
