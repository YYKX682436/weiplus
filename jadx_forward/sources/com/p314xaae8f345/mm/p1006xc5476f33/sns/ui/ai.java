package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public final class ai {
    public ai(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.view.View view, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindCommentDetailEcsImageFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindCommentDetailEcsImageFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
            return;
        }
        r45.a90 a90Var = c17933xe8d1b226.m70371x485d7().f39014x86965dde;
        if (((a90Var == null || (linkedList2 = a90Var.f451373h) == null) ? 0 : linkedList2.size()) <= i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsEcsUploadHelper", "bindCommentDetailEcsMediaFeedReportInfo remove bind esc report " + view.hashCode());
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).xj(view);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindCommentDetailEcsImageFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
            return;
        }
        r45.a90 a90Var2 = c17933xe8d1b226.m70371x485d7().f39014x86965dde;
        r45.jj4 jj4Var = (a90Var2 == null || (linkedList = a90Var2.f451373h) == null) ? null : (r45.jj4) linkedList.get(i17);
        if (jj4Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindCommentDetailEcsImageFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
            return;
        }
        r45.h96 h96Var = jj4Var.f459409x0;
        g(view, h96Var != null ? h96Var.f457501g : null, c17933xe8d1b226.m70374x6bf53a6c(), ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindCommentDetailEcsImageFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
    }

    public final void b(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindCommentDetailEcsVideoFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindCommentDetailEcsVideoFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
            return;
        }
        r45.a90 a90Var = c17933xe8d1b226.m70371x485d7().f39014x86965dde;
        r45.lh0 lh0Var = a90Var != null ? a90Var.F : null;
        if (lh0Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindCommentDetailEcsVideoFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
            return;
        }
        java.util.Map k17 = kz5.c1.k(new jz5.l("sns_feed_id", ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e)), new jz5.l("sns_scene", 3), new jz5.l("sns_goods_name", lh0Var.f461007e), new jz5.l("sns_goods_id", lh0Var.f461008f), new jz5.l("sessionid_sns", ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni()));
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view, "sns_goods_video_btn");
        aVar.gk(view, k17);
        aVar.ik(view, 40, 33050);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindCommentDetailEcsVideoFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
    }

    public final void c(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindEcsViewReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindEcsViewReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
            return;
        }
        r45.lh0 lh0Var = c17933xe8d1b226.m70371x485d7().f39014x86965dde.F;
        java.util.Map k17 = kz5.c1.k(new jz5.l("sns_objecttype", java.lang.Integer.valueOf(c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e)), new jz5.l("username_sns", c17933xe8d1b226.m70374x6bf53a6c()), new jz5.l("publishid_sns", ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e)), new jz5.l("sns_feed_source", 4), new jz5.l("feed_tail_url", lh0Var.f461009g), new jz5.l("feed_tail_txt", lh0Var.f461007e), new jz5.l("sns_scene", java.lang.Integer.valueOf(i17)), new jz5.l("sns_goods_name", lh0Var.f461007e), new jz5.l("sns_goods_id", lh0Var.f461008f), new jz5.l("sessionid_sns", ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni()), new jz5.l("ecs_report_data", lh0Var.f461011i));
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view, "sns_feed_tail");
        aVar.gk(view, k17);
        aVar.ik(view, 40, 33050);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindEcsViewReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
    }

    public final void d(android.view.View view, int i17, xc4.p pVar) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindTimelineEcsImageFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindTimelineEcsImageFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
            return;
        }
        if (pVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindTimelineEcsImageFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
            return;
        }
        r45.a90 a90Var = pVar.h1().f39014x86965dde;
        if (((a90Var == null || (linkedList2 = a90Var.f451373h) == null) ? 0 : linkedList2.size()) <= i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsEcsUploadHelper", "bindTimelineEcsImageFeedReportInfo remove bind esc report " + view.hashCode());
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).xj(view);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindTimelineEcsImageFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
            return;
        }
        r45.a90 a90Var2 = pVar.h1().f39014x86965dde;
        r45.jj4 jj4Var = (a90Var2 == null || (linkedList = a90Var2.f451373h) == null) ? null : (r45.jj4) linkedList.get(i17);
        if (jj4Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindTimelineEcsImageFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
            return;
        }
        r45.h96 h96Var = jj4Var.f459409x0;
        g(view, h96Var != null ? h96Var.f457501g : null, pVar.m125483x6bf53a6c(), pVar.a1());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindTimelineEcsImageFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
    }

    public final void e(android.view.View view, xc4.p pVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindTimelineEcsVideoFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (pVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindTimelineEcsVideoFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
            return;
        }
        r45.a90 a90Var = pVar.h1().f39014x86965dde;
        r45.lh0 lh0Var = a90Var != null ? a90Var.F : null;
        if (lh0Var == null) {
            view.hashCode();
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).xj(view);
        } else {
            view.hashCode();
            java.util.Map k17 = kz5.c1.k(new jz5.l("sns_feed_id", pVar.a1()), new jz5.l("sns_scene", 1), new jz5.l("sns_goods_name", lh0Var.f461007e), new jz5.l("sns_goods_id", lh0Var.f461008f), new jz5.l("sessionid_sns", ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni()));
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(view, "sns_goods_video_btn");
            aVar.gk(view, k17);
            aVar.ik(view, 40, 33050);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindTimelineEcsVideoFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
    }

    public final void f(android.view.View view, int i17, r45.lh0 lh0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindUploadUIEcsViewReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (lh0Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindUploadUIEcsViewReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
            return;
        }
        java.lang.Object l17 = gm0.j1.u().c().l(2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(l17, "null cannot be cast to non-null type kotlin.String");
        java.util.Map k17 = kz5.c1.k(new jz5.l("sns_objecttype", java.lang.Integer.valueOf(i17)), new jz5.l("username_sns", (java.lang.String) l17), new jz5.l("publishid_sns", ""), new jz5.l("sns_feed_source", 4), new jz5.l("feed_tail_url", lh0Var.f461009g), new jz5.l("feed_tail_txt", lh0Var.f461007e), new jz5.l("sns_scene", 4), new jz5.l("sns_goods_name", lh0Var.f461007e), new jz5.l("sns_goods_id", lh0Var.f461008f), new jz5.l("sessionid_sns", ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni()));
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view, "sns_feed_tail");
        aVar.gk(view, k17);
        aVar.ik(view, 40, 33050);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindUploadUIEcsViewReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
    }

    public final void g(android.view.View view, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("commonBindEcsMediaFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
        if (str3 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("commonBindEcsMediaFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            view.hashCode();
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).xj(view);
        } else {
            java.util.Map l17 = kz5.c1.l(new jz5.l("card_id", str3), new jz5.l("shareUsername", str2), new jz5.l("biz_report_data", str), new jz5.l("share_scene", "3"));
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(view, "ecs_card_action");
            aVar.gk(view, l17);
            aVar.Tj(view, 40, 12, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("commonBindEcsMediaFeedReportInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
    }

    public final r45.h96 h(android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initSnsMediaEcsInfoByIntent", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        byte[] d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.d(intent, "sns_ecs_share_info");
        if (d17 != null) {
            if (!(d17.length == 0)) {
                try {
                    r45.lh0 lh0Var = new r45.lh0();
                    lh0Var.mo11468x92b714fd(d17);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lh0Var.f461008f)) {
                        r45.h96 h96Var = new r45.h96();
                        h96Var.f457498d = lh0Var.f461008f;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initSnsMediaEcsInfoByIntent", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
                        return h96Var;
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsEcsUploadHelper", "initSnsMediaEcsInfoByIntent exp:%s", e17.getLocalizedMessage());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initSnsMediaEcsInfoByIntent", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
                return null;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsEcsUploadHelper", "initSnsMediaEcsInfoByIntent invalid KEcsShareInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initSnsMediaEcsInfoByIntent", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
        return null;
    }

    public final java.util.HashMap i(android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initSnsMediaEcsInfoMapByIntent", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        java.lang.String l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "sns_ecs_share_media_info_json_array");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MultiPicModelPc", "initSnsMediaEcsInfoByIntent invalid KEcsShareMediaInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initSnsMediaEcsInfoMapByIntent", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
            return null;
        }
        try {
            java.util.HashMap hashMap = new java.util.HashMap();
            cl0.e eVar = new cl0.e(l17);
            int mo15056xbe0e3ae6 = eVar.mo15056xbe0e3ae6();
            for (int i17 = 0; i17 < mo15056xbe0e3ae6; i17++) {
                cl0.g jSONObject = eVar.getJSONObject(i17);
                java.lang.String mo15082x48bce8a4 = jSONObject.mo15082x48bce8a4("localPath");
                r45.h96 h96Var = new r45.h96();
                int i18 = 1;
                h96Var.f457499e = jSONObject.mo15080xc3ca103c("bizType", 1);
                h96Var.f457500f = jSONObject.mo15082x48bce8a4("ecsJumpInfoBase64");
                h96Var.f457501g = jSONObject.mo15082x48bce8a4("reportData");
                if (!jSONObject.optBoolean("showDetailBtn")) {
                    i18 = 0;
                }
                h96Var.f457502h = i18;
                hashMap.put(mo15082x48bce8a4, h96Var);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initSnsMediaEcsInfoMapByIntent", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
            return hashMap;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MultiPicModelPc", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initSnsMediaEcsInfoMapByIntent", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper$Companion");
            return null;
        }
    }
}
