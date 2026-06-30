package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class r7 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d f228904d;

    public r7(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d) {
        this.f228904d = activityC16371xf216ae6d;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d = this.f228904d;
        if (itemId == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "click OPTIONS_MENU_ITEM_ID_LUCKY_MONEY_RECORD");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11701, java.lang.Integer.valueOf(activityC16371xf216ae6d.Q1 == 2 ? 13 : 7), 0, 0, 0, 4);
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(activityC16371xf216ae6d.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16370x5a91dd69.class);
            intent.putExtra("key_type", 2);
            intent.putExtra("key_username", activityC16371xf216ae6d.L1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d2 = this.f228904d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activityC16371xf216ae6d2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUI$addOptionsMenuIfNeed$2$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC16371xf216ae6d2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activityC16371xf216ae6d2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUI$addOptionsMenuIfNeed$2$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (menuItem.getItemId() == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "click OPTIONS_MENU_ITEM_ID_LUCKY_MONEY_BASIC_OPTIONAL_URL");
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16371xf216ae6d.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.fa faVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.fa) pf5.z.f435481a.a(mo55332x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.fa.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = faVar.m158354x19263085();
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d3 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d) m158354x19263085 : null;
            if (activityC16371xf216ae6d3 == null || (str = activityC16371xf216ae6d3.T2) == null) {
                str = "";
            }
            int intExtra = faVar.m158359x1e885992().getIntExtra("key_packet_source", 0);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", "wxalited4df4810a40b1d9ddc0cbea44d263fd9");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("scene=103");
            sb6.append("&packet_id=".concat(str));
            sb6.append("&packet_source=" + intExtra);
            bundle.putString("query", sb6.toString());
            bundle.putString("minVersion", "2.0.0");
            bundle.putInt("nextAnimIn", com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0);
            bundle.putInt("currentAnimOut", com.p314xaae8f345.mm.R.C30854x2dc211.f559410e1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewDetailUIFunctionUIC", "[doShowUpRightCornerLiteApp] packetID ：" + str + " ，packetSource ：" + intExtra + " \n query: " + ((java.lang.Object) sb6));
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s();
            sVar.f225700d = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ea.f228401a;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).jk(faVar.m158354x19263085(), bundle, true, true, sVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.da(faVar));
            return;
        }
        java.util.ArrayList X6 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d.X6(activityC16371xf216ae6d);
        if (X6 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "mTextInfoList == null || mTextInfoList.size() ==0");
            return;
        }
        if (menuItem.getItemId() - 2 > X6.size() - 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "menuItem.getItemId() > mTextInfoList.size() : %s , %s", java.lang.Integer.valueOf(menuItem.getItemId()), java.lang.Integer.valueOf(X6.size()));
            return;
        }
        java.lang.Object obj = X6.get(menuItem.getItemId() - 2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        r45.aw3 aw3Var = (r45.aw3) obj;
        if (aw3Var.f451827e == null) {
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(menuItem.getItemId());
        objArr[1] = aw3Var.f451826d;
        r45.yv3 yv3Var = aw3Var.f451827e;
        objArr[2] = yv3Var != null ? java.lang.Integer.valueOf(yv3Var.f472933d) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "click OPTIONS_MENU_ITEM_ID_LUCKY_MONEY_PAY_OPTIONAL_URL，index: %s, word: %s，type: %s", objArr);
        r45.yv3 yv3Var2 = aw3Var.f451827e;
        java.lang.Integer valueOf = yv3Var2 != null ? java.lang.Integer.valueOf(yv3Var2.f472933d) : null;
        if (valueOf != null && valueOf.intValue() == 1) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            r45.yv3 yv3Var3 = aw3Var.f451827e;
            objArr2[0] = yv3Var3 != null ? yv3Var3.f472934e : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "textInfo.jumpInfo.url ：%s", objArr2);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = activityC16371xf216ae6d.mo55332x76847179();
            r45.yv3 yv3Var4 = aw3Var.f451827e;
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(mo55332x768471792, yv3Var4 != null ? yv3Var4.f472934e : null, false);
            return;
        }
        if (valueOf == null || valueOf.intValue() != 2) {
            if (valueOf != null && valueOf.intValue() == 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewDetailUI", "text info type is OPTIONS_MENU_ITEM_JUMP_TYPE_NATIVE");
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewDetailUI", "unknow text info type");
                return;
            }
        }
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        r45.yv3 yv3Var5 = aw3Var.f451827e;
        objArr3[0] = yv3Var5 != null ? yv3Var5.f472935f : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "textInfo.jumpInfo.username ：%s", objArr3);
        r45.yv3 yv3Var6 = aw3Var.f451827e;
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.b0(yv3Var6 != null ? yv3Var6.f472935f : null, yv3Var6 != null ? yv3Var6.f472936g : null, 0, 1000);
    }
}
