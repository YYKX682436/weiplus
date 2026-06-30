package q14;

/* loaded from: classes5.dex */
public final class b implements al5.w4 {

    /* renamed from: a, reason: collision with root package name */
    public static final q14.b f441221a = new q14.b();

    @Override // al5.w4
    /* renamed from: onStatusChange */
    public final void mo2319xd6191dc1(boolean z17) {
        if (z17) {
            js.r0 r0Var = (js.r0) i95.n0.c(js.r0.class);
            js.a aVar = js.a.WCAccountLogoutEntry_NO_PWD;
            is.f fVar = (is.f) r0Var;
            fVar.getClass();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Ui = fVar.Ui();
            if (Ui != null) {
                Ui.A(fVar.Ni(aVar), Integer.MAX_VALUE);
            }
        }
        boolean Ri = ((is.f) ((js.r0) i95.n0.c(js.r0.class))).Ri();
        ((is.f) ((js.r0) i95.n0.c(js.r0.class))).getClass();
        java.lang.String r17 = c01.z1.r();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccountInfoService", "setNoPwdPermissionStatus[%b]， curUserName[%s]", java.lang.Boolean.valueOf(z17), r17);
        c01.uc.f119047c.h(r17, "last_logout_no_pwd_permission_status", z17 ? "1" : "0");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("switch_one_clk_login_status", "view_clk", kz5.c1.k(new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030, wo.w0.k()), new jz5.l("switch_status_after", java.lang.Integer.valueOf(z17 ? 1 : 0)), new jz5.l("switch_status_before", java.lang.Integer.valueOf(Ri ? 1 : 0))), 34575);
    }
}
