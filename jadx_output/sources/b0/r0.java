package b0;

/* loaded from: classes14.dex */
public final class r0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f16490d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f16491e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f16492f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f16493g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16494h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b0.t0 f16495i;

    /* renamed from: m, reason: collision with root package name */
    public int f16496m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(b0.t0 t0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f16495i = t0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f16494h = obj;
        this.f16496m |= Integer.MIN_VALUE;
        return this.f16495i.b(null, null, this);
    }
}
