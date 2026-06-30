package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class j2 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavFilterUI f101193d;

    public j2(com.tencent.mm.plugin.fav.ui.FavFilterUI favFilterUI) {
        this.f101193d = favFilterUI;
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
        yj0.a.b("com/tencent/mm/plugin/fav/ui/FavFilterUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        s82.g gVar = (s82.g) view.getTag();
        com.tencent.mm.plugin.fav.ui.FavFilterUI favFilterUI = this.f101193d;
        if (gVar != null && gVar.f404774a != null) {
            int i18 = com.tencent.mm.plugin.fav.ui.FavFilterUI.F;
            favFilterUI.Z6(2, i17, false);
            favFilterUI.f100344x.e((r45.fq0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(favFilterUI.getContext(), 17, r45.fq0.class));
        }
        int i19 = favFilterUI.f100327d;
        if (1 == i19) {
            if (gVar == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FavFilterUI", "on item click, holder is null");
                yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavFilterUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            } else if (gVar.f404774a == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FavFilterUI", "on item click, info is null");
                yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavFilterUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            } else {
                ((x82.l0) ((o72.w4) i95.n0.c(o72.w4.class))).Ai(favFilterUI.getContext(), favFilterUI.f100329f, gVar.f404774a, com.tencent.mm.R.string.f490551ya, false, new com.tencent.mm.plugin.fav.ui.h2(this, gVar));
            }
        } else if (2 != i19) {
            favFilterUI.f100335o.onItemClick(adapterView, view, i17, j17);
            if (gVar.f404774a != null) {
                gm0.j1.e().j(new com.tencent.mm.plugin.fav.ui.i2(this, gVar, i17));
            }
        } else if (gVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavFilterUI", "on item click, holder is null");
            yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavFilterUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        } else if (gVar.f404774a == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavFilterUI", "on item click, info is null");
            yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavFilterUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_fav_result_local_id", gVar.f404774a.field_localId);
            favFilterUI.setResult(-1, intent);
            favFilterUI.finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavFilterUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
