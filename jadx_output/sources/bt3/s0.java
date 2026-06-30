package bt3;

/* loaded from: classes9.dex */
public final class s0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f24390d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f24391e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f24392f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f24393g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f24394h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f24395i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f24396m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ bt3.y0 f24397n;

    /* renamed from: o, reason: collision with root package name */
    public int f24398o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(bt3.y0 y0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f24397n = y0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f24396m = obj;
        this.f24398o |= Integer.MIN_VALUE;
        return this.f24397n.U6(null, null, null, this);
    }
}
