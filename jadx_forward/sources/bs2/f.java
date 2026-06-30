package bs2;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final bs2.f f105363a = new bs2.f();

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd f105364b;

    /* renamed from: c, reason: collision with root package name */
    public static mn2.g4 f105365c;

    /* renamed from: d, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 f105366d;

    /* renamed from: e, reason: collision with root package name */
    public static android.widget.FrameLayout f105367e;

    /* renamed from: f, reason: collision with root package name */
    public static p012xc85e97e9.p093xedfae76a.x f105368f;

    public final boolean a(java.lang.String mediaId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        mn2.g4 g4Var = f105365c;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mediaId, g4Var != null ? g4Var.n() : null);
    }

    public final void b(final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        p012xc85e97e9.p093xedfae76a.x xVar = f105368f;
        if (xVar != null) {
            android.widget.FrameLayout frameLayout = f105367e;
            android.content.Context context = frameLayout != null ? frameLayout.getContext() : null;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa1122 = context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context : null;
            if (activityC0065xcd7aa1122 != null && (mo273xed6858b4 = activityC0065xcd7aa1122.mo273xed6858b4()) != null) {
                mo273xed6858b4.c(xVar);
            }
        }
        f105368f = null;
        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(activityC0065xcd7aa112);
        frameLayout2.setAlpha(0.0f);
        f105367e = frameLayout2;
        p012xc85e97e9.p093xedfae76a.x xVar2 = new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.plugin.finder.preload.tabPreload.FinderPlayerPreloadCore$newPlaceHolderView$3
            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
            /* renamed from: onDestroy */
            public final void m58573xac79a11b() {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPlayerPreloadCore", "onDestroy: placeHolderView=" + bs2.f.f105367e);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clearCache: source=");
                sb6.append("LauncherUIDestroy");
                sb6.append(", cacheMedia=");
                sb6.append(hc2.b0.g(bs2.f.f105366d, 0, 1, null));
                sb6.append('.');
                mn2.g4 g4Var = bs2.f.f105365c;
                sb6.append(g4Var != null ? g4Var.n() : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPlayerPreloadCore", sb6.toString());
                pm0.v.X(bs2.d.f105356d);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112.this.mo273xed6858b4().c(this);
            }
        };
        f105368f = xVar2;
        activityC0065xcd7aa112.mo273xed6858b4().a(xVar2);
    }

    public final void c(mn2.g4 media, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 feedData) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(media, "media");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedData, "feedData");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        boolean S2 = t70Var.S2();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preloadThumbPlayer: switchOn=");
        sb6.append(S2);
        sb6.append(", newMedia=");
        jz5.f0 f0Var = null;
        sb6.append(hc2.b0.g(feedData, 0, 1, null));
        sb6.append('.');
        sb6.append(media.n());
        sb6.append(", oldCacheMedia=");
        sb6.append(hc2.b0.g(f105366d, 0, 1, null));
        sb6.append('.');
        mn2.g4 g4Var = f105365c;
        sb6.append(g4Var != null ? g4Var.n() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPlayerPreloadCore", sb6.toString());
        if (S2) {
            java.lang.String mediaId = media.n();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) pf5.u.f435469a.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34.class)).O6(new bs2.e(c0Var, mediaId));
            if (c0Var.f391645d) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("preloadThumbPlayer:return for hasLoadInPool, newMedia=");
                sb7.append(hc2.b0.g(feedData, 0, 1, null));
                sb7.append('.');
                sb7.append(media.n());
                sb7.append(", oldCacheMedia=");
                sb7.append(hc2.b0.g(feedData, 0, 1, null));
                sb7.append('.');
                mn2.g4 g4Var2 = f105365c;
                sb7.append(g4Var2 != null ? g4Var2.n() : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPlayerPreloadCore", sb7.toString());
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd2 = f105364b;
            if (c15188xd8bd4bd2 != null) {
                c15188xd8bd4bd2.mo58801x360802();
                c15188xd8bd4bd2.b();
            }
            f105365c = media;
            f105366d = feedData;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209304ja).mo141623x754a37bb()).r()).intValue() > 0) {
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                c15188xd8bd4bd = new cw2.o(context);
            } else {
                android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                c15188xd8bd4bd = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd(context2);
            }
            c15188xd8bd4bd.mo56711xe5cb79eb(true);
            feedData.m59178x99436d85(8);
            c15188xd8bd4bd.n(media, false, feedData);
            bs2.f fVar = f105363a;
            boolean T2 = t70Var.T2();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPlayerPreloadCore", "attachSurface: switchOn=" + T2);
            if (T2) {
                ((bt.u0) ((ct.a3) i95.n0.c(ct.a3.class))).getClass();
                com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 m78443x9cf0d20b = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPlayerPreloadCore", "attachSurface: LauncherUI=" + m78443x9cf0d20b);
                if (m78443x9cf0d20b != null) {
                    android.widget.FrameLayout frameLayout = f105367e;
                    if (frameLayout != null) {
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(frameLayout.getContext(), m78443x9cf0d20b)) {
                            frameLayout.removeAllViews();
                        } else {
                            android.view.ViewParent parent = frameLayout.getParent();
                            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                            if (viewGroup != null) {
                                viewGroup.removeView(frameLayout);
                            }
                            fVar.b(m78443x9cf0d20b);
                        }
                        f0Var = jz5.f0.f384359a;
                    }
                    if (f0Var == null) {
                        fVar.b(m78443x9cf0d20b);
                    }
                    android.widget.FrameLayout frameLayout2 = f105367e;
                    if (frameLayout2 != null && frameLayout2.getParent() == null) {
                        android.view.View decorView = m78443x9cf0d20b.getWindow().getDecorView();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                        ((android.view.ViewGroup) decorView).addView(f105367e, 1, 1);
                    }
                    android.widget.FrameLayout frameLayout3 = f105367e;
                    if (frameLayout3 != null) {
                        frameLayout3.addView(c15188xd8bd4bd);
                    }
                }
            }
            int i17 = ((c61.l7) i95.n0.c(c61.l7.class)).ek().R * 1000;
            if (i17 > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPlayerPreloadCore", "preloadThumbPlayer " + i17);
            } else {
                i17 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209389o5).mo141623x754a37bb()).r()).intValue();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15188xd8bd4bd.m61380xe56ce956(), "prepareToPlay minBufferDuration:" + i17);
            c15188xd8bd4bd.M1 = i17;
            c15188xd8bd4bd.F();
            c15188xd8bd4bd.M1 = 0;
            c15188xd8bd4bd.mo56709x764d819b(true);
            f105364b = c15188xd8bd4bd;
        }
    }
}
