package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29;

/* loaded from: classes9.dex */
public class y extends lp5.a {
    public y(java.lang.String str, java.lang.String str2, int i17, long j17, int i18) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("recv_username", str);
        hashMap.put("qrcodeid", str2);
        hashMap.put(ya.b.f77474x50f1e011, java.lang.String.valueOf(i17));
        hashMap.put("amount", java.lang.String.valueOf(j17));
        hashMap.put("set_amount", java.lang.String.valueOf(i18));
        m146205xb4c13117(hashMap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneH5F2fTransferCancelPay", "qrcodeId: %s, currency: %s", str2, java.lang.Integer.valueOf(i17));
    }

    @Override // lp5.a
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/h5f2ftransfercancelpay";
    }

    @Override // lp5.a
    public int I() {
        return 1257;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1257;
    }

    @Override // lp5.a
    /* renamed from: onGYNetEnd */
    public void mo68407x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        jSONObject.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneH5F2fTransferCancelPay", "errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i17), str);
    }
}
