package ee0;

@j95.b
/* loaded from: classes4.dex */
public final class n4 extends i95.w implements fe0.k4 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f333029d = Zi();

    public void Ai(java.lang.String path, android.os.Bundle extraData, java.lang.String extraKey) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkEmotionSafeStrategyInfoList", "com.tencent.mm.feature.sns.SnsFeatureService");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraData, "extraData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraKey, "extraKey");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.g6.f245743a.c(path, extraData, extraKey);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkEmotionSafeStrategyInfoList", "com.tencent.mm.feature.sns.SnsFeatureService");
    }

    public java.lang.String Bi() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkSnsPostSessionId", "com.tencent.mm.feature.sns.SnsFeatureService");
        java.lang.String l17 = ca4.z0.l();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "checkSnsPostSessionId(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSnsPostSessionId", "com.tencent.mm.feature.sns.SnsFeatureService");
        return l17;
    }

    public boolean Di() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableCheckVideoThumbSize", "com.tencent.mm.feature.sns.SnsFeatureService");
        pc4.d dVar = pc4.d.f434943a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableVideoThumbSizeCheck", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_video_thumb_resize, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableVideoThumbSizeCheck", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableCheckVideoThumbSize", "com.tencent.mm.feature.sns.SnsFeatureService");
        return fj6;
    }

    public fe0.g4 Ni() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsCoverStg", "com.tencent.mm.feature.sns.SnsFeatureService");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.a2 Bj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Bj();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Bj, "getSnsCoverStg(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsCoverStg", "com.tencent.mm.feature.sns.SnsFeatureService");
        return Bj;
    }

    public jz5.l Ri() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsMediaPath", "com.tencent.mm.feature.sns.SnsFeatureService");
        jz5.l b17 = je4.c.f380850a.b();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsMediaPath", "com.tencent.mm.feature.sns.SnsFeatureService");
        return b17;
    }

    public boolean Ui(android.content.Context context, android.content.Intent intent, int i17, fe0.j4 j4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("jumpToSnsUI", "com.tencent.mm.feature.sns.SnsFeatureService");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (!gm0.j1.b().m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsFeatureService", null, "account has not Initialized", new java.lang.Object[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpToSnsUI", "com.tencent.mm.feature.sns.SnsFeatureService");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("useFlutter", "com.tencent.mm.feature.sns.SnsFeatureService");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("useFlutter", "com.tencent.mm.feature.sns.SnsFeatureService");
        android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
        intent2.putExtra("sns_enter_scene", i17);
        if (j4Var != null) {
            if (j4Var.f342937a) {
                intent2.addFlags(67108864);
            }
            intent2.putExtra("sns_timeline_NeedFirstLoadint", j4Var.f342938b);
            intent2.putExtra("enter_by_red", j4Var.f342939c);
            intent2.putExtra("sns_jump_timestamp", java.lang.System.currentTimeMillis());
            intent2.putExtra("is_sns_notify_open", j4Var.f342940d);
            intent2.putExtra("sns_unread_count", j4Var.f342941e);
            intent2.putExtra("is_need_resend_sns", j4Var.f342944h);
            if (!android.text.TextUtils.isEmpty(j4Var.f342942f)) {
                intent2.putExtra("new_feed_id", j4Var.f342942f);
            }
            intent2.putExtra("sns_resume_state", j4Var.f342943g);
            intent2.putExtra("sns_red_dot_info", j4Var.f342945i);
        }
        boolean Zi = Zi();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.SnsFeatureService", "enterScene:" + i17 + " data:" + j4Var + " use improve ui:" + Zi, new java.lang.Object[0]);
        if (Zi != this.f333029d) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.qj().a();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("preHandle", "com.tencent.mm.feature.sns.SnsFeatureService");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preHandle", "com.tencent.mm.feature.sns.SnsFeatureService");
        this.f333029d = Zi;
        pc4.d.f434943a.G();
        if (Zi) {
            if (!(context instanceof android.app.Activity)) {
                intent2.addFlags(268435456);
            }
            intent2.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.ActivityC18203x35bf69b5.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/sns/SnsFeatureService", "jumpToSnsUI", "(Landroid/content/Context;Landroid/content/Intent;ILcom/tencent/mm/feature/sns/api/ISnsFeatureService$SnsJumpData;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/feature/sns/SnsFeatureService", "jumpToSnsUI", "(Landroid/content/Context;Landroid/content/Intent;ILcom/tencent/mm/feature/sns/api/ISnsFeatureService$SnsJumpData;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            if (!(context instanceof android.app.Activity)) {
                intent2.addFlags(268435456);
            }
            intent2.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.ActivityC18203x35bf69b5.class);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/feature/sns/SnsFeatureService", "jumpToSnsUI", "(Landroid/content/Context;Landroid/content/Intent;ILcom/tencent/mm/feature/sns/api/ISnsFeatureService$SnsJumpData;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context, "com/tencent/mm/feature/sns/SnsFeatureService", "jumpToSnsUI", "(Landroid/content/Context;Landroid/content/Intent;ILcom/tencent/mm/feature/sns/api/ISnsFeatureService$SnsJumpData;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpToSnsUI", "com.tencent.mm.feature.sns.SnsFeatureService");
        return true;
    }

    public void Vi(android.content.Context context, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("jumpToSnsUITemp", "com.tencent.mm.feature.sns.SnsFeatureService");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_all_improve_ui_enable, true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFeatureService", "jumpToSnsUITemp new");
            Ui(context, intent, 0, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFeatureService", "jumpToSnsUITemp old");
            Ui(context, intent, 0, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpToSnsUITemp", "com.tencent.mm.feature.sns.SnsFeatureService");
    }

    public boolean Zi() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("useImproveSnsUI", "com.tencent.mm.feature.sns.SnsFeatureService");
        boolean z17 = false;
        if (!gm0.j1.b().m()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("useImproveSnsUI", "com.tencent.mm.feature.sns.SnsFeatureService");
            return false;
        }
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_USE_IMPROVEUI_INT_SYNC, 0);
        if (r17 != 1) {
            if (r17 != 2) {
                boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_improve_ui_enable, true);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("useImproveSnsUI", "com.tencent.mm.feature.sns.SnsFeatureService");
                return fj6;
            }
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("useImproveSnsUI", "com.tencent.mm.feature.sns.SnsFeatureService");
        return z17;
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAccountInitialized", "com.tencent.mm.feature.sns.SnsFeatureService");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("useFlutter", "com.tencent.mm.feature.sns.SnsFeatureService");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("useFlutter", "com.tencent.mm.feature.sns.SnsFeatureService");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAccountInitialized", "com.tencent.mm.feature.sns.SnsFeatureService");
    }

    public boolean wi() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("canSetFinderAsCover", "com.tencent.mm.feature.sns.SnsFeatureService");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("canSetFinderAsCover", "com.tencent.mm.plugin.sns.util.SetSnsBgFromFinderUtils");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_cover_enable, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canSetFinderAsCover", "com.tencent.mm.plugin.sns.util.SetSnsBgFromFinderUtils");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canSetFinderAsCover", "com.tencent.mm.feature.sns.SnsFeatureService");
        return fj6;
    }
}
