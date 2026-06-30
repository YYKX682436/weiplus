package xb3;

/* loaded from: classes9.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16334x8c51adff f534427d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16334x8c51adff activityC16334x8c51adff) {
        this.f534427d = activityC16334x8c51adff;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean Zi = ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).Zi();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16334x8c51adff activityC16334x8c51adff = this.f534427d;
        android.content.Intent intent = Zi ? new android.content.Intent(activityC16334x8c51adff.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d.class) : new android.content.Intent(activityC16334x8c51adff.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d.class);
        intent.putExtras(activityC16334x8c51adff.getIntent());
        intent.putExtra("key_hk_flag", 1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16334x8c51adff activityC16334x8c51adff2 = this.f534427d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC16334x8c51adff2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKBeforeDetailUI$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16334x8c51adff2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC16334x8c51adff2, "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKBeforeDetailUI$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new xb3.a(this), 500L);
    }
}
