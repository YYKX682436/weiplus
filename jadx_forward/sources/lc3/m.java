package lc3;

/* loaded from: classes7.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lc3.o f399442d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(lc3.o oVar) {
        super(0);
        this.f399442d = oVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        lc3.f r17;
        long j17;
        lc3.o oVar = this.f399442d;
        if (oVar.f399446e == null) {
            boolean j18 = oVar.j();
            java.lang.String str = oVar.f399427d;
            if (!j18 || oVar.x()) {
                if (oVar.i() && !oVar.x()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.MBBootsPkgManagementBase", "try use boots pkg, instance:" + str);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd Ni = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s7) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4.class))).Ni(oVar.m());
                    if (Ni != null) {
                        long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(Ni.f229399o, -1L);
                        lc3.a k17 = oVar.k();
                        j17 = k17 != null ? k17.f399412b : -1L;
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MagicBootsPkgVersion");
                            java.lang.String lowerCase = oVar.m().toLowerCase(java.util.Locale.ROOT);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
                            long q17 = M.q(lowerCase, j17);
                            if (j17 != q17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.MBBootsPkgManagementBase", "change asset version from " + j17 + " to settledVersion:" + q17);
                                j17 = q17;
                            }
                        } else {
                            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                        }
                        if (V > j17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.MBBootsPkgManagementBase", "use boots pkg,instance:" + str + ",bootsPkgVersion:" + V + ",basePkgVersion:" + j17);
                            r17 = new lc3.h(oVar, Ni);
                        } else {
                            r17 = oVar.r();
                        }
                    } else {
                        r17 = oVar.r();
                    }
                    oVar.f399446e = r17;
                }
                r17 = oVar.r();
                oVar.f399446e = r17;
            } else {
                com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x Ui = ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Ui(oVar.u(), oVar.v());
                if (Ui != null) {
                    long j19 = Ui.f299123e;
                    lc3.a k18 = oVar.k();
                    j17 = k18 != null ? k18.f399414d : -1L;
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MagicBootsPkgVersion");
                        java.lang.String lowerCase2 = oVar.m().toLowerCase(java.util.Locale.ROOT);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase2, "toLowerCase(...)");
                        long q18 = M2.q(lowerCase2, j17);
                        if (j17 != q18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.MBBootsPkgManagementBase", "change asset version from " + j17 + " to settledVersion:" + q18);
                            j17 = q18;
                        }
                    } else {
                        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    }
                    if (j19 > 0 && j19 > j17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.MBBootsPkgManagementBase", "use udr pkg,instance:" + str + ",udrPkgVersion:" + j19 + ",basePkgVersion:" + j17);
                        r17 = new lc3.i(oVar, Ui);
                        oVar.f399446e = r17;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.MBBootsPkgManagementBase", "udr pkg not exist,instance:" + str);
                r17 = oVar.r();
                oVar.f399446e = r17;
            }
        }
        lc3.f fVar = oVar.f399446e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fVar);
        return fVar;
    }
}
