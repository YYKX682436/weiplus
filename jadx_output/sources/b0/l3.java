package b0;

/* loaded from: classes14.dex */
public final class l3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f16418d;

    /* renamed from: e, reason: collision with root package name */
    public long f16419e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16420f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b0.m3 f16421g;

    /* renamed from: h, reason: collision with root package name */
    public int f16422h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(b0.m3 m3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f16421g = m3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f16420f = obj;
        this.f16422h |= Integer.MIN_VALUE;
        return this.f16421g.c(0.0f, this);
    }
}
