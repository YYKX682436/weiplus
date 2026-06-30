package ta4;

/* loaded from: classes4.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ta4.d1 f498269a = new ta4.d1();

    public final void a(java.lang.String eventId, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportPublishGroupCellEvent", "com.tencent.mm.plugin.sns.report.SnsPublishGroupReporter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventId, "eventId");
        java.lang.String l17 = ca4.z0.l();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsPublishGroupReporter", "reportPublishGroupCellEvent sessionId:" + l17 + " eventId:" + eventId + " reportGroupStatus:" + i17);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("50310_visiblelist", eventId, kz5.c1.k(new jz5.l("post_session_id", l17), new jz5.l("sns_post_visible_status", java.lang.Integer.valueOf(i17))), 36244);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportPublishGroupCellEvent", "com.tencent.mm.plugin.sns.report.SnsPublishGroupReporter");
    }

    public final void b(java.lang.String eventId) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportPublishLastGroupViewEvent", "com.tencent.mm.plugin.sns.report.SnsPublishGroupReporter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventId, "eventId");
        java.lang.String l17 = ca4.z0.l();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsPublishGroupReporter", "reportPublishLastGroupViewEvent sessionId:" + l17 + " eventId:" + eventId);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("50310_lastgroup", eventId, kz5.b1.e(new jz5.l("post_session_id", l17)), 36244);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportPublishLastGroupViewEvent", "com.tencent.mm.plugin.sns.report.SnsPublishGroupReporter");
    }
}
