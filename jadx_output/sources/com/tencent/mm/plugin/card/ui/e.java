package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardAcceptCardListUI f94985d;

    public e(com.tencent.mm.plugin.card.ui.CardAcceptCardListUI cardAcceptCardListUI) {
        this.f94985d = cardAcceptCardListUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardAcceptCardListUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.card.ui.CardAcceptCardListUI cardAcceptCardListUI = this.f94985d;
        if (cardAcceptCardListUI.C) {
            java.util.LinkedList T6 = com.tencent.mm.plugin.card.ui.CardAcceptCardListUI.T6(cardAcceptCardListUI);
            cardAcceptCardListUI.X6(true);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (int i17 = 0; i17 < T6.size(); i17++) {
                r45.hu huVar = (r45.hu) T6.get(i17);
                r45.a46 a46Var = new r45.a46();
                a46Var.f369719e = huVar.f376446d;
                a46Var.f369720f = huVar.f376447e;
                a46Var.f369722h = cardAcceptCardListUI.f94745z;
                a46Var.f369721g = cardAcceptCardListUI.A;
                a46Var.f369723i = cardAcceptCardListUI.f94744y;
                linkedList.add(a46Var);
            }
            r45.o46 o17 = lu1.a0.o(cardAcceptCardListUI.D, cardAcceptCardListUI.G, cardAcceptCardListUI.H);
            r45.pd6 pd6Var = new r45.pd6();
            pd6Var.f382969d = cardAcceptCardListUI.L;
            gm0.j1.n().f273288b.g(new fu1.e(0, linkedList, "", cardAcceptCardListUI.B, o17, cardAcceptCardListUI.f94743x, pd6Var));
        } else {
            java.util.LinkedList T62 = com.tencent.mm.plugin.card.ui.CardAcceptCardListUI.T6(cardAcceptCardListUI);
            cardAcceptCardListUI.X6(true);
            gm0.j1.n().f273288b.g(new xt1.x(T62, cardAcceptCardListUI.f94743x, cardAcceptCardListUI.f94745z, cardAcceptCardListUI.A, cardAcceptCardListUI.f94744y));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
