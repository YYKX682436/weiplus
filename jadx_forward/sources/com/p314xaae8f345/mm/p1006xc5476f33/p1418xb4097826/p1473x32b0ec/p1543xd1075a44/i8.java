package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class i8 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 implements android.view.View.OnClickListener {
    public final sf2.e0 H;
    public android.view.View I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.EditText f200182J;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 K;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 L;
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 M;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.r7 N;
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff P;
    public p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe Q;
    public android.view.View R;
    public android.widget.TextView S;
    public int T;
    public p3325xe03a0797.p3326xc267989b.r2 U;
    public boolean V;
    public boolean W;
    public java.util.List X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(android.content.Context context, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, sf2.e0 controller) {
        super(context, false, null, 0.75f, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        this.H = controller;
        this.X = kz5.p0.f395529d;
    }

    public static final void e0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.i8 i8Var) {
        i8Var.W = false;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = i8Var.U;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        i8Var.h0(i8Var.f200182J);
        android.widget.EditText editText = i8Var.f200182J;
        if (editText != null) {
            editText.clearComposingText();
        }
        android.widget.EditText editText2 = i8Var.f200182J;
        if (editText2 != null) {
            editText2.clearFocus();
        }
        android.widget.EditText editText3 = i8Var.f200182J;
        if (editText3 != null) {
            editText3.setText("");
        }
        i8Var.H.Z6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.r7 r7Var = i8Var.N;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = r7Var != null ? r7Var.f201117e : null;
        if (c22849x81a93d25 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c22849x81a93d25, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "switchToTabMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c22849x81a93d25.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c22849x81a93d25, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "switchToTabMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.r7 r7Var2 = i8Var.N;
        android.widget.TextView textView = r7Var2 != null ? r7Var2.f201118f : null;
        if (textView != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(textView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "switchToTabMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "switchToTabMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = i8Var.L;
        if (c22627xa933f8e4 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(c22627xa933f8e4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "switchToTabMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c22627xa933f8e4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(c22627xa933f8e4, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "switchToTabMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = i8Var.P;
        if (c2718xca2902ff == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tabLayout");
            throw null;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(c2718xca2902ff, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "switchToTabMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c2718xca2902ff.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(c2718xca2902ff, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "switchToTabMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = i8Var.Q;
        if (c1190x18d3c3fe == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
            throw null;
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(c1190x18d3c3fe, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "switchToTabMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c1190x18d3c3fe.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(c1190x18d3c3fe, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "switchToTabMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view = i8Var.R;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("divider");
            throw null;
        }
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(0);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "switchToTabMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "switchToTabMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView2 = i8Var.S;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tvCancel");
            throw null;
        }
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(8);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(textView2, arrayList7.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "switchToTabMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView2.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(textView2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "switchToTabMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        i8Var.f0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dht;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int J() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.r7 r7Var;
        android.view.ViewGroup viewGroup;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        this.I = rootView;
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.qgt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.P = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) findViewById;
        android.view.View view = this.I;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("myRoot");
            throw null;
        }
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.f569169qh2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.Q = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) findViewById2;
        android.view.View view2 = this.I;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("myRoot");
            throw null;
        }
        android.view.View findViewById3 = view2.findViewById(com.p314xaae8f345.mm.R.id.qf6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.R = findViewById3;
        android.view.View view3 = this.I;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("myRoot");
            throw null;
        }
        android.view.View findViewById4 = view3.findViewById(com.p314xaae8f345.mm.R.id.ole);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.S = (android.widget.TextView) findViewById4;
        android.view.View view4 = this.I;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("myRoot");
            throw null;
        }
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) view4.findViewById(com.p314xaae8f345.mm.R.id.f568302mf2);
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y7(this));
        }
        android.view.View view5 = this.I;
        if (view5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("myRoot");
            throw null;
        }
        this.f200182J = (android.widget.EditText) view5.findViewById(com.p314xaae8f345.mm.R.id.f568303mf3);
        android.view.View view6 = this.I;
        if (view6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("myRoot");
            throw null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view6.findViewById(com.p314xaae8f345.mm.R.id.f568301mf0);
        this.K = c22699x3dcdb352;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setOnClickListener(this);
        }
        android.view.View view7 = this.I;
        if (view7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("myRoot");
            throw null;
        }
        this.L = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4) view7.findViewById(com.p314xaae8f345.mm.R.id.m6l);
        android.widget.TextView textView = this.S;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tvCancel");
            throw null;
        }
        textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z7(this));
        zl2.r4 r4Var = zl2.r4.f555483a;
        r4Var.Z2(this.f200182J, null, 200, 100, (r17 & 16) != 0, (r17 & 32) != 0 ? com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2 : null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b8(this));
        android.widget.EditText editText = this.f200182J;
        if (editText != null) {
            editText.setOnEditorActionListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c8(this));
        }
        android.widget.EditText editText2 = this.f200182J;
        if (editText2 != null) {
            editText2.setOnFocusChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d8(this));
        }
        android.view.View view8 = this.I;
        if (view8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("myRoot");
            throw null;
        }
        android.view.View findViewById5 = view8.findViewById(com.p314xaae8f345.mm.R.id.fd8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e8 e8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e8(this);
        sf2.e0 e0Var = this.H;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.r7 r7Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.r7((android.view.ViewGroup) findViewById5, e0Var, null, e8Var);
        this.N = r7Var2;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = r7Var2.f201117e;
        this.M = c22849x81a93d25;
        bm2.a0 a0Var = e0Var.f488645n;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.mo7960x6cab2c8d(a0Var);
            c22849x81a93d25.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c22849x81a93d25.getContext()));
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = this.M;
        if (c22849x81a93d252 != null) {
            ym5.a1.g(c22849x81a93d252, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.f8(this));
        }
        if (!r4Var.Y1(this.f199716e) && (r7Var = this.N) != null && (viewGroup = r7Var.f201113a) != null) {
            android.view.View view9 = this.I;
            if (view9 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("myRoot");
                throw null;
            }
            viewGroup.setPadding(0, 0, 0, com.p314xaae8f345.mm.ui.bl.c(view9.getContext()));
        }
        android.content.Context context = this.f199716e;
        sf2.e0 e0Var2 = this.H;
        r45.xg7 xg7Var = r45.xg7.emFinderLiveGetMusicTabListType_FinderMusic;
        te2.u1 u1Var = new te2.u1(context, null, 0, e0Var2, xg7Var, 6, null);
        android.content.Context context2 = this.f199716e;
        sf2.e0 e0Var3 = this.H;
        r45.xg7 xg7Var2 = r45.xg7.emFinderLiveGetMusicTabListType_Like;
        te2.u1 u1Var2 = new te2.u1(context2, null, 0, e0Var3, xg7Var2, 6, null);
        android.content.Context context3 = this.f199716e;
        sf2.e0 e0Var4 = this.H;
        r45.xg7 xg7Var3 = r45.xg7.emFinderLiveGetMusicTabListType_Recommend;
        this.X = kz5.c0.i(u1Var, u1Var2, new te2.u1(context3, null, 0, e0Var4, xg7Var3, 6, null));
        e0Var.a7(xg7Var, null);
        e0Var.a7(xg7Var3, null);
        e0Var.a7(xg7Var2, null);
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = this.Q;
        if (c1190x18d3c3fe == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
            throw null;
        }
        c1190x18d3c3fe.m8315x6cab2c8d(new te2.r1(this.X));
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe2 = this.Q;
        if (c1190x18d3c3fe2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
            throw null;
        }
        c1190x18d3c3fe2.m8321x40341e13(this.X.size() - 1);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = this.P;
        if (c2718xca2902ff == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tabLayout");
            throw null;
        }
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe3 = this.Q;
        if (c1190x18d3c3fe3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
            throw null;
        }
        c2718xca2902ff.m20382x3da43a7b(c1190x18d3c3fe3);
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe4 = this.Q;
        if (c1190x18d3c3fe4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
            throw null;
        }
        c1190x18d3c3fe4.m8289xa5a25773(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h8(this));
        android.view.View view10 = this.I;
        if (view10 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("myRoot");
            throw null;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (!n3.x0.c(view10) || view10.isLayoutRequested()) {
            view10.addOnLayoutChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g8(this));
        } else {
            e0(this);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public boolean Q() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void R() {
        super.R();
        g0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void S() {
        super.S();
        g0();
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g2
    public void f() {
        h0(this.f200182J);
        android.widget.EditText editText = this.f200182J;
        if (editText != null) {
            editText.setText("");
        }
        sf2.e0 e0Var = this.H;
        e0Var.getClass();
        if2.b.Y6(e0Var, qo0.b.L2, null, 2, null);
        e0Var.Z6();
    }

    public final void f0() {
        int i17 = 0;
        for (java.lang.Object obj : this.X) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 m166328x92013f13 = ((te2.u1) obj).m166328x92013f13();
            boolean z17 = true;
            int i19 = i17 == this.T ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m166328x92013f13, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "enableScrollForSelectedPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m166328x92013f13.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(m166328x92013f13, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "enableScrollForSelectedPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (i17 != this.T) {
                z17 = false;
            }
            m166328x92013f13.setNestedScrollingEnabled(z17);
            i17 = i18;
        }
    }

    public final void g0() {
        h0(this.f200182J);
        android.widget.EditText editText = this.f200182J;
        if (editText != null) {
            editText.setText("");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.r7 r7Var = this.N;
        android.widget.TextView textView = r7Var != null ? r7Var.f201118f : null;
        if (textView != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(textView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        sf2.e0 e0Var = this.H;
        e0Var.getClass();
        if2.b.Y6(e0Var, qo0.b.L2, null, 2, null);
        e0Var.Z6();
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.U;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
    }

    public final void h0(android.widget.EditText editText) {
        android.content.Context context;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) ((editText == null || (context = editText.getContext()) == null) ? null : context.getSystemService("input_method"));
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(editText != null ? editText.getWindowToken() : null, 0);
        }
    }

    public final void i0(int i17) {
        boolean x17 = dk2.ef.f314905a.x();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 1);
        jSONObject.put("tab_type", ((te2.u1) this.X.get(i17)).m166331xfb85f7b0().f471622d);
        sf2.e0 e0Var = this.H;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(e0Var.f488648q, "")) {
            jSONObject.put("ai_msg_id", e0Var.f488648q);
        }
        if (x17) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.O1, jSONObject.toString(), null, 4, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            ml2.c1 c1Var = ml2.c1.f408858e;
            zy2.zb.j5((zy2.zb) c18, 48L, jSONObject.toString(), null, 4, null);
        }
    }

    public final void j0(boolean z17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = this.L;
        if (c22627xa933f8e4 != null) {
            int i17 = z17 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c22627xa933f8e4, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "toggleSearchLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c22627xa933f8e4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c22627xa933f8e4, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "toggleSearchLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.M;
        if (c22849x81a93d25 != null) {
            int i18 = z17 ^ true ? 0 : 8;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(c22849x81a93d25, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "toggleSearchLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c22849x81a93d25.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(c22849x81a93d25, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "toggleSearchLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.r7 r7Var = this.N;
        android.widget.TextView textView = r7Var != null ? r7Var.f201118f : null;
        if (textView == null) {
            return;
        }
        int i19 = z17 ^ true ? 0 : 8;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(textView, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "toggleSearchLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "toggleSearchLoading", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01be A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k0(java.util.List r12, r45.xg7 r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.i8.k0(java.util.List, r45.xg7, boolean):void");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        android.widget.EditText editText;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.f568301mf0 && (editText = this.f200182J) != null) {
            editText.setText("");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorSearchMusicWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
