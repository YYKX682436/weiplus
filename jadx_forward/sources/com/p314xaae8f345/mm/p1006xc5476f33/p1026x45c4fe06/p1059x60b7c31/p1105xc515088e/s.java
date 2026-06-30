package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e;

/* loaded from: classes15.dex */
public final class s extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.k implements java.lang.Runnable {

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f164288m = new java.util.concurrent.atomic.AtomicReference();

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.y yVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.m mVar) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.k
    public void e(org.json.JSONObject jSONObject) {
        super.e(jSONObject);
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("array");
        org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("current");
        if (optJSONArray == null || optJSONArray2 == null || optJSONArray.length() != optJSONArray2.length()) {
            d("fail:invalid data", null);
            return;
        }
        if (optJSONArray.length() <= 0) {
            d("ok", null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShowMultiPickerView", "showMultiPickerView , empty range (one-dimensional)");
            h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.o(this));
            return;
        }
        try {
            tl1.h[] hVarArr = new tl1.h[optJSONArray.length()];
            boolean z17 = true;
            for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                org.json.JSONArray jSONArray = optJSONArray.getJSONArray(i17);
                int i18 = optJSONArray2.getInt(i17);
                int length = jSONArray.length();
                java.lang.String[] strArr = new java.lang.String[length];
                for (int i19 = 0; i19 < length; i19++) {
                    strArr[i19] = jSONArray.getString(i19);
                }
                hVarArr[i17] = new tl1.h(strArr, i18);
                z17 &= jSONArray.length() <= 0;
            }
            if (!z17) {
                this.f164288m.set(hVarArr);
                h(this);
            } else {
                d("ok", null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShowMultiPickerView", "showMultiPickerView , empty range (multi-dimensional)");
                h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.p(this));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiShowMultiPickerView", e17, "opt params", new java.lang.Object[0]);
            d("fail:invalid data", null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.k
    public void f(org.json.JSONObject jSONObject) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12785x9d0ee4b9 c12785x9d0ee4b9 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12785x9d0ee4b9) c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12785x9d0ee4b9.class);
        if (c12785x9d0ee4b9 == null) {
            d("fail cant init view", null);
            return;
        }
        tl1.h[] hVarArr = (tl1.h[]) this.f164288m.get();
        if (hVarArr == null || hVarArr.length <= 0) {
            d("fail error data", null);
            return;
        }
        c12785x9d0ee4b9.a(hVarArr);
        this.f501733d.m166747x3c802832(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.q(this));
        this.f501733d.m166748x4764e8cd(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.r(this));
        this.f501733d.i();
    }
}
