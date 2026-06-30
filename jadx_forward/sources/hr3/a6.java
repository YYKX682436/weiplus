package hr3;

/* loaded from: classes9.dex */
public class a6 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.t6 f364910d;

    public a6(hr3.t6 t6Var) {
        this.f364910d = t6Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        hr3.t6 t6Var = this.f364910d;
        if (itemId == 1) {
            java.lang.String d17 = t6Var.f365537f.d1();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Talker_Name", t6Var.f365537f.d1());
            intent.putExtra("Select_block_List", d17);
            intent.putExtra("Select_Send_Card", true);
            intent.putExtra("Select_Conv_Type", 3);
            intent.putExtra("mutil_select_is_ret", true);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.getClass();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = t6Var.f365535d;
            intent.setClass(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93.class);
            abstractActivityC21394xb3d2c0cf.startActivityForResult(intent, 1);
            return;
        }
        if (itemId == 2) {
            t6Var.f365535d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fc7, t6Var.f365537f.g2());
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = t6Var.f365535d;
            db5.e1.A(abstractActivityC21394xb3d2c0cf2, abstractActivityC21394xb3d2c0cf2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bbw), "", abstractActivityC21394xb3d2c0cf2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bbv), abstractActivityC21394xb3d2c0cf2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new hr3.z5(this), null);
            return;
        }
        if (itemId == 3) {
            t6Var.g();
            return;
        }
        if (itemId != 4) {
            if (itemId != 5) {
                return;
            }
            t6Var.f365537f.getClass();
            xp1.c.j(t6Var.f365535d, t6Var.f365537f.d1());
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new hr3.g6(t6Var), 1000L);
            return;
        }
        t6Var.getClass();
        qk.n6 n6Var = (qk.n6) i95.n0.c(qk.n6.class);
        qk.o oVar = t6Var.f365538g;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf3 = t6Var.f365535d;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = t6Var.f365537f;
        hr3.b6 b6Var = new hr3.b6(t6Var);
        ((com.p314xaae8f345.mm.app.o7) n6Var).getClass();
        com.p314xaae8f345.mm.ui.p2740x696c9db.n1.b(oVar, abstractActivityC21394xb3d2c0cf3, z3Var, true, b6Var, 0);
    }
}
