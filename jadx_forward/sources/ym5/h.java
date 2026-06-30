package ym5;

/* loaded from: classes10.dex */
public abstract class h extends qk.s implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: e, reason: collision with root package name */
    public qk.l9 f544878e;

    /* renamed from: f, reason: collision with root package name */
    public bn5.f f544879f;

    /* renamed from: g, reason: collision with root package name */
    public qk.g6[] f544880g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f544881h;

    /* renamed from: i, reason: collision with root package name */
    public dn5.c f544882i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f544883m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f544884n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f544885o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 f544886p;

    /* renamed from: q, reason: collision with root package name */
    public l45.q f544887q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.Button f544888r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.Button f544889s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22795x96919289 f544890t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.ViewOnClickListenerC22813xf4f26671 f544891u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f544892v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f544893w;

    public h(android.content.Context context) {
        super(context);
        this.f544892v = true;
        this.f544893w = true;
    }

    public abstract bn5.f a();

    public abstract dn5.c b();

    public void c(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseDrawingView", "[hideSimleyPanel] isHide:%s", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = this.f544886p;
        if (abstractC19636xc6b37291 == null) {
            return;
        }
        if (abstractC19636xc6b37291.getVisibility() == 0 && z17) {
            this.f544886p.setVisibility(8);
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
            loadAnimation.setAnimationListener(new ym5.i(this));
            this.f544886p.startAnimation(loadAnimation);
            return;
        }
        if (this.f544886p.getVisibility() != 8 || z17) {
            return;
        }
        android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559390df);
        loadAnimation2.setAnimationListener(new ym5.j(this));
        this.f544886p.startAnimation(loadAnimation2);
    }

    public void d() {
        ((l45.n) m177317xc879b3f2()).m(m177314x1456a638());
        removeAllViews();
        addView(m177310x5143ab24(), new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561944x6));
        layoutParams.gravity = 80;
        addView(m177316x936200b6(), layoutParams);
        addView(m177311xc3ab3d87(), layoutParams);
        android.view.ViewGroup.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -1);
        android.view.View mo177319xb073c692 = mo177319xb073c692();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mo177319xb073c692, arrayList.toArray(), "com/tencent/mm/view/BaseDrawingView", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo177319xb073c692.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(mo177319xb073c692, "com/tencent/mm/view/BaseDrawingView", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        addView(mo177319xb073c692(), layoutParams2);
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        android.widget.FrameLayout.LayoutParams layoutParams3 = (android.widget.FrameLayout.LayoutParams) mo177318xd03217ea().getLayoutParams();
        layoutParams3.gravity = 81;
        int c17 = layoutParams3.bottomMargin + com.p314xaae8f345.mm.ui.bl.c(getContext());
        layoutParams3.bottomMargin = c17;
        layoutParams3.bottomMargin = c17 + i65.a.b(getContext(), 32);
        android.view.View mo177318xd03217ea = mo177318xd03217ea();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(mo177318xd03217ea, arrayList2.toArray(), "com/tencent/mm/view/BaseDrawingView", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo177318xd03217ea.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(mo177318xd03217ea, "com/tencent/mm/view/BaseDrawingView", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        addView(mo177318xd03217ea(), layoutParams3);
        android.widget.FrameLayout.LayoutParams layoutParams4 = new android.widget.FrameLayout.LayoutParams(-1, qk.w9.a(getContext()));
        layoutParams4.gravity = 80;
        layoutParams4.bottomMargin += com.p314xaae8f345.mm.ui.bl.c(getContext());
        addView(m177313xe6828c7b(), layoutParams4);
        new android.widget.FrameLayout.LayoutParams(-1, (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561155ax)).gravity = 48;
        if (this.f544878e.f445766c) {
            addView(m177309xb3ec347());
        } else {
            m177311xc3ab3d87().setVisibility(8);
        }
    }

    /* renamed from: getActionBar */
    public android.view.View m177309xb3ec347() {
        if (this.f544883m == null) {
            this.f544883m = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c9q, (android.view.ViewGroup) null);
            this.f544883m.setPadding(0, com.p314xaae8f345.mm.ui.bk.u(getContext(), false) ? com.p314xaae8f345.mm.ui.bk.p(getContext()) + 0 : 0, 0, 0);
            android.widget.Button button = (android.widget.Button) this.f544883m.findViewById(com.p314xaae8f345.mm.R.id.d6w);
            this.f544888r = button;
            button.setOnClickListener(new ym5.l(this));
            android.widget.Button button2 = (android.widget.Button) this.f544883m.findViewById(com.p314xaae8f345.mm.R.id.d6s);
            this.f544889s = button2;
            button2.setOnClickListener(new ym5.m(this));
        }
        return this.f544883m;
    }

    /* renamed from: getBaseBoardView */
    public <T extends bn5.f> T m177310x5143ab24() {
        if (this.f544879f == null) {
            this.f544879f = a();
        }
        return (T) this.f544879f;
    }

    /* renamed from: getBaseFooterView */
    public <T extends dn5.c> T m177311xc3ab3d87() {
        if (this.f544882i == null) {
            this.f544882i = b();
        }
        return (T) this.f544882i;
    }

    /* renamed from: getBgSwitch */
    public com.p314xaae8f345.mm.p2776x373aa5.ViewOnClickListenerC22813xf4f26671 m177312x1d0fe54f() {
        return this.f544891u;
    }

    /* renamed from: getChatFooterPanel */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 m177313xe6828c7b() {
        if (this.f544886p == null) {
            try {
                com.p314xaae8f345.mm.api.AbstractC4989x9e6071f3 b17 = qk.w9.b(getContext());
                this.f544886p = b17;
                int i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291.f271298e;
                b17.mo75331xef640234(3);
                this.f544886p.mo75345x9e226965(6);
                this.f544886p.mo75351x4aab89d0(false);
                this.f544886p.mo75347xe8c09ab9(true);
                this.f544886p.setVisibility(8);
                this.f544886p.i();
                qk.v9 d17 = qk.w9.d();
                d17.f445884a = new ym5.o(this);
                this.f544886p.mo75328x6c4ebec7(d17);
            } catch (java.lang.Exception e17) {
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = e17.getMessage();
                objArr[1] = java.lang.Boolean.valueOf(getContext() == null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseDrawingView", "exception:%s,getContext() is null?", objArr);
                throw e17;
            }
        }
        return this.f544886p;
    }

    /* renamed from: getConfig */
    public qk.l9 m177314x1456a638() {
        return this.f544878e;
    }

    /* renamed from: getFeatures */
    public abstract qk.g6[] mo177315x6a8721b3();

    /* renamed from: getFooterBg */
    public android.view.View m177316x936200b6() {
        if (this.f544881h == null) {
            android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bb7, (android.view.ViewGroup) null);
            this.f544881h = inflate;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/view/BaseDrawingView", "getFooterBg", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(inflate, "com/tencent/mm/view/BaseDrawingView", "getFooterBg", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return this.f544881h;
    }

    /* renamed from: getPresenter */
    public l45.q m177317xc879b3f2() {
        if (this.f544887q == null) {
            l45.n nVar = new l45.n();
            this.f544887q = nVar;
            nVar.f397993a = this;
        }
        return this.f544887q;
    }

    /* renamed from: getRubbishView */
    public android.view.View mo177318xd03217ea() {
        if (this.f544884n == null) {
            this.f544885o = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.chf, (android.view.ViewGroup) this, false);
        }
        return this.f544885o;
    }

    /* renamed from: getTextEditView */
    public android.view.View mo177319xb073c692() {
        if (this.f544884n == null) {
            android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a57, (android.view.ViewGroup) null);
            this.f544884n = inflate;
            com.p314xaae8f345.mm.p2776x373aa5.C22795x96919289 c22795x96919289 = (com.p314xaae8f345.mm.p2776x373aa5.C22795x96919289) inflate.findViewById(com.p314xaae8f345.mm.R.id.o4a);
            this.f544890t = c22795x96919289;
            int dimension = (int) c22795x96919289.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561846ua);
            int dimension2 = (int) this.f544890t.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561784sk);
            if (com.p314xaae8f345.mm.ui.bk.u(getContext(), false)) {
                dimension2 += com.p314xaae8f345.mm.ui.bk.p(getContext());
            }
            this.f544890t.setPadding(dimension, dimension2, dimension, 0);
            final com.p314xaae8f345.mm.p2776x373aa5.p2779xb45eb59b.C22825xd78e1eec c22825xd78e1eec = (com.p314xaae8f345.mm.p2776x373aa5.p2779xb45eb59b.C22825xd78e1eec) this.f544884n.findViewById(com.p314xaae8f345.mm.R.id.mii);
            com.p314xaae8f345.mm.p2776x373aa5.ViewOnClickListenerC22813xf4f26671 viewOnClickListenerC22813xf4f26671 = (com.p314xaae8f345.mm.p2776x373aa5.ViewOnClickListenerC22813xf4f26671) this.f544884n.findViewById(com.p314xaae8f345.mm.R.id.agw);
            this.f544891u = viewOnClickListenerC22813xf4f26671;
            viewOnClickListenerC22813xf4f26671.setTag(-707825);
            this.f544891u.m82781xea565d09(new ym5.g6() { // from class: ym5.h$$a
                @Override // ym5.g6
                public final void a(int i17) {
                    ym5.h hVar = ym5.h.this;
                    com.p314xaae8f345.mm.p2776x373aa5.p2779xb45eb59b.C22825xd78e1eec c22825xd78e1eec2 = c22825xd78e1eec;
                    if (i17 == 3) {
                        c22825xd78e1eec2.m82874x7b868205(((java.lang.Integer) hVar.f544891u.getTag()).intValue());
                        hVar.f544890t.mo82626x630fd73d(((java.lang.Integer) hVar.f544891u.getTag()).intValue());
                    } else {
                        hVar.f544891u.setTag(java.lang.Integer.valueOf(c22825xd78e1eec2.m82870x9b946279()));
                        hVar.f544890t.mo82626x630fd73d(0);
                    }
                    hVar.f544890t.m82625x1a689683(i17 == 2);
                }
            });
            this.f544890t.setTextColor(-1);
            c22825xd78e1eec.m82874x7b868205(-1);
            c22825xd78e1eec.m82875x8f51d5d9(new ym5.n(this));
        }
        return this.f544884n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(new ym5.p(this));
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (mo177319xb073c692().getVisibility() == 0) {
            getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f544890t.postDelayed(new ym5.k(this), 160L);
        }
    }

    @Override // qk.s
    /* renamed from: setActionBarCallback */
    public void mo160420x1f31d20(qk.i6 i6Var) {
        ((l45.n) m177317xc879b3f2()).f397997e = i6Var;
    }

    @Override // qk.s
    /* renamed from: setActionBarVisible */
    public void mo160421xeaaa6c37(boolean z17) {
        if (this.f544893w == z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseDrawingView", "[setActionBarVisible] isShowActionBar == isShow");
            return;
        }
        this.f544893w = z17;
        if (z17) {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559256k);
            loadAnimation.setAnimationListener(new ym5.q(this));
            m177309xb3ec347().startAnimation(loadAnimation);
        } else {
            android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559257l);
            loadAnimation2.setAnimationListener(new ym5.r(this));
            m177309xb3ec347().startAnimation(loadAnimation2);
        }
    }

    @Override // qk.s
    /* renamed from: setAutoShowFooterAndBar */
    public void mo160422x2cadd325(boolean z17) {
        ((l45.n) m177317xc879b3f2()).f397999g = z17;
    }

    /* renamed from: setFooterBgVisible */
    public void m177320xca550850(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseDrawingView", "setFooterBgVisible: isShow=%b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559256k);
            loadAnimation.setAnimationListener(new ym5.s(this));
            m177309xb3ec347().startAnimation(loadAnimation);
        } else {
            android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559257l);
            loadAnimation2.setAnimationListener(new ym5.t(this));
            m177309xb3ec347().startAnimation(loadAnimation2);
        }
    }

    @Override // qk.s
    /* renamed from: setFooterVisible */
    public void mo160423x2f328115(boolean z17) {
        boolean z18 = m177314x1456a638().f445766c;
        if (this.f544892v == z17 || !m177314x1456a638().f445766c) {
            return;
        }
        m177311xc3ab3d87().m125842x2f328115(z17);
        m177320xca550850(z17);
        this.f544892v = z17;
    }

    /* renamed from: setup */
    public void m177321x6843a7d(qk.l9 l9Var) {
        this.f544878e = l9Var;
        d();
        this.f544879f.j();
    }
}
