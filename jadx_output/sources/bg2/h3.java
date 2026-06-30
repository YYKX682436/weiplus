package bg2;

/* loaded from: classes2.dex */
public final class h3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f20129d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f20130e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f20131f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f20132g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bg2.z3 f20133h;

    /* renamed from: i, reason: collision with root package name */
    public int f20134i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(bg2.z3 z3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f20133h = z3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f20132g = obj;
        this.f20134i |= Integer.MIN_VALUE;
        return bg2.z3.Y6(this.f20133h, null, null, this);
    }
}
