package c30;

/* loaded from: classes8.dex */
public final class e0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c30.f0 f119643a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f119644b;

    public e0(c30.f0 f0Var, int i17) {
        this.f119643a = f0Var;
        this.f119644b = i17;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsWeShopMgr", "EcsGetUserShopLabelResp errType:" + i17 + " errCode:" + i18 + ", errorMsg: " + str);
        c30.e eVar = this.f119643a.f119646d;
        if (eVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EcsWeShopMgr", "EcsGetUserShopLabelResp db is null");
            return;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        if (fVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EcsWeShopMgr", "EcsGetUserShopLabelResp responseProtoBuf is null");
            return;
        }
        if (i18 == 0 && i17 == 0) {
            ((ku5.t0) ku5.t0.f394148d).h(new c30.c0(fVar, this.f119643a, eVar, this.f119644b), "EcsWeShopMgr");
        } else {
            ((ku5.t0) ku5.t0.f394148d).B(new c30.d0(this.f119643a, this.f119644b));
        }
    }
}
