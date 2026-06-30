package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes9.dex */
public final class rq extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 {
    public final jz5.g H;
    public final jz5.g I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq(android.content.Context context) {
        super(context, false, null, 0.75f, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.H = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pq(context));
        this.I = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.oq(context));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ajv;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public java.lang.String L() {
        java.lang.String string = this.f199716e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kei);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        jz5.g gVar = this.I;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.s1 s1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.s1) ((jz5.n) gVar).mo141623x754a37bb();
        if (s1Var != null) {
            android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.iim);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            s1Var.f198909h = (android.widget.LinearLayout) findViewById;
            android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.llz);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
            s1Var.f198910i = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById2;
            android.view.View findViewById3 = rootView.findViewById(com.p314xaae8f345.mm.R.id.eyq);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
            s1Var.f198911m = (android.widget.EditText) findViewById3;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = s1Var.f198910i;
            if (c1163xf1deaba4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(s1Var.f198905d, 4));
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = s1Var.f198910i;
            if (c1163xf1deaba42 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            bm2.c cVar = s1Var.f198914p;
            c1163xf1deaba42.mo7960x6cab2c8d(cVar);
            cVar.f103337e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.o1(s1Var);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = s1Var.f198910i;
            if (c1163xf1deaba43 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            c1163xf1deaba43.N(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1(s1Var));
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba44 = s1Var.f198910i;
            if (c1163xf1deaba44 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            ym5.a1.g(c1163xf1deaba44, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.q1());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.s1 s1Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.s1) ((jz5.n) gVar).mo141623x754a37bb();
        jz5.g gVar2 = this.H;
        if (s1Var2 != null) {
            s1Var2.f198915q = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.e2) ((jz5.n) gVar2).mo141623x754a37bb();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.e2 e2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.e2) ((jz5.n) gVar2).mo141623x754a37bb();
        if (e2Var != null) {
            e2Var.f198590e = rootView.findViewById(com.p314xaae8f345.mm.R.id.goo);
            e2Var.f198591f = rootView.findViewById(com.p314xaae8f345.mm.R.id.gor);
            e2Var.f198592g = (com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864) rootView.findViewById(com.p314xaae8f345.mm.R.id.m6e);
            e2Var.f198593h = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) rootView.findViewById(com.p314xaae8f345.mm.R.id.eyw);
            e2Var.f198595m = rootView.findViewById(com.p314xaae8f345.mm.R.id.eyo);
            e2Var.f198596n = (android.widget.EditText) rootView.findViewById(com.p314xaae8f345.mm.R.id.eyq);
            e2Var.f198597o = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.eyr);
            e2Var.f198598p = rootView.findViewById(com.p314xaae8f345.mm.R.id.eyv);
            android.view.View findViewById4 = rootView.findViewById(com.p314xaae8f345.mm.R.id.pni);
            e2Var.f198594i = findViewById4;
            if (findViewById4 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById4, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC", "initView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC", "initView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view = e2Var.f198591f;
            if (view != null) {
                view.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.u1(e2Var));
            }
            android.view.View view2 = e2Var.f198591f;
            if (view2 != null) {
                view2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.v1(e2Var));
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864 = e2Var.f198592g;
            if (c22851x22587864 != null) {
                c22851x22587864.m82945xba09cf09(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.w1(e2Var));
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba45 = e2Var.f198593h;
            if (c1163xf1deaba45 != null) {
                c1163xf1deaba45.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(e2Var.f198589d));
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba46 = e2Var.f198593h;
            bm2.f fVar = e2Var.f198604v;
            if (c1163xf1deaba46 != null) {
                c1163xf1deaba46.mo7960x6cab2c8d(fVar);
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba47 = e2Var.f198593h;
            if (c1163xf1deaba47 != null) {
                ym5.a1.g(c1163xf1deaba47, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.x1());
            }
            android.widget.EditText editText = e2Var.f198596n;
            if (editText != null) {
                editText.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.y1(e2Var));
            }
            android.widget.EditText editText2 = e2Var.f198596n;
            if (editText2 != null) {
                editText2.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.z1(e2Var), 128L);
            }
            android.widget.EditText editText3 = e2Var.f198596n;
            if (editText3 != null) {
                editText3.setOnClickListener(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.a2.f198424d);
            }
            android.view.View view3 = e2Var.f198595m;
            if (view3 != null) {
                view3.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b2(e2Var));
            }
            fVar.f103409e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c2(e2Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.e2 e2Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.e2) ((jz5.n) gVar2).mo141623x754a37bb();
        if (e2Var2 != null) {
            e2Var2.f198605w = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.s1) ((jz5.n) gVar).mo141623x754a37bb();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.e2 e2Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.e2) ((jz5.n) gVar2).mo141623x754a37bb();
        if (e2Var3 != null) {
            e2Var3.f198606x = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.qq(this);
        }
        a0(this.f199716e.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.clh));
        d0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public android.view.View u() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(this.f199716e);
        c22699x3dcdb352.m82040x7541828(c22699x3dcdb352.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77654xad7ef30));
        c22699x3dcdb352.setLayoutParams(new android.view.ViewGroup.LayoutParams(i65.a.b(c22699x3dcdb352.getContext(), 12), i65.a.b(c22699x3dcdb352.getContext(), 24)));
        c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80016xebd25a3f);
        return c22699x3dcdb352;
    }
}
