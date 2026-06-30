package b00;

/* loaded from: classes9.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b00.r f16700e;

    /* renamed from: f, reason: collision with root package name */
    public int f16701f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(b00.r rVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f16700e = rVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f16699d = obj;
        this.f16701f |= Integer.MIN_VALUE;
        return this.f16700e.nj(null, null, this);
    }
}
