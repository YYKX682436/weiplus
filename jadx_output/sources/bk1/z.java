package bk1;

/* loaded from: classes4.dex */
public final class z extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f21362d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f21363e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bk1.e0 f21364f;

    /* renamed from: g, reason: collision with root package name */
    public int f21365g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(bk1.e0 e0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f21364f = e0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f21363e = obj;
        this.f21365g |= Integer.MIN_VALUE;
        return this.f21364f.a(0, this);
    }
}
