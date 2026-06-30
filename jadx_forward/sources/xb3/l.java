package xb3;

/* loaded from: classes9.dex */
public class l extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xb3.m f534442d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(xb3.m mVar) {
        super(false);
        this.f534442d = mVar;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        android.content.Intent intent = new android.content.Intent();
        xb3.m mVar = this.f534442d;
        intent.setClass(mVar.f534443a.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16334x8c51adff.class);
        intent.putExtra("key_native_url", mVar.f534443a.f226683x);
        intent.putExtra("key_sendid", mVar.f534443a.f226682w);
        intent.putExtra("key_lucky_money_can_received", true);
        intent.putExtra("key_username", mVar.f534443a.getIntent().getStringExtra("key_username"));
        intent.putExtra("key_msgid", mVar.f534443a.f226685z);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16335x1879211c activityC16335x1879211c = mVar.f534443a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC16335x1879211c, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI$6$2", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16335x1879211c.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC16335x1879211c, "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI$6$2", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mVar.f534443a.finish();
    }
}
