package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd;

/* loaded from: classes4.dex */
public final class z1 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 e17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnsOptionUIC");
        com.p314xaae8f345.mm.p872xbfc2bd01.ui.C10912x86c557b2.G = false;
        android.app.Activity context = m80379x76847179();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("registerReporterData", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
        o04.g gVar = new o04.g(1);
        ((md0.e) eVar).getClass();
        t04.a aVar = context instanceof com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8 ? (t04.a) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(t04.a.class) : null;
        if (aVar != null) {
            aVar.S6(gVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("registerReporterData", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        android.content.Intent intent = m158359x1e885992();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setUpBrowseHelper", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveGlobalInstance");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.B = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l7(1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUpBrowseHelper", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveGlobalInstance");
        android.app.Activity context2 = m80379x76847179();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.improve.func.SnsImprovePhotoLoader");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        sc4.a.f488088a = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.tm(context2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.improve.func.SnsImprovePhotoLoader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i7 Pj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Pj();
        Pj.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setIsTimelinePage", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        Pj.f245849i = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoService", "set isInSnsTimeline:%b", java.lang.Boolean.TRUE);
        if ((Pj.f245849i && !ma4.a.a()) || Pj.f245848h) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            cp.e.b("SnsVideoService", new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b7(Pj));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        }
        t21.c2 Ni = t21.o2.Ni();
        boolean z18 = Pj.f245849i;
        Ni.f496258f = z18;
        if (z18) {
            Ni.g();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setIsTimelinePage", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k6 Jj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Jj();
        Jj.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsRetryEditTipManager", "create");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateConfig", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k6.f245892i = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_retry_edit_expired_time, 300) * 1000;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k6.f245893j = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_retry_edit_enable, 1) == 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k6.f245894k = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_retry_edit_interval, 60);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsRetryEditTipManager", "updateConfig configEnable:%s, configInterval:%s, configExpiredTime:%s", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k6.f245893j), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k6.f245894k), java.lang.Long.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k6.f245892i));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateConfig", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        long j17 = Jj.f245895a;
        if (j17 != 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
            long j18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k6.f245892i;
            java.lang.Runnable runnable = Jj.f245899e;
            if (currentTimeMillis >= j18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsRetryEditTipManager", "already expired, reset directly");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
            } else {
                long currentTimeMillis2 = j18 - (java.lang.System.currentTimeMillis() - Jj.f245895a);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsRetryEditTipManager", "delay %s to reset", java.lang.Long.valueOf(currentTimeMillis2));
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(runnable, currentTimeMillis2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = Jj.f245897c;
            if (c17933xe8d1b226 != null && (e17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.e(c17933xe8d1b226)) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6972x174ca609 C = s0Var.C();
                C.f142830h = C.b("Sessionid", Jj.f245898d, true);
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6972x174ca609 C2 = s0Var.C();
                C2.f142827e = C2.b("PublishId", ca4.z0.s0(Jj.f245897c.f68891x29d1292e), true);
                s0Var.C().f142828f = e17.f38982x6c24f798;
                s0Var.C().f142829g = e17.f38962x37aaea10;
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6972x174ca609 C3 = s0Var.C();
                C3.f142831i = C3.b("ActionTimeStamp", java.lang.String.valueOf(java.lang.System.currentTimeMillis()), true);
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6972x174ca609 t17 = s0Var.t();
                t17.f142830h = t17.b("Sessionid", Jj.f245898d, true);
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6972x174ca609 t18 = s0Var.t();
                t18.f142827e = t18.b("PublishId", ca4.z0.s0(Jj.f245897c.f68891x29d1292e), true);
                s0Var.t().f142828f = e17.f38982x6c24f798;
                s0Var.t().f142829g = e17.f38962x37aaea10;
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6972x174ca609 t19 = s0Var.t();
                t19.f142831i = t19.b("ActionTimeStamp", java.lang.String.valueOf(java.lang.System.currentTimeMillis()), true);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        xd4.o0 d17 = xd4.o0.d();
        d17.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUICreate", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        d17.f535222c++;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUICreate", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        java.util.HashMap hashMap = ad4.l.f84721a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil");
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_download_cancel_enable, false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveImageDownloadUtil", "onCreate");
            android.os.HandlerThread handlerThread = ad4.l.f84723c;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            int i17 = pu5.i.f440006b;
            android.os.HandlerThread a17 = pu5.f.a("Sns-ImageCheck", 5);
            ad4.l.f84723c = a17;
            a17.start();
            ad4.l.f84724d = t26.e.b(new android.os.Handler(a17.getLooper()), null, 1, null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil");
        }
        zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
        if (a0Var != null) {
            ((yq1.z) a0Var).f546033e.put("__sns_timeline__", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("SnsMMKV").G("SnsMMKVSnsUI", true);
        ka4.o oVar = ka4.o.f387682a;
        if (oVar.a() && oVar.c() == 1) {
            ka4.m mVar = ka4.m.f387669a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startKaraPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            ka4.m.f387678j = true;
            ((ku5.t0) ku5.t0.f394148d).h(ka4.l.f387668d, "THREAD_SNS_KARA_OPTION");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startKaraPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("syncWithConfig", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnsOptionUIC");
        j75.f Ni2 = ((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Ni();
        if (Ni2 != null) {
            Ni2.B3(new sa0.m(1009));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("syncWithConfig", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnsOptionUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnsOptionUIC");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.m7 m7Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnsOptionUIC");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.SnsOptionUIC", "onDestroy");
        xd4.o0.d().h(m158354x19263085());
        xd4.g a17 = xd4.g.a();
        a17.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIDestroy", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightPlayViewManager", "onUIDestroy");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clear", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopAll", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
        java.util.HashSet hashSet = (java.util.HashSet) a17.f535174a;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((xd4.d) it.next()).mo69496x360802();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopAll", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
        hashSet.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clear", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIDestroy", "com.tencent.mm.plugin.sns.ui.video.SightPlayViewManager");
        ((c50.b1) i95.n0.c(c50.b1.class)).getClass();
        mm0.c.f410108b.a();
        ad4.y yVar = ad4.y.f84743a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearCacheFoldCommentContent", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.TextUtil", "clearCacheFoldCommentContent: ");
        yVar.c().clear();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearCacheFoldCommentContent", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.func.SnsImprovePhotoLoader");
        sc4.a.f488088a = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.func.SnsImprovePhotoLoader");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("SnsMMKV").G("SnsMMKVSnsUI", false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("releaseWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        ad4.w.f84739d = null;
        android.view.animation.TranslateAnimation translateAnimation = ad4.w.f84737b;
        if (translateAnimation != null) {
            translateAnimation.cancel();
        }
        ad4.w.f84737b = null;
        android.view.animation.TranslateAnimation translateAnimation2 = ad4.w.f84738c;
        if (translateAnimation2 != null) {
            translateAnimation2.cancel();
        }
        ad4.w.f84738c = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("releaseWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        nd4.e eVar = nd4.e.f418009a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("release", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineItemViewPool");
        nd4.e.f418010b.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("release", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineItemViewPool");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("release", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveGlobalInstance");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOpenIMUnlikeHelper", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveGlobalInstance");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(pc4.a.f434940a, null) && (m7Var = pc4.a.f434940a) != null) {
            m7Var.c();
        }
        pc4.a.f434940a = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOpenIMUnlikeHelper", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveGlobalInstance");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.B = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("release", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveGlobalInstance");
        ik4.l lVar = ik4.l.f373474a;
        ik4.l.f373477d.clear();
        ik4.l.f373476c.clear();
        java.util.HashSet hashSet2 = ik4.l.f373475b;
        java.util.Iterator it6 = hashSet2.iterator();
        while (it6.hasNext()) {
            ik4.l.f373474a.c((ik4.g) it6.next(), false);
        }
        hashSet2.clear();
        dd4.u uVar = dd4.y.f310604f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("releaseAllCache", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper$Companion");
        java.util.Iterator it7 = dd4.y.a().entrySet().iterator();
        while (it7.hasNext()) {
            ((xd4.b) ((java.util.Map.Entry) it7.next()).getValue()).a().p();
        }
        dd4.y.a().clear();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("releaseAllCache", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper$Companion");
        dd4.r rVar = dd4.s.f310578k;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("release", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter$Companion");
        dd4.s.d().clear();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("release", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p5.a();
        java.util.HashMap hashMap = ad4.l.f84721a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil");
        t26.d dVar = ad4.l.f84724d;
        if (dVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveImageDownloadUtil", "onDestroy");
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, dVar, null, new ad4.i(null), 2, null);
            ad4.l.f84724d = null;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveImageDownloadUtil");
        }
        com.p314xaae8f345.mm.p872xbfc2bd01.ui.C10912x86c557b2.G = true;
        ok4.f fVar = ok4.f.f427527a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsPredictDataReport", "clear");
        ok4.f.f427528b.clear();
        ka4.o oVar = ka4.o.f387682a;
        if (oVar.a() && oVar.c() == 1) {
            ka4.m mVar = ka4.m.f387669a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopKaraPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsKaraOptionConfig", "stopKaraPredict");
            ka4.m.f387678j = false;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopKaraPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        }
        java.util.HashMap hashMap2 = sb4.z.f487124d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportBigPicClick", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Uj().mo50293x3498a0(new sb4.d0());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportBigPicClick", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        ((ku5.t0) ku5.t0.f394148d).A("MicroMsg.Improve.SnsOptionUIC");
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.y1 y1Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.y1.f250593d;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.w(y1Var, 1800000L, "MicroMsg.Improve.SnsOptionUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.x1 x1Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.x1.f252839a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearExpiredItem", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        ((ku5.t0) ku5.t0.f394148d).g(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.t1.f252806d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearExpiredItem", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.q2 q2Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.q2.f252784d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("release", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.q2.f252785e.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("release", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("triggerClean", "com.tencent.mm.plugin.sns.clean.SnsPostMediaCleanManager");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_post_media_clean_enable, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsPostMediaCleanManager", "triggerClean enable:" + fj6);
        if (fj6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsPostMediaCleanManager", "triggerClean start");
            ((ku5.t0) ku5.t0.f394148d).g(s94.c.f486541d);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("triggerClean", "com.tencent.mm.plugin.sns.clean.SnsPostMediaCleanManager");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("triggerClean", "com.tencent.mm.plugin.sns.clean.SnsPostMediaCleanManager");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnsOptionUIC");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.j, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnsOptionUIC");
        super.mo2281xb01dfb57();
        xd4.o0.d().i();
        xd4.g.a().b();
        ta4.u0 u0Var = ta4.u0.f498371a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportAll", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        pm0.v.O("MicroMsg.Image.SnsImageLoadReporter", ta4.l0.f498332d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportAll", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnsOptionUIC");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.j, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnsOptionUIC");
        super.mo2284x57429eec();
        ta4.u0 u0Var = ta4.u0.f498371a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startSession", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        pm0.v.O("SnsImageLoadReporter", ta4.t0.f498368d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startSession", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().m0();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnsOptionUIC");
    }
}
