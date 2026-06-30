package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f199914d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f199915e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f199916f;

    /* renamed from: g, reason: collision with root package name */
    public final wd2.g f199917g;

    public g(android.content.Context context, boolean z17, zl2.u4 u4Var, boolean z18, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        boolean z19 = (i17 & 2) != 0 ? true : z17;
        zl2.u4 uiMode = (i17 & 4) != 0 ? zl2.u4.f555521d : u4Var;
        boolean z27 = (i17 & 8) != 0 ? false : z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiMode, "uiMode");
        this.f199914d = context;
        android.view.View b17 = b();
        this.f199915e = b17;
        android.view.View c17 = c();
        this.f199916f = c17;
        wd2.g gVar = new wd2.g(context, z19, uiMode, z27);
        if (b17 != null) {
            gVar.f526375i.addView(b17);
            android.view.View view = gVar.f526373g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/actionsheet/FinderLiveBottomSheet", "setLeftView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/actionsheet/FinderLiveBottomSheet", "setLeftView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (c17 != null) {
            gVar.f526379m.addView(c17);
            gVar.f526380n.setVisibility(8);
        }
        gVar.f526384r = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d(this);
        gVar.f526385s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e(this);
        zl2.u4 u4Var2 = gVar.f526368b;
        android.widget.FrameLayout frameLayout = gVar.f526372f;
        android.view.View m17 = m(frameLayout, u4Var2);
        m17 = m17 == null ? android.view.LayoutInflater.from(gVar.f526367a).inflate(j(), (android.view.ViewGroup) frameLayout, false) : m17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m17);
        p(m17);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = gVar.f526369c;
        y1Var.f293566o = true ^ (this instanceof fh2.c);
        gVar.b(l());
        int n17 = n();
        android.view.View view2 = gVar.f526370d;
        if (n17 == 0) {
            float dimension = view2.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj);
            float dimension2 = view2.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
            float dimension3 = view2.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 c2690x46972046 = y1Var.f293569r;
            if (c2690x46972046 != null) {
                c2690x46972046.f125986z = new wd2.f(gVar, dimension, dimension3, dimension2);
            }
            android.view.View view3 = gVar.f526381o;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/actionsheet/FinderLiveBottomSheet", "setScrollHeaderVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/actionsheet/FinderLiveBottomSheet", "setScrollHeaderVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            gVar.f526371e.setVisibility(8);
        } else {
            android.view.View view4 = gVar.f526381o;
            if (view4 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/actionsheet/FinderLiveBottomSheet", "setScrollHeaderVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/actionsheet/FinderLiveBottomSheet", "setScrollHeaderVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        y1Var.f293577z = r();
        gVar.d(o());
        jz5.l k17 = k();
        gVar.e((java.lang.String) k17.f384366d, (java.lang.String) k17.f384367e);
        frameLayout.addView(m17);
        android.graphics.drawable.Drawable i18 = i();
        if (i18 != null) {
            view2.setBackgroundDrawable(i18);
        }
        this.f199917g = gVar;
        if (b17 != null) {
            b17.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b(this));
        }
        if (c17 != null) {
            c17.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c(this));
        }
    }

    public void a() {
        this.f199917g.f526369c.q();
    }

    public android.view.View b() {
        return null;
    }

    public android.view.View c() {
        return null;
    }

    public final android.view.View d(int i17) {
        return this.f199917g.f526369c.f293558d.findViewById(i17);
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 e() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(this.f199914d);
        c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80007x8e72c9b1);
        c22699x3dcdb352.setRotation(180.0f);
        c22699x3dcdb352.m82040x7541828(c22699x3dcdb352.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        c22699x3dcdb352.setLayoutParams(new android.view.ViewGroup.LayoutParams(i65.a.b(c22699x3dcdb352.getContext(), 12), i65.a.b(c22699x3dcdb352.getContext(), 24)));
        return c22699x3dcdb352;
    }

    public android.widget.TextView f() {
        android.widget.TextView textView = new android.widget.TextView(this.f199914d);
        textView.setTextSize(0, textView.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
        textView.setBackground(textView.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a0s));
        int b17 = i65.a.b(textView.getContext(), 12);
        int b18 = i65.a.b(textView.getContext(), 4);
        textView.setPadding(b17, b18, b17, b18);
        textView.setEnabled(false);
        textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f));
        textView.setText(textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5));
        return textView;
    }

    public android.widget.TextView g() {
        android.widget.TextView textView = new android.widget.TextView(this.f199914d);
        textView.setTextSize(0, textView.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561207cb));
        textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        textView.setText(textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg));
        return textView;
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 h() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(this.f199914d);
        c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79678x41464de0);
        c22699x3dcdb352.m82040x7541828(c22699x3dcdb352.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        c22699x3dcdb352.setLayoutParams(new android.view.ViewGroup.LayoutParams(i65.a.b(c22699x3dcdb352.getContext(), 24), i65.a.b(c22699x3dcdb352.getContext(), 24)));
        return c22699x3dcdb352;
    }

    public android.graphics.drawable.Drawable i() {
        return null;
    }

    public abstract int j();

    public jz5.l k() {
        return new jz5.l("", "");
    }

    public int l() {
        return 0;
    }

    public android.view.View m(android.view.ViewGroup root, zl2.u4 uiMode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiMode, "uiMode");
        return null;
    }

    public int n() {
        return 8;
    }

    public java.lang.String o() {
        return "";
    }

    public abstract void p(android.view.View view);

    public boolean q() {
        return this.f199917g.f526369c.f();
    }

    public boolean r() {
        return this instanceof ni2.w;
    }

    public void s() {
    }

    public void t() {
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).mj(this);
    }

    public void u() {
        a();
    }

    public void v() {
        a();
    }

    public void w() {
        wd2.g gVar = this.f199917g;
        gVar.f(0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseBottomPanelSheet", "start openPanel");
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).oj(this);
        gVar.f526370d.getViewTreeObserver().addOnGlobalLayoutListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.f(this));
    }

    public void x(java.lang.String mainTitle, java.lang.String secondTitle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mainTitle, "mainTitle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(secondTitle, "secondTitle");
        this.f199917g.e(mainTitle, secondTitle);
    }
}
