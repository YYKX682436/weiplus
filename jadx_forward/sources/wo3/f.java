package wo3;

/* loaded from: classes8.dex */
public class f extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f529684d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f529685e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f529686f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f529687g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f529688h = -1;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f529689i = "";

    /* renamed from: m, reason: collision with root package name */
    public final int f529690m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1 f529691n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f529692o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f529693p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f529694q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f529695r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f529696s;

    public f(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f529690m = 1;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.gy4();
        lVar.f152198b = new r45.hy4();
        lVar.f152199c = "/cgi-bin/mmpay-bin/offlinepayconfirm";
        lVar.f152200d = com.p290xb772556d.p291xca4f91d6.C2828xd7507fe8.ErrCode.f9501x82ef07b8;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.J(str3);
        lVar.f152204h = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f529685e = a17;
        r45.gy4 gy4Var = (r45.gy4) a17.f152243a.f152217a;
        gy4Var.f457171d = i17;
        gy4Var.f457172e = str;
        gy4Var.f457173f = str2;
        gy4Var.f457174g = at4.g0.c();
        this.f529690m = i17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f529684d = u0Var;
        return mo9409x10f9447a(sVar, this.f529685e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p290xb772556d.p291xca4f91d6.C2828xd7507fe8.ErrCode.f9501x82ef07b8;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        if (i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneOfflinePayConfirm", "Cmd : 609, errType = " + i18 + ", errCode = " + i19 + ", errMsg = " + str);
        }
        r45.hy4 hy4Var = (r45.hy4) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        if (i18 == 0 && i19 == 0) {
            try {
                if (hy4Var.f458088d != null) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(hy4Var.f458088d);
                    this.f529686f = jSONObject.optString(ya.b.f77506xba41a63c);
                    this.f529687g = jSONObject.optInt("retcode");
                    jSONObject.optString("retmsg");
                    this.f529688h = jSONObject.optInt("wx_error_type");
                    this.f529689i = jSONObject.optString("wx_error_msg");
                    jSONObject.toString();
                    if (jSONObject.has("real_name_info")) {
                        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("real_name_info");
                        this.f529692o = optJSONObject.optString("guide_flag");
                        this.f529693p = optJSONObject.optString("guide_wording");
                        this.f529694q = optJSONObject.optString("left_button_wording");
                        this.f529695r = optJSONObject.optString("right_button_wording");
                        this.f529696s = optJSONObject.optString("upload_credit_url");
                        if ("1".equals(this.f529692o) || "2".equals(this.f529692o)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1 c19088xa4b300c1 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1();
                            this.f529691n = c19088xa4b300c1;
                            c19088xa4b300c1.d(this.f529692o, this.f529693p, this.f529694q, this.f529695r, this.f529696s, 0);
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneOfflinePayConfirm", e17, "", new java.lang.Object[0]);
                str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kkk);
                i18 = 1000;
                i19 = 2;
            }
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f529684d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
