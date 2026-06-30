package a0;

/* loaded from: classes14.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c0.o f245e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(n0.v2 v2Var, c0.o oVar) {
        super(1);
        this.f244d = v2Var;
        this.f245e = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n0.b2 DisposableEffect = (n0.b2) obj;
        kotlin.jvm.internal.o.g(DisposableEffect, "$this$DisposableEffect");
        return new a0.n(this.f244d, this.f245e);
    }
}
