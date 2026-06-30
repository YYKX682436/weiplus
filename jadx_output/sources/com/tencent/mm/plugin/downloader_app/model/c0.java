package com.tencent.mm.plugin.downloader_app.model;

/* loaded from: classes14.dex */
public class c0 implements uh4.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.model.l0 f97262d;

    public c0(com.tencent.mm.plugin.downloader_app.model.l0 l0Var) {
        this.f97262d = l0Var;
    }

    @Override // uh4.i0
    public void onDataChanged() {
        boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(isTeenMode);
        com.tencent.mm.plugin.downloader_app.model.l0 l0Var = this.f97262d;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameDownloadFloatBallHelper", "onTeenModeDataChanged isTeenMode: %s, taskList.empty(): %s", valueOf, java.lang.Boolean.valueOf(l0Var.f97296u.isEmpty()));
        if (isTeenMode && l0Var.u()) {
            l0Var.d();
        }
    }
}
