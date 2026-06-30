package a0;

/* loaded from: classes14.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f124d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c0.o f125e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(n0.v2 v2Var, c0.o oVar) {
        super(1);
        this.f124d = v2Var;
        this.f125e = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n0.b2 DisposableEffect = (n0.b2) obj;
        kotlin.jvm.internal.o.g(DisposableEffect, "$this$DisposableEffect");
        return new a0.e1(this.f124d, this.f125e);
    }
}
