package cj5;

/* loaded from: classes.dex */
public final class r2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wi5.n0 f42227d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(wi5.n0 n0Var) {
        super(1);
        this.f42227d = n0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.ArrayList<ri5.j> it = (java.util.ArrayList) obj;
        kotlin.jvm.internal.o.g(it, "it");
        for (ri5.j jVar : it) {
            java.lang.String str = jVar.f396111f;
            wi5.n0 n0Var = this.f42227d;
            jVar.f396126w = n0Var.f(str);
            java.lang.String str2 = jVar.f396111f;
            boolean d17 = n0Var.d(str2);
            jVar.f396125v = d17;
            jVar.f396115l1 = !d17 && n0Var.e(str2);
        }
        return jz5.f0.f302826a;
    }
}
