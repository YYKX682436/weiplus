package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class ok implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderSelfHistoryUI f110381d;

    public ok(com.tencent.mm.plugin.finder.feed.ui.FinderSelfHistoryUI finderSelfHistoryUI) {
        this.f110381d = finderSelfHistoryUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        com.tencent.mm.plugin.finder.feed.ui.FinderSelfHistoryUI finderSelfHistoryUI = this.f110381d;
        androidx.appcompat.app.AppCompatActivity context = finderSelfHistoryUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, context, intent, 0L, null, 0, 0, false, 0, null, 508, null);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).getClass();
        intent.setClass(finderSelfHistoryUI, com.tencent.mm.plugin.finder.ui.FinderAggregationSettingUI.class);
        finderSelfHistoryUI.startActivityForResult(intent, 1);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(finderSelfHistoryUI);
        r45.qt2 V6 = e17 != null ? e17.V6() : null;
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("finder_context_id", V6 != null ? V6.getString(1) : null);
        lVarArr[1] = new jz5.l("finder_tab_context_id", V6 != null ? V6.getString(2) : null);
        lVarArr[2] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : null);
        ((cy1.a) rVar).Bj("recently_browse_more", "view_clk", kz5.c1.k(lVarArr), 1, false);
        return true;
    }
}
