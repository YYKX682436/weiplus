package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class wf implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI f110697d;

    public wf(com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI finderLoaderFeedUI) {
        this.f110697d = finderLoaderFeedUI;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 10000) {
            this.f110697d.finish();
            new com.tencent.mm.autogen.events.FinderPostPreviewDelSourceEvent().e();
        }
    }
}
