package be1;

/* loaded from: classes7.dex */
public class w0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 229;
    public static final java.lang.String NAME = "setScreenBrightness";

    /* renamed from: g, reason: collision with root package name */
    public float f19526g = Float.NaN;

    /* renamed from: h, reason: collision with root package name */
    public float f19527h;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (jSONObject == null) {
            lVar.a(i17, o("fail:data is null"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetScreenBrightness", "data is null");
        } else if (lVar.getContext() instanceof android.app.Activity) {
            com.tencent.mm.sdk.platformtools.u3.h(new be1.v0(this, jSONObject, lVar, i17));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetScreenBrightness", "setScreenBrightness, server context is not activity, don't do invoke");
            lVar.a(i17, o("fail:context is not activity"));
        }
    }
}
