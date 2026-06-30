package gs4;

/* loaded from: classes8.dex */
public class e extends com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o {
    public e(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("passwd", str);
        m83032xb4c13117(hashMap);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getFuncId */
    public int mo1062x19c9adf5() {
        return zd1.s.f77583x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getTenpayCgicmd */
    public int mo1063x46809856() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.o
    /* renamed from: getUri */
    public java.lang.String mo1064xb5887636() {
        return "/cgi-bin/mmpay-bin/tenpay/closewalletlock";
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z0
    /* renamed from: onGYNetEnd */
    public void mo1065x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCloseWalletLock", "close wallet lock errCode: %d, errMsg: %s, json: %s", java.lang.Integer.valueOf(i17), str, jSONObject);
    }
}
