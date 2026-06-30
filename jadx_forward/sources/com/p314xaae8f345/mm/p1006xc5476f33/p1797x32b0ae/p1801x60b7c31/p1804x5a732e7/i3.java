package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/i3;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class i3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.Integer valueOf = jSONObject != null ? java.lang.Integer.valueOf(jSONObject.optInt("biz")) : null;
        if (str == null || valueOf == null) {
            this.f224976f.a("limitedModeStatus:fail_missing arguments");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiLimitedModeStatus", "invoke: " + c());
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        int intValue = valueOf.intValue();
        if (intValue == 1) {
            ((se0.e) ((te0.e) i95.n0.c(te0.e.class))).getClass();
            jSONObject2.put(ya.b.f77487x44fa364, ((uh4.c0) i95.n0.c(uh4.c0.class)).G8());
        } else if (intValue == 2) {
            ((se0.e) ((te0.e) i95.n0.c(te0.e.class))).getClass();
            jSONObject2.put(ya.b.f77487x44fa364, ((uh4.c0) i95.n0.c(uh4.c0.class)).hd());
        } else if (intValue == 3) {
            ((se0.e) ((te0.e) i95.n0.c(te0.e.class))).getClass();
            jSONObject2.put(ya.b.f77487x44fa364, ((uh4.c0) i95.n0.c(uh4.c0.class)).h4());
        } else if (intValue != 12) {
            jSONObject2.put(ya.b.f77487x44fa364, ((se0.e) ((te0.e) i95.n0.c(te0.e.class))).m164332x74219ae7() ? 2 : 1);
        } else {
            ((se0.e) ((te0.e) i95.n0.c(te0.e.class))).getClass();
            jSONObject2.put(ya.b.f77487x44fa364, ((uh4.c0) i95.n0.c(uh4.c0.class)).ag());
        }
        this.f224976f.c(jSONObject2, false);
    }
}
