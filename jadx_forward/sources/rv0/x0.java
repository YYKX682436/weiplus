package rv0;

/* loaded from: classes5.dex */
public final class x0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f481853d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481854e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(ex0.a0 a0Var, rv0.n1 n1Var) {
        super(1);
        this.f481853d = a0Var;
        this.f481854e = n1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID = (com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        ex0.a0 a0Var = this.f481853d;
        ex0.r K = a0Var.K(segmentID);
        if (K != null) {
            ex0.i0.m(a0Var);
            ex0.i0.k(a0Var, K);
            rv0.n1 n1Var = this.f481854e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(n1Var, "<this>");
            ex0.a0 s76 = n1Var.s7();
            if (s76 != null) {
                ex0.a0 s77 = n1Var.s7();
                ex0.r n17 = s77 != null ? s77.n() : null;
                ex0.j0 j0Var = n17 instanceof ex0.j0 ? (ex0.j0) n17 : null;
                if (j0Var != null && n1Var.f481670y == null) {
                    zv0.f0 f0Var = new zv0.f0(n1Var.m80379x76847179(), j0Var);
                    n1Var.f481670y = f0Var;
                    n1Var.p7().o7(s76.u(j0Var), true);
                    n1Var.p7().D = 1;
                    f0Var.m179700xe19ba6a5(zv0.b.f557688d);
                    f0Var.m179702x3b5c3ad1(new zv0.d(f0Var, n1Var, s76, j0Var));
                    f0Var.m179699x764419fc(new zv0.f(f0Var, n1Var));
                    f0Var.m179701xb49d56ad(new zv0.h(n1Var, s76));
                    f0Var.m47074x209a1f1f(java.lang.Boolean.TRUE);
                    f0Var.H();
                    p3325xe03a0797.p3326xc267989b.l.d(n1Var.m158345xefc66565(), null, null, new zv0.i(n1Var, j0Var.r(), j0Var, f0Var, null), 3, null);
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
                    java.util.Iterator it = ((java.util.ArrayList) s76.f338630g.f338714i).iterator();
                    while (it.hasNext()) {
                        ex0.j0 j0Var2 = (ex0.j0) it.next();
                        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = j0Var2.f338701b;
                        java.lang.String r17 = j0Var2.r();
                        if (r17 == null) {
                            r17 = "Blank";
                        }
                        concurrentHashMap.put(c3971x241f78, r17);
                    }
                    f0Var.I(new zv0.j(f0Var, n1Var), new zv0.l(f0Var, concurrentHashMap, n1Var, s76));
                    f0Var.m47073x32851f53(new zv0.m(f0Var, n1Var));
                    n1Var.g7(f0Var);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
