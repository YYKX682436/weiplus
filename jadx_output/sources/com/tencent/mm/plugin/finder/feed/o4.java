package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class o4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f108619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f108620e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f108621f;

    public o4(com.tencent.mm.plugin.finder.feed.a7 a7Var, so2.y0 y0Var, android.view.View view) {
        this.f108619d = a7Var;
        this.f108620e = y0Var;
        this.f108621f = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f108619d;
        yw2.a0 a0Var = a7Var.f106216o;
        if (a0Var != null) {
            com.tencent.mm.plugin.finder.view.FinderCommentFooter n17 = a0Var.n();
            int i17 = a7Var.f106215n;
            n17.i(i17, this.f108620e.f410703d, i17 == 2);
        }
        com.tencent.mm.plugin.finder.feed.a7.A(a7Var, this.f108621f);
    }
}
