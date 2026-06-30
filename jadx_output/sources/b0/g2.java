package b0;

/* loaded from: classes14.dex */
public final class g2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f16295d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16296e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0.h2 f16297f;

    /* renamed from: g, reason: collision with root package name */
    public int f16298g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(b0.h2 h2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f16297f = h2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f16296e = obj;
        this.f16298g |= Integer.MIN_VALUE;
        return this.f16297f.b(this);
    }
}
