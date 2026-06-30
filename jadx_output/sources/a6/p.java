package a6;

/* loaded from: classes14.dex */
public final class p extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f1680d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f1681e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f1682f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f1683g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f1684h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a6.q f1685i;

    /* renamed from: m, reason: collision with root package name */
    public int f1686m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(a6.q qVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f1685i = qVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f1684h = obj;
        this.f1686m |= Integer.MIN_VALUE;
        return this.f1685i.e(null, this);
    }
}
