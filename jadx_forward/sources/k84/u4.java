package k84;

/* loaded from: classes4.dex */
public final class u4 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.c6 f386812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f386813e;

    public u4(k84.c6 c6Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        this.f386812d = c6Var;
        this.f386813e = c17933xe8d1b226;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$handleInteractType$1$1$1");
        l44.e0 e0Var = (l44.e0) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$handleInteractType$1$1$1");
        k84.c6 c6Var = this.f386812d;
        java.lang.String j17 = c6Var.j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("interactType is ");
        sb6.append(e0Var);
        sb6.append(", model snsId is ");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f386813e;
        sb6.append(c17933xe8d1b226.m70367x7525eefd());
        sb6.append(", snsIdStr is ");
        sb6.append(ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j17, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f E = k84.c6.E(c6Var);
        android.content.Context context = E != null ? E.getContext() : null;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (context == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$handleInteractType$1$1$1");
        } else {
            if (e0Var == l44.e0.f397626d) {
                k84.c6.F(c6Var, context);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f E2 = k84.c6.E(c6Var);
                if (E2 != null) {
                    E2.q(false);
                }
                k84.q4.f386745d.a(a84.d0.c(c17933xe8d1b226), java.lang.Boolean.TRUE);
            } else if (e0Var == l44.e0.f397627e) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f E3 = k84.c6.E(c6Var);
                if (E3 != null) {
                    E3.q(true);
                }
                k84.q4.f386745d.a(a84.d0.c(c17933xe8d1b226), java.lang.Boolean.FALSE);
            } else if (e0Var == l44.e0.f397631i) {
                k84.c6.y(c6Var, 1550);
            } else if (e0Var == l44.e0.f397632m) {
                k84.c6.y(c6Var, 1552);
            } else if (e0Var == l44.e0.f397633n) {
                k84.c6.y(c6Var, 1551);
            } else if (e0Var == l44.e0.f397634o) {
                k84.c6.y(c6Var, 1553);
                if (k84.f4.e()) {
                    ca4.m0.v0();
                }
                k84.c6.F(c6Var, context);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$handleInteractType$1$1$1");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$handleInteractType$1$1$1");
        return f0Var;
    }
}
