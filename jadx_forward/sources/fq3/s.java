package fq3;

/* loaded from: classes12.dex */
public class s extends tq3.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f347088d;

    public s(fq3.w wVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f347088d = f9Var;
    }

    @Override // tq3.a
    public java.lang.String a() {
        return "C2CFileReceiveTask";
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String j17;
        double[] c17;
        int i17;
        double d17;
        java.lang.String str2;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = this.f347088d;
        long mo78012x3fdd41df = f9Var2.mo78012x3fdd41df();
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.m134976x2690a4ac();
        if (mo78012x3fdd41df <= nVar.f347061m) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.PriorityService", "onC2CFileReceive time condition not support %s", k35.m1.d(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f, f9Var2.mo78012x3fdd41df() / 1000));
            return;
        }
        fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
        nVar2.m134976x2690a4ac();
        if (nVar2.f347071w != null) {
            fq3.n nVar3 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar3.m134976x2690a4ac();
            nVar3.f347071w.getClass();
            java.lang.String Q0 = f9Var2.Q0();
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var2.Q0()) && f9Var2.A0() == 0) {
                j17 = c01.w9.u(f9Var2.j());
                str = c01.w9.s(f9Var2.j());
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str == null) {
                    str = "";
                }
            } else {
                str = Q0;
                j17 = f9Var2.j();
            }
            ot0.q v17 = ot0.q.v(j17);
            if (v17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadFileLogic", "appMsgContent is null");
                return;
            }
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var2.Q0()) && f9Var2.A0() == 0) {
                fq3.n nVar4 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar4.m134976x2690a4ac();
                c17 = nVar4.f347066r.c(f9Var2.Q0(), "@all");
                fq3.n nVar5 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar5.m134976x2690a4ac();
                i17 = nVar5.f347066r.i(f9Var2.Q0(), "@all");
            } else {
                fq3.n nVar6 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar6.m134976x2690a4ac();
                c17 = nVar6.f347066r.c(f9Var2.Q0(), f9Var2.Q0());
                fq3.n nVar7 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar7.m134976x2690a4ac();
                i17 = nVar7.f347066r.i(f9Var2.Q0(), f9Var2.Q0());
            }
            double max = java.lang.Math.max(java.lang.Math.max(c17[0], c17[1]), c17[2]);
            java.lang.String str3 = "insert auto download file %s %s %s %s %.2f";
            if (((bf5.o) ((e40.u) i95.n0.c(e40.u.class))).Bi(java.lang.Integer.valueOf(v17.f430199i))) {
                java.lang.String valueOf = java.lang.String.valueOf(f9Var2.m124847x74d37ac6());
                fq3.n nVar8 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar8.m134976x2690a4ac();
                if (nVar8.f347064p.e(valueOf, f9Var2.I0())) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadFileLogic", "file already exist msg %s %s", java.lang.Long.valueOf(f9Var2.m124847x74d37ac6()), java.lang.Long.valueOf(f9Var2.I0()));
                    return;
                }
                r45.qc qcVar = new r45.qc();
                qcVar.f465351d = valueOf;
                qcVar.f465352e = f9Var2.Q0();
                qcVar.f465353f = str;
                qcVar.f465354g = 2;
                qcVar.f465355h = f9Var2.mo78012x3fdd41df();
                qcVar.f465356i = i17 < 2 ? 1 : 0;
                qcVar.f465357m = 1;
                qcVar.f465358n = 0L;
                qcVar.f465359o = f9Var2.I0();
                qcVar.f465360p = v17.f430215m;
                qcVar.f465361q = v17.f430223o;
                qcVar.f465363s = max;
                qcVar.f465364t = 1;
                qcVar.f465365u = v17.f430227p;
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d D0 = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).D0(v17.f430227p);
                if (D0 != null) {
                    com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(D0.f68099xfeae815);
                    if (r6Var.m() && r6Var.C() == D0.f68113xeb1a61d6) {
                        qcVar.f465358n = java.lang.System.currentTimeMillis();
                        qcVar.f465357m = 6;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadFileLogic", "insert auto download file %s %s %s %s %.2f", qcVar.f465352e, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h0(qcVar.f465360p), qcVar.f465361q, java.lang.Integer.valueOf(qcVar.f465356i), java.lang.Double.valueOf(qcVar.f465363s));
                fq3.n nVar9 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar9.m134976x2690a4ac();
                nVar9.f347064p.d(qcVar);
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(qcVar.f465352e)) {
                    fq3.n nVar10 = (fq3.n) i95.n0.c(fq3.n.class);
                    nVar10.m134976x2690a4ac();
                    nVar10.f347066r.k(qcVar.f465352e, "@all");
                }
                fq3.n nVar11 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar11.m134976x2690a4ac();
                nVar11.f347066r.k(qcVar.f465352e, qcVar.f465353f);
                kq3.i.d(3, java.lang.System.currentTimeMillis(), qcVar.f465357m, qcVar);
                return;
            }
            if (v17.f430199i == 19) {
                java.util.Iterator it = bt3.g2.A(v17.f430196h0).f468998f.iterator();
                while (it.hasNext()) {
                    r45.gp0 gp0Var = (r45.gp0) it.next();
                    int i18 = gp0Var.I;
                    if (i18 == 8 || i18 == 10130) {
                        java.lang.String str4 = gp0Var.T;
                        fq3.n nVar12 = (fq3.n) i95.n0.c(fq3.n.class);
                        nVar12.m134976x2690a4ac();
                        d17 = max;
                        java.lang.String str5 = str3;
                        if (nVar12.f347064p.e(str4, f9Var2.I0())) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadFileLogic", "file already exist msg %s %s", str4, java.lang.Long.valueOf(f9Var2.I0()));
                            str3 = str5;
                            max = d17;
                        } else {
                            r45.qc qcVar2 = new r45.qc();
                            qcVar2.f465351d = str4;
                            qcVar2.f465352e = f9Var2.Q0();
                            qcVar2.f465353f = str;
                            qcVar2.f465354g = 3;
                            qcVar2.f465355h = f9Var2.mo78012x3fdd41df();
                            qcVar2.f465356i = i17 < 2 ? 1 : 0;
                            qcVar2.f465357m = 1;
                            str2 = str5;
                            qcVar2.f465358n = 0L;
                            qcVar2.f465359o = f9Var2.I0();
                            long j18 = gp0Var.R;
                            qcVar2.f465360p = j18;
                            qcVar2.f465361q = gp0Var.K;
                            f9Var = f9Var2;
                            qcVar2.f465363s = d17;
                            qcVar2.f465364t = 1;
                            qcVar2.f465365u = gp0Var.f456967s;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadFileLogic", str2, qcVar2.f465352e, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h0(j18), qcVar2.f465361q, java.lang.Integer.valueOf(qcVar2.f465356i), java.lang.Double.valueOf(qcVar2.f465363s));
                            fq3.n nVar13 = (fq3.n) i95.n0.c(fq3.n.class);
                            nVar13.m134976x2690a4ac();
                            nVar13.f347064p.d(qcVar2);
                            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(qcVar2.f465352e)) {
                                fq3.n nVar14 = (fq3.n) i95.n0.c(fq3.n.class);
                                nVar14.m134976x2690a4ac();
                                nVar14.f347066r.k(qcVar2.f465352e, "@all");
                            }
                            fq3.n nVar15 = (fq3.n) i95.n0.c(fq3.n.class);
                            nVar15.m134976x2690a4ac();
                            nVar15.f347066r.k(qcVar2.f465352e, qcVar2.f465353f);
                            kq3.i.d(3, java.lang.System.currentTimeMillis(), qcVar2.f465357m, qcVar2);
                        }
                    } else {
                        f9Var = f9Var2;
                        str2 = str3;
                        d17 = max;
                    }
                    str3 = str2;
                    f9Var2 = f9Var;
                    max = d17;
                }
            }
        }
    }
}
