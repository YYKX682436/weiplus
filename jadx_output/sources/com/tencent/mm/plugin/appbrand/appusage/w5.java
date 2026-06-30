package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes5.dex */
public final class w5 implements hh4.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hh4.m f76620a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appusage.x5 f76621b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.type.IPCString f76622c;

    public w5(hh4.m mVar, com.tencent.mm.plugin.appbrand.appusage.x5 x5Var, com.tencent.mm.ipcinvoker.type.IPCString iPCString) {
        this.f76620a = mVar;
        this.f76621b = x5Var;
        this.f76622c = iPCString;
    }

    public void a(java.lang.String openSessionId) {
        kotlin.jvm.internal.o.g(openSessionId, "openSessionId");
        gh4.s0 s0Var = (gh4.s0) this.f76620a;
        s0Var.getClass();
        ((java.util.concurrent.CopyOnWriteArrayList) s0Var.f271955e).remove(this);
        java.lang.String str = this.f76621b.f76650a;
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = this.f76622c;
        com.tencent.mars.xlog.Log.i(str, "[AppBrandGuideStruct]appBrandSessionId:%s, openSessionId:%s", iPCString, openSessionId);
        com.tencent.mm.autogen.mmdata.rpt.AppBrandGuideStruct appBrandGuideStruct = new com.tencent.mm.autogen.mmdata.rpt.AppBrandGuideStruct();
        appBrandGuideStruct.f55149d = appBrandGuideStruct.b("AppBrandSessionId", fp.s0.b(iPCString.f68406d, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding), true);
        appBrandGuideStruct.f55150e = appBrandGuideStruct.b("TaskBarOpenSessionId", openSessionId, true);
        appBrandGuideStruct.f55151f = java.lang.System.currentTimeMillis();
        appBrandGuideStruct.k();
    }
}
