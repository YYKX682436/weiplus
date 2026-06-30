package dd5;

/* loaded from: classes9.dex */
public final class t0 extends dd5.u1 {

    /* renamed from: p, reason: collision with root package name */
    public static final dd5.t0 f310822p = new dd5.t0();

    public t0() {
        super(dd5.v0.f310839b.f508072a);
    }

    @Override // uc5.n
    public void u(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.a2 binding = (em.a2) obj;
        dd5.v1 v1Var = (dd5.v1) r0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        if (v1Var == null) {
            return;
        }
        java.lang.String U1 = v1Var.f310848f.U1();
        if (!(true ^ (U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null) {
            return;
        }
        v05.b bVar = new v05.b();
        bVar.m126728xdc93280d(U1);
        s15.m mVar = (s15.m) bVar.m75936x14adae67(bVar.f513848e + 71);
        if (mVar == null) {
            return;
        }
        r45.ev2 a17 = yu.m.a(mVar);
        int m75939xb282bd08 = bVar.m75939xb282bd08(bVar.f449898d + 6);
        ya2.e1 e1Var = ya2.e1.f542005a;
        if (m75939xb282bd08 == 119) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            e1Var.u(context, a17, 6);
        } else {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            e1Var.n(context, a17, 6);
        }
    }

    @Override // dd5.u1, uc5.n
    public java.lang.Object w(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.String U1 = f9Var.U1();
        if (!(true ^ (U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null) {
            return null;
        }
        v05.b bVar = new v05.b();
        bVar.m126728xdc93280d(U1);
        s15.m mVar = (s15.m) bVar.m75936x14adae67(bVar.f513848e + 71);
        if (mVar == null) {
            return null;
        }
        java.lang.String m163611x7531c8a2 = mVar.m163611x7531c8a2();
        android.content.res.Resources resources = context.getResources();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.k.f283299f.getClass();
        java.lang.String string = resources.getString(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.k.f283300g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return new dd5.v1(m163611x7531c8a2, string, mVar.m163610xd93f812f(), bVar.m75945x2fec8307(bVar.f449898d + 0), false, f9Var);
    }
}
