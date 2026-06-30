package dk2;

/* loaded from: classes3.dex */
public final class h6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.k6 f315099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ os5.n f315100e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(dk2.k6 k6Var, os5.n nVar) {
        super(0);
        this.f315099d = k6Var;
        this.f315100e = nVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        dk2.k6 k6Var = this.f315099d;
        java.util.List list = k6Var.f315216a;
        os5.n nVar = this.f315100e;
        if (!list.contains(nVar)) {
            k6Var.f315216a.add(nVar);
        }
        return jz5.f0.f384359a;
    }
}
