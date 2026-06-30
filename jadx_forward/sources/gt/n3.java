package gt;

/* loaded from: classes7.dex */
public class n3 implements com.p314xaae8f345.mm.app.a3 {
    @Override // com.p314xaae8f345.mm.app.a3
    /* renamed from: getHandler */
    public android.os.Handler mo14497x67189314() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.app.a3
    /* renamed from: onAppBackground */
    public void mo510x3be51a90(java.lang.String str) {
        if (gm0.j1.a()) {
            za1.b bVar = za1.b.f552411a;
            ((ku5.t0) ku5.t0.f394148d).g(za1.a.f552410d);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0 q0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = q0Var.a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
            if (!a17.getBoolean("last_appbrand_switch_short_link_highlight", false)) {
                ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).Bi();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a18 = q0Var.a();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a18);
                a18.putBoolean("last_appbrand_switch_short_link_highlight", true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaShortLinkCapacity", "short link highlight change to enable!");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11535xa1a2514c.f156390g.a(false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11577xd02dca59.TAG, "onAppBackground");
        }
    }

    @Override // com.p314xaae8f345.mm.app.a3
    /* renamed from: onAppForeground */
    public void mo511x1952ea5(java.lang.String str) {
        if (gm0.j1.a()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.nj("onAppForeground:" + str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6.f170354i);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11535xa1a2514c.f156390g.a(false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.g2.Ui(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.t1.f156814e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11577xd02dca59.TAG, "onAppForeground");
        }
    }
}
