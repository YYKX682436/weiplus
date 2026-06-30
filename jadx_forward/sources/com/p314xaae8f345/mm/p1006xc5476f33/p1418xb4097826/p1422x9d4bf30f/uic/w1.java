package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic;

/* loaded from: classes2.dex */
public abstract class w1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1423x2e06d1.uic.AbstractC13643xe024ad {

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10 f183497p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x10 f183498q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13918xdafe8cba f183499r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f183500s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.FrameLayout f183501t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.ProgressBar f183502u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1423x2e06d1.uic.AbstractC13643xe024ad
    public void X6(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5444xabe18593 c5444xabe18593) {
        if (c5444xabe18593 != null && c5444xabe18593.f135784g.f88361a == 1001 && this.f183274d == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10 r10Var = this.f183497p;
            if (r10Var != null) {
                r10Var.v();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
                throw null;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1423x2e06d1.uic.AbstractC13643xe024ad
    public void Y6() {
        android.widget.TextView textView = this.f183500s;
        if (textView == null) {
            return;
        }
        textView.setVisibility(0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1423x2e06d1.uic.AbstractC13643xe024ad
    public void Z6(r45.e21 e21Var) {
        mo55423x97a1a3d();
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x10 a7(int i17, int i18, int i19) {
        android.view.View m7474xfb86a31b;
        android.view.View m7474xfb86a31b2;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x10 x10Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x10((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085, 2, i17, false, W6(), null, 40, null);
        java.lang.String str = this.f183275e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        x10Var.F = str;
        x10Var.D = i18;
        x10Var.P = b7();
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = m158358x197d1fc6();
        android.view.View view = null;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 rlLayout = (m158358x197d1fc6 == null || (m7474xfb86a31b2 = m158358x197d1fc6.m7474xfb86a31b()) == null) ? null : (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) m7474xfb86a31b2.findViewById(com.p314xaae8f345.mm.R.id.m6e);
        if (rlLayout == null) {
            rlLayout = U6().f516056b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(rlLayout, "rlLayout");
        }
        x10Var.f187713m = rlLayout;
        rlLayout.m82565x6107557d(true);
        if (m158359x1e885992().getBooleanExtra("key_has_cover", false)) {
            x10Var.f187713m.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        }
        x10Var.f192556J = i19;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc62 = m158358x197d1fc6();
        if (m158358x197d1fc62 != null && (m7474xfb86a31b = m158358x197d1fc62.m7474xfb86a31b()) != null) {
            view = m7474xfb86a31b.findViewById(com.p314xaae8f345.mm.R.id.f565762dg3);
        }
        x10Var.M = view;
        return x10Var;
    }

    public final int b7() {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = m158358x197d1fc6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1424x9da2e250.C13646x818616e5 c13646x818616e5 = m158358x197d1fc6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1424x9da2e250.C13646x818616e5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1424x9da2e250.C13646x818616e5) m158358x197d1fc6 : null;
        if (c13646x818616e5 != null) {
            return c13646x818616e5.f183285t;
        }
        return 0;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x10 c7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x10 x10Var = this.f183498q;
        if (x10Var != null) {
            return x10Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
        throw null;
    }

    public void d7() {
    }

    public void e7() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1423x2e06d1.uic.AbstractC13643xe024ad, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        super.mo450x3e5a77bb(bundle);
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = m158358x197d1fc6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m158358x197d1fc6);
        pf5.z zVar = pf5.z.f435481a;
        final r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.b(m158358x197d1fc6).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        if (V6()) {
            final int O6 = O6(this.f183274d);
            final java.lang.String str = this.f183275e;
            final java.lang.String str2 = this.f183276f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13918xdafe8cba c13918xdafe8cba = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13918xdafe8cba(this, O6, str, V6, str2) { // from class: com.tencent.mm.plugin.finder.activity.uic.FinderTopicContentUIC$FinderNewestLoader
                public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.w1 C;

                {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "topicContent");
                    this.C = this;
                }

                @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13918xdafe8cba
                public void d(int i17, r45.xn5 xn5Var) {
                    super.d(i17, xn5Var);
                    this.C.e7();
                }

                @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28, mv2.w0
                /* renamed from: onPostStart */
                public void mo55429x74e3dc83(long j17) {
                    super.mo55429x74e3dc83(j17);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.w1 w1Var = this.C;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860.t7(w1Var.R6(), w1Var.Q6(), false, 2, null);
                }
            };
            c13918xdafe8cba.m56361x5fd54ec8(m158359x1e885992());
            c13918xdafe8cba.f189213s = this.f183277g;
            c13918xdafe8cba.f189214t = this.f183278h;
            c13918xdafe8cba.f189215u = this.f183274d;
            c13918xdafe8cba.f189208n = java.lang.Long.valueOf(m158359x1e885992().getLongExtra("key_feed_ref_id", 0L));
            c13918xdafe8cba.f189204g = b7();
            this.f183499r = c13918xdafe8cba;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13918xdafe8cba c13918xdafe8cba2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13918xdafe8cba(this, O6(this.f183274d), this.f183275e, V6, this.f183276f) { // from class: com.tencent.mm.plugin.finder.activity.uic.FinderTopicContentUIC$FinderHottestFeedLoader
                public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.w1 C;

                {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topicContent, "topicContent");
                    this.C = this;
                }

                @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13918xdafe8cba
                public void d(int i17, r45.xn5 xn5Var) {
                    super.d(i17, xn5Var);
                    this.C.e7();
                }

                @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28
                /* renamed from: onFeedUpdateEventCallback */
                public void mo55427x3506b359(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 event) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                    super.mo55427x3506b359(event);
                }

                @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122
                /* renamed from: onFetchRefreshDone */
                public void mo55428xcbba01e2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
                    super.mo55428xcbba01e2(response);
                    this.C.d7();
                }
            };
            c13918xdafe8cba2.m56361x5fd54ec8(m158359x1e885992());
            c13918xdafe8cba2.f189213s = this.f183277g;
            c13918xdafe8cba2.f189214t = this.f183278h;
            c13918xdafe8cba2.f189215u = this.f183274d;
            c13918xdafe8cba2.f189208n = java.lang.Long.valueOf(m158359x1e885992().getLongExtra("key_feed_ref_id", 0L));
            c13918xdafe8cba2.f189204g = b7();
            this.f183499r = c13918xdafe8cba2;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feedLoader : ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13918xdafe8cba c13918xdafe8cba3 = this.f183499r;
        if (c13918xdafe8cba3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
            throw null;
        }
        sb6.append(c13918xdafe8cba3);
        sb6.append(" this.innerTabType : ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13918xdafe8cba c13918xdafe8cba4 = this.f183499r;
        if (c13918xdafe8cba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
            throw null;
        }
        sb6.append(c13918xdafe8cba4.f189215u);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, sb6.toString());
        int T6 = T6();
        int P6 = P6();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13918xdafe8cba c13918xdafe8cba5 = this.f183499r;
        if (c13918xdafe8cba5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10 r10Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10(abstractActivityC21394xb3d2c0cf, 2, P6, c13918xdafe8cba5);
        java.lang.String str3 = this.f183275e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str3, "<set-?>");
        r10Var.f190401o = str3;
        r10Var.f190399m = T6;
        b7();
        this.f183497p = r10Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x10 a76 = a7(P6, T6, this.f183274d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a76, "<set-?>");
        this.f183498q = a76;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x10 c76 = c7();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10 r10Var2 = this.f183497p;
        if (r10Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        c76.f187715o = r10Var2;
        if (r10Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        r10Var2.m(c7());
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc62 = m158358x197d1fc6();
        if (m158358x197d1fc62 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x10 c77 = c7();
            p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.b(m158358x197d1fc62).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            fc2.o Z6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) a17).Z6(-1);
            if (Z6 != null) {
                Z6.d(c77.f187713m.m82555x4905e9fa());
            }
            c77.K = m158358x197d1fc62;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ut) zVar.b(m158358x197d1fc62).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ut.class)).P6("activityid", pm0.v.u(this.f183277g));
        }
        this.f183500s = (android.widget.TextView) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.m2g);
        this.f183501t = (android.widget.FrameLayout) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f565762dg3);
        this.f183502u = (android.widget.ProgressBar) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f564152ji);
        android.widget.TextView textView = this.f183500s;
        if (textView != null) {
            textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.v1(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        int X6 = R6().X6();
        int i17 = this.f183274d;
        if (i17 - 1 == X6) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13918xdafe8cba c13918xdafe8cba = this.f183499r;
            if (c13918xdafe8cba == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
                throw null;
            }
            c13918xdafe8cba.f189216v = i17;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPause check visible activeIndex :");
        sb6.append(X6);
        sb6.append(" empty View :");
        android.view.View t17 = c7().t();
        sb6.append(t17 != null ? java.lang.Integer.valueOf(t17.getVisibility()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, sb6.toString());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1423x2e06d1.uic.AbstractC13643xe024ad, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onPreDestroyed */
    public void mo47482x6fa9d635() {
        super.mo47482x6fa9d635();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10 r10Var = this.f183497p;
        if (r10Var != null) {
            r10Var.mo979x3f5eee52();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "onResume");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13918xdafe8cba c13918xdafe8cba = this.f183499r;
        if (c13918xdafe8cba != null) {
            c13918xdafe8cba.f189216v = -1;
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1423x2e06d1.uic.AbstractC13643xe024ad
    /* renamed from: setCoveredStyle */
    public void mo55423x97a1a3d() {
        java.lang.String str;
        r45.e21 e21Var = this.f183279i;
        if (e21Var == null || (str = e21Var.m75945x2fec8307(5)) == null) {
            str = "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) c7().f187713m.findViewById(com.p314xaae8f345.mm.R.id.ili);
        if (textView != null) {
            textView.setTextColor(m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b));
        }
        android.view.View findViewById = c7().f187713m.findViewById(com.p314xaae8f345.mm.R.id.i0a);
        if (findViewById != null) {
            findViewById.setBackgroundColor(m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77667x8113c229));
        }
        android.view.View findViewById2 = c7().f187713m.findViewById(com.p314xaae8f345.mm.R.id.m3v);
        if (findViewById2 != null) {
            findViewById2.setBackgroundColor(m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77667x8113c229));
        }
        android.view.View findViewById3 = c7().f187713m.findViewById(com.p314xaae8f345.mm.R.id.bdv);
        if (findViewById3 != null) {
            findViewById3.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563171ys);
        }
        android.widget.TextView textView2 = (android.widget.TextView) c7().f187713m.findViewById(com.p314xaae8f345.mm.R.id.dft);
        if (textView2 != null) {
            textView2.setTextColor(m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560787u6));
        }
        android.widget.TextView textView3 = (android.widget.TextView) c7().f187713m.findViewById(com.p314xaae8f345.mm.R.id.m2g);
        if (textView3 != null) {
            textView3.setTextColor(m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560787u6));
        }
    }
}
