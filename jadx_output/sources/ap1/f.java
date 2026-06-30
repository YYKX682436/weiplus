package ap1;

/* loaded from: classes5.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f12652d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f12653e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f12654f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f12655g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f12656h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f12657i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ap1.g f12658m;

    /* renamed from: n, reason: collision with root package name */
    public int f12659n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ap1.g gVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f12658m = gVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f12657i = obj;
        this.f12659n |= Integer.MIN_VALUE;
        return this.f12658m.T6(this);
    }
}
