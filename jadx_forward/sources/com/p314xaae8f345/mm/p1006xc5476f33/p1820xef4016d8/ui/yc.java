package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes3.dex */
public final class yc implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 f229266d;

    public yc(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13) {
        this.f229266d = activityC16373x8a110f13;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuItem, "menuItem");
        java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13.f227774x2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13 = this.f229266d;
        if (i17 == 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(activityC16373x8a110f13.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16370x5a91dd69.class);
            intent.putExtra("key_username", activityC16373x8a110f13.getIntent().getStringExtra("key_username"));
            intent.putExtra("key_type", 2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f132 = this.f229266d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activityC16373x8a110f132, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewPrepareUI$showMenu$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC16373x8a110f132.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activityC16373x8a110f132, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewPrepareUI$showMenu$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (i17 == com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13.V2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15511, java.lang.Integer.valueOf(activityC16373x8a110f13.f227802p1), 1);
            if (activityC16373x8a110f13.f227802p1 == 1) {
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(activityC16373x8a110f13.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13.f227775y2, false);
                return;
            }
            java.lang.Object[] objArr = new java.lang.Object[1];
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.c1 c1Var = activityC16373x8a110f13.Z;
            objArr[0] = c1Var != null ? c1Var != null ? c1Var.f226726r : null : "";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "show qa foreign, config url: %s", objArr);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.c1 c1Var2 = activityC16373x8a110f13.Z;
            if (c1Var2 != null) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c1Var2 != null ? c1Var2.f226726r : null)) {
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16373x8a110f13.mo55332x76847179();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.c1 c1Var3 = activityC16373x8a110f13.Z;
                    com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(mo55332x76847179, c1Var3 != null ? c1Var3.f226726r : null, false);
                    return;
                }
            }
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(activityC16373x8a110f13.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13.f227776z2, false);
        }
    }
}
