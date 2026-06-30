package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e;

/* loaded from: classes15.dex */
public class t0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public t0() {
        super(0);
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.t0 t0Var, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5587xf7a06bec c5587xf7a06bec) {
        java.lang.Runnable runnable;
        t0Var.getClass();
        if (c5587xf7a06bec == null || (runnable = c5587xf7a06bec.f273897d) == null) {
            return;
        }
        c5587xf7a06bec.f135910h.f88087a = 2;
        runnable.run();
    }

    public com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f c(android.os.Bundle bundle) {
        com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f enumC3698xfb48f2f = com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f.APP;
        if (bundle == null || !bundle.containsKey("qbar_string_scan_source")) {
            return enumC3698xfb48f2f;
        }
        int i17 = bundle.getInt("qbar_string_scan_source", 0);
        return i17 != 0 ? i17 != 1 ? (i17 == 2 || i17 == 4) ? com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f.QR_CODE_FROM_LONG_PRESS : enumC3698xfb48f2f : com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f.QR_CODE_FROM_ALBUM : com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f.QR_CODE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        int i17;
        int i18;
        java.lang.String[] strArr;
        java.lang.String optString;
        am.df dfVar;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        boolean z17;
        double d17;
        boolean z18;
        boolean z19;
        boolean z27;
        java.lang.String str5;
        java.lang.String str6;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5587xf7a06bec c5587xf7a06bec = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5587xf7a06bec) abstractC20979x809547d1;
        if (gm0.j1.a()) {
            am.df dfVar2 = c5587xf7a06bec.f135909g;
            int i19 = dfVar2.f87979a;
            java.lang.String str7 = "";
            if (i19 == 55) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(dfVar2.f87980b);
                    java.lang.Object opt = jSONObject.opt("extra");
                    if (opt != null) {
                        org.json.JSONObject jSONObject2 = opt instanceof java.lang.String ? new org.json.JSONObject((java.lang.String) opt) : opt instanceof org.json.JSONObject ? (org.json.JSONObject) opt : null;
                        if (jSONObject2 != null && (optString = jSONObject2.optString("appid")) != null) {
                            java.lang.String optString2 = jSONObject2.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "");
                            org.json.JSONObject optJSONObject = jSONObject2.optJSONObject("query");
                            if (optJSONObject == null) {
                                optJSONObject = new org.json.JSONObject();
                            }
                            org.json.JSONObject jSONObject3 = optJSONObject;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a.b(7, new com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943());
                            try {
                                java.lang.String optString3 = jSONObject.optString("url");
                                if (optString3 != null) {
                                    android.net.Uri parse = android.net.Uri.parse(optString3);
                                    for (java.util.Iterator<java.lang.String> it = parse.getQueryParameterNames().iterator(); it.hasNext(); it = it) {
                                        java.lang.String next = it.next();
                                        jSONObject3.put(next, parse.getQueryParameter(next));
                                    }
                                }
                                int optInt = jSONObject.optInt("ret", 0);
                                if (optInt != 0) {
                                    jSONObject3.put("ret", optInt);
                                }
                            } catch (org.json.JSONException unused) {
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65443x856bf801(optString);
                            org.json.JSONObject optJSONObject2 = jSONObject2.optJSONObject("option");
                            if (optJSONObject2 != null) {
                                dfVar = dfVar2;
                                boolean optBoolean = optJSONObject2.optBoolean("syncCheckUpdate", true);
                                boolean optBoolean2 = optJSONObject2.optBoolean(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13307xd51ecb63, false);
                                z18 = optJSONObject2.optBoolean("isHalfScreen", false);
                                str = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13307xd51ecb63;
                                double optDouble = optJSONObject2.optDouble("heightPercent", 0.0d);
                                str3 = optJSONObject2.optString("minVersion", "");
                                java.lang.String optString4 = optJSONObject2.optString("animIn", "");
                                z19 = optBoolean;
                                str4 = optJSONObject2.optString("animOut", "");
                                str7 = optString4;
                                d17 = optDouble;
                                str2 = "currentAnimOut";
                                z17 = optBoolean2;
                            } else {
                                dfVar = dfVar2;
                                str = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13307xd51ecb63;
                                str2 = "currentAnimOut";
                                str3 = "";
                                str4 = str3;
                                z17 = false;
                                d17 = 0.0d;
                                z18 = false;
                                z19 = true;
                            }
                            android.os.Bundle bundle = new android.os.Bundle();
                            bundle.putString("appId", optString);
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
                                bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, optString2);
                            }
                            bundle.putString("query", jSONObject3.toString());
                            bundle.putBoolean("withDownloadLoading", false);
                            if (z17) {
                                z27 = true;
                                bundle.putBoolean(str, true);
                            } else {
                                z27 = true;
                            }
                            if (z18 && d17 > 0.0d) {
                                bundle.putBoolean("isHalfScreen", z27);
                                bundle.putDouble("heightPercent", d17);
                            }
                            if (u46.l.g(str3)) {
                                bundle.putString("minVersion", str3);
                            }
                            if (u46.l.g(str7)) {
                                try {
                                    org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                                    jSONObject4.put("nextAnimIn", str7);
                                    ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
                                    bundle.putInt("nextAnimIn", ra3.h0.a(jSONObject4));
                                } catch (org.json.JSONException e17) {
                                    str5 = "LiteAppDevQrCodeListener";
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str5, e17, "animIn invalid, animIn: %s", str7);
                                }
                            }
                            str5 = "LiteAppDevQrCodeListener";
                            if (u46.l.g(str4)) {
                                try {
                                    org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                                    java.lang.String str8 = str2;
                                    str6 = str4;
                                    try {
                                        jSONObject5.put(str8, str6);
                                        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
                                        bundle.putInt(str8, ra3.h0.b(jSONObject5));
                                    } catch (org.json.JSONException e18) {
                                        e = e18;
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str5, e, "animOut invalid, animOut: %s", str6);
                                        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80 c3708xc1f46f80 = new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80();
                                        am.df dfVar3 = dfVar;
                                        c3708xc1f46f80.f14311x683188c = c(dfVar3.f87982d);
                                        bundle.putParcelable("liteappReferrerInfo", c3708xc1f46f80);
                                        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk((android.content.Context) dfVar3.f87981c.get(), bundle, true, z19, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.s0(this, z17, c5587xf7a06bec));
                                        return true;
                                    }
                                } catch (org.json.JSONException e19) {
                                    e = e19;
                                    str6 = str4;
                                }
                            }
                            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80 c3708xc1f46f802 = new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80();
                            am.df dfVar32 = dfVar;
                            c3708xc1f46f802.f14311x683188c = c(dfVar32.f87982d);
                            bundle.putParcelable("liteappReferrerInfo", c3708xc1f46f802);
                            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk((android.content.Context) dfVar32.f87981c.get(), bundle, true, z19, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.s0(this, z17, c5587xf7a06bec));
                        }
                    }
                } catch (java.lang.Exception unused2) {
                }
            } else if (i19 == 42) {
                java.lang.String str9 = dfVar2.f87980b;
                if (str9 != null && !str9.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppDevQrCodeListener", "liteapp qrcode url:".concat(str9));
                    java.lang.String[] split = str9.split("\\?");
                    if (split != null) {
                        if (split.length < 1) {
                            i17 = 1;
                        } else {
                            java.lang.String[] strArr2 = new java.lang.String[2];
                            if (split.length == 1) {
                                i18 = 1;
                                strArr = strArr2;
                            } else {
                                java.lang.String str10 = split[1];
                                java.lang.String[] strArr3 = strArr2;
                                for (java.lang.String str11 : str10.split("&")) {
                                    java.lang.String[] split2 = str11.split("=");
                                    if ("entry".equals(split2[0].trim())) {
                                        strArr3 = ra3.h0.e(split2[1], true);
                                    }
                                }
                                i18 = 1;
                                str7 = str10;
                                strArr = strArr3;
                            }
                            int lastIndexOf = str9.lastIndexOf("/");
                            if (lastIndexOf >= 0) {
                                int i27 = lastIndexOf + i18;
                                if (i27 <= str9.length()) {
                                    java.lang.String[] split3 = str9.substring(i27).split("_");
                                    if (split3.length < 2) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppDevQrCodeListener", "url is error. %s", str9);
                                    } else {
                                        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a.b(7, new com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943());
                                        java.lang.String str12 = split3[0];
                                        i17 = 1;
                                        java.lang.String str13 = split3[1];
                                        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65443x856bf801(str12);
                                        oq1.q qVar = new oq1.q();
                                        qVar.f428879a = str12;
                                        qVar.f428882d = str9;
                                        qVar.f428883e = str13;
                                        qVar.f428885g = "3056301006072a8648ce3d020106052b8104000a03420004d60415d0874b4e66bbbbdb598a2c5269caf1af51b2b23ef23a82f48c74d8bc268ae89b34912dbb5b494b3d44d3bc2f0bfc6619357a6679edb531679544de9987";
                                        com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f c17 = c(dfVar2.f87982d);
                                        if (str12.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466)) {
                                            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.c1.INSTANCE.d(qVar, "debug", null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.r0(this));
                                        } else {
                                            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.c1.INSTANCE.b(qVar, "debug", null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.n0(this, str7, strArr, c17, c5587xf7a06bec));
                                        }
                                    }
                                }
                            } else {
                                i17 = i18;
                            }
                        }
                        return i17;
                    }
                }
                i17 = 1;
                return i17;
            }
            return true;
        }
        return false;
    }
}
