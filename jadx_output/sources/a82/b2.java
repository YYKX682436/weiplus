package a82;

/* loaded from: classes4.dex */
public final class b2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f1974d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f1975e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f1976f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a82.g2 f1977g;

    /* renamed from: h, reason: collision with root package name */
    public int f1978h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(a82.g2 g2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f1977g = g2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f1976f = obj;
        this.f1978h |= Integer.MIN_VALUE;
        return this.f1977g.b(null, null, 0, this);
    }
}
