package h63;

@j95.b(m140513x1e06fd29 = {p60.x.class})
/* loaded from: classes7.dex */
public final class g1 extends i95.w implements h63.s1 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f360767d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f360768e;

    /* renamed from: f, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f360769f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f360770g;

    /* renamed from: h, reason: collision with root package name */
    public final os5.n f360771h = new h63.d1(this);

    public final void Ai(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveMainProcessService", "enableVoiceCapture %b", java.lang.Boolean.valueOf(z17));
        s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
        int i17 = z17 ? 100 : 0;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var).getClass();
        dk2.ef efVar = dk2.ef.f314905a;
        mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
        if (c1Var != null && c1Var.Y4) {
            mm2.c1 c1Var2 = (mm2.c1) efVar.i(mm2.c1.class);
            if (c1Var2 != null) {
                c1Var2.Z4 = i17;
            }
            mm2.t2 t2Var = (mm2.t2) efVar.i(mm2.t2.class);
            if (t2Var != null && t2Var.f410961g) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveService", "setVoiceCaptureVolume " + i17 + ": anchor isVerifying, mute volume");
                tn0.w0 w0Var2 = dk2.ef.f314911d;
                if (w0Var2 != null) {
                    w0Var2.B0(0);
                    return;
                }
                return;
            }
        }
        tn0.w0 w0Var3 = dk2.ef.f314911d;
        if (w0Var3 != null) {
            w0Var3.B0(i17);
        }
    }

    public final void Bi() {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
        r45.wp1 wp1Var = dk2.ef.f314923j.f315217b;
        p60.u uVar = (p60.u) i95.n0.c(p60.u.class);
        if (wp1Var != null) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wp1Var.m75945x2fec8307(3))) {
                java.lang.String m75945x2fec8307 = wp1Var.m75945x2fec8307(3);
                uVar.getClass();
                p60.u.f433732g.putString("Game_Live_Nickname", m75945x2fec8307);
            }
            if (wp1Var.m75942xfb822ef2(1) != 0) {
                long m75942xfb822ef2 = wp1Var.m75942xfb822ef2(1);
                uVar.getClass();
                p60.u.f433732g.putLong("Game_Live_liveId", m75942xfb822ef2);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wp1Var.m75945x2fec8307(2))) {
                java.lang.String m75945x2fec83072 = wp1Var.m75945x2fec8307(2);
                uVar.getClass();
                p60.u.f433732g.putString("Game_Live_joinLiveTips", m75945x2fec83072);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wp1Var.m75945x2fec8307(4))) {
                java.lang.String m75945x2fec83073 = wp1Var.m75945x2fec8307(4);
                uVar.getClass();
                p60.u.f433732g.putString("Game_Live_anchorHeadUrl", m75945x2fec83073);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wp1Var.m75945x2fec8307(5))) {
                java.lang.String m75945x2fec83074 = wp1Var.m75945x2fec8307(5);
                uVar.getClass();
                p60.u.f433732g.putString("Game_Live_finderGameExportId", m75945x2fec83074);
            }
        }
        java.lang.String Ui = ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(null);
        uVar.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = p60.u.f433732g;
        o4Var.putString("Game_Live_finderUsrName", Ui);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveMainProcessService", "zbql:getStartData:gameLiveNickname:%s ,gameLiveAnchorHeadUrl:%s , exportId:%s", o4Var.getString("Game_Live_Nickname", ""), o4Var.getString("Game_Live_anchorHeadUrl", ""), o4Var.getString("Game_Live_finderGameExportId", ""));
    }

    public void Di(android.content.Context context, java.lang.String appId, int i17, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Long l17) {
        boolean booleanValue = bool.booleanValue();
        boolean booleanValue2 = bool2.booleanValue();
        long longValue = l17.longValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveMainProcessService", "launchWAGameForFinderLive " + appId + ' ' + i17 + ' ' + booleanValue + ' ' + booleanValue2);
        p60.u uVar = (p60.u) i95.n0.c(p60.u.class);
        if (booleanValue) {
            wi(true);
            uVar.Vi(appId);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = p60.u.f433732g;
            o4Var.putInt("onLiveVersionType", i17);
            uVar.Ri(p60.j.f433695g);
            o4Var.putInt("gameLivePrepareScene", (booleanValue2 ? p60.s.f433727g : p60.s.f433728h).f433730d);
            o4Var.putBoolean("onLivingStatusForCrashCheck", true);
            uVar.f433735f = false;
            o4Var.putString("onLiveAppIdForCrashCheck", appId);
            o4Var.putInt("onLiveVersionTypeForCrashCheck", i17);
            Ni();
        } else if (uVar.f433735f) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = p60.u.f433732g;
            if (appId.equals(o4Var2.getString("onLiveAppIdForCrashCheck", "")) && i17 == o4Var2.getInt("onLiveVersionTypeForCrashCheck", 0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveMainProcessService", "zbql: resumeGameLiveFromCrash");
                Ni();
                Bi();
                p60.u uVar2 = (p60.u) i95.n0.c(p60.u.class);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveMainProcessService", "zbql:resumeGameLiveFromCrash reset GameLiveCommonService params");
                uVar2.Di();
                uVar2.Vi(appId);
                o4Var2.putInt("onLiveVersionType", i17);
                uVar2.Ri(p60.j.f433698m);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveMainProcessService", "zbql:resumeGameLiveFromCrash reset GameLiveCommonService params done");
                uVar.f433735f = false;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameLiveMainProcessService", "zbql:wrong!!!! reset crash state in launchWAGameForFinderLive,but the appid or versionType is wrong");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 h6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class);
        if (h6Var != null) {
            l81.b1 b1Var = new l81.b1();
            b1Var.f398547b = appId;
            b1Var.f398549c = i17;
            b1Var.f398565k = booleanValue ? 1198 : 1197;
            java.lang.String Ui = ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveMainProcessService", "zbql:" + Ui + ':' + longValue);
            b1Var.f398567l = Ui + ':' + longValue;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) h6Var).bj(context, b1Var);
        }
        ((p60.u) i95.n0.c(p60.u.class)).getClass();
        p60.u.f433732g.putLong("Game_Live_liveId", longValue);
    }

    public final void Ni() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveMainProcessService", "zbql:registerFinderLiveCallback");
        s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
        os5.n nVar = this.f360771h;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var).getClass();
        if (nVar != null) {
            dk2.k6 k6Var = dk2.ef.f314923j;
            k6Var.getClass();
            pm0.v.X(new dk2.h6(k6Var, nVar));
        }
        this.f360770g = true;
    }

    public final void Ri(p60.l action, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(((p60.u) i95.n0.c(p60.u.class)).wi(), new com.p314xaae8f345.mm.p689xc5a27af6.p751x9697b3de.C10616xc4862b57(action, null, 0, new com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16062x6aff2a90(kz5.c1.k(new jz5.l("event", java.lang.Integer.valueOf(i17)), new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, java.lang.Integer.valueOf(i18)))), 6, null), p60.q.class, null);
    }

    public final void Ui(android.content.Context context, java.lang.String appId, int i17, boolean z17, java.lang.String path, java.lang.String reportInfo, int i18, long j17) {
        android.view.WindowManager windowManager;
        android.view.Display defaultDisplay;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportInfo, "reportInfo");
        ((p60.u) i95.n0.c(p60.u.class)).getClass();
        ((h63.g1) i95.n0.c(h63.g1.class)).Ni();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
        c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("APPID", appId);
        intent.putExtra("VERSION_TYPE", i17);
        intent.putExtra("IGNORE_CONTINUE_LIVE", z17);
        intent.putExtra("WXA_DEVELOPER_CUSTOM_PARAM", path);
        intent.putExtra("REPORT_INFO", reportInfo);
        intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_TYPE", i18);
        intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_ID", j17);
        boolean z18 = context instanceof android.app.Activity;
        android.app.Activity activity = z18 ? (android.app.Activity) context : null;
        java.lang.Integer valueOf = (activity == null || (windowManager = activity.getWindowManager()) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) ? null : java.lang.Integer.valueOf(defaultDisplay.getRotation());
        if (valueOf != null && valueOf.intValue() == 1) {
            intent.putExtra("LANDSCAPE_TYPE", 1);
        } else if (valueOf != null && valueOf.intValue() == 3) {
            intent.putExtra("LANDSCAPE_TYPE", 2);
        } else {
            intent.putExtra("LANDSCAPE_TYPE", 0);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ubVar).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActivityRouter", "FinderGameLivePostVerifyUI");
        android.content.Intent intent2 = z18 ? null : intent;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, (java.lang.Class) ((jz5.n) jz2.x0.E).mo141623x754a37bb());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderGameLivePostVerifyUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderGameLivePostVerifyUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void Vi() {
        if (this.f360770g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveMainProcessService", "zbql:unRegisterFinderLiveCallback");
            s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
            os5.n nVar = this.f360771h;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var).getClass();
            if (nVar != null) {
                dk2.k6 k6Var = dk2.ef.f314923j;
                k6Var.getClass();
                pm0.v.X(new dk2.j6(k6Var, nVar));
            }
            this.f360770g = false;
        }
    }

    public final synchronized void wi(boolean z17) {
        p3325xe03a0797.p3326xc267989b.r2 r2Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveMainProcessService", "enableForegroundService current:" + this.f360768e + " request:" + z17);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (z17) {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new h63.b1(this, context, null), 3, null);
        } else if (this.f360768e) {
            p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f360769f;
            boolean z18 = false;
            if (r2Var2 != null && r2Var2.a()) {
                z18 = true;
            }
            if (z18 && (r2Var = this.f360769f) != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            this.f360769f = p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new h63.c1(context, this, null), 3, null);
        }
    }
}
