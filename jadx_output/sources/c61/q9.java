package c61;

/* loaded from: classes3.dex */
public final class q9 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f39258d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f39259e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f39260f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f39261g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f39262h;

    /* renamed from: i, reason: collision with root package name */
    public long f39263i;

    /* renamed from: m, reason: collision with root package name */
    public long f39264m;

    /* renamed from: n, reason: collision with root package name */
    public int f39265n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f39266o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ c61.s9 f39267p;

    /* renamed from: q, reason: collision with root package name */
    public int f39268q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9(c61.s9 s9Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f39267p = s9Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f39266o = obj;
        this.f39268q |= Integer.MIN_VALUE;
        return this.f39267p.Ni(0L, null, 0, 0L, null, null, this);
    }
}
