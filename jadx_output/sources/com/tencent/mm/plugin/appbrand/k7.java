package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class k7 implements com.tencent.mm.plugin.appbrand.ipc.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f84067a;

    public k7(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        this.f84067a = o6Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.l0
    public void a(java.lang.Object obj) {
        if (obj instanceof com.tencent.mm.plugin.appbrand.service.EventWxAssistant) {
            com.tencent.mm.plugin.appbrand.service.u5 u5Var = (com.tencent.mm.plugin.appbrand.service.u5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.u5.class);
            java.lang.String appId = this.f84067a.f74803n;
            com.tencent.mm.plugin.appbrand.service.EventWxAssistant event = (com.tencent.mm.plugin.appbrand.service.EventWxAssistant) obj;
            com.tencent.mm.plugin.appbrand.wxassistant.u0 u0Var = (com.tencent.mm.plugin.appbrand.wxassistant.u0) u5Var;
            u0Var.getClass();
            kotlin.jvm.internal.o.g(appId, "appId");
            kotlin.jvm.internal.o.g(event, "event");
            u0Var.f92318e.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWxAssistantService", "handleByAppBrandProcess: appId:" + appId + " event:" + event);
            int ordinal = event.f88615e.ordinal();
            if (ordinal == 0) {
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.appbrand.wxassistant.e1(appId));
                return;
            }
            if (ordinal != 1) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandWxAssistantService", "handleByAppBrandProcess event:" + event + " not support");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWxAssistantService", "restoreRuntime: appId:" + appId + " event:" + event.f88616f);
            com.tencent.mm.plugin.appbrand.o6 b17 = com.tencent.mm.plugin.appbrand.l.b(appId);
            com.tencent.mm.plugin.appbrand.hc hcVar = b17 != null ? b17.f74796e : null;
            android.os.Parcelable parcelable = event.f88616f;
            kotlin.jvm.internal.o.e(parcelable, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.service.RestoreRuntimeParams");
            com.tencent.mm.plugin.appbrand.service.RestoreRuntimeParams restoreRuntimeParams = (com.tencent.mm.plugin.appbrand.service.RestoreRuntimeParams) parcelable;
            if (hcVar instanceof com.tencent.mm.plugin.appbrand.wxassistant.p2) {
                final java.util.List list = restoreRuntimeParams.f88617d;
                final com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC appBrandRuntimeContainerWC = (com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC) ((com.tencent.mm.plugin.appbrand.wxassistant.p2) hcVar);
                appBrandRuntimeContainerWC.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeContainerWC", "restoreRuntime appIdList:%s", list);
                appBrandRuntimeContainerWC.Y(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC$$e
                    @Override // java.lang.Runnable
                    public final void run() {
                        android.util.SparseIntArray sparseIntArray = com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC.C;
                        com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC appBrandRuntimeContainerWC2 = com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC.this;
                        appBrandRuntimeContainerWC2.getClass();
                        for (java.lang.String str : list) {
                            com.tencent.mm.plugin.appbrand.o6 b18 = com.tencent.mm.plugin.appbrand.l.b(str);
                            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = b18 != null ? b18.u0() : null;
                            if (u07 == null) {
                                u07 = new com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC();
                                u07.f77278d = str;
                                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandRuntimeContainerWC", "restoreRuntime use mock init config");
                            }
                            com.tencent.mm.plugin.appbrand.o6 a17 = com.tencent.mm.plugin.appbrand.v1.a(u07, appBrandRuntimeContainerWC2);
                            if (a17 != null) {
                                java.util.LinkedList linkedList = appBrandRuntimeContainerWC2.f74839r;
                                if (!linkedList.contains(a17)) {
                                    linkedList.addLast(a17);
                                    com.tencent.mm.plugin.appbrand.widget.q qVar = a17.f74810s;
                                    if (qVar.getParent() != null) {
                                        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                                        ((android.view.ViewGroup) qVar.getParent()).removeView(qVar);
                                    }
                                    appBrandRuntimeContainerWC2.f74838q.addView(qVar, 0);
                                }
                            } else {
                                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandRuntimeContainerWC", "restoreRuntime appId:%s: stashedRt is null", str);
                            }
                        }
                    }
                });
            }
        }
    }
}
