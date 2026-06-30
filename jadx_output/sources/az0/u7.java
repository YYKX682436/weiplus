package az0;

/* loaded from: classes16.dex */
public final class u7 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f15942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.s9 f15943e;

    /* renamed from: f, reason: collision with root package name */
    public int f15944f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(az0.s9 s9Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f15943e = s9Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f15942d = obj;
        this.f15944f |= Integer.MIN_VALUE;
        java.lang.Object p07 = this.f15943e.p0(null, null, this);
        return p07 == pz5.a.f359186d ? p07 : kotlin.Result.m520boximpl(p07);
    }
}
