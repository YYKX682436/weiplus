package k84;

/* loaded from: classes4.dex */
public final class s5 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.c6 f386780d;

    public s5(k84.c6 c6Var) {
        this.f386780d = c6Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$setAttitudeViewUI$1$2");
        jz5.l lVar = (jz5.l) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$setAttitudeViewUI$1$2");
        java.lang.Boolean bool = (java.lang.Boolean) lVar.f384366d;
        boolean booleanValue = ((java.lang.Boolean) lVar.f384367e).booleanValue();
        k84.c6 c6Var = this.f386780d;
        java.lang.String j17 = c6Var.j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("icon play observe liked is ");
        sb6.append(bool);
        sb6.append(", isPlaying is ");
        sb6.append(booleanValue);
        sb6.append(", mIsDoPAGPlaying is ");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMIsDoPAGPlaying$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        boolean z17 = c6Var.K;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMIsDoPAGPlaying$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        sb6.append(z17);
        sb6.append(", mIsPAGValid is ");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMIsPAGValid$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        boolean z18 = c6Var.M;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMIsPAGValid$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        sb6.append(z18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j17, sb6.toString());
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE);
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (b17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 C = k84.c6.C(c6Var);
            if (C != null) {
                C.setVisibility(8);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 B = k84.c6.B(c6Var);
            if (B != null) {
                B.setVisibility(0);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$stopPAGPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            c6Var.K();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$stopPAGPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMResumePAGPlaying$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            c6Var.L = false;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMResumePAGPlaying$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMIsPAGValid$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            boolean z19 = c6Var.M;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMIsPAGValid$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            if (!z19) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 C2 = k84.c6.C(c6Var);
                if (C2 != null) {
                    C2.setVisibility(0);
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 B2 = k84.c6.B(c6Var);
                if (B2 != null) {
                    B2.setVisibility(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$setAttitudeViewUI$1$2");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$setAttitudeViewUI$1$2");
                return f0Var;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMIsPlayingState$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = c6Var.f386510J;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMIsPlayingState$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            boolean booleanValue2 = ((java.lang.Boolean) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).mo144003x754a37bb()).booleanValue();
            k84.k5 k5Var = c6Var.P;
            if (booleanValue2) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMResumePAGPlaying$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                boolean z27 = c6Var.L;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMResumePAGPlaying$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                if (z27) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 C3 = k84.c6.C(c6Var);
                    if (C3 != null) {
                        C3.setVisibility(8);
                    }
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 B3 = k84.c6.B(c6Var);
                    if (B3 != null) {
                        B3.setVisibility(8);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$resumePAGPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resumePAGPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                    com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b H = c6Var.H();
                    if (H != null) {
                        H.setVisibility(0);
                    }
                    if (c6Var.K) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(c6Var.j(), "resumePAGPlay return");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resumePAGPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                    } else {
                        c6Var.K = true;
                        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b H2 = c6Var.H();
                        if (H2 != null) {
                            H2.post(new k84.q5(c6Var));
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resumePAGPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$resumePAGPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                } else {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 C4 = k84.c6.C(c6Var);
                    if (C4 != null) {
                        C4.setVisibility(0);
                    }
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 B4 = k84.c6.B(c6Var);
                    if (B4 != null) {
                        B4.setVisibility(8);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$startPAGPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startPAGPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                    com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b H3 = c6Var.H();
                    if (H3 != null) {
                        H3.m82582x3ae760af(0.0d);
                    }
                    com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b H4 = c6Var.H();
                    if (H4 != null) {
                        H4.setVisibility(0);
                    }
                    if (c6Var.K) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(c6Var.j(), "startPAGPlay return");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPAGPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                    } else {
                        c6Var.K = true;
                        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b H5 = c6Var.H();
                        if (H5 != null) {
                            H5.a(k5Var);
                        }
                        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b H6 = c6Var.H();
                        if (H6 != null) {
                            H6.post(new k84.a6(c6Var));
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPAGPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$startPAGPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMResumePAGPlaying$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                c6Var.L = true;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMResumePAGPlaying$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMResumePAGPlaying$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                boolean z28 = c6Var.L;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMResumePAGPlaying$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                if (z28) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 C5 = k84.c6.C(c6Var);
                    if (C5 != null) {
                        C5.setVisibility(8);
                    }
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 B5 = k84.c6.B(c6Var);
                    if (B5 != null) {
                        B5.setVisibility(8);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$pausePAGPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pausePAGPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                    com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b H7 = c6Var.H();
                    if (H7 != null) {
                        H7.setVisibility(0);
                    }
                    com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b H8 = c6Var.H();
                    if (H8 != null) {
                        H8.i(k5Var);
                    }
                    com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b H9 = c6Var.H();
                    if (H9 != null) {
                        H9.j(c6Var.O);
                    }
                    if (c6Var.K) {
                        c6Var.K = false;
                        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b H10 = c6Var.H();
                        if (H10 != null) {
                            H10.post(new k84.p5(c6Var));
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pausePAGPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(c6Var.j(), "pausePAGPlay return");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pausePAGPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$pausePAGPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                } else {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 C6 = k84.c6.C(c6Var);
                    if (C6 != null) {
                        C6.setVisibility(0);
                    }
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 B6 = k84.c6.B(c6Var);
                    if (B6 != null) {
                        B6.setVisibility(8);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$stopPAGPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                    c6Var.K();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$stopPAGPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMResumePAGPlaying$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                    c6Var.L = false;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMResumePAGPlaying$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$setAttitudeViewUI$1$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$setAttitudeViewUI$1$2");
        return f0Var;
    }
}
