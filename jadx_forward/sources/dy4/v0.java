package dy4;

/* loaded from: classes15.dex */
public final class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy4.f1 f326245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f326246e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f326247f;

    public v0(dy4.f1 f1Var, int i17, int i18) {
        this.f326245d = f1Var;
        this.f326246e = i17;
        this.f326247f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dy4.w wVar;
        dy4.f1 f1Var = this.f326245d;
        int i17 = this.f326246e;
        int i18 = this.f326247f;
        if (!f1Var.I) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.x(), "onMediaPlayerInfo, mp released");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.x(), "onInfo, what:%d, extra:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        boolean z17 = false;
        if (i17 == 701) {
            ye1.e eVar = f1Var.f326160n;
            f1Var.f326165r = eVar != null && eVar.mo1856xc00617a4();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.x(), "onInfo, buffering start, isPlayingBeforeBuffering:%b", java.lang.Boolean.valueOf(f1Var.f326165r));
            if (f1Var.J() && (wVar = f1Var.U) != null) {
                wVar.g();
            }
            dy4.w wVar2 = f1Var.U;
            if (wVar2 != null) {
                java.lang.String str = wVar2.f326248a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onWaitingBufferReadyReport");
                try {
                    wVar2.d("WaitingBufferReady", null);
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "onWaitingBufferReadyReport fail", e17);
                }
            }
            dy4.g1 g1Var = f1Var.X.f326197a;
            if (g1Var.f326186i <= 0) {
                g1Var.f326184g++;
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                g1Var.f326186i = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1379L, 30L, 1L, false);
            }
        } else if (i17 == 702) {
            ye1.e eVar2 = f1Var.f326160n;
            boolean z19 = eVar2 != null && eVar2.mo1856xc00617a4();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.x(), "onInfo, buffering end, isPlayingBeforeBuffering:%b, isCurrentPlaying:%b", java.lang.Boolean.valueOf(f1Var.f326165r), java.lang.Boolean.valueOf(z19));
            if (f1Var.f326165r) {
                f1Var.f326165r = false;
                if (z19 && f1Var.J()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.x(), "onInfo, buffering end, notify video play");
                    dy4.w wVar3 = f1Var.U;
                    if (wVar3 != null) {
                        wVar3.f(false);
                    }
                    dy4.w wVar4 = f1Var.U;
                    if (wVar4 != null) {
                        java.lang.String str2 = wVar4.f326248a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "onBufferReadyReport");
                        try {
                            wVar4.d("BufferReady", null);
                        } catch (org.json.JSONException e18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "onBufferReadyReport fail", e18);
                        }
                    }
                }
            } else if (!z19 && f1Var.J()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.x(), "onInfo, buffering end, notify video pause");
                dy4.w wVar5 = f1Var.U;
                if (wVar5 != null) {
                    wVar5.e(false);
                }
                dy4.w wVar6 = f1Var.U;
                if (wVar6 != null) {
                    java.lang.String str3 = wVar6.f326248a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "onBufferReadyReport");
                    try {
                        wVar6.d("BufferReady", null);
                    } catch (org.json.JSONException e19) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, "onBufferReadyReport fail", e19);
                    }
                }
            }
            dy4.g1 g1Var2 = f1Var.X.f326197a;
            if (g1Var2.f326187j <= 0 && g1Var2.f326186i > 0) {
                boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                g1Var2.f326187j = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.mo68477x336bdfd8(1379L, 31L, 1L, false);
                long j17 = g1Var2.f326187j - g1Var2.f326186i;
                g1Var2.f326185h += j17;
                g0Var.mo68477x336bdfd8(1379L, 32L, j17, false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewVideoProfileReport", "onMediaPlayerVideoBufferEnd, bufferTime:%s", java.lang.Long.valueOf(j17));
            }
            g1Var2.f326186i = 0L;
            g1Var2.f326187j = 0L;
        } else if (i18 == -1004) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.x(), "onInfo, special error, what:%d, extra:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            dg.d dVar = f1Var.V;
            if (dVar != null) {
                ((dy4.m) dVar).a(i17, i18);
            }
        } else if (i17 == 3) {
            if (f1Var.I) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.x(), "onMediaPlayerVideoFirstFrame");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.x(), "onMediaPlayerVideoFirstFrame, mp released");
            }
        }
        ye1.e eVar3 = f1Var.f326160n;
        if (eVar3 != null && eVar3.mo1856xc00617a4()) {
            z17 = true;
        }
        if (z17 && f1Var.M && f1Var.N) {
            f1Var.Y = new java.util.concurrent.atomic.AtomicBoolean(true);
            f1Var.z();
        }
    }
}
