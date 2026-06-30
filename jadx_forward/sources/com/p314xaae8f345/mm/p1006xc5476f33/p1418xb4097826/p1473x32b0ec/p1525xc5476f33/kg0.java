package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class kg0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l implements android.view.View.OnClickListener {
    public final android.widget.TextView A;
    public final android.widget.TextView B;
    public final wm2.n C;
    public int D;
    public final java.util.Map E;
    public yz5.a F;

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f194763p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f194764q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View f194765r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.LinearLayout f194766s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.RelativeLayout f194767t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.RelativeLayout f194768u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.TextView f194769v;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f194770w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.RelativeLayout f194771x;

    /* renamed from: y, reason: collision with root package name */
    public final android.view.View f194772y;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.View f194773z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg0(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f194763p = statusMonitor;
        this.f194764q = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bg0(root, this));
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.agx);
        this.f194765r = findViewById;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) root.findViewById(com.p314xaae8f345.mm.R.id.eso);
        this.f194766s = linearLayout;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) root.findViewById(com.p314xaae8f345.mm.R.id.eta);
        this.f194767t = relativeLayout;
        android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) root.findViewById(com.p314xaae8f345.mm.R.id.f566119et5);
        this.f194768u = relativeLayout2;
        this.f194769v = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.et7);
        this.f194770w = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) root.findViewById(com.p314xaae8f345.mm.R.id.et6);
        android.widget.RelativeLayout relativeLayout3 = (android.widget.RelativeLayout) root.findViewById(com.p314xaae8f345.mm.R.id.esq);
        this.f194771x = relativeLayout3;
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 beautyPowerfulPanel = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) root.findViewById(com.p314xaae8f345.mm.R.id.tgi);
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.f566108er3);
        this.f194772y = findViewById2;
        this.f194773z = root.findViewById(com.p314xaae8f345.mm.R.id.rmb);
        this.A = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.eto);
        this.B = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.etn);
        this.E = new java.util.LinkedHashMap();
        if (!x0()) {
            int c17 = com.p314xaae8f345.mm.ui.bl.c(root.getContext());
            linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom() + c17);
            beautyPowerfulPanel.setPadding(beautyPowerfulPanel.getPaddingLeft(), beautyPowerfulPanel.getPaddingTop(), beautyPowerfulPanel.getPaddingRight(), beautyPowerfulPanel.getPaddingBottom() + c17);
        }
        linearLayout.setTranslationY(com.p314xaae8f345.mm.ui.bl.b(root.getContext()).y);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(beautyPowerfulPanel, "beautyPowerfulPanel");
        this.C = new wm2.n(beautyPowerfulPanel);
        relativeLayout.setOnClickListener(this);
        relativeLayout2.setOnClickListener(this);
        relativeLayout3.setOnClickListener(this);
        root.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
        findViewById.setOnClickListener(this);
        K0(8);
    }

    public static final void t1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kg0 kg0Var, android.view.View view, ml2.u1 u1Var) {
        kg0Var.getClass();
        if (view.getVisibility() == 0) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.I8((zy2.zb) c17, u1Var, kg0Var.E, null, null, null, null, false, 124, null);
        }
    }

    public static final void u1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kg0 kg0Var, boolean z17) {
        if (z17) {
            kg0Var.getClass();
            qo0.c.a(kg0Var.f194763p, qo0.b.f446927o4, null, 2, null);
            return;
        }
        android.content.Context context = kg0Var.f446856d.getContext();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            pf5.z zVar = pf5.z.f435481a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8 b8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8) zVar.a(abstractActivityC21394xb3d2c0cf).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.d6 d6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.d6.f198568e;
            b8Var.getClass();
            b8Var.f198479q = d6Var;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8) zVar.a(abstractActivityC21394xb3d2c0cf).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8.class)).S6();
        }
    }

    @Override // qo0.a
    public void A0(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046;
        java.lang.String str;
        java.lang.String str2;
        if (i17 != 20010 || intent == null || (c16991x15ced046 = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046) intent.getParcelableExtra("KSEGMENTMEDIAINFO")) == null) {
            return;
        }
        java.lang.Boolean bool = c16991x15ced046.f237197h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bool, "getPhoto(...)");
        if (bool.booleanValue()) {
            str2 = c16991x15ced046.f237195f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getThumbPath(...)");
            str = "";
        } else {
            str = c16991x15ced046.f237194e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getVideoPath(...)");
            str2 = c16991x15ced046.f237195f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getThumbPath(...)");
        }
        r45.ba4 ba4Var = new r45.ba4();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bool, "getPhoto(...)");
        int i19 = 0;
        if (bool.booleanValue()) {
            ba4Var.set(0, str2);
        } else {
            ba4Var.set(0, null);
            r45.gg0 gg0Var = new r45.gg0();
            gg0Var.set(0, str);
            i19 = 1;
            gg0Var.set(1, str2);
            ba4Var.set(1, gg0Var);
        }
        ba4Var.set(2, java.lang.Integer.valueOf(i19));
        zl2.r4 r4Var = zl2.r4.f555483a;
        android.content.Context context = this.f446856d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        r4Var.r3(context, S0(), ba4Var);
    }

    @Override // qo0.a
    public boolean B0() {
        int i17 = this.D;
        if (i17 == 0) {
            return false;
        }
        if (i17 == 1) {
            w1(false);
        } else {
            if (i17 != 3) {
                return false;
            }
            wm2.n nVar = this.C;
            if (((java.util.ArrayList) nVar.f528790g).size() > 1) {
                nVar.f528791h.a();
            } else {
                nVar.a(true, false);
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        super.M0(status, bundle);
        int ordinal = status.ordinal();
        if (ordinal != 138) {
            if (ordinal != 139) {
                return;
            }
            w1(false);
            return;
        }
        boolean z17 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_CAMERA_FROM_KTV", false) : false;
        android.view.View view = this.f194773z;
        android.widget.TextView textView = this.B;
        android.widget.TextView textView2 = this.A;
        if (z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorCameraOptPanelPlugin", "changeUIIfFromKtv", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorCameraOptPanelPlugin", "changeUIIfFromKtv", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.cg0(this));
            android.view.View view2 = this.f194772y;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorCameraOptPanelPlugin", "changeUIIfFromKtv", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorCameraOptPanelPlugin", "changeUIIfFromKtv", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView2.setText(textView2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mj7));
            textView.setText(textView2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mj6));
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorCameraOptPanelPlugin", "changeUIIfFromKtv", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorCameraOptPanelPlugin", "changeUIIfFromKtv", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setOnClickListener(null);
            android.view.View view3 = this.f194772y;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorCameraOptPanelPlugin", "changeUIIfFromKtv", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorCameraOptPanelPlugin", "changeUIIfFromKtv", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView2.setText(textView2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ehm));
            textView.setText(textView2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ehl));
        }
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jg0(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        kn0.f fVar;
        kn0.f fVar2;
        kn0.f fVar3;
        kn0.f fVar4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorCameraOptPanelPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        wm2.n nVar = this.C;
        boolean z17 = false;
        if (valueOf == null || valueOf.intValue() != com.p314xaae8f345.mm.R.id.agx) {
            java.util.Map map = this.E;
            if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.eta) {
                i95.m c17 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                zy2.zb.T8((zy2.zb) c17, ml2.t1.X, map, null, null, null, null, false, 124, null);
                kn0.i iVar = ((mm2.e1) P0(mm2.e1.class)).f410523t;
                kn0.f fVar5 = iVar != null ? iVar.f391093d : null;
                if (fVar5 != null) {
                    kn0.i iVar2 = ((mm2.e1) P0(mm2.e1.class)).f410523t;
                    fVar5.f391063b = !((iVar2 == null || (fVar4 = iVar2.f391093d) == null) ? true : fVar4.f391063b);
                }
                qo0.b bVar = qo0.b.f446935q;
                android.os.Bundle bundle = new android.os.Bundle();
                qo0.c cVar = this.f194763p;
                cVar.mo46557x60d69242(bVar, bundle);
                v1();
                if (cVar.mo11219xd0598cf8() == 1) {
                    ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                    ml2.j0.f409116i.T.f409201o++;
                    int i17 = vn0.b.f519707a.b().f536943a == 0 ? 2 : 1;
                    i95.m c18 = i95.n0.c(ml2.j0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                    zy2.zb.y6((zy2.zb) c18, ml2.z4.f409883f, java.lang.String.valueOf(i17), null, 4, null);
                }
            } else {
                android.view.ViewGroup viewGroup = this.f446856d;
                if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.f566119et5) {
                    i95.m c19 = i95.n0.c(ml2.j0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                    zy2.zb.T8((zy2.zb) c19, ml2.t1.W, map, null, null, null, null, false, 124, null);
                    kn0.i iVar3 = ((mm2.e1) P0(mm2.e1.class)).f410523t;
                    if (((iVar3 == null || (fVar3 = iVar3.f391093d) == null || !fVar3.f391063b) ? false : true) == true) {
                        kn0.i iVar4 = ((mm2.e1) P0(mm2.e1.class)).f410523t;
                        if (iVar4 != null && (fVar2 = iVar4.f391093d) != null && fVar2.f391066e) {
                            z17 = true;
                        }
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f194770w;
                        if (z17) {
                            c22699x3dcdb352.animate().rotationY(180.0f).setDuration(200L).start();
                        } else {
                            c22699x3dcdb352.animate().rotationY(0.0f).setDuration(200L).start();
                        }
                        kn0.i iVar5 = ((mm2.e1) P0(mm2.e1.class)).f410523t;
                        kn0.f fVar6 = iVar5 != null ? iVar5.f391093d : null;
                        if (fVar6 != null) {
                            kn0.i iVar6 = ((mm2.e1) P0(mm2.e1.class)).f410523t;
                            fVar6.f391066e = !((iVar6 == null || (fVar = iVar6.f391093d) == null) ? true : fVar.f391066e);
                        }
                        tn0.w0 w0Var = dk2.ef.f314911d;
                        hn0.f fVar7 = w0Var != null ? w0Var.f502306t : null;
                        if (fVar7 != null) {
                            ((hn0.p) fVar7).j(dk2.ef.f314905a.G());
                        }
                        i95.m c27 = i95.n0.c(ml2.j0.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c27, "getService(...)");
                        zy2.zb.y6((zy2.zb) c27, ml2.z4.f409917w, "", null, 4, null);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveAnchorCameraOptPanelPlugin", "clickMirror while using front camera, skip!");
                        db5.t7.m123883x26a183b(viewGroup.getContext(), viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dwh), 0).show();
                    }
                } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.esq) {
                    if (!((mm2.c1) P0(mm2.c1.class)).N3) {
                        db5.t7.m123883x26a183b(viewGroup.getContext(), viewGroup.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.egp), 0).show();
                    } else if (ko0.l.f391403a.c()) {
                        i95.m c28 = i95.n0.c(ml2.j0.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c28, "getService(...)");
                        zy2.zb.T8((zy2.zb) c28, ml2.t1.V, map, null, null, null, null, false, 124, null);
                        this.D = 3;
                        this.f194766s.animate().translationY(com.p314xaae8f345.mm.ui.bl.b(viewGroup.getContext()).y).setDuration(100L).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eg0(this)).start();
                    } else {
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(viewGroup.getContext());
                        u1Var.g(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mi9));
                        java.lang.String string = viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d3z);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                        u1Var.a(false);
                        u1Var.n(string);
                        u1Var.q(false);
                    }
                } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.etb) {
                    w1(false);
                    if (gm0.j1.u().l()) {
                        zl2.r4 r4Var = zl2.r4.f555483a;
                        android.content.Context context = viewGroup.getContext();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                        r4Var.i1((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, 20010);
                    } else {
                        db5.t7.l(viewGroup.getContext());
                    }
                } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.etf) {
                    if (this.D == 3) {
                        nVar.a(true, false);
                    } else {
                        w1(false);
                    }
                } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.f566108er3) {
                    w1(false);
                }
            }
        } else if (this.D == 3) {
            nVar.a(true, false);
        } else {
            w1(false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorCameraOptPanelPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    public final void v1() {
        kn0.f fVar;
        kn0.i iVar = ((mm2.e1) P0(mm2.e1.class)).f410523t;
        boolean z17 = false;
        if (iVar != null && (fVar = iVar.f391093d) != null && fVar.f391063b) {
            z17 = true;
        }
        android.widget.TextView textView = this.f194769v;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f194770w;
        android.view.ViewGroup viewGroup = this.f446856d;
        if (z17) {
            c22699x3dcdb352.m82040x7541828(viewGroup.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
            textView.setTextColor(viewGroup.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
        } else {
            c22699x3dcdb352.m82040x7541828(viewGroup.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
            textView.setTextColor(viewGroup.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
        }
    }

    public final void w1(boolean z17) {
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hg0(this, z17));
    }
}
