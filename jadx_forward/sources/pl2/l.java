package pl2;

/* loaded from: classes3.dex */
public final class l extends xx2.d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f438164a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f438165b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f438166c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f438167d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f438168e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f438169f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f438170g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f438171h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f438172i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ pl2.s f438173j;

    public l(pl2.s sVar) {
        this.f438173j = sVar;
    }

    @Override // xx2.d
    public void a(boolean z17) {
        java.lang.String str;
        java.util.ArrayList arrayList;
        pl2.s sVar;
        boolean z18;
        vd2.s1 s1Var;
        pl2.s sVar2 = this.f438173j;
        android.content.Context b17 = sVar2.b();
        pf5.z zVar = pf5.z.f435481a;
        if (!(b17 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) b17).a(pl2.x.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        pl2.x xVar = (pl2.x) a17;
        java.util.ArrayList sideBarDataList = sVar2.f438189k;
        java.lang.String str2 = sVar2.f438180b;
        if (!z17 || this.f438171h) {
            str = str2;
            arrayList = sideBarDataList;
            if (z17 || !this.f438171h) {
                sVar = sVar2;
            } else {
                pl2.w wVar = xVar.f438220m;
                wVar.getClass();
                long c17 = c01.id.c() - wVar.f438205b;
                pl2.x xVar2 = wVar.f438213j;
                android.app.Activity context = xVar2.m80379x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                java.lang.String chnlExtra = wVar.a(wVar.a(wVar.a(wVar.a(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.ra.class))).f216921t, "event_type", "2"), "model_operat_type", java.lang.String.valueOf(wVar.f438211h)), "model_stay_time", java.lang.String.valueOf(c17)), "active_id", java.lang.String.valueOf(wVar.f438204a));
                ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
                r0Var.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chnlExtra, "chnlExtra");
                ml2.b4 b4Var = ml2.b4.X;
                ml2.q1 q1Var = ml2.q1.f409345e;
                ml2.r0.hj(r0Var, b4Var, "", 0L, null, "temp_33", chnlExtra, null, null, 204, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xVar2.f438214d, xVar2.f438220m.hashCode() + "report reportExitSideBar " + wVar.f438211h + ", " + c17 + ", " + chnlExtra);
                wVar.f438211h = 2;
                wVar.f438212i.clear();
                sVar = sVar2;
                sVar.f438192n = false;
            }
            z18 = z17;
        } else {
            pl2.w wVar2 = xVar.f438220m;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c18 = sVar2.c();
            pl2.j jVar = new pl2.j(sVar2);
            wVar2.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sideBarDataList, "sideBarDataList");
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c18.getLayoutManager();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int w17 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager).w();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager2 = c18.getLayoutManager();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            str = str2;
            arrayList = sideBarDataList;
            pm0.v.L("SideBarReport", true, new pl2.v(w17, ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager2).y(), wVar2, sideBarDataList, jVar));
            pl2.w wVar3 = xVar.f438220m;
            wVar3.getClass();
            wVar3.f438205b = c01.id.c();
            pl2.x xVar3 = wVar3.f438213j;
            android.app.Activity context2 = xVar3.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
            if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            java.lang.String chnlExtra2 = wVar3.a(wVar3.a(wVar3.a(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).c(zy2.ra.class))).f216921t, "event_type", "1"), "model_operat_type", java.lang.String.valueOf(wVar3.f438210g)), "active_id", java.lang.String.valueOf(wVar3.f438204a));
            ml2.r0 r0Var2 = (ml2.r0) i95.n0.c(ml2.r0.class);
            r0Var2.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chnlExtra2, "chnlExtra");
            ml2.b4 b4Var2 = ml2.b4.X;
            ml2.q1 q1Var2 = ml2.q1.f409345e;
            ml2.r0.hj(r0Var2, b4Var2, "", 0L, null, "temp_33", chnlExtra2, null, null, 204, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xVar3.f438214d, xVar3.f438220m.hashCode() + "report reportEnterSideBar " + wVar3.f438210g + ", " + chnlExtra2);
            wVar3.f438210g = 2;
            wVar3.f438212i.clear();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "Interactive related mode entered. Suppressing further guides.");
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_RELATED_LIVE_SWIPE_INVOKED_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            z18 = z17;
            sVar = sVar2;
        }
        xVar.P6(z18);
        if (z18) {
            android.widget.ImageView imageView = this.f438167d;
            if (imageView != null) {
                imageView.setVisibility(this.f438164a ? 0 : 8);
            }
            if (!sVar.f438185g) {
                android.widget.TextView textView = this.f438166c;
                if (textView != null && textView.getVisibility() == 0) {
                    sVar.f438185g = true;
                    i95.m c19 = i95.n0.c(zy2.zb.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                    zy2.zb zbVar = (zy2.zb) c19;
                    ml2.c1 c1Var = ml2.c1.f408858e;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("type", 1);
                    ml2.y3 y3Var = ml2.y3.f409803e;
                    jSONObject.put("entrance_type", 15);
                    com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) sVar.b();
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a9.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d9.f183626f, activityC21401x6ce6f73f, activityC21401x6ce6f73f.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9y), 500L, null, 8, null);
                    jSONObject.put("entrance_id", currentTimeMillis);
                    zy2.zb.j5(zbVar, 36L, jSONObject.toString(), null, 4, null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "Report KTV room entrance exposure when sidebar opened");
                }
            }
        } else {
            this.f438164a = false;
            android.widget.ImageView imageView2 = this.f438167d;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        int childCount = sVar.c().getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = sVar.c().getChildAt(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(childAt, "getChildAt(...)");
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 w07 = sVar.c().w0(childAt);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(w07, "getChildViewHolder(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd8962 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962) childAt.findViewById(com.p314xaae8f345.mm.R.id.toa);
            if (!z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "Stopping sidebar item play. " + w07.m8183xf806b362());
                c14522x8ffd8962.mo58404x360802();
                c14522x8ffd8962.mo58389x41012807();
            } else if (!c14522x8ffd8962.mo58387xc00617a4()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "Starting sidebar item play. " + w07.m8183xf806b362());
                c14522x8ffd8962.t();
            }
        }
        pl2.m mVar = sVar.f438184f;
        if (mVar != null) {
            vd2.l4 l4Var = (vd2.l4) mVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveViewCallback", "sidebar onDragFinished show:" + z18);
            pl2.s sVar3 = l4Var.f517338d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c = l4Var.f517337c;
            if (z18) {
                c14167x40aca97c.f193015d.m82685x96646ed(false);
                vd2.j4 j4Var = new vd2.j4(c14167x40aca97c, z18);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14343x44b0b6f6 c14343x44b0b6f6 = c14167x40aca97c.f193025q;
                c14343x44b0b6f6.post(j4Var);
                sVar3.h(0);
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c14343x44b0b6f6.mo7946xf939df19();
                s1Var = mo7946xf939df19 instanceof vd2.s1 ? (vd2.s1) mo7946xf939df19 : null;
                if (s1Var != null) {
                    s1Var.z(c14167x40aca97c.f193028t.f517587e, true);
                }
            } else {
                c14167x40aca97c.f193015d.m82685x96646ed(true);
                vd2.z4 z4Var = c14167x40aca97c.f193028t;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 c14353xe7c1f419 = z4Var.f517587e;
                if (c14353xe7c1f419 != null) {
                    c14353xe7c1f419.m57519x159fcf5();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14343x44b0b6f6 c14343x44b0b6f62 = c14167x40aca97c.f193025q;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = c14343x44b0b6f62.mo7946xf939df19();
                vd2.s1 s1Var2 = mo7946xf939df192 instanceof vd2.s1 ? (vd2.s1) mo7946xf939df192 : null;
                if (s1Var2 != null) {
                    s1Var2.J(false, "onDragFinished");
                }
                c14343x44b0b6f62.post(new vd2.i4(c14167x40aca97c, z18));
                sVar3.h(8);
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df193 = c14343x44b0b6f62.mo7946xf939df19();
                s1Var = mo7946xf939df193 instanceof vd2.s1 ? (vd2.s1) mo7946xf939df193 : null;
                if (s1Var != null) {
                    s1Var.z(z4Var.f517587e, false);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = dk2.ef.f314904J;
            if (c14197x319b1b9e != null) {
                if2.z.f372686a.i(c14197x319b1b9e, new mf2.z(c14197x319b1b9e, z18));
            }
        }
        if (!z18 || arrayList.size() >= 2) {
            return;
        }
        sVar.c().post(new pl2.k(sVar));
    }

    @Override // xx2.d
    public void b(boolean z17) {
        pl2.s sVar = this.f438173j;
        android.content.Context b17 = sVar.b();
        pf5.z zVar = pf5.z.f435481a;
        if (!(b17 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        this.f438171h = ((pl2.x) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) b17).a(pl2.x.class)).f438216f;
        android.content.Context b18 = sVar.b();
        pf5.z zVar2 = pf5.z.f435481a;
        if (!(b18 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((pl2.x) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) b18).a(pl2.x.class)).P6(true);
        pl2.m mVar = sVar.f438184f;
        if (mVar != null) {
            vd2.l4 l4Var = (vd2.l4) mVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveViewCallback", "sidebar onDragStarted toShow:" + z17);
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c = l4Var.f517337c;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 c14353xe7c1f419 = c14167x40aca97c.f193028t.f517587e;
                if (c14353xe7c1f419 != null) {
                    c14353xe7c1f419.m57466x92cd3060();
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c14167x40aca97c.f193025q.mo7946xf939df19();
                vd2.s1 s1Var = mo7946xf939df19 instanceof vd2.s1 ? (vd2.s1) mo7946xf939df19 : null;
                if (s1Var != null) {
                    s1Var.J(true, "onDragStarted");
                }
            }
            l4Var.f517338d.h(8);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = dk2.ef.f314904J;
            if (c14197x319b1b9e != null) {
                if2.z.f372686a.i(c14197x319b1b9e, new mf2.a0(c14197x319b1b9e, z17));
            }
        }
    }
}
