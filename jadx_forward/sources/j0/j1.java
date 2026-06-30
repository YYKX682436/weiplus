package j0;

/* loaded from: classes14.dex */
public final class j1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.t f377906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k0.y0 f377907e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f377908f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f377909g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(z0.t tVar, k0.y0 y0Var, yz5.p pVar, int i17) {
        super(2);
        this.f377906d = tVar;
        this.f377907e = y0Var;
        this.f377908f = pVar;
        this.f377909g = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f377909g | 1;
        k0.y0 y0Var = this.f377907e;
        yz5.p pVar = this.f377908f;
        j0.p1.b(this.f377906d, y0Var, pVar, (n0.o) obj, i17);
        return jz5.f0.f384359a;
    }
}
