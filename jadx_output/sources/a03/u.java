package a03;

/* loaded from: classes11.dex */
public final class u extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f457d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f458e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f459f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f460g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f461h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f462i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a03.h0 f463m;

    /* renamed from: n, reason: collision with root package name */
    public int f464n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(a03.h0 h0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f463m = h0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f462i = obj;
        this.f464n |= Integer.MIN_VALUE;
        return a03.h0.aj(this.f463m, null, null, null, null, this);
    }
}
