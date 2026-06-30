package cw0;

/* loaded from: classes5.dex */
public final class d extends com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 {
    public com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.p903x6b2e132.C10970x276594b8 A;
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331 B;
    public android.widget.HorizontalScrollView C;
    public android.view.View D;
    public android.view.View E;
    public android.view.View F;
    public android.view.View G;
    public final int H;
    public final int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context) {
        super(context, null, 0, 6, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.H = (int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 40);
        this.I = j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562087ag2);
    }

    public final void B(android.view.View view, boolean z17) {
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
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "setEditItemEnabled", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "setEditItemEnabled", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public final void C(double d17) {
        android.view.View view = this.F;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("volumeButton");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams2 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = ((int) d17) + this.H;
        view.setLayoutParams(layoutParams2);
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q
    public ou0.z b() {
        return new ou0.y(true);
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q
    public void c(android.content.Context context, android.widget.FrameLayout bodyContainerLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bodyContainerLayout, "bodyContainerLayout");
        com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.djo, bodyContainerLayout);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f567616qm5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        m122812x7bca70d2((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.p903x6b2e132.C10970x276594b8) findViewById);
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.qm6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        m122813xf04cead1((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331) findViewById2);
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.qhv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.C = (android.widget.HorizontalScrollView) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.qr7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.D = findViewById4;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.qr6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.E = findViewById5;
        android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.q3p);
        findViewById6.setOnClickListener(new cw0.b(this));
        this.F = findViewById6;
        android.view.View findViewById7 = findViewById(com.p314xaae8f345.mm.R.id.f567617or);
        findViewById7.setOnClickListener(cw0.c.f304149d);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById7, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById7.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById7, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.G = findViewById7;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331 m122811xfd5faf5d = m122811xfd5faf5d();
        by0.v vVar = by0.v.f117884a;
        m122811xfd5faf5d.addView(vVar.a(m122811xfd5faf5d, fv0.a.f348480s, com.p314xaae8f345.mm.R.C30867xcad56011.lwo, com.p314xaae8f345.mm.R.C30861xcebc809e.aqu, m122811xfd5faf5d.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), new cw0.m0(this)));
        android.view.View view = new android.view.View(m122811xfd5faf5d.getContext());
        view.setTag(cw0.a.f304135d);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331.LayoutParams layoutParams = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331.LayoutParams(view.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561175bh), view.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs));
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = view.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561204c8);
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin = view.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(-1);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(0.1f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel_menuKt", "createBottomMenu", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel_menuKt", "createBottomMenu", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        m122811xfd5faf5d.addView(view);
        m122811xfd5faf5d.addView(vVar.a(m122811xfd5faf5d, fv0.a.f348469e, com.p314xaae8f345.mm.R.C30867xcad56011.ll8, com.p314xaae8f345.mm.R.C30861xcebc809e.cmv, m122811xfd5faf5d.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), new cw0.n0(this)));
        m122811xfd5faf5d.addView(vVar.a(m122811xfd5faf5d, fv0.a.f348481t, com.p314xaae8f345.mm.R.C30867xcad56011.lwn, com.p314xaae8f345.mm.R.C30861xcebc809e.cpl, m122811xfd5faf5d.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), new cw0.o0(this)));
        android.view.View a17 = vVar.a(m122811xfd5faf5d, fv0.a.f348472h, com.p314xaae8f345.mm.R.C30867xcad56011.llc, com.p314xaae8f345.mm.R.C30861xcebc809e.f562567cn0, m122811xfd5faf5d.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), new cw0.p0(this));
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(a17, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel_menuKt", "createBottomMenu", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        a17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(a17, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel_menuKt", "createBottomMenu", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m122811xfd5faf5d.addView(a17);
        android.view.View view2 = new android.view.View(m122811xfd5faf5d.getContext());
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331.LayoutParams layoutParams2 = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331.LayoutParams(view2.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561175bh), view2.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs));
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = view2.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561204c8);
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = view2.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        view2.setLayoutParams(layoutParams2);
        view2.setBackgroundColor(-1);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Float.valueOf(0.1f));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel_menuKt", "createBottomMenu", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel_menuKt", "createBottomMenu", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/narration/NarrationPanel;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        m122811xfd5faf5d.addView(view2);
        m122811xfd5faf5d.addView(vVar.a(m122811xfd5faf5d, fv0.a.f348482u, com.p314xaae8f345.mm.R.C30867xcad56011.f574045hk, com.p314xaae8f345.mm.R.C30861xcebc809e.f562568lr, m122811xfd5faf5d.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), new cw0.q0(this)));
        m122811xfd5faf5d.addView(vVar.a(m122811xfd5faf5d, fv0.a.f348483v, com.p314xaae8f345.mm.R.C30867xcad56011.f574046iu, com.p314xaae8f345.mm.R.C30861xcebc809e.f562566n3, m122811xfd5faf5d.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), new cw0.r0(this)));
    }

    /* renamed from: getNarrationLayout$plugin_mj_template_release */
    public final com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.p903x6b2e132.C10970x276594b8 m122810x3c4152c6() {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.p903x6b2e132.C10970x276594b8 c10970x276594b8 = this.A;
        if (c10970x276594b8 != null) {
            return c10970x276594b8;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("narrationLayout");
        throw null;
    }

    /* renamed from: getNarrationSegmentEditOptContainer$plugin_mj_template_release */
    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331 m122811xfd5faf5d() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331 c0098xfb43a331 = this.B;
        if (c0098xfb43a331 != null) {
            return c0098xfb43a331;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("narrationSegmentEditOptContainer");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public boolean n(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public void p() {
        android.widget.HorizontalScrollView horizontalScrollView = this.C;
        if (horizontalScrollView != null) {
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.z.b(this, horizontalScrollView, java.lang.Integer.valueOf(this.I));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("containerOfOptContainer");
            throw null;
        }
    }

    /* renamed from: setNarrationLayout$plugin_mj_template_release */
    public final void m122812x7bca70d2(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.p903x6b2e132.C10970x276594b8 c10970x276594b8) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c10970x276594b8, "<set-?>");
        this.A = c10970x276594b8;
    }

    /* renamed from: setNarrationSegmentEditOptContainer$plugin_mj_template_release */
    public final void m122813xf04cead1(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331 c0098xfb43a331) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c0098xfb43a331, "<set-?>");
        this.B = c0098xfb43a331;
    }
}
