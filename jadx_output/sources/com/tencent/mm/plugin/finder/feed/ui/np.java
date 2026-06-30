package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class np implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39 f110354d;

    public np(com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39 occupyFinderUI39) {
        this.f110354d = occupyFinderUI39;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39 occupyFinderUI39 = this.f110354d;
        if (occupyFinderUI39.A == null) {
            occupyFinderUI39.A = new com.tencent.mm.ui.tools.f5(occupyFinderUI39);
            com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI39 occupyFinderUI392 = this.f110354d;
            com.tencent.mm.ui.tools.f5 f5Var = occupyFinderUI392.A;
            if (f5Var != null) {
                f5Var.f210400e = new com.tencent.mm.plugin.finder.feed.ui.mp(occupyFinderUI392);
            }
        }
        com.tencent.mm.ui.tools.f5 f5Var2 = this.f110354d.A;
        if (f5Var2 != null) {
            f5Var2.f();
        }
    }
}
