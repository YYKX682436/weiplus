package b0;

/* loaded from: classes14.dex */
public final class l extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f16396d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16397e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0.n f16398f;

    /* renamed from: g, reason: collision with root package name */
    public int f16399g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(b0.n nVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f16398f = nVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f16397e = obj;
        this.f16399g |= Integer.MIN_VALUE;
        return this.f16398f.a(null, 0.0f, this);
    }
}
