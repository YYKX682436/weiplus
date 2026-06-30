package com.tencent.mm.plugin.card.ui;

/* loaded from: classes11.dex */
public class z2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardListSelectedUI f95465d;

    public z2(com.tencent.mm.plugin.card.ui.CardListSelectedUI cardListSelectedUI) {
        this.f95465d = cardListSelectedUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardListSelectedUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.card.ui.CardListSelectedUI.K;
        this.f95465d.x();
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardListSelectedUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
