package a0;

/* loaded from: classes14.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e1.p0 f169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e1.r f170e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(e1.p0 p0Var, e1.r rVar) {
        super(1);
        this.f169d = p0Var;
        this.f170e = rVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        g1.f onDrawWithContent = (g1.f) obj;
        kotlin.jvm.internal.o.g(onDrawWithContent, "$this$onDrawWithContent");
        ((u1.o0) onDrawWithContent).b();
        g1.h.f(onDrawWithContent, this.f169d, this.f170e, 0.0f, null, null, 0, 60, null);
        return jz5.f0.f302826a;
    }
}
