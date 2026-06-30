package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29;

/* loaded from: classes9.dex */
public class a0 extends lp5.a {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f238307f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f238308g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f238309h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f238310i;

    /* renamed from: m, reason: collision with root package name */
    public long f238311m;

    /* renamed from: n, reason: collision with root package name */
    public int f238312n;

    /* renamed from: o, reason: collision with root package name */
    public int f238313o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f238314p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f238315q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f238316r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f238317s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f238318t;

    public a0(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                hashMap.put("qrcode_url", java.net.URLEncoder.encode(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
            }
        } catch (java.io.UnsupportedEncodingException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneH5F2fTransferScanQrCode", e17, "", new java.lang.Object[0]);
        }
        m146205xb4c13117(hashMap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneH5F2fTransferScanQrCode", "qrcode_url: %s", str);
    }

    @Override // lp5.a
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/h5f2ftransferscanqrcode";
    }

    @Override // lp5.a
    public int I() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.n.f34632x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.n.f34632x366c91de;
    }

    @Override // lp5.a
    /* renamed from: onGYNetEnd */
    public void mo68407x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f238307f = jSONObject.optString("recv_username", "");
        this.f238308g = jSONObject.optString("recv_realname", "");
        this.f238309h = jSONObject.optString("recv_nickname", "");
        this.f238310i = jSONObject.optString("desc", "");
        this.f238311m = jSONObject.optLong("amount", 0L);
        this.f238312n = jSONObject.optInt("set_amount", 0);
        this.f238313o = jSONObject.optInt(ya.b.f77474x50f1e011, 0);
        this.f238314p = jSONObject.optString("currencyunit", "");
        this.f238315q = jSONObject.optString("qrcodeid", "");
        this.f238316r = jSONObject.optString("notice", "");
        this.f238317s = jSONObject.optString("notice_url", "");
        this.f238318t = jSONObject.optString("recv_headimgurl", "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneH5F2fTransferScanQrCode", "recv_username: %s, recv_nickname: %s, desc: %s, amount: %s, setAmount: %s, currencyunit: %s recv_headimgurl: %s", this.f238307f, this.f238309h, this.f238310i, java.lang.Long.valueOf(this.f238311m), java.lang.Integer.valueOf(this.f238312n), this.f238314p, this.f238318t);
    }
}
