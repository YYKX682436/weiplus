package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public class h7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f84637d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify$LaunchInfoIpcWrapper f84638e;

    public h7(com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify$LaunchInfoIpcWrapper iLaunchWxaAppInfoNotify$LaunchInfoIpcWrapper) {
        this.f84637d = o6Var;
        this.f84638e = iLaunchWxaAppInfoNotify$LaunchInfoIpcWrapper;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f84637d.X1.m(this.f84638e.f84432f.f47301d);
        if (android.text.TextUtils.isEmpty(this.f84638e.f84432f.f47303f) && android.text.TextUtils.isEmpty(this.f84638e.f84432f.f47309o)) {
            return;
        }
        zb1.b bVar = new zb1.b();
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f84637d;
        com.tencent.luggage.sdk.config.LaunchWxaAppInfoParcelized launchWxaAppInfoParcelized = this.f84638e.f84432f;
        bVar.u(o6Var, launchWxaAppInfoParcelized.f47303f, launchWxaAppInfoParcelized.f47309o);
    }
}
