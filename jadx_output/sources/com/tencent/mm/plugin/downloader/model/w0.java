package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class w0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.model.y0 f97189d;

    public w0(com.tencent.mm.plugin.downloader.model.y0 y0Var) {
        this.f97189d = y0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.downloader.model.y0 y0Var = this.f97189d;
        y0Var.getClass();
        gm0.j1.e().j(new com.tencent.mm.plugin.downloader.model.x0(y0Var));
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = y0Var.f97203e;
        if (!(copyOnWriteArraySet == null || copyOnWriteArraySet.size() == 0)) {
            y0Var.f97204f.c(1000L, 1000L);
        }
        return false;
    }
}
