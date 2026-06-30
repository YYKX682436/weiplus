package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public class s1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.w1 f101079d;

    public s1(com.tencent.mm.plugin.fav.ui.gallery.w1 w1Var, com.tencent.mm.plugin.fav.ui.gallery.x1 x1Var) {
        this.f101079d = w1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter$ViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.fav.ui.gallery.w1 w1Var = this.f101079d;
        boolean z17 = !w1Var.f101097i.isChecked();
        w1Var.f101097i.setChecked(z17);
        if (z17) {
            w1Var.f101095g.setVisibility(0);
        } else {
            w1Var.f101095g.setVisibility(8);
        }
        if (w1Var.f101099n.f101107m != null) {
            int intValue = ((java.lang.Integer) view.getTag()).intValue();
            ((com.tencent.mm.plugin.fav.ui.gallery.e2) w1Var.f101099n.f101107m).a(z17, w1Var.f101099n.x(intValue), intValue);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter$ViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
