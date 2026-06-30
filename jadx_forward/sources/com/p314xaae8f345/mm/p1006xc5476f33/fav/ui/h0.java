package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class h0 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800 f182657d;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800 abstractActivityC13548xbf543800) {
        this.f182657d = abstractActivityC13548xbf543800;
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
            o72.k4 oj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj();
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800 abstractActivityC13548xbf543800 = this.f182657d;
            if (oj6.a3(abstractActivityC13548xbf543800.d7().f182006d, abstractActivityC13548xbf543800.d7().f182007e)) {
                long j17 = abstractActivityC13548xbf543800.d7().f182006d;
                if (abstractActivityC13548xbf543800.f181816x == null) {
                    abstractActivityC13548xbf543800.f181816x = android.view.LayoutInflater.from(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570291ab4, (android.view.ViewGroup) null);
                }
                if (!abstractActivityC13548xbf543800.f181817y) {
                    abstractActivityC13548xbf543800.f181803h.addFooterView(abstractActivityC13548xbf543800.f181816x);
                    abstractActivityC13548xbf543800.f181817y = true;
                }
                yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavBaseUI$5", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
                return;
            }
            android.widget.ListView listView = abstractActivityC13548xbf543800.f181803h;
            if (listView.getChildAt(listView.getChildCount() - 1) != null && abstractActivityC13548xbf543800.f181803h.getLastVisiblePosition() == abstractActivityC13548xbf543800.f181803h.getAdapter().getCount() - 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteBaseUI", "at bottom call back");
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteBaseUI", "force bottom load data");
                if (!((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().a3(abstractActivityC13548xbf543800.d7().f182006d, abstractActivityC13548xbf543800.d7().f182007e)) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = o72.x1.f425048a;
                    if (o72.j5.f424904m.get() > 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavoriteBaseUI", "doing batchget, do not load data");
                    } else if (abstractActivityC13548xbf543800.f181799d) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavoriteBaseUI", "onBottomLoadData loading, return");
                    } else {
                        abstractActivityC13548xbf543800.f181799d = true;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteBaseUI", "on bottom load data listener");
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = abstractActivityC13548xbf543800.f181809q;
                        java.lang.Runnable runnable = abstractActivityC13548xbf543800.L;
                        n3Var.mo50300x3fa464aa(runnable);
                        abstractActivityC13548xbf543800.f181809q.mo50293x3498a0(runnable);
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavBaseUI$5", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
