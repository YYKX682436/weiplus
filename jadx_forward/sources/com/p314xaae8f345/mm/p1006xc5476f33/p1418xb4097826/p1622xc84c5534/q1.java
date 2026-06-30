package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes3.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1 f206788a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1();

    /* renamed from: b, reason: collision with root package name */
    public static long f206789b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static long f206790c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p1 f206791d = null;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f206792e = false;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f206793f = false;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f206794g = true;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f206795h;

    public static void e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1 q1Var, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        if ((i17 & 2) != 0) {
            z18 = false;
        }
        q1Var.getClass();
        if (z18) {
            return;
        }
        f206792e = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p1 p1Var = f206791d;
        if (p1Var != null) {
            p1Var.f206763a = android.os.SystemClock.elapsedRealtime();
        }
        if (!q1Var.c()) {
            f206790c = 2L;
        }
        f206795h = true;
    }

    public final org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p1 p1Var = f206791d;
        if (p1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1 q1Var = f206788a;
            if (q1Var.c()) {
                jSONObject.put("realFirstFrameTime", p1Var.f206764b - p1Var.f206769g);
            } else {
                jSONObject.put("realFirstFrameTime", p1Var.f206764b - p1Var.f206763a);
            }
            jSONObject.put("isPrePlay", q1Var.c());
        }
        return jSONObject;
    }

    public final long b(long j17) {
        if (j17 < 0) {
            return 0L;
        }
        return j17;
    }

    public final boolean c() {
        ae2.in inVar = ae2.in.f85221a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85470z4).mo141623x754a37bb()).r()).intValue() == 1;
    }

    public final void d(kn0.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p1 p1Var = f206791d;
        if (p1Var != null) {
            p1Var.f206764b = android.os.SystemClock.elapsedRealtime();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p1 p1Var2 = f206791d;
        if (p1Var2 != null) {
            if (p1Var2.f206763a == 0 || p1Var2.f206764b == 0 || p1Var2.f206765c == 0 || p1Var2.f206767e == 0 || p1Var2.f206766d == 0 || p1Var2.f206768f == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReporter", "report invalid data, startTime=" + p1Var2.f206763a + ", firstFrame=" + p1Var2.f206764b + ", startPlay=" + p1Var2.f206765c + ", decodeStart=" + p1Var2.f206767e + ", connectSuccess=" + p1Var2.f206766d + "playBegin=" + p1Var2.f206768f);
                return;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6528x96b1d13d c6528x96b1d13d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6528x96b1d13d();
            c6528x96b1d13d.f138803d = f206789b;
            c6528x96b1d13d.f138804e = f206792e ? 3L : f206790c;
            boolean z17 = f206795h;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1 q1Var = f206788a;
            if (z17 || f206790c != 2) {
                java.lang.String jSONObject = q1Var.a().toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
                c6528x96b1d13d.f138814o = c6528x96b1d13d.b(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, r26.i0.t(jSONObject, ",", ";", false), true);
                c6528x96b1d13d.f138805f = q1Var.b(p1Var2.f206764b - p1Var2.f206763a);
                c6528x96b1d13d.f138806g = q1Var.b(p1Var2.f206765c - p1Var2.f206763a);
            } else {
                java.lang.String jSONObject2 = q1Var.a().toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                c6528x96b1d13d.f138814o = c6528x96b1d13d.b(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, r26.i0.t(jSONObject2, ",", ";", false), true);
                c6528x96b1d13d.f138805f = 0L;
                c6528x96b1d13d.f138806g = 0L;
            }
            c6528x96b1d13d.f138807h = q1Var.b(p1Var2.f206766d - p1Var2.f206765c);
            c6528x96b1d13d.f138808i = q1Var.b(p1Var2.f206767e - p1Var2.f206766d);
            c6528x96b1d13d.f138809j = q1Var.b(p1Var2.f206764b - p1Var2.f206768f);
            c6528x96b1d13d.f138810k = f206793f ? 1 : 0;
            c6528x96b1d13d.f138811l = q1Var.b(p1Var2.f206764b - p1Var2.f206765c);
            if (gVar != null) {
                c6528x96b1d13d.f138812m = c6528x96b1d13d.b("snn", gVar.f391082p, true);
                c6528x96b1d13d.f138813n = gVar.f391068b;
            } else if (c14989xf862ae88 != null) {
                c6528x96b1d13d.f138812m = c6528x96b1d13d.b("snn", c14989xf862ae88.getNickName(), true);
                c6528x96b1d13d.f138813n = c14989xf862ae88.getLiveId();
            }
            c6528x96b1d13d.k();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReporter", "report23799 info:" + c6528x96b1d13d.n());
        }
    }
}
