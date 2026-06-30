package com.tencent.mm.plugin.appbrand.jsapi.coverview;

/* loaded from: classes7.dex */
public class g0 extends com.tencent.mm.plugin.appbrand.jsapi.a1 {
    private static final int CTRL_INDEX = -2;
    private static final java.lang.String NAME = "measureTextString";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public java.lang.String z(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("size");
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("label");
        if (optJSONObject == null || optJSONObject2 == null) {
            return o("fail:invalid data");
        }
        int j17 = ik1.w.j(optJSONObject, "width", Integer.MAX_VALUE);
        if (j17 < 0) {
            j17 = Integer.MAX_VALUE;
        }
        int j18 = ik1.w.j(optJSONObject, "height", Integer.MAX_VALUE);
        int i17 = j18 >= 0 ? j18 : Integer.MAX_VALUE;
        com.tencent.mm.plugin.appbrand.jsapi.coverview.b bVar = new com.tencent.mm.plugin.appbrand.jsapi.coverview.b(lVar.getContext() == null ? android.content.res.Resources.getSystem() : lVar.getContext().getResources(), j17);
        if1.j.b(bVar, optJSONObject2);
        mm0.g a17 = bVar.f80675f.a();
        float f17 = 0.0f;
        int i18 = 0;
        while (true) {
            android.text.StaticLayout staticLayout = a17.f328611k;
            if (i18 >= staticLayout.getLineCount()) {
                float min = java.lang.Math.min(staticLayout.getHeight(), i17);
                java.util.HashMap hashMap = new java.util.HashMap(2);
                hashMap.put("width", java.lang.Float.valueOf(((float) java.lang.Math.ceil(f17)) / ik1.w.f()));
                hashMap.put("height", java.lang.Float.valueOf(min / ik1.w.f()));
                return p("ok", new com.tencent.mm.plugin.appbrand.jsapi.coverview.f0(this, hashMap));
            }
            f17 = java.lang.Math.max(f17, staticLayout.getLineWidth(i18));
            i18++;
        }
    }
}
