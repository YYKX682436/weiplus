package bp1;

/* loaded from: classes11.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f23030d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f23031e;

    /* renamed from: f, reason: collision with root package name */
    public int f23032f;

    /* renamed from: g, reason: collision with root package name */
    public int f23033g;

    /* renamed from: h, reason: collision with root package name */
    public int f23034h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f23035i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ bp1.d f23036m;

    /* renamed from: n, reason: collision with root package name */
    public int f23037n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(bp1.d dVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f23036m = dVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f23035i = obj;
        this.f23037n |= Integer.MIN_VALUE;
        return this.f23036m.a(null, this);
    }
}
