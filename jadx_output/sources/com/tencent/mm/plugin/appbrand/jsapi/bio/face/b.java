package com.tencent.mm.plugin.appbrand.jsapi.bio.face;

/* loaded from: classes.dex */
public class b extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 214;
    public static final java.lang.String NAME = "checkIsSupportFacialRecognition";

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.bio.face.JsApiCheckIsSupportFaceDetect$GetIsSupportFaceTask f79864g = null;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCheckIsSupportFaceDetect", "hy: subapp start do check is support face detect");
        this.f79864g = new com.tencent.mm.plugin.appbrand.jsapi.bio.face.JsApiCheckIsSupportFaceDetect$GetIsSupportFaceTask(lVar, i17, this);
        this.f79864g.d();
    }
}
