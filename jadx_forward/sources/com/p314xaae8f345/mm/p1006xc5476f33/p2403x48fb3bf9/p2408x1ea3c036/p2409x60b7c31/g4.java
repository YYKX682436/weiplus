package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes8.dex */
public class g4 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return nd1.d1.f72920x24728b;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
        java.lang.String str;
        float f17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSetNavigationBarColor", "invoke");
        boolean z17 = bVar.f488130b.f426039c.optInt("actionCode") == 1;
        try {
            org.json.JSONObject optJSONObject = bVar.f488130b.f426039c.optJSONObject("wxcolor");
            str = optJSONObject != null ? com.p314xaae8f345.mm.ui.bk.C() ? optJSONObject.optString("dark") : optJSONObject.optString("light") : bVar.f488130b.f426039c.optString("color");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetNavigationBarColor", e17.getMessage());
            str = "";
            z17 = true;
        }
        try {
            f17 = (float) bVar.f488130b.f426039c.optDouble("alpha", -1.0d);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetNavigationBarColor", e18.getMessage());
            f17 = -1.0f;
        }
        int optInt = bVar.f488130b.f426039c.optInt("iconDark", -1);
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a;
            e0Var.S = b3.l.m9702x7444d5ad(e0Var.f488143d, com.p314xaae8f345.mm.R.C30859x5a72f63.f560119bk);
            e0Var.f263719t.f264243y = -1;
            e0Var.G();
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a;
            e0Var2.getClass();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                try {
                    int parseColor = android.graphics.Color.parseColor(str) | (-16777216);
                    e0Var2.R = true;
                    e0Var2.S = parseColor;
                    e0Var2.f263719t.m74257x26c2c9e9(parseColor);
                } catch (java.lang.Exception unused) {
                }
            }
            e0Var2.f263719t.m74260x4a8f5a11(optInt);
            if (f17 < 0.0f || f17 > 1.0f) {
                e0Var2.G();
            } else {
                e0Var2.M.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.n1(e0Var2, f17));
            }
        }
        bVar.a();
    }
}
