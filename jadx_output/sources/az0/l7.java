package az0;

/* loaded from: classes5.dex */
public final class l7 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f15665d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f15666e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f15667f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f15668g;

    /* renamed from: h, reason: collision with root package name */
    public int f15669h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(az0.n7 n7Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f15668g = n7Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f15667f = obj;
        this.f15669h |= Integer.MIN_VALUE;
        return this.f15668g.r(false, false, this);
    }
}
