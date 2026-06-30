package c13;

/* loaded from: classes11.dex */
public final class u extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f37922d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f37923e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f37924f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f37925g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c13.b0 f37926h;

    /* renamed from: i, reason: collision with root package name */
    public int f37927i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(c13.b0 b0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f37926h = b0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f37925g = obj;
        this.f37927i |= Integer.MIN_VALUE;
        return c13.b0.b(this.f37926h, null, false, this);
    }
}
