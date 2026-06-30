package yk;

/* loaded from: classes12.dex */
public final class b extends yk.v {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // yk.v
    public boolean a() {
        long j17;
        long j18;
        boolean z17;
        long j19;
        long j27;
        long j28;
        long j29;
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        if (!gm0.j1.a()) {
            return false;
        }
        if (pt0.p.f439751a1.a("appattach")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DBDataClean.AppAttachDataCleanWorkManager", "clean is already done");
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DBDataClean.AppAttachDataCleanWorkManager", "start doWork");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab = new com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab();
        yk.a aVar = new yk.a(c26987xeef691ab);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(aVar, 5000L);
        try {
            android.database.Cursor L0 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().L0(com.p314xaae8f345.mm.app.p622xc5476f33.p625xd162537e.C5088x5a5b06bb.f135231m.a(), c26987xeef691ab);
            if (L0 != null) {
                j17 = L0.getCount();
                int i17 = 0;
                z17 = true;
                j18 = 0;
                j19 = 0;
                j27 = 0;
                j28 = 0;
                j29 = 0;
                while (L0.moveToNext()) {
                    try {
                        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d();
                        dVar.mo9015xbf5d97fd(L0);
                        dVar.f68107xaaaa6883 = "";
                        try {
                            f9Var = pt0.f0.f439742b1.n("talker-ignore", dVar.f68106x315a5445);
                        } catch (java.lang.Throwable unused) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DBDataClean.AppAttachDataCleanWorkManager", "getMsgById error, msgId: " + dVar.f68106x315a5445);
                            f9Var = null;
                        }
                        j18++;
                        if (f9Var == null || f9Var.m124847x74d37ac6() <= 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DBDataClean.AppAttachDataCleanWorkManager", "get error msg, " + dVar.f68106x315a5445);
                            j28++;
                            boolean mo9952xce0038c9 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().mo9952xce0038c9(dVar, new java.lang.String[0]);
                            if (mo9952xce0038c9) {
                                j27++;
                            } else {
                                j19++;
                            }
                            z17 = z17 && mo9952xce0038c9;
                        } else {
                            dVar.f68107xaaaa6883 = f9Var.Q0();
                            if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().mo9952xce0038c9(dVar, new java.lang.String[0])) {
                                j27++;
                            } else {
                                j19++;
                                z17 = false;
                            }
                        }
                        if (i17 == 0) {
                            j29 = dVar.f72763xa3c65b86;
                        }
                        i17++;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        try {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.DBDataClean.AppAttachDataCleanWorkManager", th, "", new java.lang.Object[0]);
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(aVar);
                            long j37 = j18;
                            long j38 = j19;
                            long j39 = j27;
                            long j47 = j28;
                            long j48 = j29;
                            if (z17) {
                            }
                            long currentTimeMillis3 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                            pt0.p.f439751a1.b("appattach", r15, currentTimeMillis3, java.lang.Long.valueOf(currentTimeMillis2), j17);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DBDataClean.AppAttachDataCleanWorkManager", "doWork done, time cost: " + currentTimeMillis3 + ", result:" + j17 + '-' + j37 + '-' + j39 + '-' + j38 + '-' + j47 + '-' + r15 + ", firstSystemRowId:" + j48);
                            return j17 > 0 ? true : true;
                        } catch (java.lang.Throwable th7) {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(aVar);
                            throw th7;
                        }
                    }
                }
                L0.close();
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
                j17 = 0;
                j18 = 0;
                z17 = true;
                j19 = 0;
                j27 = 0;
                j28 = 0;
                j29 = 0;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DBDataClean.AppAttachDataCleanWorkManager", "cursor error");
            }
        } catch (java.lang.Throwable th8) {
            th = th8;
            j17 = 0;
            j18 = 0;
            z17 = true;
            j19 = 0;
            j27 = 0;
            j28 = 0;
            j29 = 0;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(aVar);
        long j372 = j18;
        long j382 = j19;
        long j392 = j27;
        long j472 = j28;
        long j482 = j29;
        boolean z18 = !z17 && j17 <= 0;
        long currentTimeMillis32 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        pt0.p.f439751a1.b("appattach", z18, currentTimeMillis32, java.lang.Long.valueOf(currentTimeMillis2), j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DBDataClean.AppAttachDataCleanWorkManager", "doWork done, time cost: " + currentTimeMillis32 + ", result:" + j17 + '-' + j372 + '-' + j392 + '-' + j382 + '-' + j472 + '-' + z18 + ", firstSystemRowId:" + j482);
        if (j17 > 0 || j372 == j392 || !pt0.f0.f439742b1.d()) {
            return true;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c c6754x4f2fd58c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c();
        c6754x4f2fd58c.p("appmsg_dataclean_error");
        c6754x4f2fd58c.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
        c6754x4f2fd58c.f140818n = (int) currentTimeMillis32;
        c6754x4f2fd58c.f140819o = (int) j372;
        c6754x4f2fd58c.f140820p = (int) (j382 + j472);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(j17);
        sb6.append('-');
        sb6.append(j372);
        sb6.append('-');
        sb6.append(j392);
        sb6.append('-');
        sb6.append(j382);
        sb6.append('-');
        sb6.append(j472);
        c6754x4f2fd58c.r(sb6.toString());
        c6754x4f2fd58c.s(java.lang.String.valueOf(j382));
        c6754x4f2fd58c.t(java.lang.String.valueOf(j472));
        c6754x4f2fd58c.k();
        return true;
    }

    @Override // yk.v
    public java.util.List b() {
        return kz5.b0.c("appattach");
    }
}
