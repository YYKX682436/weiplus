package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class u1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f85209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.w1 f85210e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f85211f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(yz5.l lVar, com.tencent.mm.plugin.appbrand.launching.w1 w1Var, long j17) {
        super(0);
        this.f85209d = lVar;
        this.f85210e = w1Var;
        this.f85211f = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.appcache.e8.d();
        this.f85209d.invoke(com.tencent.mm.plugin.appbrand.appcache.e8.b());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("task(");
        sb6.append(this.f85210e.hashCode());
        sb6.append(") WxaCommLibRuntimeReader.loadOrFallback cost[");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(android.os.SystemClock.elapsedRealtime() - this.f85211f);
        sb6.append(']');
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeLaunchConditionForCommLib", sb6.toString());
        return jz5.f0.f302826a;
    }
}
