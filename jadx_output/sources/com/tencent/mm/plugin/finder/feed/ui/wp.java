package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class wp implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40 f110712d;

    public wp(com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40 occupyFinderUI40) {
        this.f110712d = occupyFinderUI40;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40 occupyFinderUI40 = this.f110712d;
        if (occupyFinderUI40.E == null) {
            occupyFinderUI40.E = new com.tencent.mm.ui.tools.f5(occupyFinderUI40);
            com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI40 occupyFinderUI402 = this.f110712d;
            com.tencent.mm.ui.tools.f5 f5Var = occupyFinderUI402.E;
            if (f5Var != null) {
                f5Var.f210400e = new com.tencent.mm.plugin.finder.feed.ui.vp(occupyFinderUI402);
            }
        }
        com.tencent.mm.ui.tools.f5 f5Var2 = this.f110712d.E;
        if (f5Var2 != null) {
            f5Var2.f();
        }
    }
}
