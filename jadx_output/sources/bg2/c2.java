package bg2;

/* loaded from: classes3.dex */
public final class c2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f19960d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f19961e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f19962f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f19963g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f19964h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f19965i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f19966m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Object f19967n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Object f19968o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Object f19969p;

    /* renamed from: q, reason: collision with root package name */
    public long f19970q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f19971r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ bg2.d2 f19972s;

    /* renamed from: t, reason: collision with root package name */
    public int f19973t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(bg2.d2 d2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f19972s = d2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f19971r = obj;
        this.f19973t |= Integer.MIN_VALUE;
        return bg2.d2.Y6(this.f19972s, null, null, null, null, null, null, null, this);
    }
}
