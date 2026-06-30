package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class qa implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveLotteryCreateUI f110450d;

    public qa(com.tencent.mm.plugin.finder.feed.ui.FinderLiveLotteryCreateUI finderLiveLotteryCreateUI) {
        this.f110450d = finderLiveLotteryCreateUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveLotteryCreateUI finderLiveLotteryCreateUI = this.f110450d;
        finderLiveLotteryCreateUI.hideVKB();
        finderLiveLotteryCreateUI.finish();
        finderLiveLotteryCreateUI.overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477877e1);
        return true;
    }
}
