package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public class j7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f84698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify$PluginIpcWrapper f84699e;

    public j7(com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify$PluginIpcWrapper iLaunchWxaAppInfoNotify$PluginIpcWrapper) {
        this.f84698d = o6Var;
        this.f84699e = iLaunchWxaAppInfoNotify$PluginIpcWrapper;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f84698d.X1.n(this.f84699e.f84435f);
    }
}
