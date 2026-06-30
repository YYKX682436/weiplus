package b0;

/* loaded from: classes14.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f16267d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c0.o f16268e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(n0.v2 v2Var, c0.o oVar) {
        super(1);
        this.f16267d = v2Var;
        this.f16268e = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n0.b2 DisposableEffect = (n0.b2) obj;
        kotlin.jvm.internal.o.g(DisposableEffect, "$this$DisposableEffect");
        return new b0.d1(this.f16267d, this.f16268e);
    }
}
