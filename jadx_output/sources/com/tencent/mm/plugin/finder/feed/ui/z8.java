package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class z8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveCreateVisitorModeUI f110795d;

    public z8(com.tencent.mm.plugin.finder.feed.ui.FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI) {
        this.f110795d = finderLiveCreateVisitorModeUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI = this.f110795d;
        if (finderLiveCreateVisitorModeUI.P == null) {
            finderLiveCreateVisitorModeUI.P = new com.tencent.mm.ui.tools.f5(finderLiveCreateVisitorModeUI);
            com.tencent.mm.plugin.finder.feed.ui.FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI2 = this.f110795d;
            com.tencent.mm.ui.tools.f5 f5Var = finderLiveCreateVisitorModeUI2.P;
            if (f5Var != null) {
                f5Var.f210400e = new com.tencent.mm.plugin.finder.feed.ui.y8(finderLiveCreateVisitorModeUI2);
            }
        }
        com.tencent.mm.ui.tools.f5 f5Var2 = this.f110795d.P;
        if (f5Var2 != null) {
            f5Var2.f();
        }
    }
}
