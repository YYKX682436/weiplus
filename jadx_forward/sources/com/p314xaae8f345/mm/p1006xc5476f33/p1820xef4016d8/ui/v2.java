package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class v2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.x2 f229055d;

    public v2(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.x2 x2Var) {
        this.f229055d = x2Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        r45.yv3 yv3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.q6 a17;
        java.util.ArrayList arrayList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyDetailUI", "add OPTIONS_MENU_ITEM_ID_LUCKY_MONEY_RECORD");
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.x2 x2Var = this.f229055d;
        g4Var.f(0, x2Var.f229196d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gjn));
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d = x2Var.f229196d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = activityC16363x8a0a619d.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        int intExtra = ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d4) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d4.class)).m158359x1e885992().getIntExtra("key_receive_envelope_widget_status_flag", 0);
        boolean z17 = (intExtra & 32) != 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyDetailUIFunctionUIC", "[needShowUpRightCornerLiteApp] needShow ：" + z17 + " , statusFlag ：" + intExtra);
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyDetailUI", "add OPTIONS_MENU_ITEM_ID_LUCKY_MONEY_BASIC_OPTIONAL_URL");
            g4Var.f(1, activityC16363x8a0a619d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o7x));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1 e1Var = activityC16363x8a0a619d.U2;
        java.util.ArrayList arrayList2 = (e1Var == null || (a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.q6.a(e1Var.T)) == null || (arrayList = a17.f227099c) == null || arrayList.size() <= 0) ? null : a17.f227099c;
        if (arrayList2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyDetailUI", "ComplaintEntrance is false || mTextInfoList == null || mTextInfoList.size() ==0");
            return;
        }
        java.util.Iterator it = arrayList2.iterator();
        int i17 = 2;
        while (it.hasNext()) {
            r45.aw3 aw3Var = (r45.aw3) it.next();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aw3Var.f451826d) && (yv3Var = aw3Var.f451827e) != null && yv3Var.f472933d != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyDetailUI", "add option：%s, index：%s", aw3Var.f451826d, java.lang.Integer.valueOf(i17));
                g4Var.f(i17, aw3Var.f451826d);
            }
            i17++;
        }
    }
}
