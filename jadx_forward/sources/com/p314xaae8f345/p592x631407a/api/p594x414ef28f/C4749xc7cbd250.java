package com.p314xaae8f345.p592x631407a.api.p594x414ef28f;

/* renamed from: com.tencent.midas.api.request.APPurchase */
/* loaded from: classes5.dex */
public class C4749xc7cbd250 {

    /* renamed from: mOriginalJson */
    public java.lang.String f20259x16ffb366;

    /* renamed from: mSignature */
    public java.lang.String f20260xbab4e2cb;

    /* renamed from: mSku */
    public java.lang.String f20261x32d170;

    public C4749xc7cbd250(java.lang.String str, java.lang.String str2) {
        this.f20259x16ffb366 = str;
        this.f20261x32d170 = new org.json.JSONObject(new java.lang.String(android.util.Base64.decode(str.getBytes(), 0))).optString("product-id");
        this.f20260xbab4e2cb = str2;
    }

    /* renamed from: getOriginalJson */
    public java.lang.String m41583xe05d2ccf() {
        return this.f20259x16ffb366;
    }

    /* renamed from: getSignature */
    public java.lang.String m41584x3f6b0a02() {
        return this.f20260xbab4e2cb;
    }

    /* renamed from: getSku */
    public java.lang.String m41585xb5886de7() {
        return this.f20261x32d170;
    }

    /* renamed from: toString */
    public java.lang.String m41586x9616526c() {
        return "PurchaseInfo():" + this.f20259x16ffb366;
    }

    public C4749xc7cbd250(java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        this.f20260xbab4e2cb = (java.lang.String) jSONObject.get("sign");
        this.f20259x16ffb366 = (java.lang.String) jSONObject.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        this.f20261x32d170 = "";
    }

    public C4749xc7cbd250() {
        this.f20260xbab4e2cb = "";
        this.f20259x16ffb366 = "";
        this.f20261x32d170 = "";
    }
}
