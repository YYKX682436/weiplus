package yd3;

/* loaded from: classes15.dex */
public final class a extends xd3.d {
    @Override // xd3.a
    public boolean a(ve3.u action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        return action == ve3.u.f517643i;
    }

    @Override // xd3.d
    public void d(ve3.s service, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16467x9eb59478 data, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        super.d(service, data, rVar);
        java.lang.String str = data.f229698g;
        if (str != null) {
            xd3.c cVar = new xd3.c(rVar);
            ((xe3.p) service).f535496e.put(java.lang.Integer.valueOf(data.f229696e), str);
            ve3.o.a(cVar, null, 1, null);
        }
    }

    @Override // xd3.d
    public void f(ve3.u action, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16467x9eb59478 data, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (data.f229698g == null) {
            e(rVar, -1, "extraData data is null");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MB_External_surface_action", "EventHandler hint| event data is null");
        }
    }
}
