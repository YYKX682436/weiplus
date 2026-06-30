package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes11.dex */
public abstract class c2 {

    /* renamed from: a, reason: collision with root package name */
    public static int f275336a;

    /* renamed from: b, reason: collision with root package name */
    public static int f275337b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f275338c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f275339d;

    /* renamed from: e, reason: collision with root package name */
    public static int f275340e;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.Boolean f275341f;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.Boolean f275342g;

    public static boolean a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineInfoStorageLogic", "canEnterBizTimeLine, msgClusterType:%d, scene:%d, username:%s, type:%d, svrId:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), f9Var.Q0(), java.lang.Integer.valueOf(f9Var.mo78013xfb85f7b0()), java.lang.Long.valueOf(f9Var.I0()));
        if (f9Var.mo78013xfb85f7b0() == 34 || f9Var.mo78013xfb85f7b0() == 3 || f9Var.mo78013xfb85f7b0() == 1) {
            return false;
        }
        if ((i17 != 3 && i18 != 9 && i18 != 15 && i18 != 17) || !f9Var.t2()) {
            return false;
        }
        ot0.r0 i19 = i(f9Var);
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(i19 == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineInfoStorageLogic", "reader is null? : %b", objArr);
        return (i19 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(i19.f430114i)) ? false : true;
    }

    public static void b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17) {
        long incrementAndGet;
        com.p314xaae8f345.mm.p2621x8fb0427b.f1 ij6 = r01.q3.ij();
        long I0 = f9Var.I0();
        ij6.getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var = new com.p314xaae8f345.mm.p2621x8fb0427b.s1();
        android.database.Cursor D = ij6.f275442d.D("BizPhotoSingleMsgInfo", null, "msgSvrId=?", new java.lang.String[]{"" + I0}, null, null, null, 2);
        com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var2 = null;
        if (D.moveToFirst()) {
            s1Var.mo9015xbf5d97fd(D);
            D.close();
        } else {
            D.close();
            s1Var = null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var3 = s1Var == null ? new com.p314xaae8f345.mm.p2621x8fb0427b.s1() : s1Var;
        if (z17) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f1 ij7 = r01.q3.ij();
            synchronized (ij7) {
                if (ij7.f275445g.longValue() == -60000000) {
                    android.database.Cursor B = ij7.f275442d.B("SELECT * FROM BizPhotoSingleMsgInfo where type=10100 or type=318767153 order by createTime DESC limit 1", null);
                    if (B.moveToFirst()) {
                        s1Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.s1();
                        s1Var2.mo9015xbf5d97fd(B);
                    }
                    B.close();
                    if (s1Var2 != null) {
                        ij7.f275445g.set(s1Var2.f67292x297eb4f7);
                    }
                }
                incrementAndGet = ij7.f275445g.incrementAndGet();
            }
            s1Var3.f67292x297eb4f7 = incrementAndGet;
        } else {
            s1Var3.f67292x297eb4f7 = f9Var.m124847x74d37ac6();
        }
        s1Var3.f67293xd09be28e = f9Var.I0();
        s1Var3.f67281xad49e234 = f9Var.j();
        s1Var3.f67308x2262335f = f9Var.mo78013xfb85f7b0();
        s1Var3.f67306x114ef53e = f9Var.Q0();
        s1Var3.f67307xf966a6f9 = f9Var.R0();
        s1Var3.f67282xac3be4e = f9Var.mo78012x3fdd41df();
        s1Var3.f67284xe6d28443 = f9Var.z0();
        s1Var3.L = f9Var.F;
        s1Var3.M = f9Var.G;
        s1Var3.f319718o = true;
        s1Var3.f67305x10a0fed7 = f9Var.P0();
        int h17 = com.p314xaae8f345.mm.p2621x8fb0427b.s2.h(s1Var3, 5);
        s1Var3.f67294x6b90c866 = h17;
        if ((h17 & 1) != 0) {
            s1Var3.f67305x10a0fed7 = 4;
            s1Var3.f67304xe09a68ee = 1;
        }
        s1Var3.f67291xf783d6b1 = com.p314xaae8f345.mm.p2621x8fb0427b.s2.e(s1Var3, 5);
        if (s1Var != null) {
            r01.q3.ij().L0(s1Var3);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.A(2126, 0);
        if (r01.q3.ij().mo880xb970c2b9(s1Var3)) {
            return;
        }
        g0Var.A(2126, 2);
    }

    public static void c(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        int i17;
        int i18;
        int i19;
        int i27;
        boolean z17;
        boolean z18;
        int i28;
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.c0 a17;
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g0 c17;
        if (f9Var == null) {
            return;
        }
        java.lang.String Q0 = f9Var.Q0();
        kk.j jVar = ot0.g0.f430010a;
        if (k01.o.a(Q0) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0())) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(f9Var.Q0(), true);
        if (n17 == null || !n17.r2() || n17.k2()) {
            c01.ea w17 = c01.w9.w(f9Var.G);
            if (w17 != null) {
                i17 = w17.f118676b;
                i18 = w17.f118677c;
                i19 = w17.f118678d;
                long j17 = w17.f118682h;
                z17 = (8 & j17) != 0;
                z18 = (16 & j17) != 0;
                if ((j17 & 4) != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineInfoStorageLogic", "doInsertBizTimeLineMsg not allow to insert,talker %s bizFlag = %d", f9Var.Q0(), java.lang.Long.valueOf(w17.f118682h));
                    return;
                }
                i27 = (int) j17;
            } else {
                i17 = -1;
                i18 = -1;
                i19 = -1;
                i27 = 0;
                z17 = false;
                z18 = false;
            }
            if (i18 != 0) {
                return;
            }
            if (w17 != null && (w17.f118682h & 64) != 0 && n17 != null && n17.r2()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizTimeLineInfoStorageLogic", "not fans msg should not be is contact");
                return;
            }
            if (f9Var.mo78013xfb85f7b0() == 10000 && i19 == 7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineInfoStorageLogic", "doInsertBizTimeLineMsg, intercept not allow to insert,talker %s", f9Var.Q0());
                return;
            }
            boolean a18 = a(f9Var, i17, i19);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineInfoStorageLogic", "doInsertBizTimeLineMsg %s, isTimeLine %b, msgId=%d, svrId=%d", f9Var.Q0(), java.lang.Boolean.valueOf(a18), java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), java.lang.Long.valueOf(f9Var.I0()));
            if (!a18) {
                o25.q.f424108b = true;
                d(f9Var, false);
                return;
            }
            if (w17 != null && (w17.f118682h & 2) != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineInfoStorageLogic", "doInsertBizTimeLineMsg not allow to insert,talker %s bizFlag = %d", f9Var.Q0(), java.lang.Long.valueOf(w17.f118682h));
                return;
            }
            o25.q.f424108b = true;
            com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var = new com.p314xaae8f345.mm.p2621x8fb0427b.s1();
            s1Var.f67292x297eb4f7 = f9Var.m124847x74d37ac6();
            s1Var.f67293xd09be28e = f9Var.I0();
            s1Var.f67281xad49e234 = f9Var.j();
            s1Var.f67308x2262335f = f9Var.mo78013xfb85f7b0();
            s1Var.f67306x114ef53e = f9Var.Q0();
            s1Var.f67307xf966a6f9 = f9Var.R0();
            s1Var.f67282xac3be4e = f9Var.mo78012x3fdd41df();
            s1Var.f67284xe6d28443 = f9Var.z0();
            s1Var.L = f9Var.F;
            s1Var.M = f9Var.G;
            s1Var.f319718o = true;
            s1Var.f67280xfd5b6243 = f9Var.v0();
            s1Var.f67297x7c6e898e = i27;
            if (z18) {
                s1Var.f67279x6e664fd4 |= 1;
            }
            if (n17 == null || !n17.w2()) {
                i28 = 0;
                s1Var.f67298x8c900873 = 0;
            } else {
                s1Var.f67298x8c900873 = 1;
                i28 = 0;
            }
            s1Var.f67305x10a0fed7 = f9Var.P0();
            s1Var.f67283x9e1cb272 = i28;
            s1Var.f67285xf918da09 = z17;
            s1Var.f67299x4a963900 = "";
            ((vw.o2) ((qk.m7) i95.n0.c(qk.m7.class))).getClass();
            yw.h1 h1Var = yw.h1.f547865a;
            if (h1Var.n()) {
                yw.q3 q3Var = yw.q3.f547970a;
                if (yw.q3.f547975f && (c17 = q3Var.c()) != null) {
                    c17.q(q3Var.a(s1Var, true), yw.l3.f547926a);
                }
            }
            if (z40.e.l4()) {
                ((y40.i0) z40.e.get()).getClass();
                if (h1Var.n()) {
                    a50.e1 e1Var = a50.e1.f83004a;
                    if (a50.e1.f83009f && (a17 = e1Var.a()) != null) {
                        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.x0 x0Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.x0();
                        x0Var.f301471f = s1Var.f67306x114ef53e;
                        boolean[] zArr = x0Var.M;
                        char c18 = 3;
                        zArr[3] = true;
                        x0Var.f301472g = s1Var.f67293xd09be28e;
                        char c19 = 4;
                        zArr[4] = true;
                        x0Var.f301473h = s1Var.f67282xac3be4e;
                        zArr[5] = true;
                        x0Var.f301474i = s1Var.f67287x15a25b3 ? 2 : s1Var.f67286xff7b64c5 == 1 ? 1 : 0;
                        zArr[6] = true;
                        x0Var.f301475m = 0;
                        zArr[7] = true;
                        x0Var.f301476n = (s1Var.f67279x6e664fd4 & 1) != 0;
                        zArr[8] = true;
                        x0Var.f301477o = s1Var.f67285xf918da09;
                        zArr[9] = true;
                        x0Var.f301478p = s1Var.f67283x9e1cb272 != 1;
                        zArr[10] = true;
                        x0Var.f301479q = true;
                        zArr[11] = true;
                        x0Var.f301486x = s1Var.f67292x297eb4f7;
                        zArr[18] = true;
                        x0Var.f301480r = s1Var.f67299x4a963900;
                        zArr[12] = true;
                        x0Var.B = s1Var.f67297x7c6e898e;
                        zArr[22] = true;
                        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.a1 a1Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.a1();
                        java.util.LinkedList<ot0.s0> linkedList = ((ot0.r0) ((com.p314xaae8f345.mm.p1006xc5476f33.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Di(s1Var.f67292x297eb4f7, s1Var.f67281xad49e234)).f430114i;
                        if (linkedList != null) {
                            for (ot0.s0 s0Var : linkedList) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s0Var);
                                com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.z0 z0Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.z0();
                                java.lang.String str = s0Var.f430294d;
                                if (str == null) {
                                    str = "";
                                }
                                z0Var.f301528d = str;
                                boolean[] zArr2 = z0Var.f301527J;
                                zArr2[1] = true;
                                java.lang.String str2 = s0Var.f430295e;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                z0Var.f301529e = str2;
                                zArr2[2] = true;
                                z0Var.f301530f = s0Var.f430298h;
                                zArr2[c18] = true;
                                java.lang.String str3 = s0Var.f430299i;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                z0Var.f301531g = str3;
                                zArr2[c19] = true;
                                java.lang.String str4 = s0Var.D;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                z0Var.f301532h = str4;
                                zArr2[5] = true;
                                java.lang.String str5 = s0Var.f430305p0;
                                if (str5 == null) {
                                    str5 = "";
                                }
                                z0Var.I = str5;
                                zArr2[29] = true;
                                java.lang.String str6 = s0Var.f430302n;
                                if (str6 == null) {
                                    str6 = "";
                                }
                                z0Var.f301533i = str6;
                                zArr2[6] = true;
                                z0Var.f301534m = s0Var.f430303o;
                                zArr2[7] = true;
                                z0Var.f301535n = s0Var.f430307q;
                                zArr2[8] = true;
                                java.lang.String str7 = s0Var.f430318z;
                                if (str7 == null) {
                                    str7 = "";
                                }
                                z0Var.f301536o = str7;
                                zArr2[9] = true;
                                z0Var.f301538q = s0Var.C;
                                zArr2[11] = true;
                                z0Var.f301539r = s0Var.I == 1;
                                zArr2[12] = true;
                                java.lang.String str8 = s0Var.G;
                                if (str8 == null) {
                                    str8 = "";
                                }
                                z0Var.f301540s = str8;
                                zArr2[13] = true;
                                z0Var.f301541t = s0Var.E;
                                zArr2[14] = true;
                                z0Var.f301542u = s0Var.F;
                                zArr2[15] = true;
                                java.lang.String str9 = s0Var.P;
                                if (str9 == null) {
                                    str9 = "";
                                }
                                z0Var.f301543v = str9;
                                zArr2[16] = true;
                                java.lang.String str10 = s0Var.Q;
                                if (str10 == null) {
                                    str10 = "";
                                }
                                z0Var.f301544w = str10;
                                zArr2[17] = true;
                                java.lang.String str11 = s0Var.R;
                                if (str11 == null) {
                                    str11 = "";
                                }
                                z0Var.f301545x = str11;
                                zArr2[18] = true;
                                z0Var.f301546y = s0Var.S;
                                zArr2[19] = true;
                                java.util.AbstractCollection abstractCollection = s0Var.f430300l1;
                                if (abstractCollection == null) {
                                    abstractCollection = new java.util.ArrayList();
                                }
                                z0Var.f301547z.addAll(abstractCollection);
                                zArr2[20] = true;
                                z0Var.A = s0Var.f430306p1;
                                zArr2[21] = true;
                                java.lang.String str12 = s0Var.T;
                                if (str12 == null) {
                                    str12 = "";
                                }
                                z0Var.B = str12;
                                zArr2[22] = true;
                                z0Var.C = s0Var.U == 1;
                                zArr2[23] = true;
                                z0Var.F = s0Var.W;
                                zArr2[26] = true;
                                z0Var.G = s0Var.Y;
                                zArr2[27] = true;
                                z0Var.H = s0Var.Z;
                                zArr2[28] = true;
                                a1Var.f300796d.add(z0Var);
                                a1Var.f300799g[1] = true;
                                c18 = 3;
                                c19 = 4;
                            }
                        }
                        x0Var.f301470e = a1Var;
                        zArr[2] = true;
                        x0Var.f301482t = s1Var.f67281xad49e234;
                        zArr[14] = true;
                        x0Var.f301485w = s1Var.M;
                        zArr[17] = true;
                        a17.n(x0Var, a50.c1.f82995a);
                    }
                }
            }
        }
    }

    public static void d(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.s1 J0 = r01.q3.oj().J0(f9Var.I0(), "msgSvrId");
        com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var = J0 == null ? new com.p314xaae8f345.mm.p2621x8fb0427b.s1() : J0;
        if (z17) {
            s1Var.f67292x297eb4f7 = r01.q3.oj().W0();
        } else {
            s1Var.f67292x297eb4f7 = f9Var.m124847x74d37ac6();
        }
        s1Var.f67293xd09be28e = f9Var.I0();
        s1Var.f67281xad49e234 = f9Var.j();
        s1Var.f67308x2262335f = f9Var.mo78013xfb85f7b0();
        s1Var.f67306x114ef53e = f9Var.Q0();
        s1Var.f67307xf966a6f9 = f9Var.R0();
        s1Var.f67282xac3be4e = f9Var.mo78012x3fdd41df();
        s1Var.f67284xe6d28443 = f9Var.z0();
        s1Var.L = f9Var.F;
        s1Var.M = f9Var.G;
        s1Var.f319718o = true;
        s1Var.f67305x10a0fed7 = f9Var.P0();
        int h17 = com.p314xaae8f345.mm.p2621x8fb0427b.s2.h(s1Var, 0);
        s1Var.f67294x6b90c866 = h17;
        if ((h17 & 1) != 0) {
            s1Var.f67305x10a0fed7 = 4;
            s1Var.f67304xe09a68ee = 1;
        }
        s1Var.f67291xf783d6b1 = com.p314xaae8f345.mm.p2621x8fb0427b.s2.e(s1Var, 0);
        if (J0 == null) {
            r01.q3.oj().mo880xb970c2b9(s1Var);
        } else {
            r01.q3.oj().f1(s1Var);
        }
    }

    public static int e() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("brandService").getBoolean("BizTimeLineKeepPoseEnableForDebug", true)) {
            return 0;
        }
        int i17 = f275340e;
        if (i17 != 0) {
            return i17;
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_open_biz_time_line_stay_time, 180);
        f275340e = Ni;
        return Ni;
    }

    public static boolean f(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17;
        if (f9Var == null) {
            return false;
        }
        java.lang.String Q0 = f9Var.Q0();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Q0) && (n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(Q0, true)) != null && n17.m2() && n17.r2()) {
            return true;
        }
        c01.ea w17 = c01.w9.w(f9Var.G);
        return w17 != null && w17.f118677c == 1;
    }

    public static boolean g() {
        java.lang.Boolean bool = f275341f;
        if (bool != null) {
            return bool.booleanValue();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 R = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("brandService");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        int o17 = R.o("BizTimeLineOpenStatus", z65.c.a() ? 1 : -1);
        if (o17 == 1) {
            f275341f = java.lang.Boolean.TRUE;
        } else if (o17 == 0) {
            f275341f = java.lang.Boolean.FALSE;
        } else {
            boolean i17 = c01.a1.f118578a.a().i("BizTLRecommendFeedsSvrOpen", false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.BizTLRecFeedsDataUtil", "BizTLRecommendFeedsSvrOpen = " + i17);
            f275341f = java.lang.Boolean.valueOf(i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineInfoStorageLogic", "isRecFeedsOpen svrOpen %b", java.lang.Boolean.valueOf(i17));
        }
        return f275341f.booleanValue();
    }

    public static boolean h() {
        java.lang.Boolean bool = f275342g;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_open_biz_time_line_show_time_v2, 0) == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineInfoStorageLogic", "isShowBizTimeLineTime localOpen");
            java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
            f275342g = bool2;
            return bool2.booleanValue();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = com.p314xaae8f345.mm.p2621x8fb0427b.g2.f275478a.a();
        com.p314xaae8f345.mm.p2621x8fb0427b.e2[] e2VarArr = com.p314xaae8f345.mm.p2621x8fb0427b.e2.f275387d;
        int o17 = a17.o("ReSortBizMsgRecommendReasonMode", 0);
        com.p314xaae8f345.mm.p2621x8fb0427b.e2[] e2VarArr2 = com.p314xaae8f345.mm.p2621x8fb0427b.e2.f275387d;
        if (o17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineInfoStorageLogic", "isShowBizTimeLineTime svrShowTime");
            java.lang.Boolean bool3 = java.lang.Boolean.TRUE;
            f275342g = bool3;
            return bool3.booleanValue();
        }
        java.lang.Boolean bool4 = java.lang.Boolean.FALSE;
        f275342g = bool4;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineInfoStorageLogic", "isShowBizTimeLineTime %b", bool4);
        return f275342g.booleanValue();
    }

    public static ot0.r0 i(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (!f9Var.t2()) {
            return null;
        }
        return (ot0.r0) ((com.p314xaae8f345.mm.p1006xc5476f33.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Di(f9Var.m124847x74d37ac6(), f9Var.j());
    }
}
