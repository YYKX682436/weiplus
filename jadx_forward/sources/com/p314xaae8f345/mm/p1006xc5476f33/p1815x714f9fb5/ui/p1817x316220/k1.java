package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220;

/* loaded from: classes15.dex */
public class k1 implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.x1 f226371d;

    public k1(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.x1 x1Var) {
        this.f226371d = x1Var;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.x1 x1Var = this.f226371d;
        if (!z17) {
            if (!x1Var.f226461p1 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.a()) {
                x1Var.f226461p1 = true;
                android.app.Activity activity = x1Var.f226442d;
                db5.e1.C(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fs_), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.j1(this), null);
            }
            return false;
        }
        if (!x1Var.R1) {
            return true;
        }
        double d27 = x1Var.G;
        if (d27 != -85.0d) {
            double d28 = x1Var.H;
            if (d28 != -1000.0d) {
                double d29 = f18;
                if (d27 != d29 || d28 != f17) {
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LAST_LOCATION_STRING, ((int) (f18 * 1000000.0f)) + "," + ((int) (f17 * 1000000.0f)));
                    x1Var.G = d29;
                    x1Var.H = (double) f17;
                }
                android.location.Location location = new android.location.Location("");
                x1Var.M1 = location;
                location.setLongitude(x1Var.H);
                x1Var.M1.setLatitude(x1Var.G);
                return true;
            }
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LAST_LOCATION_STRING, ((int) (f18 * 1000000.0f)) + "," + ((int) (f17 * 1000000.0f)));
        double d37 = (double) f18;
        x1Var.G = d37;
        double d38 = (double) f17;
        x1Var.H = d38;
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.c0 c0Var = x1Var.f226464s;
        c0Var.f226300p = d37;
        c0Var.f226301q = d38;
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.c0 c0Var2 = x1Var.f226465t;
        c0Var2.f226300p = d37;
        c0Var2.f226301q = d38;
        if (x1Var.x()) {
            if (!x1Var.x()) {
                return true;
            }
            double doubleExtra = x1Var.k().getDoubleExtra("KPickPoiLat", -85.0d);
            double doubleExtra2 = x1Var.k().getDoubleExtra("KPickPoiLong", -85.0d);
            if (doubleExtra == -85.0d || doubleExtra2 == -1000.0d) {
                return true;
            }
            x1Var.E = doubleExtra;
            x1Var.F = doubleExtra2;
            com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16296x40c45249 c16296x40c45249 = x1Var.f226457n;
            boolean booleanExtra = x1Var.k().getBooleanExtra("key_geo_coder_four_level", false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16293xe2a3baf2 c16293xe2a3baf2 = x1Var.f226468w;
            c16296x40c45249.b(doubleExtra, doubleExtra2, booleanExtra, c16293xe2a3baf2.f226229m2, c16293xe2a3baf2.f226230n2, c16293xe2a3baf2.f226231o2);
            x1Var.f226443e.mo1001x8873d7af().mo990x42ab093c(doubleExtra, doubleExtra2, 15);
            x1Var.w(false);
            return true;
        }
        double d39 = x1Var.G;
        x1Var.E = d39;
        double d47 = x1Var.H;
        x1Var.F = d47;
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16296x40c45249 c16296x40c452492 = x1Var.f226457n;
        boolean booleanExtra2 = x1Var.k().getBooleanExtra("key_geo_coder_four_level", false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16293xe2a3baf2 c16293xe2a3baf22 = x1Var.f226468w;
        c16296x40c452492.b(d39, d47, booleanExtra2, c16293xe2a3baf22.f226229m2, c16293xe2a3baf22.f226230n2, c16293xe2a3baf22.f226231o2);
        x1Var.f226443e.mo1001x8873d7af().mo990x42ab093c(x1Var.G, x1Var.H, 15);
        if (!x1Var.f226453J) {
            x1Var.w(false);
        }
        android.location.Location location2 = new android.location.Location("");
        x1Var.M1 = location2;
        location2.setLongitude(x1Var.H);
        x1Var.M1.setLatitude(x1Var.G);
        return true;
    }
}
