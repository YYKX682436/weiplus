package dd5;

/* loaded from: classes9.dex */
public final class m2 extends uc5.b0 {

    /* renamed from: p, reason: collision with root package name */
    public static final dd5.m2 f310754p = new dd5.m2();

    public m2() {
        super(dd5.p2.f310780b.f508072a);
    }

    @Override // uc5.n
    public void s(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.a2 binding = (em.a2) obj;
        dd5.o2 o2Var = (dd5.o2) r0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        if (o2Var == null) {
            return;
        }
        android.widget.TextView d17 = binding.d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getTitleTv(...)");
        z(d17, context, o2Var.f310770a);
        android.widget.TextView b17 = binding.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getDescTv(...)");
        z(b17, context, o2Var.f310771b);
        java.lang.String str = o2Var.f310772c;
        if (str.length() > 0) {
            ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).bj(str, binding.c(), null);
        } else {
            A(context, binding, com.p314xaae8f345.mm.R.raw.f80699x4a9ebf82);
        }
    }

    @Override // uc5.n
    public void u(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.a2 binding = (em.a2) obj;
        dd5.o2 o2Var = (dd5.o2) r0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        if (o2Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = o2Var.f310773d;
        ot0.q v17 = ot0.q.v(f9Var.j());
        if (v17 == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.o6.f283598a.c(v17, f9Var);
    }

    @Override // uc5.n
    public java.lang.Object w(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ot0.q v17;
        il4.a aVar;
        java.lang.String U1 = f9Var.U1();
        if (!(true ^ (U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null || (v17 = ot0.q.v(U1)) == null || v17.f430199i != 93 || (aVar = (il4.a) v17.y(il4.a.class)) == null) {
            return null;
        }
        r45.lm6 a17 = il4.d.a(context, aVar, v17, f9Var);
        java.lang.String str = a17.f461170d;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = a17.f461171e;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = a17.f461172f;
        return new dd5.o2(str, str2, str3 != null ? str3 : "", f9Var);
    }
}
