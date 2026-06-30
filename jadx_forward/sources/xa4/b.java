package xa4;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final xa4.b f534354a = new xa4.b();

    public final void a(boolean z17, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportSnsPostBottomSheetClk", "com.tencent.mm.plugin.sns.spring.SnsSpring33050Reporter");
        java.lang.String l17 = ca4.z0.l();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSpring33050Reporter", "reportSnsPostBottomSheetClk >> " + z17 + " action: " + i17 + " sessionId: " + l17 + " scene: " + i18);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("sns_post_actionsheet", "view_clk", kz5.c1.k(new jz5.l("is_red_dot", java.lang.Integer.valueOf(z17 ? 1 : 0)), new jz5.l("actionsheet_opt", java.lang.Integer.valueOf(i17 == nc4.d.f417656e.h() ? 0 : i17 == nc4.d.f417658g.h() ? 1 : i17 == nc4.d.f417657f.h() ? 2 : i17 == nc4.d.f417661m.h() ? 6 : -1)), new jz5.l("post_session_id", l17), new jz5.l("sns_scene", java.lang.Integer.valueOf(i18))), 33050);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportSnsPostBottomSheetClk", "com.tencent.mm.plugin.sns.spring.SnsSpring33050Reporter");
    }

    public final void b(boolean z17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportSnsPostBottomSheetExp", "com.tencent.mm.plugin.sns.spring.SnsSpring33050Reporter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSpring33050Reporter", "isShowRedDot >> " + z17 + " scene: " + i17);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("sns_post_actionsheet", "view_exp", kz5.c1.k(new jz5.l("is_red_dot", java.lang.Integer.valueOf(z17 ? 1 : 0)), new jz5.l("sns_scene", java.lang.Integer.valueOf(i17))), 33050);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportSnsPostBottomSheetExp", "com.tencent.mm.plugin.sns.spring.SnsSpring33050Reporter");
    }

    public final void c(boolean z17, java.lang.String eventId, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportSnsTimelineCameraEntrance", "com.tencent.mm.plugin.sns.spring.SnsSpring33050Reporter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventId, "eventId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSpring33050Reporter", "reportSnsTimelineCameraEntrance >> isShowRedDot: " + z17 + " eventId: " + eventId + " scene: " + i17);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("sns_camera", eventId, kz5.c1.k(new jz5.l("is_red_dot", java.lang.Integer.valueOf(z17 ? 1 : 0)), new jz5.l("sns_scene", java.lang.Integer.valueOf(i17))), 33050);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportSnsTimelineCameraEntrance", "com.tencent.mm.plugin.sns.spring.SnsSpring33050Reporter");
    }

    public final void d(java.lang.String eventId) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportSnsUploadBtn", "com.tencent.mm.plugin.sns.spring.SnsSpring33050Reporter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventId, "eventId");
        java.lang.String l17 = ca4.z0.l();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSpring33050Reporter", "reportSnsUploadBtn >> " + eventId + " postSessionId: " + l17);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("sns_post_btn", eventId, kz5.b1.e(new jz5.l("post_session_id", l17)), 33050);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportSnsUploadBtn", "com.tencent.mm.plugin.sns.spring.SnsSpring33050Reporter");
    }

    public final void e(java.lang.String eventId, java.lang.String feedId, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 comment, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportSnsYearCallBtn", "com.tencent.mm.plugin.sns.spring.SnsSpring33050Reporter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventId, "eventId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedId, "feedId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comment, "comment");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSpring33050Reporter", "reportSnsYearCallBtn >> feedId: " + feedId + " eventId: " + eventId + " isWished: " + z17);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("pay_new_year_call", eventId, kz5.c1.k(new jz5.l("sns_feed_id", feedId), new jz5.l("sns_notice_usr", comment.f67471x114ef53e), new jz5.l("sns_notice_cid", java.lang.String.valueOf(comment.S)), new jz5.l("return_state", java.lang.Integer.valueOf(z17 ? 1 : 0))), 33050);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportSnsYearCallBtn", "com.tencent.mm.plugin.sns.spring.SnsSpring33050Reporter");
    }

    public final void f(java.lang.String eventId, java.lang.String feedId, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 comment, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportSnsYearCallMsg", "com.tencent.mm.plugin.sns.spring.SnsSpring33050Reporter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventId, "eventId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedId, "feedId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comment, "comment");
        if (comment.f67472x2262335f == 22) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSpring33050Reporter", "reportSnsYearCallMsg >> feedId: " + feedId + " eventId: " + eventId);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("pay_new_year_call_msg", eventId, kz5.c1.k(new jz5.l("sns_feed_id", feedId), new jz5.l("sns_notice_usr", comment.f67471x114ef53e), new jz5.l("sns_notice_cid", java.lang.String.valueOf(comment.S)), new jz5.l("is_tag_expired", java.lang.Integer.valueOf(z17 ? 1 : 0))), 33050);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportSnsYearCallMsg", "com.tencent.mm.plugin.sns.spring.SnsSpring33050Reporter");
    }

    public final void g(java.lang.String eventId, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportWsFoldSettingActionSheet", "com.tencent.mm.plugin.sns.spring.SnsSpring33050Reporter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventId, "eventId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSpring33050Reporter", "reportWsFoldSettingActionSheet >> " + eventId + ", fold_btn_type >> " + i17);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("sns_fold_sheet_btn", eventId, kz5.b1.e(new jz5.l("fold_btn_type", java.lang.Integer.valueOf(i17))), 33050);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportWsFoldSettingActionSheet", "com.tencent.mm.plugin.sns.spring.SnsSpring33050Reporter");
    }
}
