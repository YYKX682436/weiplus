package ub3;

/* loaded from: classes.dex */
public class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16330x45b4a404 f507666d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16330x45b4a404 activityC16330x45b4a404) {
        this.f507666d = activityC16330x45b4a404;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).bj();
        android.content.Intent intent = new android.content.Intent(this.f507666d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13.class);
        intent.putExtra("key_from", 2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16330x45b4a404 activityC16330x45b4a404 = this.f507666d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activityC16330x45b4a404, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$9", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16330x45b4a404.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activityC16330x45b4a404, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$9", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(28838, 0, 2, 0, 0, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
