package bt3;

/* loaded from: classes9.dex */
public final class w0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f24436d;

    /* renamed from: e, reason: collision with root package name */
    public long f24437e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f24438f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bt3.y0 f24439g;

    /* renamed from: h, reason: collision with root package name */
    public int f24440h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(bt3.y0 y0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f24439g = y0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f24438f = obj;
        this.f24440h |= Integer.MIN_VALUE;
        return this.f24439g.a7(null, this);
    }
}
