package e94;

/* loaded from: classes4.dex */
public class r extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17821xa501ffb5 f331920a;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17821xa501ffb5 c17821xa501ffb5) {
        this.f331920a = c17821xa501ffb5;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        boolean z17;
        java.lang.String str4;
        float f17;
        float f18;
        java.lang.String str5;
        java.lang.String str6;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleMessage", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$1");
        int i17 = message.what;
        if (i17 != 1) {
            if (i17 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17821xa501ffb5 c17821xa501ffb5 = this.f331920a;
                float f19 = message.arg1 / 1000.0f;
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17821xa501ffb5.C;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                c17821xa501ffb5.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTwistDegreeChange", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                c17821xa501ffb5.f245449d.m69705x3ae760af(f19);
                if (java.lang.Math.abs(f19) >= 1.0f && !c17821xa501ffb5.f245457o) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TwistCoverView", "onTwistActionSucc by degree");
                    c17821xa501ffb5.f();
                    c17821xa501ffb5.m69703xc4a52ce5(false);
                    c17821xa501ffb5.f245467y.removeMessages(2);
                    c17821xa501ffb5.f245467y.removeMessages(1);
                    if (c17821xa501ffb5.f245454i != null) {
                        c17821xa501ffb5.h(1, false, c17821xa501ffb5.f245454i.f247644h);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TwistCoverView", "onTwistDegreeChange, mAdTwistInfo==null");
                    }
                    c17821xa501ffb5.e();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTwistDegreeChange", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            } else if (i17 == 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17821xa501ffb5 c17821xa501ffb52 = this.f331920a;
                int i19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17821xa501ffb5.C;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                c17821xa501ffb52.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLargeAcceleration", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                if (!c17821xa501ffb52.f245457o) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TwistCoverView", "onTwistActionSucc by acceleration");
                    c17821xa501ffb52.f();
                    c17821xa501ffb52.m69703xc4a52ce5(false);
                    android.os.Handler handler = c17821xa501ffb52.f245467y;
                    handler.removeMessages(2);
                    handler.removeMessages(1);
                    c17821xa501ffb52.f245449d.m69705x3ae760af(1.0f);
                    c17821xa501ffb52.h(1, true, 0.0f);
                    c17821xa501ffb52.e();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLargeAcceleration", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            } else if (i17 == 4) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17821xa501ffb5 c17821xa501ffb53 = this.f331920a;
                int i27 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17821xa501ffb5.C;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                android.animation.AnimatorSet animatorSet = c17821xa501ffb53.f245456n;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                if (animatorSet != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17821xa501ffb5 c17821xa501ffb54 = this.f331920a;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                    android.animation.AnimatorSet animatorSet2 = c17821xa501ffb54.f245456n;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                    if (!animatorSet2.isRunning()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17821xa501ffb5 c17821xa501ffb55 = this.f331920a;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                        android.animation.AnimatorSet animatorSet3 = c17821xa501ffb55.f245456n;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                        animatorSet3.start();
                    }
                }
            }
            str5 = "handleMessage";
            str6 = "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$1";
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17821xa501ffb5 c17821xa501ffb56 = this.f331920a;
            long j17 = message.arg1;
            int i28 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17821xa501ffb5.C;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            c17821xa501ffb56.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doOnVideoPlay", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            if (c17821xa501ffb56.f245454i == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TwistCoverView", "checkShow， mAdTwistInfo==null");
                c17821xa501ffb56.a();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doOnVideoPlay", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                str4 = "access$000";
                str2 = "handleMessage";
                str3 = "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$1";
            } else {
                if (j17 < c17821xa501ffb56.f245454i.f247640d || j17 > c17821xa501ffb56.f245454i.f247641e) {
                    if (c17821xa501ffb56.d()) {
                        c17821xa501ffb56.m69703xc4a52ce5(false);
                    }
                    c17821xa501ffb56.f245464v = false;
                    if (c17821xa501ffb56.f245463u) {
                        c17821xa501ffb56.f245463u = false;
                        if (!c17821xa501ffb56.f245465w) {
                            c17821xa501ffb56.h(2, false, c17821xa501ffb56.f245468z);
                        }
                    }
                    c17821xa501ffb56.f245462t = true;
                } else {
                    if (!c17821xa501ffb56.d() && !c17821xa501ffb56.f245460r) {
                        c17821xa501ffb56.i();
                        c17821xa501ffb56.m69703xc4a52ce5(true);
                    }
                    c17821xa501ffb56.f245464v = true;
                    if (c17821xa501ffb56.f245462t) {
                        c17821xa501ffb56.f245462t = false;
                        c17821xa501ffb56.f245465w = false;
                        c17821xa501ffb56.h(3, false, 0.0f);
                    }
                    c17821xa501ffb56.f245463u = true;
                }
                if (j17 < c17821xa501ffb56.f245454i.f247642f || j17 > c17821xa501ffb56.f245454i.f247643g) {
                    str = "access$000";
                    str2 = "handleMessage";
                    str3 = "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$1";
                    c17821xa501ffb56.b();
                } else if (c17821xa501ffb56.f245459q && c17821xa501ffb56.getVisibility() == 0) {
                    c17821xa501ffb56.j();
                    str = "access$000";
                    str2 = "handleMessage";
                    str3 = "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$1";
                    z17 = false;
                    c17821xa501ffb56.f245459q = z17;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doOnVideoPlay", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                    str4 = str;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("show", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                    if (c17821xa501ffb56.f245458p) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("show", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                        str = "access$000";
                        str2 = "handleMessage";
                        str3 = "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$1";
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TwistCoverView", "show");
                        c17821xa501ffb56.f245458p = true;
                        if (c17821xa501ffb56.getVisibility() != 0) {
                            c17821xa501ffb56.setVisibility(0);
                            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(c17821xa501ffb56, "alpha", 0.0f, 1.0f);
                            ofFloat.setDuration(250L);
                            ofFloat.start();
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initIconAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                            if (c17821xa501ffb56.f245454i == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TwistCoverView", "initIconAnim err, info==null");
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initIconAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                                str = "access$000";
                                str2 = "handleMessage";
                                str3 = "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$1";
                            } else {
                                if (c17821xa501ffb56.f245454i.f247645i) {
                                    f17 = 45.0f;
                                    f18 = -5.0f;
                                } else {
                                    f17 = -45.0f;
                                    f18 = 5.0f;
                                }
                                android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(c17821xa501ffb56.f245450e, "rotation", 0.0f, 0.0f);
                                ofFloat2.setDuration(100L);
                                android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(c17821xa501ffb56.f245450e, "rotation", 0.0f, f17);
                                ofFloat3.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
                                ofFloat3.setDuration(700L);
                                android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(c17821xa501ffb56.f245450e, "rotation", f17, f17);
                                str2 = "handleMessage";
                                str3 = "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$1";
                                ofFloat4.setDuration(200L);
                                android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(c17821xa501ffb56.f245450e, "rotation", f17, f18);
                                str = "access$000";
                                ofFloat5.setDuration(200L);
                                float f27 = -f18;
                                android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat(c17821xa501ffb56.f245450e, "rotation", f18, f27);
                                ofFloat6.setDuration(200L);
                                android.animation.ObjectAnimator ofFloat7 = android.animation.ObjectAnimator.ofFloat(c17821xa501ffb56.f245450e, "rotation", f27, 0.0f);
                                ofFloat7.setDuration(200L);
                                android.animation.AnimatorSet animatorSet4 = new android.animation.AnimatorSet();
                                c17821xa501ffb56.f245456n = animatorSet4;
                                animatorSet4.playSequentially(ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7);
                                c17821xa501ffb56.f245456n.addListener(new e94.u(c17821xa501ffb56));
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initIconAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                            }
                            c17821xa501ffb56.k();
                        } else {
                            str = "access$000";
                            str2 = "handleMessage";
                            str3 = "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$1";
                        }
                        if (c17821xa501ffb56.f245454i != null) {
                            c17821xa501ffb56.f245451f.setText(c17821xa501ffb56.f245454i.f247646m);
                            c17821xa501ffb56.f245452g.setText(c17821xa501ffb56.f245454i.f247647n);
                            c17821xa501ffb56.f245449d.m69706x625d60c2(c17821xa501ffb56.f245454i.f247645i ? 1 : 0);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("show", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                    }
                }
                z17 = false;
                c17821xa501ffb56.f245459q = z17;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doOnVideoPlay", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
                str4 = str;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str4, "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            str5 = str2;
            str6 = str3;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str5, str6);
    }
}
