package in2;

/* loaded from: classes10.dex */
public final class n0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 implements android.view.View.OnClickListener {
    public final gk2.e H;
    public final sf2.x I;

    /* renamed from: J, reason: collision with root package name */
    public final java.lang.String f374397J;
    public android.widget.TextView K;
    public android.widget.TextView L;
    public android.widget.TextView M;
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 N;
    public final in2.f0 P;
    public int Q;
    public int R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(android.content.Context context, gk2.e liveData, sf2.x controller) {
        super(context, false, null, 0.75f, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        this.H = liveData;
        this.I = controller;
        this.f374397J = "FinderLiveAnchorSingSongAddWidget";
        this.P = new in2.f0(context, liveData);
        this.Q = -1;
        this.R = -1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570382an3;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int D() {
        return 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        this.K = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.f568465mx3);
        this.L = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.f568466mx4);
        this.M = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.mx7);
        this.N = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) rootView.findViewById(com.p314xaae8f345.mm.R.id.mx6);
        android.widget.TextView textView = this.M;
        if (textView != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView);
        }
        android.widget.TextView textView2 = this.M;
        if (textView2 != null) {
            textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.oji);
        }
        android.widget.TextView textView3 = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.f568470qa5);
        if (textView3 != null) {
            textView3.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ojf);
        }
        android.widget.TextView textView4 = this.K;
        if (textView4 != null) {
            textView4.setOnClickListener(this);
        }
        android.widget.TextView textView5 = this.L;
        if (textView5 != null) {
            textView5.setOnClickListener(this);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.N;
        if (c22849x81a93d25 != null) {
            in2.f0 f0Var = this.P;
            c22849x81a93d25.mo7960x6cab2c8d(f0Var);
            c22849x81a93d25.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c22849x81a93d25.getContext()));
            f0Var.f374362n = new in2.g0(this, c22849x81a93d25);
            f0Var.f374363o = new in2.h0(c22849x81a93d25, this);
            f0Var.getClass();
            f0Var.f374364p = new in2.i0(c22849x81a93d25);
        }
    }

    public final void e0(int i17) {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25;
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator translationY;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator animate2;
        android.view.ViewPropertyAnimator translationY2;
        android.view.ViewPropertyAnimator duration2;
        if (i17 < 1800 && i17 != 0) {
            this.R = i17;
        }
        if (i17 == 0) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = this.N;
            if (c22849x81a93d252 == null || (animate2 = c22849x81a93d252.animate()) == null || (translationY2 = animate2.translationY(0.0f)) == null || (duration2 = translationY2.setDuration(90L)) == null) {
                return;
            }
            duration2.start();
            return;
        }
        int b17 = (this.Q - this.R) - i65.a.b(this.f199716e, 40);
        if (b17 < 0 && (c22849x81a93d25 = this.N) != null && (animate = c22849x81a93d25.animate()) != null && (translationY = animate.translationY(b17)) != null && (duration = translationY.setDuration(90L)) != null) {
            duration.start();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f374397J, "moveRv: " + this.Q + " - " + this.R + " = " + (this.Q - this.R));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongAddWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.f568465mx3) {
            this.I.r7();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(this, false, 1, null);
            java.lang.Object systemService = this.f199716e.getSystemService("input_method");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(H().getWindowToken(), 0);
            te2.d4 d4Var = te2.d4.f499481a;
            boolean a86 = ((mm2.c1) this.H.a(mm2.c1.class)).a8();
            ml2.u2[] u2VarArr = ml2.u2.f409642d;
            d4Var.a(a86, 10, "0", "");
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.f568466mx4) {
            in2.m0 m0Var = new in2.m0(this, view);
            in2.f0 f0Var = this.P;
            f0Var.f374370v = m0Var;
            f0Var.m8148xed6e4d18(f0Var.f374365q, java.lang.Boolean.TRUE);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongAddWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void r() {
        int i17;
        gk2.e eVar = this.H;
        java.util.Iterator it = ((mm2.m6) eVar.a(mm2.m6.class)).f410774f.f315586b.iterator();
        while (it.hasNext()) {
            ((dk2.yg) it.next()).f315929d = false;
        }
        java.util.List a17 = ((mm2.m6) eVar.a(mm2.m6.class)).f410774f.a();
        in2.f0 f0Var = this.P;
        f0Var.getClass();
        f0Var.f374365q = -1;
        f0Var.f374366r = true;
        java.util.ArrayList arrayList = f0Var.f374359h;
        arrayList.clear();
        java.util.Iterator it6 = ((java.util.ArrayList) a17).iterator();
        while (it6.hasNext()) {
            dk2.yg ygVar = (dk2.yg) it6.next();
            java.lang.String songName = ygVar.f315926a;
            long j17 = ygVar.f315927b;
            int i18 = ygVar.f315928c;
            boolean z17 = ygVar.f315929d;
            boolean z18 = ygVar.f315930e;
            boolean z19 = ygVar.f315931f;
            boolean z27 = ygVar.f315932g;
            java.lang.String str = ygVar.f315933h;
            int i19 = ygVar.f315934i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songName, "songName");
            arrayList.add(new dk2.yg(songName, j17, i18, z17, z18, z19, z27, str, i19));
        }
        int size = arrayList.size();
        int i27 = f0Var.f374360i;
        if (size < i27) {
            arrayList.add(new dk2.yg("", 0L, 3, false, false, false, false, null, 0, 504, null));
        }
        if (arrayList.size() < i27) {
            arrayList.add(new dk2.yg("", 0L, 1, false, false, false, false, null, 0, 504, null));
            i17 = 1;
        } else {
            i17 = 0;
        }
        yz5.l lVar = f0Var.f374364p;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Integer.valueOf(arrayList.size() - 1));
        }
        f0Var.m8146xced61ae5();
        yz5.l lVar2 = f0Var.f374362n;
        if (lVar2 != null) {
            lVar2.mo146xb9724478(java.lang.Integer.valueOf(arrayList.size() - i17));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void s(boolean z17) {
        super.s(z17);
        java.lang.Object systemService = this.f199716e.getSystemService("input_method");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(H().getWindowToken(), 0);
    }
}
