package com.tencent.mm.plugin.appbrand.jsapi.coverview;

/* loaded from: classes7.dex */
public class o extends gb1.d {
    private static final int CTRL_INDEX = 809;
    public static final java.lang.String NAME = "insertImagePreviewer";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.getInt("viewId");
    }

    @Override // gb1.d
    public android.view.View L(com.tencent.mm.plugin.appbrand.jsapi.t tVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) tVar;
        android.content.Context f147807d = v5Var.getF147807d();
        com.tencent.mm.plugin.appbrand.jsapi.coverview.ZoomImagePreviewer zoomImagePreviewer = new com.tencent.mm.plugin.appbrand.jsapi.coverview.ZoomImagePreviewer(f147807d, null);
        zoomImagePreviewer.setComponent(v5Var);
        zoomImagePreviewer.setViewId(jSONObject.optInt("viewId", 0));
        return new com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer(f147807d, zoomImagePreviewer);
    }

    @Override // gb1.d
    public void N(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        float[] F;
        com.tencent.mm.plugin.appbrand.jsapi.coverview.ZoomImagePreviewer zoomImagePreviewer = (com.tencent.mm.plugin.appbrand.jsapi.coverview.ZoomImagePreviewer) ((com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) view).d(com.tencent.mm.plugin.appbrand.jsapi.coverview.ZoomImagePreviewer.class);
        if (zoomImagePreviewer == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiInsertImagePreviewer", "onInsertView(viewId : %d) failed, targetView is null", java.lang.Integer.valueOf(i17));
            return;
        }
        if1.t.a(view, jSONObject.optJSONObject("style"));
        if1.d.a(zoomImagePreviewer, jSONObject);
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
            if (jSONObject.has("urls")) {
                java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray("urls");
                if (optJSONArray != null) {
                    for (int i27 = 0; i27 < optJSONArray.length(); i27++) {
                        java.lang.String obj = optJSONArray.get(i27).toString();
                        if (!android.text.TextUtils.isEmpty(obj)) {
                            arrayList.add(obj);
                        }
                    }
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertImagePreviewer", "urls is empty");
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                zoomImagePreviewer.setData(arrayList);
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiInsertImagePreviewer", e17, "", new java.lang.Object[0]);
        }
    }
}
