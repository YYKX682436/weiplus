package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz;

/* loaded from: classes7.dex */
public final class x0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f33950x366c91de = 1259;

    /* renamed from: NAME */
    private static final java.lang.String f33951x24728b = "handleBrandPersonalCenterAction";

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f161553g;

    /* renamed from: h, reason: collision with root package name */
    public final u81.f f161554h = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.w0(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
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
        int optInt2 = jSONObject.optInt(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, -1);
        int optInt3 = jSONObject.optInt("c2bRedDotCount", -1);
        switch (optInt) {
            case 1:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "jump 2 my biz");
                ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).bj(lVar.mo50352x76847179(), jSONObject.optInt("bizType", 1));
                return;
            case 2:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "jump 2 RecentRead");
                android.content.Intent intent = new android.content.Intent();
                intent.addFlags(67108864);
                intent.putExtra("biz_time_line_line_session_id", optInt2);
                j45.l.j(lVar.mo50352x76847179(), "brandservice", ".ui.personalcenter.recentread.BizPCRecentReadUI", intent, null);
                return;
            case 3:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "jump 2 Notification");
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("biz_time_line_line_enter_scene", 2);
                intent2.putExtra("biz_time_line_line_session_id", optInt2);
                j45.l.j(lVar.mo50352x76847179(), "brandservice", ".ui.timeline.BizTimeLineNewMsgUI", intent2, null);
                return;
            case 4:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "jump 2 Setting");
                j45.l.j(lVar.mo50352x76847179(), "brandservice", ".ui.timeline.BizTimeLineSettingUI", new android.content.Intent(), null);
                return;
            case 5:
                com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2(optInt3), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.l.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.m0(lVar, i17, this));
                return;
            case 6:
                com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.m.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.n0(lVar, i17, this));
                return;
            case 7:
                com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.f0.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.o0(lVar, i17, this));
                return;
            case 8:
                java.lang.String optString = jSONObject.optString("userName", "");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "handleBrandPersonalCenterAction begin launch profile with name " + optString);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                if (optString.length() == 0) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = yVar.t3();
                this.f161553g = t37;
                if (t37 != null && (hVar = t37.N) != null) {
                    hVar.a(this.f161554h);
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
                j45.l.n(yVar.mo50352x76847179(), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent3, 213);
                java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                java.lang.String str3 = str2 == null ? "" : str2;
                java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("errno", 0);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                yVar.a(i17, u(str3, jSONObject2));
                return;
            case 9:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "handleBrandPersonalCenterAction begin set msg list");
                java.lang.String optString2 = jSONObject.optString("appMsgIds", "");
                int optInt4 = jSONObject.optInt("bizType", 1);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("appMsgIds", optString2);
                bundle.putInt("bizType", optInt4);
                com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.d0.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.p0(lVar, i17, this));
                return;
            case 10:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "handleBrandPersonalCenterAction begin get msg list");
                com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2(jSONObject.optInt("bizType", 1)), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.t.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.q0(lVar, i17, this));
                return;
            case 11:
                java.lang.String optString3 = jSONObject.optString("userName", "");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "handleBrandPersonalCenterAction share biz " + optString3);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString3);
                if (optString3.length() == 0) {
                    return;
                }
                android.content.Context mo50352x76847179 = lVar.mo50352x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo50352x76847179, "getContext(...)");
                android.app.Activity activity = mo50352x76847179 instanceof android.app.Activity ? (android.app.Activity) mo50352x76847179 : null;
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
                    nf.g.a(activity).j(intent4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.h0.f161497a);
                    z17 = true;
                }
                if (z17) {
                    java.lang.String str5 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                    java.lang.String str6 = str5 == null ? "" : str5;
                    java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    try {
                        jSONObject3.put("errno", 0);
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                    }
                    lVar.a(i17, u(str6, jSONObject3));
                    return;
                }
                java.lang.String str8 = android.text.TextUtils.isEmpty(null) ? "fail:cgi failed for response null" : null;
                java.lang.String str9 = str8 == null ? "" : str8;
                java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                try {
                    jSONObject4.put("errno", 109);
                } catch (java.lang.Exception e19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
                }
                lVar.a(i17, u(str9, jSONObject4));
                return;
            case 12:
                java.lang.String optString4 = jSONObject.optString("userName", "");
                jSONObject.optInt("bizType", 1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "handleBrandPersonalCenterAction update biz profile " + optString4);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString4);
                if (optString4.length() == 0) {
                    return;
                }
                com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(true), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.e0.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.r0(lVar, i17, this));
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
                            tk.s[] sVarArr = tk.s.f501403d;
                            i18 = optJSONObject.optInt("bizType", 1);
                        } else {
                            tk.s[] sVarArr2 = tk.s.f501403d;
                            i18 = 1;
                        }
                        java.lang.String optString6 = optJSONObject != null ? optJSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "") : null;
                        if (optString6 == null) {
                            optString6 = "";
                        }
                        ur1.s sVar = (ur1.s) ((rm.b0) i95.n0.c(rm.b0.class));
                        sVar.getClass();
                        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizPersonalDraftFeatureService", "write draft draftType: " + optInt5 + ", scene: " + optString6 + ", bizType: " + i18 + ", contentLen: " + optString5.length() + ", contentMd5: " + com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(optString5.getBytes()) + ", contentPrefix: " + r26.p0.E0(optString5, 200));
                        if (sVar.wi(optString6)) {
                            java.nio.charset.Charset forName = java.nio.charset.Charset.forName("utf8");
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(forName, "forName(...)");
                            byte[] bytes = optString5.getBytes(forName);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                            if (bytes.length > 5242880) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("BizPersonalDraftFeatureService", "write draft data too large, size=" + bytes.length);
                                z18 = false;
                            } else {
                                java.lang.String Ni = sVar.Ni(optInt5, i18);
                                z18 = sVar.Di().H(Ni, bytes);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizPersonalDraftFeatureService", "writeDraft MMKV ret: " + z18 + ", mmkvKey: " + Ni + ", byteSize: " + bytes.length);
                            }
                        } else {
                            java.lang.String Ri = sVar.Ri(optInt5, optString6);
                            ((ku5.t0) ku5.t0.f394148d).h(new ur1.r(new com.p314xaae8f345.mm.vfs.r6(Ri), Ri, optString5), "BizPersonalDraftFile");
                            z18 = true;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "write draft ret: " + z18);
                        if (z18) {
                            java.lang.String str11 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                            java.lang.String str12 = str11 == null ? "" : str11;
                            java.lang.String str13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                            try {
                                jSONObject5.put("errno", 0);
                            } catch (java.lang.Exception e27) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
                            }
                            lVar.a(i17, u(str12, jSONObject5));
                            return;
                        }
                        java.lang.String str14 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi returns empty data" : null;
                        java.lang.String str15 = str14 == null ? "" : str14;
                        java.lang.String str16 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                        org.json.JSONObject jSONObject6 = new org.json.JSONObject();
                        try {
                            jSONObject6.put("errno", 107);
                        } catch (java.lang.Exception e28) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e28);
                        }
                        lVar.a(i17, u(str15, jSONObject6));
                        return;
                    }
                }
                java.lang.String str17 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi returns empty data" : null;
                java.lang.String str18 = str17 == null ? "" : str17;
                java.lang.String str19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject7 = new org.json.JSONObject();
                try {
                    jSONObject7.put("errno", 107);
                } catch (java.lang.Exception e29) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e29);
                }
                lVar.a(i17, u(str18, jSONObject7));
                return;
            case 14:
                org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("params");
                int optInt6 = optJSONObject2 != null ? optJSONObject2.optInt("type", 0) : 0;
                if (optInt6 != 0) {
                    tk.s[] sVarArr3 = tk.s.f501403d;
                    int optInt7 = optJSONObject2 != null ? optJSONObject2.optInt("bizType", 1) : 1;
                    java.lang.String optString7 = optJSONObject2 != null ? optJSONObject2.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "") : null;
                    str = optString7 != null ? optString7 : "";
                    ((ur1.s) ((rm.b0) i95.n0.c(rm.b0.class))).Vi(optInt6, str, optInt7, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.s0(optInt6, str, lVar, i17, this));
                    return;
                }
                java.lang.String str20 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi returns empty data" : null;
                str = str20 != null ? str20 : "";
                java.lang.String str21 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject8 = new org.json.JSONObject();
                try {
                    jSONObject8.put("errno", 107);
                } catch (java.lang.Exception e37) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e37);
                }
                lVar.a(i17, u(str, jSONObject8));
                return;
            case 15:
                org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("params");
                int optInt8 = optJSONObject3 != null ? optJSONObject3.optInt("type", 0) : 0;
                if (optInt8 == 0) {
                    return;
                }
                tk.s[] sVarArr4 = tk.s.f501403d;
                int optInt9 = optJSONObject3 != null ? optJSONObject3.optInt("bizType", 1) : 1;
                java.lang.String optString8 = optJSONObject3 != null ? optJSONObject3.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "") : null;
                if (optString8 == null) {
                    optString8 = "";
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "clear draft draftType: " + optInt8 + ", scene: " + optString8 + ", bizType:" + optInt9);
                ((ur1.s) ((rm.b0) i95.n0.c(rm.b0.class))).Ai(optInt8, optString8, optInt9);
                if (optInt8 == 2) {
                    com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12027xa36b91a0(optString8, optInt9), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.o.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.t0.f161546d);
                }
                java.lang.String str22 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                str = str22 != null ? str22 : "";
                java.lang.String str23 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject9 = new org.json.JSONObject();
                try {
                    jSONObject9.put("errno", 0);
                } catch (java.lang.Exception e38) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e38);
                }
                lVar.a(i17, u(str, jSONObject9));
                return;
            case 16:
                int optInt10 = jSONObject.optInt("bizType", 1);
                int i29 = optInt10 == 2 ? 5 : 0;
                android.content.Intent intent5 = new android.content.Intent();
                intent5.putExtra("serviceType", i29);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "ACTION_NOTIFY_BLACK_LIST bizType: " + optInt10);
                android.content.Context mo50352x768471792 = lVar.mo50352x76847179();
                if (mo50352x768471792 == null) {
                    mo50352x768471792 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                }
                j45.l.j(mo50352x768471792, "brandservice", ".conversation.ui.BizFansBlackListUI", intent5, null);
                return;
            case 17:
            default:
                return;
            case 18:
                boolean optBoolean = jSONObject.optBoolean("needCheckBiz");
                int optInt11 = jSONObject.optInt("bizType", 1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "ACTION_GET_BIZ bizType: " + optInt11 + ", needCheckBiz: " + optBoolean);
                com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p646xf2865d2e.C10319x97e5a9d2(optBoolean, optInt11, false), rm.a0.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.u0(lVar, i17, this));
                return;
            case 19:
                java.lang.String optString9 = jSONObject.optString("url", "");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString9);
                if (optString9.length() == 0) {
                    java.lang.String str24 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi returns empty data" : null;
                    str = str24 != null ? str24 : "";
                    java.lang.String str25 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    org.json.JSONObject jSONObject10 = new org.json.JSONObject();
                    try {
                        jSONObject10.put("errno", 107);
                    } catch (java.lang.Exception e39) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e39);
                    }
                    lVar.a(i17, u(str, jSONObject10));
                    return;
                }
                if (((zq1.a0) gm0.j1.s(zq1.a0.class)) == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandleBrandPersonalCenterAction", "cleanPageData: service is null");
                    java.lang.String str26 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi returns empty data" : null;
                    str = str26 != null ? str26 : "";
                    java.lang.String str27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    org.json.JSONObject jSONObject11 = new org.json.JSONObject();
                    try {
                        jSONObject11.put("errno", 107);
                    } catch (java.lang.Exception e47) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e47);
                    }
                    lVar.a(i17, u(str, jSONObject11));
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "cleanPageData");
                com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.f175968a.l(optString9);
                java.lang.String str28 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                str = str28 != null ? str28 : "";
                java.lang.String str29 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject12 = new org.json.JSONObject();
                try {
                    jSONObject12.put("errno", 0);
                } catch (java.lang.Exception e48) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e48);
                }
                lVar.a(i17, u(str, jSONObject12));
                return;
            case 20:
                java.lang.String optString10 = jSONObject.optString("prompt", "");
                java.lang.String optString11 = jSONObject.optString("aiPicId", "");
                int optInt12 = jSONObject.optInt("editScene", 0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString11);
                if (!(optString11.length() == 0)) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString10);
                    com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12029xf366c7b6(0, 0, optString10, optString11, optInt12), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.r.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.k0(lVar, i17, this));
                    return;
                }
                java.lang.String str30 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi returns empty data" : null;
                str = str30 != null ? str30 : "";
                java.lang.String str31 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject13 = new org.json.JSONObject();
                try {
                    jSONObject13.put("errno", 107);
                } catch (java.lang.Exception e49) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e49);
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
                    java.lang.String optString12 = optJSONObject4 != null ? optJSONObject4.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "") : null;
                    java.lang.String str32 = optString12 == null ? "" : optString12;
                    if (optJSONObject4 != null) {
                        tk.s[] sVarArr5 = tk.s.f501403d;
                        i28 = optJSONObject4.optInt("bizType", 1);
                    } else {
                        tk.s[] sVarArr6 = tk.s.f501403d;
                        i28 = 1;
                    }
                    com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12031x15cd54c9(str32, i28), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.v.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.l0(i27, str32, i28, lVar, i17, this));
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandleBrandPersonalCenterAction", "draftType not support");
                java.lang.String str33 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi returns empty data" : null;
                str = str33 != null ? str33 : "";
                java.lang.String str34 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject14 = new org.json.JSONObject();
                try {
                    jSONObject14.put("errno", 107);
                } catch (java.lang.Exception e57) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e57);
                }
                lVar.a(i17, u(str, jSONObject14));
                return;
            case 22:
                boolean optBoolean2 = jSONObject.optBoolean("needCheckBiz");
                int optInt13 = jSONObject.optInt("bizType", 1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "ACTION_GET_ALL_BIZ bizType: " + optInt13 + ", needCheckBiz: " + optBoolean2);
                com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p646xf2865d2e.C10319x97e5a9d2(optBoolean2, optInt13, true), rm.a0.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.i0(lVar, i17, this));
                return;
            case 23:
                int optInt14 = jSONObject.optInt("enable", 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleBrandPersonalCenterAction", "ACTION_SYNC_PHOTO_SWITCH enable: " + optInt14);
                com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p646xf2865d2e.C10321x9368f258(optInt14 == 1), rm.g0.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.j0.f161504d);
                java.lang.String str35 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                str = str35 != null ? str35 : "";
                java.lang.String str36 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject15 = new org.json.JSONObject();
                try {
                    jSONObject15.put("errno", 0);
                } catch (java.lang.Exception e58) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e58);
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
                java.lang.String str38 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                try {
                    jSONObject16.put("errno", 0);
                } catch (java.lang.Exception e59) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e59);
                }
                lVar.a(i17, u(str, jSONObject16));
                return;
        }
    }
}
