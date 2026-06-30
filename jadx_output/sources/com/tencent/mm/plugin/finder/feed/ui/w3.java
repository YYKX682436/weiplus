package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class w3 implements com.tencent.mm.plugin.finder.search.q4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderGallerySearchUI f110684a;

    public w3(com.tencent.mm.plugin.finder.feed.ui.FinderGallerySearchUI finderGallerySearchUI) {
        this.f110684a = finderGallerySearchUI;
    }

    @Override // com.tencent.mm.plugin.finder.search.q4
    public void a(int i17) {
        com.tencent.mm.plugin.finder.feed.ui.FinderGallerySearchUI finderGallerySearchUI = this.f110684a;
        if (i17 != 0) {
            com.tencent.mm.ui.search.FTSSearchView fTSSearchView = finderGallerySearchUI.f109264v;
            if (fTSSearchView == null) {
                kotlin.jvm.internal.o.o("searchView");
                throw null;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(fTSSearchView.getFtsEditText().getEditText().getText().toString())) {
                return;
            }
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = finderGallerySearchUI.E;
            if (refreshLoadMoreLayout != null) {
                refreshLoadMoreLayout.setVisibility(0);
                return;
            } else {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
        }
        android.view.View view = finderGallerySearchUI.H;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderGallerySearchUI$initSuggestion$2", "onVisibleChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/FinderGallerySearchUI$initSuggestion$2", "onVisibleChange", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = finderGallerySearchUI.G;
        if (textView == null) {
            kotlin.jvm.internal.o.o("noResultView");
            throw null;
        }
        textView.setVisibility(8);
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = finderGallerySearchUI.E;
        if (refreshLoadMoreLayout2 != null) {
            refreshLoadMoreLayout2.setVisibility(8);
        } else {
            kotlin.jvm.internal.o.o("rlLayout");
            throw null;
        }
    }
}
