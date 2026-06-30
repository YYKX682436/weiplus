package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes3.dex */
public class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.h0 f101088d;

    public v0(com.tencent.mm.plugin.fav.ui.gallery.h0 h0Var) {
        this.f101088d = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/gallery/FavMediaHistoryGallery$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f101088d.j();
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/gallery/FavMediaHistoryGallery$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
