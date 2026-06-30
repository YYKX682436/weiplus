package a82;

/* loaded from: classes11.dex */
public final class r1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f2153d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f2154e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f2155f;

    /* renamed from: g, reason: collision with root package name */
    public int f2156g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f2157h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a82.u1 f2158i;

    /* renamed from: m, reason: collision with root package name */
    public int f2159m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(a82.u1 u1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f2158i = u1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f2157h = obj;
        this.f2159m |= Integer.MIN_VALUE;
        return a82.u1.wi(this.f2158i, null, this);
    }
}
