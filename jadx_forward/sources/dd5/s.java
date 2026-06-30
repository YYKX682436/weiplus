package dd5;

/* loaded from: classes9.dex */
public final class s extends uc5.b0 {

    /* renamed from: p, reason: collision with root package name */
    public static final dd5.s f310811p = new dd5.s();

    public s() {
        super(dd5.v.f310835b.f508072a);
    }

    @Override // uc5.n
    public void s(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.a2 binding = (em.a2) obj;
        dd5.u uVar = (dd5.u) r0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        if (uVar == null) {
            return;
        }
        android.widget.TextView d17 = binding.d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getTitleTv(...)");
        z(d17, context, uVar.f310828a);
        android.widget.TextView b17 = binding.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getDescTv(...)");
        z(b17, context, uVar.f310829b);
        java.lang.String str = uVar.f310830c;
        if (!(!r26.n0.N(str))) {
            A(context, binding, com.p314xaae8f345.mm.R.raw.f80478xe39dc57);
            return;
        }
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d g17 = g1Var.g();
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        mn2.h3 e17 = ya2.l.f542035a.e(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2666x4fe3eeaf.C21832xcd3ee688 c17 = binding.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getIconIv(...)");
        g17.c(e17, c17, g1Var.h(mn2.f1.f411495p));
    }

    @Override // uc5.n
    public void u(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.a2 binding = (em.a2) obj;
        dd5.u uVar = (dd5.u) r0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        if (uVar == null) {
            return;
        }
        c00.z2 z2Var = (c00.z2) i95.n0.c(c00.z2.class);
        ((b00.r) z2Var).pj(context, uVar.f310831d, uVar.f310832e, bw5.x8.ECS_REQ_SCENE_SEARCH);
    }

    @Override // uc5.n
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
        w05.a aVar = (w05.a) bVar.m75936x14adae67(bVar.f513848e + 56);
        if (aVar == null) {
            return null;
        }
        java.lang.String m173054x8010e5e4 = aVar.m173054x8010e5e4();
        java.lang.String str = m173054x8010e5e4 == null ? "" : m173054x8010e5e4;
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nsg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String k17 = aVar.k();
        java.lang.String str2 = k17 == null ? "" : k17;
        java.lang.String Q0 = f9Var.Q0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q0, "getTalker(...)");
        return new dd5.u(str, string, str2, Q0, f9Var);
    }
}
