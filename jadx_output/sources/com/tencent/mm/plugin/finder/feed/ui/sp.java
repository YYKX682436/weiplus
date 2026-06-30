package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class sp implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40 f110547d;

    public sp(com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40 occupyFinderUI40) {
        this.f110547d = occupyFinderUI40;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40 occupyFinderUI40 = this.f110547d;
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = occupyFinderUI40.C;
        if (fTSSearchView == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        occupyFinderUI40.g7(fTSSearchView.getFtsEditText().getEditText().getText().toString());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
