package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class p5 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavSearchUI f101335d;

    public p5(com.tencent.mm.plugin.fav.ui.FavSearchUI favSearchUI) {
        this.f101335d = favSearchUI;
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
        yj0.a.b("com/tencent/mm/plugin/fav/ui/FavSearchUI$9", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        s82.g gVar = (s82.g) view.getTag();
        com.tencent.mm.plugin.fav.ui.FavSearchUI favSearchUI = this.f101335d;
        if (gVar != null && gVar.f404774a != null) {
            int i18 = com.tencent.mm.plugin.fav.ui.FavSearchUI.N;
            favSearchUI.b7(2, i17);
            favSearchUI.F.e((r45.fq0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(favSearchUI.getContext(), 17, r45.fq0.class));
        }
        int i19 = favSearchUI.f100393d;
        if (1 == i19) {
            if (gVar == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FavSearchUI", "on item click, holder is null");
                yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavSearchUI$9", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            } else if (gVar.f404774a == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FavSearchUI", "on item click, info is null");
                yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavSearchUI$9", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            } else {
                ((x82.l0) ((o72.w4) i95.n0.c(o72.w4.class))).Ai(favSearchUI.getContext(), favSearchUI.f100395f, gVar.f404774a, com.tencent.mm.R.string.f490551ya, false, new com.tencent.mm.plugin.fav.ui.n5(this, gVar));
            }
        } else if (2 != i19) {
            favSearchUI.f100400n.onItemClick(adapterView, view, i17, j17);
            if (gVar.f404774a != null) {
                gm0.j1.e().j(new com.tencent.mm.plugin.fav.ui.o5(this, gVar, i17));
            }
        } else if (gVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavSearchUI", "on item click, holder is null");
            yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavSearchUI$9", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        } else if (gVar.f404774a == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavSearchUI", "on item click, info is null");
            yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavSearchUI$9", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_fav_result_local_id", gVar.f404774a.field_localId);
            intent.putExtra("key_fav_result_fake_local_id", gVar.f404774a.D1);
            favSearchUI.setResult(-1, intent);
            favSearchUI.finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavSearchUI$9", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
