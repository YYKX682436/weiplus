package qi2;

/* loaded from: classes10.dex */
public class c0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g implements android.view.View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f445035h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f445036i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f445037m;

    /* renamed from: n, reason: collision with root package name */
    public fg2.g f445038n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f445039o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f445040p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashMap f445041q;

    /* renamed from: r, reason: collision with root package name */
    public int f445042r;

    /* renamed from: s, reason: collision with root package name */
    public dk2.m f445043s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        super(context, false, null, false, 12, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f445035h = basePlugin;
        this.f445039o = new java.util.LinkedList();
        this.f445040p = new java.util.LinkedList();
        this.f445041q = new java.util.HashMap();
        this.f445042r = 1;
    }

    public final void A(java.lang.String str) {
        java.util.HashMap hashMap = this.f445041q;
        synchronized (hashMap) {
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(entry.getKey(), str)) {
                    ((qi2.z) entry.getValue()).b(false);
                } else {
                    ((qi2.z) entry.getValue()).b(true);
                }
            }
        }
    }

    public void B() {
        this.f445039o.clear();
        this.f445040p.clear();
        if (((mm2.o4) this.f445035h.P0(mm2.o4.class)).f410857s.size() == 2) {
            this.f445039o.add(((mm2.o4) this.f445035h.P0(mm2.o4.class)).a7());
            java.util.List list = ((mm2.o4) this.f445035h.P0(mm2.o4.class)).f410857s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-anchorPkMicUserList>(...)");
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.f445040p.add((km2.q) it.next());
                }
            }
            return;
        }
        if (((mm2.o4) this.f445035h.P0(mm2.o4.class)).f410857s.size() == 3) {
            this.f445039o.add(((mm2.o4) this.f445035h.P0(mm2.o4.class)).a7());
            java.util.List list2 = ((mm2.o4) this.f445035h.P0(mm2.o4.class)).f410857s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "<get-anchorPkMicUserList>(...)");
            synchronized (list2) {
                int i17 = 0;
                for (java.lang.Object obj : list2) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    km2.q qVar = (km2.q) obj;
                    if (i17 == 1) {
                        this.f445039o.add(qVar);
                    } else {
                        this.f445040p.add(qVar);
                    }
                    i17 = i18;
                }
            }
        }
    }

    public final void C() {
        java.lang.String str;
        java.lang.String str2;
        if (this.f445039o.size() == 1) {
            km2.q qVar = (km2.q) kz5.n0.Z(this.f445039o);
            if (qVar == null || (str2 = qVar.f390703a) == null) {
                str2 = "";
            }
            A(str2);
            return;
        }
        if (this.f445040p.size() == 1) {
            km2.q qVar2 = (km2.q) kz5.n0.Z(this.f445040p);
            if (qVar2 == null || (str = qVar2.f390703a) == null) {
                str = "";
            }
            A(str);
            return;
        }
        java.util.HashMap hashMap = this.f445041q;
        synchronized (hashMap) {
            java.util.Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                ((qi2.z) ((java.util.Map.Entry) it.next()).getValue()).b(true);
            }
        }
    }

    public void D(qi2.z viewHolder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
    }

    public final void E(dk2.m battleData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(battleData, "battleData");
        this.f445043s = battleData;
        super.w();
        F();
        G();
    }

    public final void F() {
        B();
        java.util.LinkedList linkedList = this.f445039o;
        fj2.k kVar = fj2.k.f344708d;
        fg2.g gVar = this.f445038n;
        if (gVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        android.widget.LinearLayout redTeamLayout = gVar.f343572g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(redTeamLayout, "redTeamLayout");
        y(linkedList, kVar, redTeamLayout);
        java.util.LinkedList linkedList2 = this.f445040p;
        fj2.k kVar2 = fj2.k.f344709e;
        fg2.g gVar2 = this.f445038n;
        if (gVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        android.widget.LinearLayout blueTeamLayout = gVar2.f343567b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(blueTeamLayout, "blueTeamLayout");
        y(linkedList2, kVar2, blueTeamLayout);
        C();
    }

    public void G() {
        this.f445042r = 1;
        fg2.g gVar = this.f445038n;
        if (gVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        gVar.f343568c.setVisibility(8);
        fg2.g gVar2 = this.f445038n;
        if (gVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        gVar2.f343570e.setVisibility(0);
        fg2.g gVar3 = this.f445038n;
        if (gVar3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        gVar3.f343575j.setVisibility(8);
        fg2.g gVar4 = this.f445038n;
        if (gVar4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        gVar4.f343569d.setText(this.f199914d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d6x));
    }

    public void H() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f445035h;
        if (((mm2.o4) lVar.P0(mm2.o4.class)).f410857s.size() < 2) {
            return;
        }
        if (this.f445039o.size() + this.f445040p.size() == ((mm2.o4) lVar.P0(mm2.o4.class)).f410857s.size() + 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorTeamPkApplyPanelWidget", "updateAnchorMicUserList save user, return");
        } else {
            F();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.anf;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int l() {
        return 8;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e;
        dk2.m mVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveAnchorTeamPkApplyPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        fg2.g gVar = this.f445038n;
        if (gVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        int id6 = gVar.f343573h.getId();
        android.content.Context context = this.f199914d;
        fj2.j jVar = fj2.j.f344707a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f445035h;
        if (valueOf != null && valueOf.intValue() == id6) {
            dk2.u4 u4Var = ((mm2.o4) lVar.P0(mm2.o4.class)).Z;
            boolean z17 = u4Var != null && u4Var.h();
            fj2.s sVar = fj2.s.f344716a;
            if (z17) {
                fj2.s.c(sVar, ml2.q2.D, null, null, 0, 0, 30, null);
            } else {
                fj2.s.c(sVar, ml2.q2.C, null, null, 0, 0, 30, null);
            }
            this.f445036i = jVar.c(this.f445036i, context, new qi2.b0(this));
        } else {
            fg2.g gVar2 = this.f445038n;
            if (gVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            int id7 = gVar2.f343570e.getId();
            if (valueOf != null && valueOf.intValue() == id7) {
                int i17 = this.f445042r;
                if (i17 != 1) {
                    if (i17 == 2) {
                        this.f445037m = jVar.a(this.f445037m, context, new qi2.a0(this));
                    } else if (i17 == 3) {
                        a();
                        qo0.c.a(lVar.f194858g, qo0.b.f446974y4, null, 2, null);
                    }
                } else if (((mm2.y2) lVar.P0(mm2.y2.class)).W6(true)) {
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    r45.r22 r22Var = new r45.r22();
                    java.util.LinkedList<km2.q> linkedList2 = this.f445039o;
                    for (km2.q qVar : linkedList2) {
                        java.util.LinkedList m75941xfb821914 = r22Var.m75941xfb821914(0);
                        r45.wk6 wk6Var = new r45.wk6();
                        wk6Var.set(0, qVar.f390705c);
                        wk6Var.set(1, qVar.f390703a);
                        m75941xfb821914.add(wk6Var);
                    }
                    linkedList.add(r22Var);
                    r45.r22 r22Var2 = new r45.r22();
                    java.util.LinkedList<km2.q> linkedList3 = this.f445040p;
                    for (km2.q qVar2 : linkedList3) {
                        java.util.LinkedList m75941xfb8219142 = r22Var2.m75941xfb821914(0);
                        r45.wk6 wk6Var2 = new r45.wk6();
                        wk6Var2.set(0, qVar2.f390705c);
                        wk6Var2.set(1, qVar2.f390703a);
                        m75941xfb8219142.add(wk6Var2);
                    }
                    linkedList.add(r22Var2);
                    if (linkedList2.size() + linkedList3.size() == ((mm2.o4) lVar.P0(mm2.o4.class)).f410857s.size() + 1) {
                        km2.m V0 = lVar.V0();
                        if (V0 != null && (c14197x319b1b9e = V0.f390664f) != null && (mVar = this.f445043s) != null) {
                            mVar.f315276f = linkedList;
                            qf2.y1 y1Var = (qf2.y1) c14197x319b1b9e.m56798x25fe639c(qf2.y1.class);
                            if (y1Var != null) {
                                y1Var.e7(mVar, null);
                            }
                        }
                    } else {
                        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                        db5.t7.m123883x26a183b(context2, context2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d6y), 0).show();
                    }
                    a();
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveAnchorTeamPkApplyPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        int i17 = com.p314xaae8f345.mm.R.id.asx;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.asx);
        if (linearLayout != null) {
            i17 = com.p314xaae8f345.mm.R.id.c_0;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.c_0);
            if (c22699x3dcdb352 != null) {
                i17 = com.p314xaae8f345.mm.R.id.c_2;
                android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.c_2);
                if (textView != null) {
                    i17 = com.p314xaae8f345.mm.R.id.c_u;
                    android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.c_u);
                    if (linearLayout2 != null) {
                        i17 = com.p314xaae8f345.mm.R.id.f6a;
                        android.view.View a17 = x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f6a);
                        if (a17 != null) {
                            i17 = com.p314xaae8f345.mm.R.id.f6c;
                            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f6c);
                            if (frameLayout != null) {
                                i17 = com.p314xaae8f345.mm.R.id.fn8;
                                android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.fn8);
                                if (imageView != null) {
                                    i17 = com.p314xaae8f345.mm.R.id.lqt;
                                    android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.lqt);
                                    if (linearLayout3 != null) {
                                        i17 = com.p314xaae8f345.mm.R.id.nzb;
                                        android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.nzb);
                                        if (textView2 != null) {
                                            i17 = com.p314xaae8f345.mm.R.id.nzi;
                                            android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.nzi);
                                            if (textView3 != null) {
                                                i17 = com.p314xaae8f345.mm.R.id.p_m;
                                                android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.p_m);
                                                if (textView4 != null) {
                                                    this.f445038n = new fg2.g((p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89) rootView, linearLayout, c22699x3dcdb352, textView, linearLayout2, a17, frameLayout, imageView, linearLayout3, textView2, textView3, textView4);
                                                    ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) a17.findViewById(com.p314xaae8f345.mm.R.id.f6b)).m82040x7541828(this.f199914d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaz));
                                                    fg2.g gVar = this.f445038n;
                                                    if (gVar == null) {
                                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                        throw null;
                                                    }
                                                    gVar.f343573h.setOnClickListener(this);
                                                    fg2.g gVar2 = this.f445038n;
                                                    if (gVar2 == null) {
                                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                        throw null;
                                                    }
                                                    gVar2.f343570e.setOnClickListener(this);
                                                    fg2.g gVar3 = this.f445038n;
                                                    if (gVar3 != null) {
                                                        com.p314xaae8f345.mm.ui.bk.r0(gVar3.f343574i.getPaint(), 0.8f);
                                                        return;
                                                    } else {
                                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                        throw null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i17)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public boolean r() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void w() {
        super.w();
        F();
        G();
    }

    public final void y(java.util.LinkedList linkedList, fj2.k kVar, android.widget.LinearLayout linearLayout) {
        qi2.z zVar;
        linearLayout.removeAllViews();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            km2.q qVar = (km2.q) it.next();
            java.util.HashMap hashMap = this.f445041q;
            if (hashMap.containsKey(qVar.f390703a)) {
                zVar = (qi2.z) hashMap.get(qVar.f390703a);
            } else {
                android.view.View inflate = android.view.LayoutInflater.from(this.f199914d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ane, (android.view.ViewGroup) null, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
                zVar = new qi2.z(this, inflate);
            }
            if (zVar != null) {
                java.lang.String str = qVar.f390703a;
                if (str == null) {
                    str = "";
                }
                hashMap.put(str, zVar);
                zVar.f445197g = qVar;
                boolean S3 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.S3(qVar.f390705c);
                mn2.g1 g1Var = mn2.g1.f411508a;
                android.widget.ImageView imageView = zVar.f445193c;
                if (S3) {
                    g1Var.a().c(new mn2.n(qVar.f390704b, null, 2, null), imageView, g1Var.h(mn2.f1.f411490h));
                } else {
                    g1Var.l().c(new mn2.n(qVar.f390704b, null, 2, null), imageView, g1Var.h(mn2.f1.f411494o));
                }
                i95.m c17 = i95.n0.c(c61.yb.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                c61.yb ybVar = (c61.yb) c17;
                android.content.Context context = zVar.f445191a.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                android.widget.TextView textView = zVar.f445194d;
                android.text.TextPaint paint = textView.getPaint();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(paint, "getPaint(...)");
                textView.setText(c61.yb.nf(ybVar, context, paint, zl2.r4.D0(zl2.r4.f555483a, qVar.f390705c, qVar.f390706d, false, 4, null), 0, 8, null));
                zVar.a(kVar);
                D(zVar);
                z(zVar, linearLayout);
            }
        }
    }

    public final void z(qi2.z zVar, android.widget.LinearLayout linearLayout) {
        if (zVar != null) {
            android.view.View view = zVar.f445191a;
            android.view.ViewParent parent = view.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i65.a.b(view.getContext(), 118), i65.a.b(view.getContext(), 138));
            layoutParams.leftMargin = linearLayout.getChildCount() == 0 ? 0 : i65.a.b(this.f199914d, 8);
            linearLayout.addView(view, layoutParams);
        }
    }
}
