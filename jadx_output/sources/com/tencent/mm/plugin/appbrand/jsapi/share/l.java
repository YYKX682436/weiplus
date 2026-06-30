package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public abstract class l extends com.tencent.mm.plugin.appbrand.jsapi.f {

    /* renamed from: g, reason: collision with root package name */
    public final int f83173g = cf.b.a(this);

    /* renamed from: h, reason: collision with root package name */
    public boolean f83174h = false;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        try {
            L(c0Var, i17, F(c0Var, jSONObject));
        } catch (com.tencent.mm.plugin.appbrand.jsapi.share.t e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiShareAppMessageBase", e17, "hy: illegal params", new java.lang.Object[0]);
            java.lang.String message = e17.getMessage();
            this.f83174h = false;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (!(message == null ? "" : message).startsWith("fail")) {
                message = "fail: " + message;
            }
            c0Var.a(i17, p(message, null));
        }
    }

    public abstract com.tencent.mm.plugin.appbrand.jsapi.share.u C();

    public void D(android.content.Intent intent, com.tencent.mm.plugin.appbrand.jsapi.share.u uVar, com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07;
        if (uVar.f83265k || uVar.f83258d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareAppMessageBase", "fillIntentForForwardToWeWorkWhenSelectContactsIfNeed, forbid 1");
            intent.putExtra("selectionconversationui_forbid_send_to_wework", true);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareAppMessageBase", "fillIntentForForwardToWeWorkWhenSelectContactsIfNeed, do fill");
        intent.putExtra("from_scene_forward_to_wework", 6);
        intent.putExtra("content_type_forward_to_wework", 5);
        com.tencent.mm.plugin.appbrand.o6 t37 = c0Var.t3();
        if (t37 == null || (u07 = t37.u0()) == null) {
            str = null;
            str2 = null;
        } else {
            java.lang.String str3 = u07.f77280f;
            str2 = u07.f77279e;
            str = str3;
        }
        java.lang.String str4 = !android.text.TextUtils.isEmpty(uVar.C) ? uVar.C : uVar.f83263i;
        if (!android.text.TextUtils.isEmpty(str4)) {
            str4 = com.tencent.mm.plugin.appbrand.jsapi.share.n2.b(str4);
        }
        java.lang.String str5 = str4;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareAppMessageBase", "fillIntentForForwardToWeWorkWhenSelectContactsIfNeed, imgPath: %s", str5);
        intent.putExtra("Select_Data_Send_To_WeWork", new com.tencent.mm.sendtowework.AppBrandData(uVar.f83277w, uVar.f83262h, str, str5, str2, uVar.f83260f, java.lang.Integer.valueOf(uVar.f83259e)));
    }

    public void E(android.content.Intent intent, com.tencent.mm.plugin.appbrand.jsapi.share.u uVar) {
        intent.putExtra("Select_Conv_Type", 35);
        intent.putExtra("mutil_select_is_ret", !uVar.f83258d);
        intent.putExtra("select_is_ret", true);
        intent.putExtra("scene_from", 3);
        intent.putExtra("appbrand_params", uVar.I);
        intent.putExtra("Retr_Msg_Type", 2);
        uVar.f83271q.d(uVar, intent);
    }

    public com.tencent.mm.plugin.appbrand.jsapi.share.u F(com.tencent.mm.plugin.appbrand.service.c0 c0Var, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareAppMessageBase", "invoke share app message directly.");
        com.tencent.mm.plugin.appbrand.jsapi.share.u C = C();
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareAppMessageBase", "data is null");
            throw new com.tencent.mm.plugin.appbrand.jsapi.share.t("data is null");
        }
        android.app.Activity Z0 = c0Var.Z0();
        C.f83255a = Z0;
        if (Z0 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareAppMessageBase", "share app message fail, context is null");
            throw new com.tencent.mm.plugin.appbrand.jsapi.share.t("fail:internal error invalid android context");
        }
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = (com.tencent.mm.plugin.appbrand.page.n7) c0Var.W0(com.tencent.mm.plugin.appbrand.page.n7.class);
        C.f83256b = n7Var;
        if (n7Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareAppMessageBase", "share app message fail, pageView is null");
            throw new com.tencent.mm.plugin.appbrand.jsapi.share.t("current page do not exist");
        }
        com.tencent.mm.plugin.appbrand.menu.u0 H1 = n7Var.H1(3);
        if (H1 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareAppMessageBase", "share app message fail, menuInfo is null.");
            throw new com.tencent.mm.plugin.appbrand.jsapi.share.t("menu is null");
        }
        java.lang.String optString = jSONObject.optString("type");
        com.tencent.mm.plugin.appbrand.weishi.c.a(c0Var.t3());
        if (k01.j.f303039a.b(null, c0Var.t3().f74803n)) {
            optString = "native_game_card";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            optString = "normal";
        }
        C.P = jSONObject.optString(ya.b.ORIGIN, "");
        java.lang.String optString2 = jSONObject.optString("to");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareAppMessageBase", "hy: share type is %s", optString);
        C.f83271q = "video".equalsIgnoreCase(optString) ? new com.tencent.mm.plugin.appbrand.jsapi.share.a0() : "h5".equalsIgnoreCase(optString) ? new com.tencent.mm.plugin.appbrand.jsapi.share.x() : "weishi".equalsIgnoreCase(optString) ? new com.tencent.mm.plugin.appbrand.jsapi.share.b0() : "native_game_card".equals(optString) ? new com.tencent.mm.plugin.appbrand.jsapi.share.y() : new com.tencent.mm.plugin.appbrand.jsapi.share.z(null);
        C.f83257c = c0Var.t3().E0();
        boolean d17 = H1.f85996d.d("enable_share_with_share_ticket", false);
        C.f83258d = d17;
        if (!d17 && (c0Var instanceof com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.x)) {
            C.f83258d = "withShareTicket".equals(jSONObject.optString("mode"));
        }
        C.H = H1.f85996d.d("is_todo_message", false);
        C.G = H1.f85996d.f("share_todo_activity_id", "");
        C.f83259e = C.f83258d ? 3 : 2;
        C.f83260f = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C.f83261g = jSONObject.optString("desc", "");
        C.f83262h = jSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
        C.f83263i = jSONObject.optString("imageUrl");
        C.f83264j = jSONObject.optString("cacheKey");
        boolean optBoolean = jSONObject.optBoolean("disableForward", false);
        C.f83265k = optBoolean;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareAppMessageBase", "disableForward:%b", java.lang.Boolean.valueOf(optBoolean));
        C.f83266l = jSONObject.optString("messageExtraData");
        C.f83267m = jSONObject.optInt("cardSubType", 0);
        C.D = jSONObject.optBoolean("useDefaultSnapshot", true);
        C.f83268n = optString2;
        C.f83269o = jSONObject.optString("thumbDataHash");
        C.f83270p = jSONObject.optString("signature");
        C.L = jSONObject.optBoolean("hasRelievedBuyPlugin");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareAppMessageBase", "thumbDataHash:%s, signature:%s", C.f83269o, C.f83270p);
        C.M = H1.f85996d.d("share_useForChatTool", false) ? "subpackage" : "";
        C.N = H1.f85996d.f("share_participant", "");
        C.O = H1.f85996d.e("share_choose_type", 1);
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = c0Var.t3().u0();
        if (u07 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShareAppMessageBase", "hy: no init config");
            throw new com.tencent.mm.plugin.appbrand.jsapi.share.t("no init config");
        }
        C.f83272r = H1.f85996d.g("enable_share_dynamic");
        C.f83273s = H1.f85996d.g("enable_share_with_updateable_msg");
        C.f83274t = H1.f85996d.g("enable_share_with_private_msg");
        C.f83275u = H1.f85996d.f("enable_share_with_updateable_msg_template_id", "");
        C.f83276v = c0Var.getAppId();
        C.f83277w = u07.f47278x;
        C.f83278x = C.f83257c.f305852r.f75399d;
        C.f83279y = C.f83257c.f305852r.pkgVersion;
        C.f83280z = c0Var.t3().u0().f47284z;
        C.A = com.tencent.mm.plugin.appbrand.v9.b(c0Var.getAppId());
        C.B = com.tencent.mm.sdk.platformtools.t8.K0(C.f83263i);
        java.lang.String e17 = com.tencent.mm.plugin.appbrand.jsapi.share.n2.e(C.f83256b, C.f83263i, C.D);
        C.C = e17;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareAppMessageBase", "imgPath[%s] imageUrl[%s] default[%s]", e17, C.f83263i, java.lang.Boolean.valueOf(C.D));
        java.util.HashMap hashMap = new java.util.HashMap();
        C.I = hashMap;
        hashMap.put("desc", C.f83261g);
        C.I.put("type", java.lang.Integer.valueOf(C.f83259e));
        C.I.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, C.f83260f);
        C.I.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID, C.f83276v);
        C.I.put("pkg_type", java.lang.Integer.valueOf(C.f83278x));
        C.I.put("pkg_version", java.lang.Integer.valueOf(C.f83279y));
        C.I.put("img_url", C.f83263i);
        C.I.put("is_dynamic", java.lang.Boolean.valueOf(C.f83272r));
        C.I.put("cache_key", C.f83264j);
        C.I.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, C.f83262h);
        C.I.put("disableForward", java.lang.Boolean.valueOf(C.f83265k));
        C.I.put("subType", java.lang.Integer.valueOf(C.f83267m));
        C.I.put("thumbDataHash", C.f83269o);
        C.I.put("signature", C.f83270p);
        C.I.put(dm.i4.COL_USERNAME, C.f83277w);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(C.C)) {
            C.I.put("delay_load_img_path", C.C);
        }
        C.E = jSONObject.optString("openId");
        java.lang.String optString3 = jSONObject.optString("chatroomUsername");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString3)) {
            optString3 = H1.f85996d.f("share_to_user", "");
            c01.l2 l2Var = H1.f85996d;
            l2Var.getClass();
            if (!android.text.TextUtils.isEmpty("share_to_user")) {
                ((c01.k2) l2Var.f37305a).remove("share_to_user");
            }
        }
        C.F = optString3;
        C.f83271q.a(C, c0Var, jSONObject);
        com.tencent.mm.plugin.appbrand.page.n7 V0 = c0Var.V0();
        of1.w1 s37 = V0 == null ? null : V0.s3();
        if (s37 != null) {
            C.K = s37.getCurrentUrl();
        } else if (V0 instanceof com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.n) {
            C.K = jSONObject.optString("webViewUrl");
        }
        boolean optBoolean2 = jSONObject.optBoolean("sdk_isFromMenu", false);
        java.lang.String k17 = k();
        if (android.text.TextUtils.isEmpty(k17) || k17.equals(com.tencent.mm.plugin.appbrand.jsapi.share.k.NAME)) {
            C.f83254J = 0;
        } else if (k17.contains("ToSpecificContact")) {
            C.f83254J = 2;
        } else if (optBoolean2) {
            C.f83254J = 0;
        } else {
            C.f83254J = 1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareAppMessageBase", "hy: params: %s", C.toString());
        return C;
    }

    public void G(com.tencent.mm.plugin.appbrand.jsapi.share.SendAppMessageTask sendAppMessageTask, java.lang.String str, java.lang.String str2, boolean z17, com.tencent.mm.plugin.appbrand.service.c0 c0Var, com.tencent.mm.plugin.appbrand.jsapi.share.u uVar) {
        boolean b17;
        sendAppMessageTask.f83067m = str2;
        sendAppMessageTask.f83068n = str;
        sendAppMessageTask.f83062f = uVar.f83276v;
        com.tencent.mm.plugin.appbrand.o6 t37 = c0Var.t3();
        if (t37 == null || t37.u0() == null || !(t37.u0() instanceof com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiShareAppMessageBase", "hy: can not retrieve init config");
            sendAppMessageTask.Z = -1;
        } else {
            sendAppMessageTask.Z = t37.u0().L;
        }
        sendAppMessageTask.f83063g = uVar.f83277w;
        sendAppMessageTask.f83064h = uVar.f83260f;
        sendAppMessageTask.f83065i = uVar.f83261g;
        sendAppMessageTask.f83069o = uVar.A;
        sendAppMessageTask.f83076t = uVar.f83262h;
        sendAppMessageTask.f83080x = uVar.f83259e;
        sendAppMessageTask.f83075s = uVar.B;
        sendAppMessageTask.f83070p = uVar.f83263i;
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC appBrandSysConfigWC = uVar.f83257c;
        sendAppMessageTask.f83073q = appBrandSysConfigWC.f305843f;
        sendAppMessageTask.f83077u = appBrandSysConfigWC.f305852r.f75399d;
        sendAppMessageTask.f83078v = uVar.f83257c.f305852r.f75372md5;
        sendAppMessageTask.f83079w = uVar.f83257c.f305852r.pkgVersion;
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC appBrandSysConfigWC2 = uVar.f83257c;
        sendAppMessageTask.f83083y = appBrandSysConfigWC2.f305841d;
        sendAppMessageTask.f83086z = uVar.f83266l;
        sendAppMessageTask.K1 = appBrandSysConfigWC2.f77343z1;
        sendAppMessageTask.L1 = appBrandSysConfigWC2.C1;
        sendAppMessageTask.M1 = uVar.L;
        sendAppMessageTask.G = uVar.f83267m;
        sendAppMessageTask.H = uVar.f83269o;
        sendAppMessageTask.I = uVar.f83270p;
        sendAppMessageTask.F = uVar.f83265k ? 1 : 0;
        if (t37.E0() instanceof com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC) {
            sendAppMessageTask.R1 = k91.a.f305523g.a(t37.E0());
        }
        sendAppMessageTask.f83061J = com.tencent.mm.plugin.appbrand.m6.a(uVar.f83276v).f85709b.getAndIncrement();
        sendAppMessageTask.N = uVar.f83256b.X1();
        sendAppMessageTask.P = uVar.f83256b.J1();
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject l27 = uVar.f83256b.getRuntime().l2();
        if (l27 != null) {
            int i17 = l27.f87790f;
            if (i17 == 0) {
                i17 = 1000;
            }
            sendAppMessageTask.K = i17;
            java.lang.String str3 = l27.f87791g;
            if (str3 == null) {
                str3 = "";
            }
            sendAppMessageTask.L = str3;
            java.lang.String str4 = uVar.f83256b.getRuntime().u0().f47276v;
            if (str4 == null) {
                str4 = "";
            }
            sendAppMessageTask.M = str4;
        }
        sendAppMessageTask.f83074r = com.tencent.mm.plugin.appbrand.jsapi.share.n2.b(uVar.C);
        sendAppMessageTask.Q = uVar.f83258d;
        sendAppMessageTask.R = uVar.f83272r;
        sendAppMessageTask.S = uVar.f83273s;
        sendAppMessageTask.T = uVar.f83274t;
        sendAppMessageTask.V = uVar.f83275u;
        sendAppMessageTask.W = uVar.f83264j;
        sendAppMessageTask.Y = uVar.f83280z;
        sendAppMessageTask.X = uVar.K;
        uVar.f83271q.b(uVar, sendAppMessageTask, c0Var);
        sendAppMessageTask.O1 = uVar.H;
        sendAppMessageTask.N1 = uVar.G;
        sendAppMessageTask.P1 = z17;
        sendAppMessageTask.Q1 = uVar.f83254J;
        sendAppMessageTask.S1 = uVar.M;
        sendAppMessageTask.U1 = uVar.N;
        sendAppMessageTask.V1 = uVar.O;
        j91.d dVar = (j91.d) t37.K1(j91.d.class);
        if (dVar != null) {
            com.tencent.mm.plugin.appbrand.jsapi.chattool.t tVar = (com.tencent.mm.plugin.appbrand.jsapi.chattool.t) dVar;
            if (tVar.f()) {
                sendAppMessageTask.T1 = tVar.c();
                sendAppMessageTask.X1 = tVar.e();
                return;
            }
            synchronized (tVar) {
                java.lang.String chatToolMode = tVar.f80460h;
                kotlin.jvm.internal.o.g(chatToolMode, "chatToolMode");
                b17 = kotlin.jvm.internal.o.b(chatToolMode, "subpackage");
            }
            if (b17) {
                sendAppMessageTask.T1 = tVar.c();
                sendAppMessageTask.X1 = new java.util.ArrayList();
            } else {
                sendAppMessageTask.T1 = "";
                sendAppMessageTask.X1 = new java.util.ArrayList();
            }
        }
    }

    public java.util.Map H(com.tencent.mm.plugin.appbrand.jsapi.share.u uVar, com.tencent.mm.plugin.appbrand.jsapi.share.SendAppMessageTask sendAppMessageTask, java.lang.String str) {
        if (!uVar.f83258d) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.L0(sendAppMessageTask.I1)) {
                java.util.Iterator it = sendAppMessageTask.I1.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.plugin.appbrand.jsapi.share.ShareInfo shareInfo = (com.tencent.mm.plugin.appbrand.jsapi.share.ShareInfo) it.next();
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("shareKey", shareInfo.f83094d);
                    jSONObject.put("shareName", shareInfo.f83095e);
                    jSONArray.put(jSONObject);
                }
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShareAppMessageBase", android.util.Log.getStackTraceString(e17));
        }
        hashMap.put("shareInfos", jSONArray);
        return hashMap;
    }

    public void I(com.tencent.mm.plugin.appbrand.jsapi.share.u uVar) {
    }

    public void J(com.tencent.mm.plugin.appbrand.jsapi.share.u uVar, int i17) {
    }

    public void K(boolean z17, com.tencent.mm.plugin.appbrand.jsapi.share.u uVar, java.lang.String str) {
    }

    public void L(com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.share.u uVar) {
        java.lang.String str;
        java.lang.String str2;
        android.content.Intent intent = new android.content.Intent();
        E(intent, uVar);
        if (this.f83174h) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiShareAppMessageBase", "shareAppMessage, last share not complete");
            c0Var.a(i17, o("fail:last share not complete"));
            return;
        }
        this.f83174h = true;
        if (!"__wx_assistant_custom".equals(uVar.P)) {
            if (!android.text.TextUtils.isEmpty(uVar.f83268n) && uVar.f83268n.equals("qyweixin")) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShareAppMessageBase", "shareAppMessage, share to wework, why?");
                this.f83174h = false;
                return;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(uVar.E) && com.tencent.mm.sdk.platformtools.t8.K0(uVar.F)) {
                D(intent, uVar, c0Var);
                M(c0Var, i17, uVar, intent, false);
                return;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(uVar.F)) {
                intent.putExtra("Select_Conv_User", uVar.F);
                intent.putExtra("KSendWording", uVar.f83255a.getResources().getString(com.tencent.mm.R.string.a4x));
                M(c0Var, i17, uVar, intent, true);
                return;
            }
            r45.q46 q46Var = new r45.q46();
            q46Var.f383678d = uVar.f83276v;
            q46Var.f383679e = uVar.E;
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70667d = 1961;
            lVar.f70666c = "/cgi-bin/mmbiz-bin/wxabusiness/share_transid";
            lVar.f70664a = q46Var;
            lVar.f70665b = new r45.r46();
            ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar.a(), new com.tencent.mm.plugin.appbrand.jsapi.share.m(this, intent, uVar, c0Var, i17));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareAppMessageBase", "shareAppMessage, custom origin");
        com.tencent.mm.plugin.appbrand.jsapi.share.h hVar = (com.tencent.mm.plugin.appbrand.jsapi.share.h) c0Var.t3().K1(com.tencent.mm.plugin.appbrand.jsapi.share.h.class);
        if (hVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiShareAppMessageBase", "shareAppMessage, custom origin, shareAppMessageService is null");
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            c0Var.a(i17, u(str2, jSONObject));
            return;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = ((com.tencent.mm.plugin.appbrand.jsapi.share.v1) hVar).f83289d;
        if (true ^ copyOnWriteArrayList.isEmpty()) {
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                android.support.v4.media.f.a(it.next());
                try {
                    throw null;
                    break;
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ShareAppMessageService", "customInvoke: delegate failed, " + e18);
                }
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.ShareAppMessageService", "No delegate registered, skip custom invoke");
        str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
        str2 = str != null ? str : "";
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 4);
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
        }
        c0Var.a(i17, u(str2, jSONObject2));
    }

    public final void M(com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.share.u uVar, android.content.Intent intent, boolean z17) {
        com.tencent.mm.plugin.appbrand.page.n7 N2;
        ce.g gVar;
        com.tencent.mm.plugin.appbrand.jsapi.share.n nVar = new com.tencent.mm.plugin.appbrand.jsapi.share.n(this, c0Var, i17, uVar);
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        boolean z18 = uVar.f83271q instanceof com.tencent.mm.plugin.appbrand.jsapi.share.z;
        com.tencent.mm.plugin.appbrand.o6 t37 = c0Var.t3();
        if (z18 && t37 != null && t37.q2() && (N2 = t37.N2()) != null && (gVar = (ce.g) N2.B1(ce.g.class)) != null) {
            ((ce.o) gVar).V(false, true, null);
        }
        c0Var.j(new com.tencent.mm.plugin.appbrand.jsapi.share.q(this, uVar, nVar, z18, t37, z17, intent), uVar.f83271q.e(uVar) ? 200L : 0L);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public boolean z() {
        return true;
    }
}
