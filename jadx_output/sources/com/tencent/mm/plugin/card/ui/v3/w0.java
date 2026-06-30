package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class w0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f95394d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.VipCardListUI f95395e;

    public w0(in5.s0 s0Var, com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI) {
        this.f95394d = s0Var;
        this.f95395e = vipCardListUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/v3/VipCardListUI$VipCardConverter$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.card.ui.v3.t0 t0Var = (com.tencent.mm.plugin.card.ui.v3.t0) this.f95394d.f293125i;
        r45.tt a17 = t0Var.a();
        int i17 = a17.f386780v;
        com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI = this.f95395e;
        if (i17 == 1) {
            lu1.d.j((com.tencent.mm.ui.MMActivity) vipCardListUI.getContext(), a17.f386781w, 0);
        } else if (i17 == 2) {
            r45.iu iuVar = a17.f386782x;
            lu1.d.f(iuVar.f377328d, iuVar.f377329e, iuVar.f377330f);
        } else if (i17 == 3) {
            java.lang.String user_card_id = t0Var.a().f386765d;
            kotlin.jvm.internal.o.f(user_card_id, "user_card_id");
            com.tencent.mm.plugin.card.ui.v3.VipCardListUI.X6(vipCardListUI, user_card_id);
        } else {
            java.lang.String user_card_id2 = t0Var.a().f386765d;
            kotlin.jvm.internal.o.f(user_card_id2, "user_card_id");
            com.tencent.mm.plugin.card.ui.v3.VipCardListUI.X6(vipCardListUI, user_card_id2);
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = 1;
        objArr[1] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000);
        objArr[2] = t0Var.a().f386765d;
        java.lang.String user_card_id3 = t0Var.a().f386765d;
        kotlin.jvm.internal.o.f(user_card_id3, "user_card_id");
        java.util.Iterator it = vipCardListUI.f95279v.iterator();
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                i18 = -1;
                break;
            }
            java.lang.Object next = it.next();
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.card.ui.v3.t0) next).a().f386765d, user_card_id3)) {
                break;
            } else {
                i18 = i19;
            }
        }
        objArr[3] = java.lang.Integer.valueOf(i18);
        objArr[4] = 0;
        objArr[5] = java.lang.Integer.valueOf(vipCardListUI.B);
        g0Var.d(19748, objArr);
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/v3/VipCardListUI$VipCardConverter$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
