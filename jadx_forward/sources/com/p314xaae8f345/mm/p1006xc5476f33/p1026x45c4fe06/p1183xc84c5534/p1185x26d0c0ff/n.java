package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff;

/* loaded from: classes7.dex */
public abstract class n {
    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d5 pagecontainer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pagecontainer, "pagecontainer");
        if (pagecontainer.mo52154x9a3f0ba2() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.t) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7083x68a68331 c7083x68a68331 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7083x68a68331();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.b(pagecontainer.m52168x74292566(), true);
        if (b17 == null) {
            b17 = null;
        } else if (b17.G > 0) {
            c7083x68a68331.f143909d = c7083x68a68331.b("InstanceId", b17.f169667d, true);
            c7083x68a68331.f143910e = c7083x68a68331.b("AppId", b17.f169668e, true);
            c7083x68a68331.f143911f = b17.f169672i;
            int i17 = b17.f169669f;
            c7083x68a68331.f143912g = i17 != 1 ? i17 != 2 ? i17 != 3 ? null : cm.p.demo : cm.p.debug : cm.p.release;
            c7083x68a68331.f143913h = b17.f169670g;
            c7083x68a68331.f143915j = b17.f169671h;
            c7083x68a68331.f143916k = b17.G;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            c7083x68a68331.f143917l = currentTimeMillis;
            c7083x68a68331.f143914i = currentTimeMillis - c7083x68a68331.f143916k;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 m52169xfdaa7672 = pagecontainer.m52169xfdaa7672();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 mo14682x9dee9c37 = m52169xfdaa7672 != null ? m52169xfdaa7672.mo14682x9dee9c37() : null;
            c7083x68a68331.f143918m = e(mo14682x9dee9c37 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) mo14682x9dee9c37 : null);
            c7083x68a68331.k();
        }
        pagecontainer.m52168x74292566();
        if (b17 == null) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 service, java.lang.String str, long j17, boolean z17, long j18, long j19, java.lang.Object obj) {
        java.lang.String str2;
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 x17 = service.x();
        if (x17 == null || (str2 = x17.W0()) == null) {
            str2 = "invalid";
        }
        cl.k1 k1Var = obj instanceof cl.k1 ? (cl.k1) obj : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandQualitySystemKVProtocol", "Inject MainContextLibScript[" + str + "] Succeed wx.version = " + str2 + ", appId = " + service.mo48798x74292566());
        if (service.H0() || service.mo50262x39e05d35()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7097x4a56851f g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.f169705a.g(service);
            g17.p(str);
            g17.f144101p = j17;
            g17.f144103r = (k1Var == null || (i17 = k1Var.f4717x67f135e7) < 0 || i17 >= 7) ? 4 : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0.f165536t0[i17];
            g17.f144104s = service.X1() ? 1L : 0L;
            g17.f144105t = k1Var != null ? k1Var.f4718xa1600be : 0L;
            g17.f144107v = k1Var != null ? k1Var.f124210c : 0;
            if (k1Var != null) {
                j18 = k1Var.f124208a;
            }
            g17.f144096k = j18;
            if (k1Var != null) {
                j19 = k1Var.f124209b;
            }
            g17.f144097l = j19;
            g17.f144094i = j19 - j18;
            g17.f144106u = g17.b("engineVersion", com.p159x477cd522.p160x333422.V8.m16074x88682140(), true);
            g17.k();
        }
    }

    public final void c(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7088xe1c6c983 weAppQualityCGISpeedStruct, java.lang.String instanceId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weAppQualityCGISpeedStruct, "weAppQualityCGISpeedStruct");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceId, "instanceId");
        if (str == null) {
            str = "";
        }
        weAppQualityCGISpeedStruct.f143961e = weAppQualityCGISpeedStruct.b("appid", str, true);
        weAppQualityCGISpeedStruct.f143960d = weAppQualityCGISpeedStruct.b("instanceId", instanceId, true);
        if (str2 == null) {
            str2 = "";
        }
        weAppQualityCGISpeedStruct.f143962f = weAppQualityCGISpeedStruct.b(dm.i4.f66875xa013b0d5, str2, true);
        weAppQualityCGISpeedStruct.k();
    }

    public final long d() {
        try {
            com.p314xaae8f345.p3210x3857dc.f1 m120125x97d401de = com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.m120125x97d401de();
            int i17 = m120125x97d401de == null ? -1 : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.l.f169749a[m120125x97d401de.ordinal()];
            int i18 = 0;
            if (i17 != -1 && i17 != 1) {
                if (i17 == 2) {
                    i18 = by5.e.d();
                } else if (i17 != 3) {
                    if (i17 == 4) {
                        i18 = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.d();
                    } else {
                        if (i17 != 5) {
                            throw new jz5.j();
                        }
                        i18 = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.d();
                    }
                }
            }
            return i18;
        } catch (java.lang.Throwable unused) {
            return -1L;
        }
    }

    public final long e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w9 S3 = n7Var != null ? n7Var.S3() : null;
        int i17 = -1;
        if (S3 != null) {
            if (S3.m120170x43962b60()) {
                i17 = 4;
            } else if (S3.m120171x1f05d274()) {
                i17 = 3;
            }
        }
        return i17;
    }
}
