package sc1;

/* loaded from: classes7.dex */
public class j1 extends gb1.h {

    /* renamed from: CTRL_INDEX */
    private static final int f76742x366c91de = 361;

    /* renamed from: NAME */
    public static final java.lang.String f76743x24728b = "updateLivePusher";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.optInt("livePusherId");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x00b1 -> B:32:0x00bc). Please report as a decompilation issue!!! */
    @Override // gb1.h
    public boolean K(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView : livePusherId=%d", java.lang.Integer.valueOf(i17));
        if (!(view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiUpdateLivePusher", "the view(%s) is not a instance of CoverViewContainer", java.lang.Integer.valueOf(i17));
            return false;
        }
        android.view.View view2 = (android.view.View) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505) view).d(android.view.View.class);
        if (!(view2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1094x32b0ec.C12151x47b5a23e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiUpdateLivePusher", "targetView not AppBrandLivePusherView");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1094x32b0ec.C12151x47b5a23e c12151x47b5a23e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1094x32b0ec.C12151x47b5a23e) view2;
        if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15515x140e67ac)) {
            c12151x47b5a23e.f163102h = jSONObject.optString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15515x140e67ac, c12151x47b5a23e.f163102h);
            jSONObject.optString("filterImageMd5", null);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c12151x47b5a23e.f163102h)) {
                try {
                    jSONObject.put(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15515x140e67ac, "");
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiUpdateLivePusher", "parseFilterImage, ignore exception:%s", e17);
                }
            } else if (c12151x47b5a23e.f163102h.startsWith("http://") || c12151x47b5a23e.f163102h.startsWith("https://")) {
                jSONObject.remove(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15515x140e67ac);
            }
        }
        c12151x47b5a23e.g(sc1.n1.b(jSONObject));
        java.lang.Object obj = com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15505x57568ce2;
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15505x57568ce2)) {
                java.lang.String string = jSONObject.getString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15505x57568ce2);
                java.lang.String optString = jSONObject.optString("backgroundMD5");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateLivePusher", "convertBackgroundImageToLocalPath, url is null");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d0.c(tVar, string, optString, new sc1.g1(this, c12151x47b5a23e, string));
                }
            }
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", obj, e18.getLocalizedMessage());
        }
        try {
            obj = jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15515x140e67ac);
            if (obj != 0) {
                java.lang.String string2 = jSONObject.getString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15515x140e67ac);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateLivePusher", "convertFilterImageToLocalPath, url is null");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d0.c(tVar, string2, null, new sc1.h1(this, c12151x47b5a23e, string2));
                }
            }
        } catch (org.json.JSONException e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15515x140e67ac, e19.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15532xbc3ed888)) {
                java.lang.String string3 = jSONObject.getString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15532xbc3ed888);
                java.lang.String optString2 = jSONObject.optString("watermarkMD5");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string3)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateLivePusher", "convertWatermarkImageToLocalPath, url is null");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d0.c(tVar, string3, optString2, new sc1.i1(this, c12151x47b5a23e));
                }
            }
            return true;
        } catch (org.json.JSONException e27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15532xbc3ed888, e27.getLocalizedMessage());
            return true;
        }
    }
}
