package ah3;

/* loaded from: classes12.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f4891d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f4892e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f4893f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f4894g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f4895h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f4896i;

    /* renamed from: m, reason: collision with root package name */
    public int f4897m;

    /* renamed from: n, reason: collision with root package name */
    public int f4898n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4899o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ah3.m f4900p;

    /* renamed from: q, reason: collision with root package name */
    public int f4901q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ah3.m mVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f4900p = mVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f4899o = obj;
        this.f4901q |= Integer.MIN_VALUE;
        return this.f4900p.e(null, null, this);
    }
}
