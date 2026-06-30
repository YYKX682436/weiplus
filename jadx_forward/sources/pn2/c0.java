package pn2;

/* loaded from: classes3.dex */
public final class c0 extends ie2.a implements pn2.b {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f438507g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f438508h;

    /* renamed from: i, reason: collision with root package name */
    public final pn2.a f438509i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f438510m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f438511n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f438512o;

    /* renamed from: p, reason: collision with root package name */
    public pn2.t f438513p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f438514q;

    /* renamed from: r, reason: collision with root package name */
    public android.animation.Animator f438515r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f438516s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(boolean z17, android.view.View root, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a c14179xd6e3454a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, pn2.a aVar) {
        super(root, c14179xd6e3454a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f438507g = z17;
        this.f438508h = activity;
        this.f438509i = aVar;
        this.f438510m = "FinderLiveLotteryBubbleViewCallback" + hashCode();
        this.f438511n = "small_lottery_amin.pag";
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Hk();
        this.f438514q = true;
        zl2.q4.f555466a.R("FinderLiveLotteryBubbleViewCallback");
        u().setTag(java.lang.Float.valueOf(1.0f));
    }

    public final void A(android.os.Bundle bundle) {
        java.lang.String str;
        android.widget.TextView B = B();
        if (B != null) {
            if (bundle == null || (str = bundle.getString("currentCountDownText")) == null) {
                str = "";
            }
            B.setText(str);
        }
        android.view.View t17 = t(com.p314xaae8f345.mm.R.id.f566243f84);
        if (t17 != null) {
            t17.setOnClickListener(new pn2.u(this));
        }
    }

    public final android.widget.TextView B() {
        android.view.View t17 = t(com.p314xaae8f345.mm.R.id.cjn);
        if (t17 instanceof android.widget.TextView) {
            return (android.widget.TextView) t17;
        }
        return null;
    }

    public final android.widget.ImageView C() {
        android.view.View t17 = t(com.p314xaae8f345.mm.R.id.f567975l75);
        if (t17 instanceof android.widget.ImageView) {
            return (android.widget.ImageView) t17;
        }
        return null;
    }

    public final android.widget.FrameLayout D() {
        android.view.View t17 = t(com.p314xaae8f345.mm.R.id.f564579v5);
        if (t17 instanceof android.widget.FrameLayout) {
            return (android.widget.FrameLayout) t17;
        }
        return null;
    }

    public final void E() {
        if (this.f438514q) {
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f438512o;
            java.lang.String str = this.f438510m;
            if (c22789xd23e9a9b == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "initSmallAnim create smallAnim!");
                android.content.Context context = u().getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                this.f438512o = new com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b(context);
                ym5.l2 l2Var = ym5.l2.f544957a;
                ym5.j2[] j2VarArr = ym5.j2.f544925d;
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = this.f438512o;
                if (c22789xd23e9a9b2 != null) {
                    c22789xd23e9a9b2.o(ae2.in.f85221a.a(ym5.f6.f544835b2));
                }
                pn2.t tVar = new pn2.t(this, this);
                this.f438513p = tVar;
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b3 = this.f438512o;
                if (c22789xd23e9a9b3 != null) {
                    c22789xd23e9a9b3.a(tVar);
                }
            }
            android.widget.FrameLayout D = D();
            if (D != null) {
                D.setVisibility(0);
            }
            android.widget.ImageView C = C();
            if (C != null) {
                C.setVisibility(4);
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b4 = this.f438512o;
            if (c22789xd23e9a9b4 != null) {
                c22789xd23e9a9b4.setTransitionName("pag_anim");
            }
            android.widget.FrameLayout D2 = D();
            if (D2 != null && D2.indexOfChild(this.f438512o) == -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "initSmallAnim add smallAnim!");
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b5 = this.f438512o;
                android.view.ViewParent parent = c22789xd23e9a9b5 != null ? c22789xd23e9a9b5.getParent() : null;
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(this.f438512o);
                }
                android.widget.FrameLayout D3 = D();
                if (D3 != null) {
                    D3.removeAllViews();
                }
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b6 = this.f438512o;
                if (c22789xd23e9a9b6 != null) {
                    c22789xd23e9a9b6.setLayoutParams(layoutParams);
                }
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b7 = this.f438512o;
                if (c22789xd23e9a9b7 != null) {
                    android.content.res.AssetManager assets = this.f438508h.getAssets();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(assets, "getAssets(...)");
                    c22789xd23e9a9b7.k(assets, this.f438511n);
                }
                android.widget.FrameLayout D4 = D();
                if (D4 != null) {
                    D4.addView(this.f438512o);
                }
            }
            if (!x()) {
                u().setTranslationY(-i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv));
            }
            u().setTranslationX(0.0f);
            android.widget.TextView B = B();
            if (B == null) {
                return;
            }
            com.p314xaae8f345.mm.ui.kk.d(B, 0);
        }
    }

    public void F(boolean z17) {
        if (z17 != this.f438516s) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f438510m, "needResize :" + z17);
        }
        this.f438516s = z17;
        android.widget.FrameLayout D = D();
        boolean z18 = false;
        if (D != null && D.getVisibility() == 0) {
            z18 = true;
        }
        if (z18) {
            L();
        }
    }

    public void G() {
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f438510m, "reset");
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = this.f438512o;
        boolean z17 = false;
        if (c22789xd23e9a9b2 != null && c22789xd23e9a9b2.f()) {
            z17 = true;
        }
        if (z17 && (c22789xd23e9a9b = this.f438512o) != null) {
            c22789xd23e9a9b.n();
        }
        android.animation.Animator animator = this.f438515r;
        if (animator != null) {
            animator.cancel();
        }
        this.f438515r = null;
    }

    public final android.os.Bundle H() {
        android.os.Bundle bundle = new android.os.Bundle();
        android.widget.TextView B = B();
        bundle.putString("currentCountDownText", java.lang.String.valueOf(B != null ? B.getText() : null));
        return bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (((pn2.s) r1).i() == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void I() {
        /*
            r3 = this;
            r0 = 0
            pn2.a r1 = r3.f438509i
            if (r1 == 0) goto Lf
            pn2.s r1 = (pn2.s) r1
            boolean r1 = r1.i()
            r2 = 1
            if (r1 != r2) goto Lf
            goto L10
        Lf:
            r2 = r0
        L10:
            if (r2 == 0) goto L1c
            android.widget.ImageView r1 = r3.C()
            if (r1 == 0) goto L1c
            r3.K()
            goto L33
        L1c:
            r3.E()
            android.widget.FrameLayout r1 = r3.D()
            if (r1 != 0) goto L26
            goto L29
        L26:
            r1.setVisibility(r0)
        L29:
            com.tencent.mm.view.MMPAGView r0 = r3.f438512o
            if (r0 != 0) goto L2e
            goto L33
        L2e:
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r0.m82582x3ae760af(r1)
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pn2.c0.I():void");
    }

    public void J(yz5.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showPrepareLottery smallAnim is null:");
        sb6.append(this.f438512o == null);
        sb6.append(",isPagEnable:");
        boolean z17 = this.f438514q;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f438510m, sb6.toString());
        G();
        L();
        pn2.a aVar = this.f438509i;
        if (aVar != null && ((pn2.s) aVar).i()) {
            K();
            return;
        }
        if (!z17) {
            callback.mo152xb9724478();
            return;
        }
        E();
        android.widget.FrameLayout D = D();
        if (D != null) {
            D.setVisibility(0);
        }
        android.widget.ImageView C = C();
        if (C != null) {
            C.setVisibility(8);
        }
        android.widget.TextView B = B();
        if (B != null) {
            B.setVisibility(8);
        }
        pn2.t tVar = this.f438513p;
        if (tVar != null) {
            tVar.f438561e = callback;
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f438512o;
        if (c22789xd23e9a9b != null) {
            c22789xd23e9a9b.m82582x3ae760af(0.0d);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = this.f438512o;
        if (c22789xd23e9a9b2 != null) {
            c22789xd23e9a9b2.d();
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b3 = this.f438512o;
        if (c22789xd23e9a9b3 != null) {
            c22789xd23e9a9b3.g();
        }
    }

    public final void K() {
        r45.gz1 gz1Var;
        r45.yd4 yd4Var;
        java.lang.String str = null;
        pn2.a aVar = this.f438509i;
        if (aVar != null) {
            km2.z zVar = ((on2.z2) ((pn2.s) aVar).f438546e.a(on2.z2.class)).f428625m;
            r45.cz1 cz1Var = zVar != null ? zVar.f390765d : null;
            if (cz1Var != null && (gz1Var = (r45.gz1) cz1Var.m75936x14adae67(14)) != null && (yd4Var = (r45.yd4) gz1Var.m75936x14adae67(1)) != null) {
                str = yd4Var.m75945x2fec8307(1);
            }
        }
        android.widget.FrameLayout D = D();
        if (D != null) {
            D.setVisibility(8);
        }
        android.widget.ImageView C = C();
        if (C != null) {
            C.setVisibility(8);
        }
        android.widget.ImageView C2 = C();
        if (C2 != null) {
            C2.setTransitionName("pag_anim");
        }
        wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(((c61.i8) ((vd2.i5) i95.n0.c(vd2.i5.class))).Ai(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f));
        pn2.z zVar2 = new pn2.z(this);
        a17.getClass();
        a17.f529406d = zVar2;
        a17.f();
        u().setTranslationY(0.0f);
        u().setTranslationX(i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl));
        android.widget.TextView B = B();
        if (B == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.kk.d(B, i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561177bj));
    }

    public final void L() {
        float f17 = this.f438516s ? 0.8f : 1.0f;
        android.view.View u17 = u();
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(u17.getTag(), java.lang.Float.valueOf(f17));
        java.lang.String str = this.f438510m;
        if (b17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "updateRootViewSize fail, scale:" + f17 + ",width:" + u17.getLayoutParams().width);
            return;
        }
        u17.setTag(java.lang.Float.valueOf(f17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "updateRootViewSize scale:" + f17);
        u17.post(new pn2.b0(u17, f17, this));
    }

    @Override // ie2.h
    public android.os.Bundle a() {
        return H();
    }

    @Override // ie2.h
    public boolean g() {
        boolean z17 = false;
        pn2.a aVar = this.f438509i;
        if (aVar != null) {
            km2.z zVar = ((on2.z2) ((pn2.s) aVar).f438546e.a(on2.z2.class)).f428625m;
            if ((zVar != null ? zVar.f390762a : 0) == 4) {
                z17 = true;
            }
        }
        return true ^ z17;
    }

    @Override // fs2.c
    /* renamed from: getActivity */
    public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f mo978x19263085() {
        return this.f438508h;
    }

    @Override // ie2.h
    public void j() {
        J(new pn2.w(this));
    }

    @Override // ie2.h
    public void l(android.os.Bundle bundle) {
        A(bundle);
        android.widget.TextView B = B();
        if (B != null) {
            B.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563271a53);
        }
        I();
    }

    @Override // ie2.h
    public android.os.Bundle o() {
        return H();
    }

    @Override // ie2.h
    public void s(android.os.Bundle bundle) {
        A(bundle);
    }

    @Override // ie2.a
    public java.lang.String v() {
        return this.f438510m;
    }
}
