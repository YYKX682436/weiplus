package jn2;

/* loaded from: classes10.dex */
public final class m0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 implements android.view.View.OnClickListener {
    public final gk2.e H;
    public final sf2.x I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.TextView f382181J;
    public android.widget.TextView K;
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 L;
    public android.widget.FrameLayout M;
    public android.view.View N;
    public android.widget.CheckBox P;
    public android.widget.TextView Q;
    public final jn2.r0 R;
    public p3325xe03a0797.p3326xc267989b.r2 S;
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.g1 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(android.content.Context context, gk2.e liveData, sf2.x controller) {
        super(context, false, null, 0.75f, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        this.H = liveData;
        this.I = controller;
        this.R = new jn2.r0(context, liveData);
        this.T = new p012xc85e97e9.p103xe821e364.p104xd1075a44.g1(new jn2.j0(this));
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
        this.f382181J = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.mxa);
        this.K = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.mxe);
        this.L = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) rootView.findViewById(com.p314xaae8f345.mm.R.id.mxi);
        this.M = (android.widget.FrameLayout) rootView.findViewById(com.p314xaae8f345.mm.R.id.mxg);
        this.N = rootView.findViewById(com.p314xaae8f345.mm.R.id.emt);
        this.P = (android.widget.CheckBox) rootView.findViewById(com.p314xaae8f345.mm.R.id.mxb);
        this.Q = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.mxd);
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.mxj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.ui.fk.a((android.widget.TextView) findViewById);
        android.widget.TextView textView = this.f382181J;
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        android.widget.TextView textView2 = this.K;
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
        android.widget.CheckBox checkBox = this.P;
        if (checkBox != null) {
            checkBox.setOnClickListener(this);
        }
        android.widget.TextView textView3 = this.Q;
        if (textView3 != null) {
            textView3.setOnClickListener(this);
        }
        jn2.h0 h0Var = new jn2.h0(this);
        jn2.r0 r0Var = this.R;
        r0Var.f382213i = h0Var;
        r0Var.f382214m = new jn2.i0(this);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.L;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.mo7960x6cab2c8d(r0Var);
            c22849x81a93d25.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c22849x81a93d25.getContext()));
            this.T.d(c22849x81a93d25);
        }
    }

    public final void e0(boolean z17) {
        if (z17) {
            android.widget.TextView textView = this.Q;
            if (textView != null) {
                textView.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
                return;
            }
            return;
        }
        android.widget.TextView textView2 = this.Q;
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
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongEditPanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.mxa) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(this, false, 1, null);
        } else {
            te2.a9 a9Var = te2.a9.f499416a;
            sf2.x xVar = this.I;
            jn2.r0 r0Var = this.R;
            if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.mxe) {
                java.util.List list = r0Var.f382210f;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                while (it.hasNext()) {
                    java.lang.String str = ((r45.z22) it.next()).f473162f;
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(arrayList2, r0Var.f382211g)) {
                    java.util.List list2 = r0Var.f382210f;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.util.Iterator it6 = ((java.util.ArrayList) list2).iterator();
                    while (it6.hasNext()) {
                        java.lang.String str2 = ((r45.z22) it6.next()).f473162f;
                        if (str2 != null) {
                            arrayList3.add(str2);
                        }
                    }
                    p3325xe03a0797.p3326xc267989b.y0 y0Var = this.E;
                    if (y0Var != null) {
                        p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new jn2.g0(this, arrayList3, null), 3, null);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorSingSongEditPanel", "No changes detected, close panel directly");
                    te2.a9.f(a9Var, xVar.h7(), 7, null, null, 8, null);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(this, false, 1, null);
                }
            } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.mxb) {
                android.widget.CheckBox checkBox = this.P;
                if (checkBox != null && checkBox.isChecked()) {
                    java.util.Set set = r0Var.f382212h;
                    set.clear();
                    java.util.Iterator it7 = ((java.util.ArrayList) r0Var.f382210f).iterator();
                    while (it7.hasNext()) {
                        java.lang.String str3 = ((r45.z22) it7.next()).f473162f;
                        if (str3 != null) {
                            set.add(str3);
                        }
                    }
                    e0(true);
                } else {
                    r0Var.f382212h.clear();
                    e0(false);
                }
                r0Var.m8146xced61ae5();
            } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.mxd) {
                r0Var.getClass();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                kz5.h0.B(r0Var.f382210f, new jn2.q0(r0Var, arrayList4));
                r0Var.f382212h.clear();
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.util.Iterator it8 = arrayList4.iterator();
                while (it8.hasNext()) {
                    r45.ay1 ay1Var = ((r45.z22) it8.next()).f473164h.f452676d;
                    if (ay1Var != null) {
                        arrayList5.add(ay1Var);
                    }
                }
                te2.a9.f(a9Var, xVar.h7(), 6, arrayList5, null, 8, null);
                if (!arrayList4.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorSingSongEditPanel", "handleDeleteSelected: count=" + arrayList4.size() + " (local only, will submit on confirm)");
                    r0Var.m8146xced61ae5();
                    e0(false);
                    android.widget.CheckBox checkBox2 = this.P;
                    if (checkBox2 != null) {
                        checkBox2.setChecked(false);
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongEditPanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void r() {
        android.widget.CheckBox checkBox = this.P;
        if (checkBox != null) {
            checkBox.setChecked(false);
        }
        e0(false);
        gk2.e eVar = this.H;
        if (((mm2.c1) eVar.a(mm2.c1.class)).a8()) {
            android.widget.FrameLayout frameLayout = this.M;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
        } else {
            android.widget.FrameLayout frameLayout2 = this.M;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        java.util.ArrayList songList = ((mm2.m6) eVar.a(mm2.m6.class)).f410782q.f315618a;
        jn2.r0 r0Var = this.R;
        r0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songList, "songList");
        java.util.List list = r0Var.f382210f;
        list.clear();
        list.addAll(songList);
        r0Var.f382212h.clear();
        java.util.List list2 = r0Var.f382211g;
        list2.clear();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = songList.iterator();
        while (it.hasNext()) {
            java.lang.String str = ((r45.z22) it.next()).f473162f;
            if (str != null) {
                arrayList.add(str);
            }
        }
        list2.addAll(arrayList);
        r0Var.m8146xced61ae5();
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.S;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.E;
        this.S = y0Var != null ? p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new jn2.l0(this, null), 3, null) : null;
    }
}
