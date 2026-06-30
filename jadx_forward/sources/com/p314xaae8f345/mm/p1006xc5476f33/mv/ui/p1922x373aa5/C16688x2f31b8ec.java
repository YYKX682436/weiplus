package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003B\u001d\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B%\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0014J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/view/MusicMvCommentFooter;", "Landroid/widget/LinearLayout;", "Lcom/tencent/mm/ui/tools/c5;", "Lcom/tencent/mm/plugin/mv/ui/view/f1;", "imp", "Ljz5/f0;", "setOnCommentSendImp", "", "visibility", "setVisibility", "getTrueHeight", dm.i4.f66865x76d1ec5a, "setEditViewBackground", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvCommentFooter */
/* loaded from: classes5.dex */
public final class C16688x2f31b8ec extends android.widget.LinearLayout implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f233180d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f233181e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 f233182f;

    /* renamed from: g, reason: collision with root package name */
    public int f233183g;

    /* renamed from: h, reason: collision with root package name */
    public int f233184h;

    /* renamed from: i, reason: collision with root package name */
    public int f233185i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f233186m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.f1 f233187n;

    /* renamed from: o, reason: collision with root package name */
    public int f233188o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f233189p;

    public C16688x2f31b8ec(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f233183g = 200;
        this.f233184h = 200;
        this.f233185i = -1;
        b();
    }

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Music.MusicMvCommentFooter", "hideSmileyPanel");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f233181e;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80094x8ea8d5ee);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f233181e;
        if (c22699x3dcdb3522 != null) {
            c22699x3dcdb3522.m82040x7541828(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = this.f233182f;
        if (abstractC19636xc6b37291 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smileyPanel");
            throw null;
        }
        abstractC19636xc6b37291.animate().cancel();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b372912 = this.f233182f;
        if (abstractC19636xc6b372912 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smileyPanel");
            throw null;
        }
        if (abstractC19636xc6b372912.getVisibility() == 0) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b372913 = this.f233182f;
            if (abstractC19636xc6b372913 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smileyPanel");
                throw null;
            }
            abstractC19636xc6b372913.h();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b372914 = this.f233182f;
            if (abstractC19636xc6b372914 != null) {
                abstractC19636xc6b372914.animate().alpha(0.0f).setDuration(175L).withEndAction(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.g1(this)).start();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smileyPanel");
                throw null;
            }
        }
    }

    public final void b() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017;
        android.os.Bundle inputExtras;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172;
        android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.c4p, this);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.c7o);
        this.f233181e = c22699x3dcdb352;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.i1(this));
        }
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.c6q);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById, "null cannot be cast to non-null type com.tencent.mm.ui.widget.MMEditText");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0173 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) findViewById;
        this.f233180d = c22621x7603e0173;
        c22621x7603e0173.mo81358x8f2956f(true);
        if (com.p314xaae8f345.mm.ui.bk.w() && (c22621x7603e0172 = this.f233180d) != null) {
            c22621x7603e0172.setImeOptions(268435456);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0174 = this.f233180d;
        if (c22621x7603e0174 != null) {
            c22621x7603e0174.setImeOptions(4);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0175 = this.f233180d;
        if (c22621x7603e0175 != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(c22621x7603e0175.getInputType() & (-65));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
            c22621x7603e0175.setInputType(valueOf.intValue());
        }
        ck5.f b17 = ck5.f.b(this.f233180d);
        b17.f124094f = 0;
        b17.f124093e = 80;
        b17.d(null);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0176 = this.f233180d;
        if (c22621x7603e0176 != null && (inputExtras = c22621x7603e0176.getInputExtras(true)) != null) {
            inputExtras.putBoolean("IS_CHAT_EDITOR", true);
        }
        if (android.os.Build.VERSION.SDK_INT == 28 && (c22621x7603e017 = this.f233180d) != null) {
            c22621x7603e017.setBreakStrategy(1);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0177 = this.f233180d;
        if (c22621x7603e0177 != null) {
            c22621x7603e0177.setOnEditorActionListener(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.h1(this));
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.m7o);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 wi6 = ((g30.c0) com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.i6.a()).wi(getContext());
        this.f233182f = wi6;
        wi6.mo75331xef640234(0);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = this.f233182f;
        if (abstractC19636xc6b37291 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smileyPanel");
            throw null;
        }
        abstractC19636xc6b37291.mo75345x9e226965(4);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b372912 = this.f233182f;
        if (abstractC19636xc6b372912 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smileyPanel");
            throw null;
        }
        abstractC19636xc6b372912.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562677lt);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b372913 = this.f233182f;
        if (abstractC19636xc6b372913 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smileyPanel");
            throw null;
        }
        abstractC19636xc6b372913.c();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b372914 = this.f233182f;
        if (abstractC19636xc6b372914 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smileyPanel");
            throw null;
        }
        abstractC19636xc6b372914.mo75350x625ff6a7(true);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b372915 = this.f233182f;
        if (abstractC19636xc6b372915 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smileyPanel");
            throw null;
        }
        abstractC19636xc6b372915.setVisibility(4);
        int a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.a(getContext());
        this.f233185i = a17;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b372916 = this.f233182f;
        if (abstractC19636xc6b372916 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smileyPanel");
            throw null;
        }
        linearLayout.addView(abstractC19636xc6b372916, -1, a17);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b372917 = this.f233182f;
        if (abstractC19636xc6b372917 != null) {
            abstractC19636xc6b372917.mo75339x5e04422d(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.j1(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smileyPanel");
            throw null;
        }
    }

    /* renamed from: getTrueHeight */
    public final int m67307x7f5dc84b() {
        return this.f233185i + i65.a.b(getContext(), 48);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Music.MusicMvCommentFooter", "onWindowFocusChanged: " + z17);
        this.f233186m = z17;
        if (getVisibility() == 0 && z17 && this.f233183g == 201) {
            post(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.k1(this));
        }
    }

    /* renamed from: setEditViewBackground */
    public final void m67308x11bfe65f(int i17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f233180d;
        if (c22621x7603e017 == null) {
            return;
        }
        c22621x7603e017.setBackground(getContext().getDrawable(i17));
    }

    /* renamed from: setOnCommentSendImp */
    public final void m67309xebdff806(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.f1 imp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imp, "imp");
        this.f233187n = imp;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var;
        super.setVisibility(i17);
        this.f233183g = 200;
        boolean z17 = i17 == 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Music.MusicMvCommentFooter", "setVisibility, cutEditMode:" + this.f233183g + ", isShow:" + z17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showState ");
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Music.MusicMvCommentFooter", sb6.toString());
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Music.MusicMvCommentFooter", "allGone");
            this.f233184h = 200;
            android.content.Context context = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).mo48674x36654fab();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = this.f233182f;
            if (abstractC19636xc6b37291 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smileyPanel");
                throw null;
            }
            abstractC19636xc6b37291.setAlpha(0.0f);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b372912 = this.f233182f;
            if (abstractC19636xc6b372912 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smileyPanel");
                throw null;
            }
            abstractC19636xc6b372912.setVisibility(4);
        }
        if (!z17) {
            android.content.Context context2 = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            dv2.f2 f2Var = (dv2.f2) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(dv2.f2.class);
            java.util.ArrayList arrayList = f2Var.f325386e;
            p3321xbce91901.jvm.p3324x21ffc6bd.m0.a(arrayList).remove(this);
            if (!arrayList.isEmpty() || (f5Var = f2Var.f325385d) == null) {
                return;
            }
            f5Var.d();
            return;
        }
        this.f233189p = false;
        this.f233186m = true;
        android.content.Context context3 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        pf5.z zVar2 = pf5.z.f435481a;
        if (!(context3 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        dv2.f2 f2Var2 = (dv2.f2) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context3).a(dv2.f2.class);
        f2Var2.f325386e.add(this);
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var2 = f2Var2.f325385d;
        if (f5Var2 != null) {
            f5Var2.f();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f233180d;
        if (c22621x7603e017 != null) {
            c22621x7603e017.requestFocus();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Music.MusicMvCommentFooter", "onlyShowVKB");
        this.f233184h = 201;
        android.content.Context context4 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context4, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context4).mo26063x7b383410();
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public void w2(int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Music.MusicMvCommentFooter", "onKeyboardHeightChanged: " + i17);
        if (this.f233186m) {
            boolean z18 = i17 > 0;
            if (this.f233189p == z18) {
                return;
            }
            if (this.f233188o == 0) {
                this.f233188o = i17;
            }
            if (this.f233185i != i17 && i17 != 0) {
                this.f233185i = i17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Music.MusicMvCommentFooter", "refreshBottomPanelHeight, " + this.f233185i);
                if (this.f233185i > 0) {
                    fp.w.m(getContext(), this.f233185i);
                    android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, this.f233185i);
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = this.f233182f;
                    if (abstractC19636xc6b37291 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smileyPanel");
                        throw null;
                    }
                    abstractC19636xc6b37291.setLayoutParams(layoutParams);
                }
            }
            if (z18) {
                this.f233183g = 201;
                a();
            } else {
                int i18 = this.f233184h;
                if (i18 == 200) {
                    com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.f1 f1Var = this.f233187n;
                    if (f1Var != null) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.g0) f1Var).a(null, null);
                    }
                    this.f233183g = 200;
                    a();
                } else if (i18 == 202) {
                    this.f233183g = 202;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Music.MusicMvCommentFooter", hc1.i.f69827x24728b);
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f233181e;
                    if (c22699x3dcdb352 != null) {
                        c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80142x4a505d3f);
                    }
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f233181e;
                    if (c22699x3dcdb3522 != null) {
                        c22699x3dcdb3522.m82040x7541828(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
                    }
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b372912 = this.f233182f;
                    if (abstractC19636xc6b372912 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smileyPanel");
                        throw null;
                    }
                    abstractC19636xc6b372912.setVisibility(0);
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b372913 = this.f233182f;
                    if (abstractC19636xc6b372913 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smileyPanel");
                        throw null;
                    }
                    abstractC19636xc6b372913.i();
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b372914 = this.f233182f;
                    if (abstractC19636xc6b372914 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smileyPanel");
                        throw null;
                    }
                    abstractC19636xc6b372914.animate().cancel();
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b372915 = this.f233182f;
                    if (abstractC19636xc6b372915 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smileyPanel");
                        throw null;
                    }
                    abstractC19636xc6b372915.animate().alpha(1.0f).setDuration(175L).start();
                }
                this.f233184h = 200;
            }
            this.f233184h = 200;
            this.f233189p = z18;
        }
    }

    public C16688x2f31b8ec(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f233183g = 200;
        this.f233184h = 200;
        this.f233185i = -1;
        b();
    }
}
