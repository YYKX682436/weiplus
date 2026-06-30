package ta4;

/* loaded from: classes4.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ta4.e1 f498273a = new ta4.e1();

    public final java.lang.String a(int i17, boolean z17) {
        java.lang.String Ni;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSessionId", "com.tencent.mm.plugin.sns.report.SnsSaveImageVideoReporter");
        if (i17 == 3) {
            Ni = z17 ? ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni() : ca4.z0.f121604d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Ni);
        } else {
            Ni = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Ni);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSessionId", "com.tencent.mm.plugin.sns.report.SnsSaveImageVideoReporter");
        return Ni;
    }

    public final void b(java.lang.String sessionId, int i17, java.lang.String failReason, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, boolean z17, ta4.k type) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("report", "com.tencent.mm.plugin.sns.report.SnsSaveImageVideoReporter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(failReason, "failReason");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("report$default", "com.tencent.mm.plugin.sns.report.SnsSaveImageVideoReporter");
        c(sessionId, i17, failReason, c17933xe8d1b226, z17, type, true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("report$default", "com.tencent.mm.plugin.sns.report.SnsSaveImageVideoReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("report", "com.tencent.mm.plugin.sns.report.SnsSaveImageVideoReporter");
    }

    public final void c(java.lang.String sessionId, int i17, java.lang.String failReason, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, boolean z17, ta4.k type, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("report", "com.tencent.mm.plugin.sns.report.SnsSaveImageVideoReporter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(failReason, "failReason");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsSaveImageVideoReporter", "Fail to get sns info, skip reporting.");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("report", "com.tencent.mm.plugin.sns.report.SnsSaveImageVideoReporter");
            return;
        }
        java.lang.String r17 = c01.z1.r();
        if (z18) {
            i17 = d(i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getType", "com.tencent.mm.plugin.sns.report.MaterialType");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getType", "com.tencent.mm.plugin.sns.report.MaterialType");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("sns_picvideo_save", kz5.c1.k(new jz5.l("sessionid_sns", sessionId), new jz5.l("sns_scene", java.lang.Integer.valueOf(i17)), new jz5.l("failed_reason", failReason), new jz5.l("sns_feed_id", ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e)), new jz5.l("is_success", java.lang.Integer.valueOf(z17 ? 1 : 0)), new jz5.l("isfeedpublisher", java.lang.Integer.valueOf(r17.equals(c17933xe8d1b226.m70374x6bf53a6c()) ? 1 : 0)), new jz5.l("materialtype", java.lang.Integer.valueOf(type.f498326d))), 36244);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("report", "com.tencent.mm.plugin.sns.report.SnsSaveImageVideoReporter");
    }

    public final int d(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("uiFromSceneToSnsScene", "com.tencent.mm.plugin.sns.report.SnsSaveImageVideoReporter");
        if (i17 == 2) {
            i17 = 3;
        } else if (i17 == 3) {
            i17 = 5;
        } else if (i17 == 4 || i17 == 5) {
            i17 = 2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("uiFromSceneToSnsScene", "com.tencent.mm.plugin.sns.report.SnsSaveImageVideoReporter");
        return i17;
    }
}
