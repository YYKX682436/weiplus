package bt3;

/* loaded from: classes9.dex */
public final class g1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f24272d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f24273e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f24274f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f24275g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bt3.h1 f24276h;

    /* renamed from: i, reason: collision with root package name */
    public int f24277i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(bt3.h1 h1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f24276h = h1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f24275g = obj;
        this.f24277i |= Integer.MIN_VALUE;
        return this.f24276h.Z6(null, this);
    }
}
