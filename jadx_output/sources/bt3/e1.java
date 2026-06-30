package bt3;

/* loaded from: classes9.dex */
public final class e1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f24232d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f24233e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f24234f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f24235g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f24236h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f24237i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f24238m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Object f24239n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Object f24240o;

    /* renamed from: p, reason: collision with root package name */
    public int f24241p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f24242q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ bt3.h1 f24243r;

    /* renamed from: s, reason: collision with root package name */
    public int f24244s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(bt3.h1 h1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f24243r = h1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f24242q = obj;
        this.f24244s |= Integer.MIN_VALUE;
        return this.f24243r.X6(null, this);
    }
}
