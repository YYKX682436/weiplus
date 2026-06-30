package db2;

/* loaded from: classes5.dex */
public final class l5 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f309594g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f309595h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f309596i;

    /* renamed from: m, reason: collision with root package name */
    public db2.k5 f309597m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(long j17, java.lang.String str, int i17, int i18, java.lang.String reportData, r45.cl2 cl2Var) {
        super(null, 1, null);
        java.util.LinkedList m75941xfb821914;
        r45.fl2 fl2Var;
        java.lang.String m75945x2fec8307;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportData, "reportData");
        this.f309594g = "Finder.NetSceneFinderAdReport";
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 9935;
        r45.xt0 xt0Var = new r45.xt0();
        xt0Var.set(2, java.lang.Integer.valueOf(i18));
        xt0Var.set(3, reportData);
        db2.t4 t4Var = db2.t4.f309704a;
        xt0Var.set(1, t4Var.a(9935));
        xt0Var.set(5, cl2Var);
        t4Var.h((r45.kv0) xt0Var.m75936x14adae67(1), null, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), str)));
        lVar.f152197a = xt0Var;
        r45.yt0 yt0Var = new r45.yt0();
        yt0Var.set(0, new r45.ie());
        lVar.f152198b = yt0Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderadreport";
        this.f309595h = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NetSceneFinderAdReport", "NetSceneFinderAdReport " + i18 + ", " + reportData);
        r45.kv0 kv0Var = (r45.kv0) xt0Var.m75936x14adae67(1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NetSceneFinderAdReport", "NetSceneFinderAdReport sessionBuffer: ".concat((kv0Var == null || (m75941xfb821914 = kv0Var.m75941xfb821914(7)) == null || (fl2Var = (r45.fl2) kz5.n0.Z(m75941xfb821914)) == null || (m75945x2fec8307 = fl2Var.m75945x2fec8307(1)) == null) ? "" : m75945x2fec8307));
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309594g, "NetSceneFinderAdReport onGYNetEnd " + i18 + ' ' + i19 + ' ' + str + ' ');
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f309596i;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
        db2.k5 k5Var = this.f309597m;
        if (k5Var != null) {
            long j17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.m3) k5Var).f206662a;
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6458x7de9e873 c6458x7de9e873 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6458x7de9e873();
                c6458x7de9e873.f138010d = c6458x7de9e873.b("object_id", pm0.v.u(j17), true);
                c6458x7de9e873.f138011e = r6.f206663b;
                c6458x7de9e873.f138012f = r6.f206664c;
                c6458x7de9e873.f138013g = i18;
                c6458x7de9e873.f138014h = i19;
                c6458x7de9e873.k();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderReportLogic", "reportHardAdvertisement end, feedId=" + pm0.v.u(j17) + ", errType=" + i18 + ", errCode=" + i19 + ", errMsg=" + str);
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f309596i = u0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309594g, "NetSceneFinderAdReport doScene");
        return mo9409x10f9447a(sVar, this.f309595h, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 9935;
    }
}
