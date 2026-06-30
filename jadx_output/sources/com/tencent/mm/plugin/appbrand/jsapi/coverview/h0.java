package com.tencent.mm.plugin.appbrand.jsapi.coverview;

/* loaded from: classes7.dex */
public class h0 extends gb1.f {
    private static final int CTRL_INDEX = 811;
    public static final java.lang.String NAME = "removeImagePreviewer";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.getInt("viewId");
    }

    @Override // gb1.f
    public boolean J(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        tVar.getCustomViewContainer().a(i17);
        return true;
    }
}
