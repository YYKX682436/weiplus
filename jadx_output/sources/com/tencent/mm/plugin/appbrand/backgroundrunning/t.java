package com.tencent.mm.plugin.appbrand.backgroundrunning;

/* loaded from: classes7.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.mm.plugin.appbrand.ipc.l0 f76992a;

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.plugin.appbrand.backgroundrunning.t0 f76993b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.sdk.event.IListener f76994c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Set f76995d;

    static {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        f76994c = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.plugin.appbrand.jsapi.xwebplugin.live.AppBrandBackgroundRunningOperationEvent>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningMonitor$1
            {
                this.__eventId = 15624729;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.plugin.appbrand.jsapi.xwebplugin.live.AppBrandBackgroundRunningOperationEvent appBrandBackgroundRunningOperationEvent) {
                xf1.a aVar;
                com.tencent.mm.plugin.appbrand.o6 b17;
                com.tencent.mm.plugin.appbrand.service.c0 C0;
                boolean z17;
                com.tencent.mm.plugin.appbrand.jsapi.xwebplugin.live.AppBrandBackgroundRunningOperationEvent appBrandBackgroundRunningOperationEvent2 = appBrandBackgroundRunningOperationEvent;
                if (appBrandBackgroundRunningOperationEvent2 != null && (aVar = appBrandBackgroundRunningOperationEvent2.f83923g) != null && (b17 = com.tencent.mm.plugin.appbrand.l.b(aVar.f454222a)) != null && (C0 = b17.C0()) != null) {
                    xf1.a aVar2 = appBrandBackgroundRunningOperationEvent2.f83923g;
                    int i17 = aVar2.f454224c;
                    int i18 = aVar2.f454223b;
                    com.tencent.mm.plugin.appbrand.ipc.l0 l0Var = com.tencent.mm.plugin.appbrand.backgroundrunning.t.f76992a;
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandBackgroundRunningMonitor", "interceptBackgroundRunningOperationEvent4NotificationLogic, operation: %d, usage: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                    if ((i18 == 8 || i18 == 64) && i17 == 2) {
                        tf1.f fVar = (tf1.f) b17.k(tf1.f.class);
                        if (fVar == null) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandBackgroundRunningMonitor", "interceptBackgroundRunningOperationEvent4NotificationLogic, audioOfVideoBackgroundPlayManager is null");
                        } else if (fVar.f418864m) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandBackgroundRunningMonitor", "interceptBackgroundRunningOperationEvent4NotificationLogic, audioOfVideoBackgroundPlayManager isBackgroundAudioPlayPaused");
                            z17 = true;
                            xf1.a aVar3 = appBrandBackgroundRunningOperationEvent2.f83923g;
                            com.tencent.mm.plugin.appbrand.backgroundrunning.t.a(C0, aVar3.f454224c, aVar3.f454223b, z17);
                        }
                    }
                    z17 = false;
                    xf1.a aVar32 = appBrandBackgroundRunningOperationEvent2.f83923g;
                    com.tencent.mm.plugin.appbrand.backgroundrunning.t.a(C0, aVar32.f454224c, aVar32.f454223b, z17);
                }
                return false;
            }
        };
        f76995d = new java.util.HashSet();
    }

    public static void a(com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, int i18, boolean z17) {
        if (i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.v0.class) != null) {
            com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningOperationParcel appBrandBackgroundRunningOperationParcel = new com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningOperationParcel();
            appBrandBackgroundRunningOperationParcel.f76932d = e9Var.getAppId();
            appBrandBackgroundRunningOperationParcel.f76933e = e9Var.t3().f74805p.f77281g;
            appBrandBackgroundRunningOperationParcel.f76934f = i18;
            appBrandBackgroundRunningOperationParcel.f76935g = i17;
            appBrandBackgroundRunningOperationParcel.f76936h = e9Var.getContext().getClass().getName();
            appBrandBackgroundRunningOperationParcel.f76940o = bm5.f1.a();
            appBrandBackgroundRunningOperationParcel.f76943r = z17;
            appBrandBackgroundRunningOperationParcel.f76941p = ((com.tencent.luggage.sdk.config.AppBrandInitConfigLU) e9Var.t3().u0()).X;
            if (i18 == 8 || i18 == 64) {
                appBrandBackgroundRunningOperationParcel.f76942q = com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic.class.getName();
            }
            if ((e9Var instanceof com.tencent.mm.plugin.appbrand.service.c0) && e9Var.t3() != null && e9Var.t3().u0() != null) {
                com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) e9Var.t3().u0();
                appBrandBackgroundRunningOperationParcel.f76937i = appBrandInitConfigWC.f77279e;
                appBrandBackgroundRunningOperationParcel.f76938m = appBrandInitConfigWC.f77280f;
                appBrandBackgroundRunningOperationParcel.f76939n = appBrandInitConfigWC.f47278x;
            }
            ((com.tencent.mm.plugin.appbrand.backgroundrunning.k) ((com.tencent.mm.plugin.appbrand.backgroundrunning.v0) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.v0.class))).Di(appBrandBackgroundRunningOperationParcel);
        }
    }

    public static void b(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandBackgroundRunningMonitor", "sendRemoveLocationUsageOperation, runtime:%s", o6Var.f74803n);
        if (i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.v0.class) != null) {
            com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningOperationParcel appBrandBackgroundRunningOperationParcel = new com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningOperationParcel();
            appBrandBackgroundRunningOperationParcel.f76932d = o6Var.f74803n;
            appBrandBackgroundRunningOperationParcel.f76933e = o6Var.f74805p.f77281g;
            appBrandBackgroundRunningOperationParcel.f76934f = 2;
            appBrandBackgroundRunningOperationParcel.f76935g = 2;
            appBrandBackgroundRunningOperationParcel.f76941p = o6Var.u0().X;
            if (o6Var.r0() != null) {
                appBrandBackgroundRunningOperationParcel.f76936h = o6Var.r0().getClass().getName();
            }
            ((com.tencent.mm.plugin.appbrand.backgroundrunning.k) ((com.tencent.mm.plugin.appbrand.backgroundrunning.v0) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.v0.class))).Di(appBrandBackgroundRunningOperationParcel);
        }
        java.lang.String str = o6Var.f74803n;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mm.plugin.appbrand.ipc.m0.b(str, new com.tencent.mm.plugin.appbrand.jsapi.EventLocationBackgroundStateChanged(false));
        } else {
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningMonitor$NotifyLocationBackgroundChanged(str, false), com.tencent.mm.plugin.appbrand.backgroundrunning.r.class, null);
        }
    }
}
