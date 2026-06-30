package t74;

/* loaded from: classes4.dex */
public final class j1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t74.w1 f497704d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(t74.w1 w1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f497704d = w1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$play$1");
        t74.j1 j1Var = new t74.j1(this.f497704d, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$play$1");
        return j1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$play$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$play$1");
        java.lang.Object mo150x989b7ca4 = ((t74.j1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$play$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$play$1");
        return mo150x989b7ca4;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 W;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 H;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$play$1");
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        t74.w1 w1Var = this.f497704d;
        boolean l07 = t74.w1.l0(w1Var);
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (l07) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w1Var.j(), "play, shouldInterceptAction");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$play$1");
            return f0Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w1Var.j(), "play, mCurrentPageIndex is " + t74.w1.N(w1Var) + ", mCheckVideoCanPlay is " + t74.w1.L(w1Var));
        if (t74.w1.N(w1Var) == 0) {
            if (t74.w1.Y(w1Var)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 H2 = t74.w1.H(w1Var);
                if ((H2 != null && H2.w()) && (H = t74.w1.H(w1Var)) != null) {
                    H.F();
                }
            }
            if (t74.w1.Z(w1Var) && t74.w1.L(w1Var)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 W2 = t74.w1.W(w1Var);
                if (!(W2 != null && W2.w())) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 W3 = t74.w1.W(w1Var);
                    if (!(W3 != null && W3.f0())) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 W4 = t74.w1.W(w1Var);
                        if (W4 != null) {
                            W4.C();
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w1Var.j(), "frontOnlineVideoView onResume");
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 W5 = t74.w1.W(w1Var);
                if (W5 != null) {
                    W5.K();
                }
            }
        } else {
            if (t74.w1.Z(w1Var)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 W6 = t74.w1.W(w1Var);
                if ((W6 != null && W6.w()) && (W = t74.w1.W(w1Var)) != null) {
                    W.F();
                }
            }
            if (t74.w1.Y(w1Var) && t74.w1.L(w1Var)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 H3 = t74.w1.H(w1Var);
                if (!(H3 != null && H3.w())) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 H4 = t74.w1.H(w1Var);
                    if (!(H4 != null && H4.f0())) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 H5 = t74.w1.H(w1Var);
                        if (H5 != null) {
                            H5.C();
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w1Var.j(), "backOnlineVideoView onResume");
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 H6 = t74.w1.H(w1Var);
                if (H6 != null) {
                    H6.K();
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$play$1");
        return f0Var;
    }
}
