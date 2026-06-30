package cj5;

/* loaded from: classes.dex */
public final class q2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wi5.n0 f123752d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(wi5.n0 n0Var) {
        super(1);
        this.f123752d = n0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.ArrayList<ri5.j> it = (java.util.ArrayList) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        for (ri5.j jVar : it) {
            java.lang.String str = jVar.f477644f;
            wi5.n0 n0Var = this.f123752d;
            jVar.f477659w = n0Var.f(str);
            java.lang.String str2 = jVar.f477644f;
            boolean d17 = n0Var.d(str2);
            jVar.f477658v = d17;
            jVar.f477648l1 = !d17 && n0Var.e(str2);
        }
        return jz5.f0.f384359a;
    }
}
