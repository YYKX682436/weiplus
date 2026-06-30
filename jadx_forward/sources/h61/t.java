package h61;

/* loaded from: classes9.dex */
public class t implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f360703d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f360704e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.util.Map f360705f;

    /* renamed from: g, reason: collision with root package name */
    public km5.b f360706g;

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LaunchAALogic", "onSceneEnd, errType: %s, errCode: %s, scene: %s, mode: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), m1Var, java.lang.Integer.valueOf(this.f360704e));
        if (m1Var.mo808xfb85f7b0() == 1624) {
            this.f360703d = false;
            if (i17 != 0 || i18 != 0) {
                km5.b bVar = this.f360706g;
                if (bVar != null) {
                    bVar.a(java.lang.Boolean.FALSE);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(407L, 1L, 1L, false);
                return;
            }
            i61.f fVar = (i61.f) m1Var;
            r45.j jVar = fVar.f370443f;
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = java.lang.Integer.valueOf(jVar.f458959d);
            objArr[1] = jVar.f458960e;
            objArr[2] = java.lang.Boolean.valueOf(jVar.f458962g == null);
            objArr[3] = jVar.f458961f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LaunchAALogic", "launchAAByMoney, onSceneEnd, retCode: %s, retmsg: %s, msgXml==null: %s, billNo: %s", objArr);
            int i19 = jVar.f458959d;
            if (i19 == 0) {
                java.lang.String str2 = jVar.f458962g;
                java.lang.String str3 = fVar.f370445h;
                if (str2 != null) {
                    h61.o.p(jVar.f458961f, str3, str2);
                    km5.u.h(this.f360706g, java.lang.Boolean.TRUE);
                } else {
                    h61.o.m(jVar.f458961f, false, 0L);
                    km5.u.h(this.f360706g, java.lang.Boolean.TRUE);
                }
                h61.o.b(str3);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(407L, 0L, 1L, false);
                return;
            }
            km5.b bVar2 = this.f360706g;
            if (bVar2 != null) {
                if (i19 > 0) {
                    r45.g0 g0Var = jVar.f458963h;
                    if (g0Var == null || g0Var.f456292d <= 0) {
                        r45.a aVar = jVar.f458964i;
                        if (aVar != null && aVar.f451100d == 1 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f451104h) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jVar.f458964i.f451102f) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jVar.f458964i.f451103g) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jVar.f458964i.f451101e)) {
                            this.f360706g.a(jVar.f458964i);
                        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jVar.f458960e)) {
                            this.f360706g.a(java.lang.Boolean.FALSE);
                        } else {
                            this.f360706g.a(jVar.f458960e);
                        }
                    } else {
                        bVar2.a(g0Var);
                    }
                } else {
                    bVar2.a(java.lang.Boolean.FALSE);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(407L, 2L, 1L, false);
            return;
        }
        if (m1Var.mo808xfb85f7b0() == 1655) {
            this.f360703d = false;
            if (i17 != 0 || i18 != 0) {
                km5.b bVar3 = this.f360706g;
                if (bVar3 != null) {
                    bVar3.a(java.lang.Boolean.FALSE);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(407L, 4L, 1L, false);
                return;
            }
            i61.g gVar = (i61.g) m1Var;
            r45.n nVar = gVar.f370448f;
            java.lang.Object[] objArr2 = new java.lang.Object[3];
            objArr2[0] = java.lang.Integer.valueOf(nVar.f462493d);
            objArr2[1] = nVar.f462494e;
            objArr2[2] = java.lang.Boolean.valueOf(nVar.f462496g == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LaunchAALogic", "launchAAByPerson, onSceneEnd, retCode: %s, retmsg: %s, msgxml==null: %s", objArr2);
            java.lang.String str4 = nVar.f462495f;
            int i27 = nVar.f462493d;
            if (i27 == 0) {
                java.lang.String str5 = nVar.f462496g;
                java.lang.String str6 = gVar.f370450h;
                if (str5 != null) {
                    h61.o.p(str4, str6, str5);
                    km5.u.h(this.f360706g, java.lang.Boolean.TRUE, nVar.f462495f);
                } else {
                    h61.o.m(str4, false, 0L);
                    km5.u.h(this.f360706g, java.lang.Boolean.TRUE, nVar.f462495f);
                }
                h61.o.b(str6);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(407L, 3L, 1L, false);
                return;
            }
            if (i27 > 0) {
                r45.g0 g0Var2 = nVar.f462497h;
                if (g0Var2 == null || g0Var2.f456292d <= 0) {
                    r45.a aVar2 = nVar.f462498i;
                    if (aVar2 != null && aVar2.f451100d == 1 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar2.f451104h) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(nVar.f462498i.f451102f) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(nVar.f462498i.f451103g) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(nVar.f462498i.f451101e)) {
                        this.f360706g.a(nVar.f462498i);
                    } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(nVar.f462494e)) {
                        this.f360706g.a(java.lang.Boolean.FALSE);
                    } else {
                        this.f360706g.a(nVar.f462494e);
                    }
                } else {
                    this.f360706g.a(g0Var2);
                }
            } else {
                this.f360706g.a(java.lang.Boolean.FALSE);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(407L, 5L, 1L, false);
            return;
        }
        if (m1Var.mo808xfb85f7b0() == 2831) {
            this.f360703d = false;
            if (i17 != 0 || i18 != 0) {
                km5.b bVar4 = this.f360706g;
                if (bVar4 != null) {
                    bVar4.a(java.lang.Boolean.FALSE);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(407L, 4L, 1L, false);
                return;
            }
            i61.h hVar = (i61.h) m1Var;
            r45.l lVar = hVar.f370453f;
            java.lang.Object[] objArr3 = new java.lang.Object[3];
            objArr3[0] = java.lang.Integer.valueOf(lVar.f460584d);
            objArr3[1] = lVar.f460585e;
            objArr3[2] = java.lang.Boolean.valueOf(lVar.f460587g == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LaunchAALogic", "launchAAByPersonCustomize, onSceneEnd, retCode: %s, retmsg: %s, msgxml==null: %s", objArr3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LaunchAALogic", "launchAAByPersonCustomize, onSceneEnd, retMsg: %s, billNo: %s", lVar.f460585e, lVar.f460586f);
            int i28 = lVar.f460584d;
            if (i28 == 0) {
                java.lang.String str7 = lVar.f460587g;
                java.lang.String str8 = hVar.f370455h;
                if (str7 != null) {
                    h61.o.p(lVar.f460586f, str8, str7);
                    km5.u.h(this.f360706g, java.lang.Boolean.TRUE, lVar.f460586f);
                } else {
                    h61.o.m(lVar.f460586f, false, 0L);
                    km5.u.h(this.f360706g, java.lang.Boolean.TRUE, lVar.f460586f);
                }
                h61.o.b(str8);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(407L, 3L, 1L, false);
                return;
            }
            if (i28 > 0) {
                r45.g0 g0Var3 = lVar.f460588h;
                if (g0Var3 == null || g0Var3.f456292d <= 0) {
                    r45.a aVar3 = lVar.f460589i;
                    if (aVar3 != null && aVar3.f451100d == 1 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar3.f451104h) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lVar.f460589i.f451102f) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lVar.f460589i.f451103g) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lVar.f460589i.f451101e)) {
                        this.f360706g.a(lVar.f460589i);
                    } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lVar.f460585e)) {
                        this.f360706g.a(java.lang.Boolean.FALSE);
                    } else {
                        this.f360706g.a(lVar.f460585e);
                    }
                } else {
                    this.f360706g.a(g0Var3);
                }
            } else {
                this.f360706g.a(java.lang.Boolean.FALSE);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(407L, 5L, 1L, false);
        }
    }
}
