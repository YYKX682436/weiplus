package yd3;

/* loaded from: classes15.dex */
public final class d extends xd3.d {
    @Override // xd3.a
    public boolean a(ve3.u action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        return action == ve3.u.f517640f;
    }

    @Override // xd3.d
    public void b(ve3.r service, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16467x9eb59478 data, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        super.b(service, data, rVar);
        java.lang.String str = data.f229698g;
        if (str != null) {
            android.os.Parcelable parcelable = data.f229699h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parcelable, "null cannot be cast to non-null type android.view.Surface");
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            xd3.c cVar = new xd3.c(rVar);
            service.Id(data.f229696e, jSONObject, (android.view.Surface) parcelable, cVar);
        }
    }

    @Override // xd3.d
    public void f(ve3.u action, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16467x9eb59478 data, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (data.f229698g == null) {
            e(rVar, -1, "no extraData");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MB_External_surface_action", "RegisterHandler No extra data provided");
        } else {
            if (data.f229699h instanceof android.view.Surface) {
                return;
            }
            e(rVar, -1, "invalid surface");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MB_External_surface_action", "RegisterHandler Invalid surface payload");
        }
    }
}
