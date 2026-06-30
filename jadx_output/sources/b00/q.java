package b00;

/* loaded from: classes9.dex */
public final class q extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16750d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b00.r f16751e;

    /* renamed from: f, reason: collision with root package name */
    public int f16752f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(b00.r rVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f16751e = rVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f16750d = obj;
        this.f16752f |= Integer.MIN_VALUE;
        return this.f16751e.vj(null, 0, false, this);
    }
}
