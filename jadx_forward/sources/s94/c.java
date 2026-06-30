package s94;

/* loaded from: classes4.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final s94.c f486541d = new s94.c();

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.util.Iterator it;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.clean.SnsPostMediaCleanManager$triggerClean$1");
        java.lang.String sessionId = "SNS_TRIGGER-" + java.lang.System.currentTimeMillis();
        long a17 = s94.d.a() > 0 ? s94.d.a() : ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_post_media_clean_interval_day, 3) * 86400000;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsPostMediaCleanManager", "triggerClean success,interval:" + a17 + "  " + sessionId);
        ((wp4.x) ((n55.f) i95.n0.c(n55.f.class))).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        ((ku5.t0) ku5.t0.f394148d).h(new zp4.a(a17, sessionId), "Background_video_storage_clear");
        ((yy0.g8) ((pp0.o0) i95.n0.c(pp0.o0.class))).getClass();
        ((ku5.t0) ku5.t0.f394148d).h(new iz0.a(a17), "TEMPLATE_Background_video_storage_clear");
        boolean z18 = true;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_post_media_remain_clean_enable_v2, true)) {
            long a18 = s94.d.a() > 0 ? s94.d.a() : ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_post_media_fail_clean_interval_day, 7) * 86400000;
            ((wp4.x) ((n55.f) i95.n0.c(n55.f.class))).getClass();
            ((ku5.t0) ku5.t0.f394148d).h(new zp4.b(a18, sessionId), "Background_video_remain_clear");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$cleanSnsDraftDir", "com.tencent.mm.plugin.sns.clean.SnsPostMediaCleanManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cleanSnsDraftDir", "com.tencent.mm.plugin.sns.clean.SnsPostMediaCleanManager");
        java.lang.String a19 = je4.c.f380850a.a();
        com.p314xaae8f345.mm.vfs.r6[] G = new com.p314xaae8f345.mm.vfs.r6(a19).G();
        int i17 = 9;
        if ((G != null ? G.length : 0) > 9) {
            java.lang.Iterable s17 = com.p314xaae8f345.mm.vfs.w6.s(a19, false);
            if (s17 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cleanSnsDraftDir", "com.tencent.mm.plugin.sns.clean.SnsPostMediaCleanManager");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$cleanSnsDraftDir", "com.tencent.mm.plugin.sns.clean.SnsPostMediaCleanManager");
                dw3.k kVar = dw3.k.f325752a;
                ((ku5.t0) ku5.t0.f394148d).a(new dw3.j(sessionId));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.clean.SnsPostMediaCleanManager$triggerClean$1");
            }
            java.util.Iterator it6 = kz5.n0.F0(kz5.n0.S0(s17), new s94.b()).iterator();
            int i18 = 0;
            while (it6.hasNext()) {
                java.lang.Object next = it6.next();
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.p314xaae8f345.mm.vfs.x1 x1Var = (com.p314xaae8f345.mm.vfs.x1) next;
                if (i18 <= i17 || java.lang.System.currentTimeMillis() - x1Var.f294768e < a17) {
                    str = a19;
                    it = it6;
                    z17 = z18;
                } else {
                    java.lang.String str2 = a19 + x1Var.f294765b;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsPostMediaCleanManager", "cleanSnsDraftDir delete file path:" + str2);
                    dw3.k kVar2 = dw3.k.f325752a;
                    kVar2.c(str2, sessionId);
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    if (x1Var.f294769f) {
                        dw3.c0 c0Var = dw3.c0.f325715a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFileUtil", "deleteDir >> dir: ".concat(str2));
                        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(str2);
                        str = a19;
                        it = it6;
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.MediaFileUtil", "path:" + str2 + "  fileExist:" + j17, new java.lang.Object[0]);
                        z17 = true;
                        if (!(r26.n0.B(str2, "DCIM", true)) && j17) {
                            ((ku5.t0) ku5.t0.f394148d).h(new dw3.n(str2), "MediaFileUtil_deleteMediaFile");
                        }
                    } else {
                        str = a19;
                        it = it6;
                        z17 = true;
                        dw3.c0.f325715a.j(str2);
                    }
                    kVar2.e(str2, java.lang.System.currentTimeMillis() - currentTimeMillis);
                }
                z18 = z17;
                i18 = i19;
                it6 = it;
                a19 = str;
                i17 = 9;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cleanSnsDraftDir", "com.tencent.mm.plugin.sns.clean.SnsPostMediaCleanManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$cleanSnsDraftDir", "com.tencent.mm.plugin.sns.clean.SnsPostMediaCleanManager");
        dw3.k kVar3 = dw3.k.f325752a;
        ((ku5.t0) ku5.t0.f394148d).a(new dw3.j(sessionId));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.clean.SnsPostMediaCleanManager$triggerClean$1");
    }
}
