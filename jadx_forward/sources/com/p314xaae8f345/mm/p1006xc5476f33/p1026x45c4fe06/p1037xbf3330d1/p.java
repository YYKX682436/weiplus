package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1;

/* loaded from: classes7.dex */
public class p implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.t0 {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.t0
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11741xcdfabd1f c11741xcdfabd1f) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandBackgroundRunningMonitor", "onBackgroundRunningOperationReceived, operation:%s", c11741xcdfabd1f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.b(c11741xcdfabd1f.f158478d);
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandBackgroundRunningMonitor", "onBackgroundRunningOperationReceived, runtime is null");
            return;
        }
        if (c11741xcdfabd1f.f158480f == 2) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.w.b(c11741xcdfabd1f.f158479e, 2)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.j1 j1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.j1) b17.k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.j1.class);
                if (j1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.k1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.k1 k1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.k1) j1Var;
                    if (k1Var.f162974q) {
                        k1Var.f162972o = true;
                        k1Var.l(2);
                        k1Var.q(b17);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.t.b(b17);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandBackgroundRunningMonitor", "disableBackgroundLocationIfNeed, location state manager not in background mode");
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandBackgroundRunningMonitor", "disableBackgroundLocationIfNeed, invalid location state manager");
                }
            }
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.w.b(c11741xcdfabd1f.f158479e, 4)) {
                xf1.i iVar = (xf1.i) b17.k(xf1.i.class);
                if (iVar == null || !iVar.a()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandBackgroundRunningMonitor", "disableBackgroundVOIPIfNeed, voip state manager not running");
                } else {
                    synchronized (iVar) {
                        if (iVar.f535772f != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(iVar.f535770d, "stopVOIP, LivePusher:%s", iVar.f535772f.g());
                            iVar.f535772f.m();
                        }
                        for (tf.w wVar : iVar.f535773g) {
                            if (wVar != null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(iVar.f535770d, "stopVOIP, LivePlayer:%s", wVar.g());
                                wVar.m();
                            }
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandBackgroundRunningMonitor", "sendRemoveVOIPUsageOperation, runtime:%s", b17.f156336n);
                    if (i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0.class) != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11738x6e2c0d85 c11738x6e2c0d85 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11738x6e2c0d85();
                        c11738x6e2c0d85.f158465d = b17.f156336n;
                        c11738x6e2c0d85.f158466e = b17.f156338p.f158814g;
                        c11738x6e2c0d85.f158467f = 4;
                        c11738x6e2c0d85.f158468g = 2;
                        c11738x6e2c0d85.f158474p = b17.u0().X;
                        if (b17.r0() != null) {
                            c11738x6e2c0d85.f158469h = b17.r0().getClass().getName();
                        }
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.k) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0.class))).Di(c11738x6e2c0d85);
                    }
                    u81.h hVar = b17.N;
                    hVar.getClass();
                    hVar.f506965a.s(u81.u.ON_STOP_BACKGROUND_LIVE_VOIP, null);
                }
            }
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.w.b(c11741xcdfabd1f.f158479e, 8) || com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.w.b(c11741xcdfabd1f.f158479e, 64)) {
                tf1.f fVar = (tf1.f) b17.k(tf1.f.class);
                if (fVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandBackgroundRunningMonitor", "disableBackgroundAudioPlayIfNeed, audioOfVideoBackgroundPlayManager not running");
                } else if (fVar.f500397m) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandBackgroundRunningMonitor", "disableBackgroundAudioPlayIfNeed, audioOfVideoBackgroundPlayManager isBackgroundAudioPlayPaused");
                } else {
                    fVar.x();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandBackgroundRunningMonitor", "sendRemoveAudioOfVideoBackgroundPlayUsageOperation, runtime:%s", b17.f156336n);
                    if (i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0.class) != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11738x6e2c0d85 c11738x6e2c0d852 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11738x6e2c0d85();
                        c11738x6e2c0d852.f158465d = b17.f156336n;
                        c11738x6e2c0d852.f158466e = b17.f156338p.f158814g;
                        c11738x6e2c0d852.f158467f = 72;
                        c11738x6e2c0d852.f158468g = 2;
                        c11738x6e2c0d852.f158474p = b17.u0().X;
                        if (b17.r0() != null) {
                            c11738x6e2c0d852.f158469h = b17.r0().getClass().getName();
                        }
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.k) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0.class))).Di(c11738x6e2c0d852);
                    }
                    u81.h hVar2 = b17.N;
                    hVar2.getClass();
                    hVar2.f506965a.s(u81.u.ON_STOP_AUDIO_BACKGROUND_PLAY, null);
                }
            }
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.w.b(c11741xcdfabd1f.f158479e, 16)) {
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.i1) b17.k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.i1.class)) == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandBackgroundRunningMonitor", "disableBackgroundVoIP1v1IfNeed, voip 1v1 state manager not running");
                    return;
                }
                md1.m1.b();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPStateManager", "stopWaitVoipChat");
                ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).Ai(false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandBackgroundRunningMonitor", "sendRemoveVoIP1v1UsageOperation, runtime:%s", b17.f156336n);
                if (i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0.class) != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11738x6e2c0d85 c11738x6e2c0d853 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11738x6e2c0d85();
                    c11738x6e2c0d853.f158465d = b17.f156336n;
                    c11738x6e2c0d853.f158466e = b17.f156338p.f158814g;
                    c11738x6e2c0d853.f158467f = 16;
                    c11738x6e2c0d853.f158468g = 2;
                    c11738x6e2c0d853.f158474p = b17.u0().X;
                    if (b17.r0() != null) {
                        c11738x6e2c0d853.f158469h = b17.r0().getClass().getName();
                    }
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.k) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0.class))).Di(c11738x6e2c0d853);
                }
                u81.h hVar3 = b17.N;
                hVar3.getClass();
                hVar3.f506965a.s(u81.u.ON_STOP_BACKGROUND_VOIP_1v1, null);
            }
        }
    }
}
