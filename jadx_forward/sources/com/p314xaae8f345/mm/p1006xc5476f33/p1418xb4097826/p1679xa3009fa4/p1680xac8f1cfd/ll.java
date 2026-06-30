package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes8.dex */
public final class ll extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca f216603d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca c15456x2c452bca, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f216603d = c15456x2c452bca;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ll(this.f216603d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ll llVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ll) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        llVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        if (((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Di() != null) {
            java.lang.String finderUsername = xy2.c.e(this.f216603d.m80379x76847179());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
            on3.a aVar2 = on3.a.f428635a;
            boolean z17 = false;
            if (aVar2.a(finderUsername).getBoolean("NewLifeHasMigratedPictureLocation", false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewLife.NewLifeInnerFeatureService", "migratePictureLocationPermission has migrated once");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewLife.NewLifeInnerFeatureService", "migratePictureLocationPermission set has migrated");
                aVar2.a(finderUsername).putBoolean("NewLifeHasMigratedPictureLocation", true);
                if (hc2.s.c(ya2.h.f542017a.b(finderUsername))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewLife.NewLifeInnerFeatureService", "migratePictureLocationPermission has new permission");
                } else {
                    d85.m0 m0Var = (d85.m0) i95.n0.c(d85.m0.class);
                    d85.g0 g0Var = d85.g0.IMAGE_LOCATION_DATA;
                    java.lang.String str = d85.f0.Q.f308709d;
                    d85.d1 d1Var = (d85.d1) m0Var;
                    d1Var.getClass();
                    java.lang.String str2 = g0Var.f308725d;
                    if (str2 == null) {
                        str2 = "";
                    }
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Zi = d1Var.Zi(str2);
                    if (Zi != null) {
                        if (str == null) {
                            str = "";
                        }
                        z17 = Zi.getBoolean(str, false);
                    }
                    if (z17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewLife.NewLifeInnerFeatureService", "migratePictureLocationPermission migrated old permission to new");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPoiHelper", "modMaterialPoiSwitchCallback, isEnable:true");
                        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                        hb2.s0.f361623e.o(true, new la2.c(true, finderUsername), finderUsername);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewLife.NewLifeInnerFeatureService", "migratePictureLocationPermission doesn't have old permission");
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
