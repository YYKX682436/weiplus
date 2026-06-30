package by0;

/* loaded from: classes5.dex */
public final class l extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f36335d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f36336e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ by0.n f36337f;

    /* renamed from: g, reason: collision with root package name */
    public int f36338g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(by0.n nVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f36337f = nVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f36336e = obj;
        this.f36338g |= Integer.MIN_VALUE;
        return this.f36337f.a(this);
    }
}
