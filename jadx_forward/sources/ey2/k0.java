package ey2;

/* loaded from: classes8.dex */
public final class k0 extends pf5.o0 implements ya2.o1 {

    /* renamed from: e, reason: collision with root package name */
    public r45.ae3 f338944e;

    /* renamed from: f, reason: collision with root package name */
    public final ey2.d0 f338945f;

    /* renamed from: g, reason: collision with root package name */
    public final ey2.g0 f338946g;

    /* renamed from: h, reason: collision with root package name */
    public float f338947h;

    /* renamed from: i, reason: collision with root package name */
    public float f338948i;

    /* renamed from: m, reason: collision with root package name */
    public final i11.c f338949m;

    public k0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GlobalLocationVM", "isGetGps=" + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.V2());
        this.f338945f = new ey2.d0(-107.0f, 43.0f, 0L, 4, null);
        this.f338946g = new ey2.g0(this);
        this.f338949m = new ey2.e0(this);
    }

    public boolean N6() {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        ((sb0.f) jVar).getClass();
        return j35.u.d(context, "android.permission.ACCESS_FINE_LOCATION", false);
    }

    public final ey2.d0 O6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209579yg).mo141623x754a37bb()).r()).booleanValue()) {
            ey2.d0 d0Var = this.f338945f;
            return new ey2.d0(d0Var.f338871a, d0Var.f338872b, java.lang.System.currentTimeMillis());
        }
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h.e().f(this.f338949m);
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        return new ey2.d0(this.f338947h, this.f338948i, i11.h.e().f368632h);
    }

    public jz5.l P6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209579yg).mo141623x754a37bb()).r()).booleanValue()) {
            ey2.d0 d0Var = this.f338945f;
            return new jz5.l(java.lang.Float.valueOf(d0Var.f338871a), java.lang.Float.valueOf(d0Var.f338872b));
        }
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LOCATION_STRING, ";");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.String");
        java.util.List e07 = r26.n0.e0((java.lang.String) m17, new char[]{';'}, false, 0, 6, null);
        java.lang.Float f17 = r26.g0.f((java.lang.String) e07.get(0));
        float floatValue = f17 != null ? f17.floatValue() : 0.0f;
        java.lang.Float f18 = r26.g0.f((java.lang.String) e07.get(1));
        return new jz5.l(java.lang.Float.valueOf(floatValue), java.lang.Float.valueOf(f18 != null ? f18.floatValue() : 0.0f));
    }

    public long Q6() {
        long t17 = gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LOCATION_TIME_LONG, 0L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GlobalLocationVM", "[lastLocationTime] time=" + t17);
        return t17;
    }

    public boolean R6(boolean z17, i11.c cVar) {
        if (!z17 && !com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.V2()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.GlobalLocationVM", "[requestLocation] is not enabel");
            return false;
        }
        if (!N6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.GlobalLocationVM", "[requestLocation] without perssion.");
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[requestLocation]... ");
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GlobalLocationVM", sb6.toString());
        pm0.v.O("Finder.GlobalLocationVM#RequestLocation", new ey2.h0(cVar, this));
        return true;
    }

    public void S6(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (!activity.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) {
            db5.e1.C(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhm), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new ey2.i0(activity), new ey2.j0(activity));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GlobalLocationVM", "requestLocationPermissionWithAlert");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GlobalLocationVM", "requestLocationPermissionWithAlert checkLocationPermissionWithRequest needReasonTitle=" + z17);
        if (z17) {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            j35.u.a(activity, "android.permission.ACCESS_FINE_LOCATION", 79, null, null);
        } else {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            j35.u.l(activity, new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION"}, 79);
        }
    }

    public void T6(float f17, float f18) {
        long c17 = c01.id.c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GlobalLocationVM", "[storeLocation] longitude=" + f17 + " latitude=" + f18 + " time=" + c17);
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LOCATION_STRING;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(f17);
        sb6.append(';');
        sb6.append(f18);
        c18.x(u3Var, sb6.toString());
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LOCATION_TIME_LONG, java.lang.Long.valueOf(c17));
    }
}
