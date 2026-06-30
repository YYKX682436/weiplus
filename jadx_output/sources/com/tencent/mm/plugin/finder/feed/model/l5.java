package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class l5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader f108153d;

    public l5(com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader finderPoiFeedLoader) {
        this.f108153d = finderPoiFeedLoader;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader finderPoiFeedLoader = this.f108153d;
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse<so2.j5> iResponse = finderPoiFeedLoader.f107548u;
        kotlin.jvm.internal.o.d(iResponse);
        finderPoiFeedLoader.notifyFetchDone(iResponse);
    }
}
