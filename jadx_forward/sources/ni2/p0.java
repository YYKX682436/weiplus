package ni2;

/* loaded from: classes3.dex */
public final class p0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g implements android.view.View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public final qo0.c f418940h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f418941i;

    /* renamed from: m, reason: collision with root package name */
    public fg2.a1 f418942m;

    /* renamed from: n, reason: collision with root package name */
    public int f418943n;

    /* renamed from: o, reason: collision with root package name */
    public int f418944o;

    /* renamed from: p, reason: collision with root package name */
    public hi2.b f418945p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f418946q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(android.content.Context context, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        super(context, false, null, false, 14, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f418940h = statusMonitor;
        this.f418941i = basePlugin;
        this.f418944o = 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public android.view.View c() {
        ae2.in inVar = ae2.in.f85221a;
        if (!(((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.R).mo141623x754a37bb()).r()).intValue() == 1)) {
            return null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(this.f199914d);
        c22699x3dcdb352.m82040x7541828(c22699x3dcdb352.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        c22699x3dcdb352.setLayoutParams(new android.view.ViewGroup.LayoutParams(i65.a.b(c22699x3dcdb352.getContext(), 24), i65.a.b(c22699x3dcdb352.getContext(), 24)));
        c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80296x4bb328a8);
        return c22699x3dcdb352;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ava;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public java.lang.String o() {
        fg2.a1 a1Var = this.f418942m;
        if (a1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
            throw null;
        }
        java.lang.String string = a1Var.f343470a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573404ei2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicRequestPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        fg2.a1 a1Var = this.f418942m;
        if (a1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
            throw null;
        }
        int id6 = a1Var.f343472c.getId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f418941i;
        android.content.Context context = this.f199914d;
        if (valueOf != null && valueOf.intValue() == id6) {
            if (this.f418944o == 4) {
                ml2.n4 n4Var = ml2.n4.P;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 38");
                i95.m c17 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                ml2.r0.ik((ml2.r0) c17, n4Var, null, 0, 6, null);
            }
            zl2.r4 r4Var = zl2.r4.f555483a;
            android.content.Context context2 = this.f199914d;
            gk2.e S0 = lVar.S0();
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ec6);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573358ec4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            if (r4Var.B(context2, S0, string, string2, new ni2.l0(this))) {
                this.f418946q = true;
                a();
                yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicRequestPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            z();
        } else {
            fg2.a1 a1Var2 = this.f418942m;
            if (a1Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
                throw null;
            }
            int id7 = a1Var2.f343471b.getId();
            if (valueOf != null && valueOf.intValue() == id7) {
                if (this.f418944o == 4) {
                    ml2.n4 n4Var2 = ml2.n4.Q;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 39");
                    i95.m c18 = i95.n0.c(ml2.r0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                    ml2.r0.ik((ml2.r0) c18, n4Var2, null, 0, 6, null);
                }
                zl2.r4 r4Var2 = zl2.r4.f555483a;
                android.content.Context context3 = this.f199914d;
                gk2.e S02 = lVar.S0();
                java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ec6);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                java.lang.String string4 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573358ec4);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
                if (r4Var2.B(context3, S02, string3, string4, new ni2.m0(this))) {
                    this.f418946q = true;
                    a();
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicRequestPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                y();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicRequestPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        int i17 = com.p314xaae8f345.mm.R.id.a6v;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.a6v);
        if (c22699x3dcdb352 != null) {
            i17 = com.p314xaae8f345.mm.R.id.f564822a71;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f564822a71);
            if (linearLayout != null) {
                i17 = com.p314xaae8f345.mm.R.id.f569089oz4;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f569089oz4);
                if (c22699x3dcdb3522 != null) {
                    i17 = com.p314xaae8f345.mm.R.id.oz_;
                    android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.oz_);
                    if (linearLayout2 != null) {
                        this.f418942m = new fg2.a1((android.widget.LinearLayout) rootView, c22699x3dcdb352, linearLayout, c22699x3dcdb3522, linearLayout2);
                        linearLayout2.setOnClickListener(this);
                        fg2.a1 a1Var = this.f418942m;
                        if (a1Var != null) {
                            a1Var.f343471b.setOnClickListener(this);
                            return;
                        } else {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
                            throw null;
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i17)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void t() {
        super.t();
        if (!this.f418946q) {
            ml2.n4 n4Var = ml2.n4.Z;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 54");
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0.ik((ml2.r0) c17, n4Var, null, 0, 6, null);
        }
        this.f418946q = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void v() {
        this.f418946q = true;
        a();
        ml2.n4 n4Var = ml2.n4.C;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 26");
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.ik((ml2.r0) c17, n4Var, null, 0, 6, null);
        this.f418940h.mo46557x60d69242(qo0.b.f446893h3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kg0 kg0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kg0) this.f418941i.X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kg0.class);
        if (kg0Var != null) {
            kg0Var.F = new ni2.n0(this);
        }
    }

    public final void y() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicRequestPanelWidget", "SHEET_MORE_ACTION_AUDIO_LINK");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f418941i;
        boolean z17 = false;
        if (!((mm2.o4) lVar.P0(mm2.o4.class)).k7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicRequestPanelWidget", "skip apply mic, disable mic");
            fg2.a1 a1Var = this.f418942m;
            if (a1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
                throw null;
            }
            android.content.Context context = a1Var.f343470a.getContext();
            fg2.a1 a1Var2 = this.f418942m;
            if (a1Var2 != null) {
                db5.t7.m123883x26a183b(context, a1Var2.f343470a.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573139dn2), 0).show();
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
                throw null;
            }
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_TYPE", 1);
        bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_SOURCE", this.f418944o);
        bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_POSITION", this.f418943n);
        hi2.b bVar = this.f418945p;
        if (bVar != null) {
            bundle.putByteArray("PARAM_FINDER_LIVE_LINK_MIC_BUFFER", bVar.f363039a);
            bundle.putBoolean("PARAM_FINDER_LIVE_LINK_MIC_CAN_AUTO_LINK", bVar.f363040b);
        }
        qo0.b bVar2 = qo0.b.F3;
        qo0.c cVar = this.f418940h;
        cVar.mo46557x60d69242(bVar2, bundle);
        this.f418946q = true;
        a();
        if (cVar.mo11219xd0598cf8() == 0) {
            if (this.f418944o == 2) {
                dk2.u4 u4Var = ((mm2.o4) lVar.S0().a(mm2.o4.class)).Z;
                if (!(u4Var != null && u4Var.k())) {
                    dk2.u4 u4Var2 = ((mm2.o4) lVar.S0().a(mm2.o4.class)).Z;
                    if (u4Var2 != null && u4Var2.g()) {
                        z17 = true;
                    }
                    if (!z17) {
                        ml2.n4 n4Var = ml2.n4.A;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 24");
                        i95.m c17 = i95.n0.c(ml2.r0.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                        ml2.r0.ik((ml2.r0) c17, n4Var, null, 0, 6, null);
                    }
                }
                ml2.n4 n4Var2 = ml2.n4.L;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 35");
                i95.m c18 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                ml2.r0.ik((ml2.r0) c18, n4Var2, null, 0, 6, null);
            } else {
                dk2.u4 u4Var3 = ((mm2.o4) lVar.S0().a(mm2.o4.class)).Z;
                if (!(u4Var3 != null && u4Var3.k())) {
                    dk2.u4 u4Var4 = ((mm2.o4) lVar.S0().a(mm2.o4.class)).Z;
                    if (u4Var4 != null && u4Var4.g()) {
                        z17 = true;
                    }
                    if (!z17) {
                        i95.m c19 = i95.n0.c(ml2.r0.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                        ml2.r0.ik((ml2.r0) c19, ml2.n4.f409273g, null, 0, 6, null);
                    }
                }
                ml2.n4 n4Var3 = ml2.n4.f409270J;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 33");
                i95.m c27 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c27, "getService(...)");
                ml2.r0.ik((ml2.r0) c27, n4Var3, null, 0, 6, null);
            }
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            fg2.a1 a1Var3 = this.f418942m;
            if (a1Var3 != null) {
                ((cy1.a) rVar).Cj("finder_live_apply_for_audio_event", a1Var3.f343470a, null, 25561);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
                throw null;
            }
        }
    }

    public final void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicRequestPanelWidget", "SHEET_MORE_ACTION_VIDEO_LINK");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f418941i;
        boolean z17 = false;
        if (!((mm2.o4) lVar.P0(mm2.o4.class)).k7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicRequestPanelWidget", "skip apply mic, disable mic");
            fg2.a1 a1Var = this.f418942m;
            if (a1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
                throw null;
            }
            android.content.Context context = a1Var.f343470a.getContext();
            fg2.a1 a1Var2 = this.f418942m;
            if (a1Var2 != null) {
                db5.t7.m123883x26a183b(context, a1Var2.f343470a.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573139dn2), 0).show();
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
                throw null;
            }
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_TYPE", 2);
        bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_SOURCE", this.f418944o);
        bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_POSITION", this.f418943n);
        hi2.b bVar = this.f418945p;
        if (bVar != null) {
            bundle.putByteArray("PARAM_FINDER_LIVE_LINK_MIC_BUFFER", bVar.f363039a);
            bundle.putBoolean("PARAM_FINDER_LIVE_LINK_MIC_CAN_AUTO_LINK", bVar.f363040b);
        }
        qo0.b bVar2 = qo0.b.F3;
        qo0.c cVar = this.f418940h;
        cVar.mo46557x60d69242(bVar2, bundle);
        this.f418946q = true;
        a();
        if (cVar.mo11219xd0598cf8() == 0) {
            if (this.f418944o == 2) {
                dk2.u4 u4Var = ((mm2.o4) lVar.S0().a(mm2.o4.class)).Z;
                if (!(u4Var != null && u4Var.k())) {
                    dk2.u4 u4Var2 = ((mm2.o4) lVar.S0().a(mm2.o4.class)).Z;
                    if (u4Var2 != null && u4Var2.g()) {
                        z17 = true;
                    }
                    if (!z17) {
                        ml2.n4 n4Var = ml2.n4.B;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 25");
                        i95.m c17 = i95.n0.c(ml2.r0.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                        ml2.r0.ik((ml2.r0) c17, n4Var, null, 0, 6, null);
                    }
                }
                ml2.n4 n4Var2 = ml2.n4.K;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 34");
                i95.m c18 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                ml2.r0.ik((ml2.r0) c18, n4Var2, null, 0, 6, null);
            } else {
                dk2.u4 u4Var3 = ((mm2.o4) lVar.S0().a(mm2.o4.class)).Z;
                if (!(u4Var3 != null && u4Var3.k())) {
                    dk2.u4 u4Var4 = ((mm2.o4) lVar.S0().a(mm2.o4.class)).Z;
                    if (u4Var4 != null && u4Var4.g()) {
                        z17 = true;
                    }
                    if (!z17) {
                        i95.m c19 = i95.n0.c(ml2.r0.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                        ml2.r0.ik((ml2.r0) c19, ml2.n4.f409274h, null, 0, 6, null);
                    }
                }
                ml2.n4 n4Var3 = ml2.n4.I;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 32");
                i95.m c27 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c27, "getService(...)");
                ml2.r0.ik((ml2.r0) c27, n4Var3, null, 0, 6, null);
            }
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            fg2.a1 a1Var3 = this.f418942m;
            if (a1Var3 != null) {
                ((cy1.a) rVar).Cj("finder_live_apply_for_video_event", a1Var3.f343470a, null, 25561);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
                throw null;
            }
        }
    }
}
