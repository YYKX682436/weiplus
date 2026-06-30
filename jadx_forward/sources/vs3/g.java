package vs3;

/* loaded from: classes9.dex */
public class g extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f521434d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f521435e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f521436f;

    /* renamed from: m, reason: collision with root package name */
    public int f521440m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.ArrayList f521441n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.ArrayList f521442o;

    /* renamed from: p, reason: collision with root package name */
    public vr4.e f521443p;

    /* renamed from: q, reason: collision with root package name */
    public vr4.e f521444q;

    /* renamed from: r, reason: collision with root package name */
    public vr4.e f521445r;

    /* renamed from: s, reason: collision with root package name */
    public vr4.e f521446s;

    /* renamed from: t, reason: collision with root package name */
    public vr4.e f521447t;

    /* renamed from: u, reason: collision with root package name */
    public vr4.a1 f521448u;

    /* renamed from: x, reason: collision with root package name */
    public java.util.List f521451x;

    /* renamed from: y, reason: collision with root package name */
    public final int f521452y;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f521437g = "";

    /* renamed from: h, reason: collision with root package name */
    public boolean f521438h = false;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f521439i = "";

    /* renamed from: v, reason: collision with root package name */
    public int f521449v = 0;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f521450w = "";

    public g(java.lang.String str, int i17) {
        this.f521436f = "";
        this.f521436f = str;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.t55();
        lVar.f152198b = new r45.u55();
        lVar.f152199c = "/cgi-bin/mmpay-bin/paychargeproxy";
        lVar.f152200d = 1571;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f521435e = a17;
        r45.t55 t55Var = (r45.t55) a17.f152243a.f152217a;
        t55Var.f467691d = i17;
        this.f521452y = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetScenePayChargeProxy", "cmdId: %d", java.lang.Integer.valueOf(i17));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetScenePayChargeProxy", "hy: requesting phone num: %s", str);
        t55Var.f467692e = java.lang.String.format("phone=%s", str);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f521434d = u0Var;
        return mo9409x10f9447a(sVar, this.f521435e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1571;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        java.lang.String string;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetScenePayChargeProxy", "hy: NetScenePayChargeProxy end: errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f521449v = i19;
        if (i18 == 0 && i19 == 0) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(((r45.u55) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a).f468608d);
                jSONObject.toString();
                this.f521437g = jSONObject.optString("appId");
                this.f521449v = jSONObject.optInt("errCode", -1);
                this.f521450w = jSONObject.optString("errMsg", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kng));
                if (this.f521449v < 0) {
                    this.f521438h = true;
                } else {
                    this.f521438h = false;
                }
                this.f521439i = jSONObject.optString("desc");
                this.f521440m = jSONObject.optInt("userTag", 0);
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray("productList");
                if (optJSONArray != null) {
                    this.f521441n = new java.util.ArrayList();
                    this.f521442o = new java.util.ArrayList();
                    int i27 = 0;
                    while (i27 < optJSONArray.length()) {
                        org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i27);
                        org.json.JSONArray jSONArray = optJSONArray;
                        vr4.b1 b1Var = new vr4.b1();
                        b1Var.f521225f = jSONObject2.optString("desc", "");
                        b1Var.f521223d = jSONObject2.optString(dm.i4.f66865x76d1ec5a, "");
                        b1Var.f521224e = jSONObject2.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "");
                        b1Var.f521226g = jSONObject2.optInt("status", 0);
                        b1Var.f521227h = jSONObject2.optString("url", "");
                        b1Var.f521228i = jSONObject2.optInt("type");
                        b1Var.f521229m = jSONObject2.optString("typeName");
                        b1Var.f521231o = jSONObject2.optString("isColor", "0");
                        b1Var.f521232p = jSONObject2.optString("colorCode", "0");
                        b1Var.f521233q = jSONObject2.optInt("isReConfirm", 0);
                        b1Var.f521234r = jSONObject2.optString("weappID");
                        b1Var.f521235s = jSONObject2.optString("weappPath");
                        b1Var.f521236t = jSONObject2.optInt("isRecommend", 0);
                        b1Var.f521237u = jSONObject2.optString("recommendId", "");
                        if (b1Var.f521228i == 1) {
                            this.f521441n.add(b1Var);
                        } else {
                            b1Var.f521230n = jSONObject2.optString("productAttr");
                            this.f521442o.add(b1Var);
                        }
                        i27++;
                        optJSONArray = jSONArray;
                    }
                } else {
                    this.f521441n = null;
                    this.f521442o = null;
                }
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("weSim");
                if (optJSONObject != null) {
                    java.lang.String optString = optJSONObject.optString("url");
                    java.lang.String optString2 = optJSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                    java.lang.String optString3 = optJSONObject.optString("weappID");
                    java.lang.String optString4 = optJSONObject.optString("weappPath");
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetScenePayChargeProxy", "tf: weSim is missing");
                        this.f521446s = null;
                    } else {
                        vr4.e eVar = new vr4.e();
                        this.f521446s = eVar;
                        eVar.f521245d = optString;
                        eVar.f521246e = optString2;
                        eVar.f521247f = optString3;
                        eVar.f521248g = optString4;
                    }
                }
                org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("wxRemind");
                if (optJSONObject2 != null) {
                    java.lang.String optString5 = optJSONObject2.optString("url");
                    java.lang.String optString6 = optJSONObject2.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                    java.lang.String optString7 = optJSONObject2.optString("weappID");
                    java.lang.String optString8 = optJSONObject2.optString("weappPath");
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString6)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetScenePayChargeProxy", "hy: remind unicom unnecessary element missing");
                        this.f521443p = null;
                    } else {
                        vr4.e eVar2 = new vr4.e();
                        this.f521443p = eVar2;
                        eVar2.f521245d = optString5;
                        eVar2.f521246e = optString6;
                        eVar2.f521247f = optString7;
                        eVar2.f521248g = optString8;
                    }
                } else {
                    this.f521443p = null;
                }
                org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("wxCard");
                if (optJSONObject3 != null) {
                    java.lang.String optString9 = optJSONObject3.optString("url");
                    java.lang.String optString10 = optJSONObject3.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                    java.lang.String optString11 = optJSONObject3.optString("weappID");
                    java.lang.String optString12 = optJSONObject3.optString("weappPath");
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString10)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetScenePayChargeProxy", "hy: phone card necessary element missing");
                        this.f521444q = null;
                    } else {
                        vr4.e eVar3 = new vr4.e();
                        this.f521444q = eVar3;
                        eVar3.f521245d = optString9;
                        eVar3.f521246e = optString10;
                        eVar3.f521247f = optString11;
                        eVar3.f521248g = optString12;
                    }
                } else {
                    this.f521444q = null;
                }
                org.json.JSONObject optJSONObject4 = jSONObject.optJSONObject("wxWt");
                if (optJSONObject4 != null) {
                    java.lang.String optString13 = optJSONObject4.optString("url");
                    java.lang.String optString14 = optJSONObject4.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                    java.lang.String optString15 = optJSONObject4.optString("weappID");
                    java.lang.String optString16 = optJSONObject4.optString("weappPath");
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString14)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetScenePayChargeProxy", "hy: phone hall necessary element missing");
                        this.f521445r = null;
                    } else {
                        vr4.e eVar4 = new vr4.e();
                        this.f521445r = eVar4;
                        eVar4.f521245d = optString13;
                        eVar4.f521246e = optString14;
                        eVar4.f521247f = optString15;
                        eVar4.f521248g = optString16;
                    }
                } else {
                    this.f521445r = null;
                }
                org.json.JSONObject optJSONObject5 = jSONObject.optJSONObject("banner");
                if (optJSONObject5 != null) {
                    vr4.a1 a1Var = new vr4.a1();
                    this.f521448u = a1Var;
                    a1Var.f521208d = optJSONObject5.getInt(dm.i4.f66865x76d1ec5a);
                    this.f521448u.f521209e = optJSONObject5.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                    this.f521448u.f521210f = optJSONObject5.optString("url");
                    this.f521448u.f521211g = optJSONObject5.optString("weappID");
                    this.f521448u.f521212h = optJSONObject5.optString("weappPath");
                } else {
                    this.f521448u = null;
                }
                org.json.JSONObject optJSONObject6 = jSONObject.optJSONObject("headEnter");
                if (optJSONObject6 != null) {
                    java.lang.String optString17 = optJSONObject6.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                    java.lang.String optString18 = optJSONObject6.optString("url");
                    java.lang.String optString19 = optJSONObject6.optString("weappID");
                    java.lang.String optString20 = optJSONObject6.optString("weappPath");
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString17)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetScenePayChargeProxy", "tf: headEnter is missing");
                        this.f521447t = null;
                    } else {
                        vr4.e eVar5 = new vr4.e();
                        this.f521447t = eVar5;
                        eVar5.f521246e = optString17;
                        eVar5.f521245d = optString18;
                        eVar5.f521247f = optString19;
                        eVar5.f521248g = optString20;
                    }
                } else {
                    this.f521447t = null;
                }
                org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("numberList");
                if (optJSONArray2 != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f521436f);
                    if (optJSONArray2.length() <= 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetScenePayChargeProxy", "number length is short! %s", java.lang.Integer.valueOf(optJSONArray2.length()));
                        this.f521451x = null;
                    } else {
                        this.f521451x = new java.util.ArrayList();
                        for (int i28 = 0; i28 < optJSONArray2.length(); i28++) {
                            org.json.JSONObject optJSONObject7 = optJSONArray2.optJSONObject(i28);
                            if (optJSONObject7 != null) {
                                java.lang.String optString21 = optJSONObject7.optString("number");
                                java.lang.String optString22 = optJSONObject7.optString("desc");
                                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString21)) {
                                    this.f521451x.add(new vs3.a(optString21, "", optString22, 2));
                                }
                            }
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetScenePayChargeProxy", "number list: %s, %s", java.lang.Integer.valueOf(this.f521451x.size()), optJSONArray2.toString());
                    }
                } else {
                    this.f521451x = null;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetScenePayChargeProxy", "empty numberList");
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetScenePayChargeProxy", "hy: exception occurred when parsing json: %s", e17.toString());
                this.f521438h = true;
                this.f521450w = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kng);
            }
            string = str;
        } else {
            this.f521438h = true;
            string = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kkk) : str;
            this.f521450w = string;
        }
        this.f521434d.mo815x76e0bfae(i18, i19, string, this);
    }
}
