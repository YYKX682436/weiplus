package com.p314xaae8f345.mm.ui.p2649x8f4dc54e;

/* loaded from: classes11.dex */
public class g implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2649x8f4dc54e.ActivityC21598xfb43db0b f279580d;

    public g(com.p314xaae8f345.mm.ui.p2649x8f4dc54e.ActivityC21598xfb43db0b activityC21598xfb43db0b) {
        this.f279580d = activityC21598xfb43db0b;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.ui.p2649x8f4dc54e.ActivityC21598xfb43db0b activityC21598xfb43db0b = this.f279580d;
        if (itemId == 1) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(activityC21598xfb43db0b.f279561o, true);
            if (n17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrandServiceConversationUI", "changed biz stick status failed, contact is null, talker = " + activityC21598xfb43db0b.f279561o);
                return;
            }
            if (n17.w2()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13307, n17.d1(), 1, 2, 2);
                c01.e2.B0(activityC21598xfb43db0b.f279561o, true, true);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13307, n17.d1(), 1, 1, 2);
                c01.e2.t0(activityC21598xfb43db0b.f279561o, true, true);
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5196x9324f929 c5196x9324f929 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5196x9324f929();
            c5196x9324f929.f135537g.f89581a = n17.d1();
            c5196x9324f929.e();
            return;
        }
        if (itemId == 2) {
            com.p314xaae8f345.mm.ui.p2740x696c9db.n1.b(r01.q3.cj().b1(activityC21598xfb43db0b.f279561o), activityC21598xfb43db0b, ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(activityC21598xfb43db0b.f279561o, true), false, null, 2);
            return;
        }
        if (itemId != 3) {
            if (itemId != 4) {
                return;
            }
            com.p314xaae8f345.mm.ui.o3.b(activityC21598xfb43db0b, new com.p314xaae8f345.mm.ui.p2649x8f4dc54e.f(this));
            return;
        }
        java.lang.String str = activityC21598xfb43db0b.f279561o;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrandServiceConversationUI", "Delete Conversation and messages fail because username is null or nil.");
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 r66 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).r6(str);
        r45.ac0 ac0Var = new r45.ac0();
        r45.du5 du5Var = new r45.du5();
        du5Var.f454289d = str == null ? "" : str;
        du5Var.f454290e = true;
        ac0Var.f451445d = du5Var;
        ac0Var.f451447f = r66.I0();
        ((e21.z0) c01.d9.b().w()).c(new xg3.p0(8, ac0Var));
        activityC21598xfb43db0b.f279567u = false;
        c01.w9.h(str, new com.p314xaae8f345.mm.ui.p2649x8f4dc54e.e(activityC21598xfb43db0b, db5.e1.Q(activityC21598xfb43db0b, activityC21598xfb43db0b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC21598xfb43db0b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new com.p314xaae8f345.mm.ui.p2649x8f4dc54e.d(activityC21598xfb43db0b))));
        ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
        com.p314xaae8f345.mm.p957x53236a1b.g1.I(str, 15);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str, true);
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).p(str);
        ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).k(str);
        if (n18 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n18.d1())) {
            n18.mo43621x7650bebc(n18.m124896xfb85f7b0() & (-2049));
            ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).p0(str, n18);
        }
        if (p17 != null) {
            if (p17.d2(4194304) || (n18 != null && n18.k2() && !n18.r2() && p17.w0() < r01.q3.rj())) {
                c01.d9.e().g(new com.p314xaae8f345.mm.p957x53236a1b.e0(str, null));
            }
        }
    }
}
