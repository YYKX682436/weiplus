package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes9.dex */
public final class e2 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f198589d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f198590e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f198591f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 f198592g;

    /* renamed from: h, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f198593h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f198594i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f198595m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.EditText f198596n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f198597o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f198598p;

    /* renamed from: q, reason: collision with root package name */
    public db2.m5 f198599q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f198600r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f198601s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f198602t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.ArrayList f198603u;

    /* renamed from: v, reason: collision with root package name */
    public final bm2.f f198604v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.s1 f198605w;

    /* renamed from: x, reason: collision with root package name */
    public yz5.l f198606x;

    public e2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f198589d = activity;
        this.f198600r = "";
        this.f198601s = "";
        this.f198603u = new java.util.ArrayList();
        this.f198604v = new bm2.f();
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.e2 e2Var, boolean z17) {
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.s1 s1Var = e2Var.f198605w;
            if (s1Var != null) {
                android.widget.LinearLayout linearLayout = s1Var.f198909h;
                if (linearLayout == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("container");
                    throw null;
                }
                linearLayout.setVisibility(8);
            }
            android.view.View view = e2Var.f198594i;
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC", "configRecentPlayContainer", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC", "configRecentPlayContainer", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.s1 s1Var2 = e2Var.f198605w;
        if (s1Var2 != null && s1Var2.f198914p.mo1894x7e414b06() > 0) {
            android.widget.LinearLayout linearLayout2 = s1Var2.f198909h;
            if (linearLayout2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("container");
                throw null;
            }
            linearLayout2.setVisibility(0);
        }
        android.view.View view2 = e2Var.f198594i;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC", "configRecentPlayContainer", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC", "configRecentPlayContainer", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = e2Var.f198597o;
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }

    public final void b(cm2.k gameSearchItem, boolean z17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gameSearchItem, "gameSearchItem");
        r45.b73 b73Var = (r45.b73) gameSearchItem.f124891d.m75936x14adae67(1);
        if (b73Var == null || (str = b73Var.m75945x2fec8307(0)) == null) {
            str = "";
        }
        ke2.y yVar = new ke2.y(str, 0, false, null, false, null, 60, null);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f198589d;
        yVar.t(activityC0065xcd7aa112, activityC0065xcd7aa112.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9y), 500L);
        pq5.g l17 = yVar.l();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activityC0065xcd7aa112, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        l17.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activityC0065xcd7aa112).K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.t1(this, str));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.s82 s82Var;
        gm0.j1.d().q(4140, this);
        java.util.ArrayList arrayList = this.f198603u;
        int size = arrayList.size();
        if (i17 == 0 && i18 == 0) {
            db2.m5 m5Var = m1Var instanceof db2.m5 ? (db2.m5) m1Var : null;
            if (m5Var != null && (s82Var = m5Var.f309608i) != null) {
                arrayList.addAll(s82Var.m75941xfb821914(1));
                java.lang.String m75945x2fec8307 = s82Var.m75945x2fec8307(3);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                this.f198601s = m75945x2fec8307;
                this.f198602t = s82Var.m75933x41a8a7f2(2);
            }
        }
        int size2 = arrayList.size();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderGameLiveSearchUIC", "originSize:" + size + ", currentSize:" + size2 + ", offset:" + this.f198601s + ", hasNext:" + this.f198602t);
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.d2(this, i17, size, size2));
    }
}
