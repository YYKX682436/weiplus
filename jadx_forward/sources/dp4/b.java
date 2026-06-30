package dp4;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final dp4.b f323795a = new dp4.b();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f323796b = lp0.b.e() + "imageEnhancementSceneFilterSettings.json";

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f323797c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f323798d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final float f323799e = 0.45f;

    /* renamed from: f, reason: collision with root package name */
    public static final float f323800f = 0.1f;

    /* renamed from: g, reason: collision with root package name */
    public static final float f323801g = 0.1f;

    /* renamed from: h, reason: collision with root package name */
    public static final float f323802h = 0.2f;

    /* renamed from: i, reason: collision with root package name */
    public static final float f323803i = 0.4f;

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f323804j;

    static {
        kz5.c1.k(new jz5.l(tq5.c.SkinSmooth, 0), new jz5.l(tq5.c.EyeBright, 1), new jz5.l(tq5.c.SkinBright, 2), new jz5.l(tq5.c.EyeMorph, 3), new jz5.l(tq5.c.FaceMorph, 4));
        f323804j = new float[]{0.45f, 0.4f, 0.2f, 0.1f, 0.1f};
    }

    public final void a() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("FINDER_CONFIG_USER_KEY").getInt("USERINFO_FINDER_SHOW_IMAGE_ENHANCEMENT_SETTING_INT_SYNC", 0) == 1;
        java.lang.String str = f323796b;
        if (z17) {
            d();
            java.util.HashMap infoMap = f323798d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoMap, "infoMap");
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (java.util.Map.Entry entry : infoMap.entrySet()) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, ((java.lang.Number) entry.getKey()).intValue());
                java.util.List<tq5.e> filtersInfo = (java.util.List) entry.getValue();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filtersInfo, "filtersInfo");
                org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                for (tq5.e info : filtersInfo) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("type", info.f502784a.ordinal());
                    jSONObject2.put("filterWeight", java.lang.Float.valueOf(info.f502785b));
                    jSONObject2.put("filterPath", info.f502786c);
                    jSONObject2.put("builtinLutFilterType", info.f502787d.ordinal());
                    org.json.JSONArray jSONArray3 = new org.json.JSONArray();
                    float[] filterWeights = info.f502788e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(filterWeights, "filterWeights");
                    for (float f17 : filterWeights) {
                        jSONArray3.put(java.lang.Float.valueOf(f17));
                    }
                    jSONObject2.put("filterWeights", jSONArray3);
                    jSONArray2.put(jSONObject2);
                }
                jSONObject.put("filters", jSONArray2);
                jSONArray.put(jSONObject);
            }
            java.lang.String jSONArray4 = jSONArray.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray4, "toString(...)");
            byte[] bytes = jSONArray4.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            com.p314xaae8f345.mm.vfs.w6.S(str, bytes, 0, bytes.length);
        }
        java.lang.String M = com.p314xaae8f345.mm.vfs.w6.M(str);
        so4.g gVar = so4.g.f492309a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(M);
        so4.a aVar = so4.g.f492313e;
        if (aVar == null || aVar.a() <= 0) {
            return;
        }
        uq5.p pVar = aVar.f492299a;
        if (pVar != null) {
            com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22985x615f1ce6.f39989x4fbc8495.m83854xc7842b9f(pVar.f511802c, M);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocalEffectManager", "setImageEnhancementSceneFilterSettingsByJson:".concat(M));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocalEffectManager", "setImageEnhancementSceneFilterSettingsByJson, ret:true, effectId:" + aVar.a());
    }

    public final java.lang.String b(int i17) {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (i17 == 0) {
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k7j);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            return string;
        }
        if (i17 == 1) {
            java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k7i);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            return string2;
        }
        if (i17 == 2) {
            java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k7f);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
            return string3;
        }
        if (i17 == 3) {
            java.lang.String string4 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k7k);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
            return string4;
        }
        if (i17 == 4) {
            java.lang.String string5 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k7e);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string5, "getString(...)");
            return string5;
        }
        if (i17 == 5) {
            java.lang.String string6 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k7m);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string6, "getString(...)");
            return string6;
        }
        if (i17 == 6) {
            java.lang.String string7 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k7o);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string7, "getString(...)");
            return string7;
        }
        if (i17 == 7) {
            java.lang.String string8 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k7n);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string8, "getString(...)");
            return string8;
        }
        if (i17 == 8) {
            java.lang.String string9 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k7c);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string9, "getString(...)");
            return string9;
        }
        if (i17 == 9) {
            java.lang.String string10 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k7g);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string10, "getString(...)");
            return string10;
        }
        if (i17 == 10) {
            java.lang.String string11 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k7l);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string11, "getString(...)");
            return string11;
        }
        if (i17 == 11) {
            java.lang.String string12 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k7d);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string12, "getString(...)");
            return string12;
        }
        if (i17 != 12) {
            return "Unknown type";
        }
        java.lang.String string13 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k7h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string13, "getString(...)");
        return string13;
    }

    public final java.util.HashMap c(org.json.JSONArray json) {
        tq5.d dVar;
        tq5.b bVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(json, "json");
        java.util.HashMap hashMap = new java.util.HashMap();
        int length = json.length();
        int i17 = 0;
        int i18 = 0;
        while (i18 < length) {
            org.json.JSONObject jSONObject = json.getJSONObject(i18);
            int optInt = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, -1);
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("filters");
            if (optInt >= 0 && optJSONArray != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int length2 = optJSONArray.length();
                int i19 = i17;
                while (i19 < length2) {
                    org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i19);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "getJSONObject(...)");
                    tq5.e eVar = new tq5.e();
                    int optInt2 = jSONObject2.optInt("type", i17);
                    tq5.d[] m166968xcee59d22 = tq5.d.m166968xcee59d22();
                    int length3 = m166968xcee59d22.length;
                    int i27 = i17;
                    while (true) {
                        if (i27 >= length3) {
                            dVar = tq5.d.Unknown;
                            break;
                        }
                        dVar = m166968xcee59d22[i27];
                        if (dVar.ordinal() == optInt2) {
                            break;
                        }
                        i27++;
                    }
                    eVar.f502784a = dVar;
                    eVar.f502785b = (float) jSONObject2.optDouble("filterWeight", 0.0d);
                    eVar.f502786c = jSONObject2.optString("filterPath");
                    int optInt3 = jSONObject2.optInt("builtinLutFilterType", 0);
                    tq5.b[] m166962xcee59d22 = tq5.b.m166962xcee59d22();
                    int length4 = m166962xcee59d22.length;
                    int i28 = 0;
                    while (true) {
                        if (i28 >= length4) {
                            bVar = tq5.b.Unknown;
                            break;
                        }
                        bVar = m166962xcee59d22[i28];
                        if (bVar.ordinal() == optInt3) {
                            break;
                        }
                        i28++;
                    }
                    eVar.f502787d = bVar;
                    org.json.JSONArray optJSONArray2 = jSONObject2.optJSONArray("filterWeights");
                    if (optJSONArray2 != null) {
                        eVar.f502788e = new float[optJSONArray2.length()];
                        int length5 = optJSONArray2.length();
                        for (int i29 = 0; i29 < length5; i29++) {
                            eVar.f502788e[i29] = (float) optJSONArray2.getDouble(i29);
                        }
                    }
                    arrayList.add(eVar);
                    i19++;
                    i17 = 0;
                }
                hashMap.put(java.lang.Integer.valueOf(optInt), arrayList);
            }
            i18++;
            i17 = 0;
        }
        return hashMap;
    }

    public final void d() {
        java.lang.Object obj;
        java.util.List list = (java.util.List) f323798d.get(1);
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((tq5.e) obj).f502784a == tq5.d.FACE_BEAUTY) {
                        break;
                    }
                }
            }
            tq5.e eVar = (tq5.e) obj;
            if (eVar != null) {
                float[] filterWeights = eVar.f502788e;
                int length = filterWeights.length;
                float[] fArr = f323804j;
                if (length == fArr.length) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(filterWeights, "filterWeights");
                    kz5.v.m(filterWeights, fArr, 0, 0, 0, 14, null);
                } else {
                    float[] fArr2 = new float[fArr.length];
                    eVar.f502788e = fArr2;
                    kz5.v.m(fArr, fArr2, 0, 0, 0, 14, null);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageEnhancementFilterSettingLogic", "loadFaceBeautySettings, skinSmooth:" + f323799e + ", skinBright:" + f323802h + ", faceMorph:" + f323801g + ", eyeBright:" + f323803i + ", eyeMorph:" + f323800f);
    }
}
