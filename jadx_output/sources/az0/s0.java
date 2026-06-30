package az0;

/* loaded from: classes16.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.f2 f15875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15876e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(az0.f2 f2Var, int i17) {
        super(1);
        this.f15875d = f2Var;
        this.f15876e = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jz5.f0 f0Var = jz5.f0.f302826a;
        az0.f2 f2Var = this.f15875d;
        int i17 = this.f15876e;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            f2Var.f15461e.b(i17);
            kotlin.Result.m521constructorimpl(f0Var);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        return f0Var;
    }
}
