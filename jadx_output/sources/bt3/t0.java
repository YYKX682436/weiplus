package bt3;

/* loaded from: classes9.dex */
public final class t0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f24404d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f24405e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f24406f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f24407g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bt3.y0 f24408h;

    /* renamed from: i, reason: collision with root package name */
    public int f24409i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(bt3.y0 y0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f24408h = y0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f24407g = obj;
        this.f24409i |= Integer.MIN_VALUE;
        return this.f24408h.W6(null, null, this);
    }
}
