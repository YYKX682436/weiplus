package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class h0 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavBaseUI f101124d;

    public h0(com.tencent.mm.plugin.fav.ui.FavBaseUI favBaseUI) {
        this.f101124d = favBaseUI;
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
        yj0.a.b("com/tencent/mm/plugin/fav/ui/FavBaseUI$5", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavBaseUI$5", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/FavBaseUI$5", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (i17 == 0) {
            o72.k4 oj6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj();
            com.tencent.mm.plugin.fav.ui.FavBaseUI favBaseUI = this.f101124d;
            if (oj6.a3(favBaseUI.d7().f100473d, favBaseUI.d7().f100474e)) {
                long j17 = favBaseUI.d7().f100473d;
                if (favBaseUI.f100283x == null) {
                    favBaseUI.f100283x = android.view.LayoutInflater.from(com.tencent.mm.sdk.platformtools.x2.f193071a).inflate(com.tencent.mm.R.layout.f488758ab4, (android.view.ViewGroup) null);
                }
                if (!favBaseUI.f100284y) {
                    favBaseUI.f100270h.addFooterView(favBaseUI.f100283x);
                    favBaseUI.f100284y = true;
                }
                yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavBaseUI$5", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
                return;
            }
            android.widget.ListView listView = favBaseUI.f100270h;
            if (listView.getChildAt(listView.getChildCount() - 1) != null && favBaseUI.f100270h.getLastVisiblePosition() == favBaseUI.f100270h.getAdapter().getCount() - 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteBaseUI", "at bottom call back");
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteBaseUI", "force bottom load data");
                if (!((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().a3(favBaseUI.d7().f100473d, favBaseUI.d7().f100474e)) {
                    com.tencent.mm.sdk.platformtools.o4 o4Var = o72.x1.f343515a;
                    if (o72.j5.f343371m.get() > 0) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteBaseUI", "doing batchget, do not load data");
                    } else if (favBaseUI.f100266d) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteBaseUI", "onBottomLoadData loading, return");
                    } else {
                        favBaseUI.f100266d = true;
                        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteBaseUI", "on bottom load data listener");
                        com.tencent.mm.sdk.platformtools.n3 n3Var = favBaseUI.f100276q;
                        java.lang.Runnable runnable = favBaseUI.L;
                        n3Var.removeCallbacks(runnable);
                        favBaseUI.f100276q.post(runnable);
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavBaseUI$5", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
