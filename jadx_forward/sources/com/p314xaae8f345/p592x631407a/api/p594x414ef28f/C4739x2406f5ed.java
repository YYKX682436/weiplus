package com.p314xaae8f345.p592x631407a.api.p594x414ef28f;

/* renamed from: com.tencent.midas.api.request.APInventory */
/* loaded from: classes5.dex */
public class C4739x2406f5ed {

    /* renamed from: mPurchaseMap */
    public java.util.Map<java.lang.String, com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4749xc7cbd250> f20165xcfcb8dee = new java.util.HashMap();

    /* renamed from: mPurchaseList */
    public java.util.ArrayList<com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4749xc7cbd250> f20164x29a5da4c = new java.util.ArrayList<>();

    public C4739x2406f5ed(java.lang.String str) {
        m41437x7db797d1(str);
    }

    /* renamed from: parsePurchse */
    private void m41437x7db797d1(java.lang.String str) {
        new java.util.ArrayList();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4749xc7cbd250 c4749xc7cbd250 = new com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4749xc7cbd250((java.lang.String) jSONArray.getJSONObject(i17).get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306), (java.lang.String) jSONArray.getJSONObject(i17).get("sign"));
                this.f20165xcfcb8dee.put(c4749xc7cbd250.m41585xb5886de7(), c4749xc7cbd250);
                this.f20164x29a5da4c.add(c4749xc7cbd250);
            }
        } catch (org.json.JSONException unused) {
        }
    }

    /* renamed from: erasePurchase */
    public void m41438x9935f5c7(java.lang.String str) {
        if (this.f20165xcfcb8dee.containsKey(str)) {
            this.f20165xcfcb8dee.remove(str);
        }
    }

    /* renamed from: getAllOwnedSkus */
    public java.util.List<java.lang.String> m41439xa272f110() {
        return new java.util.ArrayList(this.f20165xcfcb8dee.keySet());
    }

    /* renamed from: getAllPurchases */
    public java.util.List<com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4749xc7cbd250> m41440x37631967() {
        return new java.util.ArrayList(this.f20165xcfcb8dee.values());
    }

    /* renamed from: getPurchase */
    public com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4749xc7cbd250 m41441xe3c34277(java.lang.String str) {
        return this.f20165xcfcb8dee.get(str);
    }

    /* renamed from: getPurchaseList */
    public java.util.List<com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4749xc7cbd250> m41442xf30353b5() {
        return this.f20164x29a5da4c;
    }

    /* renamed from: hasPurchase */
    public boolean m41443x133dc1bb(java.lang.String str) {
        return this.f20165xcfcb8dee.containsKey(str);
    }
}
