package um4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lum4/l;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "plugin-topstory_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class l extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiOpenK1KWebView", "openK1kWebView: " + jSONObject);
        if (jSONObject != null) {
            try {
                if (jSONObject.optInt("actionType") == 6) {
                    ((lf0.h0) ((mf0.g0) i95.n0.c(mf0.g0.class))).Di(jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 53), jSONObject.optInt("subScene", 5), c());
                } else {
                    ((lf0.h0) ((mf0.g0) i95.n0.c(mf0.g0.class))).Ui(c(), jSONObject.toString());
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiOpenK1KWebView", "openK1kWebView failed: " + e17);
                this.f224976f.a("fail");
                return;
            }
        }
        this.f224976f.d(false);
    }
}
