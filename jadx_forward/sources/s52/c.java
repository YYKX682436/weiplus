package s52;

/* loaded from: classes13.dex */
public abstract class c {
    public static void a(java.lang.String str, int i17, long j17, e42.l0 l0Var) {
        e42.l0 l0Var2 = e42.l0.MMActivity_Back2Front;
        e42.l0 l0Var3 = e42.l0.MMActivity_Front2Back;
        int i18 = l0Var == l0Var2 ? 7 : l0Var == l0Var3 ? 8 : -1;
        if (b52.b.m() && !com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1395x3342843d.k.f181344g) {
            if (l0Var == l0Var2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(932L, 91L, 1L, false);
            } else if (l0Var == l0Var3) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(932L, 92L, 1L, false);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellFrontBackReport", "report 切换-前后台(3): %d, %s 未登录", java.lang.Integer.valueOf(i18), str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellFrontBackReport", "report 切换-前后台(3): %d, %s", java.lang.Integer.valueOf(i18), str);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1395x3342843d.k) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1395x3342843d.k.class)).Di(str, l0Var, i17, j17);
    }
}
