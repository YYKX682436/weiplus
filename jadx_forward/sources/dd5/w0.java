package dd5;

/* loaded from: classes9.dex */
public final class w0 extends uc5.b0 {

    /* renamed from: p, reason: collision with root package name */
    public static final dd5.w0 f310856p = new dd5.w0();

    public w0() {
        super(dd5.z0.f310886b.f508072a);
    }

    @Override // uc5.n
    public void s(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.a2 binding = (em.a2) obj;
        dd5.y0 y0Var = (dd5.y0) r0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        if (y0Var == null) {
            return;
        }
        android.widget.TextView d17 = binding.d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getTitleTv(...)");
        z(d17, context, y0Var.f310873a);
        android.widget.TextView b17 = binding.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getDescTv(...)");
        z(b17, context, y0Var.f310876d);
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d a17 = g1Var.a();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2666x4fe3eeaf.C21832xcd3ee688 c17 = binding.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getIconIv(...)");
        a17.c(y0Var.f310874b, c17, g1Var.h(mn2.f1.f411495p));
    }

    @Override // uc5.n
    public void u(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.a2 binding = (em.a2) obj;
        dd5.y0 y0Var = (dd5.y0) r0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        if (y0Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = y0Var.f310877e;
        java.lang.String U1 = f9Var.U1();
        if (!(!(U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null) {
            return;
        }
        v05.b bVar = new v05.b();
        bVar.m126728xdc93280d(U1);
        x05.c cVar = (x05.c) bVar.m75936x14adae67(bVar.f513848e + 57);
        if (cVar == null) {
            return;
        }
        java.lang.String m174810x6c03c64c = cVar.m174810x6c03c64c();
        if (m174810x6c03c64c == null || r26.n0.N(m174810x6c03c64c)) {
            return;
        }
        boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0());
        android.content.Intent intent = new android.content.Intent();
        if (R4) {
            intent.putExtra("key_finder_teen_mode_scene", 2);
            intent.putExtra("report_scene", 2);
        } else {
            intent.putExtra("key_finder_teen_mode_scene", 1);
            intent.putExtra("report_scene", 1);
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(R4 ? 3 : 2, 3, 32, intent);
        intent.putExtra("key_enter_profile_type", 4);
        intent.putExtra("key_entrance_type", 0);
        intent.putExtra("key_from_comment_scene", 11);
        intent.putExtra("from_user", f9Var.Q0());
        intent.putExtra("key_to_user_name", f9Var.Q0());
        intent.putExtra("finder_username", cVar.m174810x6c03c64c());
        intent.putExtra("key_ec_source", cVar.n());
        intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
        intent.putExtra("key_finder_teen_mode_check", true);
        intent.putExtra("key_finder_teen_mode_user_name", cVar.m174809x8010e5e4());
        intent.putExtra("key_finder_teen_mode_user_id", cVar.m174810x6c03c64c());
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1.f542005a.w(context, intent);
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
        x05.c cVar = (x05.c) bVar.m75936x14adae67(bVar.f513848e + 57);
        if (cVar == null) {
            return null;
        }
        java.lang.String m174809x8010e5e4 = cVar.m174809x8010e5e4();
        java.lang.String str = m174809x8010e5e4 == null ? "" : m174809x8010e5e4;
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        mn2.h3 e17 = ya2.l.f542035a.e(cVar.l(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f);
        java.lang.String m174810x6c03c64c = cVar.m174810x6c03c64c();
        java.lang.String str2 = m174810x6c03c64c == null ? "" : m174810x6c03c64c;
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571971v1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return new dd5.y0(str, e17, str2, r26.n0.a0(string, "[", "]"), f9Var);
    }
}
