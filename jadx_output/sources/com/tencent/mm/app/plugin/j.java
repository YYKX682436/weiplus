package com.tencent.mm.app.plugin;

/* loaded from: classes9.dex */
public class j implements o25.a2 {
    public static void a(android.content.Context context, java.lang.String str, boolean z17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", z17);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
        intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
        j45.l.j(context, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
    }

    public final boolean b(android.content.Context context, java.lang.String str, boolean z17, o25.o2 o2Var, android.os.Bundle bundle) {
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMURIJumpHandler", "jumpToUIInternal, context is null!");
            return false;
        }
        if (str == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMURIJumpHandler", "jumpToUIInternal url is null");
            return false;
        }
        if (str.startsWith("weixin://openSpecificView/")) {
            return d(context, str, new java.lang.Object[0]);
        }
        com.tencent.mm.app.plugin.s f17 = com.tencent.mm.app.plugin.s.f();
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = f17.f53682h;
        copyOnWriteArrayList.size();
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = f17.f53683i;
        copyOnWriteArrayList2.size();
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList3 = f17.f53684m;
        copyOnWriteArrayList3.size();
        f17.f53681g = context;
        com.tencent.mm.app.plugin.URISpanHandlerSet uRISpanHandlerSet = f17.f53680f;
        uRISpanHandlerSet.f53590a = context;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            f17.f53681g = null;
            uRISpanHandlerSet.f53590a = null;
            return false;
        }
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                java.util.Iterator it6 = copyOnWriteArrayList2.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        java.util.Iterator it7 = copyOnWriteArrayList3.iterator();
                        while (it7.hasNext()) {
                            if (((com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler) it7.next()).f(str, z17, o2Var, bundle)) {
                                f17.f53681g = null;
                                uRISpanHandlerSet.f53590a = null;
                            }
                        }
                        f17.f53681g = null;
                        uRISpanHandlerSet.f53590a = null;
                        return false;
                    }
                    if (((com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler) it6.next()).f(str, z17, o2Var, bundle)) {
                        f17.f53681g = null;
                        uRISpanHandlerSet.f53590a = null;
                        break;
                    }
                }
            } else if (((com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler) it.next()).f(str, z17, o2Var, bundle)) {
                f17.f53681g = null;
                uRISpanHandlerSet.f53590a = null;
                break;
            }
        }
        return true;
    }

    public boolean c(android.content.Context context, java.lang.String str, boolean z17, o25.o2 o2Var) {
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMURIJumpHandler", "jumpToURLWithCallback, context is null!");
            return false;
        }
        if (!str.startsWith("http")) {
            if (!b(context, str, z17, o2Var, null)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MMURIJumpHandler", "jumpToUI failed, uri:%s", str);
            }
            return false;
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str));
        intent.addFlags(268435456);
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/app/plugin/MMURIJumpHandler", "openLinkInBrowser", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/app/plugin/MMURIJumpHandler", "openLinkInBrowser", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMURIJumpHandler", "openLinkInBrowser fail:%s", e17.getMessage());
            return true;
        }
    }

    public boolean d(android.content.Context context, java.lang.String str, java.lang.Object... objArr) {
        boolean z17;
        int P;
        if (str == null) {
            return false;
        }
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMURIJumpHandler", "openSpecificUI, context is null");
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(268435456);
        java.lang.String replace = str.replace("weixin://openSpecificView/", "");
        android.os.Bundle bundle = (objArr == null || objArr.length < 1) ? null : (android.os.Bundle) objArr[0];
        if (replace.equalsIgnoreCase("contacts")) {
            intent.addFlags(67108864);
            intent.putExtra("preferred_tab", 2);
            android.content.Intent intent2 = intent.setClass(context, com.tencent.mm.ui.LauncherUI.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/app/plugin/MMURIJumpHandler", "openSpecificUI", "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/Object;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/app/plugin/MMURIJumpHandler", "openSpecificUI", "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/Object;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            if (!replace.equalsIgnoreCase("newfriend")) {
                if (replace.equalsIgnoreCase("addfriend") || replace.equalsIgnoreCase("contact/addFriend")) {
                    j45.l.j(context, "subapp", ".ui.pluginapp.AddMoreFriendsUI", intent, null);
                } else if (replace.equalsIgnoreCase("searchbrand")) {
                    android.content.Intent intent3 = new android.content.Intent();
                    intent3.putExtra("Contact_Scene", 39);
                    j45.l.j(context, "brandservice", ".ui.SearchOrRecommendBizUI", intent3, null);
                } else if (replace.equalsIgnoreCase("discover")) {
                    intent.addFlags(67108864);
                    intent.putExtra("preferred_tab", 1);
                    android.content.Intent intent4 = intent.setClass(context, com.tencent.mm.ui.LauncherUI.class);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent4);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/app/plugin/MMURIJumpHandler", "openSpecificUI", "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/Object;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(context, "com/tencent/mm/app/plugin/MMURIJumpHandler", "openSpecificUI", "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/Object;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else if (replace.equalsIgnoreCase("timeline")) {
                    ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Vi(context, intent);
                } else if (replace.equalsIgnoreCase("scan")) {
                    intent.putExtra("key_scan_report_enter_scene", 24);
                    j45.l.j(context, "scanner", ".ui.BaseScanUI", intent, null);
                } else if (replace.equalsIgnoreCase("myprofile")) {
                    j45.l.j(context, "setting", ".ui.setting.SettingsPersonalInfoUI", intent, null);
                } else if (replace.equalsIgnoreCase("myaccount")) {
                    j45.l.j(context, "setting", ".ui.setting.SettingsAccountInfoUI", intent, null);
                } else if (replace.equalsIgnoreCase("bindphone")) {
                    com.tencent.mm.ui.MMWizardActivity.X6(context, intent.setClass(context, com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI.class));
                } else if (replace.equalsIgnoreCase(com.tencent.tencentmap.mapsdk.maps.TencentMapInitializer.KEY_AGREE_PRIVACY)) {
                    j45.l.j(context, "setting", ".ui.setting.SettingsPrivacyUI", intent, null);
                } else if (replace.equalsIgnoreCase("general")) {
                    j45.l.j(context, "setting", ".ui.setting.SettingsAboutSystemUI", intent, null);
                } else if (replace.equalsIgnoreCase("invitevoip")) {
                    com.tencent.mm.ui.contact.VoipAddressUI.y7(context);
                } else if (replace.equalsIgnoreCase("expose")) {
                    intent.putExtra("k_expose_url", bundle != null ? bundle.getString("url") : "");
                    intent.putExtra("k_username", c01.z1.r());
                    intent.putExtra("showShare", false);
                    intent.putExtra("rawUrl", java.lang.String.format(com.tencent.mm.ui.n2.f209398a, 34));
                    j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
                } else if (replace.equalsIgnoreCase("shakecard")) {
                    java.lang.String string = bundle != null ? bundle.getString("extinfo") : "";
                    intent.putExtra("key_shake_card_from_scene", 3);
                    intent.putExtra("shake_card", true);
                    intent.putExtra("key_shake_card_ext_info", string);
                    ((c34.b0) ((yd0.j) i95.n0.c(yd0.j.class))).wi(context, intent, false);
                } else if (replace.equalsIgnoreCase("cardlistview")) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMURIJumpHandler", "enter to cardhome");
                    com.tencent.mm.autogen.events.GotoCardHomePageEvent gotoCardHomePageEvent = new com.tencent.mm.autogen.events.GotoCardHomePageEvent();
                    gotoCardHomePageEvent.f54425g.f6154a = context;
                    gotoCardHomePageEvent.e();
                } else if (replace.equalsIgnoreCase("uploadlog")) {
                    java.lang.String r17 = c01.z1.r();
                    if (com.tencent.mm.sdk.platformtools.t8.K0(r17)) {
                        r17 = "weixin";
                    }
                    if (bundle != null) {
                        try {
                            P = com.tencent.mm.sdk.platformtools.t8.P(bundle.getString("extinfo"), 0);
                        } catch (java.lang.Exception unused) {
                        }
                        java.lang.Object[] objArr2 = new java.lang.Object[2];
                        objArr2[0] = java.lang.Boolean.valueOf((gm0.j1.a() || gm0.m.r()) ? false : true);
                        objArr2[1] = java.lang.Integer.valueOf(P);
                        com.tencent.mars.xlog.Log.i("MicroMsg.MMURIJumpHandler", "upload log from jsapi, before upload, is-login:%b, time:%d", objArr2);
                        android.content.Intent intent5 = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.JSAPIUploadLogHelperUI.class);
                        intent5.putExtra("key_user", r17);
                        intent5.putExtra("key_time", P);
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(intent5);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(context, arrayList3.toArray(), "com/tencent/mm/app/plugin/MMURIJumpHandler", "openSpecificUI", "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/Object;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context.startActivity((android.content.Intent) arrayList3.get(0));
                        yj0.a.f(context, "com/tencent/mm/app/plugin/MMURIJumpHandler", "openSpecificUI", "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/Object;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                    P = 0;
                    java.lang.Object[] objArr22 = new java.lang.Object[2];
                    objArr22[0] = java.lang.Boolean.valueOf((gm0.j1.a() || gm0.m.r()) ? false : true);
                    objArr22[1] = java.lang.Integer.valueOf(P);
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMURIJumpHandler", "upload log from jsapi, before upload, is-login:%b, time:%d", objArr22);
                    android.content.Intent intent52 = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.JSAPIUploadLogHelperUI.class);
                    intent52.putExtra("key_user", r17);
                    intent52.putExtra("key_time", P);
                    java.util.ArrayList arrayList32 = new java.util.ArrayList();
                    arrayList32.add(intent52);
                    java.util.Collections.reverse(arrayList32);
                    yj0.a.d(context, arrayList32.toArray(), "com/tencent/mm/app/plugin/MMURIJumpHandler", "openSpecificUI", "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/Object;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList32.get(0));
                    yj0.a.f(context, "com/tencent/mm/app/plugin/MMURIJumpHandler", "openSpecificUI", "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/Object;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else if (replace.equalsIgnoreCase("moments/alblum")) {
                    java.lang.String str2 = (java.lang.String) c01.d9.b().p().l(2, null);
                    intent.setClass(context, com.tencent.mm.ui.AlbumUI.class);
                    intent.putExtra("sns_userName", str2);
                    intent.putExtra(dm.i4.COL_USERNAME, str2);
                    intent.setFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
                    intent.addFlags(67108864);
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(intent);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(context, arrayList4.toArray(), "com/tencent/mm/app/plugin/MMURIJumpHandler", "openSpecificUI", "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/Object;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList4.get(0));
                    yj0.a.f(context, "com/tencent/mm/app/plugin/MMURIJumpHandler", "openSpecificUI", "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/Object;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else if (replace.equalsIgnoreCase("moments/status")) {
                    java.lang.String str3 = (java.lang.String) c01.d9.b().p().l(2, null);
                    intent.setClass(context, com.tencent.mm.ui.AlbumUI.class);
                    intent.putExtra("sns_userName", str3);
                    intent.putExtra(dm.i4.COL_USERNAME, str3);
                    intent.putExtra("story_dot", false);
                    intent.putExtra("status_default", true);
                    intent.setFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
                    intent.addFlags(67108864);
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.add(intent);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(context, arrayList5.toArray(), "com/tencent/mm/app/plugin/MMURIJumpHandler", "openSpecificUI", "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/Object;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList5.get(0));
                    yj0.a.f(context, "com/tencent/mm/app/plugin/MMURIJumpHandler", "openSpecificUI", "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/Object;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else if (replace.equalsIgnoreCase("weixinCoin")) {
                    if (!((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
                        intent.putExtra("launch_from_webview", false);
                        z17 = true;
                        intent.putExtra("isWecoinAuth", true);
                        j45.l.k(context, "wallet", ".wecoin.ui.WeCoinRechargeView", intent, true);
                        return z17;
                    }
                    ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
                } else {
                    if (!replace.equalsIgnoreCase("BrandServiceIndexUI")) {
                        if (replace.equalsIgnoreCase("miniProgram")) {
                            z17 = true;
                            ((com.tencent.mm.plugin.appbrand.app.t2) ((com.tencent.mm.plugin.appbrand.service.k6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.k6.class))).wi(context, 1, false);
                        } else if ("wesport/homepage".equalsIgnoreCase(replace)) {
                            ((ue4.w) ((ve4.e) i95.n0.c(ve4.e.class))).getClass();
                            if (com.tencent.mm.plugin.sport.model.c0.e()) {
                                java.lang.String r18 = c01.z1.r();
                                if (com.tencent.mm.sdk.platformtools.t8.K0(r18)) {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.MMURIJumpHandler", "Get username from UserInfo return null or nil.");
                                    return false;
                                }
                                intent.putExtra(dm.i4.COL_USERNAME, r18);
                                j45.l.j(context, "exdevice", ".ui.ExdeviceProfileUI", intent, null);
                            } else {
                                intent.putExtra("key_from_wesport_plugin_newtips", true);
                                intent.putExtra("Contact_User", "gh_43f2581f6fd6");
                                j45.l.j(context, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
                            }
                        } else if (replace.equalsIgnoreCase("textsize")) {
                            j45.l.j(context, "setting", ".ui.setting.SettingsFontUI", intent, null);
                        } else if (replace.equalsIgnoreCase("setpat")) {
                            j45.l.j(context, "setting", ".ui.setting.SettingsModifyPatSuffixUI", intent, null);
                        } else if (replace.equalsIgnoreCase("chatlog")) {
                            j45.l.j(context, "backup", ".backupui.BackupChooseBackupModeUI", intent, null);
                        } else if (replace.equalsIgnoreCase("chatlogmigrate")) {
                            ((yn1.h4) ((mv.w) i95.n0.c(mv.w.class))).cj(context, mv.a.f331472h);
                        } else if (replace.equalsIgnoreCase("contactblacklist")) {
                            intent.putExtra("filter_type", c01.t7.a(context.getString(com.tencent.mm.R.string.fsb)).a());
                            intent.putExtra("titile", context.getString(com.tencent.mm.R.string.ix6));
                            intent.putExtra("list_attr", 32768);
                            intent.setClassName(context, "com.tencent.mm.ui.contact.SelectSpecialContactUI");
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            arrayList6.add(intent);
                            java.util.Collections.reverse(arrayList6);
                            yj0.a.d(context, arrayList6.toArray(), "com/tencent/mm/app/plugin/MMURIJumpHandler", "openSpecificUI", "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/Object;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            context.startActivity((android.content.Intent) arrayList6.get(0));
                            yj0.a.f(context, "com/tencent/mm/app/plugin/MMURIJumpHandler", "openSpecificUI", "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/Object;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        } else if (replace.equalsIgnoreCase("wesport")) {
                            if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_43f2581f6fd6", true).r2()) {
                                intent.putExtra("Chat_User", "gh_43f2581f6fd6");
                                intent.putExtra("finish_direct", true);
                                intent.putExtra("chat_from_scene", 5);
                                j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
                            } else {
                                intent.putExtra("Contact_User", "gh_43f2581f6fd6");
                                j45.l.j(context, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
                            }
                        } else if (replace.equalsIgnoreCase("masssend")) {
                            if (c01.z1.D()) {
                                intent.putExtra("finish_direct", true);
                                j45.l.j(context, "masssend", ".ui.MassSendHistoryUI", intent, null);
                            } else {
                                intent.putExtra("Contact_User", "masssendapp");
                                j45.l.j(context, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
                            }
                        } else if (replace.equalsIgnoreCase("darkmode")) {
                            intent.setClassName(context, "com.tencent.mm.plugin.setting.ui.setting.SettingDarkMode");
                            java.util.ArrayList arrayList7 = new java.util.ArrayList();
                            arrayList7.add(intent);
                            java.util.Collections.reverse(arrayList7);
                            yj0.a.d(context, arrayList7.toArray(), "com/tencent/mm/app/plugin/MMURIJumpHandler", "openSpecificUI", "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/Object;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            context.startActivity((android.content.Intent) arrayList7.get(0));
                            yj0.a.f(context, "com/tencent/mm/app/plugin/MMURIJumpHandler", "openSpecificUI", "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/Object;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        } else if (replace.equalsIgnoreCase("chatbackground")) {
                            j45.l.j(context, "setting", ".ui.setting.SettingsChattingBackgroundUI", intent, null);
                        } else if (replace.equalsIgnoreCase("setting/friendPrivate")) {
                            j45.l.j(context, "setting", ".ui.setting.SettingsPrivacyUI", intent, null);
                        } else if (replace.equalsIgnoreCase("setting/friendPrivate/friendingMeMethods")) {
                            j45.l.j(context, "setting", ".ui.setting.SettingsAddMeUI", intent, null);
                        } else if (replace.equalsIgnoreCase("setting/photosVideosFilesCalls")) {
                            j45.l.j(context, "setting", ".ui.setting.SettingsAboutCamera", intent, null);
                        } else if (replace.equalsIgnoreCase("MyQRCode")) {
                            ((hs.d0) ((kd0.i2) i95.n0.c(kd0.i2.class))).getClass();
                            e04.g2.a(context, null);
                        } else if (replace.equalsIgnoreCase("deeplink/setname")) {
                            j45.l.j(context, "setting", ".ui.setting.SettingsModifyNameUI", intent, null);
                        } else if (replace.equalsIgnoreCase("setHeadPortrait")) {
                            intent.putExtra("need_show_menu_choose", true);
                            j45.l.j(context, "setting", ".ui.setting.PreviewHdHeadImg", intent, null);
                        } else if (replace.equalsIgnoreCase("modifyAliase")) {
                            if (com.tencent.mm.sdk.platformtools.t8.K0(c01.z1.c()) && com.tencent.mm.storage.z3.P3(c01.z1.r()) && ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableModAlias", 0) == 0) {
                                j45.l.j(context, "setting", ".ui.setting.SettingsCreateAliasUI", intent, null);
                                return true;
                            }
                            if (((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableModAlias", 0) != 0) {
                                intent.setClassName(context, "com.tencent.mm.plugin.setting.ui.setting.SettingsAliasUI");
                                intent.putExtra("WizardRootClass", "com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI");
                                com.tencent.mm.ui.MMWizardActivity.X6(context, intent);
                            }
                        } else if (replace.equalsIgnoreCase("RingtoneSettingsUI")) {
                            intent.putExtra("ringtone_channel", 5);
                            j45.l.j(context, "ringtone", ".ui.RingtoneSettingsUI", intent, null);
                        } else if (replace.equalsIgnoreCase("securitycenter")) {
                            java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("WeChatSafeCenterUrl");
                            com.tencent.mars.xlog.Log.i("MicroMsg.MMURIJumpHandler", "safe center url %s", d17);
                            if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
                                d17 = context.getString(com.tencent.mm.R.string.l8n) + com.tencent.mm.sdk.platformtools.m2.d();
                            }
                            z17 = true;
                            a(context, d17, true);
                        } else if (replace.equalsIgnoreCase("storageManage")) {
                            intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 4);
                            j45.l.j(context, "clean", ".ui.fileindexui.CleanNewUI", intent, null);
                        } else if (replace.equalsIgnoreCase("setting/appAuthManage")) {
                            j45.l.j(context, "setting", ".ui.setting.SettingsAuthUI", intent, null);
                        } else if (replace.equalsIgnoreCase("messageNotification")) {
                            j45.l.j(context, "setting", ".ui.setting.SettingsNotificationUI", intent, null);
                        } else if (replace.equalsIgnoreCase(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE)) {
                            j45.l.j(context, "setting", ".ui.setting.SettingsLanguageUI", intent, null);
                        } else if (replace.equalsIgnoreCase("tool/discoverPageManage")) {
                            j45.l.j(context, "setting", ".ui.setting.SettingsManageFindMoreV2UI", intent, null);
                        } else if (replace.equalsIgnoreCase("Settings/LimitedMode")) {
                            j45.l.j(context, "teenmode", ".ui.SettingsTeenModeIntro", intent, null);
                        } else if (replace.equalsIgnoreCase("SettingsCareModeIntro")) {
                            j45.l.j(context, "setting", ".ui.setting.SettingsCareModeIntro", intent, null);
                        } else if (replace.equalsIgnoreCase("bindPhoneInfo")) {
                            j45.l.j(context, "account", ".bind.ui.BindMContactIntroUI", intent, null);
                        } else if (replace.equalsIgnoreCase("setting/security/more")) {
                            j45.l.j(context, "setting", ".ui.setting.SettingsMoreSafeUI", intent, null);
                        } else if (replace.equalsIgnoreCase("weixinCoin/detail")) {
                            a(context, "https://support.weixin.qq.com/mmnodeweb-bin/wecoin-bin/pages/record/index", false);
                        } else if (replace.equalsIgnoreCase("TextStatusDoWhatActivity")) {
                            j45.l.j(context, "textstatus", ".ui.TextStatusDoWhatActivity", intent, null);
                        } else {
                            com.tencent.mm.autogen.events.JSApiOpenSpecificViewEvent jSApiOpenSpecificViewEvent = new com.tencent.mm.autogen.events.JSApiOpenSpecificViewEvent();
                            am.sh shVar = jSApiOpenSpecificViewEvent.f54443g;
                            shVar.f7899b = replace;
                            shVar.f7898a = context;
                            jSApiOpenSpecificViewEvent.e();
                            am.th thVar = jSApiOpenSpecificViewEvent.f54444h;
                            android.content.Intent intent6 = thVar.f8010a;
                            if (intent6 != null) {
                                intent6.addFlags(268435456);
                                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                                arrayList8.add(intent6);
                                java.util.Collections.reverse(arrayList8);
                                yj0.a.d(context, arrayList8.toArray(), "com/tencent/mm/app/plugin/MMURIJumpHandler", "openSpecificUI", "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/Object;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                context.startActivity((android.content.Intent) arrayList8.get(0));
                                yj0.a.f(context, "com/tencent/mm/app/plugin/MMURIJumpHandler", "openSpecificUI", "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/Object;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            } else if (thVar.f8011b) {
                                db5.t7.makeText(context, com.tencent.mm.R.string.f492673hf4, 0).show();
                            }
                            if (intent6 == null && !thVar.f8012c) {
                                return false;
                            }
                        }
                        return z17;
                    }
                    if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
                        ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
                    } else {
                        j45.l.j(context, "brandservice", ".ui.BrandServiceIndexUI", intent, null);
                    }
                }
                return true;
            }
            if (bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.global.RepairerConfigAddFriendVerifyRecordToCloud()) == 1) {
                android.content.Intent intent7 = new android.content.Intent();
                lk5.s.e(intent7, true);
                com.tencent.mars.xlog.Log.i("MicroMsg.MMURIJumpHandler", "openSpecificUI newfriend, [AddFriendVerifyRecordToCloud] goto AddFriendVerifyRecordUI (new)");
                j45.l.j(context, "subapp", ".ui.friend.AddFriendVerifyRecordUI", intent7, null);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMURIJumpHandler", "openSpecificUI newfriend, [AddFriendVerifyRecordToCloud] goto FMessageConversationUI (old)");
                j45.l.j(context, "subapp", ".ui.friend.FMessageConversationUI", intent, null);
            }
        }
        return true;
    }
}
