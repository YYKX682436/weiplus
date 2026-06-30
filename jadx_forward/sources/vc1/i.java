package vc1;

/* loaded from: classes13.dex */
public class i implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77.MyLocationSource {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f516514a;

    public i(vc1.p1 p1Var) {
        this.f516514a = p1Var;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77.MyLocationSource
    /* renamed from: getMyLocation */
    public android.location.Location mo14571x7b085d77() {
        vc1.p1 p1Var = this.f516514a;
        android.location.Location location = p1Var.f516643z;
        if (location != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "get MyLocation latit:%f, longtitude:%f", java.lang.Double.valueOf(location.getLatitude()), java.lang.Double.valueOf(p1Var.f516643z.getLongitude()));
            return p1Var.f516643z;
        }
        lk1.a b17 = ((lf.e) ((lk1.c) nd.f.a(lk1.c.class))).b("gcj02", 600000);
        if (b17 != null) {
            if (p1Var.f516643z == null) {
                p1Var.f516643z = new android.location.Location(b17.f400531c);
            }
            p1Var.f516643z.setLatitude(b17.f400529a);
            p1Var.f516643z.setLongitude(b17.f400530b);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "get MyLocation from cache, latit:%f, longtitude:%f", java.lang.Double.valueOf(p1Var.f516643z.getLatitude()), java.lang.Double.valueOf(p1Var.f516643z.getLongitude()));
            return p1Var.f516643z;
        }
        if (p1Var.B) {
            return null;
        }
        p1Var.B = true;
        p1Var.A = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "to do get MyLocation");
        ((lk1.c) nd.f.a(lk1.c.class)).w9("gcj02", p1Var.f516600d0, p1Var.u());
        return null;
    }
}
