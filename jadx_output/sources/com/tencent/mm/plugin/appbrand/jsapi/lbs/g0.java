package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
public class g0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 38;
    public static final java.lang.String NAME = "openLocation";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        android.content.Intent C = C(jSONObject);
        if (C == null) {
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        android.content.Context context = lVar.getContext();
        if (context == null) {
            lVar.a(i17, o("fail:internal error invalid android context"));
        } else {
            j45.l.j(context, ya.b.LOCATION, ".ui.RedirectUI", C, null);
            lVar.a(i17, o("ok"));
        }
    }

    public final android.content.Intent C(org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenLocation", "data:%s", jSONObject);
        try {
            float L = com.tencent.mm.sdk.platformtools.t8.L(jSONObject.optString("latitude"), 0.0f);
            float L2 = com.tencent.mm.sdk.platformtools.t8.L(jSONObject.optString("longitude"), 0.0f);
            int i17 = 0;
            if (java.lang.Math.abs(L) <= 90.0f && java.lang.Math.abs(L2) <= 180.0f) {
                java.lang.String c17 = com.tencent.mm.plugin.appbrand.utils.s0.c(jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME));
                java.lang.String c18 = com.tencent.mm.plugin.appbrand.utils.s0.c(jSONObject.optString("address"));
                try {
                    i17 = com.tencent.mm.sdk.platformtools.t8.P(jSONObject.optString("scale"), 0);
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
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiOpenLocation", "lat: %f or lng: %f value is error!", java.lang.Float.valueOf(L), java.lang.Float.valueOf(L2));
        } catch (java.lang.Exception unused2) {
        }
        return null;
    }
}
