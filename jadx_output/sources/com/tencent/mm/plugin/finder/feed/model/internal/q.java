package com.tencent.mm.plugin.finder.feed.model.internal;

/* loaded from: classes2.dex */
public final class q implements com.tencent.mm.plugin.finder.feed.model.internal.n0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader f108041d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.n0 f108042e;

    public q(com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var) {
        this.f108041d = baseFeedLoader;
        this.f108042e = n0Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        com.tencent.mm.plugin.finder.feed.model.internal.s0 s0Var;
        kotlin.jvm.internal.o.g(response, "response");
        s0Var = this.f108041d.preload;
        if (s0Var != null) {
            com.tencent.mm.plugin.finder.feed.model.internal.w0 w0Var = (com.tencent.mm.plugin.finder.feed.model.internal.w0) s0Var;
            w0Var.f108066d.lock();
            try {
                w0Var.f108065c = response;
                w0Var.f108067e.signalAll();
            } finally {
                w0Var.f108064b = false;
                w0Var.f108066d.unlock();
            }
        }
        com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var = this.f108042e;
        if (n0Var != null) {
            n0Var.onFetchDone(response);
        }
    }
}
