package com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29;

/* loaded from: classes9.dex */
public class i extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.r {

    /* renamed from: d, reason: collision with root package name */
    public org.json.JSONObject f295580d;

    /* renamed from: e, reason: collision with root package name */
    public int f295581e = 0;

    public i(java.util.Map map) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDelayQueryOrder", "NetSceneDelayQueryOrder call");
        m83032xb4c13117(map);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.k.f29752x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.k.f29752x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/mmpay-bin/tenpay/payorderquery";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.r, com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        super.mo1065x5f9cdc6f(i17, str, jSONObject);
        if (x51.o1.S) {
            try {
                jSONObject = new org.json.JSONObject("{\"retcode\":268447844,\"retmsg\":\"系统麻烦请稍后再试\",\"can_pay_retry\":1,\"show_retmsg_type\":1}");
            } catch (java.lang.Exception unused) {
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDelayQueryOrder", "errCode = " + i17 + "errMsg=" + str);
        this.f295580d = jSONObject;
        if (jSONObject != null) {
            jSONObject.toString();
            jSONObject.optInt("can_pay_retry");
            this.f295581e = jSONObject.optInt("show_retmsg_type");
        }
    }
}
