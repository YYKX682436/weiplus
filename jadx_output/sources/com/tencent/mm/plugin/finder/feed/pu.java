package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class pu implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.zu f108746d;

    public pu(com.tencent.mm.plugin.finder.feed.zu zuVar) {
        this.f108746d = zuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ym5.s3 s3Var = new ym5.s3(0);
        s3Var.f463517b = -2;
        com.tencent.mm.view.RefreshLoadMoreLayout f17 = this.f108746d.g().f();
        if (f17 != null) {
            f17.Q(s3Var);
        }
    }
}
