package rv0;

/* loaded from: classes5.dex */
public final class z implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481879d;

    public z(rv0.n1 n1Var) {
        this.f481879d = n1Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        ex0.a0 s76;
        zv0.h0 h0Var = (zv0.h0) obj;
        rv0.n1 n1Var = this.f481879d;
        zv0.f0 f0Var = n1Var.f481670y;
        if (f0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h0Var);
            f0Var.m179704x7374c706(h0Var);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h0Var);
        zv0.n0 n0Var = h0Var.f557716c;
        if (((n0Var instanceof zv0.m0) || (n0Var instanceof zv0.l0)) && (s76 = n1Var.s7()) != null) {
            zv0.r rVar = (zv0.r) kz5.n0.a0(h0Var.f557714a, h0Var.f557715b.f557711b);
            if (zu0.i.f557209f == (rVar != null ? rVar.f557755b : null)) {
                ex0.r n76 = n1Var.n7();
                ex0.j0 j0Var = n76 instanceof ex0.j0 ? (ex0.j0) n76 : null;
                if (j0Var == null) {
                    return;
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j0Var.r(), rVar.f557754a.f129757b)) {
                    com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 u17 = s76.u(j0Var);
                    n1Var.p7().o7(u17, true);
                    n1Var.p7().D = 1;
                    p3325xe03a0797.p3326xc267989b.l.d(n1Var.m158345xefc66565(), null, null, new zv0.n(n1Var, u17, null), 3, null);
                    return;
                }
                com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2 c4104x6d422cb2 = rVar.f557754a;
                java.lang.String str = c4104x6d422cb2.f129757b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getMaterialID(...)");
                if (s76.d(j0Var, str)) {
                    zv0.f0 f0Var2 = n1Var.f481670y;
                    if (f0Var2 != null) {
                        f0Var2.m179703xd5763a20(rVar);
                    }
                    java.lang.String str2 = c4104x6d422cb2.f129757b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getMaterialID(...)");
                    ex0.r n17 = s76.n();
                    ex0.j0 j0Var2 = n17 instanceof ex0.j0 ? (ex0.j0) n17 : null;
                    if (j0Var2 != null) {
                        s76.x(j0Var2, str2);
                        s76.J(cx0.d.f306043f.a(cx0.d.f306042e), null);
                    }
                    com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 u18 = s76.u(j0Var);
                    n1Var.p7().o7(u18, true);
                    n1Var.p7().D = 1;
                    p3325xe03a0797.p3326xc267989b.l.d(n1Var.m158345xefc66565(), null, null, new zv0.o(n1Var, u18, null), 3, null);
                }
            }
        }
    }
}
