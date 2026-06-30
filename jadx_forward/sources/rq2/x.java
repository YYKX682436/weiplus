package rq2;

/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final rq2.x f480447a = new rq2.x();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f480448b = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(12, 1, 94);

    /* renamed from: c, reason: collision with root package name */
    public static long f480449c = c01.id.c();

    /* renamed from: d, reason: collision with root package name */
    public static long f480450d = c01.id.c();

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f480451e = "";

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f480452f = "1001";

    public final void a() {
        b(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19902xf2c82d18, f480449c, c01.id.c(), f480452f, 1L);
    }

    public final void b(java.lang.String str, long j17, long j18, java.lang.String str2, long j19) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6785xbf381fb7 c6785xbf381fb7 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6785xbf381fb7();
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        c6785xbf381fb7.f141177d = c6785xbf381fb7.b("SessionID", Ri, true);
        c6785xbf381fb7.f141178e = c6785xbf381fb7.b("PageName", str, true);
        long j27 = j18 - j17;
        if (j27 <= 0) {
            j27 = 0;
        }
        c6785xbf381fb7.f141179f = j27;
        c6785xbf381fb7.f141180g = j17;
        c6785xbf381fb7.f141181h = j18;
        c6785xbf381fb7.f141182i = c6785xbf381fb7.b("ClickTabContextID", str2, true);
        c6785xbf381fb7.f141183j = c6785xbf381fb7.b("Sid", "", true);
        c6785xbf381fb7.f141184k = j19;
        c6785xbf381fb7.f141185l = c6785xbf381fb7.b("ContextID", f480448b, true);
        c6785xbf381fb7.k();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Zk(c6785xbf381fb7);
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301 abstractC14499x6ba3301) {
        java.lang.String str;
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085;
        if (abstractC14499x6ba3301 == null || (str = abstractC14499x6ba3301.getF203049t()) == null) {
            str = "";
        }
        f480452f = str + '-' + c01.id.c();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchInNearbyTab: currentClickTabContextID=");
        sb6.append(f480452f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyTabLifecycleReporter", sb6.toString());
        if (abstractC14499x6ba3301 == null || (mo7430x19263085 = abstractC14499x6ba3301.mo7430x19263085()) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = mo7430x19263085 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) mo7430x19263085).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        if (nyVar != null) {
            nyVar.f216919r = f480452f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d5 d5Var = nyVar.L;
            if (d5Var != null) {
                d5Var.P0(nyVar.V6());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.b(abstractC14499x6ba3301).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        nyVar2.f216919r = f480452f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d5 d5Var2 = nyVar2.L;
        if (d5Var2 != null) {
            d5Var2.P0(nyVar2.V6());
        }
    }

    public final void d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301 abstractC14499x6ba3301) {
        java.lang.String str;
        if (abstractC14499x6ba3301 == null || (str = abstractC14499x6ba3301.w0()) == null) {
            str = "";
        }
        long c17 = c01.id.c();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).Bi(f480448b);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).Di(f480452f);
        b(str, f480450d, c17, f480452f, 0L);
        f480451e = f480452f;
        f480450d = c17;
    }
}
