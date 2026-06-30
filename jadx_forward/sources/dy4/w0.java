package dy4;

/* loaded from: classes15.dex */
public final class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy4.f1 f326264d;

    public w0(dy4.f1 f1Var) {
        this.f326264d = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dy4.f1 f1Var = this.f326264d;
        if (!f1Var.I) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.x(), "onMediaPlayerPrepared, mp released");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.x(), "onPrepared");
        boolean z17 = true;
        f1Var.f326168u = true;
        f1Var.s();
        dy4.h1 h1Var = f1Var.X;
        ye1.e eVar = f1Var.f326160n;
        int mo1852x51e8b0a = eVar != null ? eVar.mo1852x51e8b0a() : 0;
        dy4.g1 g1Var = h1Var.f326197a;
        if (g1Var.f326182e <= 0) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            g1Var.f326182e = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(1379L, 21L, 1L, false);
            long j17 = g1Var.f326182e - g1Var.f326181d;
            g1Var.f326183f = j17;
            g0Var.mo68477x336bdfd8(1379L, 22L, j17, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewVideoProfileReport", "onMediaPlayerVideoPrepareEnd, prepareTime:%s", java.lang.Long.valueOf(j17));
        }
        if (g1Var.f326180c <= 0 && mo1852x51e8b0a > 0) {
            long j18 = (long) ((mo1852x51e8b0a * 1.0d) / 1000);
            g1Var.f326180c = j18;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var2.mo68477x336bdfd8(1379L, 26L, 1L, false);
            g0Var2.mo68477x336bdfd8(1379L, 24L, j18, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewVideoProfileReport", "onMediaPlayerVideoPrepareEnd, duration:%s", java.lang.Long.valueOf(j18));
        }
        if (f1Var.J()) {
            dy4.w wVar = f1Var.U;
            if (wVar != null) {
                ye1.e eVar2 = f1Var.f326160n;
                int mo1855x8d5c7601 = eVar2 != null ? eVar2.mo1855x8d5c7601() : 0;
                ye1.e eVar3 = f1Var.f326160n;
                int mo1854x463504c = eVar3 != null ? eVar3.mo1854x463504c() : 0;
                ye1.e eVar4 = f1Var.f326160n;
                int mo1852x51e8b0a2 = eVar4 != null ? eVar4.mo1852x51e8b0a() : 0;
                java.lang.String str = wVar.f326248a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onVideoLoadedMetaData width=" + mo1855x8d5c7601 + ", height=" + mo1854x463504c + ", duration=" + mo1852x51e8b0a2);
                try {
                    org.json.JSONObject c17 = wVar.c();
                    c17.put("width", mo1855x8d5c7601);
                    c17.put("height", mo1854x463504c);
                    double d17 = (mo1852x51e8b0a2 * 1.0d) / 1000;
                    wVar.f326251d = d17;
                    c17.put("duration", d17);
                    wVar.a("onVideoLoadedMetaData", c17);
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "onVideoLoadedMetaData fail", e17);
                }
            }
            dy4.w wVar2 = f1Var.U;
            if (wVar2 != null) {
                java.lang.String str2 = wVar2.f326248a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "onWaitingMoovReport");
                try {
                    wVar2.d("WaitingMoov", null);
                } catch (org.json.JSONException e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "onWaitingMoovReport fail", e18);
                }
            }
            dy4.w wVar3 = f1Var.U;
            if (wVar3 != null) {
                java.lang.String str3 = wVar3.f326248a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "onWaitingPreDataReport");
                try {
                    wVar3.d("WaitingPreData", null);
                } catch (org.json.JSONException e19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, "onWaitingPreDataReport fail", e19);
                }
            }
            dy4.w wVar4 = f1Var.U;
            if (wVar4 != null) {
                java.lang.String str4 = wVar4.f326248a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "onWaitingReadyReport");
                try {
                    org.json.JSONObject c18 = wVar4.c();
                    c18.put("state", 5);
                    c18.put("extInfo", wVar4.b());
                    wVar4.d("WaitingReady", c18);
                } catch (org.json.JSONException e27) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str4, "onWaitingReadyReport fail", e27);
                }
            }
            dy4.w wVar5 = f1Var.U;
            if (wVar5 != null) {
                java.lang.String str5 = wVar5.f326248a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str5, "onWaitingPlayReport");
                try {
                    dy4.f1 f1Var2 = wVar5.f326250c;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f1Var2 != null ? f1Var2.D : null, null)) {
                        wVar5.f326254g++;
                    } else {
                        wVar5.f326254g = 0;
                    }
                    wVar5.d("WaitingPlay", null);
                } catch (org.json.JSONException e28) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str5, "onWaitingPlayReport fail", e28);
                }
            }
        }
        long j19 = f1Var.f326166s;
        if (j19 > 0) {
            f1Var.H(j19);
            f1Var.f326166s = 0L;
        }
        f1Var.x();
        if (f1Var.M) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.x(), "onPrepared, stop video auto play when webview in background");
            if (!f1Var.f326167t && !f1Var.f326169v) {
                z17 = false;
            }
            f1Var.Y = new java.util.concurrent.atomic.AtomicBoolean(z17);
            return;
        }
        if (!f1Var.f326167t && !f1Var.f326169v) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.x(), "onPrepared, not set start play when prepared");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.x(), "onPrepared, start play when prepared, mStartWhenPrepared:%s, mControlStartWhenPrepared:%s", java.lang.Boolean.valueOf(f1Var.f326167t), java.lang.Boolean.valueOf(f1Var.f326169v));
            f1Var.A(f1Var.f326167t, true);
        }
    }
}
