package a03;

/* loaded from: classes11.dex */
public final class p extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f442d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f443e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f444f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f445g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a03.h0 f446h;

    /* renamed from: i, reason: collision with root package name */
    public int f447i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(a03.h0 h0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f446h = h0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f445g = obj;
        this.f447i |= Integer.MIN_VALUE;
        return this.f446h.bj(null, null, null, null, this);
    }
}
