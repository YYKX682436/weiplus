package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class p4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderMemberFeedLoader f108248d;

    public p4(com.tencent.mm.plugin.finder.feed.model.FinderMemberFeedLoader finderMemberFeedLoader) {
        this.f108248d = finderMemberFeedLoader;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f108248d.f107506d;
        if (recyclerView != null) {
            recyclerView.D0();
        }
    }
}
