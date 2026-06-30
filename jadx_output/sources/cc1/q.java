package cc1;

/* loaded from: classes7.dex */
public final class q extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f40449d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f40450e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f40451f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f40452g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ cc1.r f40453h;

    /* renamed from: i, reason: collision with root package name */
    public int f40454i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(cc1.r rVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f40453h = rVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f40452g = obj;
        this.f40454i |= Integer.MIN_VALUE;
        return this.f40453h.C(null, null, this);
    }
}
