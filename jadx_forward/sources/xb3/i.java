package xb3;

/* loaded from: classes9.dex */
public class i extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.r43 f534436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16335x1879211c f534437e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16335x1879211c activityC16335x1879211c, r45.r43 r43Var) {
        super(false);
        this.f534437e = activityC16335x1879211c;
        this.f534436d = r43Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16335x1879211c activityC16335x1879211c = this.f534437e;
        intent.setClass(activityC16335x1879211c.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16334x8c51adff.class);
        intent.putExtra("key_lucky_money_can_received", true);
        intent.putExtra("key_native_url", activityC16335x1879211c.f226683x);
        intent.putExtra("key_sendid", activityC16335x1879211c.f226682w);
        intent.putExtra("key_username", activityC16335x1879211c.getIntent().getStringExtra("key_username"));
        intent.putExtra("key_msgid", activityC16335x1879211c.f226685z);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.C16337xbe204522 c16337xbe204522 = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.C16337xbe204522();
        r45.r43 r43Var = this.f534436d;
        c16337xbe204522.f226688f = r43Var.f466054J;
        c16337xbe204522.f226689g = r43Var.K;
        intent.putExtra("key_emoji_switch", c16337xbe204522);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16335x1879211c activityC16335x1879211c2 = this.f534437e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC16335x1879211c2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI$4", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16335x1879211c2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC16335x1879211c2, "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI$4", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16335x1879211c.finish();
    }
}
