package vs3;

/* loaded from: classes9.dex */
public class e extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f521417d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f521418e;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f521421h;

    /* renamed from: m, reason: collision with root package name */
    public final int f521423m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f521424n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f521425o;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.p1979x633fb29.C16957xf1da7b74 f521419f = null;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f521420g = null;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f521422i = null;

    public e(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.f521421h = str;
        this.f521423m = i17;
        this.f521424n = str5;
        this.f521425o = str2;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.qh3();
        lVar.f152198b = new r45.rh3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getlatestpayproductinfo";
        lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.l.f34861x366c91de;
        lVar.f152201e = 229;
        lVar.f152202f = 1000000229;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f521418e = a17;
        r45.qh3 qh3Var = (r45.qh3) a17.f152243a.f152217a;
        qh3Var.f465523d = str;
        qh3Var.f465525f = str3;
        qh3Var.f465524e = str2;
        qh3Var.f465526g = str4;
        qh3Var.f465527h = bt4.f.b().c(str);
        java.lang.String.format("funcId:%s, appId:%s, productId:%s, remark:%s", str, str3, str2, str4);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f521417d = u0Var;
        return mo9409x10f9447a(sVar, this.f521418e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.l.f34861x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        java.lang.String[] split;
        r45.rh3 rh3Var = (r45.rh3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        java.lang.String str2 = rh3Var.f466400g;
        this.f521422i = "";
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && (split = str2.split("&")) != null && split.length > 0) {
            boolean z17 = true;
            for (java.lang.String str3 : split) {
                java.lang.String[] split2 = str3.split("=");
                if (split2.length == 2) {
                    if (z17) {
                        z17 = false;
                    } else {
                        this.f521422i += " ";
                    }
                    this.f521422i += split2[1];
                }
            }
        }
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rh3Var.f466403m);
        java.lang.String str4 = this.f521421h;
        if (!K0) {
            try {
                this.f521420g = vs3.b.d(str4, new org.json.JSONObject(rh3Var.f466403m).optJSONArray("product_info"));
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneGetLatestPayProductInfo", e17, "", new java.lang.Object[0]);
            }
        }
        if (i18 == 0 && i19 == 0) {
            java.lang.String str5 = rh3Var.f466397d;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                try {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.p1979x633fb29.C16957xf1da7b74 c17 = vs3.b.c(str4, new org.json.JSONObject(str5));
                    this.f521419f = c17;
                    c17.f236607h = this.f521422i;
                } catch (org.json.JSONException e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneGetLatestPayProductInfo", e18, "", new java.lang.Object[0]);
                }
            }
        }
        java.lang.String.format("OutErrCode : %d ,OutErrMsg : %s , WxErrCode : %d , WxErrMsg : %s", java.lang.Integer.valueOf(rh3Var.f466398e), rh3Var.f466399f, java.lang.Integer.valueOf(rh3Var.f466401h), rh3Var.f466402i);
        if (i19 == 0 && (i19 = rh3Var.f466401h) == 0) {
            i19 = rh3Var.f466398e;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rh3Var.f466402i) ? rh3Var.f466402i : rh3Var.f466399f;
        }
        this.f521417d.mo815x76e0bfae(i18, i19, str, this);
    }
}
