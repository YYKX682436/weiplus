package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class w2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.x2 f229163d;

    public w2(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.x2 x2Var) {
        this.f229163d = x2Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.q6 a17;
        java.util.ArrayList arrayList;
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.x2 x2Var = this.f229163d;
        if (itemId == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyDetailUI", "click OPTIONS_MENU_ITEM_ID_LUCKY_MONEY_RECORD");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11701, java.lang.Integer.valueOf(x2Var.f229196d.Q1 == 2 ? 13 : 7), 0, 0, 0, 4);
            android.content.Intent intent = new android.content.Intent();
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d = x2Var.f229196d;
            intent.setClass(activityC16363x8a0a619d.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16370x5a91dd69.class);
            intent.putExtra("key_type", 2);
            intent.putExtra("key_username", activityC16363x8a0a619d.L1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d2 = x2Var.f229196d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activityC16363x8a0a619d2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$41$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC16363x8a0a619d2.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activityC16363x8a0a619d2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$41$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        java.util.ArrayList arrayList3 = null;
        arrayList3 = null;
        arrayList3 = null;
        arrayList3 = null;
        if (menuItem.getItemId() == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyDetailUI", "click OPTIONS_MENU_ITEM_ID_LUCKY_MONEY_BASIC_OPTIONAL_URL");
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = x2Var.f229196d.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d4 d4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d4) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d4.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = d4Var.m158354x19263085();
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d3 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d) m158354x19263085 : null;
            java.lang.String str = activityC16363x8a0a619d3 != null ? activityC16363x8a0a619d3.T2 : null;
            if (str == null) {
                str = "";
            }
            int intExtra = d4Var.m158359x1e885992().getIntExtra("key_packet_source", 0);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", "wxalited4df4810a40b1d9ddc0cbea44d263fd9");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("scene=103");
            sb6.append("&packet_id=".concat(str));
            sb6.append("&packet_source=" + intExtra);
            bundle.putString("query", sb6.toString());
            bundle.putString("minVersion", "2.0.0");
            bundle.putInt("nextAnimIn", com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0);
            bundle.putInt("currentAnimOut", com.p314xaae8f345.mm.R.C30854x2dc211.f559410e1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyDetailUIFunctionUIC", "[doShowUpRightCornerLiteApp] packetID ：" + str + " ，packetSource ：" + intExtra + " \n query: " + ((java.lang.Object) sb6));
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s();
            sVar.f225700d = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.c4.f228308a;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).jk(d4Var.m158354x19263085(), bundle, true, true, sVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.b4(d4Var));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1 e1Var = x2Var.f229196d.U2;
        if (e1Var != null && (a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.q6.a(e1Var.T)) != null && (arrayList = a17.f227099c) != null && arrayList.size() > 0) {
            arrayList3 = a17.f227099c;
        }
        if (arrayList3 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyDetailUI", "mTextInfoList == null || mTextInfoList.size() ==0");
            return;
        }
        if (menuItem.getItemId() - 2 > arrayList3.size() - 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyDetailUI", "menuItem.getItemId() > mTextInfoList.size() : %s , %s", java.lang.Integer.valueOf(menuItem.getItemId()), java.lang.Integer.valueOf(arrayList3.size()));
            return;
        }
        r45.aw3 aw3Var = (r45.aw3) arrayList3.get(menuItem.getItemId() - 2);
        if (aw3Var == null || aw3Var.f451827e == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyDetailUI", "click OPTIONS_MENU_ITEM_ID_LUCKY_MONEY_PAY_OPTIONAL_URL，index: %s, word: %s，type: %s", java.lang.Integer.valueOf(menuItem.getItemId()), aw3Var.f451826d, java.lang.Integer.valueOf(aw3Var.f451827e.f472933d));
        r45.yv3 yv3Var = aw3Var.f451827e;
        int i18 = yv3Var.f472933d;
        if (i18 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyDetailUI", "textInfo.jumpInfo.url ：%s", yv3Var.f472934e);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(x2Var.f229196d.mo55332x76847179(), aw3Var.f451827e.f472934e, false);
        } else if (i18 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyDetailUI", "textInfo.jumpInfo.username ：%s", yv3Var.f472935f);
            r45.yv3 yv3Var2 = aw3Var.f451827e;
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.b0(yv3Var2.f472935f, yv3Var2.f472936g, 0, 1000);
        } else if (i18 != 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyDetailUI", "unknow text info type");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyDetailUI", "text info type is OPTIONS_MENU_ITEM_JUMP_TYPE_NATIVE");
        }
    }
}
