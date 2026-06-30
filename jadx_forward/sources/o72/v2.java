package o72;

/* loaded from: classes12.dex */
public abstract class v2 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f425035a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f425036b = new java.util.HashMap();

    public static long a(long j17) {
        java.lang.Long l17 = (java.lang.Long) ((java.util.HashMap) f425035a).get(java.lang.Long.valueOf(j17));
        if (l17 == null) {
            return -1L;
        }
        return java.lang.System.currentTimeMillis() - l17.longValue();
    }

    public static final void b(int i17) {
        jx3.f.INSTANCE.mo68477x336bdfd8(802L, i17, 1L, false);
    }

    public static final void c(int i17, int i18) {
        jx3.f.INSTANCE.mo68477x336bdfd8(802L, i17, i18, false);
    }

    public static void d(long j17, int i17, int i18) {
        e(j17, i17, i18, -1, 0, -1, -1, -1);
    }

    public static void e(long j17, int i17, int i18, int i19, int i27, int i28, int i29, int i37) {
        o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(j17);
        if (F != null) {
            if (i37 < 0) {
                int i38 = F.f67657x2262335f;
                r45.bq0 bq0Var = F.f67640x5ab01132;
                if (i38 != 8 && i38 == 5 && bq0Var != null) {
                    r45.qp0 qp0Var = bq0Var.K;
                }
            }
            r45.jq0 jq0Var = F.f67640x5ab01132.f452495d;
            int i39 = jq0Var.f459567d;
            java.lang.String str = jq0Var.f459569f;
            int i47 = 1;
            if (i17 != 1) {
                i47 = 0;
            } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
                i47 = 2;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f c5432x35bb364f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f();
            am.z9 z9Var = c5432x35bb364f.f135776g;
            z9Var.f90061a = 40;
            z9Var.f90064d = F.f67640x5ab01132;
            c5432x35bb364f.e();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10651, java.lang.Integer.valueOf(F.f67657x2262335f), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(F.f67643xc8a07680), o72.x1.M(F), java.lang.Long.valueOf(F.f67659xa783a79b / 1000), java.lang.Integer.valueOf(i39), str, java.lang.Integer.valueOf(i47), "", 0, c5432x35bb364f.f135777h.f87676j, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29));
        }
    }

    public static void f(long j17, int i17, int i18) {
        o72.r2 re6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().re(j17);
        if (re6 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11122, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).tj().c()), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(re6.f67657x2262335f), o72.x1.M(re6), java.lang.Long.valueOf(re6.f67659xa783a79b), java.lang.Integer.valueOf(re6.f67640x5ab01132.f452495d.f459567d), re6.f67640x5ab01132.f452495d.f459569f);
        }
    }
}
