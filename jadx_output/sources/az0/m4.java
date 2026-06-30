package az0;

/* loaded from: classes5.dex */
public final class m4 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f15694d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f15695e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f15696f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f15697g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f15698h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f15699i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ az0.i5 f15700m;

    /* renamed from: n, reason: collision with root package name */
    public int f15701n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(az0.i5 i5Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f15700m = i5Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f15699i = obj;
        this.f15701n |= Integer.MIN_VALUE;
        return this.f15700m.n(null, this);
    }
}
