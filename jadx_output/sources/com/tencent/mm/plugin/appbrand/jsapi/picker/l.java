package com.tencent.mm.plugin.appbrand.jsapi.picker;

/* loaded from: classes15.dex */
public final class l extends com.tencent.mm.plugin.appbrand.jsapi.picker.a {
    public static final int CTRL_INDEX = 84;
    public static final java.lang.String NAME = "showDatePickerView";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.a, com.tencent.mm.plugin.appbrand.jsapi.f
    /* renamed from: C */
    public void A(com.tencent.mm.plugin.appbrand.jsapi.t tVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String optString = jSONObject.optString("mode");
        if (com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_DATE.equals(optString)) {
            new com.tencent.mm.plugin.appbrand.jsapi.picker.e().g(this, tVar, jSONObject, i17, this.f82708g);
        } else if ("time".equals(optString)) {
            new com.tencent.mm.plugin.appbrand.jsapi.picker.k0().g(this, tVar, jSONObject, i17, this.f82708g);
        } else {
            tVar.a(i17, o("fail:invalid data"));
        }
    }
}
