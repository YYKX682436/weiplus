package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC */
/* loaded from: classes2.dex */
public final class C15452x854f54e7 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f215089d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f215090e;

    /* renamed from: f, reason: collision with root package name */
    public int f215091f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f215092g;

    /* renamed from: h, reason: collision with root package name */
    public final android.animation.ValueAnimator f215093h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f215094i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15454xe81f57d2 f215095m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15453xa1ad01b0 f215096n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC$videoFinishListener$1] */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC$lifecycleObserver$1] */
    public C15452x854f54e7(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        this.f215093h = ofFloat;
        this.f215094i = true;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f215095m = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5441x35e2cf6a>(a0Var) { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC$videoFinishListener$1
            {
                this.f39173x3fe91575 = -1291074182;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5441x35e2cf6a c5441x35e2cf6a) {
                int w17;
                int y17;
                in5.s0 s0Var;
                so2.u1 u1Var;
                am.fa faVar;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5441x35e2cf6a event = c5441x35e2cf6a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15452x854f54e7 c15452x854f54e7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15452x854f54e7.this;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = c15452x854f54e7.f215089d;
                if (c1163xf1deaba4 != null) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager mo7951xfd37656d = c1163xf1deaba4.mo7951xfd37656d();
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = mo7951xfd37656d instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) mo7951xfd37656d : null;
                    if (c1162x665295de != null && (w17 = c1162x665295de.w()) <= (y17 = c1162x665295de.y())) {
                        while (true) {
                            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 q07 = c1163xf1deaba4.q0(w17, false);
                            s0Var = q07 instanceof in5.s0 ? (in5.s0) q07 : null;
                            if (s0Var != null) {
                                android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.ipz);
                                if (!(p17 != null && p17.getVisibility() == 0)) {
                                    s0Var = null;
                                }
                                if (s0Var != null) {
                                    java.lang.Object obj = s0Var.f374658i;
                                    u1Var = obj instanceof so2.u1 ? (so2.u1) obj : null;
                                    if (u1Var != null && u1Var.getFeedObject().m59331xcb21161d()) {
                                        long m59233x87980ca = u1Var.getFeedObject().m59233x87980ca();
                                        faVar = event.f135782g;
                                        if (m59233x87980ca == faVar.f88191a || (faVar.f88192b && u1Var.getFeedObject().m59260x51f8f5b0() == faVar.f88191a)) {
                                            break;
                                        }
                                    }
                                }
                            }
                            if (w17 == y17) {
                                break;
                            }
                            w17++;
                        }
                        if (faVar.f88193c) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedMegaVideoBtnAnimUIC", "reset mega video anim status, feedId = " + faVar.f88191a);
                            if (c15452x854f54e7.f215094i) {
                                u1Var.f492163d = false;
                            }
                        } else if (faVar.f88194d) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedMegaVideoBtnAnimUIC", "video is completed, feedId = " + faVar.f88191a);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedMegaVideoBtnAnimUIC", "start finder feed mega video button anim, feedId = " + faVar.f88191a);
                            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.cd(s0Var, c15452x854f54e7));
                            if (!u1Var.f492163d) {
                                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = c15452x854f54e7.m158354x19263085();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
                                r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s5 s5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s5.f206882a;
                                java.lang.String u17 = pm0.v.u(u1Var.mo2128x1ed62e84());
                                java.lang.String m75945x2fec8307 = V6.m75945x2fec8307(0);
                                if (m75945x2fec8307 == null) {
                                    m75945x2fec8307 = "";
                                }
                                java.lang.String m75945x2fec83072 = V6.m75945x2fec8307(1);
                                if (m75945x2fec83072 == null) {
                                    m75945x2fec83072 = "";
                                }
                                java.lang.String m75945x2fec83073 = V6.m75945x2fec8307(2);
                                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21412, u17, m75945x2fec8307, m75945x2fec83072, m75945x2fec83073 != null ? m75945x2fec83073 : "");
                                u1Var.f492163d = true;
                            }
                        }
                    }
                }
                return true;
            }
        };
        this.f215096n = new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC$lifecycleObserver$1
            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
            /* renamed from: onDestroy */
            public final void m63049xac79a11b() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15452x854f54e7 c15452x854f54e7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15452x854f54e7.this;
                c15452x854f54e7.f215095m.mo48814x2efc64();
                c15452x854f54e7.m158354x19263085().mo273xed6858b4().c(this);
            }

            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_PAUSE)
            /* renamed from: onPause */
            public final void m63050xb01dfb57() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15452x854f54e7 c15452x854f54e7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15452x854f54e7.this;
                c15452x854f54e7.f215095m.mo48814x2efc64();
                c15452x854f54e7.f215094i = false;
            }

            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_RESUME)
            /* renamed from: onResume */
            public final void m63051x57429eec() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15452x854f54e7 c15452x854f54e7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15452x854f54e7.this;
                c15452x854f54e7.f215095m.mo48813x58998cd();
                c15452x854f54e7.f215094i = true;
            }
        };
    }

    public static final int O6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15452x854f54e7 c15452x854f54e7, float f17, int i17, int i18) {
        c15452x854f54e7.getClass();
        int red = android.graphics.Color.red(i17);
        int blue = android.graphics.Color.blue(i17);
        int green = android.graphics.Color.green(i17);
        int red2 = android.graphics.Color.red(i18);
        return android.graphics.Color.rgb(red + ((int) ((red2 - red) * f17)), green + ((int) (f17 * (android.graphics.Color.green(i18) - green))), blue + ((int) ((android.graphics.Color.blue(i18) - blue) * f17)));
    }

    public final void P6(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 rv6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rv6, "rv");
        this.f215089d = rv6;
        if (!this.f215092g) {
            mo48813x58998cd();
        }
        this.f215092g = true;
        m158354x19263085().mo273xed6858b4().a(this.f215096n);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC$videoFinishListener$1] */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC$lifecycleObserver$1] */
    public C15452x854f54e7(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        this.f215093h = ofFloat;
        this.f215094i = true;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f215095m = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5441x35e2cf6a>(a0Var) { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC$videoFinishListener$1
            {
                this.f39173x3fe91575 = -1291074182;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5441x35e2cf6a c5441x35e2cf6a) {
                int w17;
                int y17;
                in5.s0 s0Var;
                so2.u1 u1Var;
                am.fa faVar;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5441x35e2cf6a event = c5441x35e2cf6a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15452x854f54e7 c15452x854f54e7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15452x854f54e7.this;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = c15452x854f54e7.f215089d;
                if (c1163xf1deaba4 != null) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager mo7951xfd37656d = c1163xf1deaba4.mo7951xfd37656d();
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = mo7951xfd37656d instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) mo7951xfd37656d : null;
                    if (c1162x665295de != null && (w17 = c1162x665295de.w()) <= (y17 = c1162x665295de.y())) {
                        while (true) {
                            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 q07 = c1163xf1deaba4.q0(w17, false);
                            s0Var = q07 instanceof in5.s0 ? (in5.s0) q07 : null;
                            if (s0Var != null) {
                                android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.ipz);
                                if (!(p17 != null && p17.getVisibility() == 0)) {
                                    s0Var = null;
                                }
                                if (s0Var != null) {
                                    java.lang.Object obj = s0Var.f374658i;
                                    u1Var = obj instanceof so2.u1 ? (so2.u1) obj : null;
                                    if (u1Var != null && u1Var.getFeedObject().m59331xcb21161d()) {
                                        long m59233x87980ca = u1Var.getFeedObject().m59233x87980ca();
                                        faVar = event.f135782g;
                                        if (m59233x87980ca == faVar.f88191a || (faVar.f88192b && u1Var.getFeedObject().m59260x51f8f5b0() == faVar.f88191a)) {
                                            break;
                                        }
                                    }
                                }
                            }
                            if (w17 == y17) {
                                break;
                            }
                            w17++;
                        }
                        if (faVar.f88193c) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedMegaVideoBtnAnimUIC", "reset mega video anim status, feedId = " + faVar.f88191a);
                            if (c15452x854f54e7.f215094i) {
                                u1Var.f492163d = false;
                            }
                        } else if (faVar.f88194d) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedMegaVideoBtnAnimUIC", "video is completed, feedId = " + faVar.f88191a);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedMegaVideoBtnAnimUIC", "start finder feed mega video button anim, feedId = " + faVar.f88191a);
                            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.cd(s0Var, c15452x854f54e7));
                            if (!u1Var.f492163d) {
                                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = c15452x854f54e7.m158354x19263085();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
                                r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s5 s5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s5.f206882a;
                                java.lang.String u17 = pm0.v.u(u1Var.mo2128x1ed62e84());
                                java.lang.String m75945x2fec8307 = V6.m75945x2fec8307(0);
                                if (m75945x2fec8307 == null) {
                                    m75945x2fec8307 = "";
                                }
                                java.lang.String m75945x2fec83072 = V6.m75945x2fec8307(1);
                                if (m75945x2fec83072 == null) {
                                    m75945x2fec83072 = "";
                                }
                                java.lang.String m75945x2fec83073 = V6.m75945x2fec8307(2);
                                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21412, u17, m75945x2fec8307, m75945x2fec83072, m75945x2fec83073 != null ? m75945x2fec83073 : "");
                                u1Var.f492163d = true;
                            }
                        }
                    }
                }
                return true;
            }
        };
        this.f215096n = new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC$lifecycleObserver$1
            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
            /* renamed from: onDestroy */
            public final void m63049xac79a11b() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15452x854f54e7 c15452x854f54e7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15452x854f54e7.this;
                c15452x854f54e7.f215095m.mo48814x2efc64();
                c15452x854f54e7.m158354x19263085().mo273xed6858b4().c(this);
            }

            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_PAUSE)
            /* renamed from: onPause */
            public final void m63050xb01dfb57() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15452x854f54e7 c15452x854f54e7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15452x854f54e7.this;
                c15452x854f54e7.f215095m.mo48814x2efc64();
                c15452x854f54e7.f215094i = false;
            }

            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_RESUME)
            /* renamed from: onResume */
            public final void m63051x57429eec() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15452x854f54e7 c15452x854f54e7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15452x854f54e7.this;
                c15452x854f54e7.f215095m.mo48813x58998cd();
                c15452x854f54e7.f215094i = true;
            }
        };
    }
}
