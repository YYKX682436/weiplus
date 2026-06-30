package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes5.dex */
public final class r6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.p {

    /* renamed from: CTRL_INDEX */
    public static final int f34501x366c91de = 1586;

    /* renamed from: NAME */
    public static final java.lang.String f34502x24728b = "saveMediaToPhotosAlbum";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.p
    public java.util.List C(org.json.JSONObject jSONObject) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("filePaths");
            if (jSONArray.length() > 0) {
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    arrayList.add(jSONArray.optString(i17));
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiSaveMediaToPhotosAlbum", "addSaveItemFromData: filePaths is empty");
            }
            return arrayList;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSaveMediaToPhotosAlbum", "addSaveItemFromData: failed " + e17);
            return arrayList;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.p
    public boolean D(java.lang.String str) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
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

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.p
    public java.lang.String E(java.lang.String str, java.lang.String str2) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        return str2.toLowerCase().contains("video") ? q75.c.b(str) : q75.c.a(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.p
    public java.util.List F(org.json.JSONObject jSONObject) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("mediaTypes");
            if (jSONArray.length() > 0) {
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    arrayList.add(jSONArray.optString(i17));
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSaveMediaToPhotosAlbum", "getMediaTypesFromData: mediaTypes is empty");
            }
            return arrayList;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSaveMediaToPhotosAlbum", "getMediaTypesFromData: failed " + e17);
            return arrayList;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.p
    public void H(java.lang.String str) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.q6(this));
    }
}
