package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class k6 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0 f283833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f283834e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.l6 f283835f;

    public k6(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.l6 l6Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0 f0Var, int i17) {
        this.f283835f = l6Var;
        this.f283833d = f0Var;
        this.f283834e = i17;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0 f0Var = this.f283833d;
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UrlHistoryListPresenter", "item is null! position:%s", java.lang.Integer.valueOf(this.f283834e));
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.l6 l6Var = this.f283835f;
        l6Var.f283863a.m(menuItem.getItemId(), pt0.f0.Li(l6Var.f283863a.f284075e, f0Var.f279944d), 2);
    }
}
