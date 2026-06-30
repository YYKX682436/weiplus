package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class l5 implements i11.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266785e;

    public l5(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, java.lang.String str) {
        this.f266785e = c1Var;
        this.f266784d = str;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        return false;
    }

    @Override // i11.d
    public boolean w6(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266785e;
        if (!z17) {
            if (c1Var.R == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgHandler", "is not ok, already callback");
                return false;
            }
            if (!c1Var.T && !com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.a()) {
                c1Var.T = true;
                if (((java.util.HashMap) c1Var.f266509e.f422323a).containsKey("forbidAlert") ? ((java.lang.String) ((java.util.HashMap) c1Var.f266509e.f422323a).get("forbidAlert")).equals("true") : false) {
                    c1Var.U = true;
                    c1Var.i5(c1Var.f266509e, "geo_location:fail_gps_closed", null);
                    return true;
                }
                android.content.Context context = c1Var.f266508d;
                if (context != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ActivityC19303x73e2248f.U6(context, c1Var.f266531y, false, j65.q.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.fs_), j65.q.a(c1Var.f266508d).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), j65.q.a(c1Var.f266508d).getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), j65.q.a(c1Var.f266508d).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.j5(this), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k5(this));
                }
            }
            if (c1Var.T && c1Var.U) {
                c1Var.S.mo50302x6b17ad39(null);
                c1Var.R = null;
                c1Var.i5(c1Var.f266509e, "geo_location:fail_gps_closed", null);
            }
            return true;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = c1Var.S;
        if (n3Var != null) {
            n3Var.mo50302x6b17ad39(null);
        }
        i11.e eVar = c1Var.Q;
        if (eVar != null) {
            ((i11.h) eVar).m(c1Var.R);
        }
        if (c1Var.R == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgHandler", "already callback");
            return false;
        }
        c1Var.R = null;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("longitude", java.lang.Float.valueOf(f17));
        hashMap.put("latitude", java.lang.Float.valueOf(f18));
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54483x1466c762, java.lang.Double.valueOf(d17));
        hashMap.put("accuracy", java.lang.Double.valueOf(d18));
        hashMap.put("type", this.f266784d);
        if (bundle != null) {
            hashMap.put("indoor_building_id", bundle.getString("indoor_building_id"));
            hashMap.put("indoor_building_floor", bundle.getString("indoor_building_floor"));
            hashMap.put("indoor_building_type", java.lang.Integer.valueOf(bundle.getInt("indoor_building_type")));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.x3 x3Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.x3.f263545a;
        if (((java.lang.Boolean) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.x3.f263550f).mo141623x754a37bb()).booleanValue()) {
            c1Var.V = hashMap;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "startGeoLocation cache retValues");
        }
        c1Var.i5(c1Var.f266509e, "geo_location:ok", hashMap);
        return false;
    }
}
