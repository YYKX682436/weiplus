package y80;

@j95.b
/* loaded from: classes10.dex */
public final class k0 extends i95.w implements z80.g0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f541405d = "MicroMsg.LocationCommonService";

    public void Ai(android.content.Context context, long j17, com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.EnumC24638xd3e3395f locationGeoMode, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(locationGeoMode, "locationGeoMode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        y80.p1 p1Var = new y80.p1(callback);
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f541405d, "getUserCurrentLocation: failed");
            p1Var.a(null);
            return;
        }
        y80.i0 i0Var = new y80.i0(this, j17, locationGeoMode, p1Var);
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Bi(context, "android.permission.ACCESS_FINE_LOCATION", 155, "", "", new y80.h0(this, j17, i0Var))) {
            wi(j17, i0Var);
        }
    }

    public final void wi(long j17, yz5.l lVar) {
        y80.g0 g0Var = new y80.g0(this, lVar);
        d85.f0 wi6 = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).wi((int) j17);
        d85.g0 g0Var2 = d85.g0.LOCAION;
        if (wi6 == null ? ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ni(g0Var2, g0Var) : ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Di(g0Var2, wi6, g0Var)) {
            return;
        }
        lVar.mo146xb9724478(java.lang.Boolean.TRUE);
    }
}
