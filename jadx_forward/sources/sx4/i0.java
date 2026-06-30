package sx4;

/* loaded from: classes8.dex */
public class i0 implements tx4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19411xef36c7b f495147a;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19411xef36c7b activityC19411xef36c7b) {
        this.f495147a = activityC19411xef36c7b;
    }

    @Override // tx4.e
    /* renamed from: onCreateMMMenu */
    public void mo9859xc459429a(db5.g4 g4Var) {
        db5.g4 g4Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(480L, 0L, 1L, false);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19411xef36c7b.S3;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19411xef36c7b activityC19411xef36c7b = this.f495147a;
        activityC19411xef36c7b.getClass();
        try {
            java.util.List<r45.rk4> list = tx4.a.f504217a;
            new android.os.Bundle().putString("game_hv_menu_appid", activityC19411xef36c7b.F3);
            java.util.Map map = activityC19411xef36c7b.E3;
            ((java.util.HashMap) map).clear();
            for (r45.rk4 rk4Var : list) {
                ((java.util.HashMap) map).put(java.lang.Integer.valueOf(rk4Var.f466497d), rk4Var);
            }
            g4Var2 = tx4.i.a(activityC19411xef36c7b, list);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Wepkg.GameWebViewUI", "get cache hv game menu fail! exception:%s", e17.getMessage());
            g4Var2 = null;
        }
        if (g4Var2 != null) {
            ((java.util.ArrayList) g4Var.f309877d).addAll(g4Var2.f309877d);
        }
    }
}
