package uc1;

/* loaded from: classes13.dex */
public class k extends uc1.b {

    /* renamed from: CTRL_INDEX */
    public static final int f76888x366c91de = 134;

    /* renamed from: NAME */
    public static final java.lang.String f76889x24728b = "addMapLines";

    @Override // uc1.b, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        vc1.a3 a3Var;
        java.lang.String str2;
        vc1.b2 b2Var;
        int i18;
        boolean z17;
        vc1.b2 b2Var2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.Class<o91.e> cls;
        org.json.JSONObject jSONObject2;
        org.json.JSONArray jSONArray;
        java.util.ArrayList arrayList;
        int i19;
        org.json.JSONObject jSONObject3;
        int i27;
        org.json.JSONArray jSONArray2;
        uc1.k kVar = this;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar2 = lVar;
        java.lang.Class<o91.e> cls2 = o91.e.class;
        java.lang.String str5 = "segmentTexts";
        java.lang.String str6 = "colorList";
        java.lang.String str7 = "";
        super.A(lVar, jSONObject, i17);
        java.lang.String str8 = "MicroMsg.JsApiAddMapLines";
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddMapLines", "data is null");
            lVar2.a(i17, kVar.o("fail:invalid data"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAddMapLines", "data:%s", jSONObject);
        vc1.a3 E = E(lVar, jSONObject);
        if (E == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddMapLines", "mapView is null, return");
            lVar2.a(i17, kVar.o("fail:mapview is null"));
            return;
        }
        try {
            if (jSONObject.has("lines")) {
                try {
                    if (jSONObject.optBoolean("clear", true)) {
                        ((vc1.p1) E).L();
                    }
                    org.json.JSONArray jSONArray3 = new org.json.JSONArray(jSONObject.optString("lines"));
                    int i28 = 0;
                    while (i28 < jSONArray3.length()) {
                        org.json.JSONObject jSONObject4 = (org.json.JSONObject) jSONArray3.get(i28);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        org.json.JSONArray jSONArray4 = new org.json.JSONArray(jSONObject4.optString("points"));
                        int i29 = 0;
                        while (i29 < jSONArray4.length()) {
                            try {
                                jSONObject2 = jSONArray4.getJSONObject(i29);
                                jSONArray = jSONArray4;
                                arrayList = arrayList2;
                                i19 = i28;
                                jSONObject3 = jSONObject4;
                                i27 = i29;
                                jSONArray2 = jSONArray3;
                                a3Var = E;
                            } catch (java.lang.Exception e17) {
                                e = e17;
                                a3Var = E;
                            }
                            try {
                                arrayList.add(new uc1.j(this, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(jSONObject2.optString("latitude"), 0.0d), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(jSONObject2.optString("longitude"), 0.0d)));
                                i29 = i27 + 1;
                                arrayList2 = arrayList;
                                jSONObject4 = jSONObject3;
                                jSONArray3 = jSONArray2;
                                jSONArray4 = jSONArray;
                                i28 = i19;
                                E = a3Var;
                            } catch (java.lang.Exception e18) {
                                e = e18;
                                kVar = this;
                                str = str8;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "parse lines error, exception : %s", e);
                                java.lang.String o17 = kVar.o("fail:internal error");
                                vc1.p1 p1Var = (vc1.p1) a3Var;
                                p1Var.getClass();
                                C(lVar, i17, o17, false, p1Var instanceof dg1.h);
                                return;
                            }
                        }
                        java.util.ArrayList arrayList3 = arrayList2;
                        int i37 = i28;
                        org.json.JSONObject jSONObject5 = jSONObject4;
                        org.json.JSONArray jSONArray5 = jSONArray3;
                        a3Var = E;
                        try {
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            if (jSONObject5.has(str6)) {
                                org.json.JSONArray jSONArray6 = new org.json.JSONArray(jSONObject5.optString(str6));
                                for (int i38 = 0; i38 < jSONArray6.length(); i38++) {
                                    java.lang.String string = jSONArray6.getString(i38);
                                    int parseColor = android.graphics.Color.parseColor("#000000");
                                    try {
                                        parseColor = ik1.w.l(string);
                                    } catch (java.lang.Exception unused) {
                                    }
                                    arrayList4.add(java.lang.Integer.valueOf(parseColor));
                                }
                                if (arrayList4.size() > 0 && arrayList4.size() < arrayList3.size() - 1) {
                                    int intValue = ((java.lang.Integer) arrayList4.get(arrayList4.size() - 1)).intValue();
                                    for (int size = arrayList4.size(); size < arrayList3.size() - 1; size++) {
                                        arrayList4.add(java.lang.Integer.valueOf(intValue));
                                    }
                                } else if (arrayList4.size() > arrayList3.size() && arrayList3.size() > 0) {
                                    for (int size2 = arrayList4.size() - 1; size2 > arrayList3.size() - 1; size2--) {
                                        arrayList4.remove(size2);
                                    }
                                }
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str8, "colorList size:%d ", java.lang.Integer.valueOf(arrayList4.size()));
                            }
                            java.lang.String optString = jSONObject5.optString(dm.i4.f66865x76d1ec5a);
                            java.lang.String optString2 = jSONObject5.optString("color", str7);
                            int parseColor2 = android.graphics.Color.parseColor("#000000");
                            try {
                                parseColor2 = ik1.w.l(optString2);
                            } catch (java.lang.Exception unused2) {
                            }
                            int optInt = jSONObject5.optInt("style", -1);
                            int j17 = ik1.w.j(jSONObject5, "width", 0);
                            boolean optBoolean = jSONObject5.optBoolean("dottedLine", false);
                            java.lang.String optString3 = jSONObject5.optString("borderColor", str7);
                            int parseColor3 = android.graphics.Color.parseColor("#000000");
                            try {
                                parseColor3 = ik1.w.l(optString3);
                            } catch (java.lang.Exception unused3) {
                            }
                            int i39 = parseColor3;
                            java.lang.String str9 = str6;
                            str2 = str8;
                            try {
                                int j18 = ik1.w.j(jSONObject5, "borderWidth", 0);
                                try {
                                    boolean optBoolean2 = jSONObject5.optBoolean("arrowLine", false);
                                    java.lang.String optString4 = jSONObject5.optString("arrowIconPath", str7);
                                    java.lang.String optString5 = jSONObject5.optString("revisedArrowIconPath", str7);
                                    java.lang.Class<o91.e> cls3 = cls2;
                                    int j19 = ik1.w.j(jSONObject5, "arrowGap", 0);
                                    java.lang.String optString6 = jSONObject5.optString(ya.b.f77487x44fa364);
                                    if (jSONObject5.has("textStyle")) {
                                        try {
                                            b2Var = new vc1.b2();
                                            i18 = j19;
                                            java.lang.String optString7 = jSONObject5.optString("textColor", str7);
                                            int parseColor4 = android.graphics.Color.parseColor("#000000");
                                            try {
                                                parseColor4 = ik1.w.l(optString7);
                                            } catch (java.lang.Exception unused4) {
                                            }
                                            b2Var.f516448a = parseColor4;
                                            java.lang.String optString8 = jSONObject5.optString("strokeColor", str7);
                                            int parseColor5 = android.graphics.Color.parseColor("#FFFFFF");
                                            try {
                                                parseColor5 = ik1.w.l(optString8);
                                            } catch (java.lang.Exception unused5) {
                                            }
                                            b2Var.f516449b = parseColor5;
                                            b2Var.f516450c = jSONObject5.optInt("fontSize", 14);
                                        } catch (java.lang.Exception e19) {
                                            e = e19;
                                            kVar = this;
                                            str = str2;
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "parse lines error, exception : %s", e);
                                            java.lang.String o172 = kVar.o("fail:internal error");
                                            vc1.p1 p1Var2 = (vc1.p1) a3Var;
                                            p1Var2.getClass();
                                            C(lVar, i17, o172, false, p1Var2 instanceof dg1.h);
                                            return;
                                        }
                                    } else {
                                        i18 = j19;
                                        b2Var = null;
                                    }
                                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                                    if (jSONObject5.has(str5)) {
                                        str4 = str7;
                                        org.json.JSONArray jSONArray7 = new org.json.JSONArray(jSONObject5.optString(str5));
                                        str3 = str5;
                                        int i47 = 0;
                                        while (i47 < jSONArray7.length()) {
                                            org.json.JSONObject jSONObject6 = jSONArray7.getJSONObject(i47);
                                            org.json.JSONArray jSONArray8 = jSONArray7;
                                            vc1.a2 a2Var = new vc1.a2();
                                            vc1.b2 b2Var3 = b2Var;
                                            a2Var.f516443a = jSONObject6.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                                            boolean z18 = optBoolean2;
                                            a2Var.f516444b = jSONObject6.optInt(io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.SpellCheckerSessionSpellCheckerSessionListenerC28699xf8ae7c33.f71691x3d6ab575, 0);
                                            a2Var.f516445c = jSONObject6.optInt(io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.SpellCheckerSessionSpellCheckerSessionListenerC28699xf8ae7c33.f71689x4b7b72ae, 0);
                                            arrayList5.add(a2Var);
                                            i47++;
                                            jSONArray7 = jSONArray8;
                                            b2Var = b2Var3;
                                            optBoolean2 = z18;
                                        }
                                        z17 = optBoolean2;
                                        b2Var2 = b2Var;
                                    } else {
                                        z17 = optBoolean2;
                                        b2Var2 = b2Var;
                                        str3 = str5;
                                        str4 = str7;
                                    }
                                    vc1.c2 c2Var = new vc1.c2();
                                    c2Var.f516456a = optString;
                                    c2Var.f516468m = optInt;
                                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                                    c2Var.f516457b = arrayList6;
                                    arrayList6.addAll(arrayList3);
                                    c2Var.f516470o = arrayList4;
                                    c2Var.f516472q = jSONObject5.optBoolean("enableGradient", false);
                                    c2Var.f516458c = parseColor2;
                                    c2Var.f516459d = j17;
                                    c2Var.f516460e = optBoolean;
                                    c2Var.f516461f = i39;
                                    c2Var.f516462g = j18;
                                    boolean z19 = z17;
                                    c2Var.f516463h = z19;
                                    c2Var.f516469n = i18;
                                    if (z19) {
                                        cls = cls3;
                                        try {
                                            c2Var.f516464i = ((o91.e) lVar.q(cls)).T0(lVar, optString4);
                                            c2Var.f516465j = ((o91.e) lVar.q(cls)).T0(lVar, optString5);
                                        } catch (java.lang.Exception e27) {
                                            e = e27;
                                            kVar = this;
                                            str = str2;
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "parse lines error, exception : %s", e);
                                            java.lang.String o1722 = kVar.o("fail:internal error");
                                            vc1.p1 p1Var22 = (vc1.p1) a3Var;
                                            p1Var22.getClass();
                                            C(lVar, i17, o1722, false, p1Var22 instanceof dg1.h);
                                            return;
                                        }
                                    } else {
                                        cls = cls3;
                                    }
                                    java.lang.String optString9 = jSONObject5.optString("buildingId");
                                    java.lang.String optString10 = jSONObject5.optString("floorName");
                                    c2Var.f516466k = optString9;
                                    c2Var.f516467l = optString10;
                                    c2Var.f516471p = optString6;
                                    c2Var.f516473r = b2Var2;
                                    c2Var.f516474s = arrayList5;
                                    ((vc1.p1) a3Var).p(c2Var, (o91.d) lVar.q(o91.d.class));
                                    cls2 = cls;
                                    lVar2 = lVar;
                                    jSONArray3 = jSONArray5;
                                    str6 = str9;
                                    E = a3Var;
                                    str8 = str2;
                                    str7 = str4;
                                    str5 = str3;
                                    i28 = i37 + 1;
                                } catch (java.lang.Exception e28) {
                                    e = e28;
                                }
                            } catch (java.lang.Exception e29) {
                                e = e29;
                            }
                        } catch (java.lang.Exception e37) {
                            e = e37;
                            str2 = str8;
                        }
                    }
                    a3Var = E;
                } catch (java.lang.Exception e38) {
                    e = e38;
                    str2 = str8;
                    a3Var = E;
                }
            } else {
                a3Var = E;
                str = "MicroMsg.JsApiAddMapLines";
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "data has not lines info");
                } catch (java.lang.Exception e39) {
                    e = e39;
                    kVar = this;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "parse lines error, exception : %s", e);
                    java.lang.String o17222 = kVar.o("fail:internal error");
                    vc1.p1 p1Var222 = (vc1.p1) a3Var;
                    p1Var222.getClass();
                    C(lVar, i17, o17222, false, p1Var222 instanceof dg1.h);
                    return;
                }
            }
            java.lang.String o18 = o("ok");
            vc1.p1 p1Var3 = (vc1.p1) a3Var;
            p1Var3.getClass();
            C(lVar, i17, o18, true, p1Var3 instanceof dg1.h);
        } catch (java.lang.Exception e47) {
            e = e47;
            str = "MicroMsg.JsApiAddMapLines";
            a3Var = E;
        }
    }
}
