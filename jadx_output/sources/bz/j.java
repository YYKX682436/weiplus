package bz;

/* loaded from: classes10.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f36629d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f36630e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f36631f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f36632g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f36633h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f36634i;

    /* renamed from: m, reason: collision with root package name */
    public int f36635m;

    /* renamed from: n, reason: collision with root package name */
    public int f36636n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f36637o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ bz.w f36638p;

    /* renamed from: q, reason: collision with root package name */
    public int f36639q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(bz.w wVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f36638p = wVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f36637o = obj;
        this.f36639q |= Integer.MIN_VALUE;
        return bz.w.a(this.f36638p, null, null, 0, 0, null, false, null, this);
    }
}
