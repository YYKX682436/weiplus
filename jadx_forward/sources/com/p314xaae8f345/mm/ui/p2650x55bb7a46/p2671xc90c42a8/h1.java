package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public final class h1 implements y90.j {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f283777d = "";

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f283778e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o1 f283779f;

    public h1(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o1 o1Var) {
        this.f283779f = o1Var;
        this.f283778e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(gm0.j1.e().a(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.g1(o1Var, this), false);
    }

    @Override // y90.j
    public void G2() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void H0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedHistoryListPresenter", "onSearchEditTextReady");
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void P4(java.lang.String searchText) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchText, "searchText");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedHistoryListPresenter", "onSearchChange query=" + this.f283777d + " searchText=" + searchText);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f283777d, searchText)) {
            return;
        }
        this.f283777d = searchText;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f283778e;
        b4Var.d();
        b4Var.c(500L, 500L);
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void V5() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void Z2() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedHistoryListPresenter", "onQuitSearch");
        zb5.e eVar = this.f283779f.f283926i;
        if (eVar != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ActivityC21746xa8e928c2 activityC21746xa8e928c2 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ActivityC21746xa8e928c2) eVar;
            activityC21746xa8e928c2.finish();
            activityC21746xa8e928c2.overridePendingTransition(0, 0);
        }
    }

    @Override // y90.j
    public void m6() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public boolean n5(java.lang.String str) {
        return false;
    }

    @Override // y90.j
    public void o2(boolean z17, java.lang.String[] strArr, long j17, int i17) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void v() {
    }
}
