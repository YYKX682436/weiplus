package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes10.dex */
public final class mn implements android.view.View.OnClickListener, com.p314xaae8f345.mm.p944x882e457a.u0 {
    public java.lang.String A;
    public java.lang.String B;
    public final java.util.Map C;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f200616d;

    /* renamed from: e, reason: collision with root package name */
    public final qo0.c f200617e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 f200618f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f200619g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f200620h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f200621i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f200622m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.EditText f200623n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f200624o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f200625p;

    /* renamed from: q, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f200626q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.ViewGroup f200627r;

    /* renamed from: s, reason: collision with root package name */
    public final bm2.i4 f200628s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pp f200629t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.HashMap f200630u;

    /* renamed from: v, reason: collision with root package name */
    public int f200631v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.ArrayList f200632w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f200633x;

    /* renamed from: y, reason: collision with root package name */
    public int f200634y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f200635z;

    public mn(android.view.ViewGroup root, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 basePlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f200616d = root;
        this.f200617e = statusMonitor;
        this.f200618f = basePlugin;
        bm2.i4 i4Var = new bm2.i4();
        this.f200628s = i4Var;
        gk2.e S0 = basePlugin.S0();
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.f566215f51);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f200629t = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pp(S0, (android.view.ViewGroup) findViewById, this);
        this.f200630u = new java.util.HashMap();
        this.f200631v = 0;
        this.f200632w = new java.util.ArrayList();
        this.f200633x = "";
        this.A = "";
        this.C = new java.util.LinkedHashMap();
        root.setTranslationX(com.p314xaae8f345.mm.ui.bl.b(root.getContext()).x);
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.f4z);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById2;
        android.view.View findViewById3 = root.findViewById(com.p314xaae8f345.mm.R.id.f58);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f200619g = findViewById3;
        android.view.View findViewById4 = root.findViewById(com.p314xaae8f345.mm.R.id.f57);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f200620h = findViewById4;
        android.view.View findViewById5 = root.findViewById(com.p314xaae8f345.mm.R.id.f566219f55);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById5;
        this.f200621i = textView;
        android.view.View findViewById6 = root.findViewById(com.p314xaae8f345.mm.R.id.f4y);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById6;
        this.f200622m = c22699x3dcdb3522;
        android.view.View findViewById7 = root.findViewById(com.p314xaae8f345.mm.R.id.f59);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        android.view.View findViewById8 = root.findViewById(com.p314xaae8f345.mm.R.id.f566220f56);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        android.widget.EditText editText = (android.widget.EditText) findViewById8;
        this.f200623n = editText;
        android.view.View findViewById9 = root.findViewById(com.p314xaae8f345.mm.R.id.f566214f50);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        this.f200624o = (android.widget.TextView) findViewById9;
        android.view.View findViewById10 = root.findViewById(com.p314xaae8f345.mm.R.id.f566218f54);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        this.f200625p = findViewById10;
        android.view.View findViewById11 = root.findViewById(com.p314xaae8f345.mm.R.id.f5d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById11, "findViewById(...)");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById11;
        this.f200626q = c1163xf1deaba4;
        android.view.View findViewById12 = root.findViewById(com.p314xaae8f345.mm.R.id.f5c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById12, "findViewById(...)");
        this.f200627r = (android.view.ViewGroup) findViewById12;
        android.widget.TextView textView2 = (android.widget.TextView) com.p314xaae8f345.mm.ui.id.b(root.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570760bs5, (android.view.ViewGroup) null).findViewById(com.p314xaae8f345.mm.R.id.ili);
        if (textView2 != null) {
            textView2.setTextColor(root.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560755ta));
        }
        root.getLayoutParams().height = (((com.p314xaae8f345.mm.ui.bl.b(root.getContext()).y * 2) / 3) - com.p314xaae8f345.mm.ui.bl.c(root.getContext())) + com.p314xaae8f345.mm.ui.zk.a(root.getContext(), 80);
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(root.getContext()));
        c1163xf1deaba4.mo7960x6cab2c8d(i4Var);
        c1163xf1deaba4.O(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.an(this));
        i4Var.f103509h = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bn(this);
        editText.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.cn(this));
        editText.setOnEditorActionListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dn(this));
        textView.setOnClickListener(this);
        c22699x3dcdb3522.setOnClickListener(this);
        c22699x3dcdb352.setOnClickListener(this);
        root.setOnClickListener(this);
    }

    public final void a() {
        fj2.s sVar;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.t0(this.f200623n);
        c();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pp ppVar = this.f200629t;
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) ppVar.f200937j;
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            sVar = fj2.s.f344716a;
            if (!hasNext) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            sVar.d(ml2.q2.I, ppVar.f200936i, (hi2.a) entry.getValue());
        }
        linkedHashMap.clear();
        ppVar.f200933f.clear();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = ppVar.f200931d.mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            mo7946xf939df19.m8146xced61ae5();
        }
        java.util.LinkedHashMap linkedHashMap2 = (java.util.LinkedHashMap) this.C;
        for (java.util.Map.Entry entry2 : linkedHashMap2.entrySet()) {
            sVar.d(ml2.q2.f409362p1, this.B, (hi2.a) entry2.getValue());
        }
        linkedHashMap2.clear();
        android.view.ViewGroup viewGroup = this.f200616d;
        float f17 = com.p314xaae8f345.mm.ui.bl.b(viewGroup.getContext()).x;
        viewGroup.animate().translationX(f17).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.en(this, f17)).start();
    }

    public final boolean b() {
        return this.f200616d.getVisibility() == 0;
    }

    public final void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveLinkInviteAnchorWidget", "switchToNormalMode");
        this.f200631v = 0;
        android.view.View view = this.f200625p;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLinkInviteAnchorWidget", "switchToNormalMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLinkInviteAnchorWidget", "switchToNormalMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f200621i.setVisibility(4);
        this.f200622m.setVisibility(8);
        android.view.ViewGroup.LayoutParams layoutParams = this.f200620h.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(((android.view.ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd(), 0);
        ofInt.setDuration(200L);
        ofInt.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gn(this));
        ofInt.start();
        android.widget.EditText editText = this.f200623n;
        editText.setText((java.lang.CharSequence) null);
        java.lang.String str = this.B;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pp ppVar = this.f200629t;
        ppVar.f200936i = str;
        int size = ppVar.f200933f.size();
        android.view.ViewGroup viewGroup = ppVar.f200929b;
        if (size > 0) {
            viewGroup.setVisibility(0);
        } else {
            viewGroup.setVisibility(8);
        }
        this.f200627r.setVisibility(8);
        this.f200624o.setVisibility(8);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.t0(editText);
    }

    public final void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveLinkInviteAnchorWidget", "switchToSearchMode");
        this.f200631v = 1;
        this.f200629t.f200929b.setVisibility(8);
        java.util.ArrayList arrayList = this.f200632w;
        arrayList.clear();
        bm2.i4 i4Var = this.f200628s;
        i4Var.x(arrayList);
        this.f200627r.setVisibility(8);
        android.view.ViewGroup.LayoutParams layoutParams = this.f200620h.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        int marginEnd = ((android.view.ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd();
        android.widget.TextView textView = this.f200621i;
        int measuredWidth = textView.getMeasuredWidth();
        android.view.ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(marginEnd, measuredWidth + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart());
        ofInt.setDuration(200L);
        ofInt.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hn(this));
        ofInt.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.in(this));
        ofInt.start();
        this.f200623n.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.jn(this));
        this.f200626q.mo7960x6cab2c8d(i4Var);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveLinkInviteAnchorWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.f4z) {
            a();
        } else {
            android.widget.EditText editText = this.f200623n;
            if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.f4y) {
                editText.setText("");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                bm2.i4 i4Var = this.f200628s;
                i4Var.x(arrayList2);
                this.f200627r.setVisibility(8);
                i4Var.m8146xced61ae5();
            } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.f566219f55) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.t0(editText);
                c();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLinkInviteAnchorWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof db2.d5) {
            gm0.j1.d().q(3820, this);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveLinkInviteAnchorWidget", "onSceneEnd NetSceneFinderSearch errType:" + i17 + " errCode:" + i18 + " query:" + this.f200633x);
            if (i17 == 0 && i18 == 0) {
                r45.tu2 tu2Var = ((db2.y5) ((db2.d5) m1Var)).f309787r;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveLinkInviteAnchorWidget", "updateSearchData showMode:" + this.f200631v);
                if (this.f200631v == 1) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
                    java.util.ArrayList arrayList = this.f200632w;
                    f0Var.f391649d = arrayList.size();
                    p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
                    f0Var2.f391649d = arrayList.size();
                    arrayList.addAll(tu2Var.m75941xfb821914(1));
                    this.f200634y = tu2Var.m75939xb282bd08(2);
                    tu2Var.m75939xb282bd08(3);
                    this.f200635z = tu2Var.m75934xbce7f2f(5);
                    f0Var2.f391649d = arrayList.size();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveLinkInviteAnchorWidget", "searchContactList size:" + arrayList.size() + " offset:" + tu2Var.m75939xb282bd08(2) + " continueFlag:" + tu2Var.m75939xb282bd08(3) + " lastBuff: " + this.f200635z);
                    pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ln(this, f0Var, f0Var2));
                }
            }
        }
    }
}
