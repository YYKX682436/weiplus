package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class l2 implements com.tencent.mm.ipcinvoker.t0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f84217d;

    public l2(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f84217d = appBrandRuntime;
    }

    @Override // com.tencent.mm.ipcinvoker.t0
    public void h() {
        this.f84217d.C.set(true);
        this.f84217d.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntime", "onDisconnect: appId=[%s]", this.f84217d.f74803n);
    }
}
