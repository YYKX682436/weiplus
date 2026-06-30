package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class v8 implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveCreateVisitorModeUI f110644a;

    public v8(com.tencent.mm.plugin.finder.feed.ui.FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI) {
        this.f110644a = finderLiveCreateVisitorModeUI;
    }

    @Override // fp0.p
    public void a(fp0.d task, fp0.u status) {
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(status, "status");
        mv2.n0 n0Var = (mv2.n0) task;
        fp0.u uVar = fp0.u.f265290f;
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI = this.f110644a;
        if (status == uVar && !com.tencent.mm.sdk.platformtools.t8.K0(n0Var.f331609h)) {
            finderLiveCreateVisitorModeUI.f109354J = n0Var.f331609h;
            com.tencent.mm.plugin.finder.feed.ui.FinderLiveCreateVisitorModeUI.d7(finderLiveCreateVisitorModeUI);
            return;
        }
        com.tencent.mars.xlog.Log.e(finderLiveCreateVisitorModeUI.f109355v, "upload avatar fail,status:" + status);
        finderLiveCreateVisitorModeUI.e7(true);
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.ui.u8(finderLiveCreateVisitorModeUI));
    }
}
