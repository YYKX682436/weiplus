package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752;

/* loaded from: classes12.dex */
public class v1 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.w1 f182622d;

    public v1(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.w1 w1Var) {
        this.f182622d = w1Var;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.a1 a1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter$ViewHolder$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.w1 w1Var = this.f182622d;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.x1 x1Var = w1Var.f182632n;
        if (x1Var.f182646s) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter$ViewHolder$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.z1 z1Var = x1Var.f182635e;
        if ((z1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0) && (a1Var = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0) z1Var).f182493t) != null) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("fav_mc_btn", "view_exp", a1Var.b(), 32903);
        }
        rl5.r rVar = new rl5.r(w1Var.f182632n.f182634d, w1Var.f182625d);
        rVar.C = true;
        rVar.f478888y = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.t1(this);
        rVar.f478887x = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.u1(this, view);
        int[] iArr = new int[2];
        w1Var.f182625d.getLocationInWindow(iArr);
        int i17 = iArr[0];
        int i18 = iArr[1];
        int width = w1Var.f182625d.getWidth();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryGalleryAdapter", "onLongClick view x = " + i17 + ", width = " + width + ", view y = " + i18);
        rVar.n(i17 + (width / 2), i18);
        yj0.a.i(true, this, "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter$ViewHolder$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
