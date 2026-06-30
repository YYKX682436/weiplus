package b03;

/* loaded from: classes11.dex */
public final class n extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f16850d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f16851e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f16852f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f16853g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f16854h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16855i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16856m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ b03.u f16857n;

    /* renamed from: o, reason: collision with root package name */
    public int f16858o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(b03.u uVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f16857n = uVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f16856m = obj;
        this.f16858o |= Integer.MIN_VALUE;
        return this.f16857n.a(null, null, null, false, null, this);
    }
}
