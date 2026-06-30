package az0;

/* loaded from: classes16.dex */
public final class u0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f15928d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f15929e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f15930f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ az0.f2 f15931g;

    /* renamed from: h, reason: collision with root package name */
    public int f15932h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(az0.f2 f2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f15931g = f2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f15930f = obj;
        this.f15932h |= Integer.MIN_VALUE;
        return this.f15931g.x(null, this);
    }
}
