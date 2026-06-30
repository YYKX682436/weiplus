package en5;

/* loaded from: classes14.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f337046d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c1.k f337047e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(fn5.n0 n0Var, c1.k kVar) {
        super(1);
        this.f337046d = n0Var;
        this.f337047e = kVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        aq.v0 it = (aq.v0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        f65.p.f341467a.b(7);
        f65.o oVar = f65.o.f341445a;
        oVar.c(56);
        oVar.c(57);
        fn5.n0 n0Var = this.f337046d;
        java.lang.String str = it.f94519a;
        n0Var.P6(str, it.f94520b);
        f65.p.f341479m = 3;
        java.lang.String sessionId = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        f65.p.f341478l = sessionId;
        f65.p.f341482p = str;
        oVar.f();
        oVar.e(str);
        f65.o.f341455k = 2;
        oVar.c(52);
        c1.j.a(this.f337047e, false, 1, null);
        return jz5.f0.f384359a;
    }
}
