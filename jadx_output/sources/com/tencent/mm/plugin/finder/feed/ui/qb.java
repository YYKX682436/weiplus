package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes11.dex */
public final class qb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSelectContactUI f110451d;

    public qb(com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSelectContactUI finderLivePostSelectContactUI) {
        this.f110451d = finderLivePostSelectContactUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSelectContactUI finderLivePostSelectContactUI = this.f110451d;
        finderLivePostSelectContactUI.onBackPressed();
        finderLivePostSelectContactUI.getClass();
        finderLivePostSelectContactUI.overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477877e1);
    }
}
