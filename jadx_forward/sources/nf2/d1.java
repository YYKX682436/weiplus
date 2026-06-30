package nf2;

/* loaded from: classes10.dex */
public final class d1 implements nf2.e1 {
    public float A;
    public nf2.g0 B;
    public nf2.d0 C;
    public jz5.l D;
    public nf2.j1 E;
    public int F;
    public int G;
    public nf2.x H;
    public nf2.h0 I;

    /* renamed from: J, reason: collision with root package name */
    public final yz5.p f418212J;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f418213a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ViewGroup f418214b;

    /* renamed from: c, reason: collision with root package name */
    public nf2.f1 f418215c;

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f418216d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f418217e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f418218f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f418219g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.FrameLayout f418220h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f418221i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.View f418222j;

    /* renamed from: k, reason: collision with root package name */
    public android.view.View f418223k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.View f418224l;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f418225m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f418226n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f418227o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f418228p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f418229q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f418230r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1489xbf29e7f4.C14199x90952ee3 f418231s;

    /* renamed from: t, reason: collision with root package name */
    public nf2.i1 f418232t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f418233u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f418234v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f418235w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f418236x;

    /* renamed from: y, reason: collision with root package name */
    public jz5.l f418237y;

    /* renamed from: z, reason: collision with root package name */
    public nf2.f1 f418238z;

    public d1(android.content.Context context, android.view.ViewGroup container, nf2.f1 config, p3325xe03a0797.p3326xc267989b.y0 scope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        this.f418213a = context;
        this.f418214b = container;
        this.f418215c = config;
        this.f418216d = scope;
        this.A = 0.5f;
        this.E = nf2.j1.f418293d;
        this.f418212J = new nf2.n0(this);
        container.setVisibility(0);
        android.view.View c17 = c();
        this.f418217e = c17;
        container.addView(c17);
        b();
        this.B = new nf2.g0(this, this.f418215c);
        f();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1489xbf29e7f4.C14199x90952ee3 c14199x90952ee3 = this.f418231s;
        if (c14199x90952ee3 != null) {
            c14199x90952ee3.j(this.f418215c);
        }
        e();
        d();
    }

    public static final void a(nf2.d1 d1Var) {
        android.view.View view;
        int width;
        if (d1Var.f418215c.f418265n == nf2.a.f418181e && (view = d1Var.f418218f) != null) {
            android.view.ViewParent parent = view.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null && (width = viewGroup.getWidth()) > 0) {
                float x17 = view.getX();
                float x18 = view.getX() + view.getWidth();
                int i17 = d1Var.G;
                nf2.j1 j1Var = (x17 < ((float) i17) || x17 >= ((float) d1Var.F)) ? (x18 <= ((float) (width - d1Var.F)) || x18 > ((float) (width - i17))) ? nf2.j1.f418293d : nf2.j1.f418295f : nf2.j1.f418294e;
                if (j1Var != d1Var.E) {
                    d1Var.E = j1Var;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1489xbf29e7f4.C14199x90952ee3 c14199x90952ee3 = d1Var.f418231s;
                    if (c14199x90952ee3 != null) {
                        c14199x90952ee3.m56805xf4623a5d(j1Var);
                    }
                    if (d1Var.f418233u) {
                        return;
                    }
                    d1Var.k(j1Var);
                }
            }
        }
    }

    public final void b() {
        this.f418218f = this.f418217e.findViewById(com.p314xaae8f345.mm.R.id.tkq);
        this.f418219g = (android.widget.FrameLayout) this.f418217e.findViewById(com.p314xaae8f345.mm.R.id.tkw);
        this.f418220h = (android.widget.FrameLayout) this.f418217e.findViewById(com.p314xaae8f345.mm.R.id.tkv);
        this.f418221i = this.f418217e.findViewById(com.p314xaae8f345.mm.R.id.tkt);
        this.f418222j = this.f418217e.findViewById(com.p314xaae8f345.mm.R.id.ueu);
        this.f418223k = this.f418217e.findViewById(com.p314xaae8f345.mm.R.id.uew);
        this.f418224l = this.f418217e.findViewById(com.p314xaae8f345.mm.R.id.ues);
        this.f418225m = this.f418217e.findViewById(com.p314xaae8f345.mm.R.id.uey);
        this.f418226n = this.f418217e.findViewById(com.p314xaae8f345.mm.R.id.ueq);
        this.f418227o = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) this.f418217e.findViewById(com.p314xaae8f345.mm.R.id.uet);
        this.f418228p = (android.widget.ImageView) this.f418217e.findViewById(com.p314xaae8f345.mm.R.id.uer);
        this.f418229q = this.f418217e.findViewById(com.p314xaae8f345.mm.R.id.tkl);
        this.f418230r = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) this.f418217e.findViewById(com.p314xaae8f345.mm.R.id.tkn);
        this.f418231s = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1489xbf29e7f4.C14199x90952ee3) this.f418217e.findViewById(com.p314xaae8f345.mm.R.id.tkx);
        this.f418234v = this.f418217e.findViewById(com.p314xaae8f345.mm.R.id.tkr);
        this.f418235w = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) this.f418217e.findViewById(com.p314xaae8f345.mm.R.id.tks);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLyricsView", "bindViewReferences: all view references bound");
    }

    public final android.view.View c() {
        int i17;
        int ordinal = this.f418215c.f418265n.ordinal();
        if (ordinal == 0) {
            i17 = com.p314xaae8f345.mm.R.C30864xbddafb2a.ea7;
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            i17 = com.p314xaae8f345.mm.R.C30864xbddafb2a.ea8;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLyricsView", "inflateLayout: mode=" + this.f418215c.f418265n + ", layoutResId=" + i17);
        android.view.View inflate = android.view.LayoutInflater.from(this.f418213a).inflate(i17, this.f418214b, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return inflate;
    }

    public final void d() {
        if (!this.f418215c.f418256e) {
            android.view.View view = this.f418229q;
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "initCollapsedButton", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "initCollapsedButton", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f418229q;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "initCollapsedButton", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "initCollapsedButton", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.FrameLayout frameLayout = this.f418219g;
        android.view.View view3 = this.f418221i;
        android.view.View view4 = this.f418229q;
        if (frameLayout != null && view3 != null && view4 != null) {
            this.f418232t = new nf2.i1(frameLayout, view3, view4, this.f418215c.f418265n);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f418230r;
        if (c22789xd23e9a9b != null) {
            ym5.l2 l2Var = ym5.l2.f544957a;
            ym5.j2[] j2VarArr = ym5.j2.f544925d;
            c22789xd23e9a9b.o(ae2.in.f85221a.a(ym5.f6.U1));
            p3325xe03a0797.p3326xc267989b.l.d(this.f418216d, null, null, new nf2.m0(c22789xd23e9a9b, null), 3, null);
        }
        android.view.View view5 = this.f418229q;
        if (view5 != null) {
            view5.setOnClickListener(new nf2.l0(this));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLyricsView", "initCollapsedButton: initialized");
    }

    public final void e() {
        if (!this.f418215c.f418256e) {
            android.view.View view = this.f418221i;
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "initMenuBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "initMenuBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f418221i;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "initMenuBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView", "initMenuBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        h();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLyricsView", "initMenuBar: menu initialized for anchor");
    }

    public final void f() {
        android.widget.FrameLayout.LayoutParams layoutParams;
        android.view.View view = this.f418218f;
        android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        if (viewGroup == null || this.f418219g == null) {
            return;
        }
        android.util.DisplayMetrics displayMetrics = this.f418213a.getResources().getDisplayMetrics();
        int i17 = displayMetrics.widthPixels;
        int i18 = displayMetrics.heightPixels;
        boolean z17 = i17 > i18;
        int a17 = i65.a.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, this.f418215c.f418263l);
        int a18 = i65.a.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, this.f418215c.f418261j);
        int a19 = i65.a.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, this.f418215c.f418262k);
        int ordinal = this.f418215c.f418265n.ordinal();
        if (ordinal == 0) {
            if (z17) {
                i17 = i18;
            }
            int i19 = (i17 - (a18 * 2)) - a17;
            android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            layoutParams = layoutParams2 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams2 : null;
            if (layoutParams != null) {
                layoutParams.width = i19;
            }
            if (layoutParams != null) {
                layoutParams.gravity = 1;
            }
            viewGroup.setLayoutParams(layoutParams);
            return;
        }
        if (ordinal != 1) {
            return;
        }
        if (z17) {
            i17 = i18;
        }
        nf2.f1 f1Var = this.f418215c;
        int i27 = (i17 - ((int) (i17 * (f1Var.f418259h + f1Var.f418260i)))) - (a19 * 2);
        android.view.ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
        layoutParams = layoutParams3 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams3 : null;
        if (layoutParams != null) {
            layoutParams.height = i27;
        }
        if (layoutParams != null) {
            layoutParams.gravity = 16;
        }
        viewGroup.setLayoutParams(layoutParams);
    }

    public final void g(boolean z17) {
        nf2.g0 g0Var;
        if (this.f418218f == null || (g0Var = this.B) == null) {
            return;
        }
        float f17 = this.f418215c.f418261j;
        android.content.Context context = this.f418213a;
        this.G = ym5.x.a(context, f17);
        this.F = ym5.x.a(context, this.f418215c.f418264m);
        g0Var.f(new nf2.o0(this, g0Var, z17));
    }

    public final void h() {
        android.view.View view = this.f418222j;
        if (view != null) {
            view.setOnClickListener(new nf2.p0(this));
        }
        android.view.View view2 = this.f418223k;
        if (view2 != null) {
            view2.setOnClickListener(new nf2.q0(this));
        }
        android.view.View view3 = this.f418224l;
        if (view3 != null) {
            view3.setOnClickListener(new nf2.r0(this));
        }
        android.view.View view4 = this.f418225m;
        if (view4 != null) {
            view4.setOnClickListener(new nf2.s0(this));
        }
        android.view.View view5 = this.f418226n;
        if (view5 != null) {
            view5.setOnClickListener(new nf2.t0(this));
        }
    }

    public final void i(boolean z17) {
        if (this.f418218f == null) {
            return;
        }
        float f17 = this.f418215c.f418261j;
        android.content.Context context = this.f418213a;
        this.G = ym5.x.a(context, f17);
        this.F = ym5.x.a(context, this.f418215c.f418264m);
        nf2.g0 g0Var = this.B;
        if (g0Var != null) {
            g0Var.f(new nf2.u0(z17, this));
        }
    }

    public final void j(nf2.f1 newConfig) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1489xbf29e7f4.C14199x90952ee3 c14199x90952ee3;
        nf2.d0 d0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        nf2.a aVar = this.f418215c.f418265n;
        nf2.a aVar2 = newConfig.f418265n;
        if (!(aVar != aVar2)) {
            this.f418215c = newConfig;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLyricsView", "updateConfig: updating config without layout switch, color=" + newConfig.f418269r);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1489xbf29e7f4.C14199x90952ee3 c14199x90952ee32 = this.f418231s;
            if (c14199x90952ee32 != null) {
                c14199x90952ee32.j(newConfig);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1489xbf29e7f4.C14199x90952ee3 c14199x90952ee33 = this.f418231s;
        my5.a f193125f = c14199x90952ee33 != null ? c14199x90952ee33.getF193125f() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1489xbf29e7f4.C14199x90952ee3 c14199x90952ee34 = this.f418231s;
        int f193128i = c14199x90952ee34 != null ? c14199x90952ee34.getF193128i() : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1489xbf29e7f4.C14199x90952ee3 c14199x90952ee35 = this.f418231s;
        boolean z17 = c14199x90952ee35 != null ? c14199x90952ee35.f193129m : false;
        jz5.l lVar = this.D;
        this.f418215c = newConfig;
        android.view.View view = this.f418217e;
        android.view.ViewGroup viewGroup = this.f418214b;
        viewGroup.removeView(view);
        android.view.View c17 = c();
        this.f418217e = c17;
        viewGroup.addView(c17);
        b();
        nf2.g0 g0Var = this.B;
        if (g0Var != null) {
            g0Var.f418274c = null;
            g0Var.f418275d = 0;
            g0Var.f418276e = 0;
            g0Var.f418277f = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLyricsPositionManager", "release");
        }
        this.B = new nf2.g0(this, this.f418215c);
        f();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1489xbf29e7f4.C14199x90952ee3 c14199x90952ee36 = this.f418231s;
        if (c14199x90952ee36 != null) {
            c14199x90952ee36.j(this.f418215c);
        }
        e();
        d();
        nf2.d0 d0Var2 = this.C;
        if (d0Var2 != null) {
            d0Var2.e();
        }
        this.C = null;
        if (this.f418215c.f418254c) {
            g(false);
        } else {
            i(false);
        }
        if (this.I != null) {
            h();
        }
        nf2.x xVar = this.H;
        if (xVar != null && (d0Var = this.C) != null) {
            d0Var.f418210l = xVar;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLyricsView", "rebuildLayout: completed for mode=" + this.f418215c.f418265n);
        if (f193125f != null && (c14199x90952ee3 = this.f418231s) != null) {
            c14199x90952ee3.f(f193125f);
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1489xbf29e7f4.C14199x90952ee3 c14199x90952ee37 = this.f418231s;
            if (c14199x90952ee37 != null) {
                c14199x90952ee37.h();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1489xbf29e7f4.C14199x90952ee3 c14199x90952ee38 = this.f418231s;
            if (c14199x90952ee38 != null) {
                c14199x90952ee38.f193128i = f193128i;
            }
        }
        if (lVar != null) {
            float floatValue = ((java.lang.Number) lVar.f384366d).floatValue();
            float floatValue2 = ((java.lang.Number) lVar.f384367e).floatValue();
            android.view.View view2 = this.f418218f;
            if (view2 != null) {
                view2.post(new nf2.z0(this, floatValue, floatValue2));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLyricsView", "updateConfig: layout switched to " + aVar2);
    }

    public final void k(nf2.j1 j1Var) {
        android.widget.FrameLayout frameLayout;
        if (this.f418215c.f418265n == nf2.a.f418181e && (frameLayout = this.f418220h) != null) {
            android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams2 = layoutParams instanceof p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams ? (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams : null;
            if (layoutParams2 == null) {
                return;
            }
            int ordinal = j1Var.ordinal();
            if (ordinal == 0) {
                layoutParams2.f92439q = 0;
                layoutParams2.f92441s = 0;
            } else if (ordinal == 1) {
                layoutParams2.f92439q = 0;
                layoutParams2.f92441s = -1;
            } else if (ordinal == 2) {
                layoutParams2.f92439q = -1;
                layoutParams2.f92441s = 0;
            }
            frameLayout.setLayoutParams(layoutParams2);
        }
    }

    public final void l(float f17, float f18) {
        this.D = new jz5.l(java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18));
        nf2.g0 g0Var = this.B;
        if (g0Var != null) {
            if (g0Var.f418277f && g0Var.f418275d > 0 && g0Var.f418276e > 0) {
                nf2.g0.e(g0Var, f17, f18, false, new nf2.a1(this), 4, null);
                return;
            }
        }
        if (g0Var != null) {
            g0Var.f(new nf2.c1(g0Var, f17, f18, this));
        }
    }
}
