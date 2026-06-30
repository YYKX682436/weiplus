package a6;

/* loaded from: classes14.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f1654d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f1655e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f1656f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a6.l f1657g;

    /* renamed from: h, reason: collision with root package name */
    public int f1658h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a6.l lVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f1657g = lVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f1656f = obj;
        this.f1658h |= Integer.MIN_VALUE;
        return this.f1657g.b(null, this);
    }
}
