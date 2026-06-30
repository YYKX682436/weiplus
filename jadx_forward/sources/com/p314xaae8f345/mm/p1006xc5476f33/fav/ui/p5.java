package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class p5 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257 f182868d;

    public p5(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257 activityC13570xd6b9f257) {
        this.f182868d = activityC13570xd6b9f257;
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
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257 activityC13570xd6b9f257 = this.f182868d;
        if (gVar != null && gVar.f486307a != null) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257.N;
            activityC13570xd6b9f257.b7(2, i17);
            activityC13570xd6b9f257.F.e((r45.fq0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(activityC13570xd6b9f257.mo55332x76847179(), 17, r45.fq0.class));
        }
        int i19 = activityC13570xd6b9f257.f181926d;
        if (1 == i19) {
            if (gVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavSearchUI", "on item click, holder is null");
                yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavSearchUI$9", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            } else if (gVar.f486307a == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavSearchUI", "on item click, info is null");
                yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavSearchUI$9", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            } else {
                ((x82.l0) ((o72.w4) i95.n0.c(o72.w4.class))).Ai(activityC13570xd6b9f257.mo55332x76847179(), activityC13570xd6b9f257.f181928f, gVar.f486307a, com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya, false, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.n5(this, gVar));
            }
        } else if (2 != i19) {
            activityC13570xd6b9f257.f181933n.onItemClick(adapterView, view, i17, j17);
            if (gVar.f486307a != null) {
                gm0.j1.e().j(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.o5(this, gVar, i17));
            }
        } else if (gVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavSearchUI", "on item click, holder is null");
            yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavSearchUI$9", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        } else if (gVar.f486307a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavSearchUI", "on item click, info is null");
            yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavSearchUI$9", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_fav_result_local_id", gVar.f486307a.f67645x88be67a1);
            intent.putExtra("key_fav_result_fake_local_id", gVar.f486307a.D1);
            activityC13570xd6b9f257.setResult(-1, intent);
            activityC13570xd6b9f257.finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavSearchUI$9", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
