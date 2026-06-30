package bg2;

/* loaded from: classes2.dex */
public final class r1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f20444d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f20445e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f20446f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f20447g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f20448h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ bg2.t1 f20449i;

    /* renamed from: m, reason: collision with root package name */
    public int f20450m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(bg2.t1 t1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f20449i = t1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f20448h = obj;
        this.f20450m |= Integer.MIN_VALUE;
        return bg2.t1.Z6(this.f20449i, null, null, null, this);
    }
}
