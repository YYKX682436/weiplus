package rv0;

/* loaded from: classes5.dex */
public final class j extends com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 {
    public android.view.ViewGroup A;
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331 B;
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331 C;
    public android.view.View D;
    public android.widget.ImageView E;
    public android.widget.TextView F;
    public final int G;
    public boolean H;
    public ex0.a0 I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f481585J;
    public final jz5.g K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.content.Context context) {
        super(context, null, 0, 6, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.G = (int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 40);
        this.H = true;
        this.K = jz5.h.b(new rv0.g(context));
    }

    /* renamed from: getEditOperationMarginBottom */
    private final int m163163xb8cb61e0() {
        return ((java.lang.Number) ((jz5.n) this.K).mo141623x754a37bb()).intValue();
    }

    public final void B(int i17) {
        h(this.f481585J, "ClipPanel is not attached");
        android.view.View view = this.D;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("volumeButton");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams2 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = i17 + this.G;
        view.setLayoutParams(layoutParams2);
        I();
        H();
        E();
        K();
        D();
    }

    public final void C(android.view.View view, boolean z17) {
        float f17;
        if (z17) {
            rv0.a7 a7Var = rv0.b7.f481475d;
            f17 = 1.0f;
        } else {
            rv0.a7 a7Var2 = rv0.b7.f481475d;
            f17 = 0.3f;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/ClipPanel", "setEditItemEnabled", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/ClipPanel", "setEditItemEnabled", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public final void D() {
        boolean z17;
        ex0.a0 a0Var = this.I;
        if (a0Var == null) {
            return;
        }
        ex0.r n17 = a0Var.n();
        ex0.f fVar = n17 instanceof ex0.f ? (ex0.f) n17 : null;
        if (fVar == null) {
            return;
        }
        int ordinal = fVar.f338702c.ordinal();
        if (ordinal == 2 || ordinal == 3) {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7 c4183xefcb50b7 = fVar.f338663f;
            if (c4183xefcb50b7.k0() || c4183xefcb50b7.j0()) {
                z17 = true;
                android.view.View findViewWithTag = m163166xd718ae64().findViewWithTag(fv0.a.f348471g);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewWithTag, "findViewWithTag(...)");
                C(findViewWithTag, z17);
            }
        }
        z17 = false;
        android.view.View findViewWithTag2 = m163166xd718ae64().findViewWithTag(fv0.a.f348471g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewWithTag2, "findViewWithTag(...)");
        C(findViewWithTag2, z17);
    }

    public final void E() {
        ex0.v vVar;
        java.util.List list;
        ex0.a0 a0Var = this.I;
        ex0.r n17 = a0Var != null ? a0Var.n() : null;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331 m163164xc7f48420 = m163164xc7f48420();
        fv0.a aVar = fv0.a.f348469e;
        android.view.View findViewWithTag = m163164xc7f48420.findViewWithTag(aVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewWithTag, "findViewWithTag(...)");
        C(findViewWithTag, n17 != null);
        ex0.a0 a0Var2 = this.I;
        int size = (a0Var2 == null || (vVar = a0Var2.f338630g) == null || (list = vVar.f338710e) == null) ? 0 : ((java.util.ArrayList) list).size();
        android.view.View findViewWithTag2 = m163166xd718ae64().findViewWithTag(aVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewWithTag2, "findViewWithTag(...)");
        C(findViewWithTag2, n17 != null && size > 1);
    }

    public final void F() {
        boolean z17;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352;
        ex0.a0 a0Var = this.I;
        if (a0Var == null) {
            return;
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_finder_mj_publisher_digizoom_enabled, 1) == 1) {
            ug.m mVar = ug.m.ImageClip;
            ex0.v vVar = a0Var.f338630g;
            vVar.getClass();
            java.util.List list = vVar.f338710e;
            if (!(list instanceof java.util.Collection) || !((java.util.ArrayList) list).isEmpty()) {
                java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                while (it.hasNext()) {
                    if (((ex0.r) it.next()).f338702c == mVar) {
                        z17 = true;
                        break;
                    }
                }
            }
        }
        z17 = false;
        if (!z17) {
            android.view.View findViewWithTag = m163166xd718ae64().findViewWithTag(fv0.a.f348487z);
            if (findViewWithTag != null) {
                m163166xd718ae64().removeView(findViewWithTag);
                return;
            }
            return;
        }
        int i17 = a0Var.B() ? com.p314xaae8f345.mm.R.C30861xcebc809e.d5m : com.p314xaae8f345.mm.R.C30861xcebc809e.d5l;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331 m163166xd718ae64 = m163166xd718ae64();
        fv0.a aVar = fv0.a.f348487z;
        if (m163166xd718ae64.findViewWithTag(aVar) != null) {
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331 m163166xd718ae642 = m163166xd718ae64();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m163166xd718ae642, "<this>");
            android.view.View findViewWithTag2 = m163166xd718ae642.findViewWithTag(aVar);
            if (findViewWithTag2 == null || (c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewWithTag2.findViewWithTag("icon")) == null) {
                return;
            }
            c22699x3dcdb352.setImageResource(i17);
            return;
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331 m163166xd718ae643 = m163166xd718ae64();
        android.view.View a17 = by0.v.f117884a.a(this, aVar, com.p314xaae8f345.mm.R.C30867xcad56011.o8i, i17, 0, new rv0.p4(this));
        fv0.a aVar2 = fv0.a.f348468d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m163166xd718ae643, "<this>");
        android.view.View findViewWithTag3 = m163166xd718ae643.findViewWithTag(aVar2);
        if (findViewWithTag3 == null) {
            return;
        }
        m163166xd718ae643.addView(a17, m163166xd718ae643.indexOfChild(findViewWithTag3) + 1);
    }

    public final void G() {
        ex0.a0 a0Var = this.I;
        ex0.r n17 = a0Var != null ? a0Var.n() : null;
        if (n17 == null) {
            m163164xc7f48420().setVisibility(8);
            m163166xd718ae64().setVisibility(8);
            return;
        }
        if (n17.f338702c == ug.m.Music) {
            m163164xc7f48420().setVisibility(0);
            m163166xd718ae64().setVisibility(8);
        } else {
            m163164xc7f48420().setVisibility(8);
            m163166xd718ae64().setVisibility(0);
        }
        I();
        H();
        E();
        K();
        D();
    }

    public final void H() {
        ex0.r n17;
        ex0.a0 a0Var = this.I;
        if (a0Var == null || (n17 = a0Var.n()) == null) {
            return;
        }
        ug.m mVar = ug.m.Music;
        ug.m mVar2 = n17.f338702c;
        if (mVar2 == mVar) {
            return;
        }
        int ordinal = mVar2.ordinal();
        boolean z17 = ordinal == 2 || ordinal == 3;
        android.view.View findViewWithTag = m163166xd718ae64().findViewWithTag(fv0.a.f348476o);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewWithTag, "findViewWithTag(...)");
        C(findViewWithTag, z17);
    }

    public final void I() {
        ex0.r n17;
        ex0.a0 a0Var = this.I;
        if (a0Var == null || (n17 = a0Var.n()) == null) {
            return;
        }
        if (n17.f338702c == ug.m.Music) {
            return;
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = (com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a) a0Var.f338639p.mo3195x754a37bb();
        boolean n18 = c4128x879fba0a != null ? n17.n(c4128x879fba0a) : false;
        android.view.View findViewWithTag = m163166xd718ae64().findViewWithTag(fv0.a.f348472h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewWithTag, "findViewWithTag(...)");
        C(findViewWithTag, n18);
    }

    public final void J(boolean z17) {
        if (this.f481585J) {
            if (z17) {
                android.widget.ImageView imageView = this.E;
                if (imageView == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("volumeIconView");
                    throw null;
                }
                imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cng);
                android.widget.TextView textView = this.F;
                if (textView != null) {
                    textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.lmv);
                    return;
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("volumeTextView");
                    throw null;
                }
            }
            android.widget.ImageView imageView2 = this.E;
            if (imageView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("volumeIconView");
                throw null;
            }
            imageView2.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cm8);
            android.widget.TextView textView2 = this.F;
            if (textView2 != null) {
                textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.lmw);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("volumeTextView");
                throw null;
            }
        }
    }

    public final void K() {
        ex0.r n17;
        ex0.a0 a0Var = this.I;
        if (a0Var == null || (n17 = a0Var.n()) == null) {
            return;
        }
        android.view.View findViewWithTag = m163166xd718ae64().findViewWithTag(fv0.a.f348477p);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewWithTag, "findViewWithTag(...)");
        C(findViewWithTag, n17.f338702c == ug.m.MovieClip);
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q
    public ou0.z b() {
        return new ou0.y(true);
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q
    public void c(android.content.Context context, android.widget.FrameLayout bodyContainerLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bodyContainerLayout, "bodyContainerLayout");
        com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dfp, bodyContainerLayout);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.q4p);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.A = (android.view.ViewGroup) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.q8s);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        m163168x63119994((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331) findViewById2);
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.qaj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        m163170xca05e9d8((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331) findViewById3);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.qbi);
        if (this.H) {
            c22699x3dcdb352.setVisibility(0);
            c22699x3dcdb352.m82037xa10c26f6(false);
            c22699x3dcdb352.setOnClickListener(new rv0.h(this));
        } else {
            c22699x3dcdb352.setVisibility(8);
        }
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.q3p);
        android.view.View findViewById5 = findViewById4.findViewById(com.p314xaae8f345.mm.R.id.q3q);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.E = (android.widget.ImageView) findViewById5;
        android.view.View findViewById6 = findViewById4.findViewById(com.p314xaae8f345.mm.R.id.q3r);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.F = (android.widget.TextView) findViewById6;
        findViewById4.setOnClickListener(new rv0.i(this));
        this.D = findViewById4;
        m163166xd718ae64().removeAllViews();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331 m163166xd718ae64 = m163166xd718ae64();
        m163166xd718ae64.setVisibility(0);
        m163166xd718ae64.m2727x1a6eb00e(0);
        by0.v vVar = by0.v.f117884a;
        m163166xd718ae64.addView(vVar.a(m163166xd718ae64, fv0.a.f348486y, com.p314xaae8f345.mm.R.C30867xcad56011.mtp, com.p314xaae8f345.mm.R.C30861xcebc809e.cwg, 0, new rv0.h4(this)));
        m163166xd718ae64.addView(vVar.a(m163166xd718ae64, fv0.a.f348468d, com.p314xaae8f345.mm.R.C30867xcad56011.lkz, com.p314xaae8f345.mm.R.C30861xcebc809e.cms, 0, new rv0.i4(this)));
        android.view.View view = new android.view.View(m163166xd718ae64.getContext());
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331.LayoutParams layoutParams = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331.LayoutParams(view.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561175bh), view.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs));
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = view.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561204c8);
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin = view.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(-1);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.1f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/ClipPanel_StorylineEditKt", "initStorylineEditOptContainer", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/ClipPanel;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/ClipPanel_StorylineEditKt", "initStorylineEditOptContainer", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/ClipPanel;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        m163166xd718ae64.addView(view);
        fv0.a aVar = fv0.a.f348469e;
        m163166xd718ae64.addView(vVar.a(m163166xd718ae64, aVar, com.p314xaae8f345.mm.R.C30867xcad56011.ll8, com.p314xaae8f345.mm.R.C30861xcebc809e.cmv, m163166xd718ae64.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), new rv0.j4(this)));
        m163166xd718ae64.addView(vVar.a(m163166xd718ae64, fv0.a.f348470f, com.p314xaae8f345.mm.R.C30867xcad56011.lla, com.p314xaae8f345.mm.R.C30861xcebc809e.cmy, m163166xd718ae64.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), new rv0.k4(this)));
        m163166xd718ae64.addView(vVar.a(m163166xd718ae64, fv0.a.f348471g, com.p314xaae8f345.mm.R.C30867xcad56011.f574020ll0, com.p314xaae8f345.mm.R.C30861xcebc809e.cmt, m163166xd718ae64.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), new rv0.l4(this)));
        m163166xd718ae64.addView(vVar.a(m163166xd718ae64, fv0.a.f348472h, com.p314xaae8f345.mm.R.C30867xcad56011.llc, com.p314xaae8f345.mm.R.C30861xcebc809e.f562567cn0, m163166xd718ae64.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), new rv0.m4(this)));
        m163166xd718ae64.addView(vVar.a(m163166xd718ae64, fv0.a.f348473i, com.p314xaae8f345.mm.R.C30867xcad56011.ll9, com.p314xaae8f345.mm.R.C30861xcebc809e.cmw, m163166xd718ae64.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), new rv0.n4(this)));
        m163166xd718ae64.addView(vVar.a(m163166xd718ae64, fv0.a.f348485x, com.p314xaae8f345.mm.R.C30867xcad56011.mtq, com.p314xaae8f345.mm.R.C30861xcebc809e.cwh, m163166xd718ae64.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), new rv0.o4(this)));
        m163166xd718ae64.addView(vVar.a(m163166xd718ae64, fv0.a.f348474m, com.p314xaae8f345.mm.R.C30867xcad56011.f574021ll1, com.p314xaae8f345.mm.R.C30861xcebc809e.cmu, m163166xd718ae64.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), new rv0.d4(this)));
        m163166xd718ae64.addView(vVar.a(m163166xd718ae64, fv0.a.f348476o, com.p314xaae8f345.mm.R.C30867xcad56011.llb, com.p314xaae8f345.mm.R.C30861xcebc809e.cmz, m163166xd718ae64.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), new rv0.e4(this)));
        m163166xd718ae64.addView(vVar.a(m163166xd718ae64, fv0.a.f348475n, com.p314xaae8f345.mm.R.C30867xcad56011.ll_, com.p314xaae8f345.mm.R.C30861xcebc809e.cmx, m163166xd718ae64.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), new rv0.f4(this)));
        fv0.a aVar2 = fv0.a.f348477p;
        m163166xd718ae64.addView(vVar.a(m163166xd718ae64, aVar2, com.p314xaae8f345.mm.R.C30867xcad56011.lld, com.p314xaae8f345.mm.R.C30861xcebc809e.f562569cn1, m163166xd718ae64.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), new rv0.g4(this)));
        m163164xc7f48420().removeAllViews();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331 m163164xc7f48420 = m163164xc7f48420();
        m163164xc7f48420.setVisibility(8);
        m163164xc7f48420.m2727x1a6eb00e(0);
        m163164xc7f48420.addView(vVar.a(m163164xc7f48420, aVar, com.p314xaae8f345.mm.R.C30867xcad56011.ll8, com.p314xaae8f345.mm.R.C30861xcebc809e.cmv, 0, new rv0.b4(this)));
        m163164xc7f48420.addView(vVar.a(m163164xc7f48420, aVar2, com.p314xaae8f345.mm.R.C30867xcad56011.lld, com.p314xaae8f345.mm.R.C30861xcebc809e.f562569cn1, m163164xc7f48420.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), new rv0.c4(this)));
    }

    /* renamed from: getMusicSegmentEditOptContainer$plugin_mj_template_release */
    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331 m163164xc7f48420() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331 c0098xfb43a331 = this.C;
        if (c0098xfb43a331 != null) {
            return c0098xfb43a331;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicSegmentEditOptContainer");
        throw null;
    }

    /* renamed from: getShouldShowAssetAddingEntry */
    public final boolean m163165x1ccefa7() {
        return this.H;
    }

    /* renamed from: getStorylineSegmentEditOptContainer$plugin_mj_template_release */
    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331 m163166xd718ae64() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331 c0098xfb43a331 = this.B;
        if (c0098xfb43a331 != null) {
            return c0098xfb43a331;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("storylineSegmentEditOptContainer");
        throw null;
    }

    /* renamed from: getTimelineViewModel */
    public final ex0.a0 m163167xfeffbb8d() {
        return this.I;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public boolean n(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public void p() {
        this.f481585J = true;
        android.view.ViewGroup viewGroup = this.A;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editOperationRootContainer");
            throw null;
        }
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.z.b(this, viewGroup, java.lang.Integer.valueOf(m163163xb8cb61e0()));
        G();
    }

    /* renamed from: setMusicSegmentEditOptContainer$plugin_mj_template_release */
    public final void m163168x63119994(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331 c0098xfb43a331) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c0098xfb43a331, "<set-?>");
        this.C = c0098xfb43a331;
    }

    /* renamed from: setShouldShowAssetAddingEntry */
    public final void m163169xf18ba5b3(boolean z17) {
        this.H = z17;
    }

    /* renamed from: setStorylineSegmentEditOptContainer$plugin_mj_template_release */
    public final void m163170xca05e9d8(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331 c0098xfb43a331) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c0098xfb43a331, "<set-?>");
        this.B = c0098xfb43a331;
    }

    /* renamed from: setTimelineViewModel */
    public final void m163171xda95c801(ex0.a0 a0Var) {
        this.I = a0Var;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public void t() {
        this.f481585J = false;
    }
}
