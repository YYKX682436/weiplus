package zb3;

/* loaded from: classes.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.sns.ActivityC16343x55c0d8b f552800d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.sns.ActivityC16343x55c0d8b activityC16343x55c0d8b) {
        this.f552800d = activityC16343x55c0d8b;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.sns.ActivityC16343x55c0d8b activityC16343x55c0d8b = this.f552800d;
        intent.setClass(activityC16343x55c0d8b.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16368x343578ee.class);
        intent.addFlags(67108864);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16343x55c0d8b.mo55332x76847179();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mo55332x76847179, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$10", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mo55332x76847179.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(mo55332x76847179, "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$10", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16343x55c0d8b.finish();
    }
}
