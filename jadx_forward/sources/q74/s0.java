package q74;

/* loaded from: classes4.dex */
public final class s0 {
    public int A;
    public android.animation.AnimatorSet B;
    public final q74.l0 C;
    public final q74.m0 D;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f442025a;

    /* renamed from: b, reason: collision with root package name */
    public final int f442026b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.ViewGroup f442027c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f442028d;

    /* renamed from: e, reason: collision with root package name */
    public final w64.n f442029e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2124x2ad8c7ad.C17758x730d4dd2 f442030f;

    /* renamed from: g, reason: collision with root package name */
    public final z84.h f442031g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f442032h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.FrameLayout f442033i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.FrameLayout f442034j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.ImageView f442035k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f442036l;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f442037m;

    /* renamed from: n, reason: collision with root package name */
    public s34.z0 f442038n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f442039o;

    /* renamed from: p, reason: collision with root package name */
    public int f442040p;

    /* renamed from: q, reason: collision with root package name */
    public int f442041q;

    /* renamed from: r, reason: collision with root package name */
    public float f442042r;

    /* renamed from: s, reason: collision with root package name */
    public float f442043s;

    /* renamed from: t, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.y0 f442044t;

    /* renamed from: u, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f442045u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f442046v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f442047w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f442048x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f442049y;

    /* renamed from: z, reason: collision with root package name */
    public q74.t f442050z;

    public s0(android.content.Context mContext, int i17, android.view.ViewGroup mRecycleViewContainer, android.view.View mItemRootView, w64.n nVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2124x2ad8c7ad.C17758x730d4dd2 c17758x730d4dd2, z84.h hVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mContext, "mContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mRecycleViewContainer, "mRecycleViewContainer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mItemRootView, "mItemRootView");
        this.f442025a = mContext;
        this.f442026b = i17;
        this.f442027c = mRecycleViewContainer;
        this.f442028d = mItemRootView;
        this.f442029e = nVar;
        this.f442030f = c17758x730d4dd2;
        this.f442031g = hVar;
        this.f442045u = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(0);
        this.A = -1;
        this.C = new q74.l0(this);
        this.D = new q74.m0(this);
    }

    public static final void a(q74.s0 s0Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e;
        s34.a1 a1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$bindCurrentProductViewDataAndDoAnimation", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        s0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindCurrentProductViewDataAndDoAnimation", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        try {
        } catch (java.lang.Throwable th6) {
            ca4.q.c("SlideFullCardBreakFrameUICtrlbindCurrentProductViewDataAndDoAnimation", th6);
        }
        if (s0Var.A == i17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindCurrentProductViewDataAndDoAnimation", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        } else {
            s0Var.A = i17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = s0Var.f442037m;
            s34.z0 z0Var = (c17933xe8d1b226 == null || (m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e()) == null || (a1Var = m70354x74235b3e.f38210x95847c91) == null) ? null : a1Var.f484102f;
            if (z0Var == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindCurrentProductViewDataAndDoAnimation", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
            } else {
                q74.t tVar = s0Var.f442050z;
                if (tVar != null) {
                    tVar.m();
                }
                q74.t tVar2 = s0Var.f442050z;
                if (tVar2 != null) {
                    tVar2.l(i17);
                }
                if (i17 == 0) {
                    if (z0Var.a()) {
                        if (s0Var.f442047w) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCardBreakFrameUICtrl", "bindCurrentProductViewDataAndDoAnimation, index is 0, has pag and finish, doEnterOrExitAnim");
                            android.widget.FrameLayout frameLayout = s0Var.f442033i;
                            if (frameLayout != null) {
                                frameLayout.setVisibility(8);
                            }
                            q74.t tVar3 = s0Var.f442050z;
                            if (tVar3 != null) {
                                tVar3.y(1.0f);
                            }
                            q74.t tVar4 = s0Var.f442050z;
                            if (tVar4 != null) {
                                tVar4.o(true);
                            }
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCardBreakFrameUICtrl", "bindCurrentProductViewDataAndDoAnimation, index is 0, has pag but pag is not finish, hide product comp");
                            q74.t tVar5 = s0Var.f442050z;
                            if (tVar5 != null) {
                                tVar5.y(0.0f);
                            }
                        }
                    } else if (s0Var.f442048x) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCardBreakFrameUICtrl", "bindCurrentProductViewDataAndDoAnimation, index is 0, no pag, doEnterOrExitAnim");
                        q74.t tVar6 = s0Var.f442050z;
                        if (tVar6 != null) {
                            tVar6.y(1.0f);
                        }
                        q74.t tVar7 = s0Var.f442050z;
                        if (tVar7 != null) {
                            tVar7.o(true);
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCardBreakFrameUICtrl", "bindCurrentProductViewDataAndDoAnimation, index is 0, no pag, initNoPAGStatus");
                        s0Var.f442048x = true;
                        q74.t tVar8 = s0Var.f442050z;
                        if (tVar8 != null) {
                            tVar8.y(1.0f);
                        }
                        q74.t tVar9 = s0Var.f442050z;
                        if (tVar9 != null) {
                            tVar9.x(0);
                        }
                    }
                } else if (!z0Var.a()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCardBreakFrameUICtrl", "bindCurrentProductViewDataAndDoAnimation, index is " + i17 + ", no pag, doEnterOrExitAnim");
                    q74.t tVar10 = s0Var.f442050z;
                    if (tVar10 != null) {
                        tVar10.y(1.0f);
                    }
                    q74.t tVar11 = s0Var.f442050z;
                    if (tVar11 != null) {
                        tVar11.o(true);
                    }
                } else if (s0Var.f442047w) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCardBreakFrameUICtrl", "bindCurrentProductViewDataAndDoAnimation, index is " + i17 + ", has pag and finish, doEnterOrExitAnim");
                    android.widget.FrameLayout frameLayout2 = s0Var.f442033i;
                    if (frameLayout2 != null) {
                        frameLayout2.setVisibility(8);
                    }
                    q74.t tVar12 = s0Var.f442050z;
                    if (tVar12 != null) {
                        tVar12.y(1.0f);
                    }
                    q74.t tVar13 = s0Var.f442050z;
                    if (tVar13 != null) {
                        tVar13.o(true);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCardBreakFrameUICtrl", "bindCurrentProductViewDataAndDoAnimation, index is " + i17 + ", has pag but pag is not finish, doPAGInterruptAnim");
                    s0Var.f442047w = true;
                    s0Var.i();
                    com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = s0Var.f442039o;
                    if (c22789xd23e9a9b != null) {
                        c22789xd23e9a9b.post(new q74.e0(c22789xd23e9a9b));
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindCurrentProductViewDataAndDoAnimation", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$bindCurrentProductViewDataAndDoAnimation", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
    }

    public static final void b(q74.s0 s0Var, int i17) {
        java.lang.Long c17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e;
        s34.a1 a1Var;
        s34.z0 z0Var;
        java.util.List c18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$doStatusTwoAnimNoPAGExt", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        s0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doStatusTwoAnimNoPAGExt", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCardBreakFrameUICtrl", "doStatusTwoAnimNoPAGExt, index is " + i17 + ", mNoPAGStatusTwoAnimReset is " + s0Var.f442049y);
        if (!s0Var.f442049y) {
            s0Var.f442049y = true;
            q74.t tVar = s0Var.f442050z;
            if (tVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doStatusTwoAnimNoPAG", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = tVar.f442067p;
                s34.o1 o1Var = (c17933xe8d1b226 == null || (m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e()) == null || (a1Var = m70354x74235b3e.f38210x95847c91) == null || (z0Var = a1Var.f484102f) == null || (c18 = z0Var.c()) == null) ? null : (s34.o1) c18.get(i17);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = tVar.C;
                n3Var.mo50302x6b17ad39(null);
                n3Var.mo50297x7c4d7ca2(new q74.n(tVar), (o1Var == null || (c17 = o1Var.c()) == null) ? 1500L : c17.longValue());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doStatusTwoAnimNoPAG", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doStatusTwoAnimNoPAGExt", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$doStatusTwoAnimNoPAGExt", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
    }

    public static final /* synthetic */ q74.t c(q74.s0 s0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMAdSlideProductItemViewLogic$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        q74.t tVar = s0Var.f442050z;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMAdSlideProductItemViewLogic$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        return tVar;
    }

    public static final /* synthetic */ android.widget.ImageView d(q74.s0 s0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMPagThumb$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        android.widget.ImageView imageView = s0Var.f442035k;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMPagThumb$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        return imageView;
    }

    public static final /* synthetic */ android.widget.FrameLayout e(q74.s0 s0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMPagWholeContainer$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        android.widget.FrameLayout frameLayout = s0Var.f442033i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMPagWholeContainer$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        return frameLayout;
    }

    public static final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f(q74.s0 s0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMPreDrawFinishFlow$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = s0Var.f442045u;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMPreDrawFinishFlow$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        return j2Var;
    }

    public static final boolean g(q74.s0 s0Var) {
        boolean z17;
        org.p3363xbe4143f1.C29690xfae77312 c29690xfae77312;
        com.p314xaae8f345.mm.rfx.C20942x379cf5ee c20942x379cf5ee;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$pagPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        s0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pagPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        boolean z18 = false;
        try {
            z17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20316xf7a4b984()) == 1;
            c29690xfae77312 = null;
        } catch (java.lang.Throwable th6) {
            ca4.q.c("SlideFullCardBreakFrameUICtrl_pagPlaying", th6);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pagPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        }
        if (z17) {
            c20942x379cf5ee = s0Var.m();
            if (c20942x379cf5ee == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SlideFullCardBreakFrameUICtrl", "PAGFile Load failed");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pagPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$pagPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
                return z18;
            }
        } else {
            org.p3363xbe4143f1.C29690xfae77312 l17 = s0Var.l();
            if (l17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SlideFullCardBreakFrameUICtrl", "PAGFile Load failed");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pagPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$pagPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
                return z18;
            }
            c20942x379cf5ee = null;
            c29690xfae77312 = l17;
        }
        if (s0Var.f442040p > 0 && s0Var.f442041q > 0) {
            if (s0Var.f442039o == null) {
                android.widget.FrameLayout frameLayout = s0Var.f442034j;
                if (frameLayout != null && frameLayout.getChildCount() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCardBreakFrameUICtrl", "pagPlaying");
                    com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = new com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b(s0Var.f442025a);
                    c22789xd23e9a9b.o(z17);
                    c22789xd23e9a9b.m82583xcde73672(1);
                    c22789xd23e9a9b.m82584xebcf33cb(3);
                    if (z17) {
                        c22789xd23e9a9b.mo82566x3e3ac3e8(c20942x379cf5ee);
                    } else {
                        c22789xd23e9a9b.mo82568x3e3ac3e8(c29690xfae77312);
                    }
                    c22789xd23e9a9b.a(s0Var.D);
                    android.widget.FrameLayout frameLayout2 = s0Var.f442034j;
                    if (frameLayout2 != null) {
                        frameLayout2.addView(c22789xd23e9a9b, new android.view.ViewGroup.LayoutParams(s0Var.f442040p, s0Var.f442041q));
                    }
                    c22789xd23e9a9b.setTranslationX(s0Var.f442042r);
                    c22789xd23e9a9b.setTranslationY(s0Var.f442043s);
                    s0Var.f442039o = c22789xd23e9a9b;
                    c22789xd23e9a9b.post(new q74.p0(c22789xd23e9a9b));
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pagPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
            z18 = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$pagPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
            return z18;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pagPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$pagPlaying", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        return z18;
    }

    public final void h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calcProductCompBreakFrameLayoutParams", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        if (!this.f442036l) {
            this.f442036l = true;
            android.view.ViewTreeObserver viewTreeObserver = this.f442027c.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnPreDrawListener(new q74.f0(this));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcProductCompBreakFrameLayoutParams", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
    }

    public final void i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doPAGInterruptAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        android.widget.FrameLayout frameLayout = this.f442033i;
        if (frameLayout == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPAGInterruptAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(frameLayout);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(frameLayout, "alpha", 1.0f, 0.0f);
        ofFloat.setInterpolator(new android.view.animation.PathInterpolator(0.52f, 0.0f, 0.74f, 0.04f));
        ofFloat.setDuration(150L);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.B = animatorSet;
        animatorSet.addListener(new q74.g0(this));
        android.animation.AnimatorSet animatorSet2 = this.B;
        if (animatorSet2 != null) {
            animatorSet2.play(ofFloat);
        }
        android.animation.AnimatorSet animatorSet3 = this.B;
        if (animatorSet3 != null) {
            animatorSet3.start();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPAGInterruptAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
    }

    public final android.content.Context j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMContext", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMContext", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        return this.f442025a;
    }

    public final android.view.ViewGroup k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMRecycleViewContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMRecycleViewContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        return this.f442027c;
    }

    public final org.p3363xbe4143f1.C29690xfae77312 l() {
        s34.m1 b17;
        java.lang.String b18;
        s34.m1 b19;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getValidPAGFile", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        s34.z0 z0Var = this.f442038n;
        if (z0Var == null || (b17 = z0Var.b()) == null || (b18 = b17.b()) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getValidPAGFile", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
            return null;
        }
        s34.z0 z0Var2 = this.f442038n;
        if (z0Var2 != null && (b19 = z0Var2.b()) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPagMD5", "com.tencent.mm.plugin.sns.ad.adxml.OpeningPAGInfo");
            java.lang.String str = b19.f484246b;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPagMD5", "com.tencent.mm.plugin.sns.ad.adxml.OpeningPAGInfo");
            if (str != null) {
                java.lang.String b27 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.l0.b(b18, str);
                if (!(b27 == null || b27.length() == 0)) {
                    org.p3363xbe4143f1.C29690xfae77312 m154717x243906 = org.p3363xbe4143f1.C29690xfae77312.m154717x243906(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.l0.e(b27));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getValidPAGFile", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
                    return m154717x243906;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.l0.a(b18);
                this.f442047w = true;
                i();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SlideFullCardBreakFrameUICtrl", "getValidPAGFile, pagFilePath is isNullOrEmpty");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getValidPAGFile", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
                return null;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getValidPAGFile", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        return null;
    }

    public final com.p314xaae8f345.mm.rfx.C20942x379cf5ee m() {
        s34.m1 b17;
        java.lang.String b18;
        s34.m1 b19;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getValidRfxFile", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        s34.z0 z0Var = this.f442038n;
        if (z0Var == null || (b17 = z0Var.b()) == null || (b18 = b17.b()) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getValidRfxFile", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
            return null;
        }
        s34.z0 z0Var2 = this.f442038n;
        if (z0Var2 != null && (b19 = z0Var2.b()) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPagMD5", "com.tencent.mm.plugin.sns.ad.adxml.OpeningPAGInfo");
            java.lang.String str = b19.f484246b;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPagMD5", "com.tencent.mm.plugin.sns.ad.adxml.OpeningPAGInfo");
            if (str != null) {
                java.lang.String b27 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.l0.b(b18, str);
                if (!(b27 == null || b27.length() == 0)) {
                    com.p314xaae8f345.mm.rfx.C20942x379cf5ee m77392x243906 = com.p314xaae8f345.mm.rfx.C20942x379cf5ee.m77392x243906(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.l0.e(b27));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getValidRfxFile", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
                    return m77392x243906;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.l0.a(b18);
                this.f442047w = true;
                i();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SlideFullCardBreakFrameUICtrl", "getValidPAGFile, pagFilePath is isNullOrEmpty");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getValidRfxFile", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
                return null;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getValidRfxFile", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        return null;
    }

    public final void n() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f442044t;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.z0.c(y0Var, null);
        }
        this.A = -1;
        this.f442046v = false;
        this.f442047w = false;
        this.f442048x = false;
        this.f442049y = false;
        this.f442036l = false;
        android.widget.FrameLayout frameLayout = this.f442034j;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        q74.t tVar = this.f442050z;
        if (tVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
            tVar.m();
            tVar.C.mo50302x6b17ad39(null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2124x2ad8c7ad.C17758x730d4dd2 c17758x730d4dd2 = tVar.f442054c;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c17758x730d4dd2 != null ? c17758x730d4dd2.mo7946xf939df19() : null;
            q74.x0 x0Var = mo7946xf939df19 instanceof q74.x0 ? (q74.x0) mo7946xf939df19 : null;
            if (x0Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
                x0Var.f442102q = false;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            }
            tVar.B = false;
            tVar.f442051J = false;
            android.view.View view = tVar.f442066o;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/AdSlideProductItemViewLogic", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/AdSlideProductItemViewLogic", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.ViewGroup viewGroup = tVar.f442063l;
            if (viewGroup != null) {
                viewGroup.setAlpha(0.0f);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2142x746ad0e3.C17790xf59c6992 c17790xf59c6992 = tVar.f442062k;
            if (c17790xf59c6992 != null) {
                c17790xf59c6992.setTranslationX(0.0f);
            }
            if (c17790xf59c6992 != null) {
                c17790xf59c6992.setAlpha(1.0f);
            }
            android.widget.ImageView imageView = tVar.f442060i;
            if (imageView != null) {
                imageView.setTranslationX(0.0f);
            }
            android.widget.ImageView imageView2 = tVar.f442061j;
            if (imageView2 != null) {
                imageView2.setTranslationX(0.0f);
            }
            android.widget.ImageView imageView3 = tVar.f442060i;
            if (imageView3 != null) {
                imageView3.setAlpha(1.0f);
            }
            android.widget.ImageView imageView4 = tVar.f442061j;
            if (imageView4 != null) {
                imageView4.setAlpha(1.0f);
            }
            android.widget.ImageView imageView5 = tVar.f442060i;
            if (imageView5 != null) {
                imageView5.setImageDrawable(null);
            }
            android.widget.ImageView imageView6 = tVar.f442061j;
            if (imageView6 != null) {
                imageView6.setImageDrawable(null);
            }
            android.widget.ImageView imageView7 = tVar.f442060i;
            if (imageView7 != null) {
                imageView7.setTag(com.p314xaae8f345.mm.R.id.n1z, "");
            }
            android.widget.ImageView imageView8 = tVar.f442061j;
            if (imageView8 != null) {
                imageView8.setTag(com.p314xaae8f345.mm.R.id.n1z, "");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        }
        android.animation.AnimatorSet animatorSet = this.B;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f442039o;
        this.f442039o = null;
        if (c22789xd23e9a9b != null) {
            c22789xd23e9a9b.j(this.C);
        }
        if (c22789xd23e9a9b != null) {
            c22789xd23e9a9b.i(this.D);
        }
        if (c22789xd23e9a9b != null) {
            c22789xd23e9a9b.post(new q74.r0(c22789xd23e9a9b));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl");
    }
}
