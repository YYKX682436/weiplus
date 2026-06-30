package bg2;

/* loaded from: classes3.dex */
public final class w1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f20590d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f20591e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f20592f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f20593g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f20594h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f20595i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ bg2.d2 f20596m;

    /* renamed from: n, reason: collision with root package name */
    public int f20597n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(bg2.d2 d2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f20596m = d2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f20595i = obj;
        this.f20597n |= Integer.MIN_VALUE;
        return this.f20596m.a7(false, null, null, null, null, null, 0, this);
    }
}
