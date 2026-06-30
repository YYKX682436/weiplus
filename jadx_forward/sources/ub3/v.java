package ub3;

/* loaded from: classes5.dex */
public class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16331x46dfff95 f507673d;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16331x46dfff95 activityC16331x46dfff95) {
        this.f507673d = activityC16331x46dfff95;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FReceiveUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16331x46dfff95 activityC16331x46dfff95 = this.f507673d;
        activityC16331x46dfff95.f226641w.cancel();
        activityC16331x46dfff95.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FReceiveUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
