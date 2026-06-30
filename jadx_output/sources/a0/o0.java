package a0;

/* loaded from: classes14.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c1.d0 f246d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f247e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(c1.d0 d0Var, n0.v2 v2Var) {
        super(0);
        this.f246d = d0Var;
        this.f247e = v2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f246d.a();
        return java.lang.Boolean.valueOf(a0.v0.a(this.f247e));
    }
}
