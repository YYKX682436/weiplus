package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad;

@j95.b
/* loaded from: classes7.dex */
public final class d6 extends i95.w implements com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.e4 {

    /* renamed from: d, reason: collision with root package name */
    public int f229444d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f229445e = new java.util.concurrent.ConcurrentHashMap();

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushGlobalConfigFeatureService", "onAccountReleased");
        super.mo836xb8969aab(context);
        this.f229445e.clear();
    }

    public jc3.o0 wi(java.lang.String bizName) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        java.lang.String str;
        java.lang.String str2;
        jc3.n0 n0Var;
        org.json.JSONObject jSONObject;
        org.json.JSONArray jSONArray;
        java.lang.String str3;
        java.lang.String str4;
        java.util.HashMap hashMap;
        java.lang.String str5;
        java.lang.String str6;
        org.json.JSONObject jSONObject2;
        java.lang.String str7;
        java.lang.String str8;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d6 d6Var = this;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String lowerCase = bizName.toLowerCase(locale);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        if (d6Var.f229445e.get(lowerCase) != null) {
            java.lang.Object obj = d6Var.f229445e.get(lowerCase);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            return (jc3.o0) obj;
        }
        java.lang.String lowerCase2 = "MagicPermissionConfig".toLowerCase(locale);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase2, "toLowerCase(...)");
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lowerCase, lowerCase2);
        jc3.n0 n0Var2 = jc3.o0.f380497i;
        if (b17) {
            d6Var.f229445e.put(lowerCase, n0Var2.a(new java.util.HashMap()));
        } else {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = d6Var.f229445e;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.k7) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.r4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.r4.class))).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPermissionConfig", "getBizConfig biz:%s,module:%s,configName:%s", lowerCase, "magicbrush", "config");
            java.util.Locale locale2 = java.util.Locale.getDefault();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale2, "getDefault(...)");
            java.lang.String lowerCase3 = lowerCase.toLowerCase(locale2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase3, "toLowerCase(...)");
            java.lang.String str9 = "/magicbrush/" + lowerCase3 + "/config.json";
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 b18 = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4.T9((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4) c17, "MagicPermissionConfig", null, 2, null).b();
            ik1.b0 b0Var = new ik1.b0();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49307xcc440832 = b18.mo49307xcc440832("/magicbrush/config.json", b0Var);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo49307xcc440832, "readFile(...)");
            java.util.HashMap hashMap2 = new java.util.HashMap();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK;
            java.lang.String str10 = "value";
            java.lang.String str11 = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d;
            java.lang.String str12 = "UTF_8";
            java.lang.String str13 = "arrayOfByteBuffer(...)";
            if (mo49307xcc440832 == j1Var) {
                byte[] a17 = ik1.f.a((java.nio.ByteBuffer) b0Var.f373357a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "arrayOfByteBuffer(...)");
                concurrentHashMap = concurrentHashMap2;
                java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UTF_8, "UTF_8");
                n0Var = n0Var2;
                org.json.JSONObject jSONObject3 = new org.json.JSONObject(new java.lang.String(a17, UTF_8));
                org.json.JSONArray names = jSONObject3.names();
                int length = names.length();
                int i17 = 0;
                while (i17 < length) {
                    int i18 = length;
                    java.lang.String optString = names.optString(i17);
                    org.json.JSONArray jSONArray2 = names;
                    org.json.JSONArray optJSONArray = jSONObject3.optJSONArray(optString);
                    if (optJSONArray != null) {
                        jSONObject2 = jSONObject3;
                        java.util.HashMap hashMap3 = new java.util.HashMap();
                        str5 = str12;
                        int length2 = optJSONArray.length();
                        str6 = str13;
                        int i19 = 0;
                        while (i19 < length2) {
                            int i27 = length2;
                            org.json.JSONObject jSONObject4 = optJSONArray.getJSONObject(i19);
                            org.json.JSONArray jSONArray3 = optJSONArray;
                            java.lang.String optString2 = jSONObject4.optString(str11);
                            java.lang.String optString3 = jSONObject4.optString(str10);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPermissionConfig", "global bizName %s module %s name:%s,value:%s", lowerCase, optString, optString2, optString3);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString3);
                            hashMap3.put(optString2, optString3);
                            i19++;
                            length2 = i27;
                            optJSONArray = jSONArray3;
                            str10 = str10;
                            str11 = str11;
                        }
                        str7 = str10;
                        str8 = str11;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                        hashMap2.put(optString, hashMap3);
                    } else {
                        str5 = str12;
                        str6 = str13;
                        jSONObject2 = jSONObject3;
                        str7 = str10;
                        str8 = str11;
                    }
                    i17++;
                    length = i18;
                    names = jSONArray2;
                    jSONObject3 = jSONObject2;
                    str12 = str5;
                    str13 = str6;
                    str10 = str7;
                    str11 = str8;
                }
                str = str12;
                str2 = str13;
            } else {
                concurrentHashMap = concurrentHashMap2;
                str = "UTF_8";
                str2 = "arrayOfByteBuffer(...)";
                n0Var = n0Var2;
            }
            java.lang.String str14 = str10;
            java.lang.String str15 = str11;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49307xcc4408322 = b18.mo49307xcc440832(str9, b0Var);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo49307xcc4408322, "readFile(...)");
            if (mo49307xcc4408322 == j1Var) {
                byte[] a18 = ik1.f.a((java.nio.ByteBuffer) b0Var.f373357a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, str2);
                java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(charset, str);
                org.json.JSONObject jSONObject5 = new org.json.JSONObject(new java.lang.String(a18, charset));
                org.json.JSONArray names2 = jSONObject5.names();
                int length3 = names2.length();
                int i28 = 0;
                while (i28 < length3) {
                    java.lang.String optString4 = names2.optString(i28);
                    org.json.JSONArray optJSONArray2 = jSONObject5.optJSONArray(optString4);
                    if (optJSONArray2 != null) {
                        java.util.HashMap hashMap4 = new java.util.HashMap();
                        if ((!hashMap2.isEmpty()) && (hashMap = (java.util.HashMap) hashMap2.get(optString4)) != null) {
                            hashMap4 = hashMap;
                        }
                        int length4 = optJSONArray2.length();
                        int i29 = 0;
                        while (i29 < length4) {
                            org.json.JSONObject jSONObject6 = optJSONArray2.getJSONObject(i29);
                            java.lang.String optString5 = jSONObject6.optString(str15);
                            java.lang.String optString6 = jSONObject6.optString(str14);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPermissionConfig", "bizName %s, module %s, name:%s,value:%s", lowerCase, optString4, optString5, optString6);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString5);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString6);
                            hashMap4.put(optString5, optString6);
                            i29++;
                            jSONObject5 = jSONObject5;
                            names2 = names2;
                        }
                        jSONObject = jSONObject5;
                        jSONArray = names2;
                        str3 = str14;
                        str4 = str15;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString4);
                        hashMap2.put(optString4, hashMap4);
                    } else {
                        jSONObject = jSONObject5;
                        jSONArray = names2;
                        str3 = str14;
                        str4 = str15;
                    }
                    i28++;
                    str14 = str3;
                    str15 = str4;
                    jSONObject5 = jSONObject;
                    names2 = jSONArray;
                }
            }
            concurrentHashMap.put(lowerCase, n0Var.a(hashMap2));
            d6Var = this;
        }
        java.lang.Object obj2 = d6Var.f229445e.get(lowerCase);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
        return (jc3.o0) obj2;
    }
}
