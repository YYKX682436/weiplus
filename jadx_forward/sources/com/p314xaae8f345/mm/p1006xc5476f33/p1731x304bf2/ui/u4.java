package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes5.dex */
public class u4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.y4 f223321d;

    public u4(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.y4 y4Var) {
        this.f223321d = y4Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameListAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!(view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameListAdapter", "No button tag retrived, ignore click");
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameListAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b) view.getTag();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.y4 y4Var = this.f223321d;
        if (!y4Var.f223414q.containsKey(bVar.f67370x28d45f97)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameListAdapter", "No DownloadInfo found");
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameListAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c0) y4Var.f223414q.get(bVar.f67370x28d45f97);
        c0Var.a(y4Var.f223411n);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.s sVar = y4Var.f223416s;
        sVar.f223280h = bVar.f221754x2;
        sVar.f223279g = y4Var.f223413p;
        sVar.a(bVar, c0Var);
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameListAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
