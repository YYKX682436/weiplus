package p000;

/* loaded from: classes15.dex */
public final class i extends xd3.d {
    @Override // xd3.a
    public boolean a(ve3.u action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        return action == ve3.u.f517639e;
    }

    @Override // xd3.d
    public void b(ve3.r service, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16467x9eb59478 data, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        super.b(service, data, rVar);
        int i17 = data.f229696e;
        if (service.H1(i17)) {
            if (rVar != null) {
                rVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16466x1a72912b(0, "", null));
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MB_External_surface_action", "CheckEnvironmentHandler id duplicated");
            if (rVar != null) {
                rVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16466x1a72912b(-1, "id duplicated " + i17, null));
            }
        }
    }
}
