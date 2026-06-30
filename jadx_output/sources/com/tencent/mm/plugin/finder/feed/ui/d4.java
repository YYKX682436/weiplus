package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class d4 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderGalleryTimelineUI f109933d;

    public d4(com.tencent.mm.plugin.finder.feed.ui.FinderGalleryTimelineUI finderGalleryTimelineUI) {
        this.f109933d = finderGalleryTimelineUI;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderGalleryTimelineUI$mOnHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.finder.feed.ui.FinderGalleryTimelineUI finderGalleryTimelineUI = this.f109933d;
        android.widget.TextView textView = finderGalleryTimelineUI.f109271z;
        if (textView == null) {
            kotlin.jvm.internal.o.o("selectTv");
            throw null;
        }
        textView.setClickable(i17 == 0);
        if (i17 == 0 && !finderGalleryTimelineUI.C) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_GALLERY_TIMELINE_MORE_VIDEO_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            finderGalleryTimelineUI.C = true;
            android.widget.LinearLayout linearLayout = finderGalleryTimelineUI.A;
            if (linearLayout == null) {
                kotlin.jvm.internal.o.o("moreViewLayout");
                throw null;
            }
            linearLayout.setVisibility(8);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderGalleryTimelineUI$mOnHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderGalleryTimelineUI$mOnHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderGalleryTimelineUI$mOnHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
