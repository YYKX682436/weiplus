package c61;

/* loaded from: classes10.dex */
public final class h7 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public long f39015d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f39016e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f39017f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f39018g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c61.l7 f39019h;

    /* renamed from: i, reason: collision with root package name */
    public int f39020i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7(c61.l7 l7Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f39019h = l7Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f39018g = obj;
        this.f39020i |= Integer.MIN_VALUE;
        return this.f39019h.pl(0L, null, 0, this);
    }
}
