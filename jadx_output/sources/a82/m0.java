package a82;

/* loaded from: classes12.dex */
public final class m0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f2074d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f2075e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f2076f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f2077g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f2078h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a82.n0 f2079i;

    /* renamed from: m, reason: collision with root package name */
    public int f2080m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(a82.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f2079i = n0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f2078h = obj;
        this.f2080m |= Integer.MIN_VALUE;
        return this.f2079i.b7(null, null, null, this);
    }
}
