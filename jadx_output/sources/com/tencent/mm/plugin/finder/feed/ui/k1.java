package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes10.dex */
public final class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderCommentUI f110208d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.b5 f110209e;

    public k1(com.tencent.mm.plugin.finder.feed.ui.FinderCommentUI finderCommentUI, com.tencent.mm.plugin.finder.view.b5 b5Var) {
        this.f110208d = finderCommentUI;
        this.f110209e = b5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.view.FinderCommentDrawer d76 = this.f110208d.d7();
        com.tencent.mm.plugin.finder.view.b5 b5Var = this.f110209e;
        com.tencent.mm.plugin.finder.view.FinderCommentDrawer.v(d76, b5Var.f131690a, b5Var.f131691b, b5Var.f131692c, b5Var.f131693d, b5Var.f131694e, b5Var.f131695f, true, false, 0, false, 0L, 0, 0, null, 0, 32640, null);
    }
}
