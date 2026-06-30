package kq3;

/* loaded from: classes12.dex */
public abstract class i {
    public static int a(int i17) {
        switch (i17) {
            case 1:
            case 4:
            case 5:
            case 6:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 7:
                return 4;
            default:
                return 0;
        }
    }

    public static long b(double d17) {
        if (d17 >= 0.7d) {
            return 50L;
        }
        return d17 < 0.3d ? 30L : 40L;
    }

    public static final void c(int i17, long j17, int i18, r45.rc rcVar) {
        long j18;
        int i19;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_mmc2c_img_auto_download_report_flag, false)) {
            java.lang.String m40061x1de3608b = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40061x1de3608b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            int i27 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(rcVar.f466243e) ? 1 : 2;
            int i28 = iq3.a.c(rcVar.f466243e) ? 1 : 2;
            int wi6 = i27 == 1 ? ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(rcVar.f466243e) : 1;
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(rcVar.f466243e, true);
            int i29 = i27 == 1 ? n17.r2() ? 3 : 4 : n17.t2() ? 1 : 2;
            int i37 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(rcVar.f466243e) ? 1 : 2;
            long round = java.lang.Math.round(rcVar.f466253r * 100.0d);
            fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
            nVar.m134976x2690a4ac();
            r45.ez b17 = nVar.f347068t.b(rcVar.f466243e);
            if (b17 != null) {
                j18 = java.lang.Math.round(b17.f455370i * 100.0d);
                i19 = b17.f455371m;
            } else {
                j18 = 0;
                i19 = -1;
            }
            java.lang.String format = java.lang.String.format("%d,%d,%d,%s,%d,%d,%d,%d,%d,%d,%d,%d,%s,%d,%d,%d,%d,%s,%d,%s,%s", java.lang.Long.valueOf(rcVar.f466242d), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), m40061x1de3608b, java.lang.Integer.valueOf(rcVar.f466247i), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(c01.id.c() - rcVar.f466246h), 0, java.lang.Integer.valueOf(rcVar.f466251p), java.lang.Long.valueOf(rcVar.f466250o), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), rcVar.f466243e, java.lang.Integer.valueOf(wi6), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37), java.lang.Long.valueOf(round), rcVar.f466244f, java.lang.Integer.valueOf(rcVar.f466254s), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(i19));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.PriorityReportLogic", "report16308Img %s", format);
            jx3.f.INSTANCE.mo68478xbd3cda5f(16308, format);
        }
    }

    public static final void d(int i17, long j17, int i18, r45.qc qcVar) {
        long j18;
        int i19;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_mmc2c_file_auto_download_report_flag, false)) {
            java.lang.String m40061x1de3608b = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40061x1de3608b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            int i27 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(qcVar.f465352e) ? 1 : 2;
            int i28 = iq3.a.c(qcVar.f465352e) ? 1 : 2;
            int wi6 = i27 == 1 ? ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(qcVar.f465352e) : 1;
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(qcVar.f465352e, true);
            int i29 = i27 == 1 ? n17.r2() ? 3 : 4 : n17.t2() ? 1 : 2;
            int i37 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(qcVar.f465352e) ? 1 : 2;
            long round = java.lang.Math.round(qcVar.f465363s * 100.0d);
            fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
            nVar.m134976x2690a4ac();
            r45.ez b17 = nVar.f347068t.b(qcVar.f465352e);
            if (b17 != null) {
                j18 = java.lang.Math.round(b17.f455370i * 100.0d);
                i19 = b17.f455371m;
            } else {
                j18 = 0;
                i19 = -1;
            }
            java.lang.String format = java.lang.String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", java.lang.Long.valueOf(qcVar.f465359o), java.lang.Integer.valueOf(i17), m40061x1de3608b, java.lang.Integer.valueOf(qcVar.f465356i), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(c01.id.c() - qcVar.f465355h), java.lang.Long.valueOf(qcVar.f465360p), qcVar.f465361q, java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), qcVar.f465352e, java.lang.Integer.valueOf(wi6), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37), java.lang.Long.valueOf(round), java.lang.Integer.valueOf(qcVar.f465364t), qcVar.f465353f, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(qcVar.f465354g), qcVar.f465351d, java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(i19), qcVar.f465365u);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.PriorityReportLogic", "report18569File %s", format);
            jx3.f.INSTANCE.mo68478xbd3cda5f(18569, format);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r13) {
        /*
            long r0 = r13.I0()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}
            java.lang.String r2 = "%s_%s"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            java.lang.Class<fq3.n> r2 = fq3.n.class
            i95.m r2 = i95.n0.c(r2)
            fq3.n r2 = (fq3.n) r2
            r2.m134976x2690a4ac()
            sq3.b r2 = r2.A
            sq3.a r0 = r2.Y6(r0)
            java.lang.String r2 = r13.Q0()
            boolean r2 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(r2)
            if (r2 == 0) goto L41
            int r2 = r13.A0()
            if (r2 != 0) goto L41
            java.lang.String r2 = r13.j()
            java.lang.String r2 = c01.w9.u(r2)
            goto L45
        L41:
            java.lang.String r2 = r13.j()
        L45:
            ot0.q r2 = ot0.q.v(r2)
            r3 = 1
            if (r2 == 0) goto L7d
            java.lang.Class<lt.q0> r4 = lt.q0.class
            i95.m r4 = i95.n0.c(r4)
            lt.q0 r4 = (lt.q0) r4
            kt.q0 r4 = (kt.q0) r4
            lt.g0 r4 = r4.wi()
            java.lang.String r2 = r2.f430227p
            com.tencent.mm.pluginsdk.model.app.e r4 = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e) r4
            com.tencent.mm.pluginsdk.model.app.d r2 = r4.D0(r2)
            if (r2 == 0) goto L7d
            com.tencent.mm.vfs.r6 r4 = new com.tencent.mm.vfs.r6
            java.lang.String r5 = r2.f68099xfeae815
            r4.<init>(r5)
            boolean r5 = r4.m()
            if (r5 == 0) goto L7d
            long r4 = r4.C()
            long r6 = r2.f68113xeb1a61d6
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L7d
            r2 = 3
            goto L7e
        L7d:
            r2 = r3
        L7e:
            if (r0 == 0) goto L8f
            int r0 = r0.I0()
            int r0 = a(r0)
            if (r2 != r3) goto L8e
            r3 = 2
            if (r0 == r3) goto L8e
            r2 = r3
        L8e:
            r3 = r0
        L8f:
            java.lang.Class<pt.g0> r0 = pt.g0.class
            i95.m r0 = i95.n0.c(r0)
            pt.g0 r0 = (pt.g0) r0
            r4 = 0
            ot.g r0 = (ot.g) r0
            int r0 = r0.ij(r13, r4)
            if (r0 != r1) goto La2
            r2 = r1
            goto La3
        La2:
            r1 = r3
        La3:
            java.lang.Class<bx1.s> r0 = bx1.s.class
            i95.m r0 = i95.n0.c(r0)
            bx1.s r0 = (bx1.s) r0
            long r4 = r13.I0()
            java.lang.String r6 = r13.y0()
            long r7 = (long) r1
            long r9 = (long) r2
            long r11 = r13.mo78012x3fdd41df()
            r3 = r0
            kq3.e r3 = (kq3.e) r3
            r3.wi(r4, r6, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kq3.i.e(com.tencent.mm.storage.f9):void");
    }

    public static void f(r45.rc rcVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        ((kq3.e) ((bx1.s) i95.n0.c(bx1.s.class))).Di(1L, rcVar.f466250o, rcVar.f466243e, b(rcVar.f466253r), oq3.k.f428927a.f(f9Var.G).f428922b, r1.f428923c, f9Var.mo78012x3fdd41df());
    }
}
