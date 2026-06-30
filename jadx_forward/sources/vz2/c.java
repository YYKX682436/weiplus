package vz2;

/* loaded from: classes14.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6435x3e5b6070 f523191a = null;

    /* renamed from: b, reason: collision with root package name */
    public static long f523192b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6436x54c76ecc f523193c = null;

    /* renamed from: d, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6432x5629f7e8 f523194d = null;

    /* renamed from: e, reason: collision with root package name */
    public static org.json.JSONArray f523195e = null;

    /* renamed from: f, reason: collision with root package name */
    public static org.json.JSONArray f523196f = null;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f523197g = "";

    public static void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerReport", "doReport14560 success:%s", java.lang.Boolean.valueOf(z17));
        d().f137699h = z17 ? 1L : 0L;
        d().f137700i = java.lang.System.currentTimeMillis() - d().f137695d;
        d().f137705n = java.lang.System.currentTimeMillis();
        d().k();
        f523194d = null;
    }

    public static com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6435x3e5b6070 b() {
        if (f523191a == null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6435x3e5b6070 c6435x3e5b6070 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6435x3e5b6070();
            f523191a = c6435x3e5b6070;
            c6435x3e5b6070.f137724p = f523192b;
            f523191a.C = com.p314xaae8f345.mm.ui.bk.A() ? 2 : 1;
        }
        return f523191a;
    }

    public static com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6436x54c76ecc c() {
        if (f523193c == null) {
            f523193c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6436x54c76ecc();
        }
        return f523193c;
    }

    public static com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6432x5629f7e8 d() {
        if (f523194d == null) {
            f523194d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6432x5629f7e8();
        }
        return f523194d;
    }

    public static void e(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6434xa83fac87 c6434xa83fac87 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6434xa83fac87();
        c6434xa83fac87.f137708d = 2;
        c6434xa83fac87.f137709e = 0;
        c6434xa83fac87.f137710f = i17;
        c6434xa83fac87.f137711g = c6434xa83fac87.b("ErrorMsg", str, true);
        c6434xa83fac87.k();
    }

    public static void f(int i17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6435x3e5b6070 b17 = b();
        b17.f137712d = i17;
        org.json.JSONArray jSONArray = f523196f;
        if (jSONArray != null) {
            b17.f137722n = b17.b("AndroidStateRecord", jSONArray.toString().replace(',', ';'), true);
        }
        org.json.JSONArray jSONArray2 = f523195e;
        if (jSONArray2 != null) {
            b17.A = b17.b("SdkStatusStr", jSONArray2.toString().replace(',', ';'), true);
        }
        b17.f137721m = b17.b("StateRecord", f523197g, true);
        if (!android.text.TextUtils.isEmpty(f523197g)) {
            try {
                if (f523197g.split("-").length > 0) {
                    b17.f137714f = java.lang.Integer.parseInt(r5[r5.length - 1]);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        f523192b = f523191a.f137724p;
        b17.k();
        f523191a = null;
        f523197g = "";
        f523196f = null;
        f523195e = null;
    }

    public static void g(java.lang.String str) {
        b().f137732x = java.lang.System.currentTimeMillis();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            f(jSONObject.optInt("err_code", jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54517x3e9e1be0, 0)));
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceFlashManagerError", e17, "parse face fail result error.%s", str);
        }
    }

    public static void h(int i17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6436x54c76ecc c17 = c();
        c17.f137735d = i17;
        org.json.JSONArray jSONArray = f523196f;
        if (jSONArray != null) {
            c17.f137746o = c17.b("AndroidStateRecord", jSONArray.toString().replace(',', ';'), true);
        }
        c17.f137745n = c17.b("StateRecord", f523197g, true);
        if (!android.text.TextUtils.isEmpty(f523197g)) {
            try {
                if (f523197g.split("-").length > 0) {
                    c17.f137737f = java.lang.Integer.parseInt(r4[r4.length - 1]);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        c17.k();
        f523193c = null;
        f523197g = "";
        f523196f = null;
    }

    public static void i(int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6434xa83fac87 c6434xa83fac87 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6434xa83fac87();
        c6434xa83fac87.f137708d = 1;
        c6434xa83fac87.f137709e = i17;
        c6434xa83fac87.f137710f = i18;
        c6434xa83fac87.f137711g = c6434xa83fac87.b("ErrorMsg", str, true);
        c6434xa83fac87.k();
    }

    public static void j(java.lang.String str) {
        k(str, 0);
    }

    public static synchronized void k(java.lang.String str, java.lang.Object obj) {
        synchronized (vz2.c.class) {
            if (f523196f == null) {
                f523196f = new org.json.JSONArray();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerReport", "updateFaceFlashState key:%s value:%s", str, obj);
            if (f523196f.toString().length() <= 1000) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put(str, obj);
                } catch (org.json.JSONException unused) {
                }
                f523196f.put(jSONObject);
            }
        }
    }

    public static void l(java.lang.String str) {
        org.json.JSONArray jSONArray = f523196f;
        if (jSONArray == null || !jSONArray.toString().contains(str)) {
            j(str);
        }
    }

    public static void m(int i17) {
        if (android.text.TextUtils.isEmpty(f523197g)) {
            f523197g += java.lang.String.valueOf(i17);
            return;
        }
        f523197g += "-" + i17;
    }
}
