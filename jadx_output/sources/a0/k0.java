package a0;

/* loaded from: classes14.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c0.o f195e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(n0.v2 v2Var, c0.o oVar) {
        super(1);
        this.f194d = v2Var;
        this.f195e = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n0.b2 DisposableEffect = (n0.b2) obj;
        kotlin.jvm.internal.o.g(DisposableEffect, "$this$DisposableEffect");
        return new a0.j0(this.f194d, this.f195e);
    }
}
