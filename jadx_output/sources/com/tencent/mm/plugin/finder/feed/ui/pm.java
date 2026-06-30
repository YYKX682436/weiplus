package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class pm implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderTimelineLbsUI f110428d;

    public pm(com.tencent.mm.plugin.finder.feed.ui.FinderTimelineLbsUI finderTimelineLbsUI) {
        this.f110428d = finderTimelineLbsUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.finder.feed.ui.FinderTimelineLbsUI.f109567t;
        com.tencent.mm.plugin.finder.viewmodel.component.j80 j80Var = (com.tencent.mm.plugin.finder.viewmodel.component.j80) this.f110428d.component(com.tencent.mm.plugin.finder.viewmodel.component.j80.class);
        com.tencent.mm.plugin.finder.feed.zu zuVar = j80Var.f134830d;
        if (zuVar != null) {
            zuVar.h(false);
        }
        com.tencent.mm.plugin.finder.feed.yt ytVar = j80Var.f134831e;
        if (ytVar != null) {
            ytVar.i(false);
        }
    }
}
