package b0;

/* loaded from: classes14.dex */
public final class b3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public long f16227d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16228e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0.c3 f16229f;

    /* renamed from: g, reason: collision with root package name */
    public int f16230g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(b0.c3 c3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f16229f = c3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f16228e = obj;
        this.f16230g |= Integer.MIN_VALUE;
        return this.f16229f.a(0L, 0L, this);
    }
}
