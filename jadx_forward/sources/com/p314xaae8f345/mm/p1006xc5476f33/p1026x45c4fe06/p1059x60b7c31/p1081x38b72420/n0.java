package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420;

/* loaded from: classes7.dex */
public class n0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34055x366c91de = 550;

    /* renamed from: NAME */
    public static final java.lang.String f34056x24728b = "privateEnterContact";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f162109g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f162110h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f162111i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f162112m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f162113n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f162114o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f162115p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f162116q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f162117r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f162118s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f162119t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f162120u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f162121v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f162122w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f162123x;

    /* renamed from: y, reason: collision with root package name */
    public final int f162124y = cf.b.a(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (!(lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0)) {
            if (lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) {
                C((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) lVar, lVar, jSONObject, i17);
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiPrivateEnterContact", "privateEnterContact not support");
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 V0 = c0Var.V0();
        if (V0 != null) {
            C(V0, c0Var, jSONObject, i17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPrivateEnterContact", "privateEnterContact enterChatting fail, pageView is null");
            c0Var.a(i17, o("fail:current page do not exist"));
        }
    }

    public void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.f0 f0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.f0(this, lVar, i17);
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiPrivateEnterContact", "privateEnterContact enterChatting fail, data is null");
            f0Var.a(false, "fail:invalid data", null);
            return;
        }
        if (n7Var.mo32091x9a3f0ba2().E0() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiPrivateEnterContact", "privateEnterContact enterChatting fail, config is null");
            f0Var.a(false, "fail:config is null", null);
            return;
        }
        java.lang.String optString = jSONObject.optString("sessionFrom");
        this.f162109g = optString;
        if (optString.length() > 1024) {
            this.f162109g = this.f162109g.substring(0, 1024);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPrivateEnterContact", "privateEnterContact sessionFrom length is large than 1024!");
        }
        java.lang.String optString2 = jSONObject.optString("appId");
        this.f162110h = optString2;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            f0Var.a(false, "fail:appId is null", null);
            return;
        }
        this.f162111i = jSONObject.optString("userName");
        java.lang.String optString3 = jSONObject.optString("contactUsername");
        this.f162115p = optString3;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString3)) {
            optString3 = "";
        } else if (!optString3.endsWith("@app")) {
            optString3 = optString3.concat("@app");
        }
        this.f162115p = optString3;
        this.f162112m = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        this.f162113n = jSONObject.optString("subTitle");
        this.f162114o = jSONObject.optString("headimgUrl");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f162111i)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.C12066xe058977c c12066xe058977c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.C12066xe058977c();
            c12066xe058977c.f162019h = this.f162111i;
            c12066xe058977c.f162017f = this.f162109g;
            c12066xe058977c.f162021m = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.h0(this, c12066xe058977c, n7Var, f0Var);
            c12066xe058977c.d();
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f162115p)) {
            return;
        }
        this.f162117r = jSONObject.optString("businessId");
        this.f162118s = jSONObject.optString("sendMessageTitle");
        this.f162119t = jSONObject.optString("sendMessagePath");
        this.f162120u = jSONObject.optString("sendMessageImg");
        this.f162121v = jSONObject.optBoolean("showMessageCard", false);
        this.f162123x = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f162120u);
        this.f162122w = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.n2.e(n7Var, this.f162120u, true);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f162115p)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiPrivateEnterContact", "doCgiAndEnterChatting username is null, err");
            f0Var.a(false, "fail:config is null", null);
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
        po3Var.f464784d = this.f162115p;
        po3Var.f464785e = this.f162117r;
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(a17, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.j0(this, f0Var, n7Var));
    }
}
