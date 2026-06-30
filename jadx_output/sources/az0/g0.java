package az0;

/* loaded from: classes16.dex */
public final class g0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f15484d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f15485e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f15486f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f15487g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ az0.f2 f15488h;

    /* renamed from: i, reason: collision with root package name */
    public int f15489i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(az0.f2 f2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f15488h = f2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f15487g = obj;
        this.f15489i |= Integer.MIN_VALUE;
        java.lang.Object p07 = this.f15488h.p0(null, null, this);
        return p07 == pz5.a.f359186d ? p07 : kotlin.Result.m520boximpl(p07);
    }
}
