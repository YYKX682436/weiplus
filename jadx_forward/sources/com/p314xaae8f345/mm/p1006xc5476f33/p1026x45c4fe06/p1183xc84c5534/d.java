package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.d f169357a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedList f169358b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f169359c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f169360d;

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.d dVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.d();
        f169357a = dVar;
        f169358b = new java.util.LinkedList();
        f169359c = dVar.hashCode();
        f169360d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("AppBrandCrossProcessSafeReporter$H", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.a.f169338d);
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.d dVar, r45.l8 l8Var, java.lang.String str) {
        dVar.getClass();
        java.util.List<r45.m8> list = l8Var != null ? l8Var.f460751d : null;
        if (list == null) {
            list = kz5.p0.f395529d;
        }
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
            list.size();
        }
        for (r45.m8 m8Var : list) {
            try {
                if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
                    int i17 = m8Var.f461755d;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.e(m8Var.f461755d, m8Var.f461760i, m8Var.f461756e, m8Var.f461757f, m8Var.f461758g, m8Var.f461759h);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandCrossProcessSafeReporter", "reportMM logid=" + m8Var.f461755d + ", e=" + e17);
            }
        }
    }

    public static final void f(boolean z17) {
        r45.l8 l8Var;
        java.util.LinkedList linkedList = f169358b;
        synchronized (linkedList) {
            l8Var = new r45.l8();
            l8Var.f460751d.addAll(linkedList);
            linkedList.clear();
        }
        f169357a.g(l8Var, z17);
    }

    public final void b(int i17, java.lang.Object... vals) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vals, "vals");
        java.lang.String w17 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.w(java.util.Arrays.copyOf(vals, vals.length));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(w17);
        c(i17, 0, false, false, false, w17);
    }

    public final void c(int i17, int i18, boolean z17, boolean z18, boolean z19, java.lang.String vals) {
        r45.l8 l8Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vals, "vals");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.e(i17, i18, vals, z17, z18, z19);
            return;
        }
        java.util.LinkedList linkedList = f169358b;
        synchronized (linkedList) {
            r45.m8 m8Var = new r45.m8();
            m8Var.f461755d = i17;
            m8Var.f461756e = vals;
            m8Var.f461757f = z17;
            m8Var.f461758g = z18;
            m8Var.f461759h = z19;
            m8Var.f461760i = i18;
            linkedList.add(m8Var);
            if (linkedList.size() >= 1000) {
                l8Var = new r45.l8();
                l8Var.f460751d.addAll(linkedList);
                linkedList.clear();
            } else {
                l8Var = null;
            }
        }
        boolean z27 = false;
        if (l8Var != null && g(l8Var, false)) {
            z27 = true;
        }
        if (z27) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = f169360d;
            int i19 = f169359c;
            n3Var.mo50303x856b99f0(i19);
            n3Var.mo50307xb9e94560(i19, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var2 = f169360d;
        int i27 = f169359c;
        if (n3Var2.mo50285x8fc9be06(i27)) {
            return;
        }
        n3Var2.mo50307xb9e94560(i27, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
    }

    public final void d(int i17, boolean z17, java.lang.Object... vals) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vals, "vals");
        java.lang.String w17 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.w(java.util.Arrays.copyOf(vals, vals.length));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(w17);
        c(i17, 0, false, false, z17, w17);
    }

    public final void e(int i17, int i18, java.lang.Object... vals) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vals, "vals");
        java.lang.String w17 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.w(java.util.Arrays.copyOf(vals, vals.length));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(w17);
        c(i17, i18, false, false, false, w17);
    }

    public final boolean g(r45.l8 l8Var, boolean z17) {
        java.util.LinkedList linkedList = l8Var.f460751d;
        if (linkedList == null || linkedList.isEmpty()) {
            return false;
        }
        if (z17) {
            uk0.a.d(l8Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.b.f169343a);
        } else {
            uk0.a.c(l8Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.c.f169348d, null, 4, null);
        }
        return true;
    }
}
