package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes5.dex */
public final class r6 extends com.tencent.mm.plugin.appbrand.jsapi.media.p {
    public static final int CTRL_INDEX = 1586;
    public static final java.lang.String NAME = "saveMediaToPhotosAlbum";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.p
    public java.util.List C(org.json.JSONObject jSONObject) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("filePaths");
            if (jSONArray.length() > 0) {
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    arrayList.add(jSONArray.optString(i17));
                }
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiSaveMediaToPhotosAlbum", "addSaveItemFromData: filePaths is empty");
            }
            return arrayList;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSaveMediaToPhotosAlbum", "addSaveItemFromData: failed " + e17);
            return arrayList;
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.p
    public boolean D(java.lang.String str) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (!(str == null ? "" : str).toLowerCase().contains("image")) {
            if (str == null) {
                str = "";
            }
            if (!str.toLowerCase().contains("video")) {
                return false;
            }
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.p
    public java.lang.String E(java.lang.String str, java.lang.String str2) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        return str2.toLowerCase().contains("video") ? q75.c.b(str) : q75.c.a(str);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.p
    public java.util.List F(org.json.JSONObject jSONObject) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("mediaTypes");
            if (jSONArray.length() > 0) {
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    arrayList.add(jSONArray.optString(i17));
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSaveMediaToPhotosAlbum", "getMediaTypesFromData: mediaTypes is empty");
            }
            return arrayList;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSaveMediaToPhotosAlbum", "getMediaTypesFromData: failed " + e17);
            return arrayList;
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.p
    public void H(java.lang.String str) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.jsapi.media.q6(this));
    }
}
