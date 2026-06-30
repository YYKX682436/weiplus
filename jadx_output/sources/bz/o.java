package bz;

/* loaded from: classes10.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f36689d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f36690e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f36691f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f36692g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bz.w f36693h;

    /* renamed from: i, reason: collision with root package name */
    public int f36694i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(bz.w wVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f36693h = wVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f36692g = obj;
        this.f36694i |= Integer.MIN_VALUE;
        return this.f36693h.f(null, this);
    }
}
