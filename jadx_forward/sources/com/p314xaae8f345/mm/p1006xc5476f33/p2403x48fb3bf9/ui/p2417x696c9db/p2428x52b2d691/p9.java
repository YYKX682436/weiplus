package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes11.dex */
public final class p9 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p9 f267967d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p9();

    public final void A(android.content.Context context) {
        j45.l.h(context, "account", ".security.ui.MySafeDeviceListUI");
    }

    public final void B(android.content.Context context) {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.t2) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k6.class))).wi(context, 16, false);
    }

    public final void C(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(268435456);
        if (((u24.h) ((ct.c3) i95.n0.c(ct.c3.class))).wi()) {
            intent.putExtra("key_config_item", "SettingGroup_Main_Notify");
            j45.l.j(context, "setting", ".ui.setting_new.CommonSettingsUI", intent, null);
            return;
        }
        intent.setClassName(context, "com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageMessageNotificationUIUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageMessageNotificationUIUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void D(android.content.Context context) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c01.z1.c()) || !com.p314xaae8f345.mm.p2621x8fb0427b.z3.P3(c01.z1.r()) || ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableModAlias", 0) != 0) {
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableModAlias", 0) != 0) {
                android.content.Intent intent = new android.content.Intent();
                intent.setClassName(context, "com.tencent.mm.plugin.setting.ui.setting.SettingsAliasUI");
                intent.putExtra("WizardRootClass", "com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI");
                intent.addFlags(268435456);
                com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(context, intent);
                return;
            }
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.setClassName(context, "com.tencent.mm.plugin.setting.ui.setting.SettingsCreateAliasUI");
        intent2.addFlags(268435456);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageModifyAliaseUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageModifyAliaseUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void E(android.content.Context context) {
        kd0.i2 i2Var = (kd0.i2) i95.n0.c(kd0.i2.class);
        c01.ka kaVar = new c01.ka(8);
        ((hs.d0) i2Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        e04.g2.a(context, kaVar);
    }

    public final void F(android.content.Context context) {
        if (!(bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20239x152d18ed()) == 1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenWeiXinPage", "goToPageNewfriendsUISuffix, [AddFriendVerifyRecordToCloud] goto FMessageConversationUI (old)");
            j45.l.j(context, "subapp", ".ui.friend.FMessageConversationUI", new android.content.Intent(), null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenWeiXinPage", "goToPageNewfriendsUISuffix, [AddFriendVerifyRecordToCloud] goto AddFriendVerifyRecordUI (new)");
            android.content.Intent intent = new android.content.Intent();
            lk5.s.e(intent, true);
            j45.l.j(context, "subapp", ".ui.friend.AddFriendVerifyRecordUI", intent, null);
        }
    }

    public final void G(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI");
        intent.putExtra("key_upload_scene", 4);
        intent.addFlags(268435456);
        com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(context, intent);
    }

    public final void H(android.content.Context context) {
        j45.l.j(context, "setting", ".ui.setting.SettingsAboutCamera", new android.content.Intent(), null);
    }

    public final void I(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent();
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        arrayList.add("labs_browse");
        intent.putStringArrayListExtra("key_exclude_apps", arrayList);
        intent.addFlags(268435456);
        ((ty4.q) ((uy4.x) i95.n0.c(uy4.x.class))).Bi(context, intent);
    }

    public final void J(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("k_sns_tag_id", 4L);
        intent.putExtra("k_sns_from_settings_about_sns", 1);
        intent.addFlags(268435456);
        intent.setClassName(context, "com.tencent.mm.ui.contact.privacy.SnsTagDetailUI");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPagePrivacyManageTimeLineBlockListUIUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPagePrivacyManageTimeLineBlockListUIUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void K(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(268435456);
        if (!((u24.h) ((ct.c3) i95.n0.c(ct.c3.class))).wi()) {
            j45.l.j(context, "setting", ".ui.setting.SettingsSnsPrivacyUI", intent, null);
        } else {
            intent.putExtra("key_config_item", "SettingGroup_Main_FriendPrivacy_PrivacySns");
            j45.l.j(context, "setting", ".ui.setting_new.CommonSettingsUI", intent, null);
        }
    }

    public final void L(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(268435456);
        if (!((u24.h) ((ct.c3) i95.n0.c(ct.c3.class))).wi()) {
            j45.l.j(context, "setting", ".ui.setting.SettingsPrivacyUI", intent, null);
        } else {
            intent.putExtra("key_config_item", "SettingGroup_Main_FriendPrivacy");
            j45.l.j(context, "setting", ".ui.setting_new.CommonSettingsUI", intent, null);
        }
    }

    public final void M(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", "qqmail");
        j45.l.j(context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
    }

    public final void N(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg");
        intent.putExtra("need_show_menu_choose", true);
        intent.addFlags(268435456);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageSetheadportraitUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageSetheadportraitUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void O(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.setting.ui.setting.SettingsActiveTimeUI");
        intent.addFlags(268435456);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageSettingsActiveTimeUIUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageSettingsActiveTimeUIUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void P(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.shake.ui.ShakePersonalInfoUI");
        intent.addFlags(268435456);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageShakeSettingsUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageShakeSettingsUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void Q(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(268435456);
        ((c34.b0) ((yd0.j) i95.n0.c(yd0.j.class))).wi(context, intent, true);
    }

    public final void R(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.clean.ui.fileindexui.CleanNewUI");
        intent.addFlags(268435456);
        intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 4);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageStorageManageUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageStorageManageUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void S(android.content.Context context) {
        boolean z17 = (c01.z1.n() & 32768) == 0;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenWeiXinPage", "goToPageTimelinePublishSuffix, enable = " + z17);
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.setFlags(268435456);
            intent.addFlags(67108864);
            intent.putExtra("sns_timeline_NeedFirstLoadint", true);
            intent.putExtra("sns_timeline_NeedShowPushlistDialog", true);
            ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Vi(context, intent);
        }
    }

    public final void T(android.content.Context context) {
        boolean z17 = (c01.z1.n() & 32768) == 0;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenWeiXinPage", "goToPageTimelinePublishSuffix, enable = " + z17);
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.setFlags(268435456);
            intent.addFlags(67108864);
            intent.putExtra("sns_timeline_NeedFirstLoadint", true);
            intent.putExtra("sns_timeline_NeedShowPulistText", true);
            ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Vi(context, intent);
        }
    }

    public final void U(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        intent.addFlags(268435456);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageTimelineSetbackgroundCoverUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageTimelineSetbackgroundCoverUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void V(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.dbbackup.DBRecoveryUI");
        intent.addFlags(268435456);
        intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 3);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageToolRecoverSuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageToolRecoverSuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void W(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI");
        intent.addFlags(268435456);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageVersionUpdateSuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageVersionUpdateSuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void X(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.setting.ui.setting.SettingsModifyPatSuffixUI");
        intent.addFlags(268435456);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToSetPatSuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToSetPatSuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final boolean Y(java.lang.String str, boolean z17, android.os.Bundle bundle) {
        java.lang.String str2;
        boolean z18;
        try {
            android.content.Context b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getContext(...)");
            android.net.Uri parse = android.net.Uri.parse(str);
            if (z17) {
                str2 = str != null ? str : "";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenWeiXinPage", "handlePageUrl pagePath:".concat(str2));
            } else {
                java.lang.String scheme = parse.getScheme();
                str2 = parse.getHost() + parse.getPath();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenWeiXinPage", "handlePageUrl scheme:" + scheme + " pagePath:" + str2 + " query:" + parse.getQuery());
            }
            if (r26.i0.p(str2, "page/wesport", true)) {
                a0(b17, "gh_43f2581f6fd6");
            } else if (r26.i0.p(str2, "page/wechatteam", true)) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Chat_User", "weixin");
                intent.putExtra("finish_direct", true);
                intent.putExtra("specific_chat_from_scene", 3);
                intent.putExtra("preChatTYPE", 9);
                intent.putExtra("chat_from_scene", 5);
                j45.l.t(b17, ".ui.chatting.ChattingUI", intent);
            } else if (r26.i0.p(str2, "page/masssend", true)) {
                if (c01.z1.x()) {
                    Z(b17);
                } else if (c01.z1.D()) {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("finish_direct", true);
                    j45.l.i(b17, "masssend", ".ui.MassSendHistoryUI", intent2);
                } else {
                    j45.l.i(b17, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", "masssendapp"));
                }
            } else if (r26.i0.p(str2, "page/groups", true)) {
                android.content.Intent intent3 = new android.content.Intent();
                intent3.setClassName(b17, "com.tencent.mm.ui.contact.ChatroomContactUI");
                intent3.addFlags(268435456);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent3);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(b17, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;ZLandroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                b17.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(b17, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;ZLandroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (r26.i0.p(str2, "page/textsize", true)) {
                android.content.Intent intent4 = new android.content.Intent();
                intent4.setClassName(b17, "com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI");
                intent4.addFlags(268435456);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent4);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(b17, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;ZLandroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                b17.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(b17, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;ZLandroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (r26.i0.p(str2, "page/securitycenter", true)) {
                g(b17);
            } else if (r26.i0.p(str2, "page/contactblacklist", true)) {
                e(b17);
            } else if (r26.i0.p(str2, "page/EmojiStorev2", true)) {
                android.content.Intent intent5 = new android.content.Intent();
                intent5.setClassName(b17, "com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2UI");
                intent5.addFlags(268435456);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(intent5);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(b17, arrayList3.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;ZLandroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                b17.startActivity((android.content.Intent) arrayList3.get(0));
                yj0.a.f(b17, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;ZLandroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (r26.i0.p(str2, "page/Sns", true)) {
                fe0.j4 j4Var = new fe0.j4(false, false, false, false, 0, null, false, false, null, 511, null);
                android.content.Intent intent6 = new android.content.Intent();
                intent6.addFlags(268435456);
                j4Var.a(true);
                j4Var.c(false);
                j4Var.d(false);
                j4Var.b(false);
                ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Ui(b17, intent6, 2, j4Var);
            } else if (r26.i0.p(str2, "page/SafetyLock", true)) {
                ((h45.q) i95.n0.c(h45.q.class)).mo24844x9e1fd675(b17, new android.content.Intent());
            } else if (r26.i0.p(str2, "page/TingMusic", true)) {
                bw5.ar0 ar0Var = bw5.ar0.TingScene_LocalSearchMusicTab;
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putInt("key_enter_tab", 1);
                il4.e eVar = new il4.e(null, 0, 0, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554431, null);
                eVar.a(ar0Var.mo11476x276ffe3f());
                i95.m c17 = i95.n0.c(qk.g9.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                rk4.z8 z8Var = (rk4.z8) ((qk.g9) c17);
                ((rk4.k8) z8Var.aj()).L(true);
                ((rk4.k8) z8Var.aj()).N(false);
                ((rk4.k8) z8Var.aj()).y(b17, bundle2, ar0Var, eVar, null);
            } else if (r26.i0.p(str2, "page/TingAudio", true)) {
                bw5.ar0 ar0Var2 = bw5.ar0.TingScene_LocalSearchAudioTab;
                android.os.Bundle bundle3 = new android.os.Bundle();
                bundle3.putInt("key_enter_tab", 2);
                il4.e eVar2 = new il4.e(null, 0, 0, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554431, null);
                eVar2.a(ar0Var2.mo11476x276ffe3f());
                i95.m c18 = i95.n0.c(qk.g9.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                rk4.z8 z8Var2 = (rk4.z8) ((qk.g9) c18);
                ((rk4.k8) z8Var2.aj()).L(true);
                ((rk4.k8) z8Var2.aj()).N(false);
                ((rk4.k8) z8Var2.aj()).y(b17, bundle3, ar0Var2, eVar2, null);
            } else if (r26.i0.p(str2, "page/CustomerServiceMsg", true)) {
                android.content.Intent intent7 = new android.content.Intent();
                intent7.putExtra("Contact_User", "opencustomerservicemsg");
                intent7.putExtra("open_im_kefu_jump_chatting", true);
                intent7.putExtra("open_im_kefu_conversation_list_ui_from_scene", 2);
                intent7.addFlags(67108864);
                j45.l.t(b17, ".ui.conversation.OpenImKefuServiceConversationUI", intent7);
            } else if (r26.i0.p(str2, "page/NearBy", true)) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.DiscoveryNearby.j(b17)) {
                    j45.l.h(b17, "nearby", ".ui.NearbyFriendsUI");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenWeiXinPage", "PAGE_NEARBY, disable.");
                    Z(b17);
                }
            } else if (r26.i0.p(str2, "page/AAPay", true)) {
                android.content.Intent intent8 = new android.content.Intent();
                intent8.putExtra("enter_scene", 2);
                j45.l.i(b17, "aa", ".ui.AAEntranceUI", intent8);
            } else if (r26.i0.p(str2, "page/TencentNews", true)) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.a9.a();
                if (yp5.a.f545942a.a()) {
                    android.content.Intent intent9 = new android.content.Intent();
                    intent9.addFlags(67108864);
                    intent9.putExtra("type", 20);
                    j45.l.i(b17, "readerapp", ".ui.ReaderAppUI", intent9);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenWeiXinPage", "PAGE_TENCENTNEWS, disable.");
                    Z(b17);
                }
            } else if (r26.i0.p(str2, "page/SubscribeAccount", true)) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.HomeServiceOa.j(b17)) {
                    android.content.Intent intent10 = new android.content.Intent();
                    intent10.putExtra("biz_enter_source", 2);
                    intent10.putExtra("KOpenArticleSceneFromScene", 7);
                    if (z40.e.l4() && ((y40.i0) z40.e.get()).Di()) {
                        ((y40.i0) z40.e.get()).Bi(b17, intent10);
                    } else if (((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).Zi()) {
                        ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).Vi(b17, intent10);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenWeiXinPage", "PAGE_SUBSCRIBEACCOUNT, disable.");
                        Z(b17);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenWeiXinPage", "PAGE_SUBSCRIBEACCOUNT, disable.");
                    Z(b17);
                }
            } else if (!r26.i0.p(str2, "page/CollectQrCode", true)) {
                if (r26.i0.p(str2, "page/BaseScan", true)) {
                    if (!iq.b.g(b17) && !iq.b.v(b17) && !iq.b.e(b17)) {
                        android.content.Intent intent11 = new android.content.Intent();
                        intent11.putExtra("BaseScanUI_qrcode_right_btn_direct_album", true);
                        intent11.putExtra("key_scan_report_enter_scene", 5);
                        intent11.putExtra("key_config_black_interval", true);
                        intent11.putExtra("key_enable_multi_code", true);
                        intent11.putExtra("key_scan_goods_enable_dynamic_wording", true);
                        j45.l.i(b17, "scanner", ".ui.BaseScanUI", intent11);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenWeiXinPage", "PAGE_PAGE_BASESCAN, disable.");
                } else if (r26.i0.p(str2, "page/FixTool", true)) {
                    android.content.Intent intent12 = new android.content.Intent();
                    intent12.setClassName(b17, "com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUI");
                    intent12.putExtra("entry_fix_tools", 1);
                    intent12.addFlags(268435456);
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(intent12);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(b17, arrayList4.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;ZLandroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    b17.startActivity((android.content.Intent) arrayList4.get(0));
                    yj0.a.f(b17, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;ZLandroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else if (r26.i0.p(str2, "page/WCPayCollAssist", true)) {
                    a0(b17, "gh_f0a92aa7146c");
                } else if (r26.i0.p(str2, "page/WCPay", true)) {
                    a0(b17, "gh_3dfda90e39d6");
                } else if (r26.i0.p(str2, "page/wegame", true)) {
                    a0(b17, "gh_25d9ac85a4bc");
                } else if (r26.i0.p(str2, "page/ServiceMsg", true)) {
                    a0(b17, "notifymessage");
                } else if (r26.i0.p(str2, "page/Recharge", true)) {
                    ((h45.q) i95.n0.c(h45.q.class)).mo24841xd6f21ffb(b17);
                } else if (r26.i0.p(str2, "page/ZeroMoney", true)) {
                    ((h45.q) i95.n0.c(h45.q.class)).mo24838x4e268286(b17);
                } else if (r26.i0.p(str2, "page/ZeroMoneyUse", true)) {
                    ((h45.q) i95.n0.c(h45.q.class)).mo24812x391b2a71(b17);
                } else if (r26.i0.p(str2, "page/Wallet", true)) {
                    ((h45.q) i95.n0.c(h45.q.class)).mo24837xef221a95("walletUseCase", com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc(), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.j9.f267820a);
                } else {
                    if (r26.i0.p(str2, "page/FetchMoney", true)) {
                        ((h45.q) i95.n0.c(h45.q.class)).mo24839x9afc1e2f(b17, null);
                    } else if (r26.i0.p(str2, "page/BankCard", true)) {
                        ((h45.q) i95.n0.c(h45.q.class)).mo24837xef221a95("bankCard", com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc(), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.k9.f267850a);
                    } else if (r26.i0.p(str2, "page/HoneyPay", true)) {
                        ((h45.q) i95.n0.c(h45.q.class)).mo24837xef221a95("HoneyPayPayerUseCase", com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc(), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.l9.f267876a);
                    } else if (!r26.i0.p(str2, "page/PayQrCode", true)) {
                        if (r26.i0.p(str2, "page/darkmode", true)) {
                            f(b17);
                        } else if (r26.i0.p(str2, "page/aboutversion", true)) {
                            h(b17);
                        } else if (r26.i0.p(str2, "page/globalsearch", true)) {
                            ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).Ai(b17, ".ui.FTSMainUI", new android.content.Intent(), null);
                        } else if (r26.i0.p(str2, "page/chatlogmigrate", true)) {
                            ((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).cj(b17, mv.a.f413005h);
                        } else if (r26.i0.p(str2, "page/chatlog", true)) {
                            android.content.Intent className = new android.content.Intent().setClassName(b17, "com.tencent.mm.plugin.backup.backupui.BackupChooseBackupModeUI");
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(className, "setClassName(...)");
                            className.addFlags(268435456);
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            arrayList5.add(className);
                            java.util.Collections.reverse(arrayList5);
                            yj0.a.d(b17, arrayList5.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;ZLandroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            b17.startActivity((android.content.Intent) arrayList5.get(0));
                            yj0.a.f(b17, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;ZLandroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        } else if (r26.i0.p(str2, "page/chatbackground", true)) {
                            android.content.Intent intent13 = new android.content.Intent();
                            intent13.setClassName(b17, "com.tencent.mm.plugin.setting.ui.setting.SettingsChattingBackgroundUI");
                            intent13.addFlags(268435456);
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            arrayList6.add(intent13);
                            java.util.Collections.reverse(arrayList6);
                            yj0.a.d(b17, arrayList6.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;ZLandroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            b17.startActivity((android.content.Intent) arrayList6.get(0));
                            yj0.a.f(b17, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;ZLandroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        } else if (r26.i0.p(str2, "page/setpat", true)) {
                            X(b17);
                        } else if (r26.i0.p(str2, "page/channel/publish", true)) {
                            p(b17);
                        } else if (r26.i0.p(str2, "page/tool/recover", true)) {
                            V(b17);
                        } else if (r26.i0.p(str2, "page/fileHelper", true)) {
                            x(b17);
                        } else if (r26.i0.p(str2, "page/contact/faceToFaceCreateRoom", true)) {
                            u(b17);
                        } else if (r26.i0.p(str2, "page/deeplink/groupchat", true)) {
                            r(b17);
                        } else if (r26.i0.p(str2, "page/tool/discoverPageManage", true)) {
                            y(b17);
                        } else if (r26.i0.p(str2, "page/contacts", true)) {
                            i(b17);
                        } else if (r26.i0.p(str2, "page/tool/bindPhoneNumber", true)) {
                            G(b17);
                        } else if (r26.i0.p(str2, "page/deeplink/setname", true)) {
                            s(b17);
                        } else if (r26.i0.p(str2, "page/versionUpdate", true)) {
                            W(b17);
                        } else if (r26.i0.p(str2, "page/aboutWeChat", true)) {
                            W(b17);
                        } else if (r26.i0.p(str2, "page/brandService", true)) {
                            n(b17);
                        } else if (r26.i0.p(str2, "page/timeline/publish", true)) {
                            S(b17);
                        } else if (r26.i0.p(str2, "page/contact/tagList", true)) {
                            q(b17);
                        } else if (r26.i0.p(str2, "page/contact/addFriend", true)) {
                            k(b17);
                        } else if (r26.i0.p(str2, "page/channel/auth", true)) {
                            o(b17);
                        } else if (r26.i0.p(str2, "page/favorites", true)) {
                            w(b17);
                        } else if (r26.i0.p(str2, "page/Favorites/NewWeNote", true)) {
                            v(b17);
                        } else if (r26.i0.p(str2, "page/modifyAliase", true)) {
                            D(b17);
                        } else if (r26.i0.p(str2, "page/setHeadPortrait", true)) {
                            N(b17);
                        } else if (r26.i0.p(str2, "page/storageManage", true)) {
                            R(b17);
                        } else if (r26.i0.p(str2, "page/newFriends", true)) {
                            F(b17);
                        } else if (r26.i0.p(str2, "page/settingsActiveTimeUI", true)) {
                            O(b17);
                        } else if (r26.i0.p(str2, "page/privacyManage", true)) {
                            L(b17);
                        } else if (r26.i0.p(str2, "page/privacyManage/timeline", true)) {
                            K(b17);
                        } else if (r26.i0.p(str2, "page/privacyManage/timeline/blackList", true)) {
                            J(b17);
                        } else if (r26.i0.p(str2, "page/deeplink/settings", true)) {
                            t(b17);
                        } else if (r26.i0.p(str2, "page/setting/photosVideosFilesCalls", true)) {
                            H(b17);
                        } else if (r26.i0.p(str2, "page/messageNotification", true)) {
                            C(b17);
                        } else if (r26.i0.p(str2, "page/bindPhoneInfo", true)) {
                            m(b17);
                        } else if (r26.i0.p(str2, "page/timeline/publishText", true)) {
                            T(b17);
                        } else if (r26.i0.p(str2, "page/loginDeviceManage", true)) {
                            A(b17);
                        } else if (r26.i0.p(str2, "page/bindQQ", true)) {
                            l(b17);
                        } else if (r26.i0.p(str2, "page/shake", true)) {
                            Q(b17);
                        } else if (r26.i0.p(str2, "page/shake/setting", true)) {
                            P(b17);
                        } else if (r26.i0.p(str2, "page/miniProgram", true)) {
                            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6019x2a86117b c6019x2a86117b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6019x2a86117b();
                            c6019x2a86117b.f136312g.f88995a = true;
                            c6019x2a86117b.e();
                            boolean z19 = c6019x2a86117b.f136313h.f89109a;
                            boolean z27 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7() && ((uh4.c0) i95.n0.c(uh4.c0.class)).G8() == 2;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenWeiXinPage", "shouldShowMiniProgram %s, isTeenModeAndNotAccessRight:%s", java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z27));
                            if (z19 && !z27) {
                                if ((c01.z1.j() & 16777216) == 0) {
                                    B(b17);
                                } else {
                                    y(b17);
                                }
                            }
                        } else if (r26.i0.p(str2, "page/qqMailReminder", true)) {
                            M(b17);
                        } else if (r26.i0.p(str2, "page/plugin", true)) {
                            I(b17);
                        } else if (r26.i0.p(str2, "page/MyQRCode", true)) {
                            E(b17);
                        } else if (r26.i0.p(str2, "page/TopStories", true)) {
                            boolean z28 = (c01.z1.j() & 67108864) == 0;
                            java.lang.Object k17 = gm0.j1.u().c().k(274436);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(k17, "null cannot be cast to non-null type kotlin.String");
                            if (u11.c.f((java.lang.String) k17)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenWeiXinPage", "european user");
                                z28 = false;
                                z18 = false;
                            } else {
                                z18 = true;
                            }
                            boolean mo168058x74219ae7 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenWeiXinPage", "isInExperiment %s ,openLook %s, isTeenMode:%s", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z28), java.lang.Boolean.valueOf(mo168058x74219ae7));
                            if (z18 && z28 && !mo168058x74219ae7) {
                                j(b17);
                            } else {
                                y(b17);
                            }
                        } else if (r26.i0.p(str2, "page/language", true)) {
                            z(b17);
                        } else if (r26.i0.p(str2, "page/timeline/setBackgroundCover", true)) {
                            U(b17);
                        } else if (r26.i0.p(str2, "page/wxpaysetting", true)) {
                            ((h45.q) i95.n0.c(h45.q.class)).mo24837xef221a95("paySettingsUseCase", com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc(), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.m9.f267897a);
                        } else if (r26.i0.p(str2, "page/channel", true)) {
                            if (b17 instanceof android.app.Activity) {
                                android.os.Bundle bundle4 = new android.os.Bundle();
                                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                                bundle4.putString("realname_verify_process_jump_activity", com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.U0() ? ".ui.FinderHomeAffinityUI" : ".ui.FinderHomeUI");
                                bundle4.putString("realname_verify_process_jump_plugin", "finder");
                                ((ps4.g) ((o05.l) i95.n0.c(o05.l.class))).Bi((android.app.Activity) b17, bundle4);
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenWeiXinPage", "context is no activity.");
                                android.content.Intent intent14 = new android.content.Intent();
                                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                                intent14.setClassName(b17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.U0() ? "com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI" : "com.tencent.mm.plugin.finder.ui.FinderHomeUI");
                                intent14.addFlags(268435456);
                                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                                arrayList7.add(intent14);
                                java.util.Collections.reverse(arrayList7);
                                yj0.a.d(b17, arrayList7.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;ZLandroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                b17.startActivity((android.content.Intent) arrayList7.get(0));
                                yj0.a.f(b17, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;ZLandroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            }
                        } else if (r26.i0.p(str2, "page/RegByMobileSetPwdUI", true)) {
                            android.content.Intent intent15 = new android.content.Intent();
                            intent15.setClassName(b17, "com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI");
                            intent15.addFlags(268435456);
                            intent15.putExtra("kintent_hint", b17.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.itc));
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            arrayList8.add(intent15);
                            java.util.Collections.reverse(arrayList8);
                            yj0.a.d(b17, arrayList8.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;ZLandroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            b17.startActivity((android.content.Intent) arrayList8.get(0));
                            yj0.a.f(b17, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;ZLandroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        } else if (r26.i0.p(str2, "page/ContactMgrOnlyChatUI", true)) {
                            android.content.Intent intent16 = new android.content.Intent();
                            intent16.setClassName(b17, "com.tencent.mm.ui.contact.privacy.ContactMgrOnlyChatUI");
                            intent16.addFlags(268435456);
                            java.util.ArrayList arrayList9 = new java.util.ArrayList();
                            arrayList9.add(intent16);
                            java.util.Collections.reverse(arrayList9);
                            yj0.a.d(b17, arrayList9.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;ZLandroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            b17.startActivity((android.content.Intent) arrayList9.get(0));
                            yj0.a.f(b17, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;ZLandroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        } else if (r26.i0.p(str2, "page/CardHomePageV3UI", true)) {
                            android.content.Intent intent17 = new android.content.Intent();
                            intent17.setClassName(b17, "com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI");
                            intent17.addFlags(268435456);
                            java.util.ArrayList arrayList10 = new java.util.ArrayList();
                            arrayList10.add(intent17);
                            java.util.Collections.reverse(arrayList10);
                            yj0.a.d(b17, arrayList10.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;ZLandroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            b17.startActivity((android.content.Intent) arrayList10.get(0));
                            yj0.a.f(b17, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;ZLandroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        } else if (r26.i0.p(str2, "page/SettingsPersonalMoreUI", true)) {
                            android.content.Intent intent18 = new android.content.Intent();
                            intent18.setClassName(b17, "com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalMoreUI");
                            intent18.addFlags(268435456);
                            java.util.ArrayList arrayList11 = new java.util.ArrayList();
                            arrayList11.add(intent18);
                            java.util.Collections.reverse(arrayList11);
                            yj0.a.d(b17, arrayList11.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;ZLandroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            b17.startActivity((android.content.Intent) arrayList11.get(0));
                            yj0.a.f(b17, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;ZLandroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        } else if (r26.i0.p(str2, "page/systemCapabilityAuthorization", true)) {
                            android.content.Intent intent19 = new android.content.Intent();
                            intent19.setClassName(b17, "com.tencent.mm.plugin.setting.ui.setting.SettingsSystemPermissionUI");
                            intent19.addFlags(268435456);
                            java.util.ArrayList arrayList12 = new java.util.ArrayList();
                            arrayList12.add(intent19);
                            java.util.Collections.reverse(arrayList12);
                            yj0.a.d(b17, arrayList12.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;ZLandroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            b17.startActivity((android.content.Intent) arrayList12.get(0));
                            yj0.a.f(b17, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;ZLandroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        } else if (r26.i0.p(str2, "page/jumpSystemSetting", true)) {
                            android.content.Intent intent20 = new android.content.Intent();
                            intent20.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent20.setData(android.net.Uri.parse("package:" + b17.getPackageName()));
                            intent20.addFlags(268435456);
                            java.util.ArrayList arrayList13 = new java.util.ArrayList();
                            arrayList13.add(intent20);
                            java.util.Collections.reverse(arrayList13);
                            yj0.a.d(b17, arrayList13.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;ZLandroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            b17.startActivity((android.content.Intent) arrayList13.get(0));
                            yj0.a.f(b17, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;ZLandroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        } else if (r26.i0.p(str2, "page/BrandServiceIndexUI", true)) {
                            android.content.Intent intent21 = new android.content.Intent();
                            intent21.setClassName(b17, "com.tencent.mm.plugin.brandservice.ui.BrandServiceIndexUI");
                            intent21.addFlags(268435456);
                            java.util.ArrayList arrayList14 = new java.util.ArrayList();
                            arrayList14.add(intent21);
                            java.util.Collections.reverse(arrayList14);
                            yj0.a.d(b17, arrayList14.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;ZLandroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            b17.startActivity((android.content.Intent) arrayList14.get(0));
                            yj0.a.f(b17, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;ZLandroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        } else if (r26.i0.p(str2, "page/TextStatusDoWhatActivity", true)) {
                            android.content.Intent intent22 = new android.content.Intent();
                            intent22.setClassName(b17, "com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity");
                            intent22.addFlags(268435456);
                            java.util.ArrayList arrayList15 = new java.util.ArrayList();
                            arrayList15.add(intent22);
                            java.util.Collections.reverse(arrayList15);
                            yj0.a.d(b17, arrayList15.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;ZLandroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            b17.startActivity((android.content.Intent) arrayList15.get(0));
                            yj0.a.f(b17, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;ZLandroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        } else if (r26.i0.p(str2, "page/RingtoneSettingsUI", true)) {
                            android.content.Intent intent23 = new android.content.Intent();
                            intent23.setClassName(b17, "com.tencent.mm.plugin.ringtone.ui.RingtoneSettingsUI");
                            intent23.putExtra("ringtone_channel", 5);
                            intent23.addFlags(268435456);
                            java.util.ArrayList arrayList16 = new java.util.ArrayList();
                            arrayList16.add(intent23);
                            java.util.Collections.reverse(arrayList16);
                            yj0.a.d(b17, arrayList16.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;ZLandroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            b17.startActivity((android.content.Intent) arrayList16.get(0));
                            yj0.a.f(b17, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;ZLandroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        } else if (r26.i0.p(str2, "page/SettingsMessageNotificationUI", true)) {
                            android.content.Intent intent24 = new android.content.Intent();
                            intent24.setClassName(b17, "com.tencent.mm.plugin.setting.ui.setting.SettingsMessageNotificationUI");
                            intent24.addFlags(268435456);
                            java.util.ArrayList arrayList17 = new java.util.ArrayList();
                            arrayList17.add(intent24);
                            java.util.Collections.reverse(arrayList17);
                            yj0.a.d(b17, arrayList17.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;ZLandroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            b17.startActivity((android.content.Intent) arrayList17.get(0));
                            yj0.a.f(b17, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;ZLandroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        } else if (r26.i0.p(str2, "page/SettingsCareModeIntro", true)) {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.a9.a();
                            if (yp5.a.f545942a.a()) {
                                android.content.Intent intent25 = new android.content.Intent();
                                intent25.setClassName(b17, "com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro");
                                intent25.addFlags(268435456);
                                java.util.ArrayList arrayList18 = new java.util.ArrayList();
                                arrayList18.add(intent25);
                                java.util.Collections.reverse(arrayList18);
                                yj0.a.d(b17, arrayList18.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;ZLandroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                b17.startActivity((android.content.Intent) arrayList18.get(0));
                                yj0.a.f(b17, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "handlePageUrl", "(Ljava/lang/String;ZLandroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenWeiXinPage", "PAGE_SETTINGSCAREMODEINTRO, disable.");
                                Z(b17);
                            }
                        } else if (r26.i0.p(str2, "page/setting/friendPrivate/friendingMeMethods", true)) {
                            android.content.Intent intent26 = new android.content.Intent();
                            intent26.addFlags(268435456);
                            if (((u24.h) ((ct.c3) i95.n0.c(ct.c3.class))).wi()) {
                                intent26.putExtra("key_config_item", "SettingGroup_Main_FriendPrivacy_AddMeWay");
                                j45.l.i(b17, "setting", ".ui.setting_new.CommonSettingsUI", intent26);
                            } else {
                                j45.l.i(b17, "setting", ".ui.setting.SettingsAddMeUI", intent26);
                            }
                        } else {
                            if (!r26.i0.p(str2, "page/chatbot", true)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenWeiXinPage", "handlePageUrl not exist path");
                                return false;
                            }
                            java.lang.String string = bundle != null ? bundle.getString(dm.i4.f66875xa013b0d5) : null;
                            if (string != null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenWeiXinPage", "[+] openWeiXinPage handled. username:".concat(string));
                                android.content.Context n17 = com.p314xaae8f345.mm.app.w.INSTANCE.n();
                                android.content.Context context = n17 == null ? b17 : n17;
                                vh0.n1 n1Var = (vh0.n1) i95.n0.c(vh0.n1.class);
                                java.lang.String a17 = com.p314xaae8f345.mm.ui.l2.a(string);
                                ((vh0.f3) n1Var).bj(context, string, 5, a17, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.n9(a17, n1Var, context, string));
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenWeiXinPage", "[-] openWeiXinPage tries to open yuanbao without target username.");
                            }
                        }
                    }
                }
            }
            return true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiOpenWeiXinPage", th6, "handlePageErr!!", new java.lang.Object[0]);
            return false;
        }
    }

    public final void Z(android.content.Context context) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
        u1Var.g(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574205hf3));
        u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi);
        u1Var.l(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.o9.f267945a);
        u1Var.q(false);
    }

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenWeiXinPage", "OpenWeiXinPage:" + msg.f422323a);
        java.util.Map params = msg.f422323a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(params, "params");
        jz5.l[] lVarArr = (jz5.l[]) kz5.e1.v(params).toArray(new jz5.l[0]);
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, j3.f.a((jz5.l[]) java.util.Arrays.copyOf(lVarArr, lVarArr.length)), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.h9.class, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.i9(env, msg));
        return true;
    }

    public final boolean a0(android.content.Context context, java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        boolean z17 = false;
        if (n17 != null && n17.r2()) {
            z17 = true;
        }
        if (z17) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Chat_User", str);
            intent.putExtra("finish_direct", true);
            intent.putExtra("chat_from_scene", 5);
            j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
        } else {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Contact_User", str);
            j45.l.j(context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent2, null);
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 396;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "openWeiXinPage";
    }

    public final void e(android.content.Context context) {
        c01.s7 a17 = c01.t7.a(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fsb));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("filter_type", a17.a());
        intent.putExtra("titile", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ix6));
        intent.putExtra("list_attr", 32768);
        intent.addFlags(268435456);
        intent.setClassName(context, "com.tencent.mm.ui.contact.SelectSpecialContactUI");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goBlackList", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goBlackList", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void f(android.content.Context context) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putBoolean("dark_mode_red_dot", false);
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.setting.ui.setting.SettingDarkMode");
        intent.addFlags(268435456);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goDarkMode", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goDarkMode", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void g(android.content.Context context) {
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("WeChatSafeCenterUrl");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenWeiXinPage", "safe center url %s", d17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
            d17 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l8n) + com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", d17);
        intent.putExtra("showShare", true);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
        intent.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
        j45.l.j(context, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
    }

    public final void h(android.content.Context context) {
        int h17 = gm0.j1.b().h();
        java.lang.Object l17 = gm0.j1.u().c().l(12304, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(l17, "null cannot be cast to non-null type kotlin.Int");
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iz_, java.lang.Integer.valueOf(h17), java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) l17)));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        if (r26.n0.N(string)) {
            return;
        }
        gm0.j1.u().c().w(12304, 0);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iz9));
        intent.putExtra("rawUrl", string);
        intent.putExtra("showShare", false);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public final void i(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(268435456);
        intent.addFlags(67108864);
        intent.putExtra("preferred_tab", 1);
        j45.l.u(context, "com.tencent.mm.ui.LauncherUI", intent, null);
    }

    public final void j(android.content.Context context) {
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.h(1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenWeiXinPage", "fts h5 template not avail");
            return;
        }
        ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).getClass();
        java.lang.String optString = su4.o2.d("discoverRecommendEntry").optString("wording");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenWeiXinPage", "empty query");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenWeiXinPage", "look one look clikced");
        ((lf0.h0) ((mf0.g0) i95.n0.c(mf0.g0.class))).getClass();
        o11.g gVar = wm4.u.f528842a;
        wm4.u.u(context, 20, new android.os.Bundle(), "", new java.util.HashMap());
        ((ty4.n) ((uy4.v) i95.n0.c(uy4.v.class))).Di("labs_browse");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5808xcfc568fb c5808xcfc568fb = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5808xcfc568fb();
        c5808xcfc568fb.f136116g.f87895a = 0;
        c5808xcfc568fb.e();
        su4.k3.a(20, optString);
        su4.k3.f(20, 0);
        ((lf0.u) ((mf0.z) i95.n0.c(mf0.z.class))).getClass();
        ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().I();
    }

    public final void k(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.subapp.ui.pluginapp.AddMoreFriendsUI");
        intent.addFlags(268435456);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageAddMoreFriendsUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageAddMoreFriendsUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void l(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.account.bind.ui.BindQQUI");
        intent.addFlags(268435456);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageBindQQUIUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageBindQQUIUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void m(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI");
        intent.addFlags(268435456);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageBindphoneInfoUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageBindphoneInfoUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void n(android.content.Context context) {
        boolean Ui = ((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).Ui();
        if (!Ui) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenWeiXinPage", "goToPageBrandServiceSuffix, enable = " + Ui);
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("biz_enter_source", 2);
            intent.putExtra("KOpenArticleSceneFromScene", 7);
            ((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).Ri(context, intent);
        }
    }

    public final void o(android.content.Context context) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
        am.nx nxVar = c6113xa3727625.f136390g;
        nxVar.f88999a = "gh_4ee148a6ecaa@app";
        nxVar.f89006h = "wxdfda2588e999a42d";
        nxVar.f89000b = "pages/index/index.html";
        nxVar.f89002d = com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14496xb5b90f36;
        c6113xa3727625.e();
    }

    public final void p(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.finder.ui.FinderSelfUI");
        intent.addFlags(268435456);
        intent.putExtra("key_need_done_post_action", true);
        intent.putExtra("key_from_search_post", true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageChannelPublishSuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageChannelPublishSuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void q(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.label.ui.ContactLabelManagerUI");
        intent.addFlags(268435456);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageContactTaglistSuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageContactTaglistSuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void r(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(context, "com.tencent.mm.ui.contact.SelectContactUI");
        cf.b.a(intent);
        intent.putExtra("titile", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571466fw));
        intent.putExtra("list_type", 0);
        intent.addFlags(268435456);
        com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
        intent.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.g(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288316d, 256, 512));
        intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 7);
        intent.putExtra("menu_mode", 2);
        intent.putExtra("create_group_recommend", true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageCreateroomSuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageCreateroomSuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void s(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.setting.ui.setting.SettingsModifyNameUI");
        intent.addFlags(268435456);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageDeeplinkSetnameSuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageDeeplinkSetnameSuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void t(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent();
        if (!((u24.h) ((ct.c3) i95.n0.c(ct.c3.class))).wi()) {
            j45.l.j(context, "setting", ".ui.setting.SettingsUI", intent, null);
        } else {
            intent.putExtra("key_config_item", "SettingGroup_Main");
            j45.l.j(context, "setting", ".ui.setting_new.MainSettingsUI", intent, null);
        }
    }

    public final void u(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11140, 0);
        j45.l.h(context, "pwdgroup", ".ui.FacingCreateChatRoomAllInOneUI");
    }

    public final void v(android.content.Context context) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5773x64e6b625 c5773x64e6b625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5773x64e6b625();
        am.zl zlVar = c5773x64e6b625.f136087g;
        zlVar.f56x88be67a1 = currentTimeMillis;
        zlVar.f90114d = context;
        zlVar.f90111a = 9;
        c5773x64e6b625.e();
    }

    public final void w(android.content.Context context) {
        z30.u uVar = (z30.u) i95.n0.c(z30.u.class);
        android.content.Intent intent = new android.content.Intent();
        ((y30.q) uVar).getClass();
        o72.x1.L0(context, ".ui.FavoriteIndexUI", intent, null);
    }

    public final void x(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", "filehelper");
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 23);
        intent.addFlags(268435456);
        j45.l.j(context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).hj("filehelper", 10L);
    }

    public final void y(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI");
        intent.addFlags(268435456);
        intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 3);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageFinderManagerSuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageFinderManagerSuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void z(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.setting.ui.setting.SettingsLanguageUI");
        intent.addFlags(268435456);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageLanguageUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiOpenWeiXinPage", "goToPageLanguageUISuffix", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
