package wj2;

/* loaded from: classes3.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km2.q f528177d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wj2.c0 f528178e;

    public a0(km2.q qVar, wj2.c0 c0Var) {
        this.f528177d = qVar;
        this.f528178e = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        km2.q qVar = this.f528177d;
        java.lang.String str = qVar.f390717o;
        mn2.g1 g1Var = mn2.g1.f411508a;
        wj2.c0 c0Var = this.f528178e;
        if (str != null) {
            if (!(str.length() > 0)) {
                str = null;
            }
            if (str != null) {
                c0Var.m173966x42ee73cf().setVisibility(0);
                g1Var.e().c(new mn2.j0(str), c0Var.m173966x42ee73cf(), g1Var.h(mn2.f1.f411499t));
                return;
            }
        }
        r45.ba4 ba4Var = qVar.f390723u;
        if (ba4Var != null) {
            zl2.r4 r4Var = zl2.r4.f555483a;
            if (!r4Var.l2(ba4Var)) {
                ba4Var = null;
            }
            if (ba4Var != null) {
                c0Var.m173966x42ee73cf().setVisibility(0);
                java.lang.String b17 = r4Var.b1(ba4Var);
                java.lang.String str2 = b17.length() > 0 ? b17 : null;
                if (str2 != null) {
                    g1Var.e().c(new mn2.j0(str2), c0Var.m173966x42ee73cf(), g1Var.h(mn2.f1.f411499t));
                }
            }
        }
    }
}
