package com.tencent.mm.plugin.finder.gallery;

/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.gallery.FinderGalleryFragment f111396d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.plugin.finder.gallery.FinderGalleryFragment finderGalleryFragment) {
        super(1);
        this.f111396d = finderGalleryFragment;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse it = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (!((com.tencent.mm.plugin.finder.gallery.s) it).getHasMore()) {
            com.tencent.mm.plugin.finder.gallery.FinderGalleryFragment finderGalleryFragment = this.f111396d;
            com.tencent.mm.plugin.finder.gallery.v0 v0Var = finderGalleryFragment.f111331x;
            if (v0Var == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = v0Var.f106180m;
            com.tencent.mm.plugin.finder.gallery.FinderGalleryLoader finderGalleryLoader = finderGalleryFragment.f111332y;
            if (finderGalleryLoader == null) {
                kotlin.jvm.internal.o.o("feedLoader");
                throw null;
            }
            refreshLoadMoreLayout.setEnableLoadMore(finderGalleryLoader.getSize() > 10);
            com.tencent.mm.plugin.finder.gallery.v0 v0Var2 = finderGalleryFragment.f111331x;
            if (v0Var2 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x = v0Var2.f106180m.getF213435x();
            if (f213435x != null && (textView2 = (android.widget.TextView) f213435x.findViewById(com.tencent.mm.R.id.ili)) != null) {
                textView2.setText(com.tencent.mm.R.string.f491896el3);
            }
            com.tencent.mm.plugin.finder.gallery.v0 v0Var3 = finderGalleryFragment.f111331x;
            if (v0Var3 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x2 = v0Var3.f106180m.getF213435x();
            if (f213435x2 != null && (textView = (android.widget.TextView) f213435x2.findViewById(com.tencent.mm.R.id.ili)) != null) {
                textView.setTextColor(finderGalleryFragment.getResources().getColor(com.tencent.mm.R.color.FG_2));
            }
            com.tencent.mm.plugin.finder.gallery.v0 v0Var4 = finderGalleryFragment.f111331x;
            if (v0Var4 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x3 = v0Var4.f106180m.getF213435x();
            android.widget.TextView textView3 = f213435x3 != null ? (android.widget.TextView) f213435x3.findViewById(com.tencent.mm.R.id.ili) : null;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            com.tencent.mm.plugin.finder.gallery.v0 v0Var5 = finderGalleryFragment.f111331x;
            if (v0Var5 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x4 = v0Var5.f106180m.getF213435x();
            android.view.View findViewById = f213435x4 != null ? f213435x4.findViewById(com.tencent.mm.R.id.ilg) : null;
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                android.view.View view = findViewById;
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryFragment$initOnCreate$2$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/gallery/FinderGalleryFragment$initOnCreate$2$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return jz5.f0.f302826a;
    }
}
