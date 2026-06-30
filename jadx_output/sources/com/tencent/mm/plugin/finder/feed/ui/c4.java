package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class c4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderGalleryTimelineUI f109741d;

    public c4(com.tencent.mm.plugin.finder.feed.ui.FinderGalleryTimelineUI finderGalleryTimelineUI) {
        this.f109741d = finderGalleryTimelineUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.content.Intent intent;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderGalleryTimelineUI$initOnCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.feed.ui.FinderGalleryTimelineUI finderGalleryTimelineUI = this.f109741d;
        com.tencent.mm.plugin.finder.gallery.t0 t0Var = finderGalleryTimelineUI.f109270y;
        if (t0Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        if (t0Var.getRecyclerView().getLayoutManager() instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) {
            com.tencent.mm.plugin.finder.gallery.t0 t0Var2 = finderGalleryTimelineUI.f109270y;
            if (t0Var2 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = t0Var2.getRecyclerView().getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
            int w17 = ((com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager).w();
            android.content.Intent intent2 = new android.content.Intent();
            com.tencent.mm.plugin.finder.gallery.FinderGalleryLoader finderGalleryLoader = finderGalleryTimelineUI.B;
            if (finderGalleryLoader == null) {
                kotlin.jvm.internal.o.o("feedLoader");
                throw null;
            }
            java.lang.Object obj = finderGalleryLoader.getDataList().get(w17);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj;
            long intExtra = finderGalleryTimelineUI.getIntent().getIntExtra("MINI_DURATION", -1) * 1000;
            long intExtra2 = finderGalleryTimelineUI.getIntent().getIntExtra("MAX_DURATION", -1) * 1000;
            if (intExtra < 0 && intExtra2 <= 0) {
                intent = intent2;
            } else {
                if (baseFinderFeed.h() != 4) {
                    db5.t7.makeText(finderGalleryTimelineUI, com.tencent.mm.R.string.eq8, 0).show();
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderGalleryTimelineUI$initOnCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(baseFinderFeed.getFeedObject().getMediaList());
                long j17 = mb4Var != null ? mb4Var.getLong(24) : 0L;
                intent = intent2;
                com.tencent.mars.xlog.Log.i("GalleryTimelineUI", "onItemClick: videoDurationMs=" + j17 + ", miniVideoDurationMs=" + intExtra + ", maxVideoDurationMs=" + intExtra2 + ", position=" + w17);
                if (j17 < intExtra) {
                    db5.t7.makeText(finderGalleryTimelineUI, finderGalleryTimelineUI.getResources().getString(com.tencent.mm.R.string.eq6, java.lang.Long.valueOf(intExtra / 1000)), 0).show();
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderGalleryTimelineUI$initOnCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                } else if (j17 > intExtra2) {
                    db5.t7.makeText(finderGalleryTimelineUI, finderGalleryTimelineUI.getResources().getString(com.tencent.mm.R.string.f491945lk2, java.lang.Long.valueOf(intExtra2 / 1000)), 0).show();
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderGalleryTimelineUI$initOnCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
            }
            android.content.Intent intent3 = intent;
            intent3.putExtra("SELECT_OBJECT", baseFinderFeed.getFeedObject().getFeedObject().toByteArray());
            intent3.putExtra("TAB_TYPE", finderGalleryTimelineUI.D);
            finderGalleryTimelineUI.setResult(-1, intent3);
            super/*com.tencent.mm.plugin.finder.ui.MMFinderUI*/.finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderGalleryTimelineUI$initOnCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
