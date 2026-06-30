package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class p5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.q5 f239406d;

    public p5(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.q5 q5Var) {
        this.f239406d = q5Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.q5 q5Var = this.f239406d;
        if (itemId > q5Var.f239431d.size() - 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailUI", "menuItem.getItemId() > mTextInfoList.size() : %s , %s", java.lang.Integer.valueOf(menuItem.getItemId()), java.lang.Integer.valueOf(q5Var.f239431d.size()));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.e1 e1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.e1) q5Var.f239431d.get(menuItem.getItemId());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailUI", " click option menu : %s ,type:%s", e1Var.f238344a, java.lang.Integer.valueOf(e1Var.f238345b.f238569a));
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.v0 v0Var = e1Var.f238345b;
        int i18 = v0Var.f238569a;
        if (i18 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailUI", "textInfo.jumpInfo.url ：%s", v0Var.f238570b);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(q5Var.f239432e.mo55332x76847179(), e1Var.f238345b.f238570b, false);
        } else if (i18 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailUI", "textInfo.jumpInfo.username ：%s", v0Var.f238571c);
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.v0 v0Var2 = e1Var.f238345b;
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.b0(v0Var2.f238571c, v0Var2.f238572d, 0, 1000);
        } else if (i18 != 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemittanceDetailUI", "unknow text info type");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemittanceDetailUI", "text info type is OPTIONS_MENU_ITEM_JUMP_TYPE_NATIVE");
        }
    }
}
