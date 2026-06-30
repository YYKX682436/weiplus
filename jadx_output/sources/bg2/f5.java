package bg2;

/* loaded from: classes2.dex */
public final class f5 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f20083d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f20084e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f20085f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bg2.j5 f20086g;

    /* renamed from: h, reason: collision with root package name */
    public int f20087h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(bg2.j5 j5Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f20086g = j5Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f20085f = obj;
        this.f20087h |= Integer.MIN_VALUE;
        return bg2.j5.Z6(this.f20086g, null, 0L, this);
    }
}
