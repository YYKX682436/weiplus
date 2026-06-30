package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes10.dex */
public final class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderCommentUI f110135d;

    public i1(com.tencent.mm.plugin.finder.feed.ui.FinderCommentUI finderCommentUI) {
        this.f110135d = finderCommentUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f110135d.finish();
    }
}
