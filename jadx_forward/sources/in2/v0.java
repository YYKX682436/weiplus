package in2;

/* loaded from: classes10.dex */
public final class v0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 implements android.view.View.OnClickListener {
    public final gk2.e H;
    public final sf2.x I;

    /* renamed from: J, reason: collision with root package name */
    public final java.lang.String f374446J;
    public android.widget.TextView K;
    public android.widget.TextView L;
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 M;
    public android.widget.FrameLayout N;
    public android.view.View P;
    public android.widget.CheckBox Q;
    public android.widget.TextView R;
    public final in2.q0 S;
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.g1 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(android.content.Context context, gk2.e liveData, sf2.x controller) {
        super(context, false, null, 0.75f, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        this.H = liveData;
        this.I = controller;
        this.f374446J = "FinderLiveAnchorMusicEditWidget";
        this.S = new in2.q0(liveData);
        this.T = new p012xc85e97e9.p103xe821e364.p104xd1075a44.g1(new in2.s0(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.an9;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int D() {
        return 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        this.K = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.mxa);
        this.L = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.mxe);
        this.M = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) rootView.findViewById(com.p314xaae8f345.mm.R.id.mxi);
        this.N = (android.widget.FrameLayout) rootView.findViewById(com.p314xaae8f345.mm.R.id.mxg);
        this.P = rootView.findViewById(com.p314xaae8f345.mm.R.id.emt);
        this.Q = (android.widget.CheckBox) rootView.findViewById(com.p314xaae8f345.mm.R.id.mxb);
        this.R = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.mxd);
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.mxj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.ui.fk.a((android.widget.TextView) findViewById);
        ((android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.mxj)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.ojw);
        android.widget.TextView textView = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.v5p);
        if (textView != null) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.p1s);
        }
        android.widget.TextView textView2 = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.v5q);
        if (textView2 != null) {
            textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.p1v);
        }
        android.widget.TextView textView3 = this.K;
        if (textView3 != null) {
            textView3.setOnClickListener(this);
        }
        android.widget.TextView textView4 = this.L;
        if (textView4 != null) {
            textView4.setOnClickListener(this);
        }
        android.widget.CheckBox checkBox = this.Q;
        if (checkBox != null) {
            checkBox.setOnClickListener(this);
        }
        android.widget.TextView textView5 = this.R;
        if (textView5 != null) {
            textView5.setOnClickListener(this);
        }
        in2.q0 q0Var = this.S;
        q0Var.f374415h = new in2.r0(this, q0Var);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.M;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.mo7960x6cab2c8d(q0Var);
        }
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this.f199716e));
        }
        if (e0()) {
            return;
        }
        this.T.d(c22849x81a93d25);
    }

    public final boolean e0() {
        return ((mm2.c1) this.H.a(mm2.c1.class)).a8();
    }

    public final void f0(boolean z17) {
        if (z17) {
            android.widget.TextView textView = this.R;
            if (textView != null) {
                textView.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
                return;
            }
            return;
        }
        android.widget.TextView textView2 = this.R;
        if (textView2 != null) {
            textView2.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongEditWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        sf2.x xVar = this.I;
        gk2.e eVar = this.H;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.mxa) {
            xVar.r7();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(this, false, 1, null);
            te2.d4 d4Var = te2.d4.f499481a;
            boolean a86 = ((mm2.c1) eVar.a(mm2.c1.class)).a8();
            ml2.u2[] u2VarArr = ml2.u2.f409642d;
            d4Var.a(a86, 10, "0", "");
        } else {
            in2.q0 q0Var = this.S;
            if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.mxe) {
                gn2.a aVar = xVar.f488880p;
                if (aVar != null) {
                    aVar.c(false);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(this, false, 1, null);
                q0Var.getClass();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = q0Var.f374413f.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((dk2.yg) it.next()).f315926a);
                }
                long j17 = ((mm2.e1) eVar.a(mm2.e1.class)).f410516m;
                long m75942xfb822ef2 = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
                java.lang.String userName = ((mm2.c1) eVar.a(mm2.c1.class)).f410385o;
                in2.u0 u0Var = new in2.u0(this);
                java.lang.Object context = this.f199716e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
                pq5.g l17 = new ek2.b3(arrayList2, java.lang.System.currentTimeMillis(), j17, m75942xfb822ef2, userName, null, 32, null).l();
                l17.K(new xl2.b(u0Var));
                if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                    l17.f((im5.b) context);
                }
            } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.mxb) {
                android.widget.CheckBox checkBox = this.Q;
                if (checkBox != null && checkBox.isChecked()) {
                    java.util.Iterator it6 = q0Var.f374413f.iterator();
                    while (it6.hasNext()) {
                        ((dk2.yg) it6.next()).f315929d = true;
                    }
                    f0(true);
                } else {
                    java.util.Iterator it7 = q0Var.f374413f.iterator();
                    while (it7.hasNext()) {
                        ((dk2.yg) it7.next()).f315929d = false;
                    }
                    f0(false);
                }
                q0Var.m8146xced61ae5();
            } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.mxd) {
                java.lang.String str = q0Var.f374412e;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.ArrayList arrayList4 = q0Var.f374413f;
                try {
                    try {
                        java.util.Iterator it8 = arrayList4.iterator();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it8, "iterator(...)");
                        boolean z17 = false;
                        while (it8.hasNext()) {
                            java.lang.Object next = it8.next();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
                            dk2.yg ygVar = (dk2.yg) next;
                            if (ygVar.f315929d) {
                                it8.remove();
                                arrayList3.add(ygVar);
                                java.lang.String str2 = ygVar.f315926a;
                                dk2.yg ygVar2 = q0Var.f374414g;
                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, ygVar2 != null ? ygVar2.f315926a : null)) {
                                    z17 = true;
                                }
                            }
                        }
                        if (z17) {
                            q0Var.f374414g = null;
                        }
                        arrayList4.removeAll(arrayList3);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "curPlayItem:" + q0Var.f374414g);
                        q0Var.x(arrayList4, "deletesongItems");
                    } catch (java.lang.Exception e17) {
                        hc2.c.a(e17, str + ",deletesongItems:");
                    }
                } catch (java.lang.Throwable unused) {
                }
                q0Var.m8146xced61ae5();
                f0(false);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongEditWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void r() {
        android.widget.CheckBox checkBox = this.Q;
        if (checkBox != null) {
            checkBox.setChecked(false);
        }
        f0(false);
        if (e0()) {
            android.widget.FrameLayout frameLayout = this.N;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
        } else {
            android.widget.FrameLayout frameLayout2 = this.N;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        gk2.e eVar = this.H;
        java.util.Iterator it = ((mm2.m6) eVar.a(mm2.m6.class)).f410774f.f315586b.iterator();
        while (it.hasNext()) {
            ((dk2.yg) it.next()).f315929d = false;
        }
        java.util.List a17 = ((mm2.m6) eVar.a(mm2.m6.class)).f410774f.a();
        dk2.yg c17 = ((mm2.m6) eVar.a(mm2.m6.class)).f410774f.c();
        in2.q0 q0Var = this.S;
        q0Var.getClass();
        java.util.ArrayList arrayList = q0Var.f374413f;
        arrayList.clear();
        arrayList.addAll(a17);
        q0Var.f374414g = c17;
        q0Var.m8146xced61ae5();
    }
}
