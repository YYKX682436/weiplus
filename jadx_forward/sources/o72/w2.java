package o72;

/* loaded from: classes4.dex */
public final class w2 {

    /* renamed from: a, reason: collision with root package name */
    public static final o72.w2 f425042a = new o72.w2();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f425043b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f425044c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f425045d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f425046e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f425047f = new java.util.HashMap();

    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6437x6cfac3ae a(long j17) {
        java.util.HashMap hashMap = f425043b;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6437x6cfac3ae c6437x6cfac3ae = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6437x6cfac3ae) hashMap.get(java.lang.Long.valueOf(j17));
        if (c6437x6cfac3ae != null) {
            return c6437x6cfac3ae;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MircoMsg.FavReportManager", "[getAddQualityReporter] struct = null, session = " + j17);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6437x6cfac3ae c6437x6cfac3ae2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6437x6cfac3ae();
        hashMap.put(java.lang.Long.valueOf(j17), c6437x6cfac3ae2);
        return c6437x6cfac3ae2;
    }

    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6437x6cfac3ae b() {
        java.lang.Long l17 = (java.lang.Long) f425046e.get(1);
        if (l17 != null) {
            return f425042a.a(l17.longValue());
        }
        return null;
    }

    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6442x3ed73e8a c() {
        java.lang.Long l17 = (java.lang.Long) f425046e.get(3);
        if (l17 == null) {
            return null;
        }
        long longValue = l17.longValue();
        java.util.HashMap hashMap = f425045d;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6442x3ed73e8a c6442x3ed73e8a = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6442x3ed73e8a) hashMap.get(java.lang.Long.valueOf(longValue));
        if (c6442x3ed73e8a != null) {
            return c6442x3ed73e8a;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MircoMsg.FavReportManager", "[getForwardQualityReporter] struct = null, session = " + longValue);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6442x3ed73e8a c6442x3ed73e8a2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6442x3ed73e8a();
        hashMap.put(java.lang.Long.valueOf(longValue), c6442x3ed73e8a2);
        return c6442x3ed73e8a2;
    }

    public final long d(int i17) {
        java.lang.Long l17 = (java.lang.Long) f425046e.get(java.lang.Integer.valueOf(i17));
        if (l17 == null) {
            return -4369L;
        }
        return l17.longValue();
    }

    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6444x858ec91e e() {
        java.lang.Long l17 = (java.lang.Long) f425046e.get(2);
        if (l17 == null) {
            return null;
        }
        long longValue = l17.longValue();
        java.util.HashMap hashMap = f425044c;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6444x858ec91e c6444x858ec91e = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6444x858ec91e) hashMap.get(java.lang.Long.valueOf(longValue));
        if (c6444x858ec91e != null) {
            return c6444x858ec91e;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MircoMsg.FavReportManager", "[getSyncQualityReporter] struct = null, session = " + longValue);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6444x858ec91e c6444x858ec91e2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6444x858ec91e();
        hashMap.put(java.lang.Long.valueOf(longValue), c6444x858ec91e2);
        return c6444x858ec91e2;
    }

    public final void f(int i17, long j17) {
        f425046e.put(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.FavReportManager", "[registerCurrentSession] type = " + i17 + ", session = " + j17);
        if (i17 == 1) {
            f425043b.put(java.lang.Long.valueOf(j17), new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6437x6cfac3ae());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.FavReportManager", "[registerReporter] register addQuality reporter, session = " + j17);
            return;
        }
        if (i17 == 2) {
            f425044c.put(java.lang.Long.valueOf(j17), new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6444x858ec91e());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.FavReportManager", "[registerReporter] register syncQuality reporter, session = " + j17);
            return;
        }
        if (i17 != 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MircoMsg.FavReportManager", "[registerReporter] error report type = " + i17);
        } else {
            f425045d.put(java.lang.Long.valueOf(j17), new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6442x3ed73e8a());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.FavReportManager", "[registerReporter] register forwardQuality reporter, session = " + j17);
        }
    }

    public final void g(int i17) {
        java.util.HashMap hashMap = f425046e;
        java.lang.Long l17 = (java.lang.Long) hashMap.get(java.lang.Integer.valueOf(i17));
        if (l17 != null) {
            long longValue = l17.longValue();
            if (i17 == 1) {
                f425043b.remove(java.lang.Long.valueOf(longValue));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.FavReportManager", "[unRegisterReporter] remove addQuality reporter, session = " + longValue);
            } else if (i17 == 2) {
                f425044c.remove(java.lang.Long.valueOf(longValue));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.FavReportManager", "[unRegisterReporter] remove syncQuality reporter, session = " + longValue);
            } else if (i17 != 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MircoMsg.FavReportManager", "[unRegisterReporter] error report type = " + i17);
            } else {
                f425045d.remove(java.lang.Long.valueOf(longValue));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.FavReportManager", "[unRegisterReporter] remove forwardQuality reporter, session = " + longValue);
            }
        }
        hashMap.put(java.lang.Integer.valueOf(i17), -11L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.FavReportManager", "[unRegisterCurrentSession] type = " + i17 + ", set not register");
    }
}
