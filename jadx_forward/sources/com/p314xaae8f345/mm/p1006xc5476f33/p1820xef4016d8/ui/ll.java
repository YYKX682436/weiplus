package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class ll extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ml f228685d;

    public ll(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ml mlVar) {
        this.f228685d = mlVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17) {
        int i18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$10$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ml mlVar = this.f228685d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d = mlVar.f228729d;
            if (!activityC16390x60cac25d.f228061p1 && (i18 = activityC16390x60cac25d.f228067v) >= 0 && i18 < ((java.util.ArrayList) activityC16390x60cac25d.f228065t).size()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d2 = mlVar.f228729d;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(19272, 1, mlVar.f228729d.K, ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.zm) ((java.util.ArrayList) activityC16390x60cac25d2.f228065t).get(activityC16390x60cac25d2.f228067v)).f229326b.f471033f);
                mlVar.f228729d.f228061p1 = true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d3 = mlVar.f228729d;
            int i19 = activityC16390x60cac25d3.f228067v;
            if (i19 >= 0 && i19 < ((java.util.ArrayList) activityC16390x60cac25d3.f228065t).size()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d4 = mlVar.f228729d;
                r45.wv3 wv3Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.zm) ((java.util.ArrayList) activityC16390x60cac25d4.f228065t).get(activityC16390x60cac25d4.f228067v)).f229326b;
                if (wv3Var.f471039o == 3) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(22104, wv3Var.f471033f, 2);
                }
            }
            mlVar.f228729d.q7();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$10$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$10$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ml mlVar = this.f228685d;
        int y17 = mlVar.f228729d.f228056m.y();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d = mlVar.f228729d;
        if (!activityC16390x60cac25d.f228071y && activityC16390x60cac25d.f228073z == 1 && y17 == activityC16390x60cac25d.f228057n.mo1894x7e414b06() - 1) {
            mlVar.f228729d.Z6(false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d2 = mlVar.f228729d;
        int u07 = mlVar.f228729d.f228054i.u0(activityC16390x60cac25d2.D.n(activityC16390x60cac25d2.f228056m));
        mlVar.f228729d.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d3 = mlVar.f228729d;
        if (u07 != activityC16390x60cac25d3.f228067v && u07 >= 0 && u07 < ((java.util.ArrayList) activityC16390x60cac25d3.f228065t).size()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.zm zmVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.zm) ((java.util.ArrayList) mlVar.f228729d.f228065t).get(u07);
            r45.wv3 wv3Var = zmVar.f229326b;
            if (wv3Var != null && (wv3Var.f471036i == 1 || wv3Var.f471040p == 1)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "expired: %s", java.lang.Integer.valueOf(u07));
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d4 = mlVar.f228729d;
                int i19 = activityC16390x60cac25d4.f228067v;
                if (i19 >= 0 && i19 < ((java.util.ArrayList) activityC16390x60cac25d4.f228065t).size()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d5 = mlVar.f228729d;
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.zm) ((java.util.ArrayList) activityC16390x60cac25d5.f228065t).get(activityC16390x60cac25d5.f228067v)).f229325a = false;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d6 = mlVar.f228729d;
                    activityC16390x60cac25d6.m7(activityC16390x60cac25d6.f228067v, false);
                    mlVar.f228729d.f228067v = -1;
                }
                yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$10$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
                return;
            }
            if (zmVar.f229327c) {
                mlVar.f228729d.f228067v = -2;
            } else if (zmVar.f229325a) {
                zmVar.f229325a = false;
                mlVar.f228729d.f228067v = -1;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "do select pos: %s", java.lang.Integer.valueOf(u07));
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d7 = mlVar.f228729d;
                int i27 = activityC16390x60cac25d7.f228067v;
                if (i27 >= 0 && i27 < ((java.util.ArrayList) activityC16390x60cac25d7.f228065t).size()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d8 = mlVar.f228729d;
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.zm) ((java.util.ArrayList) activityC16390x60cac25d8.f228065t).get(activityC16390x60cac25d8.f228067v)).f229325a = false;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d9 = mlVar.f228729d;
                    activityC16390x60cac25d9.m7(activityC16390x60cac25d9.f228067v, false);
                }
                zmVar.f229325a = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d10 = mlVar.f228729d;
                activityC16390x60cac25d10.f228067v = u07;
                activityC16390x60cac25d10.m7(u07, true);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "post run finalSelect : %s lastSelect:%s", java.lang.Integer.valueOf(u07), java.lang.Integer.valueOf(y17));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$10$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
