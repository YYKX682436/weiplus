package pn2;

/* loaded from: classes3.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pn2.f f438523d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(pn2.f fVar) {
        super(0);
        this.f438523d = fVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.cz1 cz1Var;
        r45.cz1 cz1Var2;
        pn2.f fVar = this.f438523d;
        if (((mm2.c1) fVar.P0(mm2.c1.class)).a8()) {
            km2.z lotteryInfoWrapper = (km2.z) kz5.n0.Z(((on2.z2) fVar.P0(on2.z2.class)).f428624i);
            java.lang.String str = null;
            r45.cz1 cz1Var3 = lotteryInfoWrapper != null ? lotteryInfoWrapper.f390765d : null;
            if (cz1Var3 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cz1Var3.m75945x2fec8307(0))) {
                km2.z zVar = ((on2.z2) fVar.P0(on2.z2.class)).f428625m;
                java.lang.String m75945x2fec8307 = (zVar == null || (cz1Var2 = zVar.f390765d) == null) ? null : cz1Var2.m75945x2fec8307(0);
                if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateLottery error firstLotteryInfo id:");
                    sb6.append(cz1Var3 != null ? cz1Var3.m75945x2fec8307(0) : null);
                    sb6.append(",local lottery id:");
                    km2.z zVar2 = ((on2.z2) fVar.P0(on2.z2.class)).f428625m;
                    if (zVar2 != null && (cz1Var = zVar2.f390765d) != null) {
                        str = cz1Var.m75945x2fec8307(0);
                    }
                    sb6.append(str);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryBubblePlugin", sb6.toString());
                }
                if (!((on2.z2) fVar.P0(on2.z2.class)).f428624i.isEmpty()) {
                    ((on2.z2) fVar.P0(on2.z2.class)).f428624i.removeFirst();
                }
            } else {
                pn2.a aVar = fVar.f438528u;
                if (aVar != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lotteryInfoWrapper, "lotteryInfoWrapper");
                    pm0.v.X(new pn2.r(lotteryInfoWrapper, (pn2.s) aVar));
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
