package oq3;

/* loaded from: classes12.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f428906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f428907e;

    public a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17) {
        this.f428906d = f9Var;
        this.f428907e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        int i18;
        int i19;
        int i27;
        int i28;
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.l0 Di = m11.b1.Di();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f428906d;
        m11.b0 b27 = Di.b2(f9Var.y0(), f9Var.I0());
        java.lang.String format = java.lang.String.format("%s_%s", java.lang.Long.valueOf(f9Var.I0()), 1);
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.m134976x2690a4ac();
        nVar.A.Z6(format);
        boolean z17 = false;
        if (com.p314xaae8f345.mm.vfs.w6.j(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(f9Var, bm5.c0.f104083a.d(b27.l()), b27.f404170e, "", ""))) {
            if (b27.j()) {
                ((j70.e) ((k70.z) i95.n0.c(k70.z.class))).getClass();
                m11.b0 d17 = m11.c0.d(b27);
                i17 = 4;
                i18 = 3;
                java.lang.String aj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(f9Var, bm5.f0.f104095g, d17.f404170e, "", "");
                if (d17.f404166a > 0 && d17.k() && com.p314xaae8f345.mm.vfs.w6.j(aj6)) {
                    format = java.lang.String.format("%s_%s", java.lang.Long.valueOf(f9Var.I0()), 2);
                    z17 = true;
                }
            } else {
                i17 = 4;
                i18 = 3;
            }
            i27 = i18;
            i19 = 1;
        } else {
            i17 = 4;
            i18 = 3;
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.h0) ((c01.x7) i95.n0.c(c01.x7.class))).getClass();
            if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.z4.h(f9Var) < c01.id.a() - f9Var.mo78012x3fdd41df()) {
                i19 = 4;
                i27 = 4;
            } else {
                i19 = 1;
                i27 = 1;
            }
        }
        fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
        nVar2.m134976x2690a4ac();
        sq3.a Y6 = nVar2.A.Y6(format);
        if (Y6 != null) {
            fq3.n nVar3 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar3.m134976x2690a4ac();
            nVar3.A.Z6(format);
            int a17 = Y6.z0() == Y6.J0() ? kq3.i.a(Y6.I0()) : 2;
            i28 = a17 == i17 ? i17 : i27;
            if (i28 == i18 && a17 != i18) {
                fq3.n nVar4 = (fq3.n) i95.n0.c(fq3.n.class);
                nVar4.m134976x2690a4ac();
                nVar4.A.b7(format, 5);
            }
            i19 = a17;
        } else {
            i28 = i27;
        }
        bx1.s sVar = (bx1.s) i95.n0.c(bx1.s.class);
        long I0 = f9Var.I0();
        java.lang.String fromUser = f9Var.y0();
        long j17 = i19;
        long j18 = i28;
        long mo78012x3fdd41df = f9Var.mo78012x3fdd41df();
        ((kq3.e) sVar).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromUser, "fromUser");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6814xdfa37f5d c6814xdfa37f5d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6814xdfa37f5d();
        c6814xdfa37f5d.f141383d = this.f428907e ? 4L : 1L;
        c6814xdfa37f5d.f141384e = z17 ? 2L : 1L;
        c6814xdfa37f5d.p(fromUser);
        c6814xdfa37f5d.q(java.lang.String.valueOf(I0));
        c6814xdfa37f5d.f141388i = j17;
        c6814xdfa37f5d.f141391l = j18;
        c6814xdfa37f5d.f141392m = mo78012x3fdd41df / 1000;
        java.lang.String m17 = c6814xdfa37f5d.m();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreloadReportFeatureService", "report 27004 C2C image click:%s", m17);
        jx3.f.INSTANCE.mo68478xbd3cda5f(27004, m17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CPreDownloadPLC", "c2c pre download: image msg open, msgId:" + f9Var.m124847x74d37ac6());
    }
}
