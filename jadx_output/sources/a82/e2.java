package a82;

/* loaded from: classes4.dex */
public final class e2 extends com.tencent.mm.modelbase.m1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.network.l0 f1988d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f1989e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.o f1990f;

    public e2(kotlinx.coroutines.q qVar, com.tencent.mm.modelbase.o oVar) {
        this.f1990f = oVar;
        this.f1988d = new a82.d2(qVar);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f1989e = u0Var;
        return dispatch(sVar, this.f1990f, new a82.c2(this));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 21788;
    }
}
