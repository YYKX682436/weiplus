package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes.dex */
public class k2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13053xb9371272 f176580d;

    public k2(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13053xb9371272 activityC13053xb9371272) {
        this.f176580d = activityC13053xb9371272;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardHomePageUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent(this.f176580d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13054xf92a7996.class);
        intent.putExtra("key_card_type", 1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13053xb9371272 activityC13053xb9371272 = this.f176580d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activityC13053xb9371272, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/CardHomePageUI$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC13053xb9371272.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activityC13053xb9371272, "com/tencent/mm/plugin/card/ui/CardHomePageUI$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11324, "GotoMemberCardUI", 0, "", "", 0, 1, "", 0, 0);
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardHomePageUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
