package com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host;

/* loaded from: classes7.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f85737d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.OnMiniProgramRemovedNotify$OnMiniProgramRemovedIPCMessage f85738e;

    public e(com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.OnMiniProgramRemovedNotify$OnMiniProgramRemovedIPCMessage onMiniProgramRemovedNotify$OnMiniProgramRemovedIPCMessage) {
        this.f85737d = o6Var;
        this.f85738e = onMiniProgramRemovedNotify$OnMiniProgramRemovedIPCMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.service.c0 C0 = this.f85737d.C0();
        com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.OnMiniProgramRemovedNotify$OnMiniProgramRemovedIPCMessage onMiniProgramRemovedNotify$OnMiniProgramRemovedIPCMessage = this.f85738e;
        if (C0 != null) {
            com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.c cVar = new com.tencent.mm.plugin.appbrand.magicbrush_frame.appbrand_host.c();
            cVar.s("appId", onMiniProgramRemovedNotify$OnMiniProgramRemovedIPCMessage.f85732f);
            java.lang.String name = com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b.b(onMiniProgramRemovedNotify$OnMiniProgramRemovedIPCMessage.f85733g).name();
            java.util.Locale ENGLISH = java.util.Locale.ENGLISH;
            kotlin.jvm.internal.o.f(ENGLISH, "ENGLISH");
            java.lang.String lowerCase = name.toLowerCase(ENGLISH);
            kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
            cVar.s("envVersion", lowerCase);
            C0.p(cVar);
        }
        com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.k0.f84302a.a(onMiniProgramRemovedNotify$OnMiniProgramRemovedIPCMessage.f85732f, onMiniProgramRemovedNotify$OnMiniProgramRemovedIPCMessage.f85733g);
    }
}
