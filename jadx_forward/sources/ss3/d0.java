package ss3;

@j95.b
/* loaded from: classes5.dex */
public class d0 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public c01.ua f493533d;

    public static void Ai(ss3.c0 c0Var) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new ss3.z(c0Var));
    }

    public static void Bi(java.util.List list, int i17) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i18 = 0; i18 < list.size(); i18++) {
            java.lang.String b17 = tv.a.b(((c01.ta) list.get(i18)).c());
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(b17));
                if (r6Var.m() && !r6Var.y()) {
                    r6Var.l();
                }
            }
        }
    }

    public static c01.ua Di() {
        gm0.j1.b().c();
        if (((ss3.d0) i95.n0.c(ss3.d0.class)).f493533d == null) {
            ((ss3.d0) i95.n0.c(ss3.d0.class)).f493533d = new c01.ua(gm0.j1.u().f354686f);
        }
        return ((ss3.d0) i95.n0.c(ss3.d0.class)).f493533d;
    }

    public static void wi(ss3.c0 c0Var) {
        Di().m0(20);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().k("newsapp");
        if (gm0.j1.a()) {
            gm0.j1.e().j(new ss3.a0(c0Var, 20));
        } else {
            Ai(c0Var);
        }
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        gm0.j1.e().j(new ss3.b0(this));
    }
}
