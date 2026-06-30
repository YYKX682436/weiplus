package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes15.dex */
public class j6 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15989x4803986e f222972d;

    public j6(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15989x4803986e activityC15989x4803986e) {
        this.f222972d = activityC15989x4803986e;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameSearchUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.b6 b6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.b6) ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.d6) adapterView.getAdapter()).f222900f.get(i17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b6Var.f222593b)) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameSearchUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b6Var.f222594c);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15989x4803986e activityC15989x4803986e = this.f222972d;
        if (K0) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(b6Var.f222593b);
            java.util.regex.Pattern pattern = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15989x4803986e.f222499x;
            activityC15989x4803986e.T6(linkedList, 2, true);
            activityC15989x4803986e.U6(1);
        } else {
            int i18 = b6Var.f222596e;
            if (i18 == 1) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putCharSequence("game_app_id", b6Var.f222594c);
                bundle.putInt("game_report_from_scene", v31.i.f77247x366c91de);
                com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.f(activityC15989x4803986e, 14, v31.i.f77247x366c91de, i17, r53.f.o(activityC15989x4803986e, b6Var.f222594c, null, bundle, 0), b6Var.f222594c, activityC15989x4803986e.f222514u, null);
            } else if (i18 != 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameSearchUI", "unknowed actionType : " + b6Var.f222596e);
            } else {
                com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.f(activityC15989x4803986e, 14, v31.i.f77247x366c91de, i17, r53.f.v(activityC15989x4803986e.mo55332x76847179(), b6Var.f222597f, "game_center_detail", null), b6Var.f222594c, activityC15989x4803986e.f222514u, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameSearchUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
