package com.tencent.mm.plugin.finder.gallery;

/* loaded from: classes2.dex */
public final class n implements com.tencent.mm.plugin.finder.feed.model.internal.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.gallery.FinderGalleryFragment f111393a;

    public n(com.tencent.mm.plugin.finder.gallery.FinderGalleryFragment finderGalleryFragment) {
        this.f111393a = finderGalleryFragment;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.q0
    public void call(int i17) {
        com.tencent.mm.plugin.finder.gallery.FinderGalleryFragment finderGalleryFragment = this.f111393a;
        com.tencent.mm.plugin.finder.gallery.v0 v0Var = finderGalleryFragment.f111331x;
        if (v0Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        android.view.View t17 = v0Var.t();
        if (t17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(t17, arrayList.toArray(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryFragment$initOnCreate$2$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            t17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(t17, "com/tencent/mm/plugin/finder/gallery/FinderGalleryFragment$initOnCreate$2$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.finder.gallery.v0 v0Var2 = finderGalleryFragment.f111331x;
            if (v0Var2 != null) {
                v0Var2.getRecyclerView().setVisibility(0);
            } else {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
        }
    }
}
