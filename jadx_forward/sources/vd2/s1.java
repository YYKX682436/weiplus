package vd2;

/* loaded from: classes3.dex */
public final class s1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.np {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f517434d;

    /* renamed from: e, reason: collision with root package name */
    public final km2.n f517435e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c f517436f;

    /* renamed from: g, reason: collision with root package name */
    public final r45.qt2 f517437g;

    /* renamed from: h, reason: collision with root package name */
    public long f517438h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f517439i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f517440m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f517441n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Vector f517442o;

    public s1(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, km2.n datas, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c viewCallback, r45.qt2 qt2Var, long j17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(datas, "datas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewCallback, "viewCallback");
        this.f517434d = componentCallbacksC1101xa17d4670;
        this.f517435e = datas;
        this.f517436f = viewCallback;
        this.f517437g = qt2Var;
        this.f517438h = j17;
        this.f517439i = z18;
        this.f517440m = "Finder.FinderLiveViewCallback.Adapter";
        mo8163xed962dec(new vd2.m1(this));
        this.f517441n = new java.util.ArrayList();
        this.f517442o = new java.util.Vector();
    }

    public static final void x(vd2.s1 s1Var, android.content.Context context) {
        s1Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 c14353xe7c1f419 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419(context, s1Var.f517434d, null, s1Var.f517437g);
        int i17 = qs5.r.f447996a;
        c14353xe7c1f419.m57516x966c4b9b(1);
        s1Var.f517442o.add(new java.lang.ref.WeakReference(c14353xe7c1f419));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(s1Var.f517440m, "pluginLayout:" + c14353xe7c1f419.hashCode() + " produced");
        synchronized (s1Var.f517441n) {
            ((java.util.ArrayList) s1Var.f517441n).add(c14353xe7c1f419);
        }
    }

    public final void B(vd2.n1 n1Var, int i17, km2.t tVar) {
        java.lang.Object obj;
        boolean z17;
        km2.n nVar;
        gk2.e eVar;
        km2.m mVar = tVar.f390755d;
        gk2.e o07 = mVar != null ? dk2.ef.f314905a.o0(mVar) : null;
        if (mVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8.e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8.f184265a, "RV_VISITOR_" + mVar.f390662d.f150070e, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184090c.f184073b, null, false, false, false, 60, null);
        }
        android.view.View view = n1Var.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        synchronized (this.f517441n) {
            if (((java.util.ArrayList) this.f517441n).isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f517440m, "consumeView: item view list is empty, inflate visitor view");
                android.content.Context context = viewGroup.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 c14353xe7c1f419 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419(context, this.f517434d, null, this.f517437g);
                c14353xe7c1f419.m57516x966c4b9b(2);
                this.f517442o.add(new java.lang.ref.WeakReference(c14353xe7c1f419));
                obj = c14353xe7c1f419;
            } else {
                java.lang.Object remove = ((java.util.ArrayList) this.f517441n).remove(((java.util.ArrayList) r10).size() - 1);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419) remove).m57516x966c4b9b(2);
                obj = remove;
            }
        }
        android.view.View view2 = (android.view.View) obj;
        view2.setId(com.p314xaae8f345.mm.R.id.f566387fq1);
        android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f566387fq1);
        if (findViewById != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f517440m, "pluginLayout:" + findViewById.hashCode() + " replaced");
            viewGroup.removeView(findViewById);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 c14353xe7c1f4192 = findViewById instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419) findViewById : null;
            if (c14353xe7c1f4192 != null) {
                c14353xe7c1f4192.m57516x966c4b9b(3);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f517440m, "pluginLayout:" + view2.hashCode() + " addView");
        viewGroup.addView(view2, layoutParams);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 c14353xe7c1f4193 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419) n1Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f566387fq1);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bind view pos:");
        sb6.append(i17);
        sb6.append(", viewHolder:");
        sb6.append(n1Var.hashCode());
        sb6.append(",pluginLayout:");
        sb6.append(c14353xe7c1f4193.hashCode());
        sb6.append(',');
        sb6.append(mVar != null ? mVar.c() : null);
        sb6.append(", clickLiveId:");
        sb6.append(this.f517438h);
        sb6.append(", launchWithAnim:");
        sb6.append(this.f517439i);
        sb6.append(", buContext:");
        sb6.append((mVar == null || (eVar = mVar.f390663e) == null) ? null : java.lang.Integer.valueOf(eVar.hashCode()));
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f517440m, sb7);
        kz2.b.f395391a.d(this.f517440m, sb7);
        if (mVar == null || o07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f517440m, "bind view err: data is null!!!");
            return;
        }
        c14353xe7c1f4193.mo57463x37f82187(mVar);
        android.view.View findViewById2 = n1Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f7s);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new vd2.o1(this, i17));
        }
        android.view.View findViewById3 = n1Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.fjv);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new vd2.p1(this, i17));
        }
        if (this.f517438h == mVar.f390662d.f150070e) {
            if (this.f517439i) {
                c14353xe7c1f4193.setAlpha(0.0f);
            } else {
                c14353xe7c1f4193.setAlpha(1.0f);
            }
            if (gk2.e.f354004n == null || (!((mm2.c1) r5.a(mm2.c1.class)).a8())) {
                com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e c10828x8f239b6e = mVar.f390662d;
                z17 = true;
                c14353xe7c1f4193.m57505xd9c06695(c10828x8f239b6e.f150070e, c10828x8f239b6e.f150078p, java.lang.Integer.valueOf(c10828x8f239b6e.f150080q), (r16 & 8) != 0 ? false : false, (r16 & 16) != 0 ? false : this.f517439i);
                this.f517438h = 0L;
            } else {
                z17 = true;
            }
            this.f517439i = false;
        } else {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c = this.f517436f;
        if (((java.lang.Boolean) ((jz5.n) c14167x40aca97c.f193030v).mo141623x754a37bb()).booleanValue()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14343x44b0b6f6 c14343x44b0b6f6 = c14167x40aca97c.f193025q;
            if (c14343x44b0b6f6.mo7958x54496c8e() == 0) {
                java.lang.Integer valueOf = (c14167x40aca97c.f193019h == null || (nVar = dk2.ef.H) == null) ? null : java.lang.Integer.valueOf(nVar.d());
                if (valueOf != null) {
                    valueOf.intValue();
                    if (i17 != valueOf.intValue()) {
                        c14343x44b0b6f6.post(new vd2.z3(c14167x40aca97c, valueOf, i17));
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderLiveViewCallback", "bindCheckPrepareLive: current data is null");
                }
            }
        }
        y(n1Var, z17);
        android.content.Context context2 = c14353xe7c1f4193.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        z(c14353xe7c1f4193, ((pl2.x) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(pl2.x.class)).f438216f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8.e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8.f184265a, "RV_VISITOR_" + mVar.f390662d.f150070e, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184091d.f184073b, null, false, false, false, 60, null);
    }

    public final km2.m E(int i17) {
        if (i17 >= 0 && i17 < mo1894x7e414b06()) {
            return ((km2.t) this.f517435e.f390686e.get(i17)).f390755d;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f517440m, "getData invalid pos:" + i17 + '!');
        return null;
    }

    public final void I(android.view.View view) {
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = viewGroup.getChildAt(i17);
                if (childAt != null) {
                    childAt.animate().cancel();
                    if (childAt.hasTransientState()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecyclerViewAdapterEx", "[protectViewItemRecycleHealthy] child=" + childAt);
                    }
                    I(childAt);
                }
            }
            view.animate().cancel();
        }
    }

    public final void J(boolean z17, java.lang.String from) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(from, "from");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f517436f.f193025q.getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        if (c1162x665295de != null) {
            int w17 = c1162x665295de.w();
            int y17 = c1162x665295de.y();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f517440m, "sidebar updateCorner " + z17 + ", from:" + from + ", first:" + w17 + ", last:" + y17);
            if (w17 < 0 || y17 < 0) {
                return;
            }
            m8152xc67946d3(w17, (y17 - w17) + 1, z17 ? "PayLoadCorner" : "PayLoadHideCorner");
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f517435e.f390686e.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        java.lang.Object obj = this.f517435e.f390686e.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        km2.p pVar = ((km2.t) obj).f390756e;
        return (pVar != null ? pVar.f390699a : null) != null ? 100 : 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        java.lang.String str;
        byte[] bArr;
        r45.nw1 nw1Var;
        vd2.n1 vh6 = (vd2.n1) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vh6, "vh");
        java.lang.String str2 = this.f517440m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "onBindViewHolder start");
        java.lang.Object obj = this.f517435e.f390686e.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        km2.t tVar = (km2.t) obj;
        int mo863xcdaf1228 = mo863xcdaf1228(i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBindViewHolder pos:");
        sb6.append(i17);
        sb6.append(", viewType:");
        sb6.append(mo863xcdaf1228);
        sb6.append(", isGuideCard:");
        sb6.append(tVar.f390756e != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
        if (mo863xcdaf1228 == 0) {
            B(vh6, i17, tVar);
        } else if (mo863xcdaf1228 != 100) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, "onBindViewHolder: unknown view type:" + mo863xcdaf1228 + " at pos:" + i17);
            B(vh6, i17, tVar);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "bindGuideContainer pos:" + i17);
            km2.p pVar = tVar.f390756e;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = null;
            r45.fa2 fa2Var = pVar != null ? pVar.f390699a : null;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("bindGuideContainer pos:");
            sb7.append(i17);
            sb7.append(", hasContainer:");
            sb7.append(fa2Var != null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb7.toString());
            if (fa2Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, "bindGuideContainer: container is null");
            } else {
                android.view.View itemView = vh6.f3639x46306858;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p4 p4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p4(itemView);
                java.lang.String string = vh6.f3639x46306858.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.osh);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                p4Var.f198853h = pVar == null ? new km2.p(fa2Var, null, null, 6, null) : pVar;
                android.widget.TextView textView = p4Var.f198850e;
                if (textView != null) {
                    textView.setText(string);
                }
                android.view.View view = p4Var.f198849d;
                if (view != null) {
                    view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.l4(p4Var));
                }
                android.widget.GridLayout gridLayout = p4Var.f198851f;
                if (gridLayout != null) {
                    gridLayout.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.m4(p4Var));
                }
                android.view.View view2 = p4Var.f198852g;
                if (view2 != null) {
                    view2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.n4(p4Var));
                }
                if (gridLayout != null) {
                    gridLayout.removeAllViews();
                }
                java.util.LinkedList linkedList = fa2Var.f455662h;
                if (!(linkedList == null || linkedList.isEmpty()) && gridLayout != null) {
                    gridLayout.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.o4(gridLayout, p4Var, linkedList));
                }
                i95.m c17 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                zy2.zb zbVar = (zy2.zb) c17;
                ml2.u1 u1Var = ml2.u1.f409620t3;
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                ml2.q1 q1Var = ml2.q1.f409345e;
                zy2.zb.I8(zbVar, u1Var, linkedHashMap, null, "temp_2", null, null, false, 112, null);
                r45.w92 w92Var = new r45.w92();
                w92Var.set(0, pVar != null ? pVar.f390700b : null);
                r45.u92 u92Var = new r45.u92();
                u92Var.set(0, 9);
                u92Var.set(4, w92Var);
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                linkedList2.add(u92Var);
                r45.y92 y92Var = new r45.y92();
                y92Var.set(1, db2.t4.f309704a.a(13215));
                gk2.e eVar = dk2.ef.I;
                y92Var.set(3, java.lang.Long.valueOf((eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r) == null) ? 0L : nw1Var.m75942xfb822ef2(0)));
                gk2.e eVar2 = dk2.ef.I;
                y92Var.set(4, java.lang.Long.valueOf(eVar2 != null ? ((mm2.e1) eVar2.a(mm2.e1.class)).f410516m : 0L));
                gk2.e eVar3 = dk2.ef.I;
                if (eVar3 != null && (bArr = ((mm2.e1) eVar3.a(mm2.e1.class)).f410518o) != null) {
                    gVar = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bArr, 0, bArr.length);
                }
                y92Var.set(2, gVar);
                gk2.e eVar4 = dk2.ef.I;
                if (eVar4 == null || (str = ((mm2.e1) eVar4.a(mm2.e1.class)).f410525v) == null) {
                    str = "";
                }
                y92Var.set(5, str);
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                y92Var.set(6, xy2.c.e(context));
                y92Var.set(7, linkedList2);
                y92Var.d().l();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "onBindViewHolder end");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup vg6, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vg6, "vg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f517440m, "onCreateViewHolder type:" + i17);
        if (i17 == 100) {
            android.view.View inflate = android.view.LayoutInflater.from(vg6.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e_6, vg6, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
            return new vd2.n1(inflate);
        }
        android.content.Context context = vg6.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pm0.v.X(new vd2.r1(this, false, context));
        android.content.Context context2 = vg6.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 c22642x62f5b194 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194(context2);
        c22642x62f5b194.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        return new vd2.n1(c22642x62f5b194);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onViewDetachedFromWindow */
    public void mo8161x38c82990(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        vd2.n1 holder = (vd2.n1) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f517440m, "onViewDetachedFromWindow, " + holder.hashCode());
        super.mo8161x38c82990(holder);
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        I(itemView);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onViewRecycled */
    public void mo8162x34789575(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        android.view.View findViewById;
        vd2.n1 holder = (vd2.n1) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.mo8162x34789575(holder);
        android.view.View view = holder.f3639x46306858;
        android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        if (viewGroup == null || (findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f566387fq1)) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f517440m, "pluginLayout:" + findViewById.hashCode() + " onViewRecycled");
        viewGroup.removeView(findViewById);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 c14353xe7c1f419 = findViewById instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419) findViewById : null;
        if (c14353xe7c1f419 != null) {
            int i17 = qs5.r.f447996a;
            c14353xe7c1f419.m57516x966c4b9b(3);
        }
    }

    public final void y(vd2.n1 n1Var, boolean z17) {
        android.view.View view = n1Var.f3639x46306858;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 c22642x62f5b194 = view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194) view : null;
        if (c22642x62f5b194 != null) {
            if (z17) {
                c22642x62f5b194.m81432x205ac394(c22642x62f5b194.getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv));
            } else {
                c22642x62f5b194.m81432x205ac394(0.0f);
            }
        }
    }

    public final void z(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 c14353xe7c1f419, boolean z17) {
        if (c14353xe7c1f419 != null) {
            float dimension = c14353xe7c1f419.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
            float dimension2 = c14353xe7c1f419.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
            android.view.View findViewById = c14353xe7c1f419.findViewById(com.p314xaae8f345.mm.R.id.fqc);
            int i17 = z17 ? (int) dimension2 : (int) dimension;
            android.view.ViewGroup.LayoutParams layoutParams = findViewById != null ? findViewById.getLayoutParams() : null;
            if (layoutParams instanceof android.widget.RelativeLayout.LayoutParams) {
                android.view.ViewGroup.LayoutParams layoutParams2 = findViewById != null ? findViewById.getLayoutParams() : null;
                android.widget.RelativeLayout.LayoutParams layoutParams3 = layoutParams2 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams2 : null;
                if (layoutParams3 == null) {
                    return;
                }
                layoutParams3.topMargin = i17;
                return;
            }
            if (layoutParams instanceof p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) {
                android.view.ViewGroup.LayoutParams layoutParams4 = findViewById != null ? findViewById.getLayoutParams() : null;
                p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams5 = layoutParams4 instanceof p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams ? (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams4 : null;
                if (layoutParams5 == null) {
                    return;
                }
                layoutParams5.f92443u = i17;
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List payloads) {
        vd2.n1 holder = (vd2.n1) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        boolean contains = payloads.contains("PayLoadCorner");
        java.lang.String str = this.f517440m;
        boolean z17 = false;
        boolean z18 = true;
        if (contains) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "sidebar updateCorner show, position:" + i17);
            y(holder, true);
            z18 = false;
        }
        if (payloads.contains("PayLoadHideCorner")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "sidebar updateCorner hide, position:" + i17);
            y(holder, false);
        } else {
            z17 = z18;
        }
        if (z17) {
            super.mo8157xe5e2e48d(holder, i17, payloads);
        }
    }
}
