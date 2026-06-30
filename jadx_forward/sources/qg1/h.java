package qg1;

/* loaded from: classes7.dex */
public class h implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f444300a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qg1.d f444301b;

    public h(qg1.d dVar, boolean z17) {
        this.f444301b = dVar;
        this.f444300a = z17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        boolean z17;
        qg1.d dVar = this.f444301b;
        if (1248 == ((r45.u54) dVar.f444282o.f152243a.f152217a).f468589e.f451461f) {
            java.lang.String sourceAppId = (java.lang.String) qg1.d.f444281z.remove(dVar.D());
            if (!android.text.TextUtils.isEmpty(sourceAppId)) {
                java.lang.String f17 = k91.k4.f(sourceAppId);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CgiLaunchWxaApp|func:1122", "onCgiBack cgiHash[%d] sessionId[%s], remove usage (%s, %s) for migrate", java.lang.Integer.valueOf(dVar.hashCode()), dVar.f444283p, sourceAppId, f17);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.hj().W0(f17, 0, 4);
                i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.v.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.v) c17).m134976x2690a4ac();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.v vVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.v.f158116e;
                if (vVar != null) {
                    java.lang.String targetAppId = dVar.D();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceAppId, "sourceAppId");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetAppId, "targetAppId");
                    java.lang.String f18 = k91.k4.f(sourceAppId);
                    java.lang.String f19 = k91.k4.f(targetAppId);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCollectionStorageExport[collection]", "replaceForMigrate, source(" + f18 + ' ' + sourceAppId + ") -> target(" + f19 + ' ' + targetAppId + ')');
                    if (!(f18 == null || f18.length() == 0)) {
                        if (!(f19 == null || f19.length() == 0)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.s1 s1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.q0.f173570a;
                            java.util.List xi6 = vVar.xi(s1Var.f173586b, s1Var.f173587c);
                            if (xi6 != null) {
                                int i17 = -1;
                                int i18 = 0;
                                int i19 = -1;
                                for (java.lang.Object obj2 : xi6) {
                                    int i27 = i18 + 1;
                                    if (i18 < 0) {
                                        kz5.c0.p();
                                        throw null;
                                    }
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4) obj2;
                                    boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f18, c11714x918fd2e4.f157894d);
                                    int i28 = c11714x918fd2e4.f157896f;
                                    if (b17 && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.b(i28)) {
                                        i17 = i18;
                                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f19, c11714x918fd2e4.f157894d) && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.b(i28)) {
                                        i19 = i18;
                                    }
                                    if (i17 >= 0 && i19 >= 0) {
                                        break;
                                    }
                                    i18 = i27;
                                }
                                int i29 = i17;
                                if (i29 >= 0) {
                                    if (i19 >= 0) {
                                        xi6.remove(i29);
                                        z17 = false;
                                    } else {
                                        p3321xbce91901.jvm.p3324x21ffc6bd.m0.b(xi6).set(i29, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4(f19, targetAppId, 0, 0, "", "", "", true, 0L, 0L));
                                        z17 = true;
                                    }
                                    vVar.Ai(xi6, null, z17);
                                }
                            }
                        }
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.hj().m0(k91.k4.f(dVar.D()), dVar.G(), dVar.H(), ((r45.u54) dVar.f444282o.f152243a.f152217a).f468589e.f451461f, 1, dVar.f444283p, this.f444300a);
        return null;
    }
}
