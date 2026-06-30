package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class je extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.me f78484d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je(com.tencent.mm.plugin.appbrand.me meVar) {
        super(0);
        this.f78484d = meVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.me meVar = this.f78484d;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.RuntimeLaunchSessionPlugin", "runtimeDidResume appId:" + meVar.f85751a.f74803n + ", lastPauseType:" + meVar.f85753c);
        return jz5.f0.f302826a;
    }
}
