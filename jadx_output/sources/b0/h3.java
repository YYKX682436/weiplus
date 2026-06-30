package b0;

/* loaded from: classes14.dex */
public final class h3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f16332d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16333e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0.m3 f16334f;

    /* renamed from: g, reason: collision with root package name */
    public int f16335g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(b0.m3 m3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f16334f = m3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f16333e = obj;
        this.f16335g |= Integer.MIN_VALUE;
        return this.f16334f.b(0L, this);
    }
}
