package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class rt implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.yt f108943d;

    public rt(com.tencent.mm.plugin.finder.feed.yt ytVar) {
        this.f108943d = ytVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ym5.s3 s3Var = new ym5.s3(0);
        s3Var.f463517b = -2;
        com.tencent.mm.view.RefreshLoadMoreLayout f17 = this.f108943d.h().f();
        if (f17 != null) {
            f17.Q(s3Var);
        }
    }
}
