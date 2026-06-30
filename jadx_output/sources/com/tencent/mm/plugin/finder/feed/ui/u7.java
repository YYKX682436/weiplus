package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class u7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorUI f110597d;

    public u7(com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorUI finderLiveAnchorUI) {
        this.f110597d = finderLiveAnchorUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorUI finderLiveAnchorUI = this.f110597d;
        if (finderLiveAnchorUI.f109335y == null) {
            androidx.appcompat.app.AppCompatActivity context = finderLiveAnchorUI.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            finderLiveAnchorUI.f109335y = new com.tencent.mm.ui.tools.f5(context);
            com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorUI finderLiveAnchorUI2 = this.f110597d;
            com.tencent.mm.ui.tools.f5 f5Var = finderLiveAnchorUI2.f109335y;
            if (f5Var != null) {
                f5Var.f210400e = new com.tencent.mm.plugin.finder.feed.ui.t7(finderLiveAnchorUI2);
            }
        }
        com.tencent.mm.ui.tools.f5 f5Var2 = this.f110597d.f109335y;
        if (f5Var2 != null) {
            f5Var2.f();
        }
    }
}
