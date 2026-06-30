package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public class v1 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.w1 f101089d;

    public v1(com.tencent.mm.plugin.fav.ui.gallery.w1 w1Var) {
        this.f101089d = w1Var;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        com.tencent.mm.plugin.fav.ui.gallery.a1 a1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter$ViewHolder$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.plugin.fav.ui.gallery.w1 w1Var = this.f101089d;
        com.tencent.mm.plugin.fav.ui.gallery.x1 x1Var = w1Var.f101099n;
        if (x1Var.f101113s) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter$ViewHolder$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        com.tencent.mm.plugin.fav.ui.gallery.z1 z1Var = x1Var.f101102e;
        if ((z1Var instanceof com.tencent.mm.plugin.fav.ui.gallery.h0) && (a1Var = ((com.tencent.mm.plugin.fav.ui.gallery.h0) z1Var).f100960t) != null) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("fav_mc_btn", "view_exp", a1Var.b(), 32903);
        }
        rl5.r rVar = new rl5.r(w1Var.f101099n.f101101d, w1Var.f101092d);
        rVar.C = true;
        rVar.f397355y = new com.tencent.mm.plugin.fav.ui.gallery.t1(this);
        rVar.f397354x = new com.tencent.mm.plugin.fav.ui.gallery.u1(this, view);
        int[] iArr = new int[2];
        w1Var.f101092d.getLocationInWindow(iArr);
        int i17 = iArr[0];
        int i18 = iArr[1];
        int width = w1Var.f101092d.getWidth();
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryAdapter", "onLongClick view x = " + i17 + ", width = " + width + ", view y = " + i18);
        rVar.n(i17 + (width / 2), i18);
        yj0.a.i(true, this, "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter$ViewHolder$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
