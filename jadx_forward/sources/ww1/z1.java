package ww1;

/* loaded from: classes9.dex */
public class z1 extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f531904d = null;

    /* renamed from: e, reason: collision with root package name */
    public final double f531905e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f531906f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f531907g;

    /* renamed from: h, reason: collision with root package name */
    public int f531908h;

    public z1(double d17, java.lang.String str, java.lang.String str2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            hashMap.put("fee", java.lang.Math.round(100.0d * d17) + "");
            hashMap.put("fee_type", str);
            hashMap.put("desc", java.net.URLEncoder.encode(str2, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
        } catch (java.io.UnsupportedEncodingException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Micromsg.NetSceneTenpayRemittanceQuery", e17, "", new java.lang.Object[0]);
        }
        this.f531905e = d17;
        this.f531906f = str;
        this.f531907g = str2;
        m83032xb4c13117(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return 1623;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/mmpay-bin/transfersetf2ffee";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        int i18;
        if (i17 != 0) {
            return;
        }
        this.f531904d = jSONObject.optString("pay_url");
        int optInt = jSONObject.optInt("qrcode_level");
        if (optInt != 0) {
            i18 = 1;
            if (optInt != 1) {
                i18 = 2;
                if (optInt != 2) {
                    i18 = 3;
                }
            }
        } else {
            i18 = 0;
        }
        this.f531908h = i18;
        this.f531907g = jSONObject.optString("desc");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.NetSceneTenpayRemittanceQuery", "qrcodeLevel:%s ", java.lang.Integer.valueOf(this.f531908h));
    }
}
