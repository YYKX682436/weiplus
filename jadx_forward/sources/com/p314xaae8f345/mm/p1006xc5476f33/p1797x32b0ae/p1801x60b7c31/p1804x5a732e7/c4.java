package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/c4;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class c4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject data, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        try {
            java.lang.String string = data.getString("messageSvrId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            long parseLong = java.lang.Long.parseLong(string);
            java.lang.String string2 = data.getString("chatName");
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 l17 = pt0.f0.f439742b1.l(string2, parseLong);
            if (l17 == null) {
                throw new java.lang.IllegalStateException("msgInfo".toString());
            }
            ct.x2 x2Var = (ct.x2) i95.n0.c(ct.x2.class);
            android.content.Context c17 = c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getContext(...)");
            ((qg5.h2) x2Var).wi(c17, l17.m124847x74d37ac6(), string2);
            this.f224975e.d();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppJsApiOpenMessageFileSource", e17.getMessage() + ": " + jz5.a.b(e17));
            this.f224975e.a();
        }
    }
}
