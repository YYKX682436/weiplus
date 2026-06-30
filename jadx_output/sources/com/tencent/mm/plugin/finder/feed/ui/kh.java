package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class kh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderPoiAddGuideUI f110237d;

    public kh(com.tencent.mm.plugin.finder.feed.ui.FinderPoiAddGuideUI finderPoiAddGuideUI) {
        this.f110237d = finderPoiAddGuideUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderPoiAddGuideUI$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.feed.ui.FinderPoiAddGuideUI finderPoiAddGuideUI = this.f110237d;
        if (finderPoiAddGuideUI.f109482y) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("EXTRA_FROM_GUIDE", true);
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Wk(finderPoiAddGuideUI, intent, 0);
        } else {
            com.tencent.mars.xlog.Log.i("Finder.FinderPoiAddGuideUI", "licence is not check");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderPoiAddGuideUI$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
