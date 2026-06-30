package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class ze implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWithoutAffinityUI f110801d;

    public ze(com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWithoutAffinityUI finderLiveVisitorWithoutAffinityUI) {
        this.f110801d = finderLiveVisitorWithoutAffinityUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWithoutAffinityUI finderLiveVisitorWithoutAffinityUI = this.f110801d;
        if (finderLiveVisitorWithoutAffinityUI.getIntent().getBooleanExtra("intent_key_ignore_back", false)) {
            pm0.z.b(xy2.b.f458155b, "intent_key_ignore_back", false, null, null, false, false, null, 124, null);
            finderLiveVisitorWithoutAffinityUI.getIntent().removeExtra("intent_key_ignore_back");
        }
    }
}
