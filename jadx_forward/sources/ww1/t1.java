package ww1;

/* loaded from: classes9.dex */
public class t1 extends lp5.a {

    /* renamed from: f, reason: collision with root package name */
    public int f531818f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f531819g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f531820h;

    /* renamed from: i, reason: collision with root package name */
    public int f531821i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f531822m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f531823n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f531824o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f531825p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f531826q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f531827r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f531828s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f531829t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f531830u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f531831v;

    /* renamed from: w, reason: collision with root package name */
    public final long f531832w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f531833x;

    public t1(int i17, int i18) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("set_amount", java.lang.String.valueOf(i17));
        hashMap.put("wallet_type", java.lang.String.valueOf(i18));
        m146205xb4c13117(hashMap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneH5F2fTransferGetQrCode", "setAmount: %s, walletType: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // lp5.a
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/h5f2ftransfergetqrcode";
    }

    @Override // lp5.a
    public int I() {
        return 1335;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1335;
    }

    @Override // lp5.a
    /* renamed from: onGYNetEnd */
    public void mo68407x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f531818f = jSONObject.optInt("retcode", 0);
        this.f531819g = jSONObject.optString("retmsg", "");
        this.f531820h = jSONObject.optString("qrcode_url", "");
        this.f531821i = jSONObject.optInt("alert_type", 0);
        this.f531822m = jSONObject.optString("alert_title", "");
        this.f531823n = jSONObject.optString("left_button_text", "");
        this.f531824o = jSONObject.optString("right_button_text", "");
        this.f531825p = jSONObject.optString("right_button_url", "");
        this.f531826q = jSONObject.optString("bottom_text", "");
        this.f531827r = jSONObject.optString("bottom_url", "");
        jSONObject.optInt(ya.b.f77474x50f1e011, 0);
        this.f531828s = jSONObject.optString("currencyunit", "");
        this.f531829t = jSONObject.optString("notice", "");
        this.f531830u = jSONObject.optString("notice_url", "");
        this.f531831v = jSONObject.optString("recv_realname", "");
        if (jSONObject.optInt("set_amount", 0) == 0) {
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_HK_PAY_URL_STRING, this.f531820h);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneH5F2fTransferGetQrCode", "set payurl: %s", this.f531820h);
        }
    }

    public t1(long j17, int i17, java.lang.String str, int i18) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("amount", java.lang.String.valueOf(j17));
        hashMap.put("set_amount", java.lang.String.valueOf(i17));
        try {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                hashMap.put("desc", java.net.URLEncoder.encode(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
            }
        } catch (java.io.UnsupportedEncodingException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneH5F2fTransferGetQrCode", e17, "", new java.lang.Object[0]);
        }
        hashMap.put("wallet_type", java.lang.String.valueOf(i18));
        m146205xb4c13117(hashMap);
        this.f531832w = j17;
        this.f531833x = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneH5F2fTransferGetQrCode", "amount: %d, setAmount: %s, desc: %s, walletType: %s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), str, java.lang.Integer.valueOf(i18));
    }
}
