package c61;

/* loaded from: classes10.dex */
public final class w5 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f39371d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f39372e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f39373f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f39374g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f39375h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f39376i;

    /* renamed from: m, reason: collision with root package name */
    public long f39377m;

    /* renamed from: n, reason: collision with root package name */
    public long f39378n;

    /* renamed from: o, reason: collision with root package name */
    public int f39379o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f39380p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f39381q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c61.l7 f39382r;

    /* renamed from: s, reason: collision with root package name */
    public int f39383s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(c61.l7 l7Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f39382r = l7Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f39381q = obj;
        this.f39383s |= Integer.MIN_VALUE;
        return this.f39382r.Hj(0L, null, 0, 0L, null, null, null, false, null, this);
    }
}
