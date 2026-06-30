package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class s1 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {
    public boolean A;
    public boolean B;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 C;
    public final com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.i1 D;
    public final com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.j1 E;
    public final com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.f1 F;
    public final com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.l1 G;
    public final android.view.GestureDetector H;
    public int I;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f232946d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f232947e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f232948f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f232949g;

    /* renamed from: h, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f232950h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f232951i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f232952m;

    /* renamed from: n, reason: collision with root package name */
    public ll3.h1 f232953n;

    /* renamed from: o, reason: collision with root package name */
    public int f232954o;

    /* renamed from: p, reason: collision with root package name */
    public int f232955p;

    /* renamed from: q, reason: collision with root package name */
    public uq5.b f232956q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f232957r;

    /* renamed from: s, reason: collision with root package name */
    public long f232958s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f232959t;

    /* renamed from: u, reason: collision with root package name */
    public fm3.u f232960u;

    /* renamed from: v, reason: collision with root package name */
    public long f232961v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16692x9f29da01 f232962w;

    /* renamed from: x, reason: collision with root package name */
    public long f232963x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f232964y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f232965z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f232946d = "MicroMsg.MusicMvLyricUIC";
        this.f232948f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.g1(activity));
        this.f232949g = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.k1(activity));
        this.f232951i = new java.util.ArrayList();
        this.f232952m = new java.util.ArrayList();
        this.f232955p = -1;
        new java.util.HashMap();
        this.C = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.D = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.i1(this);
        this.E = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.j1(this, activity);
        this.F = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.f1(this);
        this.G = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.l1(this);
        this.H = new android.view.GestureDetector(m80379x76847179(), new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h1(this));
    }

    public static final void O6(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1 s1Var, android.view.View view) {
        java.lang.String str = s1Var.f232946d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "_onViewAdded");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = view != null ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) view.findViewById(com.p314xaae8f345.mm.R.id.j7o) : null;
        if (c1163xf1deaba4 == null) {
            return;
        }
        java.util.ArrayList arrayList = s1Var.f232951i;
        if (arrayList.contains(c1163xf1deaba4)) {
            return;
        }
        arrayList.add(c1163xf1deaba4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "lyricList size:%d", java.lang.Integer.valueOf(arrayList.size()));
        if (((km3.d) c1163xf1deaba4.mo7946xf939df19()) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "new MusicLyricAdapter");
            km3.d dVar = new km3.d(s1Var.D);
            dVar.x(s1Var.f232952m);
            c1163xf1deaba4.mo7960x6cab2c8d(dVar);
        }
        if (((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) c1163xf1deaba4.getLayoutManager()) != null) {
            int i17 = s1Var.f232955p;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList2);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = c1163xf1deaba4;
            yj0.a.d(c1163xf1deaba42, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC", "_onViewAdded", "(Landroid/view/View;)V", "Undefined", "scrollToPosition", "(I)V");
            c1163xf1deaba4.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(c1163xf1deaba42, "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC", "_onViewAdded", "(Landroid/view/View;)V", "Undefined", "scrollToPosition", "(I)V");
        }
    }

    public static final void P6(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1 s1Var, android.view.View view) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(s1Var.f232946d, "_onViewRemoved");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = view != null ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) view.findViewById(com.p314xaae8f345.mm.R.id.j7o) : null;
        if (c1163xf1deaba4 == null) {
            return;
        }
        s1Var.f232951i.remove(c1163xf1deaba4);
    }

    public static final void Q6(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1 s1Var, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(s1Var.f232946d, "reportLyricsClickAction:%d", java.lang.Integer.valueOf(i17));
        android.app.Activity context = s1Var.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0 n0Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0) a17;
        android.app.Activity context2 = s1Var.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.hf2 hf2Var = ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0.class)).f232843i;
        if (s1Var.f232960u != null) {
            fm3.j0 j0Var = fm3.j0.f345611a;
            android.app.Activity m80379x76847179 = s1Var.m80379x76847179();
            fm3.u uVar = s1Var.f232960u;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(uVar);
            fm3.j0.g(j0Var, m80379x76847179, hf2Var, uVar, i17, 1, 2, 0, n0Var.Q6(), n0Var.O6(), n0Var.P6(), n0Var.E, 64, null);
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6 R6() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6) ((jz5.n) this.f232948f).mo141623x754a37bb();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0072, code lost:
    
        if ((r4 != null && r4.getVisibility() == 0) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S6() {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1.S6():void");
    }

    public final void T6() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab m78735x28280f95;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f435481a;
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 c16668xffb9dd68 = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68) a17;
        android.view.View view = this.f232947e;
        if (view != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.m8.f232834c.a(view, kz5.c0.k(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.j7o), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.f567604k22), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.gbk), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.gyy), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.os8)), 8);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f232950h;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.setVisibility(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6 R6 = R6();
        if (R6 != null) {
            R6.setVisibility(4);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6 R62 = R6();
        if (R62 != null) {
            R62.setAlpha(0.0f);
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
        ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.e1) zVar.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.e1.class)).f232642g.a();
        android.view.View view2 = this.f232947e;
        if (view2 != null) {
            view2.post(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n1(this));
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) m158354x19263085 : null;
        if (activityC21401x6ce6f73f != null && (m78735x28280f95 = activityC21401x6ce6f73f.m78735x28280f95()) != null) {
            m78735x28280f95.m81450x8e764904(false);
        }
        pk4.c cVar = c16668xffb9dd68.f232516p;
        com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc mo72002x9972f526 = cVar != null ? cVar.mo72002x9972f526() : null;
        if (mo72002x9972f526 != null) {
            uq5.b bVar = (uq5.b) mo72002x9972f526.g(uq5.k.BlurEffect);
            this.f232956q = bVar;
            if (bVar != null) {
                bVar.d(20.0f);
            }
            mo72002x9972f526.c(this.f232956q);
        }
        pk4.c cVar2 = c16668xffb9dd68.f232516p;
        if (cVar2 != null) {
            gk4.r rVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.TextureViewSurfaceTextureListenerC18694xeac4a29) cVar2).f256099f;
            um5.i0 i0Var = rVar.f354136h;
            long j17 = rVar.f354145q;
            i0Var.getClass();
            i0Var.f(new um5.t(i0Var, j17));
        }
        android.view.View view3 = this.f232947e;
        if (view3 != null) {
            view3.post(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.p1(this));
        }
        this.f232957r = true;
    }

    public final void U6(android.view.View view, fm3.u musicMv) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicMv, "musicMv");
        java.lang.String str = this.f232946d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "selectView");
        this.f232947e = view;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6 R6 = R6();
        if (R6 != null) {
            R6.m67329x2eac842c(null);
        }
        this.f232950h = view != null ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) view.findViewById(com.p314xaae8f345.mm.R.id.j7o) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6 R62 = R6();
        if (R62 != null) {
            R62.m67329x2eac842c(this.E);
        }
        this.f232960u = musicMv;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16692x9f29da01 c16692x9f29da01 = view != null ? (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16692x9f29da01) view.findViewById(com.p314xaae8f345.mm.R.id.j7n) : null;
        this.f232962w = c16692x9f29da01;
        if (c16692x9f29da01 != null) {
            c16692x9f29da01.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q1(this));
        }
        if (this.f232964y) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "show prelude lyric, hide lyricRV");
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f232950h;
            if (c1163xf1deaba4 != null) {
                c1163xf1deaba4.setVisibility(4);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16692x9f29da01 c16692x9f29da012 = this.f232962w;
            if (c16692x9f29da012 != null) {
                c16692x9f29da012.setVisibility(0);
                return;
            }
            return;
        }
        if (!this.f232965z || this.A) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "in 3 second, hide lyricRV");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f232950h;
        if (c1163xf1deaba42 == null) {
            return;
        }
        c1163xf1deaba42.setVisibility(4);
    }

    public final void V6(r45.hf2 hf2Var, ll3.h1 h1Var, boolean z17) {
        ll3.f1 d17;
        java.lang.String m75945x2fec8307;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setSongInfo lyricObj.sentenceSize :");
        java.lang.Long l17 = null;
        sb6.append(h1Var != null ? java.lang.Integer.valueOf(h1Var.e()) : null);
        sb6.append(", lyricList size:");
        java.util.ArrayList<p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4> arrayList = this.f232951i;
        sb6.append(arrayList.size());
        sb6.append(", isFromFilterLyric:");
        sb6.append(z17);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f232946d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        if (hf2Var != null && (m75945x2fec8307 = hf2Var.m75945x2fec8307(0)) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6 R6 = R6();
            java.lang.String m75945x2fec83072 = hf2Var.m75945x2fec8307(1);
            java.lang.String m75945x2fec83073 = hf2Var.m75945x2fec8307(8);
            R6.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.a3 a3Var = R6.f233230w;
            a3Var.getClass();
            a3Var.f233310a = m75945x2fec8307;
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            a3Var.f233311b = m75945x2fec83072;
            if (m75945x2fec83073 == null) {
                m75945x2fec83073 = "";
            }
            a3Var.f233312c = m75945x2fec83073;
            R6.b();
        }
        boolean z18 = this.B;
        java.util.ArrayList arrayList2 = this.f232952m;
        if (z18 && arrayList2.size() >= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "current lyrics is filter lyric, not to update");
            return;
        }
        this.B = z17;
        arrayList2.clear();
        this.f232953n = h1Var;
        if (h1Var != null) {
            int e17 = h1Var.e();
            for (int i17 = 0; i17 < e17; i17++) {
                java.lang.String str2 = h1Var.d(i17).f400701b;
                if (str2 == null) {
                    str2 = "";
                }
                arrayList2.add(str2);
            }
        }
        R6().m67332x12e1de9a(h1Var);
        this.f232963x = 0L;
        if (arrayList2.size() > 0) {
            ll3.h1 h1Var2 = this.f232953n;
            if (h1Var2 != null && (d17 = h1Var2.d(0)) != null) {
                l17 = java.lang.Long.valueOf(d17.f400700a);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(l17, "null cannot be cast to non-null type kotlin.Long");
            this.f232963x = l17.longValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "setSongInfo preludeLen:" + this.f232963x + " ms");
            if (this.f232963x >= 3000) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f232950h;
                if (c1163xf1deaba4 != null) {
                    c1163xf1deaba4.setVisibility(4);
                }
                this.f232964y = true;
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16692x9f29da01 c16692x9f29da01 = this.f232962w;
                if (c16692x9f29da01 != null) {
                    c16692x9f29da01.setVisibility(0);
                    c16692x9f29da01.f(0L);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "setSongInfo startAnim:" + this.f232963x + " ms");
                }
            }
        }
        if (!this.B && !this.f232965z) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "set timeout");
            this.f232965z = true;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f232950h;
            if (c1163xf1deaba42 != null) {
                c1163xf1deaba42.setVisibility(4);
            }
            this.C.mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.r1(this), 3000L);
        }
        for (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 : arrayList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "update lyricLines:%d", java.lang.Integer.valueOf(arrayList2.size()));
            km3.d dVar = (km3.d) c1163xf1deaba43.mo7946xf939df19();
            if (dVar != null) {
                dVar.x(arrayList2);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6 R6 = R6();
        boolean z17 = false;
        if (R6 != null && R6.getVisibility() == 0) {
            z17 = true;
        }
        if (!z17) {
            return super.mo2274xbdc3c5dc();
        }
        S6();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f232946d, "onCreateAfter");
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 lyricRv = R6().getLyricRv();
        if (lyricRv != null) {
            lyricRv.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.m1(this));
        }
        jz5.g gVar = this.f232949g;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16704xa1b54733 c16704xa1b54733 = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16704xa1b54733) ((jz5.n) gVar).mo141623x754a37bb();
        if (c16704xa1b54733 != null) {
            c16704xa1b54733.setOnHierarchyChangeListener(this.F);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16704xa1b54733 c16704xa1b547332 = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16704xa1b54733) ((jz5.n) gVar).mo141623x754a37bb();
        if (c16704xa1b547332 == null) {
            return;
        }
        c16704xa1b547332.m67374xf5c5c186(this.G);
    }
}
