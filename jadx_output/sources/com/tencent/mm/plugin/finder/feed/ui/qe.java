package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class qe implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWhiteListUI f110455d;

    public qe(com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWhiteListUI finderLiveVisitorWhiteListUI) {
        this.f110455d = finderLiveVisitorWhiteListUI;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.finder.feed.ui.vd vdVar;
        com.tencent.mm.plugin.finder.feed.ui.vd vdVar2;
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.feed.ui.ud udVar = com.tencent.mm.plugin.finder.feed.ui.ud.f110604d;
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWhiteListUI finderLiveVisitorWhiteListUI = this.f110455d;
        if (itemId != 1) {
            com.tencent.mm.plugin.finder.feed.ui.ud udVar2 = com.tencent.mm.plugin.finder.feed.ui.ud.f110605e;
            if (itemId != 2 || finderLiveVisitorWhiteListUI.Y == udVar2) {
                return;
            }
            finderLiveVisitorWhiteListUI.f7();
            java.lang.String str = finderLiveVisitorWhiteListUI.f109433y0;
            finderLiveVisitorWhiteListUI.q7(!(str == null || str.length() == 0) ? com.tencent.mm.plugin.finder.feed.ui.vd.f110650e : com.tencent.mm.plugin.finder.feed.ui.vd.f110654i);
            finderLiveVisitorWhiteListUI.p7(udVar2);
            finderLiveVisitorWhiteListUI.s7(finderLiveVisitorWhiteListUI.X, finderLiveVisitorWhiteListUI.Y);
            if (finderLiveVisitorWhiteListUI.m7() && (vdVar = finderLiveVisitorWhiteListUI.X) == com.tencent.mm.plugin.finder.feed.ui.vd.f110650e) {
                finderLiveVisitorWhiteListUI.r7(vdVar);
                return;
            }
            return;
        }
        if (finderLiveVisitorWhiteListUI.Y == udVar) {
            return;
        }
        finderLiveVisitorWhiteListUI.f7();
        java.lang.String str2 = finderLiveVisitorWhiteListUI.f109433y0;
        if (!(str2 == null || str2.length() == 0) || (!finderLiveVisitorWhiteListUI.f109424l1.isEmpty())) {
            finderLiveVisitorWhiteListUI.d7();
            finderLiveVisitorWhiteListUI.q7(com.tencent.mm.plugin.finder.feed.ui.vd.f110650e);
        } else {
            finderLiveVisitorWhiteListUI.q7(com.tencent.mm.plugin.finder.feed.ui.vd.f110649d);
        }
        finderLiveVisitorWhiteListUI.p7(udVar);
        finderLiveVisitorWhiteListUI.o7(0);
        finderLiveVisitorWhiteListUI.s7(finderLiveVisitorWhiteListUI.X, finderLiveVisitorWhiteListUI.Y);
        if (!finderLiveVisitorWhiteListUI.m7() || (vdVar2 = finderLiveVisitorWhiteListUI.X) == com.tencent.mm.plugin.finder.feed.ui.vd.f110649d || vdVar2 == com.tencent.mm.plugin.finder.feed.ui.vd.f110652g) {
            return;
        }
        finderLiveVisitorWhiteListUI.r7(vdVar2);
    }
}
