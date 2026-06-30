package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29;

/* loaded from: classes9.dex */
public class z extends lp5.a implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.t {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f238601f;

    public z(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17, int i18) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("amount", java.lang.String.valueOf(j17));
        hashMap.put("recv_username", str);
        hashMap.put("recv_nickname", str2);
        hashMap.put("qrcodeid", str5);
        try {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                try {
                    hashMap.put("desc", java.net.URLEncoder.encode(str3, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
                } catch (java.io.UnsupportedEncodingException e17) {
                    e = e17;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneH5F2fTransferPay", e, "", new java.lang.Object[0]);
                    hashMap.put(ya.b.f77474x50f1e011, java.lang.String.valueOf(i17));
                    hashMap.put("set_amount", java.lang.String.valueOf(i18));
                    m146205xb4c13117(hashMap);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneH5F2fTransferPay", "username: %s, nickname: %s, amount: %s, desc: %s, msg: %s, currency: %s", str, str2, java.lang.Long.valueOf(j17), str3, str4, java.lang.Integer.valueOf(i17));
                }
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                try {
                    hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, java.net.URLEncoder.encode(str4, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
                } catch (java.io.UnsupportedEncodingException e18) {
                    e = e18;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneH5F2fTransferPay", e, "", new java.lang.Object[0]);
                    hashMap.put(ya.b.f77474x50f1e011, java.lang.String.valueOf(i17));
                    hashMap.put("set_amount", java.lang.String.valueOf(i18));
                    m146205xb4c13117(hashMap);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneH5F2fTransferPay", "username: %s, nickname: %s, amount: %s, desc: %s, msg: %s, currency: %s", str, str2, java.lang.Long.valueOf(j17), str3, str4, java.lang.Integer.valueOf(i17));
                }
            }
        } catch (java.io.UnsupportedEncodingException e19) {
            e = e19;
        }
        hashMap.put(ya.b.f77474x50f1e011, java.lang.String.valueOf(i17));
        hashMap.put("set_amount", java.lang.String.valueOf(i18));
        m146205xb4c13117(hashMap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneH5F2fTransferPay", "username: %s, nickname: %s, amount: %s, desc: %s, msg: %s, currency: %s", str, str2, java.lang.Long.valueOf(j17), str3, str4, java.lang.Integer.valueOf(i17));
    }

    @Override // lp5.a
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/h5f2ftransferpay";
    }

    @Override // lp5.a
    public int I() {
        return 1529;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1529;
    }

    @Override // lp5.a
    /* renamed from: onGYNetEnd */
    public void mo68407x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        java.lang.String optString = jSONObject.optString("payurl", "");
        this.f238601f = optString;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneH5F2fTransferPay", "payurl: %s", optString);
    }
}
