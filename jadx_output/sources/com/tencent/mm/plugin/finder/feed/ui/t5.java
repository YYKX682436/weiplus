package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class t5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderHotSearchUI f110555d;

    public t5(com.tencent.mm.plugin.finder.feed.ui.FinderHotSearchUI finderHotSearchUI) {
        this.f110555d = finderHotSearchUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.search.b4 b4Var = this.f110555d.f109300u;
        if (b4Var != null) {
            b4Var.b();
        }
    }
}
