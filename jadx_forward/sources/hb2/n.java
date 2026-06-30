package hb2;

/* loaded from: classes2.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final hb2.n f361605d = new hb2.n();

    public n() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.y31 y31Var;
        java.util.LinkedList m75941xfb821914;
        int a17 = hc2.d0.a(hc2.d0.d(4));
        bu2.d0 d0Var = bu2.e0.f106031a;
        d0Var.l(a17);
        java.util.LinkedList m75941xfb8219142 = bu2.e0.f106035e.a(a17).f106026c.m75941xfb821914(0);
        if (m75941xfb8219142 != null && (y31Var = (r45.y31) kz5.n0.a0(m75941xfb8219142, 0)) != null && (m75941xfb821914 = y31Var.m75941xfb821914(0)) != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
            pm0.v.d0(m75941xfb821914, new bu2.x(7, c0Var));
            if (c0Var.f391645d) {
                d0Var.b(bu2.e0.f106035e.a(a17));
            }
        }
        pf5.u uVar = pf5.u.f435469a;
        java.util.List list = ((ey2.t0) uVar.e(c61.l7.class).a(ey2.t0.class)).N6(4).f338976c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-lastDataList>(...)");
        if (pm0.v.c0(list, hb2.m.f361603d)) {
            hb2.q.f361615e.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hb2.q.f361616f, "clean lastExitPosition");
            ((ey2.t0) uVar.e(c61.l7.class).a(ey2.t0.class)).N6(4).f338978e = 0;
        }
        return jz5.f0.f384359a;
    }
}
