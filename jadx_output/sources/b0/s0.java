package b0;

/* loaded from: classes14.dex */
public final class s0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f16504d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f16505e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f16506f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16507g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b0.t0 f16508h;

    /* renamed from: i, reason: collision with root package name */
    public int f16509i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(b0.t0 t0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f16508h = t0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f16507g = obj;
        this.f16509i |= Integer.MIN_VALUE;
        return this.f16508h.c(null, null, this);
    }
}
