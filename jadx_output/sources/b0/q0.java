package b0;

/* loaded from: classes14.dex */
public final class q0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f16477d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f16478e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16479f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b0.t0 f16480g;

    /* renamed from: h, reason: collision with root package name */
    public int f16481h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(b0.t0 t0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f16480g = t0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f16479f = obj;
        this.f16481h |= Integer.MIN_VALUE;
        return this.f16480g.a(null, this);
    }
}
