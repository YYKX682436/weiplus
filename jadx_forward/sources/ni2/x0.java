package ni2;

/* loaded from: classes10.dex */
public final class x0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 implements android.view.View.OnClickListener {
    public final qo0.c H;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l I;

    /* renamed from: J, reason: collision with root package name */
    public final ni2.w2 f419035J;
    public final zh2.c K;
    public final yz5.q L;
    public int M;
    public int N;
    public r45.kf5 P;
    public final jz5.g Q;
    public final ni2.s0 R;
    public final jz5.g S;
    public android.view.View T;
    public android.view.View U;
    public android.view.View V;
    public android.view.View W;
    public android.view.View X;
    public android.widget.TextView Y;
    public android.widget.TextView Z;

    /* renamed from: p0, reason: collision with root package name */
    public android.view.View f419036p0;

    /* renamed from: x0, reason: collision with root package name */
    public android.view.View f419037x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(android.content.Context context, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l pluginLayout, ni2.w2 service, zh2.c cVar, yz5.q settingInvoke) {
        super(context, false, null, 0.6f, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(settingInvoke, "settingInvoke");
        this.H = statusMonitor;
        this.I = pluginLayout;
        this.f419035J = service;
        this.K = cVar;
        this.L = settingInvoke;
        this.Q = jz5.h.b(new ni2.r0(context, this));
        this.R = new ni2.s0(this, context);
        this.S = jz5.h.b(new ni2.v0(context, this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.drz;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public java.lang.String L() {
        java.lang.String string = this.f199716e.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mlh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.pzc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.T = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.rzp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.V = findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.p314xaae8f345.mm.R.id.rzr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.X = findViewById3;
        android.view.View findViewById4 = rootView.findViewById(com.p314xaae8f345.mm.R.id.rxs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.Y = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = rootView.findViewById(com.p314xaae8f345.mm.R.id.rxt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.Z = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = rootView.findViewById(com.p314xaae8f345.mm.R.id.bzi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f419036p0 = findViewById6;
        android.view.View findViewById7 = rootView.findViewById(com.p314xaae8f345.mm.R.id.s59);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.U = findViewById7;
        android.view.View findViewById8 = rootView.findViewById(com.p314xaae8f345.mm.R.id.s5a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.W = findViewById8;
        android.view.View findViewById9 = rootView.findViewById(com.p314xaae8f345.mm.R.id.s4a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        this.f419037x0 = findViewById9;
        android.view.View view = this.T;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("normalModeLayout");
            throw null;
        }
        view.setOnClickListener(this);
        android.view.View view2 = this.V;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("payModeLayout");
            throw null;
        }
        view2.setOnClickListener(this);
        android.view.View view3 = this.f419036p0;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("closeLayout");
            throw null;
        }
        view3.setOnClickListener(this);
        android.widget.TextView textView = this.Y;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("payModSettingText");
            throw null;
        }
        textView.setOnClickListener(this);
        f0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void U() {
        r45.kf5 kf5Var;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        ni2.w2 w2Var = this.f419035J;
        df2.d3 d3Var = (df2.d3) w2Var;
        jSONObject.put("element", ((mm2.c1) d3Var.a().a(mm2.c1.class)).a8() ? 12 : 9);
        int i17 = 1;
        jSONObject.put("sub_element", 1);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        android.view.View view = this.U;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("normalSelectIcon");
            throw null;
        }
        if (view.getVisibility() != 0) {
            android.view.View view2 = this.W;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("payModeSelectIcon");
                throw null;
            }
            if (view2.getVisibility() == 0) {
                i17 = 2;
            } else {
                android.view.View view3 = this.f419037x0;
                if (view3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("closeSelectIcon");
                    throw null;
                }
                view3.getVisibility();
                i17 = 0;
            }
        }
        jSONObject2.put("lianmai_mode", i17);
        android.view.View view4 = this.W;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("payModeSelectIcon");
            throw null;
        }
        if (view4.getVisibility() == 0 && (kf5Var = this.P) != null) {
            jSONObject2.put("pay_lianmai_duration", kf5Var.f460189d);
            jSONObject2.put("pay_lianmai_close_type", kf5Var.f460190e);
            jSONObject2.put("pay_lianmai_price", kf5Var.f460191f);
            jSONObject2.put("pay_lianmai_is_allow_markup", kf5Var.f460192g ? 1 : 0);
            jSONObject2.put("pay_lianmai_markup_price", kf5Var.f460193h);
            jSONObject2.put("pay_lianmai_is_prominent", kf5Var.f460195m ? 1 : 0);
        }
        jSONObject.put("extra", jSONObject2.toString());
        if (((mm2.c1) d3Var.a().a(mm2.c1.class)).a8()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.D1, jSONObject.toString(), null, 4, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c18;
            ml2.c1 c1Var = ml2.c1.f408858e;
            zy2.zb.j5(zbVar, 37L, jSONObject.toString(), null, 4, null);
        }
        int i18 = this.M;
        r45.kf5 kf5Var2 = this.P;
        ni2.t0 t0Var = new ni2.t0(this);
        df2.d3 d3Var2 = (df2.d3) w2Var;
        d3Var2.getClass();
        boolean z17 = d3Var2.f311470b;
        df2.g3 g3Var = d3Var2.f311469a;
        ((mm2.o4) g3Var.m56788xbba4bfc0(mm2.o4.class)).U.f458665g = kf5Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(g3Var, null, null, new df2.f3(g3Var, i18, z17, t0Var, null), 3, null);
    }

    public final void f0() {
        int i17 = this.M;
        java.util.regex.Pattern pattern = pm0.v.f438335a;
        this.M = i17 & (-65) & (-16777217);
        android.view.View view = this.U;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("normalSelectIcon");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicSettingModePanel", "changeToClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicSettingModePanel", "changeToClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.W;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("payModeSelectIcon");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicSettingModePanel", "changeToClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicSettingModePanel", "changeToClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f419037x0;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("closeSelectIcon");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicSettingModePanel", "changeToClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicSettingModePanel", "changeToClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.X;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("payModSettingLayout");
            throw null;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicSettingModePanel", "changeToClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicSettingModePanel", "changeToClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void g0() {
        int i17 = this.M;
        java.util.regex.Pattern pattern = pm0.v.f438335a;
        this.M = (i17 | 64) & (-16777217);
        android.view.View view = this.X;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("payModSettingLayout");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicSettingModePanel", "changeToNormalLinkMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicSettingModePanel", "changeToNormalLinkMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.U;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("normalSelectIcon");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicSettingModePanel", "changeToNormalLinkMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicSettingModePanel", "changeToNormalLinkMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.W;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("payModeSelectIcon");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(4);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicSettingModePanel", "changeToNormalLinkMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicSettingModePanel", "changeToNormalLinkMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.f419037x0;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("closeSelectIcon");
            throw null;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(4);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicSettingModePanel", "changeToNormalLinkMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicSettingModePanel", "changeToNormalLinkMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void h0() {
        int i17 = this.M;
        java.util.regex.Pattern pattern = pm0.v.f438335a;
        this.M = i17 | 64 | com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb;
        android.view.View view = this.U;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("normalSelectIcon");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicSettingModePanel", "changeToPayMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicSettingModePanel", "changeToPayMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.W;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("payModeSelectIcon");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicSettingModePanel", "changeToPayMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicSettingModePanel", "changeToPayMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f419037x0;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("closeSelectIcon");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(4);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicSettingModePanel", "changeToPayMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicSettingModePanel", "changeToPayMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.X;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("payModSettingLayout");
            throw null;
        }
        int i18 = this.P == null ? 8 : 0;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicSettingModePanel", "changeToPayMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicSettingModePanel", "changeToPayMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r45.kf5 kf5Var = this.P;
        if (kf5Var != null) {
            android.widget.TextView textView = this.Z;
            if (textView != null) {
                textView.setText(this.f199716e.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mmw, java.lang.Integer.valueOf(kf5Var.f460191f), java.lang.Integer.valueOf(kf5Var.f460189d)));
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("paySettingText");
                throw null;
            }
        }
    }

    public final void i0() {
        android.view.View G = G();
        if (G == null) {
            return;
        }
        G.setEnabled(this.N != this.M);
    }

    public final void j0() {
        jz5.f0 f0Var;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.util.LinkedList linkedList;
        xh2.a aVar;
        java.util.LinkedList m75941xfb821914;
        java.lang.Object obj4;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(this, false, 1, null);
        pi2.q0 q0Var = (pi2.q0) ((jz5.n) this.S).mo141623x754a37bb();
        r45.kf5 kf5Var = ((mm2.o4) ((df2.d3) this.f419035J).a().a(mm2.o4.class)).U.f458665g;
        q0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(q0Var, null, false, 0, 7, null);
        if (kf5Var != null) {
            int i17 = kf5Var.f460189d;
            java.lang.String string = q0Var.f199716e.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lzf, java.lang.Integer.valueOf(kf5Var.f460189d));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            q0Var.j0(i17, string);
            r45.p52 p52Var = ((mm2.g5) q0Var.H.a(mm2.g5.class)).f410623g;
            if (p52Var != null && (m75941xfb821914 = p52Var.m75941xfb821914(1)) != null) {
                synchronized (m75941xfb821914) {
                    java.util.Iterator it = m75941xfb821914.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj4 = null;
                            break;
                        } else {
                            obj4 = it.next();
                            if (((r45.jf5) obj4).m75939xb282bd08(0) == kf5Var.f460190e) {
                                break;
                            }
                        }
                    }
                }
                r45.jf5 jf5Var = (r45.jf5) obj4;
                if (jf5Var != null) {
                    java.lang.String m75945x2fec8307 = jf5Var.m75945x2fec8307(1);
                    if (m75945x2fec8307 == null) {
                        m75945x2fec8307 = "";
                    }
                    q0Var.g0(jf5Var, m75945x2fec8307);
                }
            }
            int i18 = kf5Var.f460191f;
            q0Var.h0(i18, java.lang.String.valueOf(i18));
            int i19 = kf5Var.f460193h;
            q0Var.i0(i19, java.lang.String.valueOf(i19));
            fg2.m1 m1Var = q0Var.X;
            if (m1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            m1Var.f343676e.m81392x52cfa5c6(kf5Var.f460192g);
            fg2.m1 m1Var2 = q0Var.X;
            if (m1Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            m1Var2.f343689r.setVisibility(kf5Var.f460192g ? 0 : 8);
            boolean z17 = kf5Var.f460195m;
            xh2.c cVar = (xh2.c) ((mm2.o4) q0Var.I.g().a(mm2.o4.class)).A.mo3195x754a37bb();
            q0Var.f0(z17, (cVar == null || (linkedList = cVar.f536064a) == null || (aVar = (xh2.a) kz5.n0.Z(linkedList)) == null) ? "" : aVar.b());
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            fg2.m1 m1Var3 = q0Var.X;
            if (m1Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            m1Var3.f343676e.m81392x52cfa5c6(false);
            fg2.m1 m1Var4 = q0Var.X;
            if (m1Var4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            m1Var4.f343689r.setVisibility(8);
            r45.p52 p52Var2 = ((mm2.g5) q0Var.H.a(mm2.g5.class)).f410623g;
            if (p52Var2 != null) {
                java.util.LinkedList m75941xfb8219142 = p52Var2.m75941xfb821914(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getMic_duration_list(...)");
                java.util.Iterator it6 = m75941xfb8219142.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it6.next();
                    java.lang.Integer num = (java.lang.Integer) obj;
                    if (num != null && num.intValue() == 10) {
                        break;
                    }
                }
                java.lang.Integer num2 = (java.lang.Integer) obj;
                if (num2 == null) {
                    java.util.LinkedList m75941xfb8219143 = p52Var2.m75941xfb821914(0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219143, "getMic_duration_list(...)");
                    num2 = (java.lang.Integer) kz5.n0.Z(m75941xfb8219143);
                }
                if (num2 != null) {
                    int intValue = num2.intValue();
                    java.lang.String string2 = q0Var.f199716e.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lzf, java.lang.Integer.valueOf(intValue));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                    q0Var.j0(intValue, string2);
                }
                java.util.LinkedList m75941xfb8219144 = p52Var2.m75941xfb821914(2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219144, "getPurchase_mic_price_list(...)");
                java.util.Iterator it7 = m75941xfb8219144.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it7.next();
                    java.lang.Integer num3 = (java.lang.Integer) obj2;
                    if (num3 != null && num3.intValue() == 20) {
                        break;
                    }
                }
                java.lang.Integer num4 = (java.lang.Integer) obj2;
                if (num4 == null) {
                    java.util.LinkedList m75941xfb8219145 = p52Var2.m75941xfb821914(2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219145, "getPurchase_mic_price_list(...)");
                    num4 = (java.lang.Integer) kz5.n0.Z(m75941xfb8219145);
                }
                if (num4 != null) {
                    int intValue2 = num4.intValue();
                    q0Var.h0(intValue2, java.lang.String.valueOf(intValue2));
                }
                java.util.LinkedList m75941xfb8219146 = p52Var2.m75941xfb821914(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219146, "getMic_break_list(...)");
                java.util.Iterator it8 = m75941xfb8219146.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        obj3 = null;
                        break;
                    } else {
                        obj3 = it8.next();
                        if (((r45.jf5) obj3).m75939xb282bd08(0) == 2) {
                            break;
                        }
                    }
                }
                r45.jf5 jf5Var2 = (r45.jf5) obj3;
                if (jf5Var2 != null) {
                    java.lang.String m75945x2fec83072 = jf5Var2.m75945x2fec8307(1);
                    if (m75945x2fec83072 == null) {
                        m75945x2fec83072 = "";
                    }
                    q0Var.g0(jf5Var2, m75945x2fec83072);
                }
            }
        }
        q0Var.e0();
        if (((mm2.g5) q0Var.H.a(mm2.g5.class)).f410622f == 0.0d) {
            fg2.m1 m1Var5 = q0Var.X;
            if (m1Var5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            m1Var5.f343675d.setVisibility(0);
            fg2.m1 m1Var6 = q0Var.X;
            if (m1Var6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            m1Var6.f343691t.setVisibility(8);
        } else {
            fg2.m1 m1Var7 = q0Var.X;
            if (m1Var7 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            m1Var7.f343675d.setVisibility(8);
            fg2.m1 m1Var8 = q0Var.X;
            if (m1Var8 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            m1Var8.f343691t.setVisibility(0);
        }
        android.view.View G = q0Var.G();
        if (G == null) {
            return;
        }
        int i27 = ((mm2.g5) q0Var.H.a(mm2.g5.class)).f410624h != null ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i27));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(G, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pay/panel/FinderLivePayMicSettingPanel", "openPanel", "(Lcom/tencent/mm/protocal/protobuf/PurchaseMicSetting;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        G.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(G, "com/tencent/mm/plugin/finder/live/mic/pay/panel/FinderLivePayMicSettingPanel", "openPanel", "(Lcom/tencent/mm/protocal/protobuf/PurchaseMicSetting;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0126  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r13) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ni2.x0.onClick(android.view.View):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public android.view.View u() {
        return y();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public android.view.View v() {
        return x();
    }
}
