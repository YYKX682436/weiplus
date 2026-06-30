package az0;

/* loaded from: classes5.dex */
public final class z5 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f16101d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f16102e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16103f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f16104g;

    /* renamed from: h, reason: collision with root package name */
    public int f16105h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(az0.n7 n7Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f16104g = n7Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f16103f = obj;
        this.f16105h |= Integer.MIN_VALUE;
        return this.f16104g.h(null, this);
    }
}
