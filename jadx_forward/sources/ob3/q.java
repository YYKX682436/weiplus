package ob3;

/* loaded from: classes9.dex */
public class q extends com.p314xaae8f345.mm.ui.ac {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f425613e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1823xed060d07.ActivityC16326x540b7c63 f425614f;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1823xed060d07.ActivityC16326x540b7c63 activityC16326x540b7c63, java.lang.String str) {
        this.f425614f = activityC16326x540b7c63;
        this.f425613e = str;
    }

    @Override // com.p314xaae8f345.mm.ui.ac
    public void a(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1823xed060d07.ActivityC16326x540b7c63 activityC16326x540b7c63 = this.f425614f;
        if (activityC16326x540b7c63.f226564h == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaLuckyMoneyPrepareUI", "Click PrepareBtn but, mLogic == null");
            return;
        }
        if (activityC16326x540b7c63.f226567n.c() != 0) {
            db5.t7.m123882x26a183b(activityC16326x540b7c63.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.kfm, 0).show();
            return;
        }
        int m66199x7498fe14 = activityC16326x540b7c63.f226566m.m66199x7498fe14();
        double m66033x7498fe14 = activityC16326x540b7c63.f226567n.m66033x7498fe14();
        java.lang.String m66211x7498fe14 = activityC16326x540b7c63.f226568o.m66211x7498fe14();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m66211x7498fe14)) {
            m66211x7498fe14 = this.f425613e;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m66211x7498fe14)) {
                m66211x7498fe14 = activityC16326x540b7c63.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gjq);
            }
        }
        lb3.i iVar = activityC16326x540b7c63.f226565i;
        if (iVar == lb3.i.RANDOM_LUCK) {
            ob3.a aVar = activityC16326x540b7c63.f226564h;
            int D0 = (int) com.p314xaae8f345.mm.p2802xd031a825.ui.r1.D0(m66033x7498fe14);
            int i17 = activityC16326x540b7c63.f226577x;
            ob3.a0 a0Var = (ob3.a0) aVar;
            a0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaPrepareLuckyMoneyLogic", "prepareRandomLuckyMoney() called with: moneyTotalAmount = [" + D0 + "], packageAmount = [" + m66199x7498fe14 + "], wishing = [" + m66211x7498fe14 + "], scope = [" + i17 + "]");
            if (a0Var.f425576d == null) {
                return;
            }
            r45.pr5 pr5Var = new r45.pr5();
            pr5Var.f464866d = a0Var.f425577e;
            pr5Var.f464867e = 1;
            pr5Var.f464868f = m66199x7498fe14;
            pr5Var.f464869g = D0;
            pr5Var.f464871i = m66211x7498fe14;
            pr5Var.f464872m = i17;
            a0Var.b(pr5Var);
            return;
        }
        if (iVar == lb3.i.FIX_NORMAL) {
            ob3.a aVar2 = activityC16326x540b7c63.f226564h;
            int D02 = (int) com.p314xaae8f345.mm.p2802xd031a825.ui.r1.D0(m66033x7498fe14);
            int i18 = activityC16326x540b7c63.f226577x;
            ob3.a0 a0Var2 = (ob3.a0) aVar2;
            a0Var2.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaPrepareLuckyMoneyLogic", "prepareFixLuckyMoney() called with: packageMoneyAmount = [" + D02 + "], packageAmount = [" + m66199x7498fe14 + "], wishing = [" + m66211x7498fe14 + "], scope = [" + i18 + "]");
            if (a0Var2.f425576d == null) {
                return;
            }
            r45.pr5 pr5Var2 = new r45.pr5();
            pr5Var2.f464866d = a0Var2.f425577e;
            pr5Var2.f464867e = 0;
            pr5Var2.f464868f = m66199x7498fe14;
            pr5Var2.f464870h = D02;
            pr5Var2.f464871i = m66211x7498fe14;
            pr5Var2.f464872m = i18;
            a0Var2.b(pr5Var2);
        }
    }
}
