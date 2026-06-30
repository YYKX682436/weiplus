package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff;

/* loaded from: classes7.dex */
public final class w1 implements kg1.e {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.w1 f169906a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f169907b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f169908c;

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.w1 w1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.w1();
        f169906a = w1Var;
        f169907b = new java.util.concurrent.ConcurrentHashMap();
        f169908c = new java.util.concurrent.ConcurrentHashMap();
        b();
        kg1.m c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.b0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.class, "mp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17);
        w1Var.h(c17);
    }

    public static final boolean a() {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.C11845x2243166f.f159117d || z65.c.a();
    }

    public static final void b() {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.C11845x2243166f.f159117d && a()) {
            try {
                com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(true), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.c0.class, null);
                kx3.a.f394813a = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40544x534d5c42(0, false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40543x97568359(true);
            } catch (java.lang.Throwable th6) {
                kx3.a.f394813a = true;
                throw th6;
            }
        }
    }

    public static final void d(com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7034xfcb6df36 c7034xfcb6df36) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c7034xfcb6df36, "<this>");
        boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.C11845x2243166f.f159117d;
        java.lang.String m17 = c7034xfcb6df36.m();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.d dVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.d.f169357a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m17);
        dVar.c(19175, z17 ? 1 : 0, z17, z17, z17, m17);
    }

    public static final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7034xfcb6df36 f(java.lang.String str, java.lang.String str2, kg1.a aVar) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7034xfcb6df36 c7034xfcb6df36 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7034xfcb6df36();
        c7034xfcb6df36.f143492d = c7034xfcb6df36.b("InstanceId", str, true);
        c7034xfcb6df36.f143493e = c7034xfcb6df36.b("Appid", str2, true);
        kg1.h hVar = (kg1.h) aVar;
        c7034xfcb6df36.f143495g = c7034xfcb6df36.b("EventName", hVar.f389227b, true);
        kg1.a aVar2 = (kg1.a) f169908c.get(aVar);
        c7034xfcb6df36.f143497i = c7034xfcb6df36.b("Parent", aVar2 == null ? null : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35232x93cecd9f == aVar2 ? "StartUp" : ((kg1.h) aVar2).f389227b, true);
        java.lang.String str3 = hVar.f389230e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "desc(...)");
        if (r26.n0.B(str3, "(Global)", false)) {
            c7034xfcb6df36.f143498j = 0L;
        } else if (r26.n0.B(str3, "(View)", false)) {
            c7034xfcb6df36.f143498j = 1L;
        } else if (r26.n0.B(str3, "(Service)", false)) {
            c7034xfcb6df36.f143498j = 2L;
        } else {
            c7034xfcb6df36.f143498j = 3L;
        }
        return c7034xfcb6df36;
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 c() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N("WAKeyStepKvLogger_RUNNING_PROCESS", 2, null);
    }

    public final void e(java.lang.String str, kg1.a aVar, long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.u1 u1Var) {
        java.lang.String str2;
        long j18;
        if (!a() || aVar == null || str == null) {
            return;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.C11845x2243166f.f159117d) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(true), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.c0.class, null);
        }
        if (c().getBoolean(str, false) && (str2 = (java.lang.String) f169907b.get(str)) != null) {
            if (aVar instanceof kg1.n) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7034xfcb6df36 f17 = f(str2, str, aVar);
                f17.f143495g = f17.b("EventName", "StartUp", true);
                f17.f143496h = 0L;
                f17.f143494f = java.lang.System.currentTimeMillis();
                d(f17);
                return;
            }
            if (aVar instanceof kg1.i) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7034xfcb6df36 f18 = f(str2, str, aVar);
                f18.f143495g = f18.b("EventName", "StartUp", true);
                f18.f143496h = 1L;
                f18.f143494f = java.lang.System.currentTimeMillis();
                d(f18);
                return;
            }
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.v1.f169897a[u1Var.ordinal()] == 3) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 c17 = c();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                sb6.append("__SPLITOR_PROCESS_REPORTED_STARTED__");
                java.lang.String str3 = ((kg1.h) aVar).f389227b;
                sb6.append(str3);
                if (c17.f(sb6.toString())) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WAKeyStepKvLogger", "onStepStart id:" + str + " step:" + str3);
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7034xfcb6df36 f19 = f(str2, str, aVar);
                f19.f143496h = 0L;
                f19.f143494f = java.lang.System.currentTimeMillis();
                d(f19);
                c().putLong(str + "__SPLITOR_PROCESS_REPORTED_STARTED__" + str3, java.lang.System.currentTimeMillis());
                return;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 c18 = c();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str);
            sb7.append("__SPLITOR_PROCESS_REPORTED_STARTED__");
            java.lang.String str4 = ((kg1.h) aVar).f389227b;
            sb7.append(str4);
            if (c18.f(sb7.toString())) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                j18 = currentTimeMillis - c().getLong(str + "__SPLITOR_PROCESS_REPORTED_STARTED__" + str4, currentTimeMillis);
            } else {
                j18 = j17;
            }
            int ordinal = u1Var.ordinal();
            if (ordinal == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WAKeyStepKvLogger", "onStepOK id:" + str + " step:" + str4 + " cost:" + j18);
            } else if (ordinal == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WAKeyStepKvLogger", "onStepFail id:" + str + " step:" + str4 + " cost:" + j18);
            }
            if (j18 <= 0) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7034xfcb6df36 f27 = f(str2, str, aVar);
                f27.f143496h = 2L;
                f27.f143494f = java.lang.System.currentTimeMillis();
                d(f27);
                return;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7034xfcb6df36 f28 = f(str2, str, aVar);
            f28.f143496h = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.u1.f169891e != u1Var ? 3L : 1L;
            f28.f143494f = java.lang.System.currentTimeMillis();
            d(f28);
            if (c().f(str + "__SPLITOR_PROCESS_REPORTED_STARTED__" + str4)) {
                return;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7034xfcb6df36 f29 = f(str2, str, aVar);
            f29.f143496h = 0L;
            f29.f143494f = java.lang.System.currentTimeMillis() - j18;
            d(f29);
        }
    }

    public final void g(java.lang.String str, java.lang.String instanceId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceId, "instanceId");
        if (str == null || str.length() == 0) {
            return;
        }
        f169907b.put(str, instanceId);
    }

    public final void h(kg1.m mVar) {
        java.lang.Iterable<kg1.m> iterable = mVar.f389240b;
        if (iterable == null) {
            iterable = kz5.p0.f395529d;
        }
        for (kg1.m mVar2 : iterable) {
            java.util.List list = mVar2.f389240b;
            if (!(list == null || list.isEmpty())) {
                f169906a.h(mVar2);
            }
            if (mVar.b() != null) {
                kg1.a b17 = mVar2.b();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
                kg1.a b18 = mVar.b();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b18);
                f169908c.put(b17, b18);
            }
        }
    }
}
