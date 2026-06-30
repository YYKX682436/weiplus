package com.tencent.mm.plugin.appbrand.backgroundrunning;

/* loaded from: classes7.dex */
public class p implements com.tencent.mm.plugin.appbrand.backgroundrunning.t0 {
    @Override // com.tencent.mm.plugin.appbrand.backgroundrunning.t0
    public void a(com.tencent.mm.plugin.appbrand.backgroundrunning.MMBackgroundRunningOperationParcel mMBackgroundRunningOperationParcel) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandBackgroundRunningMonitor", "onBackgroundRunningOperationReceived, operation:%s", mMBackgroundRunningOperationParcel);
        com.tencent.mm.plugin.appbrand.o6 b17 = com.tencent.mm.plugin.appbrand.l.b(mMBackgroundRunningOperationParcel.f76945d);
        if (b17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandBackgroundRunningMonitor", "onBackgroundRunningOperationReceived, runtime is null");
            return;
        }
        if (mMBackgroundRunningOperationParcel.f76947f == 2) {
            if (com.tencent.mm.plugin.appbrand.backgroundrunning.w.b(mMBackgroundRunningOperationParcel.f76946e, 2)) {
                com.tencent.mm.plugin.appbrand.jsapi.lbs.j1 j1Var = (com.tencent.mm.plugin.appbrand.jsapi.lbs.j1) b17.k(com.tencent.mm.plugin.appbrand.jsapi.lbs.j1.class);
                if (j1Var instanceof com.tencent.mm.plugin.appbrand.jsapi.lbs.k1) {
                    com.tencent.mm.plugin.appbrand.jsapi.lbs.k1 k1Var = (com.tencent.mm.plugin.appbrand.jsapi.lbs.k1) j1Var;
                    if (k1Var.f81441q) {
                        k1Var.f81439o = true;
                        k1Var.l(2);
                        k1Var.q(b17);
                        com.tencent.mm.plugin.appbrand.backgroundrunning.t.b(b17);
                    } else {
                        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandBackgroundRunningMonitor", "disableBackgroundLocationIfNeed, location state manager not in background mode");
                    }
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandBackgroundRunningMonitor", "disableBackgroundLocationIfNeed, invalid location state manager");
                }
            }
            if (com.tencent.mm.plugin.appbrand.backgroundrunning.w.b(mMBackgroundRunningOperationParcel.f76946e, 4)) {
                xf1.i iVar = (xf1.i) b17.k(xf1.i.class);
                if (iVar == null || !iVar.a()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandBackgroundRunningMonitor", "disableBackgroundVOIPIfNeed, voip state manager not running");
                } else {
                    synchronized (iVar) {
                        if (iVar.f454239f != null) {
                            com.tencent.mars.xlog.Log.i(iVar.f454237d, "stopVOIP, LivePusher:%s", iVar.f454239f.g());
                            iVar.f454239f.m();
                        }
                        for (tf.w wVar : iVar.f454240g) {
                            if (wVar != null) {
                                com.tencent.mars.xlog.Log.i(iVar.f454237d, "stopVOIP, LivePlayer:%s", wVar.g());
                                wVar.m();
                            }
                        }
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandBackgroundRunningMonitor", "sendRemoveVOIPUsageOperation, runtime:%s", b17.f74803n);
                    if (i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.v0.class) != null) {
                        com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningOperationParcel appBrandBackgroundRunningOperationParcel = new com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningOperationParcel();
                        appBrandBackgroundRunningOperationParcel.f76932d = b17.f74803n;
                        appBrandBackgroundRunningOperationParcel.f76933e = b17.f74805p.f77281g;
                        appBrandBackgroundRunningOperationParcel.f76934f = 4;
                        appBrandBackgroundRunningOperationParcel.f76935g = 2;
                        appBrandBackgroundRunningOperationParcel.f76941p = b17.u0().X;
                        if (b17.r0() != null) {
                            appBrandBackgroundRunningOperationParcel.f76936h = b17.r0().getClass().getName();
                        }
                        ((com.tencent.mm.plugin.appbrand.backgroundrunning.k) ((com.tencent.mm.plugin.appbrand.backgroundrunning.v0) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.v0.class))).Di(appBrandBackgroundRunningOperationParcel);
                    }
                    u81.h hVar = b17.N;
                    hVar.getClass();
                    hVar.f425432a.s(u81.u.ON_STOP_BACKGROUND_LIVE_VOIP, null);
                }
            }
            if (com.tencent.mm.plugin.appbrand.backgroundrunning.w.b(mMBackgroundRunningOperationParcel.f76946e, 8) || com.tencent.mm.plugin.appbrand.backgroundrunning.w.b(mMBackgroundRunningOperationParcel.f76946e, 64)) {
                tf1.f fVar = (tf1.f) b17.k(tf1.f.class);
                if (fVar == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandBackgroundRunningMonitor", "disableBackgroundAudioPlayIfNeed, audioOfVideoBackgroundPlayManager not running");
                } else if (fVar.f418864m) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandBackgroundRunningMonitor", "disableBackgroundAudioPlayIfNeed, audioOfVideoBackgroundPlayManager isBackgroundAudioPlayPaused");
                } else {
                    fVar.x();
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandBackgroundRunningMonitor", "sendRemoveAudioOfVideoBackgroundPlayUsageOperation, runtime:%s", b17.f74803n);
                    if (i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.v0.class) != null) {
                        com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningOperationParcel appBrandBackgroundRunningOperationParcel2 = new com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningOperationParcel();
                        appBrandBackgroundRunningOperationParcel2.f76932d = b17.f74803n;
                        appBrandBackgroundRunningOperationParcel2.f76933e = b17.f74805p.f77281g;
                        appBrandBackgroundRunningOperationParcel2.f76934f = 72;
                        appBrandBackgroundRunningOperationParcel2.f76935g = 2;
                        appBrandBackgroundRunningOperationParcel2.f76941p = b17.u0().X;
                        if (b17.r0() != null) {
                            appBrandBackgroundRunningOperationParcel2.f76936h = b17.r0().getClass().getName();
                        }
                        ((com.tencent.mm.plugin.appbrand.backgroundrunning.k) ((com.tencent.mm.plugin.appbrand.backgroundrunning.v0) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.v0.class))).Di(appBrandBackgroundRunningOperationParcel2);
                    }
                    u81.h hVar2 = b17.N;
                    hVar2.getClass();
                    hVar2.f425432a.s(u81.u.ON_STOP_AUDIO_BACKGROUND_PLAY, null);
                }
            }
            if (com.tencent.mm.plugin.appbrand.backgroundrunning.w.b(mMBackgroundRunningOperationParcel.f76946e, 16)) {
                if (((com.tencent.mm.plugin.appbrand.backgroundrunning.i1) b17.k(com.tencent.mm.plugin.appbrand.backgroundrunning.i1.class)) == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandBackgroundRunningMonitor", "disableBackgroundVoIP1v1IfNeed, voip 1v1 state manager not running");
                    return;
                }
                md1.m1.b();
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPStateManager", "stopWaitVoipChat");
                ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).Ai(false);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandBackgroundRunningMonitor", "sendRemoveVoIP1v1UsageOperation, runtime:%s", b17.f74803n);
                if (i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.v0.class) != null) {
                    com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningOperationParcel appBrandBackgroundRunningOperationParcel3 = new com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningOperationParcel();
                    appBrandBackgroundRunningOperationParcel3.f76932d = b17.f74803n;
                    appBrandBackgroundRunningOperationParcel3.f76933e = b17.f74805p.f77281g;
                    appBrandBackgroundRunningOperationParcel3.f76934f = 16;
                    appBrandBackgroundRunningOperationParcel3.f76935g = 2;
                    appBrandBackgroundRunningOperationParcel3.f76941p = b17.u0().X;
                    if (b17.r0() != null) {
                        appBrandBackgroundRunningOperationParcel3.f76936h = b17.r0().getClass().getName();
                    }
                    ((com.tencent.mm.plugin.appbrand.backgroundrunning.k) ((com.tencent.mm.plugin.appbrand.backgroundrunning.v0) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.v0.class))).Di(appBrandBackgroundRunningOperationParcel3);
                }
                u81.h hVar3 = b17.N;
                hVar3.getClass();
                hVar3.f425432a.s(u81.u.ON_STOP_BACKGROUND_VOIP_1v1, null);
            }
        }
    }
}
