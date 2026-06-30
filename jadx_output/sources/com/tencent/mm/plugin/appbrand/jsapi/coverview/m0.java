package com.tencent.mm.plugin.appbrand.jsapi.coverview;

/* loaded from: classes7.dex */
public class m0 extends gb1.h {
    private static final int CTRL_INDEX = 254;
    public static final java.lang.String NAME = "updateImageView";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.getInt("viewId");
    }

    @Override // gb1.h
    public boolean K(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        if (!(view instanceof com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiUpdateImageView", "the view(%s) is not a instance of CoverViewContainer", java.lang.Integer.valueOf(i17));
            return false;
        }
        gl1.a aVar = (gl1.a) ((com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) view).d(gl1.a.class);
        if (aVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiUpdateImageView", "the target view(%s) is null", java.lang.Integer.valueOf(i17));
            return false;
        }
        if1.t.a(view, jSONObject.optJSONObject("style"));
        if1.j.a(tVar, i17, aVar, jSONObject, new com.tencent.mm.plugin.appbrand.jsapi.coverview.f(i17, aVar.getKeyValueSet(), tVar));
        return true;
    }
}
