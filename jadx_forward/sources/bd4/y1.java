package bd4;

/* loaded from: classes4.dex */
public final class y1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bd4.f2 f100950d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f100951e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f100952f;

    public y1(bd4.f2 f2Var, int i17, boolean z17) {
        this.f100950d = f2Var;
        this.f100951e = i17;
        this.f100952f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$onListViewScrollEnd$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getListViewScrollVersion$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        bd4.f2 f2Var = this.f100950d;
        int i17 = f2Var.f100874v;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getListViewScrollVersion$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        if (i17 != this.f100951e) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$onListViewScrollEnd$1");
            return;
        }
        wl5.x m17 = f2Var.m();
        if (m17 != null) {
            m17.L = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setListViewScrolling$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        f2Var.f100873u = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setListViewScrolling$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        if (this.f100952f) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$onListViewScrollEnd$1");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$isSelectionOutOfVisibleArea", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        boolean t17 = f2Var.t();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$isSelectionOutOfVisibleArea", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        if (t17) {
            f2Var.k();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$onListViewScrollEnd$1");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$restoreCursorHandleIfAllowed", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        f2Var.y(true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$restoreCursorHandleIfAllowed", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$isDownInSelectionOnTouch$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        boolean z17 = f2Var.f100869q;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$isDownInSelectionOnTouch$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setDownInSelectionOnTouch$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            f2Var.f100869q = false;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setDownInSelectionOnTouch$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$showOperateMenuInternal", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            f2Var.E();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$showOperateMenuInternal", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$onListViewScrollEnd$1");
    }
}
