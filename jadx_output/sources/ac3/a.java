package ac3;

/* loaded from: classes9.dex */
public class a extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public final int f3078d;

    public a(int i17, java.lang.String str, java.lang.String str2) {
        this.f3078d = 0;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("flag", "" + i17);
        hashMap.put("passwd", str);
        hashMap.put("req_key", "" + str2);
        this.f3078d = i17;
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 1697;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 1697;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/snspaymanage";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsPayManage", " errCode: " + i17 + " errMsg :" + str);
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSnsPayManage", "onGYNetEnd() NetSceneSnsPayManage is false!");
        } else if (this.f3078d == 1) {
            bc3.a.d(1);
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsPayManage", "onGYNetEnd() setIsOpenSnsPay with 1");
        } else {
            bc3.a.d(0);
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsPayManage", "onGYNetEnd() setIsOpenSnsPay with 0");
        }
    }
}
