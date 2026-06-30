package com.tencent.kinda.framework.module.impl;

/* loaded from: classes9.dex */
public class NetSceneTenpay extends com.tencent.mm.wallet_core.tenpay.model.r {
    private static final java.lang.String TAG = "WXP";
    com.tencent.kinda.gen.TenpayCgiCallback mCallback;
    int mCgiId;
    private final java.lang.String mUrl;

    /* loaded from: classes6.dex */
    public interface EndCallback {
        void onEnd(int i17);
    }

    public NetSceneTenpay(int i17, java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> hashMap, java.util.HashMap<java.lang.String, java.lang.String> hashMap2, com.tencent.kinda.gen.TenpayCgiCallback tenpayCgiCallback) {
        this.mCgiId = i17;
        this.mUrl = str;
        this.mCallback = tenpayCgiCallback;
        setWXRequestData(hashMap2);
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return this.mCgiId;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return this.mCgiId;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.mUrl)) {
            return this.mUrl;
        }
        int funcId = getFuncId();
        return funcId != 1544 ? funcId != 1679 ? funcId != 1992 ? "/cgi-bin/micromsg-bin/tenpay" : "/cgi-bin/mmpay-bin/gettransferwording" : "/cgi-bin/mmpay-bin/tenpay/getbannerinfo" : "/cgi-bin/mmpay-bin/transferplaceorder";
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.r, com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        super.onGYNetEnd(i17, str, jSONObject);
        com.tencent.mars.xlog.Log.i(TAG, "errCode:%d,errMsg:%s,json:%s", java.lang.Integer.valueOf(i17), str, jSONObject);
        java.lang.String.format("errCode:%d,errMsg:%s,json:%s", java.lang.Integer.valueOf(i17), str, jSONObject);
        if (i17 == 0) {
            this.mCallback.onSuccess(jSONObject.toString());
        } else {
            this.mCallback.onError(i17, str);
        }
    }
}
