package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class or implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.xr f108676d;

    public or(com.tencent.mm.plugin.finder.feed.xr xrVar) {
        this.f108676d = xrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(this.f108676d.f111097f.m(), false, 1, null);
    }
}
