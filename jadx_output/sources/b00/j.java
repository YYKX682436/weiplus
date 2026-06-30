package b00;

/* loaded from: classes9.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b00.r f16691e;

    /* renamed from: f, reason: collision with root package name */
    public int f16692f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(b00.r rVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f16691e = rVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f16690d = obj;
        this.f16692f |= Integer.MIN_VALUE;
        return this.f16691e.mj(null, null, this);
    }
}
