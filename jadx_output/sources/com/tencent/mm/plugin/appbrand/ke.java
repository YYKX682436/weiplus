package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class ke extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.me f84081d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke(com.tencent.mm.plugin.appbrand.me meVar) {
        super(0);
        this.f84081d = meVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.me meVar = this.f84081d;
        com.tencent.mm.plugin.appbrand.w0 d17 = com.tencent.mm.plugin.appbrand.x0.d(meVar.f85751a.f74803n);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.RuntimeLaunchSessionPlugin", "runtimeDidPause appId:" + meVar.f85751a.f74803n + ", pauseType:" + d17);
        meVar.f85753c = d17;
        return jz5.f0.f302826a;
    }
}
