package nj1;

/* loaded from: classes7.dex */
public final class g implements sh1.e {
    @Override // sh1.e
    public sh1.g b(android.view.View view, int i17, java.lang.String params, android.graphics.SurfaceTexture surfaceTexture, sh1.f invoker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invoker, "invoker");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SkylineNativeViewFactoryRichText", "create params:".concat(params));
        org.json.JSONObject jSONObject = new org.json.JSONObject(params).getJSONObject("position");
        int i18 = jSONObject.getInt("height");
        int i19 = jSONObject.getInt("width");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        ik1.h0.b(new nj1.b(h0Var, surfaceTexture, i19, i18, h0Var2, view, params, invoker));
        return new nj1.f(h0Var, h0Var2);
    }
}
