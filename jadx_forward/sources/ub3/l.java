package ub3;

/* loaded from: classes9.dex */
public class l implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16330x45b4a404 f507650d;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16330x45b4a404 activityC16330x45b4a404) {
        this.f507650d = activityC16330x45b4a404;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16330x45b4a404 activityC16330x45b4a404 = this.f507650d;
        if (itemId == 1) {
            if (activityC16330x45b4a404.f226602J > 0) {
                activityC16330x45b4a404.m66165x5406100e(new tb3.a(activityC16330x45b4a404.F), false);
                return;
            } else {
                db5.e1.T(activityC16330x45b4a404, activityC16330x45b4a404.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gks));
                return;
            }
        }
        if (itemId != 2) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(activityC16330x45b4a404.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16370x5a91dd69.class);
        intent.putExtra("key_type", 2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16330x45b4a404 activityC16330x45b4a4042 = this.f507650d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC16330x45b4a4042, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$3", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16330x45b4a4042.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC16330x45b4a4042, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$3", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
