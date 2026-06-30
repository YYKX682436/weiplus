package dd5;

/* loaded from: classes9.dex */
public final class x1 extends dd5.u1 {

    /* renamed from: p, reason: collision with root package name */
    public static final dd5.x1 f310867p = new dd5.x1();

    public x1() {
        super(dd5.z1.f310890b.f508072a);
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
        z05.c cVar = (z05.c) bVar.m75936x14adae67(bVar.f513848e + 64);
        q80.d0 d0Var = new q80.d0();
        if (cVar != null) {
            d0Var.f442182a = bVar.m75945x2fec8307(bVar.f449898d + 0);
            d0Var.f442183b = cVar.m178294xfb83cc9b();
            d0Var.f442184c = cVar.p();
            d0Var.f442187f = cVar.n();
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(context, d0Var, new dd5.w1(d0Var));
    }
}
