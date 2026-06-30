package pn2;

/* loaded from: classes3.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pn2.s f438531d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(pn2.s sVar) {
        super(0);
        this.f438531d = sVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.cz1 cz1Var;
        pn2.s sVar = this.f438531d;
        km2.z zVar = ((on2.z2) sVar.f438546e.a(on2.z2.class)).f428625m;
        if (zVar != null) {
            zVar.f390768g = true;
        }
        gk2.e eVar = sVar.f438546e;
        km2.z zVar2 = ((on2.z2) eVar.a(on2.z2.class)).f428625m;
        if (!(zVar2 != null && zVar2.f390767f)) {
            on2.z2 z2Var = (on2.z2) eVar.a(on2.z2.class);
            km2.z zVar3 = ((on2.z2) eVar.a(on2.z2.class)).f428625m;
            pm0.v.X(new on2.t2(((on2.z2) eVar.a(on2.z2.class)).S6(), z2Var, (zVar3 == null || (cz1Var = zVar3.f390765d) == null) ? null : cz1Var.m75945x2fec8307(0)));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(sVar.f438548g, "closeBubbleTask running lotteryInfo:" + ((on2.z2) eVar.a(on2.z2.class)).f428625m);
        return jz5.f0.f384359a;
    }
}
