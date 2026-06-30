package pi0;

/* loaded from: classes11.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pi0.m1 f436216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f436217e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(pi0.m1 m1Var, yz5.l lVar) {
        super(1);
        this.f436216d = m1Var;
        this.f436217e = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        pi0.u0 it = (pi0.u0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        pi0.m1 m1Var = this.f436216d;
        sb6.append(m1Var.f436198a);
        sb6.append('/');
        sb6.append(m1Var.f436200c);
        it.f436267e = sb6.toString();
        yz5.l lVar = this.f436217e;
        if (lVar != null) {
            lVar.mo146xb9724478(it);
        }
        pi0.r.f436250a.b(it);
        return jz5.f0.f384359a;
    }
}
