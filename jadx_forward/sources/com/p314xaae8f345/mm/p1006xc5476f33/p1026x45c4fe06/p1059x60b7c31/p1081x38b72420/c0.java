package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420;

/* loaded from: classes7.dex */
public class c0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34047x366c91de = 145;

    /* renamed from: NAME */
    public static final java.lang.String f34048x24728b = "enterContact";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f162063g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f162064h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f162065i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f162066m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f162067n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f162068o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f162069p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f162070q;

    /* renamed from: r, reason: collision with root package name */
    public final int f162071r = cf.b.a(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (!(lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0)) {
            if (lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) {
                D((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) lVar, lVar, jSONObject, i17);
                return;
            } else {
                lVar.a(i17, o("fail:internal error invalid js component"));
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 V0 = c0Var.V0();
        if (V0 != null) {
            D(V0, c0Var, jSONObject, i17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiEnterContact", "enterChatting fail, pageView is null");
            c0Var.a(i17, o("fail:current page do not exist"));
        }
    }

    public final void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 c11813xf952a195, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.b0 b0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.C12066xe058977c c12066xe058977c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.C12066xe058977c();
        java.lang.String str2 = n7Var.mo32091x9a3f0ba2().u0().f128811x;
        k91.z5 z5Var = new k91.z5();
        z5Var.f387396a = n7Var.mo48798x74292566();
        z5Var.f387399d = str2;
        z5Var.f387400e = c11813xf952a195.f387374d;
        z5Var.f387401f = c11813xf952a195.f387376f;
        z5Var.f387403h = c11813xf952a195.f387385r.f156932d;
        z5Var.f387402g = c11813xf952a195.f387385r.f33456x1c82a56c;
        z5Var.f387404i = c11813xf952a195.f387385r.f156905md5;
        z5Var.f387405j = 5;
        z5Var.f387406k = n7Var.X1();
        z5Var.f387407l = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v9.b(n7Var.mo48798x74292566());
        java.lang.String str3 = "";
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str2 = str;
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiEnterContact", "username & subBusinessUsername is null, err");
            str2 = "";
        }
        c12066xe058977c.f162019h = str2;
        java.lang.String str4 = c11813xf952a195.f387374d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiEnterContact", "username & subBusinessUsername is null, err");
            } else {
                str3 = str4;
            }
        }
        c12066xe058977c.f162020i = str3;
        c12066xe058977c.f162017f = this.f162063g;
        c12066xe058977c.f162021m = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.a0(this, c12066xe058977c, z5Var, n7Var, b0Var);
        c12066xe058977c.d();
    }

    public void D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.w wVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.w(this, lVar, i17);
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiEnterContact", "enterChatting fail, data is null");
            wVar.a(false, "fail:invalid data", null);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 E0 = n7Var.mo32091x9a3f0ba2().E0();
        if (E0 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiEnterContact", "enterChatting fail, config is null");
            wVar.a(false, "fail:config is null", null);
            return;
        }
        java.lang.String optString = jSONObject.optString("sessionFrom");
        this.f162063g = optString;
        if (optString.length() > 1024) {
            this.f162063g = this.f162063g.substring(0, 1024);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiEnterContact", "sessionFrom length is large than 1024!");
        }
        this.f162064h = jSONObject.optString("businessId");
        java.lang.String optString2 = jSONObject.optString("sendMessageTitle");
        this.f162065i = optString2;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            this.f162065i = n7Var.J1();
        }
        java.lang.String optString3 = jSONObject.optString("sendMessagePath");
        this.f162066m = optString3;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString3)) {
            java.lang.String Y1 = n7Var.Y1();
            this.f162066m = Y1;
            if (Y1.length() > 1024) {
                this.f162066m = this.f162066m.substring(0, 1024);
            }
        }
        this.f162067n = jSONObject.optString("sendMessageImg");
        this.f162068o = jSONObject.optBoolean("showMessageCard", false);
        this.f162070q = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f162067n);
        this.f162069p = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.n2.e(n7Var, this.f162067n, true);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f162064h)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiEnterContact", "businessId is empty, enter to chatting");
            C(n7Var, E0, "", wVar);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiEnterContact", "do GetSubBusinessInfo cgi");
        java.lang.String str = n7Var.mo32091x9a3f0ba2().u0().f128811x;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiEnterContact", "doCgiAndEnterChatting username is null, err");
            wVar.a(false, "fail:config is null", null);
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar2 = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar2.f152197a = new r45.po3();
        lVar2.f152198b = new r45.qo3();
        lVar2.f152199c = "/cgi-bin/mmbiz-bin/wxausrevent/getsubbusinessinfo";
        lVar2.f152200d = 1303;
        lVar2.f152201e = 0;
        lVar2.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar2.a();
        r45.po3 po3Var = (r45.po3) a17.f152243a.f152217a;
        po3Var.f464784d = str;
        po3Var.f464785e = this.f162064h;
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(a17, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.y(this, wVar, n7Var, E0));
    }
}
