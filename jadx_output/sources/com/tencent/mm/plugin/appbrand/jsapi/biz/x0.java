package com.tencent.mm.plugin.appbrand.jsapi.biz;

/* loaded from: classes7.dex */
public final class x0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1259;
    private static final java.lang.String NAME = "handleBrandPersonalCenterAction";

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.AppBrandRuntime f80020g;

    /* renamed from: h, reason: collision with root package name */
    public final u81.f f80021h = new com.tencent.mm.plugin.appbrand.jsapi.biz.w0(this);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        u81.h hVar;
        boolean z17;
        int i18;
        boolean z18;
        java.lang.String str;
        int i19;
        int i27;
        int i28;
        if (jSONObject == null || lVar == null) {
            return;
        }
        int optInt = jSONObject.optInt("actionType", -1);
        int optInt2 = jSONObject.optInt(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, -1);
        int optInt3 = jSONObject.optInt("c2bRedDotCount", -1);
        switch (optInt) {
            case 1:
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "jump 2 my biz");
                ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).bj(lVar.getContext(), jSONObject.optInt("bizType", 1));
                return;
            case 2:
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "jump 2 RecentRead");
                android.content.Intent intent = new android.content.Intent();
                intent.addFlags(67108864);
                intent.putExtra("biz_time_line_line_session_id", optInt2);
                j45.l.j(lVar.getContext(), "brandservice", ".ui.personalcenter.recentread.BizPCRecentReadUI", intent, null);
                return;
            case 3:
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "jump 2 Notification");
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("biz_time_line_line_enter_scene", 2);
                intent2.putExtra("biz_time_line_line_session_id", optInt2);
                j45.l.j(lVar.getContext(), "brandservice", ".ui.timeline.BizTimeLineNewMsgUI", intent2, null);
                return;
            case 4:
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "jump 2 Setting");
                j45.l.j(lVar.getContext(), "brandservice", ".ui.timeline.BizTimeLineSettingUI", new android.content.Intent(), null);
                return;
            case 5:
                com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.x2.f193072b, new com.tencent.mm.ipcinvoker.type.IPCInteger(optInt3), com.tencent.mm.plugin.appbrand.jsapi.biz.l.class, new com.tencent.mm.plugin.appbrand.jsapi.biz.m0(lVar, i17, this));
                return;
            case 6:
                com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.x2.f193072b, new com.tencent.mm.ipcinvoker.type.IPCVoid(), com.tencent.mm.plugin.appbrand.jsapi.biz.m.class, new com.tencent.mm.plugin.appbrand.jsapi.biz.n0(lVar, i17, this));
                return;
            case 7:
                com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.x2.f193072b, new com.tencent.mm.ipcinvoker.type.IPCVoid(), com.tencent.mm.plugin.appbrand.jsapi.biz.f0.class, new com.tencent.mm.plugin.appbrand.jsapi.biz.o0(lVar, i17, this));
                return;
            case 8:
                java.lang.String optString = jSONObject.optString("userName", "");
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "handleBrandPersonalCenterAction begin launch profile with name " + optString);
                kotlin.jvm.internal.o.d(optString);
                if (optString.length() == 0) {
                    return;
                }
                com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
                com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = yVar.t3();
                this.f80020g = t37;
                if (t37 != null && (hVar = t37.N) != null) {
                    hVar.a(this.f80021h);
                }
                android.content.Intent intent3 = new android.content.Intent();
                intent3.putExtra("Contact_User", optString);
                intent3.putExtra("Kdel_from", 0);
                intent3.putExtra("preUsername", optString);
                intent3.putExtra("preChatName", optString);
                intent3.putExtra("Contact_IsBizAuthor", true);
                intent3.putExtra("force_get_contact", true);
                intent3.putExtra("key_use_new_contact_profile", true);
                intent3.addFlags(268435456);
                intent3.addFlags(67108864);
                j45.l.n(yVar.getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent3, 213);
                java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                java.lang.String str3 = str2 == null ? "" : str2;
                java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("errno", 0);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                yVar.a(i17, u(str3, jSONObject2));
                return;
            case 9:
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "handleBrandPersonalCenterAction begin set msg list");
                java.lang.String optString2 = jSONObject.optString("appMsgIds", "");
                int optInt4 = jSONObject.optInt("bizType", 1);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("appMsgIds", optString2);
                bundle.putInt("bizType", optInt4);
                com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.x2.f193072b, bundle, com.tencent.mm.plugin.appbrand.jsapi.biz.d0.class, new com.tencent.mm.plugin.appbrand.jsapi.biz.p0(lVar, i17, this));
                return;
            case 10:
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "handleBrandPersonalCenterAction begin get msg list");
                com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.x2.f193072b, new com.tencent.mm.ipcinvoker.type.IPCInteger(jSONObject.optInt("bizType", 1)), com.tencent.mm.plugin.appbrand.jsapi.biz.t.class, new com.tencent.mm.plugin.appbrand.jsapi.biz.q0(lVar, i17, this));
                return;
            case 11:
                java.lang.String optString3 = jSONObject.optString("userName", "");
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "handleBrandPersonalCenterAction share biz " + optString3);
                kotlin.jvm.internal.o.d(optString3);
                if (optString3.length() == 0) {
                    return;
                }
                android.content.Context context = lVar.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
                if (activity == null) {
                    z17 = false;
                } else {
                    android.content.Intent intent4 = new android.content.Intent();
                    intent4.putExtra("Select_Talker_Name", optString3);
                    intent4.putExtra("Select_block_List", optString3);
                    intent4.putExtra("Select_Send_Card", true);
                    intent4.putExtra("Select_Conv_Type", 3);
                    intent4.putExtra("mutil_select_is_ret", true);
                    intent4.setClassName(activity, "com.tencent.mm.ui.transmit.SelectConversationUI");
                    nf.g.a(activity).j(intent4, com.tencent.mm.plugin.appbrand.jsapi.biz.h0.f79964a);
                    z17 = true;
                }
                if (z17) {
                    java.lang.String str5 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                    java.lang.String str6 = str5 == null ? "" : str5;
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    try {
                        jSONObject3.put("errno", 0);
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                    }
                    lVar.a(i17, u(str6, jSONObject3));
                    return;
                }
                java.lang.String str8 = android.text.TextUtils.isEmpty(null) ? "fail:cgi failed for response null" : null;
                java.lang.String str9 = str8 == null ? "" : str8;
                java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                try {
                    jSONObject4.put("errno", 109);
                } catch (java.lang.Exception e19) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
                }
                lVar.a(i17, u(str9, jSONObject4));
                return;
            case 12:
                java.lang.String optString4 = jSONObject.optString("userName", "");
                jSONObject.optInt("bizType", 1);
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "handleBrandPersonalCenterAction update biz profile " + optString4);
                kotlin.jvm.internal.o.d(optString4);
                if (optString4.length() == 0) {
                    return;
                }
                com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.x2.f193072b, new com.tencent.mm.ipcinvoker.type.IPCBoolean(true), com.tencent.mm.plugin.appbrand.jsapi.biz.e0.class, new com.tencent.mm.plugin.appbrand.jsapi.biz.r0(lVar, i17, this));
                return;
            case 13:
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("params");
                int optInt5 = optJSONObject != null ? optJSONObject.optInt("type", 0) : 0;
                java.lang.String optString5 = optJSONObject != null ? optJSONObject.optString("draftData", "") : null;
                if (optString5 == null) {
                    optString5 = "";
                }
                if (optInt5 != 0) {
                    if (!(optString5.length() == 0)) {
                        if (optJSONObject != null) {
                            tk.s[] sVarArr = tk.s.f419870d;
                            i18 = optJSONObject.optInt("bizType", 1);
                        } else {
                            tk.s[] sVarArr2 = tk.s.f419870d;
                            i18 = 1;
                        }
                        java.lang.String optString6 = optJSONObject != null ? optJSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "") : null;
                        if (optString6 == null) {
                            optString6 = "";
                        }
                        ur1.s sVar = (ur1.s) ((rm.b0) i95.n0.c(rm.b0.class));
                        sVar.getClass();
                        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
                        com.tencent.mars.xlog.Log.i("BizPersonalDraftFeatureService", "write draft draftType: " + optInt5 + ", scene: " + optString6 + ", bizType: " + i18 + ", contentLen: " + optString5.length() + ", contentMd5: " + com.tencent.mm.sdk.platformtools.w2.b(optString5.getBytes()) + ", contentPrefix: " + r26.p0.E0(optString5, 200));
                        if (sVar.wi(optString6)) {
                            java.nio.charset.Charset forName = java.nio.charset.Charset.forName("utf8");
                            kotlin.jvm.internal.o.f(forName, "forName(...)");
                            byte[] bytes = optString5.getBytes(forName);
                            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                            if (bytes.length > 5242880) {
                                com.tencent.mars.xlog.Log.w("BizPersonalDraftFeatureService", "write draft data too large, size=" + bytes.length);
                                z18 = false;
                            } else {
                                java.lang.String Ni = sVar.Ni(optInt5, i18);
                                z18 = sVar.Di().H(Ni, bytes);
                                com.tencent.mars.xlog.Log.i("BizPersonalDraftFeatureService", "writeDraft MMKV ret: " + z18 + ", mmkvKey: " + Ni + ", byteSize: " + bytes.length);
                            }
                        } else {
                            java.lang.String Ri = sVar.Ri(optInt5, optString6);
                            ((ku5.t0) ku5.t0.f312615d).h(new ur1.r(new com.tencent.mm.vfs.r6(Ri), Ri, optString5), "BizPersonalDraftFile");
                            z18 = true;
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "write draft ret: " + z18);
                        if (z18) {
                            java.lang.String str11 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                            java.lang.String str12 = str11 == null ? "" : str11;
                            java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                            try {
                                jSONObject5.put("errno", 0);
                            } catch (java.lang.Exception e27) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
                            }
                            lVar.a(i17, u(str12, jSONObject5));
                            return;
                        }
                        java.lang.String str14 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi returns empty data" : null;
                        java.lang.String str15 = str14 == null ? "" : str14;
                        java.lang.String str16 = com.tencent.mm.sdk.platformtools.z.f193105a;
                        org.json.JSONObject jSONObject6 = new org.json.JSONObject();
                        try {
                            jSONObject6.put("errno", 107);
                        } catch (java.lang.Exception e28) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e28);
                        }
                        lVar.a(i17, u(str15, jSONObject6));
                        return;
                    }
                }
                java.lang.String str17 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi returns empty data" : null;
                java.lang.String str18 = str17 == null ? "" : str17;
                java.lang.String str19 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject7 = new org.json.JSONObject();
                try {
                    jSONObject7.put("errno", 107);
                } catch (java.lang.Exception e29) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e29);
                }
                lVar.a(i17, u(str18, jSONObject7));
                return;
            case 14:
                org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("params");
                int optInt6 = optJSONObject2 != null ? optJSONObject2.optInt("type", 0) : 0;
                if (optInt6 != 0) {
                    tk.s[] sVarArr3 = tk.s.f419870d;
                    int optInt7 = optJSONObject2 != null ? optJSONObject2.optInt("bizType", 1) : 1;
                    java.lang.String optString7 = optJSONObject2 != null ? optJSONObject2.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "") : null;
                    str = optString7 != null ? optString7 : "";
                    ((ur1.s) ((rm.b0) i95.n0.c(rm.b0.class))).Vi(optInt6, str, optInt7, new com.tencent.mm.plugin.appbrand.jsapi.biz.s0(optInt6, str, lVar, i17, this));
                    return;
                }
                java.lang.String str20 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi returns empty data" : null;
                str = str20 != null ? str20 : "";
                java.lang.String str21 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject8 = new org.json.JSONObject();
                try {
                    jSONObject8.put("errno", 107);
                } catch (java.lang.Exception e37) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e37);
                }
                lVar.a(i17, u(str, jSONObject8));
                return;
            case 15:
                org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("params");
                int optInt8 = optJSONObject3 != null ? optJSONObject3.optInt("type", 0) : 0;
                if (optInt8 == 0) {
                    return;
                }
                tk.s[] sVarArr4 = tk.s.f419870d;
                int optInt9 = optJSONObject3 != null ? optJSONObject3.optInt("bizType", 1) : 1;
                java.lang.String optString8 = optJSONObject3 != null ? optJSONObject3.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "") : null;
                if (optString8 == null) {
                    optString8 = "";
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "clear draft draftType: " + optInt8 + ", scene: " + optString8 + ", bizType:" + optInt9);
                ((ur1.s) ((rm.b0) i95.n0.c(rm.b0.class))).Ai(optInt8, optString8, optInt9);
                if (optInt8 == 2) {
                    com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCDeleteDraftTaskInput(optString8, optInt9), com.tencent.mm.plugin.appbrand.jsapi.biz.o.class, com.tencent.mm.plugin.appbrand.jsapi.biz.t0.f80013d);
                }
                java.lang.String str22 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                str = str22 != null ? str22 : "";
                java.lang.String str23 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject9 = new org.json.JSONObject();
                try {
                    jSONObject9.put("errno", 0);
                } catch (java.lang.Exception e38) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e38);
                }
                lVar.a(i17, u(str, jSONObject9));
                return;
            case 16:
                int optInt10 = jSONObject.optInt("bizType", 1);
                int i29 = optInt10 == 2 ? 5 : 0;
                android.content.Intent intent5 = new android.content.Intent();
                intent5.putExtra("serviceType", i29);
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "ACTION_NOTIFY_BLACK_LIST bizType: " + optInt10);
                android.content.Context context2 = lVar.getContext();
                if (context2 == null) {
                    context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                }
                j45.l.j(context2, "brandservice", ".conversation.ui.BizFansBlackListUI", intent5, null);
                return;
            case 17:
            default:
                return;
            case 18:
                boolean optBoolean = jSONObject.optBoolean("needCheckBiz");
                int optInt11 = jSONObject.optInt("bizType", 1);
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "ACTION_GET_BIZ bizType: " + optInt11 + ", needCheckBiz: " + optBoolean);
                com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.brandService.GetBizRequest(optBoolean, optInt11, false), rm.a0.class, new com.tencent.mm.plugin.appbrand.jsapi.biz.u0(lVar, i17, this));
                return;
            case 19:
                java.lang.String optString9 = jSONObject.optString("url", "");
                kotlin.jvm.internal.o.d(optString9);
                if (optString9.length() == 0) {
                    java.lang.String str24 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi returns empty data" : null;
                    str = str24 != null ? str24 : "";
                    java.lang.String str25 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    org.json.JSONObject jSONObject10 = new org.json.JSONObject();
                    try {
                        jSONObject10.put("errno", 107);
                    } catch (java.lang.Exception e39) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e39);
                    }
                    lVar.a(i17, u(str, jSONObject10));
                    return;
                }
                if (((zq1.a0) gm0.j1.s(zq1.a0.class)) == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandleBrandPersonalCenterAction", "cleanPageData: service is null");
                    java.lang.String str26 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi returns empty data" : null;
                    str = str26 != null ? str26 : "";
                    java.lang.String str27 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    org.json.JSONObject jSONObject11 = new org.json.JSONObject();
                    try {
                        jSONObject11.put("errno", 107);
                    } catch (java.lang.Exception e47) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e47);
                    }
                    lVar.a(i17, u(str, jSONObject11));
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "cleanPageData");
                com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94435a.l(optString9);
                java.lang.String str28 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                str = str28 != null ? str28 : "";
                java.lang.String str29 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject12 = new org.json.JSONObject();
                try {
                    jSONObject12.put("errno", 0);
                } catch (java.lang.Exception e48) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e48);
                }
                lVar.a(i17, u(str, jSONObject12));
                return;
            case 20:
                java.lang.String optString10 = jSONObject.optString("prompt", "");
                java.lang.String optString11 = jSONObject.optString("aiPicId", "");
                int optInt12 = jSONObject.optInt("editScene", 0);
                kotlin.jvm.internal.o.d(optString11);
                if (!(optString11.length() == 0)) {
                    kotlin.jvm.internal.o.d(optString10);
                    com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskInput(0, 0, optString10, optString11, optInt12), com.tencent.mm.plugin.appbrand.jsapi.biz.r.class, new com.tencent.mm.plugin.appbrand.jsapi.biz.k0(lVar, i17, this));
                    return;
                }
                java.lang.String str30 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi returns empty data" : null;
                str = str30 != null ? str30 : "";
                java.lang.String str31 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject13 = new org.json.JSONObject();
                try {
                    jSONObject13.put("errno", 107);
                } catch (java.lang.Exception e49) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e49);
                }
                lVar.a(i17, u(str, jSONObject13));
                return;
            case 21:
                org.json.JSONObject optJSONObject4 = jSONObject.optJSONObject("params");
                if (optJSONObject4 != null) {
                    i27 = optJSONObject4.optInt("type", 0);
                    i19 = 2;
                } else {
                    i19 = 2;
                    i27 = 0;
                }
                if (i27 == i19) {
                    java.lang.String optString12 = optJSONObject4 != null ? optJSONObject4.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "") : null;
                    java.lang.String str32 = optString12 == null ? "" : optString12;
                    if (optJSONObject4 != null) {
                        tk.s[] sVarArr5 = tk.s.f419870d;
                        i28 = optJSONObject4.optInt("bizType", 1);
                    } else {
                        tk.s[] sVarArr6 = tk.s.f419870d;
                        i28 = 1;
                    }
                    com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCGetDraftTaskInput(str32, i28), com.tencent.mm.plugin.appbrand.jsapi.biz.v.class, new com.tencent.mm.plugin.appbrand.jsapi.biz.l0(i27, str32, i28, lVar, i17, this));
                    return;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandleBrandPersonalCenterAction", "draftType not support");
                java.lang.String str33 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi returns empty data" : null;
                str = str33 != null ? str33 : "";
                java.lang.String str34 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject14 = new org.json.JSONObject();
                try {
                    jSONObject14.put("errno", 107);
                } catch (java.lang.Exception e57) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e57);
                }
                lVar.a(i17, u(str, jSONObject14));
                return;
            case 22:
                boolean optBoolean2 = jSONObject.optBoolean("needCheckBiz");
                int optInt13 = jSONObject.optInt("bizType", 1);
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "ACTION_GET_ALL_BIZ bizType: " + optInt13 + ", needCheckBiz: " + optBoolean2);
                com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.brandService.GetBizRequest(optBoolean2, optInt13, true), rm.a0.class, new com.tencent.mm.plugin.appbrand.jsapi.biz.i0(lVar, i17, this));
                return;
            case 23:
                int optInt14 = jSONObject.optInt("enable", 0);
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "ACTION_SYNC_PHOTO_SWITCH enable: " + optInt14);
                com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.brandService.SyncPhotoRequest(optInt14 == 1), rm.g0.class, com.tencent.mm.plugin.appbrand.jsapi.biz.j0.f79971d);
                java.lang.String str35 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                str = str35 != null ? str35 : "";
                java.lang.String str36 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject15 = new org.json.JSONObject();
                try {
                    jSONObject15.put("errno", 0);
                } catch (java.lang.Exception e58) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e58);
                }
                lVar.a(i17, u(str, jSONObject15));
                return;
            case 24:
                org.json.JSONObject jSONObject16 = new org.json.JSONObject();
                jSONObject16.put("picTextNameVersion", ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Vi());
                jSONObject16.put("photoAccountOpen", ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Di() ? "1" : "0");
                jSONObject16.put("supportViewPhotoAcct", ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Vi());
                java.lang.String str37 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                str = str37 != null ? str37 : "";
                java.lang.String str38 = com.tencent.mm.sdk.platformtools.z.f193105a;
                try {
                    jSONObject16.put("errno", 0);
                } catch (java.lang.Exception e59) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e59);
                }
                lVar.a(i17, u(str, jSONObject16));
                return;
        }
    }
}
