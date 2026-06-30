package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class v9 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.q9 {

    /* renamed from: k, reason: collision with root package name */
    public final int f192415k;

    /* renamed from: l, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa f192416l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f192417m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Runnable f192418n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13756x9bf3c35d f192419o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13757xdf2b1379 f192420p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13758xc64fb6fc f192421q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f192422r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f192423s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.ref.WeakReference f192424t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.mm.plugin.finder.feed.FinderFeedSnsAdHandler$adFeedUiActionListener$1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.plugin.finder.feed.FinderFeedSnsAdHandler$feedUpdateListener$1] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.tencent.mm.plugin.finder.feed.FinderFeedSnsAdHandler$lifecycleObserver$1] */
    public v9(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f192415k = com.p314xaae8f345.mm.R.id.g1y;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f192419o = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5470xdd7cf62c>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.FinderFeedSnsAdHandler$adFeedUiActionListener$1
            {
                this.f39173x3fe91575 = 2090220060;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5470xdd7cf62c c5470xdd7cf62c) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5470xdd7cf62c event = c5470xdd7cf62c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v9 v9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v9.this;
                am.fb fbVar = event.f135808g;
                int i17 = fbVar.f88197b;
                if (i17 == 10000) {
                    long j17 = fbVar.f88196a;
                    java.lang.Runnable runnable = v9Var.f192418n;
                    if (runnable != null && (c1163xf1deaba4 = v9Var.f190343h) != null) {
                        c1163xf1deaba4.removeCallbacks(runnable);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r9 r9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r9(v9Var, j17);
                    v9Var.f192418n = r9Var;
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = v9Var.f190343h;
                    if (c1163xf1deaba42 != null) {
                        c1163xf1deaba42.postDelayed(r9Var, 1000L);
                    }
                    v9Var.m();
                    return true;
                }
                if (i17 == 40001) {
                    long j18 = fbVar.f88196a;
                    if (j18 != v9Var.f190338c) {
                        return true;
                    }
                    v9Var.n(j18, fbVar.f88202g, v9Var.f190341f);
                    return true;
                }
                if (i17 == 30000) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v9.f(v9Var, fbVar.f88196a, fbVar.f88202g, 3, 2, fbVar.f88198c, fbVar.f88199d);
                    return true;
                }
                if (i17 != 30001) {
                    return true;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v9.f(v9Var, fbVar.f88196a, fbVar.f88202g, 2, 2, fbVar.f88198c, fbVar.f88199d);
                return true;
            }
        };
        this.f192420p = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.FinderFeedSnsAdHandler$feedUpdateListener$1
            {
                this.f39173x3fe91575 = 439877283;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 event = c5445x963cab3;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.ia iaVar = event.f135785g;
                if (iaVar != null && iaVar.f88452b == 22) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v9.this.m();
                }
                return false;
            }
        };
        this.f192421q = new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.plugin.finder.feed.FinderFeedSnsAdHandler$lifecycleObserver$1

            /* renamed from: d, reason: collision with root package name */
            public boolean f187625d;

            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_PAUSE)
            /* renamed from: onPause */
            public final void m56009xb01dfb57() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v9 v9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v9.this;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = v9Var.f190343h;
                if (c1163xf1deaba4 != null) {
                    c1163xf1deaba4.removeCallbacks(v9Var.f192418n);
                }
                v9Var.f192417m = v9Var.j(v9Var.f192416l);
                v9Var.g();
            }

            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_RESUME)
            /* renamed from: onResume */
            public final void m56010x57429eec() {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df193;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df194;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df195;
                if (!this.f187625d) {
                    this.f187625d = true;
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v9 v9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v9.this;
                boolean j17 = v9Var.j(v9Var.f192416l);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedAdHandler", "changeAdFollowView isFollowCur:" + j17 + " isFollowOnLeavePage:" + v9Var.f192417m + ", lastFeedPos=" + v9Var.f190340e);
                if (v9Var.f192417m != j17) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba44 = v9Var.f190343h;
                    int mo1894x7e414b06 = (c1163xf1deaba44 == null || (mo7946xf939df195 = c1163xf1deaba44.mo7946xf939df19()) == null) ? 0 : mo7946xf939df195.mo1894x7e414b06();
                    if (j17) {
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba45 = v9Var.f190343h;
                        if (c1163xf1deaba45 != null && (mo7946xf939df194 = c1163xf1deaba45.mo7946xf939df19()) != null) {
                            long mo7906x1ed62e84 = mo7946xf939df194.mo7906x1ed62e84(v9Var.f190340e);
                            java.lang.Runnable runnable = v9Var.f192418n;
                            if (runnable != null && (c1163xf1deaba43 = v9Var.f190343h) != null) {
                                c1163xf1deaba43.removeCallbacks(runnable);
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r9 r9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r9(v9Var, mo7906x1ed62e84);
                            v9Var.f192418n = r9Var;
                            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba46 = v9Var.f190343h;
                            if (c1163xf1deaba46 != null) {
                                c1163xf1deaba46.postDelayed(r9Var, 1000L);
                            }
                        }
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba47 = v9Var.f190343h;
                        if (c1163xf1deaba47 != null && (mo7946xf939df193 = c1163xf1deaba47.mo7946xf939df19()) != null) {
                            mo7946xf939df193.m8148xed6e4d18(v9Var.f190340e, new jz5.l(25, 2));
                        }
                        v9Var.m();
                    } else {
                        v9Var.f190342g = false;
                        if (mo1894x7e414b06 > 0 && (c1163xf1deaba4 = v9Var.f190343h) != null && (mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19()) != null) {
                            mo7946xf939df19.m8152xc67946d3(0, mo1894x7e414b06, new jz5.l(25, 0));
                        }
                        v9Var.n(v9Var.f190338c, v9Var.f190339d, null);
                    }
                    if (mo1894x7e414b06 <= 0 || (c1163xf1deaba42 = v9Var.f190343h) == null || (mo7946xf939df192 = c1163xf1deaba42.mo7946xf939df19()) == null) {
                        return;
                    }
                    mo7946xf939df192.m8152xc67946d3(0, mo1894x7e414b06, new jz5.l(29, 1));
                }
            }
        };
        this.f192423s = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.u9.f190679d);
    }

    public static final void f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v9 v9Var, long j17, java.lang.String str, int i17, int i18, int i19, int i27) {
        int i28 = (j17 == v9Var.f190338c && v9Var.f190342g) ? i19 : i27;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = v9Var.f190336a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        o3Var.Fk(j17, str, i17, i18, i28, i19, "", nyVar != null ? nyVar.V6() : null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.q9
    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        this.f190343h = c1163xf1deaba4;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f190336a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        fc2.c n17 = zy2.ra.n1((zy2.ra) pf5.z.f435481a.a(activity).c(zy2.ra.class), 0, 1, null);
        if (n17 != null) {
            n17.a(this.f190345j);
        }
        mo48813x58998cd();
        mo48813x58998cd();
        activity.mo273xed6858b4().a(this.f192421q);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.q9
    public void b(fc2.t ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedAdHandler", "onCenterFeedChange");
        if (this.f190340e == 0) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f190343h;
            if (c1163xf1deaba4 != null) {
                c1163xf1deaba4.removeCallbacks(this.f192418n);
            }
            g();
        }
        if (ev6.f342527m == 0) {
            n(ev6.f342525k, ev6.f342526l, ev6.f342529o);
        }
        this.f190342g = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.q9
    public void c() {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f190336a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        fc2.c n17 = zy2.ra.n1((zy2.ra) pf5.z.f435481a.a(activity).c(zy2.ra.class), 0, 1, null);
        if (n17 != null) {
            n17.d(this.f190345j);
        }
        mo48814x2efc64();
        mo48814x2efc64();
        activity.mo273xed6858b4().c(this.f192421q);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.q9
    public void d(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedAdHandler", "onVideoPlayOneMinute");
        if (j17 == this.f190338c && !this.f190342g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedAdHandler", "onVideoPlayOneMinute feedId:" + j17);
            l(j17);
        }
        this.f190337b = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.q9
    public void e(long j17) {
        if (j17 == this.f190338c && !this.f190342g) {
            l(j17);
        }
        super.e(j17);
    }

    public final void g() {
        android.view.View view;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 m07;
        android.view.View findViewById;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedAdHandler", "cancelAdAnimView invoke");
        if (i()) {
            java.lang.ref.WeakReference weakReference = this.f192424t;
            view = (weakReference == null || (k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) weakReference.get()) == null) ? null : k3Var.f3639x46306858;
        } else {
            view = this.f192422r;
        }
        if (view != null && (findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.e9w)) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedAdHandler", "cancelAdAnimView");
            android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.f566019ee3);
            if (findViewById2 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedAdHandler", "cancelAdAnimView footer translationY " + findViewById2.getTranslationY() + " footer :0.0");
                android.view.ViewPropertyAnimator animate = findViewById2.animate();
                if (animate != null) {
                    animate.cancel();
                }
                findViewById2.setTranslationY(0.0f);
            }
            android.view.View findViewById3 = view.findViewById(this.f192415k);
            if (findViewById3 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedAdHandler", "cancelAdAnimView seekLayoutId translationY " + findViewById3.getTranslationY() + " seekLayoutId :0.0");
                android.view.ViewPropertyAnimator animate2 = findViewById3.animate();
                if (animate2 != null) {
                    animate2.cancel();
                }
                findViewById3.setTranslationY(0.0f);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedAdHandler", "cancelAdAnimView adTip translationY " + findViewById.getTranslationY() + " adTip :0.0");
            android.view.ViewPropertyAnimator animate3 = findViewById.animate();
            if (animate3 != null) {
                animate3.cancel();
            }
            findViewById.setTranslationY(0.0f);
        }
        if (j(this.f192416l)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedAdHandler", "cancelAdAnimView isFollowed notify adTip gone");
            if (i()) {
                java.lang.ref.WeakReference weakReference2 = this.f192424t;
                if (weakReference2 != null && (k3Var2 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) weakReference2.get()) != null) {
                    k(k3Var2);
                }
            } else {
                android.view.View view2 = this.f192422r;
                if (view2 != null && (c1163xf1deaba4 = this.f190343h) != null && (m07 = c1163xf1deaba4.m0(view2)) != null) {
                    k(m07);
                }
            }
        }
        this.f192422r = null;
        this.f192424t = null;
    }

    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 h(long j17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f190343h;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba42 != null ? c1163xf1deaba42.mo7946xf939df19() : null;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
        if (c22848x6ddd90cf == null) {
            return null;
        }
        java.util.Iterator it = c22848x6ddd90cf.m82898xfb7e5820().iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (((in5.c) it.next()).mo2128x1ed62e84() == j17) {
                break;
            }
            i17++;
        }
        if (i17 < 0 || (c1163xf1deaba4 = this.f190343h) == null) {
            return null;
        }
        return c1163xf1deaba4.p0(i17);
    }

    public final boolean i() {
        return ((java.lang.Boolean) ((jz5.n) this.f192423s).mo141623x754a37bb()).booleanValue();
    }

    public final boolean j(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa) {
        java.lang.String str;
        nv2.d0 d0Var = nv2.d0.f422003e;
        nv2.d0 d0Var2 = nv2.d0.f422003e;
        if (c19782x23db1cfa == null || (str = c19782x23db1cfa.m76197x6c03c64c()) == null) {
            str = "";
        }
        return nv2.d0.c(d0Var2, str, false, true, 2, null);
    }

    public final void k(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f190343h;
        if (c1163xf1deaba4 == null || (mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19()) == null) {
            return;
        }
        mo7946xf939df19.m8148xed6e4d18(k3Var.m8183xf806b362(), new jz5.l(25, 6));
    }

    public final void l(long j17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 h17 = h(j17);
        if (h17 == null || h17.m8183xf806b362() < 0 || (c1163xf1deaba4 = this.f190343h) == null || (mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19()) == null) {
            return;
        }
        mo7946xf939df19.m8148xed6e4d18(h17.m8183xf806b362(), new jz5.l(24, 3));
    }

    public final void m() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f190343h;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.s9(this));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
    
        if (r1.intValue() != 9) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(long r17, java.lang.String r19, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 r20) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v9.n(long, java.lang.String, com.tencent.mm.plugin.finder.storage.FeedData):void");
    }
}
