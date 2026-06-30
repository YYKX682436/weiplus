package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752;

/* loaded from: classes12.dex */
public class s1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.w1 f182612d;

    public s1(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.w1 w1Var, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.x1 x1Var) {
        this.f182612d = w1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter$ViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.w1 w1Var = this.f182612d;
        boolean z17 = !w1Var.f182630i.isChecked();
        w1Var.f182630i.setChecked(z17);
        if (z17) {
            w1Var.f182628g.setVisibility(0);
        } else {
            w1Var.f182628g.setVisibility(8);
        }
        if (w1Var.f182632n.f182640m != null) {
            int intValue = ((java.lang.Integer) view.getTag()).intValue();
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.e2) w1Var.f182632n.f182640m).a(z17, w1Var.f182632n.x(intValue), intValue);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/gallery/MediaHistoryGalleryAdapter$ViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
