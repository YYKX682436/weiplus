package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class gj extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.n8 implements android.view.View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public final gk2.e f199980h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f199981i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f199982m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c f199983n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f199984o;

    /* renamed from: p, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f199985p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f199986q;

    /* renamed from: r, reason: collision with root package name */
    public final bm2.g3 f199987r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 f199988s;

    /* renamed from: t, reason: collision with root package name */
    public final yz5.l f199989t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj(android.content.Context context, gk2.e buContext) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        this.f199980h = buContext;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.alp, (android.view.ViewGroup) this, true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f199981i = inflate;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.dsu);
        this.f199982m = findViewById;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c) inflate.findViewById(com.p314xaae8f345.mm.R.id.dsw);
        this.f199983n = c22613xe7040d9c;
        android.widget.TextView textView = (android.widget.TextView) c22613xe7040d9c.findViewById(com.p314xaae8f345.mm.R.id.dsv);
        android.widget.TextView textView2 = (android.widget.TextView) c22613xe7040d9c.findViewById(com.p314xaae8f345.mm.R.id.f565842dt1);
        this.f199984o = textView2;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) c22613xe7040d9c.findViewById(com.p314xaae8f345.mm.R.id.f565843dt2);
        this.f199985p = c1163xf1deaba4;
        bm2.g3 g3Var = new bm2.g3(context);
        this.f199987r = g3Var;
        this.f199989t = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bj(this);
        c22613xe7040d9c.m81307xf9cef5a7(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.cj(this));
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(inflate.getContext()));
        g3Var.f103445h = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dj(this);
        c1163xf1deaba4.mo7960x6cab2c8d(g3Var);
        textView2.setEnabled(false);
        zl2.r4.f555483a.Y2(textView2, false, true);
        findViewById.setOnClickListener(this);
        c22613xe7040d9c.setOnClickListener(this);
        textView.setOnClickListener(this);
        textView2.setOnClickListener(this);
    }

    public final void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var = this.f199988s;
        if (e3Var != null) {
            e3Var.h();
        }
        this.f199988s = null;
        this.f199983n.setTranslationY(0.0f);
    }

    public final void c() {
        ol2.b a17 = ol2.b.f427675c.a(((mm2.u0) this.f199980h.a(mm2.u0.class)).f410981n);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList<ol2.c> arrayList2 = a17.f427676a;
        boolean z17 = false;
        if (arrayList2 != null) {
            for (ol2.c cVar : arrayList2) {
                java.lang.Integer num = cVar.f427679b;
                if (num != null && num.intValue() == 2) {
                    java.lang.String str = cVar.f427678a;
                    if (!(str == null || str.length() == 0)) {
                        java.lang.String str2 = cVar.f427678a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                        arrayList.add(str2);
                    }
                }
            }
        }
        this.f199986q = !arrayList.isEmpty();
        bm2.g3 g3Var = this.f199987r;
        g3Var.getClass();
        java.util.ArrayList arrayList3 = g3Var.f103441d;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        for (int size = arrayList.size(); size < g3Var.f103442e; size++) {
            arrayList3.add("");
        }
        g3Var.m8146xced61ae5();
        int mo1894x7e414b06 = g3Var.mo1894x7e414b06();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f199985p;
        if (mo1894x7e414b06 <= 0) {
            c1163xf1deaba4.setVisibility(8);
        } else {
            c1163xf1deaba4.setVisibility(0);
            g3Var.m8146xced61ae5();
        }
        android.view.View view = this.f199981i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3(view.getContext());
        zl2.r4 r4Var = zl2.r4.f555483a;
        r4Var.Q2(view);
        e3Var.g(view, new android.widget.FrameLayout.LayoutParams(-1, -1));
        e3Var.b();
        e3Var.i();
        this.f199988s = e3Var;
        if (r4Var.w1()) {
            mm2.c1 c1Var = (mm2.c1) dk2.ef.f314905a.i(mm2.c1.class);
            if (c1Var != null && c1Var.a8()) {
                z17 = true;
            }
            if (z17) {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).yj(ml2.z4.Q, "4", null);
                return;
            }
            ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
            ml2.c1 c1Var2 = ml2.c1.f408858e;
            j0Var.hj(27L, "4", null);
        }
    }

    /* renamed from: getBuContext */
    public final gk2.e m58042xd7793f26() {
        return this.f199980h;
    }

    /* renamed from: getCanSendBtnEnable */
    public final yz5.l m58043x43cbeddd() {
        return this.f199989t;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFastCommentWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.dsu) {
            b();
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.dsv) {
            b();
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.f565842dt1) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = this.f199987r.f103441d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.String str = (java.lang.String) it.next();
                if (str.length() > 0) {
                    arrayList2.add(str);
                }
            }
            r45.hx0 a17 = ek2.r1.f335057u.a(arrayList2);
            gk2.e eVar = this.f199980h;
            if (((mm2.c1) eVar.a(mm2.c1.class)).a8()) {
                pq5.g l17 = new ek2.r1(((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) eVar.a(mm2.e1.class)).f410516m, 1, a17).l();
                l17.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ej(this, jSONObject));
                if (getContext() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                    android.content.Context context = getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                    l17.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context);
                }
            } else {
                jSONObject.put("anchor_status", "1");
                i95.m c17 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                zy2.zb.y6((zy2.zb) c17, ml2.z4.f409924y0, jSONObject.toString(), null, 4, null);
                ((mm2.u0) eVar.a(mm2.u0.class)).f410982o = arrayList2;
                boolean z17 = this.f199986q;
                android.view.View view2 = this.f199981i;
                if (z17) {
                    db5.t7.h(view2.getContext(), view2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572969d32));
                } else {
                    db5.t7.h(view2.getContext(), view2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572968d31));
                }
                b();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFastCommentWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
