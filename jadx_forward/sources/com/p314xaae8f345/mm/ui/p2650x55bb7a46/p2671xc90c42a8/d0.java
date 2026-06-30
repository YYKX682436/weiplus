package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public final class d0 implements y90.j {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f283691d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.h0 f283692e;

    public d0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.h0 h0Var) {
        this.f283692e = h0Var;
        this.f283691d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(gm0.j1.e().a(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.c0(h0Var), false);
    }

    @Override // y90.j
    public void G2() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void H0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiHistoryListPresenter", "onSearchEditTextReady");
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void P4(java.lang.String searchText) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchText, "searchText");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSearchChange query=");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.h0 h0Var = this.f283692e;
        sb6.append(h0Var.f283773i);
        sb6.append(" searchText=");
        sb6.append(searchText);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiHistoryListPresenter", sb6.toString());
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h0Var.f283773i, searchText)) {
            return;
        }
        h0Var.f283773i = searchText;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f283691d;
        b4Var.d();
        b4Var.c(500L, 500L);
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void V5() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void Z2() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiHistoryListPresenter", "onQuitSearch");
        zb5.b bVar = this.f283692e.f283770f;
        if (bVar != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ActivityC21745xdfe2aae0 activityC21745xdfe2aae0 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ActivityC21745xdfe2aae0) bVar;
            activityC21745xdfe2aae0.finish();
            activityC21745xdfe2aae0.overridePendingTransition(0, 0);
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
