package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class z0 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavCleanUI f101638d;

    public z0(com.tencent.mm.plugin.fav.ui.FavCleanUI favCleanUI) {
        this.f101638d = favCleanUI;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/FavCleanUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavCleanUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/FavCleanUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (i17 == 0) {
            com.tencent.mm.plugin.fav.ui.FavCleanUI favCleanUI = this.f101638d;
            android.widget.ListView listView = favCleanUI.f100309g;
            if (listView.getChildAt(listView.getChildCount() - 1) != null && favCleanUI.f100309g.getLastVisiblePosition() == favCleanUI.f100309g.getAdapter().getCount() - 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FavCleanUI", "at bottom call back");
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FavCleanUI", "force bottom load data");
                favCleanUI.f100307e.getClass();
                if (favCleanUI.f100308f) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.FavCleanUI", "onBottomLoadData loading, return");
                } else {
                    favCleanUI.f100308f = true;
                    if (favCleanUI.f100309g.getFooterViewsCount() == 0) {
                        favCleanUI.f100309g.addFooterView(favCleanUI.f100314o);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.FavCleanUI", "on bottom load data listener");
                    com.tencent.mm.sdk.platformtools.n3 n3Var = favCleanUI.f100313n;
                    java.lang.Runnable runnable = favCleanUI.B;
                    n3Var.removeCallbacks(runnable);
                    favCleanUI.f100313n.post(runnable);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavCleanUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
