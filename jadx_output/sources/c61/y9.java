package c61;

/* loaded from: classes11.dex */
public final class y9 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f39432d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f39433e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f39434f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f39435g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f39436h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c61.da f39437i;

    /* renamed from: m, reason: collision with root package name */
    public int f39438m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(c61.da daVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f39437i = daVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f39436h = obj;
        this.f39438m |= Integer.MIN_VALUE;
        return c61.da.a(this.f39437i, null, false, this);
    }
}
