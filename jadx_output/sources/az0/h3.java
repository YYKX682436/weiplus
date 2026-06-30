package az0;

/* loaded from: classes5.dex */
public final class h3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f15522d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f15523e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f15524f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ az0.i5 f15525g;

    /* renamed from: h, reason: collision with root package name */
    public int f15526h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(az0.i5 i5Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f15525g = i5Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f15524f = obj;
        this.f15526h |= Integer.MIN_VALUE;
        return this.f15525g.j(null, this);
    }
}
