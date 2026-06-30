package pl2;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f438179a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f438180b;

    /* renamed from: c, reason: collision with root package name */
    public xx2.l f438181c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f438182d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f438183e;

    /* renamed from: f, reason: collision with root package name */
    public pl2.m f438184f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f438185g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 f438186h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f438187i;

    /* renamed from: j, reason: collision with root package name */
    public android.content.Context f438188j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.ArrayList f438189k;

    /* renamed from: l, reason: collision with root package name */
    public int f438190l;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f438191m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f438192n;

    /* renamed from: o, reason: collision with root package name */
    public final pl2.l f438193o;

    public s(android.view.View liveContainer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContainer, "liveContainer");
        this.f438179a = liveContainer;
        this.f438180b = "Finder.FinderLiveSideBar";
        this.f438183e = new java.util.HashSet();
        this.f438189k = new java.util.ArrayList();
        this.f438193o = new pl2.l(this);
    }

    public static void e(pl2.s sVar, long j17, yz5.a aVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            xx2.l lVar = sVar.f438181c;
            if (lVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderSideBar");
                throw null;
            }
            lVar.f539518g.getClass();
            j17 = 300;
        }
        if ((i17 & 2) != 0) {
            aVar = pl2.o.f438175d;
        }
        sVar.d(j17, aVar);
    }

    public final void a(java.lang.String sceneId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sceneId, "sceneId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f438180b, "addDragBarrier ".concat(sceneId));
        this.f438183e.add(sceneId);
        xx2.l lVar = this.f438181c;
        if (lVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderSideBar");
            throw null;
        }
        lVar.f539519h.post(new xx2.g(lVar));
    }

    public final android.content.Context b() {
        android.content.Context context = this.f438188j;
        if (context != null) {
            return context;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("context");
        throw null;
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c() {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f438187i;
        if (c22849x81a93d25 != null) {
            return c22849x81a93d25;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sideBarRv");
        throw null;
    }

    public final void d(long j17, yz5.a animationEnd) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animationEnd, "animationEnd");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f438180b, "hide");
        xx2.l lVar = this.f438181c;
        if (lVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderSideBar");
            throw null;
        }
        lVar.f539516e.A = 0;
        lVar.f539518g.b(false);
        lVar.d(lVar.f539516e, 0.0f, 1.0f, j17, new xx2.e(lVar, animationEnd));
    }

    public final void f(java.lang.String sceneId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sceneId, "sceneId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f438180b, "removeDragBarrier ".concat(sceneId));
        this.f438183e.remove(sceneId);
        j(this.f438182d);
    }

    public final void g(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select position:");
        sb6.append(i17);
        sb6.append(", sideBarDataList.size:");
        java.util.ArrayList arrayList = this.f438189k;
        sb6.append(arrayList.size());
        sb6.append(", curPosition:");
        sb6.append(this.f438190l);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f438180b, sb6.toString());
        if (i17 < 0 || i17 >= arrayList.size() || this.f438190l == i17) {
            return;
        }
        this.f438190l = i17;
        int i18 = 0;
        for (java.lang.Object obj : arrayList) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            ((pl2.a) obj).f438150e = i18 == i17;
            i18 = i19;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c().mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            mo7946xf939df19.m8146xced61ae5();
        }
        c().post(new pl2.q(this));
    }

    public final void h(int i17) {
        android.view.View view = this.f438193o.f438170g;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar", "setHideBtnVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar", "setHideBtnVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void i(boolean z17, yz5.a aVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("show isShowExitBtn=");
        sb6.append(z17);
        sb6.append(" barrierSet size:");
        java.util.HashSet hashSet = this.f438183e;
        sb6.append(hashSet.size());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f438180b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        if (hashSet.size() > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "try show side bar but: barrierSet size:" + hashSet.size());
            return;
        }
        android.content.Context b17 = b();
        pf5.z zVar = pf5.z.f435481a;
        if (!(b17 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((pl2.x) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) b17).a(pl2.x.class)).f438220m.f438210g = 1;
        pl2.l lVar = this.f438193o;
        lVar.f438164a = z17;
        android.widget.ImageView imageView = lVar.f438167d;
        if (imageView != null) {
            imageView.setOnClickListener(new pl2.r(aVar));
        }
        xx2.l lVar2 = this.f438181c;
        if (lVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderSideBar");
            throw null;
        }
        lVar2.f539516e.A = 0;
        xx2.d dVar = lVar2.f539518g;
        dVar.b(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1675x7c4a0b5c.C15432x61ce4af4 c15432x61ce4af4 = lVar2.f539516e;
        xx2.f fVar = new xx2.f(lVar2);
        dVar.getClass();
        lVar2.d(c15432x61ce4af4, 0.0f, 1.0f, 300L, fVar);
    }

    public final void j(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("toggleSideBar from:");
        sb6.append(z17);
        sb6.append(", to:");
        sb6.append(z17);
        sb6.append(", barrierSet size:");
        java.util.HashSet hashSet = this.f438183e;
        sb6.append(hashSet.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f438180b, sb6.toString());
        this.f438182d = z17;
        if (z17 && hashSet.isEmpty()) {
            xx2.l lVar = this.f438181c;
            if (lVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderSideBar");
                throw null;
            }
            lVar.f539519h.post(new xx2.h(lVar));
            return;
        }
        xx2.l lVar2 = this.f438181c;
        if (lVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderSideBar");
            throw null;
        }
        lVar2.f539519h.post(new xx2.g(lVar2));
    }

    public final void k() {
        java.lang.String str = this.f438180b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "unmount");
        int childCount = c().getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = c().getChildAt(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(childAt, "getChildAt(...)");
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 w07 = c().w0(childAt);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(w07, "getChildViewHolder(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd8962 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962) childAt.findViewById(com.p314xaae8f345.mm.R.id.toa);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "Stopping sidebar item play. " + w07.m8183xf806b362());
            c14522x8ffd8962.mo58404x360802();
            c14522x8ffd8962.mo58389x41012807();
        }
        this.f438189k.clear();
        this.f438190l = 0;
        this.f438183e.clear();
        this.f438185g = false;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c().mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            mo7946xf939df19.m8146xced61ae5();
        }
        xx2.l lVar = this.f438181c;
        if (lVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderSideBar");
            throw null;
        }
        lVar.f539517f.setVisibility(8);
        j(false);
    }
}
