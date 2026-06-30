package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class v6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {
    public long A;
    public boolean B;
    public boolean C;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f196200p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.ImageView f196201q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f196202r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f196203s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f196204t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f196205u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f196206v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View f196207w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.View f196208x;

    /* renamed from: y, reason: collision with root package name */
    public final android.view.View f196209y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f196210z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f196200p = "FinderLiveAnchorLikePlugin";
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.ejv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f196201q = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.ejx);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f196202r = (android.widget.TextView) findViewById2;
        this.f196203s = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) root.findViewById(com.p314xaae8f345.mm.R.id.f6h);
        this.f196204t = root.findViewById(com.p314xaae8f345.mm.R.id.eja);
        this.f196205u = root.findViewById(com.p314xaae8f345.mm.R.id.ejc);
        this.f196206v = root.findViewById(com.p314xaae8f345.mm.R.id.ejb);
        this.f196207w = root.findViewById(com.p314xaae8f345.mm.R.id.en8);
        this.f196208x = root.findViewById(com.p314xaae8f345.mm.R.id.en7);
        this.f196209y = root.findViewById(com.p314xaae8f345.mm.R.id.f566092en5);
        this.f196210z = ((mm2.c1) P0(mm2.c1.class)).E3.f411003c;
        w1();
    }

    public static final void t1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v6 v6Var, mm2.i0 i0Var) {
        v6Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(v6Var.f196200p, "updateCheerInfos " + i0Var);
        if (i0Var != null) {
            ((mm2.c1) v6Var.P0(mm2.c1.class)).P9(i0Var.f410664a, i0Var.f410665b, i0Var.f410666c);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow owVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow) v6Var.X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow.class);
            if (owVar != null) {
                owVar.I1(((mm2.c1) v6Var.P0(mm2.c1.class)).E3.f411002b);
            }
            v6Var.u1(((mm2.c1) v6Var.P0(mm2.c1.class)).E3.f411003c);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void K0(int i17) {
        if (!zl2.r4.f555483a.w1() && !((mm2.c1) P0(mm2.c1.class)).T) {
            if (!(((mm2.n0) P0(mm2.n0.class)).f410806r)) {
                super.K0(8);
                return;
            }
        }
        super.K0(i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        super.M0(status, bundle);
        int ordinal = status.ordinal();
        if (ordinal == 7) {
            ((mm2.l0) P0(mm2.l0.class)).f410747p.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.q6(this));
            return;
        }
        android.view.ViewGroup viewGroup = this.f446856d;
        if (ordinal == 123) {
            if (((mm2.c1) P0(mm2.c1.class)).F && !pm0.v.z((int) ((mm2.c1) P0(mm2.c1.class)).f410399q, 512)) {
            }
            if (!((mm2.c1) P0(mm2.c1.class)).F || pm0.v.z((int) ((mm2.c1) P0(mm2.c1.class)).f410399q, 512) || !((mm2.c1) P0(mm2.c1.class)).a8()) {
                K0(8);
                return;
            } else {
                if (viewGroup.getVisibility() != 0) {
                    K0(0);
                    return;
                }
                return;
            }
        }
        if (ordinal != 154) {
            if (ordinal != 206) {
                return;
            }
            if ((bundle == null || bundle.getBoolean("PARAM_FINDER_LIVE_LIKE_ENABLE", true)) ? false : true) {
                K0(8);
                return;
            } else {
                K0(0);
                return;
            }
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.A;
        java.lang.String str = this.f196200p;
        if (currentTimeMillis <= com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
            if (zl2.q4.f555466a.E()) {
                db5.t7.m123883x26a183b(viewGroup.getContext(), "applaud time interval limit, return", 0).show();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "applaud time interval limit, return");
            return;
        }
        if (this.B || this.C) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "in applaud mode ,return");
            return;
        }
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.f85386q4).mo141623x754a37bb()).r()).booleanValue() || !gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_HAS_SHOWN_APPLAUD_TIPS_BOOLEAN_SYNC, false)) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_HAS_SHOWN_APPLAUD_TIPS_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            android.view.View view = this.f196207w;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin", "showApplaudTip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin", "showApplaudTip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.n6 n6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.n6(this);
            android.view.View view2 = this.f196209y;
            view2.setOnClickListener(n6Var);
            view2.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o6(this));
            this.f196208x.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p6(this));
        }
        ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
        j0Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("sub_action", 1);
        zy2.zb.y6(j0Var, ml2.z4.S, jSONObject.toString(), null, 4, null);
        this.C = true;
        android.view.View view3 = this.f196204t;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin", "likeIconChangeToApplaud", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin", "likeIconChangeToApplaud", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f196201q.setVisibility(4);
        android.view.View view4 = this.f196205u;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin", "likeIconChangeToApplaud", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin", "likeIconChangeToApplaud", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f196202r.setVisibility(8);
        android.view.View view5 = this.f196204t;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view5, "scaleX", 1.0f, 1.5f, 1.0f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ofFloat, "ofFloat(...)");
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view5, "scaleY", 1.0f, 1.5f, 1.0f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ofFloat2, "ofFloat(...)");
        ofFloat.setDuration(300L);
        ofFloat2.setDuration(300L);
        ofFloat.start();
        ofFloat2.start();
        this.f196205u.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.m6(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        this.f196210z = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    public final void u1(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f196200p, "checkCheerIcon, new:" + str + " old:" + this.f196210z);
        if (((mm2.c1) P0(mm2.c1.class)).E3.f411004d == 0) {
            this.f196210z = null;
            w1();
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(this.f196210z, str)) {
                return;
            }
            this.f196210z = str;
            w1();
        }
    }

    public final void v1() {
        if (!zl2.r4.f555483a.w1() && !((mm2.c1) P0(mm2.c1.class)).T) {
            if (!(((mm2.n0) P0(mm2.n0.class)).f410806r)) {
                K0(8);
                return;
            }
        }
        K0(0);
    }

    public final void w1() {
        java.lang.String str = "updateCheerIcon:" + this.f196210z;
        java.lang.String str2 = this.f196200p;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        if (this.B || this.C) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "applaud mode ,return");
            return;
        }
        java.lang.String str3 = this.f196210z;
        if (str3 == null || str3.length() == 0) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.t6(this));
            return;
        }
        wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.q3(this.f196210z, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.s6 s6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.s6(this);
        a17.getClass();
        a17.f529406d = s6Var;
        a17.f();
    }
}
