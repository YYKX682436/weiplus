package ez0;

/* loaded from: classes4.dex */
public final class f implements uy0.g {

    /* renamed from: a, reason: collision with root package name */
    public static final ez0.f f339323a = new ez0.f();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2621x8fb0427b.u3 f339324b;

    static {
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MAAS_SHOW_ALBUM_TEMPLATE_TIP_STRING_SYNC;
        f339324b = u3Var;
        if (z65.c.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasActivityTemplateTipServiceImpl", "checkRepairerAutoDeleteStorageDisplayRecord: ");
            if (1 != bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2548x18d5ed17.C20448x1e231a55()) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gm0.j1.u().c().v(u3Var, ""), "")) {
                return;
            }
            gm0.j1.u().c().x(u3Var, "");
            ((ku5.t0) ku5.t0.f394148d).B(ez0.e.f339322d);
        }
    }

    public void a(uy0.n action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("callOnTipActionUpdate: ");
        int i17 = action.f513439d;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasActivityTemplateTipServiceImpl", sb6.toString());
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6714xad247634 c6714xad247634 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6714xad247634();
        c6714xad247634.f140547d = i17;
        c6714xad247634.f140548e = c6714xad247634.b("sessionid_", ((ee0.v4) ((fe0.o4) i95.n0.c(fe0.o4.class))).wi(), true);
        c6714xad247634.k();
    }
}
