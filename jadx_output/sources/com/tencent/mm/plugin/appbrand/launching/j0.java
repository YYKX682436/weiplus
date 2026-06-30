package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f84679d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.AppBrandPluginUpdateStatusChangeIPCMessage f84680e;

    public j0(com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.launching.AppBrandPluginUpdateStatusChangeIPCMessage appBrandPluginUpdateStatusChangeIPCMessage) {
        this.f84679d = o6Var;
        this.f84680e = appBrandPluginUpdateStatusChangeIPCMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.service.c0 C0 = this.f84679d.C0();
        com.tencent.mm.plugin.appbrand.launching.AppBrandPluginUpdateStatusChangeIPCMessage appBrandPluginUpdateStatusChangeIPCMessage = this.f84680e;
        ne1.j state = appBrandPluginUpdateStatusChangeIPCMessage.f84360g;
        java.lang.String pluginAppId = appBrandPluginUpdateStatusChangeIPCMessage.f84361h;
        int i17 = appBrandPluginUpdateStatusChangeIPCMessage.f84362i;
        java.lang.String str = appBrandPluginUpdateStatusChangeIPCMessage.f84363m;
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(pluginAppId, "pluginAppId");
        if (C0 == null) {
            return;
        }
        ne1.g gVar = new ne1.g();
        gVar.s("pluginAppid", pluginAppId);
        gVar.s("state", state.f336525d);
        gVar.s("appVersion", java.lang.Integer.valueOf(i17));
        gVar.s("customVersion", str);
        gVar.u(C0);
        gVar.m();
    }
}
