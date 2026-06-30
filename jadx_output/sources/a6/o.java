package a6;

/* loaded from: classes14.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f1674d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f1675e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f1676f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f1677g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a6.q f1678h;

    /* renamed from: i, reason: collision with root package name */
    public int f1679i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(a6.q qVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f1678h = qVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f1677g = obj;
        this.f1679i |= Integer.MIN_VALUE;
        return this.f1678h.b(null, this);
    }
}
