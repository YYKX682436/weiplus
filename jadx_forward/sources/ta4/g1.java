package ta4;

/* loaded from: classes4.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ta4.g1 f498280a = new ta4.g1();

    /* renamed from: b, reason: collision with root package name */
    public static int f498281b;

    public final void a(int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 snsInfo) {
        int i19;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doReport", "com.tencent.mm.plugin.sns.report.SnsStarActionReporter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsInfo, "snsInfo");
        java.lang.String t07 = ca4.z0.t0(snsInfo.f68891x29d1292e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarActionReporter", "doReport >> " + i17 + ", " + t07);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 e17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.e(snsInfo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getMergeSnsObject(...)");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7047xd254b64 c7047xd254b64 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7047xd254b64();
        c7047xd254b64.f143617d = (long) i17;
        c7047xd254b64.f143618e = i18;
        int i27 = 1;
        c7047xd254b64.f143620g = c7047xd254b64.b("feedID", t07, true);
        c7047xd254b64.f143623j = snsInfo.m70357x3fdd41df();
        c7047xd254b64.f143619f = f498281b;
        c7047xd254b64.f143622i = e17.f38962x37aaea10;
        c7047xd254b64.f143621h = e17.f38982x6c24f798;
        ca4.e1 e1Var = ca4.f1.f121430a;
        if (e1Var.e(e17)) {
            c7047xd254b64.f143625l = 2L;
        } else if (e1Var.c(e17)) {
            c7047xd254b64.f143625l = 3L;
        } else if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.i(snsInfo.m70362xf8db520e(), true)) {
            c7047xd254b64.f143625l = 4L;
        } else {
            c7047xd254b64.f143625l = 1L;
        }
        java.lang.String m70374x6bf53a6c = snsInfo.m70374x6bf53a6c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m70374x6bf53a6c, "getUserName(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVisibleType", "com.tencent.mm.plugin.sns.report.SnsStarActionReporter");
        r45.cb6 b17 = p94.w0.c() != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.e2) p94.w0.c()).b1(m70374x6bf53a6c) : null;
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsStarActionReporter", "userinfo is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVisibleType", "com.tencent.mm.plugin.sns.report.SnsStarActionReporter");
            i19 = -1;
        } else {
            int i28 = b17.f452964g;
            int i29 = b17.f452965h;
            if (i29 == 4320 && (i28 & 4096) > 0) {
                i27 = 2;
            } else if (i29 == 72 && (i28 & 4096) > 0) {
                i27 = 4;
            } else if (i29 == 720 && (i28 & 4096) > 0) {
                i27 = 3;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVisibleType", "com.tencent.mm.plugin.sns.report.SnsStarActionReporter");
            i19 = i27;
        }
        c7047xd254b64.f143624k = i19;
        c7047xd254b64.k();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doReport", "com.tencent.mm.plugin.sns.report.SnsStarActionReporter");
    }
}
