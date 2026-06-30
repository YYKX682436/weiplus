package av4;

/* loaded from: classes.dex */
public final class r0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final av4.r0 f14330d = new av4.r0();

    public static final boolean g(android.content.Context context, java.lang.String username) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(username, "username");
        ((qv.o) ((rv.u2) i95.n0.c(rv.u2.class))).getClass();
        qk.o b17 = r01.z.b(username);
        if (b17 == null) {
            return false;
        }
        if (!b17.F0() && !b17.L0() && !b17.I0() && !b17.G0()) {
            return false;
        }
        try {
            if (b17.I0()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.StartSearchItemDetailPageJSApi", "onItemClick, isEnterpriseFatherBiz, username: %s", username);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("enterprise_biz_name", username);
                ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                intent.putExtra("enterprise_biz_display_name", c01.a2.e(username));
                intent.putExtra("uinserve_search_id", "");
                intent.putExtra("uinserve_search_session_id", "");
                intent.putExtra("enterprise_from_scene", 8);
                j45.l.u(context, ".ui.conversation.EnterpriseConversationUI", intent, null);
            } else if (b17.F0()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.StartSearchItemDetailPageJSApi", "onItemClick, isEnterpriseChat, username: %s", username);
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("Contact_User", username);
                intent2.addFlags(67108864);
                intent2.putExtra("uinserve_search_id", "");
                intent2.putExtra("uinserve_search_session_id", "");
                intent2.putExtra("biz_chat_from_scene", 5);
                j45.l.u(context, ".ui.bizchat.BizChatConversationUI", intent2, null);
            } else if (b17.L0()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.StartSearchItemDetailPageJSApi", "onItemClick, isEnterpriseWeb, username: %s", username);
                qk.o b18 = r01.z.b(username);
                java.lang.String z07 = b18 != null ? b18.z0() : null;
                if (z07 == null) {
                    z07 = "";
                }
                android.content.Intent intent3 = new android.content.Intent();
                intent3.putExtra("rawUrl", z07);
                intent3.putExtra("useJs", true);
                intent3.putExtra("uinserve_search_id", "");
                intent3.putExtra("uinserve_search_session_id", "");
                intent3.putExtra("uinserve_search_time_token", "");
                intent3.putExtra("srcUsername", username);
                intent3.putExtra("bizofstartfrom", "enterpriseHomeSubBrand");
                intent3.addFlags(67108864);
                j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent3, null);
            } else if (b17.G0()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.StartSearchItemDetailPageJSApi", "onItemClick, isEnterpriseChildType, username: %s", username);
                android.content.Intent addFlags = new android.content.Intent().putExtra("Chat_User", username).putExtra("chat_from_scene", 5).putExtra("finish_direct", true).addFlags(67108864);
                kotlin.jvm.internal.o.f(addFlags, "addFlags(...)");
                android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
                if (activity == null) {
                    java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
                    activity = k17 != null ? (android.app.Activity) k17.get() : null;
                }
                if (activity != null) {
                    context = activity;
                }
                j45.l.u(context, ".ui.chatting.ChattingUI", addFlags, null);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.StartSearchItemDetailPageJSApi", "onItemClick StartSearchItemDetail startEnterpriseIfNeededSafe, success");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.StartSearchItemDetailPageJSApi", e17, "StartSearchItemDetail startEnterpriseIfNeededSafe failed: ".concat(username), new java.lang.Object[0]);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // nw4.q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(nw4.k r21, nw4.y2 r22) {
        /*
            Method dump skipped, instructions count: 1085
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: av4.r0.a(nw4.k, nw4.y2):boolean");
    }

    @Override // nw4.q2
    public int b() {
        return 10000;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "startSearchItemDetailPageJsApi";
    }

    public final android.os.Bundle e(android.content.Context context) {
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            return null;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) context;
        bundle.putString("publishIdPrefix", appCompatActivity.getIntent().getStringExtra("publishIdPrefix"));
        bundle.putString("reportSessionId", appCompatActivity.getIntent().getStringExtra("reportSessionId"));
        return bundle;
    }

    public final su4.d f(java.util.Map map) {
        su4.d dVar = new su4.d();
        dVar.f412834a = com.tencent.mm.plugin.websearch.l2.f(map, "userName");
        dVar.f412835b = com.tencent.mm.plugin.websearch.l2.f(map, "nickName");
        dVar.f412836c = com.tencent.mm.plugin.websearch.l2.f(map, "headHDImgUrl");
        dVar.f412838e = com.tencent.mm.plugin.websearch.l2.e(map, "verifyFlag", 0);
        dVar.f412837d = com.tencent.mm.plugin.websearch.l2.f(map, "signature");
        dVar.f412839f = com.tencent.mm.plugin.websearch.l2.e(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        dVar.f412840g = com.tencent.mm.plugin.websearch.l2.e(map, "sceneActionType", 1);
        r45.va0 va0Var = new r45.va0();
        dVar.f412841h = va0Var;
        va0Var.f388021d = com.tencent.mm.plugin.websearch.l2.e(map, "brandFlag", 0);
        dVar.f412841h.f388024g = com.tencent.mm.plugin.websearch.l2.f(map, "iconUrl");
        dVar.f412841h.f388023f = com.tencent.mm.plugin.websearch.l2.f(map, "brandInfo");
        dVar.f412841h.f388022e = com.tencent.mm.plugin.websearch.l2.f(map, "externalInfo");
        dVar.f412842i = com.tencent.mm.plugin.websearch.l2.f(map, "searchId");
        dVar.f412843j = com.tencent.mm.plugin.websearch.l2.f(map, "searchClickId");
        dVar.f412844k = com.tencent.mm.plugin.websearch.l2.f(map, "query");
        dVar.f412845l = com.tencent.mm.plugin.websearch.l2.e(map, "position", 0);
        dVar.f412846m = com.tencent.mm.plugin.websearch.l2.c(map, "isCurrentDetailPage", false);
        dVar.f412847n = com.tencent.mm.plugin.websearch.l2.f(map, "extraParams");
        dVar.f412848o = com.tencent.mm.plugin.websearch.l2.e(map, "friendScene", 0);
        if (com.tencent.mm.plugin.websearch.l2.e(map, "bizTabType", 0) == 2) {
            dVar.f412849p = 1;
        } else {
            dVar.f412849p = 0;
        }
        return dVar;
    }

    public final void h(android.content.Context context, su4.d dVar, boolean z17) {
        int i17 = dVar.f412848o;
        if (i17 == 0) {
            if (dVar.f412840g == 2) {
                i17 = 89;
            } else if (z17) {
                i17 = 85;
            } else {
                int i18 = dVar.f412839f;
                i17 = (i18 == 3 || i18 == 16) ? dVar.f412846m ? 88 : 87 : 39;
            }
        }
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            su4.t2.a(dVar.f412834a);
        }
        java.lang.String username = dVar.f412834a;
        kotlin.jvm.internal.o.f(username, "username");
        if (g(context, username)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", dVar.f412834a);
        intent.putExtra("Contact_Nick", dVar.f412835b);
        intent.putExtra("Contact_BrandIconURL", dVar.f412836c);
        intent.putExtra("Contact_Signature", dVar.f412837d);
        intent.putExtra("Contact_VUser_Info_Flag", dVar.f412838e);
        intent.putExtra("Contact_Scene", i17);
        r45.va0 va0Var = dVar.f412841h;
        if (va0Var != null) {
            try {
                intent.putExtra("Contact_customInfo", va0Var.toByteArray());
            } catch (java.io.IOException unused) {
            }
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("Contact_Ext_Args_Search_Id", dVar.f412842i);
        bundle.putString("Contact_Ext_Args_Search_Click_Id", dVar.f412843j);
        bundle.putString("Contact_Ext_Args_Query_String", dVar.f412844k);
        bundle.putInt("Contact_Scene", i17);
        bundle.putInt("Contact_Ext_Args_Index", dVar.f412845l);
        bundle.putString("Contact_Ext_Extra_Params", dVar.f412847n);
        intent.putExtra("preChatTYPE", 10);
        intent.putExtra("Contact_Ext_Args", bundle);
        intent.putExtra("biz_profile_tab_type", dVar.f412849p);
        intent.putExtra("force_get_contact", true);
        j45.l.j(context, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
    }

    public final void i(android.content.Context context, java.lang.String str, android.os.Bundle bundle, int i17, java.lang.String str2, java.lang.String str3, int i18, java.lang.String str4, int i19, int i27, java.lang.String str5, int i28, java.lang.String str6) {
        java.lang.String str7;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("convertActivityFromTranslucent", false);
        intent.putExtra("customize_status_bar_color", i17);
        intent.putExtra("status_bar_style", str2);
        intent.putExtra("from_scence", i19);
        intent.putExtra("subtype", i27);
        intent.putExtra("key_h5pay_cookie", str5);
        intent.putExtra("key_enable_fts_quick", true);
        try {
            intent.putExtra("KPageScene", 1);
            if (r26.n0.N(str6)) {
                str7 = "";
                try {
                    if (!r26.n0.N(str)) {
                        java.lang.String queryParameter = android.net.Uri.parse(str).getQueryParameter("search_click_id");
                        if (queryParameter != null) {
                            str7 = queryParameter;
                        }
                    }
                } catch (java.lang.Exception unused) {
                }
            } else {
                str7 = str6;
            }
            intent.putExtra("KPageInfo", "{ \"searchClickId\" : \"" + str7 + "\"}");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.StartSearchItemDetailPageJSApi", e17, "startSearchItemDetailPageUrl getSearchClickId exception", new java.lang.Object[0]);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            intent.putExtra("prePublishId", str3);
            intent.putExtra("KPublisherId", str3);
        } else if (bundle != null && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(bundle.getString("publishIdPrefix", "gs"));
            sb6.append('_');
            byte[] bytes = str.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            sb6.append(kk.k.g(bytes));
            java.lang.String sb7 = sb6.toString();
            intent.putExtra("prePublishId", sb7);
            intent.putExtra("KPublisherId", sb7);
        }
        if (i18 > 0) {
            intent.putExtra("pay_channel", i18);
        }
        intent.putExtra("geta8key_scene", 65);
        intent.putExtra("preChatTYPE", 10);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            intent.putExtra("srcUsername", str4);
        }
        if (i28 == 3) {
            intent.putExtra("show_native_web_view", true);
        }
        j45.l.j(context, "webview", ".ui.tools.fts.MMSosWebViewUI", intent, null);
    }
}
