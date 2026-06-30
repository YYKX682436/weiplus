package c43;

/* loaded from: classes15.dex */
public class x extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 A;
    public final android.view.ViewGroup B;
    public final android.widget.ProgressBar C;
    public final android.widget.ImageView D;
    public final android.view.ViewGroup E;
    public final android.view.ViewGroup F;
    public final android.widget.TextView G;
    public final android.widget.TextView H;
    public final android.widget.ImageView I;

    /* renamed from: J, reason: collision with root package name */
    public final android.widget.FrameLayout f120021J;
    public final android.widget.TextView K;
    public final android.widget.ImageView L;
    public u33.h M;
    public u33.h N;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c P;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15724x3096736f Q;
    public long R;
    public java.lang.String S;
    public final java.util.Map T;
    public long U;
    public java.lang.String V;
    public java.util.List W;
    public int X;
    public long Y;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f120022d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f120023e;

    /* renamed from: f, reason: collision with root package name */
    public final int f120024f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f120025g;

    /* renamed from: h, reason: collision with root package name */
    public final long f120026h;

    /* renamed from: i, reason: collision with root package name */
    public final long f120027i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 f120028m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.ViewGroup f120029n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f120030o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.ImageView f120031p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f120032q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.ImageView f120033r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.TextView f120034s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.TextView f120035t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f120036u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.ImageView f120037v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.TextView f120038w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.ViewGroup f120039x;

    /* renamed from: y, reason: collision with root package name */
    public final android.view.ViewGroup f120040y;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.ViewGroup f120041z;

    public x(android.view.View view, int i17) {
        super(view);
        this.R = -1L;
        this.T = new java.util.HashMap();
        this.U = 0L;
        this.Y = -1L;
        this.f120022d = view.findViewById(com.p314xaae8f345.mm.R.id.k9q);
        this.f120023e = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.jub);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.jtd);
        android.content.Context context = view.getContext();
        this.f120025g = context;
        android.app.Activity activity = (android.app.Activity) context;
        this.f120026h = activity.getIntent().getLongExtra("game_report_sourceid", 0L);
        this.f120027i = activity.getIntent().getLongExtra("game_report_ssid", 0L);
        java.util.Map map = s33.x.f484073a;
        int i18 = i17 != 10003 ? i17 != 10004 ? 1 : 3 : 2;
        this.f120024f = i18;
        if (i18 == 1) {
            android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ber, viewGroup, true);
            this.f120029n = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.bfr);
            this.f120030o = view.findViewById(com.p314xaae8f345.mm.R.id.oup);
            this.f120031p = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.hoe);
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) view.findViewById(com.p314xaae8f345.mm.R.id.o7g);
            this.f120032q = c22789xd23e9a9b;
            c22789xd23e9a9b.o(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20313x85eb58f4()) == 1);
            this.f120033r = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f569055ov4);
            this.f120034s = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.ouw);
            this.f120035t = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.ov8);
            this.f120036u = view.findViewById(com.p314xaae8f345.mm.R.id.f569051ov0);
            this.f120037v = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.ouz);
            this.f120038w = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f569052ov1);
            this.f120039x = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.cgh);
            this.f120040y = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.jtn);
            this.f120041z = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.beu);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) view.findViewById(com.p314xaae8f345.mm.R.id.bev);
            this.A = c22624x85d69039;
            c22624x85d69039.m84183x1c5c5ff4(android.graphics.Color.parseColor("#7D90A9"));
            this.B = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.jtc);
            this.C = (android.widget.ProgressBar) view.findViewById(com.p314xaae8f345.mm.R.id.jtl);
            this.D = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.jtk);
            this.E = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.jte);
            this.f120021J = (android.widget.FrameLayout) view.findViewById(com.p314xaae8f345.mm.R.id.f565873dy4);
            this.K = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565871dy2);
            this.L = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f565869dy0);
            this.F = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.glg);
            this.G = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.omw);
            this.H = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.omx);
            this.I = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.hll);
        } else if (i18 == 2) {
            android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bew, viewGroup, true);
            this.f120029n = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.bfs);
        } else if (i18 == 3) {
            android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bev, viewGroup, true);
            this.f120029n = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.bfq);
        }
        A(this.f120029n);
    }

    public static void i(c43.x xVar, long j17, boolean z17) {
        xVar.getClass();
        int i17 = z17 ? 11 : 12;
        android.content.Context context = xVar.f120025g;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, true);
        k0Var.f293405n = new c43.i0(xVar, z17);
        k0Var.f293414s = new c43.j0(xVar, j17, z17, i17);
        k0Var.C = new c43.l0(xVar, i17);
        k0Var.t(true);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bht, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.mty)).setText(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.iiv : com.p314xaae8f345.mm.R.C30867xcad56011.aqc);
        k0Var.s(inflate, false);
        k0Var.v();
        xVar.y(i17, 1);
    }

    public final void A(android.view.View view) {
        if (view == null) {
            return;
        }
        c43.d0 d0Var = new c43.d0(this, view.getContext(), view);
        d0Var.C = true;
        d0Var.i(view, new c43.e0(this), new c43.f0(this));
    }

    public void B() {
        android.widget.ImageView imageView;
        android.graphics.drawable.GradientDrawable gradientDrawable;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67 = this.f120028m;
        if (c15731x94356d67 == null || (imageView = this.f120033r) == null) {
            return;
        }
        s33.m mVar = (s33.m) ((java.util.HashMap) this.T).get(c15731x94356d67.f36570xfd4da1cb);
        if (mVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f484059a)) {
            imageView.setVisibility(8);
            return;
        }
        r53.y.a().e(imageView, mVar.f484059a, null, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f43 = mVar.f484060b;
        if (c15748x3e43f43 != null) {
            java.lang.String str = c15748x3e43f43.f36646xa0e2915a;
            if (str == null) {
                str = "";
            }
            java.lang.Integer l17 = s33.y.l(str);
            if (l17 != null && (gradientDrawable = (android.graphics.drawable.GradientDrawable) imageView.getBackground()) != null) {
                gradientDrawable.setColor(l17.intValue());
            }
        }
        imageView.setVisibility(0);
    }

    public void j(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15835xa11d0ad8 c15835xa11d0ad8) {
        android.view.ViewGroup viewGroup = this.E;
        if (c15835xa11d0ad8 == null) {
            viewGroup.setVisibility(8);
            return;
        }
        if (c15835xa11d0ad8.f36910x8e8dc33c != 2) {
            viewGroup.setVisibility(8);
            return;
        }
        viewGroup.setVisibility(0);
        boolean L0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(c15835xa11d0ad8.f36909x1c2b6878);
        android.content.Context context = this.f120025g;
        android.widget.FrameLayout frameLayout = this.f120021J;
        if (L0) {
            frameLayout.setVisibility(8);
        } else {
            frameLayout.setVisibility(0);
            frameLayout.removeAllViews();
            for (int i17 = 0; i17 < c15835xa11d0ad8.f36909x1c2b6878.size(); i17++) {
                java.lang.String str = c15835xa11d0ad8.f36909x1c2b6878.get(i17);
                android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.acg, (android.view.ViewGroup) frameLayout, false);
                ng5.a.a((android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565874dy5), str);
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
                layoutParams.leftMargin = i65.a.b(context, 12) * i17;
                frameLayout.addView(inflate, 0, layoutParams);
            }
        }
        boolean z17 = c15835xa11d0ad8.f36911x9c46cbb;
        android.widget.TextView textView = this.K;
        android.widget.ImageView imageView = this.L;
        if (z17) {
            textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560084al));
            imageView.setVisibility(0);
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f79750xb1d52926);
        } else {
            textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b));
            imageView.setVisibility(0);
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f79751x1412239a);
        }
        imageView.setTag(c15835xa11d0ad8);
        textView.setText(c15835xa11d0ad8.f36908x2efe91);
        imageView.setOnClickListener(new c43.c0(this));
    }

    public void k(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67) {
    }

    public void l(final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15828x8e93965d c15828x8e93965d, final long j17, boolean z17) {
        android.view.ViewGroup viewGroup = this.F;
        if (c15828x8e93965d == null) {
            viewGroup.setVisibility(8);
            return;
        }
        viewGroup.setVisibility(0);
        boolean z18 = c15828x8e93965d.f36886x26029c6a;
        android.widget.TextView textView = this.G;
        android.widget.ImageView imageView = this.I;
        android.widget.TextView textView2 = this.H;
        if (!z18) {
            if (z17) {
                viewGroup.setClickable(true);
                viewGroup.setOnClickListener(new android.view.View.OnClickListener() { // from class: c43.x$$f
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        c43.x xVar = c43.x.this;
                        xVar.getClass();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        long j18 = j17;
                        arrayList.add(java.lang.Long.valueOf(j18));
                        arrayList.add(view);
                        java.lang.Object[] array = arrayList.toArray();
                        arrayList.clear();
                        yj0.a.b("com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", xVar, array);
                        gm0.j1.d().g(new v33.r(xVar.S, j18));
                        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.f fVar = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149728a;
                        long j19 = xVar.f120027i;
                        long j27 = xVar.f120026h;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67 = xVar.f120028m;
                        fVar.g(22L, 2L, j19, j27, c15731x94356d67.seq, c15731x94356d67.f36570xfd4da1cb, 0L, xVar.X);
                        yj0.a.h(xVar, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                });
            } else {
                viewGroup.setClickable(false);
            }
            imageView.setVisibility(8);
            textView.setText(q(c15828x8e93965d.f36887x67cd03c9, z17, false));
            textView2.setVisibility(8);
            return;
        }
        viewGroup.setClickable(true);
        viewGroup.setOnClickListener(new android.view.View.OnClickListener() { // from class: c43.x$$e
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                c43.x xVar = c43.x.this;
                xVar.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15828x8e93965d c15828x8e93965d2 = c15828x8e93965d;
                arrayList.add(c15828x8e93965d2);
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", xVar, array);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c15828x8e93965d2.f36885xe8d344a9)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.n.b(xVar.f120025g, c15828x8e93965d2.f36885xe8d344a9, -1, false, "");
                    com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.f fVar = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149728a;
                    long j18 = xVar.f120027i;
                    long j19 = xVar.f120026h;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67 = xVar.f120028m;
                    fVar.g(22L, 2L, j18, j19, c15731x94356d67.seq, c15731x94356d67.f36570xfd4da1cb, 0L, xVar.X);
                }
                yj0.a.h(xVar, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemVH", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c15828x8e93965d.f36888xad42e6d4)) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(c15828x8e93965d.f36888xad42e6d4);
            textView2.setVisibility(0);
        }
        textView.setText(q(c15828x8e93965d.f36887x67cd03c9, z17, true));
        imageView.setVisibility(0);
    }

    public boolean n() {
        return this instanceof c43.o;
    }

    public final void o(boolean z17) {
        android.widget.ImageView view = this.f120031p;
        if (view == null) {
            return;
        }
        java.util.HashMap hashMap = c43.e1.f119953a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        view.performHapticFeedback(1, 3);
        view.setAlpha(0.5f);
        view.postDelayed(new c43.o0(this, z17), 200L);
        view.postDelayed(new c43.p0(this), 230L);
    }

    public android.view.View p(android.view.ViewGroup viewGroup) {
        return null;
    }

    public final android.text.SpannableString q(java.lang.String str, boolean z17, boolean z18) {
        android.content.Context context = this.f120025g;
        if (z18) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fl_);
            }
        } else {
            if (z17) {
                java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fl7);
                android.text.SpannableString spannableString = new android.text.SpannableString(string + ", " + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fl8));
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c)), 0, string.length(), 18);
                return spannableString;
            }
            str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fl6);
        }
        return new android.text.SpannableString(str);
    }

    public void r() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15792xf92d0ffd c15792xf92d0ffd;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67 = this.f120028m;
        if (c15731x94356d67 == null || c15731x94356d67.seq != this.R || this.f120024f == 3) {
            return;
        }
        if (c15731x94356d67 == null || (c15792xf92d0ffd = c15731x94356d67.f36572xbfcc3e0) == null || c15792xf92d0ffd.f36774xf5571ef4 != 2) {
            this.f120029n.setBackgroundColor(this.f120025g.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77667x8113c229));
        } else {
            this.f120029n.setBackgroundColor(s33.y.l("#665A33").intValue());
        }
        ku5.u0 u0Var = ku5.t0.f394148d;
        c43.r0 r0Var = new c43.r0(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(r0Var, 3000L, false);
    }

    public boolean s() {
        return s33.y.e(this.S).f484023a;
    }

    public void v(db5.g4 g4Var) {
    }

    public void w(android.view.View view) {
    }

    public void x(int i17) {
    }

    public final void y(int i17, int i18) {
        if (this.f120028m != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                android.view.ViewGroup viewGroup = this.E;
                jSONObject.put("lightup", viewGroup != null && viewGroup.getVisibility() == 0);
            } catch (org.json.JSONException unused) {
            }
            long j17 = this.f120027i;
            long j18 = this.f120026h;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67 = this.f120028m;
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149728a.h(i17, 2L, j17, j18, c15731x94356d67.seq, c15731x94356d67.f36570xfd4da1cb, i18, this.X, jSONObject.toString());
        }
    }

    public final void z() {
        u33.h hVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15792xf92d0ffd c15792xf92d0ffd;
        if (this.f120024f == 3) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67 = this.f120028m;
        android.view.ViewGroup viewGroup = this.f120029n;
        if (c15731x94356d67 != null && (c15792xf92d0ffd = c15731x94356d67.f36572xbfcc3e0) != null && c15792xf92d0ffd.f36774xf5571ef4 == 2) {
            viewGroup.setBackgroundColor(s33.y.l("#665A33").intValue());
            return;
        }
        android.content.Context context = this.f120025g;
        if (c15731x94356d67 != null && (hVar = this.N) != null) {
            java.lang.String str = c15731x94356d67.f36570xfd4da1cb;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = ((y33.e) hVar).f66967xdde069b;
            if (str.equals(str2 != null ? str2 : "")) {
                viewGroup.setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77667x8113c229));
                return;
            }
        }
        viewGroup.setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77909xe61cad90));
    }
}
