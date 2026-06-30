package ch2;

/* loaded from: classes10.dex */
public final class z1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f123034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole f123035e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(ch2.o2 o2Var, com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole tXChorusRole) {
        super(0);
        this.f123034d = o2Var;
        this.f123035e = tXChorusRole;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        sf2.d3 d3Var;
        ch2.o2 o2Var = this.f123034d;
        om2.i iVar = o2Var.q7().f427840n;
        jz5.f0 f0Var = null;
        if (iVar != null) {
            iVar.j(r45.y84.LIVE_KTV_SING_STATE_SINGING, null);
            iVar.k(0, 0, 0.0f, 0);
        }
        om2.s sVar = o2Var.q7().f427841o;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (sVar != null) {
            ah2.b k76 = o2Var.k7();
            if (k76 != null) {
                ((dh2.x) k76).p(sVar, this.f123035e);
            }
            if (o2Var.q7().S6() && (d3Var = (sf2.d3) o2Var.m56789x25fe639c(sf2.d3.class)) != null) {
                fn2.s1 s1Var = d3Var.f488636m;
                if (s1Var != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x0.i(s1Var, false, 1, null);
                }
                d3Var.f488636m = null;
            }
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveKTVSingController", "startSing error liveSeiSingResourceInfo = null");
        }
        return f0Var2;
    }
}
