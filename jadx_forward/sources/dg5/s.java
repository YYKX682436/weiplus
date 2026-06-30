package dg5;

/* loaded from: classes9.dex */
public class s implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dg5.t f313929d;

    public s(dg5.t tVar) {
        this.f313929d = tVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        dg5.t tVar = this.f313929d;
        if (itemId == 0) {
            ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).k(tVar.f313932f);
            return;
        }
        if (itemId != 1) {
            if (itemId == 2) {
                dg5.u uVar = tVar.f313933g;
                java.lang.String str = tVar.f313932f;
                com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 activityC22359x66709fa8 = uVar.f313934d;
                db5.e1.A(activityC22359x66709fa8, activityC22359x66709fa8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c17), "", activityC22359x66709fa8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572660c16), activityC22359x66709fa8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new dg5.p(uVar, str, activityC22359x66709fa8), null);
                return;
            }
            if (itemId != 3) {
                return;
            }
            dg5.u uVar2 = tVar.f313933g;
            java.lang.String str2 = tVar.f313932f;
            uVar2.getClass();
            if (((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str2, true) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EnterpriseConversationPresenter", "changed biz stick status failed, contact is null, talker = " + str2);
                return;
            } else if (((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).K(str2)) {
                c01.e2.B0(str2, true, true);
                return;
            } else {
                c01.i0.a(str2, true);
                return;
            }
        }
        dg5.u uVar3 = tVar.f313933g;
        java.lang.String str3 = tVar.f313932f;
        uVar3.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EnterpriseConversationPresenter", "Delete Conversation and messages fail because username is null or nil.");
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 r66 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).r6(str3);
        r45.ac0 ac0Var = new r45.ac0();
        r45.du5 du5Var = new r45.du5();
        du5Var.f454289d = str3 == null ? "" : str3;
        du5Var.f454290e = true;
        ac0Var.f451445d = du5Var;
        ac0Var.f451447f = r66.I0();
        ((e21.z0) c01.d9.b().w()).c(new xg3.p0(8, ac0Var));
        uVar3.f313937g = false;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 activityC22359x66709fa82 = uVar3.f313934d;
        c01.w9.h(str3, new dg5.r(uVar3, db5.e1.Q(activityC22359x66709fa82, activityC22359x66709fa82.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC22359x66709fa82.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new dg5.q(uVar3))));
        ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
        com.p314xaae8f345.mm.p957x53236a1b.g1.I(str3, 15);
        ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).k(str3);
        c01.d9.b().k().b(r01.q3.cj().b1(str3).f66739xdfb76cc2);
        ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Ai(str3);
    }
}
