package c1;

/* loaded from: classes3.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f119257d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f119258e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(n0.v2 v2Var, yz5.l lVar) {
        super(1);
        this.f119257d = v2Var;
        this.f119258e = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        c1.i0 it = (c1.i0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        n0.v2 v2Var = this.f119257d;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(v2Var.mo128745x754a37bb(), it)) {
            v2Var.mo148714x53d8522f(it);
            this.f119258e.mo146xb9724478(it);
        }
        return jz5.f0.f384359a;
    }
}
