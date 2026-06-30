package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class bp implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI34 f109732d;

    public bp(com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI34 occupyFinderUI34) {
        this.f109732d = occupyFinderUI34;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI34 occupyFinderUI34 = this.f109732d;
        occupyFinderUI34.finish();
        occupyFinderUI34.c7(-2, "");
    }
}
