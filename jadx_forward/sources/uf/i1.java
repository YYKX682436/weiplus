package uf;

/* loaded from: classes7.dex */
public final class i1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf.o1 f508568d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(uf.o1 o1Var) {
        super(1);
        this.f508568d = o1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        uf.h2 resp = (uf.h2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        boolean z17 = resp.f508563a;
        uf.o1 o1Var = this.f508568d;
        if (!z17 && uf.b.f508507g == o1Var.r()) {
            o1Var.s(uf.b.f508506f);
        }
        o1Var.q().c(-1, null);
        return jz5.f0.f384359a;
    }
}
