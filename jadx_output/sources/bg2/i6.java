package bg2;

/* loaded from: classes2.dex */
public final class i6 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f20169d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f20170e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f20171f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f20172g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bg2.q6 f20173h;

    /* renamed from: i, reason: collision with root package name */
    public int f20174i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(bg2.q6 q6Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f20173h = q6Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f20172g = obj;
        this.f20174i |= Integer.MIN_VALUE;
        return bg2.q6.a7(this.f20173h, this);
    }
}
