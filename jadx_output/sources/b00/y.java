package b00;

/* loaded from: classes9.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b00.a0 f16792d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f16793e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f16794f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(b00.a0 a0Var, java.lang.String str, java.util.Map map) {
        super(1);
        this.f16792d = a0Var;
        this.f16793e = str;
        this.f16794f = map;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return this.f16792d.Ri(this.f16793e, this.f16794f);
    }
}
