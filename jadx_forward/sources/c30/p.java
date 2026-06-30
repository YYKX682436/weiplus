package c30;

/* loaded from: classes12.dex */
public final class p implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c30.s f119686a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f119687b;

    public p(c30.s sVar, java.util.List list) {
        this.f119686a = sVar;
        this.f119687b = list;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsWeShopInfoUpdater", "EcsGetUserShopInfoResp errType:" + i17 + " errCode:" + i18 + ", errorMsg: " + str);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.wechat.aff.proto.EcsGetUserShopInfoResp");
        bw5.x6 x6Var = (bw5.x6) fVar;
        if (i18 == 0 && i17 == 0) {
            ((ku5.t0) ku5.t0.f394148d).h(new c30.n(x6Var, this.f119686a, this.f119687b), "EcsWeShopInfoUpdater");
        } else {
            ((ku5.t0) ku5.t0.f394148d).h(new c30.o(this.f119686a, this.f119687b), "EcsWeShopInfoUpdater");
        }
    }
}
