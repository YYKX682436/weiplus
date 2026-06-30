package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.d2 f110787d;

    public z1(com.tencent.mm.plugin.finder.feed.ui.d2 d2Var) {
        this.f110787d = d2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.feed.ui.d2 d2Var = this.f110787d;
        com.tencent.mm.view.RefreshLoadMoreLayout a17 = d2Var.a(d2Var);
        if (a17 == null) {
            return;
        }
        d2Var.f109927g = a17;
        if (a17.getOverCallback() != null) {
            return;
        }
        a17.setOverCallback(new com.tencent.mm.plugin.finder.feed.ui.y1());
    }
}
