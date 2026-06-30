package com.tencent.midas.api.request;

/* loaded from: classes5.dex */
public class APPurchase {
    public java.lang.String mOriginalJson;
    public java.lang.String mSignature;
    public java.lang.String mSku;

    public APPurchase(java.lang.String str, java.lang.String str2) {
        this.mOriginalJson = str;
        this.mSku = new org.json.JSONObject(new java.lang.String(android.util.Base64.decode(str.getBytes(), 0))).optString("product-id");
        this.mSignature = str2;
    }

    public java.lang.String getOriginalJson() {
        return this.mOriginalJson;
    }

    public java.lang.String getSignature() {
        return this.mSignature;
    }

    public java.lang.String getSku() {
        return this.mSku;
    }

    public java.lang.String toString() {
        return "PurchaseInfo():" + this.mOriginalJson;
    }

    public APPurchase(java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        this.mSignature = (java.lang.String) jSONObject.get("sign");
        this.mOriginalJson = (java.lang.String) jSONObject.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        this.mSku = "";
    }

    public APPurchase() {
        this.mSignature = "";
        this.mOriginalJson = "";
        this.mSku = "";
    }
}
