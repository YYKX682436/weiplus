package yk2;

/* loaded from: classes3.dex */
public final class l extends yk2.g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.view.ViewGroup root) {
        super(root);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
    }

    @Override // yk2.g
    public void a(r45.lk2 response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        this.f544325e = response;
        ae2.in inVar = ae2.in.f85221a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85302i0).mo141623x754a37bb()).r()).intValue();
        android.view.ViewGroup viewGroup = this.f544324d;
        if (intValue == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveRecentWatchPersonal", "Recent watch experiment is close");
            viewGroup.setVisibility(8);
            return;
        }
        boolean z17 = dk2.ef.C;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveRecentWatchPersonal", "checkPersonalItemShow enable_recent_watch: " + z17);
        if (!z17) {
            viewGroup.setVisibility(8);
            return;
        }
        if (!gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LIVE_RECENT_WATCH_SETTING_BOOLEAN_SYNC, true)) {
            viewGroup.setVisibility(8);
            return;
        }
        if (viewGroup.getVisibility() == 0) {
            return;
        }
        viewGroup.setVisibility(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4 a4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4.f183535a;
        java.lang.String b17 = b();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        a4Var.a(b17, "", b52.b.b(), "person_page_recent_viewed", "");
    }

    @Override // yk2.g
    public int c() {
        return 8;
    }

    @Override // yk2.g
    public void d() {
        p3325xe03a0797.p3326xc267989b.l.d(v65.m.a(this.f544324d), null, null, new yk2.k(this, null), 3, null);
    }
}
