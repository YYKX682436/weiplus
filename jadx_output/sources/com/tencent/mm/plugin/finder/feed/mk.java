package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class mk implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.tl f107386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f107387e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f107388f;

    public mk(com.tencent.mm.plugin.finder.feed.tl tlVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f107386d = tlVar;
        this.f107387e = baseFinderFeed;
        this.f107388f = k0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        kotlin.jvm.internal.o.d(g4Var);
        com.tencent.mm.plugin.finder.feed.tl tlVar = this.f107386d;
        tlVar.getClass();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed feed = this.f107387e;
        kotlin.jvm.internal.o.g(feed, "feed");
        com.tencent.mm.ui.widget.dialog.k0 sheet = this.f107388f;
        kotlin.jvm.internal.o.g(sheet, "sheet");
        if (!feed.getFeedObject().checkIsEnableShare(102) || hc2.o0.A(feed.getFeedObject().getFeedObject())) {
            return;
        }
        com.tencent.mm.plugin.finder.assist.n7.f102406a.d(tlVar.f109069d, tlVar.f109073h, feed, g4Var, sheet);
    }
}
