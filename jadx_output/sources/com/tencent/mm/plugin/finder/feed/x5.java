package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class x5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f111037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f111038e;

    public x5(com.tencent.mm.plugin.finder.feed.a7 a7Var, so2.y0 y0Var) {
        this.f111037d = a7Var;
        this.f111038e = y0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem != null) {
            com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f111037d;
            so2.y0 y0Var = this.f111038e;
            if (menuItem.getItemId() == 8) {
                com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter.L(a7Var, a7Var.f106207d, y0Var, 1, null, 8, null);
            }
        }
    }
}
