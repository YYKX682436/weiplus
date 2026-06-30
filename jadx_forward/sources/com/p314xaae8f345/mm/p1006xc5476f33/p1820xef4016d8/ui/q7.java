package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class q7 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d f228873d;

    public q7(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d) {
        this.f228873d = activityC16371xf216ae6d;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 menu) {
        r45.yv3 yv3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "add OPTIONS_MENU_ITEM_ID_LUCKY_MONEY_RECORD");
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d = this.f228873d;
        menu.f(0, activityC16371xf216ae6d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gjn));
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16371xf216ae6d.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        int intExtra = ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.fa) pf5.z.f435481a.a(mo55332x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.fa.class)).m158359x1e885992().getIntExtra("key_receive_envelope_widget_status_flag", 0);
        boolean z17 = (intExtra & 32) != 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewDetailUIFunctionUIC", "[needShowUpRightCornerLiteApp] needShow ：" + z17 + " , statusFlag ：" + intExtra);
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "add OPTIONS_MENU_ITEM_ID_LUCKY_MONEY_BASIC_OPTIONAL_URL");
            menu.f(1, activityC16371xf216ae6d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o7x));
        }
        java.util.ArrayList X6 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d.X6(activityC16371xf216ae6d);
        if (X6 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "ComplaintEntrance is false || mTextInfoList == null || mTextInfoList.size() ==0");
            return;
        }
        java.util.Iterator it = X6.iterator();
        int i17 = 2;
        while (it.hasNext()) {
            r45.aw3 aw3Var = (r45.aw3) it.next();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aw3Var.f451826d) && (yv3Var = aw3Var.f451827e) != null) {
                if (!(yv3Var != null && yv3Var.f472933d == 0)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "add option：%s, index：%s", aw3Var.f451826d, java.lang.Integer.valueOf(i17));
                    menu.f(i17, aw3Var.f451826d);
                }
            }
            i17++;
        }
    }
}
