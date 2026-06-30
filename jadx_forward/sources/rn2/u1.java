package rn2;

/* loaded from: classes15.dex */
public final class u1 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rn2.t2 f479419a;

    public u1(rn2.t2 t2Var) {
        this.f479419a = t2Var;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public final void mo2289xd6191dc1(boolean z17) {
        rn2.f fVar = this.f479419a.f479387f;
        if (fVar != null) {
            rn2.e eVar = ((rn2.c1) fVar).f479215y;
            eVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryCreateConfig", "setEnableRepeatLottery enableRepeatLottery:" + z17);
            eVar.f479248q = z17;
        }
    }
}
