package be1;

/* loaded from: classes7.dex */
public class w0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f4236x366c91de = 229;

    /* renamed from: NAME */
    public static final java.lang.String f4237x24728b = "setScreenBrightness";

    /* renamed from: g, reason: collision with root package name */
    public float f101059g = Float.NaN;

    /* renamed from: h, reason: collision with root package name */
    public float f101060h;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (jSONObject == null) {
            lVar.a(i17, o("fail:data is null"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetScreenBrightness", "data is null");
        } else if (lVar.mo50352x76847179() instanceof android.app.Activity) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new be1.v0(this, jSONObject, lVar, i17));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetScreenBrightness", "setScreenBrightness, server context is not activity, don't do invoke");
            lVar.a(i17, o("fail:context is not activity"));
        }
    }
}
