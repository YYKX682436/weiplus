package ss4;

/* loaded from: classes9.dex */
public class z extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f493680d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c f493681e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f493682f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f493683g;

    /* renamed from: h, reason: collision with root package name */
    public final int f493684h;

    /* renamed from: i, reason: collision with root package name */
    public int f493685i;

    /* renamed from: m, reason: collision with root package name */
    public int f493686m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19086x2eaebd1c[] f493687n;

    /* renamed from: o, reason: collision with root package name */
    public int f493688o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String[] f493689p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.ArrayList f493690q;

    public z(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56) {
        this(3, str, str2, c19760x34448d56, null, -1, -1, 0);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return hc1.i.f69826x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 73;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/mmpay-bin/tenpay/elementquerynew";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f493680d = new java.util.ArrayList();
        try {
            jSONObject.optString("time_stamp");
            java.lang.String optString = jSONObject.optString("bank_type");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f493683g)) {
                optString = this.f493683g;
            }
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("Array");
            int length = jSONArray.length();
            int i18 = 0;
            while (true) {
                boolean z17 = true;
                if (i18 >= length) {
                    break;
                }
                org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i18);
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c c19097xe6dc5b4c = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c();
                c19097xe6dc5b4c.d(jSONObject2);
                int i19 = this.f493684h;
                int i27 = c19097xe6dc5b4c.I;
                l75.e0 e0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c.A3;
                if ((i19 & i27) <= 0) {
                    z17 = false;
                }
                if (z17) {
                    ((java.util.ArrayList) this.f493680d).add(c19097xe6dc5b4c);
                }
                if (optString != null && optString.equals(c19097xe6dc5b4c.f261192s)) {
                    this.f493681e = c19097xe6dc5b4c;
                }
                i18++;
            }
            android.util.SparseArray sparseArray = new android.util.SparseArray();
            org.json.JSONArray jSONArray2 = jSONObject.getJSONArray("cre_type_map");
            int length2 = jSONArray2.length();
            for (int i28 = 0; i28 < length2; i28++) {
                org.json.JSONObject jSONObject3 = jSONArray2.getJSONObject(i28);
                int optInt = jSONObject3.optInt("key", 0);
                if (optInt > 0) {
                    sparseArray.put(optInt, jSONObject3.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54737x95d788aa));
                }
            }
            this.f493685i = jSONObject.optInt("need_area");
            this.f493686m = jSONObject.optInt("need_profession");
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c c19097xe6dc5b4c2 = this.f493681e;
            if (c19097xe6dc5b4c2 != null && c19097xe6dc5b4c2.I != 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o.TAG, "oversea card, no need area and profession");
                this.f493685i = 0;
                this.f493686m = 0;
            }
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("profession_array");
            if (optJSONArray != null) {
                this.f493687n = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19086x2eaebd1c[optJSONArray.length()];
                for (int i29 = 0; i29 < optJSONArray.length(); i29++) {
                    org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i29);
                    if (optJSONObject != null) {
                        java.lang.String optString2 = optJSONObject.optString("profession_name");
                        int optInt2 = optJSONObject.optInt("profession_type");
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o.TAG, "empty profession_name!");
                        } else {
                            this.f493687n[i29] = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19086x2eaebd1c(optString2, optInt2);
                        }
                    }
                }
            }
            this.f493688o = jSONObject.optInt("need_nationality", 0);
            org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("nationality_exclude_array");
            if (optJSONArray2 != null) {
                this.f493689p = new java.lang.String[optJSONArray2.length()];
                for (int i37 = 0; i37 < optJSONArray2.length(); i37++) {
                    this.f493689p[i37] = optJSONArray2.optString(i37);
                }
            }
            org.json.JSONArray optJSONArray3 = jSONObject.optJSONArray("bank_card_info");
            if (optJSONArray3 != null) {
                this.f493690q = new java.util.ArrayList();
                for (int i38 = 0; i38 < optJSONArray3.length(); i38++) {
                    org.json.JSONObject optJSONObject2 = optJSONArray3.optJSONObject(i38);
                    if (optJSONObject2 != null) {
                        ys4.a aVar = new ys4.a();
                        aVar.f546752a = optJSONObject2.optString("bank_type");
                        aVar.f546753b = optJSONObject2.optString("mobile_hint");
                        aVar.f546754c = optJSONObject2.optString("mobile_tips");
                        this.f493690q.add(aVar);
                    }
                }
            }
            at4.b1 b1Var = ((pg0.a3) i95.n0.c(pg0.a3.class)).f435486d;
            java.util.List list = this.f493680d;
            java.util.ArrayList arrayList = this.f493690q;
            b1Var.f95343a = sparseArray;
            b1Var.f95344b = list;
            b1Var.f95345c = arrayList;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o.TAG, e17, "", new java.lang.Object[0]);
        }
    }

    public z(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56, java.lang.String str3, int i17, int i18, int i19) {
        this(3, str, str2, c19760x34448d56, str3, i17, i18, i19);
    }

    public z(int i17, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56, java.lang.String str3, int i18, int i19, int i27) {
        this.f493680d = null;
        this.f493681e = null;
        this.f493682f = null;
        this.f493683g = null;
        this.f493684h = 3;
        this.f493687n = null;
        this.f493689p = null;
        this.f493682f = str2;
        this.f493684h = i17;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        m83030x824a7eb4(c19760x34448d56, hashMap, hashMap2);
        hashMap.put("req_key", str);
        hashMap.put("flag", "4");
        hashMap.put("card_id", str2);
        i17 = (i17 > 3 || i17 < 1) ? 3 : i17;
        if (i19 > 0) {
            hashMap.put("realname_scene", i19 + "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o.TAG, "realname_scene=%d", java.lang.Integer.valueOf(i19));
        }
        if (i18 == 8) {
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "1003");
        }
        hashMap.put("bank_card_tag", i17 + "");
        hashMap.put("token", str3);
        hashMap.put("newrealname", i27 + "");
        m83032xb4c13117(hashMap);
        if (com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.f295447a) {
            hashMap2.put("uuid_for_bindcard", com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.f295449c);
            hashMap2.put("bindcard_scene", "" + com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.f295448b);
        }
        m83033x7c1e2016(hashMap2);
    }
}
