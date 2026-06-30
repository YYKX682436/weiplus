package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class kj {

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.List f251168c = new java.util.ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f251169a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final android.app.Activity f251170b;

    public kj(android.app.Activity activity) {
        this.f251170b = activity;
    }

    public static boolean a(java.lang.String str, int i17, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initDataMediaList", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l1.b(str);
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsImageDialogShowerMgr", "[initDataMediaList] snsinfo is null! localId:%s index:%ss", str, java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initDataMediaList", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
            return false;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = b17.m70371x485d7();
        r45.a90 a90Var = m70371x485d7.f39014x86965dde;
        if (a90Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsImageDialogShowerMgr", "[initDataMediaList] timeline.ContentObj is null!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initDataMediaList", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
            return false;
        }
        if (a90Var.f451373h.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsImageDialogShowerMgr", "[initDataMediaList] timeline.ContentObj.MediaObjList.size() == 0");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initDataMediaList", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
            return false;
        }
        list.clear();
        java.util.Iterator it = m70371x485d7.f39014x86965dde.f451373h.iterator();
        int i18 = 0;
        while (it.hasNext()) {
            r45.jj4 jj4Var = (r45.jj4) it.next();
            list.add(jj4Var);
            if (i17 == i18 && !com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().A(jj4Var)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsImageDialogShowerMgr", "[initDataMediaList] is not exists");
                if (pc4.d.f434943a.k()) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6087xcdb0f307 c6087xcdb0f307 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6087xcdb0f307();
                    c6087xcdb0f307.f136365g.f89113a = ca4.z0.t0(b17.f68891x29d1292e);
                    c6087xcdb0f307.e();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initDataMediaList", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
                return false;
            }
            i18++;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initDataMediaList", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
        return true;
    }

    public static void c(android.app.Activity activity, android.content.Intent intent, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj ojVar, int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k4 k4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] intent is null!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
            return;
        }
        if (k4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] snsContext is null!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
            return;
        }
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] info is null!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
            return;
        }
        gm0.j1.i();
        if (!gm0.j1.u().l()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] is not SDCardAvailable");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
            return;
        }
        java.lang.String str = ojVar.f251635a;
        int i19 = ojVar.f251636b;
        int i27 = ojVar.f251637c;
        r45.a90 a90Var = c17933xe8d1b226.m70371x485d7().f39014x86965dde;
        if (a90Var == null || a90Var.f451373h.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] is ContentObj null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
            return;
        }
        if (k4Var.a() != null) {
            k4Var.a().e(c17933xe8d1b226);
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = c17933xe8d1b226.m70371x485d7();
        r45.jj4 jj4Var = i19 < m70371x485d7.f39014x86965dde.f451373h.size() ? (r45.jj4) m70371x485d7.f39014x86965dde.f451373h.get(i19) : new r45.jj4();
        if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().A(jj4Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] media[%s] is illegal", java.lang.Integer.valueOf(jj4Var.f459403s));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
            return;
        }
        if (i17 == 1) {
            m21.w.d(716);
        } else {
            m21.w.c(716);
        }
        ca4.z0.T(c17933xe8d1b226);
        c17933xe8d1b226.m70377x3172ed();
        c17933xe8d1b226.m70375x338a8cc7();
        java.lang.String str2 = jj4Var.f459388d;
        m70371x485d7.f39014x86965dde.f451373h.size();
        m21.w d17 = i17 == 1 ? m21.w.d(744) : m21.w.c(744);
        ca4.z0.T(c17933xe8d1b226);
        c17933xe8d1b226.m70377x3172ed();
        c17933xe8d1b226.m70375x338a8cc7();
        d17.g(intent);
        intent.putExtra("sns_soon_enter_photoedit_ui", true);
        intent.putExtra("sns_gallery_localId", str);
        intent.putExtra("sns_gallery_position", i19);
        intent.putExtra("sns_position", i27);
        intent.putExtra("sns_gallery_showtype", 1);
        intent.putExtra("K_ad_scene", i17);
        intent.putExtra("K_ad_source", i18);
        intent.putExtra("k_is_from_sns_main_timeline", true);
        if (i17 == -1) {
            intent.putExtra("key_from_scene", 3);
        } else if (i17 == 1) {
            intent.putExtra("key_from_scene", 1);
        } else if (i17 == 2) {
            intent.putExtra("key_from_scene", 2);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("stat_scene", 3);
        bundle.putString("stat_msg_id", "sns_" + ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e));
        bundle.putString("stat_send_msg_user", c17933xe8d1b226.m70374x6bf53a6c());
        bundle.putInt("pay_qrcode_session_type", 3);
        bundle.putString("pay_qrcode_session_name", c17933xe8d1b226.m70374x6bf53a6c());
        bundle.putString("pay_qrcode_timeline_objid", ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e));
        bundle.putString("pay_qrcode_sender_username", c17933xe8d1b226.m70374x6bf53a6c());
        intent.putExtra("_stat_obj", bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18016xf3330816.w7(activity, intent, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
    }

    public void b(java.lang.String str, r45.jj4 jj4Var, java.lang.String str2, int i17, long j17, int[] iArr, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showCommentImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
        gm0.j1.i();
        if (!gm0.j1.u().l()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] isSDCardAvailable:false");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showCommentImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_from_scene", 8);
        try {
            intent.putExtra("K_media_obj", jj4Var.mo14344x5f01b1f6());
        } catch (java.lang.Exception unused) {
        }
        intent.putExtra("sns_gallery_showtype", 1);
        intent.putExtra("K_ad_scene", 8);
        intent.putExtra("K_source", 8);
        intent.putExtra("K_ad_source", i17);
        intent.putExtra("sns_gallery_userName", str2);
        int i27 = iArr[0];
        int i28 = iArr[1];
        intent.putExtra("sns_gallery_thumb_location", new android.graphics.Rect(i27, i28, i18 + i27, i19 + i28));
        intent.putExtra("sns_ad_exposure_start_time", j17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18016xf3330816.w7(this.f251170b, intent, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showCommentImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
    }

    public void d(android.view.View view, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
        e(view, i17, i18, null, 0L, false, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
    }

    public void e(android.view.View view, int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l7 l7Var, long j17, boolean z17, int i19) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.SnsImageDialogShowerMgr", "showImg", new java.lang.Object[0]);
        if (view == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] view is null! scene:%s", java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
            return;
        }
        java.lang.Object tag = view.getTag();
        if (tag instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj ojVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj) tag;
            java.lang.String str5 = ojVar.f251635a;
            int i27 = ojVar.f251636b;
            int i28 = ojVar.f251637c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isForbidAccess", "com.tencent.mm.plugin.sns.ui.SnsImageViewTag");
            boolean z18 = ojVar.f251639e == 2;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isForbidAccess", "com.tencent.mm.plugin.sns.ui.SnsImageViewTag");
            java.util.List list = this.f251169a;
            if (!a(str5, i27, list)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] initDataMediaList, localId:%s position:%s", str5, java.lang.Integer.valueOf(i27));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
                return;
            }
            gm0.j1.i();
            if (!gm0.j1.u().l()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] isSDCardAvailable:false");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l1.b(str5);
            if (!a(str5, i27, list)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] initDataMediaList, localId:%s position:%s", str5, java.lang.Integer.valueOf(i27));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            if (b17 != null) {
                if (l7Var != null) {
                    l7Var.a().e(b17);
                }
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = b17.m70371x485d7();
                r45.jj4 jj4Var = ojVar.f251636b < m70371x485d7.f39014x86965dde.f451373h.size() ? (r45.jj4) m70371x485d7.f39014x86965dde.f451373h.get(ojVar.f251636b) : new r45.jj4();
                if (i17 == 1) {
                    m21.w.d(716);
                } else {
                    m21.w.c(716);
                }
                ca4.z0.T(b17);
                b17.m70377x3172ed();
                b17.m70375x338a8cc7();
                java.lang.String str6 = jj4Var.f459388d;
                m70371x485d7.f39014x86965dde.f451373h.size();
                m21.w d17 = i17 == 1 ? m21.w.d(744) : m21.w.c(744);
                ca4.z0.T(b17);
                b17.m70377x3172ed();
                b17.m70375x338a8cc7();
                d17.g(intent);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("stat_scene", 3);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sns_");
                str3 = "showImg";
                str4 = "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr";
                sb6.append(ca4.z0.t0(b17.f68891x29d1292e));
                bundle.putString("stat_msg_id", sb6.toString());
                bundle.putString("stat_send_msg_user", b17.m70374x6bf53a6c());
                bundle.putInt("pay_qrcode_session_type", 3);
                bundle.putString("pay_qrcode_sender_username", b17.m70374x6bf53a6c());
                bundle.putString("pay_qrcode_session_name", b17.m70374x6bf53a6c());
                bundle.putString("pay_qrcode_timeline_objid", ca4.z0.t0(b17.f68891x29d1292e));
                intent.putExtra("_stat_obj", bundle);
            } else {
                str3 = "showImg";
                str4 = "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] info is null!");
            }
            int[] iArr = new int[2];
            if (com.p314xaae8f345.mm.ui.bk.y()) {
                view.getLocationOnScreen(iArr);
            } else {
                view.getLocationInWindow(iArr);
            }
            int width = view.getWidth();
            int height = view.getHeight();
            if (i17 == -1) {
                intent.putExtra("k_is_from_sns_msg_ui", true);
            }
            if (i17 == -1) {
                intent.putExtra("key_from_scene", 3);
            } else if (i17 == 1) {
                intent.putExtra("key_from_scene", 1);
            } else if (i17 == 2) {
                intent.putExtra("key_from_scene", 2);
            }
            intent.putExtra("sns_gallery_localId", str5);
            intent.putExtra("sns_gallery_position", i27);
            intent.putExtra("sns_position", i28);
            intent.putExtra("sns_gallery_showtype", 1);
            intent.putExtra("K_ad_scene", i17);
            intent.putExtra("K_source", i17);
            intent.putExtra("K_ad_source", i18);
            intent.putExtra("k_is_from_sns_main_timeline", ojVar.f251638d);
            int i29 = iArr[0];
            int i37 = iArr[1];
            intent.putExtra("sns_gallery_thumb_location", new android.graphics.Rect(i29, i37, width + i29, height + i37));
            intent.putExtra("sns_ad_exposure_start_time", j17);
            intent.putExtra("k_forbid_access", z18);
            intent.putExtra("k_feedid_need_check_forbid_access", ojVar.f251640f);
            if (z17) {
                android.app.Activity activity = this.f251170b;
                int i38 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18016xf3330816.Q1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startActivityForResult", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("prepare", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
                intent.setClass(activity, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18016xf3330816.class);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("prepare", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i19));
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsBrowseUI", "startActivityForResult", "(Landroid/app/Activity;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startActivityForResult", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18016xf3330816.w7(this.f251170b, intent, null);
            }
            str = str3;
            str2 = str4;
        } else {
            str = "showImg";
            str2 = "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
    }
}
