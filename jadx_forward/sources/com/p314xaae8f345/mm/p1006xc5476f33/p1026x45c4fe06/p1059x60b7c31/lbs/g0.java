package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs;

/* loaded from: classes7.dex */
public class g0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34401x366c91de = 38;

    /* renamed from: NAME */
    public static final java.lang.String f34402x24728b = "openLocation";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        android.content.Intent C = C(jSONObject);
        if (C == null) {
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        android.content.Context mo50352x76847179 = lVar.mo50352x76847179();
        if (mo50352x76847179 == null) {
            lVar.a(i17, o("fail:internal error invalid android context"));
        } else {
            j45.l.j(mo50352x76847179, ya.b.f77489x9ff58fb5, ".ui.RedirectUI", C, null);
            lVar.a(i17, o("ok"));
        }
    }

    public final android.content.Intent C(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenLocation", "data:%s", jSONObject);
        try {
            float L = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L(jSONObject.optString("latitude"), 0.0f);
            float L2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L(jSONObject.optString("longitude"), 0.0f);
            int i17 = 0;
            if (java.lang.Math.abs(L) <= 90.0f && java.lang.Math.abs(L2) <= 180.0f) {
                java.lang.String c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s0.c(jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d));
                java.lang.String c18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s0.c(jSONObject.optString("address"));
                try {
                    i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(jSONObject.optString("scale"), 0);
                } catch (java.lang.Exception unused) {
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("map_view_type", 10);
                intent.putExtra("kwebmap_slat", L);
                intent.putExtra("kwebmap_lng", L2);
                if (i17 > 0) {
                    intent.putExtra("kwebmap_scale", i17);
                }
                intent.putExtra("kPoiName", c17);
                intent.putExtra("Kwebmap_locaion", c18);
                return intent;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiOpenLocation", "lat: %f or lng: %f value is error!", java.lang.Float.valueOf(L), java.lang.Float.valueOf(L2));
        } catch (java.lang.Exception unused2) {
        }
        return null;
    }
}
