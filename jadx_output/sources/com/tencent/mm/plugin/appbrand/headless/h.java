package com.tencent.mm.plugin.appbrand.headless;

/* loaded from: classes7.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f78301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.headless.p f78302e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i17, com.tencent.mm.plugin.appbrand.headless.p pVar) {
        super(3);
        this.f78301d = i17;
        this.f78302e = pVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC config = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) obj;
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject stat = (com.tencent.mm.plugin.appbrand.report.AppBrandStatObject) obj2;
        com.tencent.mm.plugin.appbrand.task.k kVar = (com.tencent.mm.plugin.appbrand.task.k) obj3;
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(stat, "stat");
        config.W1 = com.tencent.luggage.sdk.launching.p.HEADLESS;
        if (kVar != null) {
            kVar.f89082m = true;
        }
        com.tencent.mm.plugin.appbrand.headless.g gVar = new com.tencent.mm.plugin.appbrand.headless.g(this.f78302e, kVar);
        int i17 = this.f78301d;
        if (kVar == null || (str = kVar.i()) == null) {
            str = com.tencent.mm.sdk.platformtools.w9.f193058f;
        }
        kotlin.jvm.internal.o.d(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandHeadlessStartService", "bindRemoteService requestId:" + i17 + ", appId:" + config.f77278d + ", remoteProcessName:" + str);
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
        com.tencent.mm.plugin.appbrand.headless.d dVar = new com.tencent.mm.plugin.appbrand.headless.d(str, i17, atomicBoolean, gVar);
        com.tencent.mm.ipcinvoker.d0.a(str, dVar);
        com.tencent.mm.ipcinvoker.d0.d(str, new com.tencent.mm.plugin.appbrand.headless.BindRemoteServiceData(config, stat, i17), com.tencent.mm.plugin.appbrand.headless.b.f78283d.getClass(), new com.tencent.mm.plugin.appbrand.headless.c(atomicBoolean, gVar, str, dVar, i17));
        return jz5.f0.f302826a;
    }
}
