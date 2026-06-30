package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class gt implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RefreshLoadMoreLayout f106861d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f106862e;

    public gt(com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout, boolean z17) {
        this.f106861d = refreshLoadMoreLayout;
        this.f106862e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f106861d.L(this.f106862e);
    }
}
