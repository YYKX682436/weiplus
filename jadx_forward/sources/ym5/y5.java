package ym5;

/* loaded from: classes10.dex */
public final class y5 extends ym5.h implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {
    public final int A;
    public int B;
    public final long C;
    public final boolean D;
    public yz5.a E;
    public yz5.l F;
    public c01.r2 G;
    public ym5.n5 H;
    public android.view.View I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.TextView f545113J;
    public android.widget.TextView K;
    public android.widget.TextView L;
    public final com.p314xaae8f345.mm.ui.p2740x696c9db.f5 M;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f545114x;

    /* renamed from: y, reason: collision with root package name */
    public float f545115y;

    /* renamed from: z, reason: collision with root package name */
    public final int f545116z;

    public y5(android.content.Context context) {
        super(context);
        this.f545114x = "MicroMsg.StickerEditor.DrawingView[" + hashCode() + ']';
        this.f545116z = 30;
        this.A = -2130706433;
        this.B = 3;
        this.C = 350L;
        this.D = true;
        this.H = ym5.n5.f544978d;
        if ((context instanceof android.app.Activity ? (android.app.Activity) context : null) != null) {
            com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5((android.app.Activity) context);
            this.M = f5Var;
            f5Var.f291933e = this;
        }
    }

    public static void e(ym5.y5 y5Var, c01.s2 status, boolean z17, int i17, java.lang.Object obj) {
        l45.p pVar;
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        y5Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        xk0.f fVar = null;
        if (z17) {
            l45.q m177317xc879b3f2 = y5Var.m177317xc879b3f2();
            dl.f0 f0Var = m177317xc879b3f2 != null ? (dl.f0) ((l45.n) m177317xc879b3f2).d(y5Var.m177360x1f85dc49()) : null;
            um.g gVar = f0Var != null ? (um.g) f0Var.d() : null;
            if (gVar != null) {
                fVar = gVar.g();
            }
        }
        l45.q m177317xc879b3f22 = y5Var.m177317xc879b3f2();
        if (m177317xc879b3f22 == null || (pVar = ((l45.n) m177317xc879b3f22).f398008p) == null) {
            return;
        }
        ((aw3.e) pVar).a(status, fVar);
    }

    /* renamed from: getInputLineMaxLimitCount */
    private final int m177356x1822ff50() {
        return this.B;
    }

    @Override // ym5.h
    public bn5.f a() {
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        l45.q m177317xc879b3f2 = m177317xc879b3f2();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m177317xc879b3f2, "getPresenter(...)");
        return new bn5.m(context, m177317xc879b3f2);
    }

    @Override // ym5.h
    public dn5.c b() {
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        l45.q m177317xc879b3f2 = m177317xc879b3f2();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m177317xc879b3f2, "getPresenter(...)");
        return new dn5.g(context, m177317xc879b3f2);
    }

    @Override // ym5.h
    public void d() {
        ((l45.n) m177317xc879b3f2()).m(m177314x1456a638());
        ((l45.n) m177317xc879b3f2()).f398000h = false;
        removeAllViews();
        mo177319xb073c692();
        this.f545115y = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7);
        addView(m177310x5143ab24(), new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        int h17 = i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        layoutParams.bottomMargin = h17;
        layoutParams.setMarginStart(h17);
        layoutParams.setMarginEnd(h17);
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cvt, (android.view.ViewGroup) null);
        this.I = inflate;
        addView(inflate, layoutParams);
        i(false);
        android.view.View view = this.I;
        android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.nig) : null;
        this.f545113J = textView;
        if (textView != null) {
            textView.setOnClickListener(new ym5.t5(this));
        }
        android.view.View view2 = this.I;
        android.widget.TextView textView2 = view2 != null ? (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.nii) : null;
        this.K = textView2;
        if (textView2 != null) {
            textView2.setOnClickListener(new cm5.e(textView2, 300L, null, new ym5.u5(this)));
        }
        android.view.View view3 = this.I;
        android.widget.TextView textView3 = view3 != null ? (android.widget.TextView) view3.findViewById(com.p314xaae8f345.mm.R.id.nih) : null;
        this.L = textView3;
        if (textView3 != null) {
            textView3.setOnClickListener(new ym5.v5(this));
        }
        addView(mo177319xb073c692(), new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.view.View mo177319xb073c692 = mo177319xb073c692();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mo177319xb073c692, arrayList.toArray(), "com/tencent/mm/view/StickerDrawingView", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo177319xb073c692.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(mo177319xb073c692, "com/tencent/mm/view/StickerDrawingView", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean a17 = z65.c.a();
        l45.q m177317xc879b3f2 = m177317xc879b3f2();
        if (m177317xc879b3f2 != null) {
            dl.f0 f0Var = (dl.f0) ((l45.n) m177317xc879b3f2).d(m177360x1f85dc49());
            if (f0Var != null) {
                f0Var.f316686r = true;
                f0Var.C = a17;
                f0Var.E = a17;
                f0Var.G = false;
                f0Var.f316684J = true;
                f0Var.K = true;
                f0Var.L = this.f545116z;
                f0Var.Q = true;
                f0Var.T = this.H == ym5.n5.f544980f;
            }
        }
    }

    public final void f() {
        mo177319xb073c692().clearFocus();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("textEditView: cancel click, visible=");
        sb6.append(mo177319xb073c692().getVisibility() == 0);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f545114x;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        if (mo177319xb073c692().getVisibility() != 0) {
            qk.i6 i6Var = ((l45.n) m177317xc879b3f2()).f397997e;
            if (i6Var != null) {
                i6Var.m5();
                return;
            }
            return;
        }
        ((l45.n) m177317xc879b3f2()).o();
        if (getContext() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            android.content.Context context = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).mo48674x36654fab();
        }
        if (this.D) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "restoreCurrentItemOnEditText: ");
            xk0.f g17 = g();
            if (g17 != null) {
                l45.q m177317xc879b3f2 = m177317xc879b3f2();
                dl.f0 f0Var = m177317xc879b3f2 != null ? (dl.f0) ((l45.n) m177317xc879b3f2).d(m177360x1f85dc49()) : null;
                um.g gVar = f0Var != null ? (um.g) f0Var.d() : null;
                if (gVar != null) {
                    gVar.add(g17);
                }
                if (f0Var != null) {
                    f0Var.r();
                }
            }
        }
        if (g() != null) {
            j();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "doOnDrawCancel: ");
        yz5.a aVar = this.E;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    public final xk0.f g() {
        java.lang.Object tag = this.f544890t.getTag();
        if (!(tag instanceof xk0.h) || !(tag instanceof xk0.f)) {
            return null;
        }
        java.util.Objects.toString(tag);
        return (xk0.f) tag;
    }

    /* renamed from: getBottomControlBarMode */
    public final ym5.n5 m177357xb8dc43ba() {
        return this.H;
    }

    /* renamed from: getCancelDrawCallback */
    public final yz5.a m177358xdeb42b39() {
        return this.E;
    }

    /* renamed from: getConfirmDrawCallback */
    public final yz5.l m177359x713e2553() {
        return this.F;
    }

    @Override // ym5.h
    /* renamed from: getFeatures */
    public qk.g6[] mo177315x6a8721b3() {
        if (this.f544880g == null) {
            this.f544880g = new qk.g6[]{m177360x1f85dc49()};
        }
        qk.g6[] mFeaturesTypes = this.f544880g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mFeaturesTypes, "mFeaturesTypes");
        return mFeaturesTypes;
    }

    @Override // ym5.h
    /* renamed from: getRubbishView */
    public android.view.View mo177318xd03217ea() {
        if (this.f544884n == null) {
            this.f544885o = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.chf, (android.view.ViewGroup) this, false);
        }
        android.view.View mRubbishView = this.f544885o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mRubbishView, "mRubbishView");
        return mRubbishView;
    }

    /* renamed from: getTargetFeatureType */
    public final qk.g6 m177360x1f85dc49() {
        return qk.g6.STICKER;
    }

    @Override // ym5.h
    /* renamed from: getTextEditView */
    public android.view.View mo177319xb073c692() {
        if (this.f544884n == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f545114x, "getTextEditView: init");
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cvu, (android.view.ViewGroup) null);
            this.f544884n = inflate;
            android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.o4a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById, "null cannot be cast to non-null type com.tencent.mm.view.StickerEditText");
            this.f544890t = (com.p314xaae8f345.mm.p2776x373aa5.C22810x4e74aa94) findViewById;
            android.view.View findViewById2 = this.f544884n.findViewById(com.p314xaae8f345.mm.R.id.d6w);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById2, "null cannot be cast to non-null type android.widget.Button");
            this.f544888r = (android.widget.Button) findViewById2;
            android.view.View findViewById3 = this.f544884n.findViewById(com.p314xaae8f345.mm.R.id.d6s);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById3, "null cannot be cast to non-null type android.widget.Button");
            this.f544889s = (android.widget.Button) findViewById3;
            android.view.View findViewById4 = this.f544884n.findViewById(com.p314xaae8f345.mm.R.id.mii);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById4, "null cannot be cast to non-null type com.tencent.mm.view.footer.SelectColorBar");
            com.p314xaae8f345.mm.p2776x373aa5.p2779xb45eb59b.C22825xd78e1eec c22825xd78e1eec = (com.p314xaae8f345.mm.p2776x373aa5.p2779xb45eb59b.C22825xd78e1eec) findViewById4;
            this.f544890t.setTextColor(-1);
            com.p314xaae8f345.mm.p2776x373aa5.C22795x96919289 c22795x96919289 = this.f544890t;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c22795x96919289, "null cannot be cast to non-null type com.tencent.mm.view.StickerEditText");
            ((com.p314xaae8f345.mm.p2776x373aa5.C22810x4e74aa94) c22795x96919289).m82758x33475b62(this.A);
            jg5.c cVar = jg5.c.f381198a;
            com.p314xaae8f345.mm.p2776x373aa5.C22795x96919289 mTextEV = this.f544890t;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mTextEV, "mTextEV");
            cVar.b(mTextEV, 1);
            android.view.View findViewById5 = this.f544884n.findViewById(com.p314xaae8f345.mm.R.id.agw);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById5, "null cannot be cast to non-null type com.tencent.mm.view.TextModeSelectView");
            com.p314xaae8f345.mm.p2776x373aa5.ViewOnClickListenerC22813xf4f26671 viewOnClickListenerC22813xf4f26671 = (com.p314xaae8f345.mm.p2776x373aa5.ViewOnClickListenerC22813xf4f26671) findViewById5;
            this.f544891u = viewOnClickListenerC22813xf4f26671;
            viewOnClickListenerC22813xf4f26671.m82780x764d6925(kz5.c0.i(1, 2, 3));
            this.f544891u.m82783x2e12cc09(kz5.c1.k(new jz5.l(1, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79923x9ef675da)), new jz5.l(2, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79924x9ef675db)), new jz5.l(3, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79925x9ef675dc))));
            this.f544891u.setColorFilter(-1);
            this.f544891u.m82781xea565d09(new ym5.o5(this, c22825xd78e1eec));
            c22825xd78e1eec.m82874x7b868205(-1);
            c22825xd78e1eec.m82875x8f51d5d9(new ym5.p5(this));
            this.f544888r.setOnClickListener(new ym5.q5(this));
            this.f544889s.setOnClickListener(new ym5.r5(this));
            this.f544884n.setOnClickListener(ym5.s5.f545062d);
        }
        android.view.View mTextEditView = this.f544884n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mTextEditView, "mTextEditView");
        return mTextEditView;
    }

    public final void h(int i17) {
        if (i17 <= 0) {
            return;
        }
        this.B = i17;
        com.p314xaae8f345.mm.p2776x373aa5.C22795x96919289 c22795x96919289 = this.f544890t;
        com.p314xaae8f345.mm.p2776x373aa5.C22810x4e74aa94 c22810x4e74aa94 = c22795x96919289 instanceof com.p314xaae8f345.mm.p2776x373aa5.C22810x4e74aa94 ? (com.p314xaae8f345.mm.p2776x373aa5.C22810x4e74aa94) c22795x96919289 : null;
        if (c22810x4e74aa94 != null) {
            c22810x4e74aa94.m82759xe8b0dbf5(m177356x1822ff50());
        }
    }

    public final void i(boolean z17) {
        android.view.View view = this.I;
        if (view != null) {
            int visibility = view.getVisibility();
            int i17 = z17 ? 0 : 8;
            if (visibility != i17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f545114x, "updateBottomControlBarVisibility: from " + visibility + " to " + i17);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/view/StickerDrawingView", "updateBottomControlBarVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/view/StickerDrawingView", "updateBottomControlBarVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (z17) {
                    android.widget.TextView textView = this.f545113J;
                    if (textView != null && textView.getVisibility() == 0) {
                        e(this, c01.s2.f118971n, false, 2, null);
                    }
                    android.widget.TextView textView2 = this.K;
                    if (textView2 != null && textView2.getVisibility() == 0) {
                        e(this, c01.s2.f118972o, false, 2, null);
                    }
                    android.widget.TextView textView3 = this.L;
                    if (textView3 != null && textView3.getVisibility() == 0) {
                        e(this, c01.s2.f118973p, false, 2, null);
                    }
                }
            }
        }
    }

    public final void j() {
        java.util.Objects.toString(this.H);
        int ordinal = this.H.ordinal();
        if (ordinal == 1) {
            i(true);
        } else if (ordinal != 2) {
            i(false);
        } else {
            if (mo177318xd03217ea().getParent() == null) {
                android.view.ViewGroup.LayoutParams layoutParams = mo177318xd03217ea().getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = 81;
                int c17 = layoutParams2.bottomMargin + com.p314xaae8f345.mm.ui.bl.c(getContext());
                layoutParams2.bottomMargin = c17;
                layoutParams2.bottomMargin = c17 + i65.a.b(getContext(), 32);
                android.view.View mo177318xd03217ea = mo177318xd03217ea();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(mo177318xd03217ea, arrayList.toArray(), "com/tencent/mm/view/StickerDrawingView", "updateBottomControlBarWithMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mo177318xd03217ea.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(mo177318xd03217ea, "com/tencent/mm/view/StickerDrawingView", "updateBottomControlBarWithMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                addView(mo177318xd03217ea(), layoutParams2);
            }
            i(false);
        }
        l45.q m177317xc879b3f2 = m177317xc879b3f2();
        if (m177317xc879b3f2 != null) {
            dl.f0 f0Var = (dl.f0) ((l45.n) m177317xc879b3f2).d(m177360x1f85dc49());
            if (f0Var != null) {
                f0Var.T = this.H == ym5.n5.f544980f;
            }
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i17) {
        super.onWindowVisibilityChanged(i17);
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.M;
        if (i17 == 0) {
            if (f5Var != null) {
                f5Var.f();
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("keyboardHeightProvider");
                throw null;
            }
        }
        if (f5Var != null) {
            f5Var.d();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("keyboardHeightProvider");
            throw null;
        }
    }

    /* renamed from: setBottomControlBarMode */
    public final void m177361x332f72c6(ym5.n5 value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        this.H = value;
        value.toString();
    }

    /* renamed from: setCancelDrawCallback */
    public final void m177362x75dfad45(yz5.a aVar) {
        this.E = aVar;
    }

    /* renamed from: setConfirmDrawCallback */
    public final void m177363xbf82e4c7(yz5.l lVar) {
        this.F = lVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public void w2(int i17, boolean z17) {
        this.f544890t.postDelayed(new ym5.w5(this, i17), 160L);
    }
}
