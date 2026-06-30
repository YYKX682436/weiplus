package a82;

/* loaded from: classes12.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f2092d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f2093e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f2094f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f2095g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2096h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f2097i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a82.t f2098m;

    /* renamed from: n, reason: collision with root package name */
    public int f2099n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(a82.t tVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f2098m = tVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f2097i = obj;
        this.f2099n |= Integer.MIN_VALUE;
        return a82.t.a7(this.f2098m, null, null, this);
    }
}
