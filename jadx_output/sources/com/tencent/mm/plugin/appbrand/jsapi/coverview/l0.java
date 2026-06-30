package com.tencent.mm.plugin.appbrand.jsapi.coverview;

/* loaded from: classes7.dex */
public class l0 extends gb1.h {
    private static final int CTRL_INDEX = 810;
    public static final java.lang.String NAME = "updateImagePreviewer";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.getInt("viewId");
    }

    @Override // gb1.h
    public boolean K(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        float[] F;
        if (!(view instanceof com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiUpdateImagePreviewer", "the view(%s) is not a instance of CoverViewContainer", java.lang.Integer.valueOf(i17));
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.coverview.ZoomImagePreviewer zoomImagePreviewer = (com.tencent.mm.plugin.appbrand.jsapi.coverview.ZoomImagePreviewer) ((com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) view).d(com.tencent.mm.plugin.appbrand.jsapi.coverview.ZoomImagePreviewer.class);
        if (zoomImagePreviewer == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiUpdateImagePreviewer", "the target view(%s) is null", java.lang.Integer.valueOf(i17));
            return false;
        }
        if1.t.a(view, jSONObject.optJSONObject("style"));
        try {
            if (jSONObject.has("position") && (F = F(jSONObject)) != null) {
                int i18 = (int) F[2];
                int i19 = (int) F[3];
                zoomImagePreviewer.f80663p1 = i18;
                zoomImagePreviewer.f80665x1 = i19;
            }
            if (jSONObject.has("scale")) {
                zoomImagePreviewer.setScale((float) jSONObject.optDouble("scale"));
            }
            if (!jSONObject.has("urls")) {
                return true;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("urls");
            if (optJSONArray != null) {
                for (int i27 = 0; i27 < optJSONArray.length(); i27++) {
                    java.lang.String obj = optJSONArray.get(i27).toString();
                    if (!android.text.TextUtils.isEmpty(obj)) {
                        arrayList.add(obj);
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiUpdateImagePreviewer", "urls is empty");
            }
            if (arrayList.isEmpty()) {
                return true;
            }
            zoomImagePreviewer.f(arrayList);
            return true;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiUpdateImagePreviewer", e17, "", new java.lang.Object[0]);
            return true;
        }
    }
}
