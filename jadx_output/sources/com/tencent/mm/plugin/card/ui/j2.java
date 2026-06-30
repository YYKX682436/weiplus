package com.tencent.mm.plugin.card.ui;

/* loaded from: classes.dex */
public class j2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardHomePageUI f95033d;

    public j2(com.tencent.mm.plugin.card.ui.CardHomePageUI cardHomePageUI) {
        this.f95033d = cardHomePageUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardHomePageUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent(this.f95033d, (java.lang.Class<?>) com.tencent.mm.plugin.card.ui.CardIndexUI.class);
        intent.putExtra("key_card_type", 1);
        com.tencent.mm.plugin.card.ui.CardHomePageUI cardHomePageUI = this.f95033d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(cardHomePageUI, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/CardHomePageUI$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        cardHomePageUI.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(cardHomePageUI, "com/tencent/mm/plugin/card/ui/CardHomePageUI$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11324, "GotoMemberCardUI", 0, "", "", 0, 0, "", 0, 0);
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardHomePageUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
