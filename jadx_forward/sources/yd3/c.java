package yd3;

/* loaded from: classes15.dex */
public final class c extends xd3.d {
    @Override // xd3.a
    public boolean a(ve3.u action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        return action == ve3.u.f517638d;
    }

    @Override // xd3.d
    public void d(ve3.s service, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16467x9eb59478 data, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        super.d(service, data, rVar);
        try {
            xe3.p pVar = (xe3.p) service;
            pVar.wi(data.f229696e, new org.json.JSONObject(data.f229698g), new xd3.c(rVar));
        } catch (java.lang.Exception unused) {
            e(rVar, -2, "json parse error");
        }
    }
}
