package co5;

/* loaded from: classes11.dex */
public final class l extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f43857d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f43858e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f43859f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ co5.p f43860g;

    /* renamed from: h, reason: collision with root package name */
    public int f43861h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(co5.p pVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f43860g = pVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f43859f = obj;
        this.f43861h |= Integer.MIN_VALUE;
        return this.f43860g.Bi(null, this);
    }
}
