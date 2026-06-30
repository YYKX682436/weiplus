package a6;

/* loaded from: classes14.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f1659d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f1660e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f1661f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a6.l f1662g;

    /* renamed from: h, reason: collision with root package name */
    public int f1663h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(a6.l lVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f1662g = lVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f1661f = obj;
        this.f1663h |= Integer.MIN_VALUE;
        return this.f1662g.e(null, this);
    }
}
