package bt3;

/* loaded from: classes9.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static bt3.l0 f105747a;

    public static com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d a(java.lang.String str, long j17, java.lang.String str2) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d J0 = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).J0(j17, str2);
        if (J0 == null) {
            J0 = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                J0 = null;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgLogic", "getAppAttachInfoByAttachId %s", str);
                long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(str, -1L);
                if (V != -1) {
                    ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).z0(V, J0);
                    if (J0.f72763xa3c65b86 != V && ((J0 = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).D0(str)) == null || !J0.f68105x2c1f0acb.equals(str))) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgLogic", "summerbig getAppAttachInfoByAttachId set appAttachInfo null 1");
                        J0 = null;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgLogic", "getAppAttachInfoByAttachId %s id %s", str, java.lang.Long.valueOf(V));
                } else {
                    J0 = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).D0(str);
                    if (J0 == null || !J0.f68105x2c1f0acb.equals(str)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgLogic", "summerbig getAppAttachInfoByAttachId set appAttachInfo null 2");
                        J0 = null;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgLogic", "getAppAttachInfoByAttachId %s id %s", str, java.lang.Long.valueOf(V));
                }
            }
        }
        if (J0 != null) {
            java.lang.Long valueOf = java.lang.Long.valueOf(J0.f72763xa3c65b86);
            java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(J0.f68101x13f40970);
            java.lang.String str3 = J0.f68099xfeae815;
            java.lang.Long valueOf3 = java.lang.Long.valueOf(J0.f68113xeb1a61d6);
            java.lang.Long valueOf4 = java.lang.Long.valueOf(J0.f68109x90a9378);
            java.lang.String str4 = J0.f68105x2c1f0acb;
            java.lang.String str5 = J0.f68104xaca5bdda;
            java.lang.Long valueOf5 = java.lang.Long.valueOf(J0.f68106x315a5445);
            java.lang.Long valueOf6 = java.lang.Long.valueOf(J0.f68114x2262335f);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgLogic", "summerbig getAppAttachInfo info[%s], rowid[%d], isUpload[%b], fullpath[%s], totallen[%d], offset[%d], mediaSvrId[%s], mediaid[%s], msgid[%d], type[%d], stack[%s]", J0, valueOf, valueOf2, str3, valueOf3, valueOf4, str4, str5, valueOf5, valueOf6, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        } else {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppMsgLogic", "summerbig getAppAttachInfo is null stack[%s]", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        }
        return J0;
    }

    public static java.lang.String b(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4 = str3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgLogic", "summerbig initDownloadAttach msgLocalId[%d], msgXml[%s], downloadPath[%s]", java.lang.Long.valueOf(j17), str2, str4);
        ot0.q v17 = ot0.q.v(str2);
        if (v17 == null) {
            return null;
        }
        if (str4 == null) {
            java.lang.String t17 = lp0.b.t();
            java.lang.String n17 = v17.n();
            java.lang.String str5 = v17.f430223o;
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(t17);
            java.lang.String str6 = a17.f294812f;
            if (str6 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str6, false, false);
                if (!str6.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
            com.p314xaae8f345.mm.vfs.z2 m17 = b3Var.m(a17, null);
            if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
                com.p314xaae8f345.mm.vfs.z2 m18 = b3Var.m(a17, m17);
                if (m18.a()) {
                    m18.f294799a.r(m18.f294800b);
                }
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17)) {
                str4 = t17 + "da_" + java.lang.System.currentTimeMillis();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                    str4 = str4 + "." + str5;
                }
            } else {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5) && !n17.endsWith(str5)) {
                    n17 = n17 + "." + str5;
                }
                java.lang.String str7 = t17 + n17;
                if (com.p314xaae8f345.mm.vfs.w6.j(str7)) {
                    int i17 = 1;
                    while (true) {
                        if (i17 >= 20) {
                            str4 = str7;
                            break;
                        }
                        if (!com.p314xaae8f345.mm.vfs.w6.j(t17 + i17 + "_" + n17)) {
                            str4 = t17 + i17 + "_" + n17;
                            break;
                        }
                        i17++;
                    }
                    if (i17 == 20) {
                        str4 = t17 + "da_" + java.lang.System.currentTimeMillis();
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                            str4 = str4 + "." + str5;
                        }
                    }
                } else {
                    str4 = str7;
                }
            }
            try {
                if (!new com.p314xaae8f345.mm.vfs.r6(str4).s().o().equalsIgnoreCase(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(t17)).o())) {
                    str4 = t17 + "da_" + java.lang.System.currentTimeMillis();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppMsgLogic", "maybe DirTraversal attach. %s", str4);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppMsgLogic", e17, "", new java.lang.Object[0]);
                str4 = t17 + "da_" + java.lang.System.currentTimeMillis();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                    str4 = str4 + "." + str5;
                }
            }
        }
        java.lang.String str8 = str4;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.f430227p) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.L)) {
            v17.f430227p = "" + v17.L.hashCode();
        }
        int i18 = v17.f430183e;
        java.lang.String str9 = v17.f430179d;
        java.lang.String str10 = v17.f430227p;
        long j18 = v17.f430215m;
        int i19 = v17.f430199i;
        int i27 = v17.f430247u;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d();
        dVar.f68099xfeae815 = str8;
        dVar.f68094x28d45f97 = str9;
        dVar.f68110xfc39fee = i18;
        dVar.f68105x2c1f0acb = str10;
        dVar.f68113xeb1a61d6 = j18;
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d3) ((ct.w2) i95.n0.c(ct.w2.class))).wi(false);
        dVar.f68112x10a0fed7 = 101;
        dVar.f68101x13f40970 = false;
        dVar.f68096xac3be4e = c01.id.a();
        dVar.f68103x4a777c2 = c01.id.e();
        dVar.f68106x315a5445 = j17;
        dVar.f68107xaaaa6883 = str;
        dVar.f68108x6a1cf14e = 0L;
        dVar.f68114x2262335f = i19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgLogic", "summerbig initDownloadAttach ret[%b], rowid[%d], field_totalLen[%d], type[%d], isLargeFile[%d], destFile[%s], stack[%s]", java.lang.Boolean.valueOf(((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).mo880xb970c2b9(dVar)), java.lang.Long.valueOf(dVar.f72763xa3c65b86), java.lang.Long.valueOf(dVar.f68113xeb1a61d6), java.lang.Long.valueOf(dVar.f68114x2262335f), java.lang.Integer.valueOf(i27), str8, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        return str10;
    }

    public static boolean c(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar) {
        if (dVar == null || !com.p314xaae8f345.mm.vfs.w6.j(dVar.f68099xfeae815)) {
            return false;
        }
        return dVar.t0() || (f9Var.A0() == 1 && dVar.f68101x13f40970);
    }

    public static void d(long j17) {
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).b1(j17, 198L);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d();
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).z0(j17, dVar);
        long j18 = dVar.f68106x315a5445;
        if (j18 <= 0) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(dVar.f68107xaaaa6883, j18);
        if (Li.m124847x74d37ac6() != dVar.f68106x315a5445) {
            return;
        }
        if (Li.mo78013xfb85f7b0() == 1090519089 && Li.Z1() == 1) {
            ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).vj(Li, dVar, 3, true);
        } else {
            Li.r1(5);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(Li.m124847x74d37ac6(), Li, true);
    }
}
