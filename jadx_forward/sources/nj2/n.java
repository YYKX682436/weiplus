package nj2;

/* loaded from: classes10.dex */
public abstract class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f419374d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f419375e;

    /* renamed from: f, reason: collision with root package name */
    public final zh2.e f419376f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f419377g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f419378h;

    /* renamed from: i, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f419379i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f419380m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f419381n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f419382o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f419383p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.TextView f419384q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.ArrayList f419385r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.ArrayList f419386s;

    /* renamed from: t, reason: collision with root package name */
    public yh2.m f419387t;

    public n(android.view.View root, gk2.e liveData, zh2.e micUserInterface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micUserInterface, "micUserInterface");
        this.f419374d = root;
        this.f419375e = liveData;
        this.f419376f = micUserInterface;
        this.f419377g = j();
        this.f419378h = jz5.h.b(new nj2.m(this));
        this.f419385r = new java.util.ArrayList();
        this.f419386s = new java.util.ArrayList();
        new java.util.HashMap();
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.eki);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById;
        this.f419379i = c1163xf1deaba4;
        this.f419380m = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.eku);
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.meq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f419382o = findViewById2;
        android.view.View findViewById3 = root.findViewById(com.p314xaae8f345.mm.R.id.jjh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f419383p = findViewById3;
        android.view.View findViewById4 = root.findViewById(com.p314xaae8f345.mm.R.id.jjj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f419384q = (android.widget.TextView) findViewById4;
        this.f419381n = root.findViewById(com.p314xaae8f345.mm.R.id.jjc);
        c1163xf1deaba4.setNestedScrollingEnabled(false);
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(root.getContext()));
        findViewById3.setOnClickListener(this);
    }

    public final void a(int i17, km2.q acceptUser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(acceptUser, "acceptUser");
        gk2.e eVar = this.f419375e;
        boolean z17 = true;
        if (eVar != null && (!((mm2.y2) eVar.a(mm2.y2.class)).O6(true))) {
            z17 = false;
        }
        if (z17) {
            int j17 = h().j(acceptUser);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter = h().f();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
            if (j17 == -1 || j17 >= adapter.mo1894x7e414b06()) {
                return;
            }
            acceptUser.z();
            if (eVar != null) {
                ((mm2.o4) eVar.a(mm2.o4.class)).O7(acceptUser);
            }
            zh2.e eVar2 = this.f419376f;
            if (eVar2 != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.u7) eVar2).a(acceptUser);
            }
        }
    }

    public final void b(java.util.ArrayList arrayList) {
        dk2.xf W0;
        java.util.List list;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f419377g, "closeInvalidMicApply");
        int i17 = 0;
        for (java.lang.Object obj : arrayList) {
            int i18 = i17 + 1;
            java.lang.Object obj2 = null;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            km2.q qVar = (km2.q) obj;
            if (i17 >= 100) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f419377g, "skip closeInvalidMicApply, too many wait user:" + arrayList.size());
            } else {
                gk2.e eVar = this.f419375e;
                if (eVar != null && (list = ((mm2.o4) eVar.a(mm2.o4.class)).f410860v) != null) {
                    synchronized (list) {
                        java.util.Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            java.lang.Object next = it.next();
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((km2.q) next).f390705c, qVar.f390705c)) {
                                obj2 = next;
                                break;
                            }
                        }
                    }
                    obj2 = (km2.q) obj2;
                }
                if (obj2 == null) {
                    zh2.e eVar2 = this.f419376f;
                    if (eVar2 != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 x7Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.u7) eVar2).f196064a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x7Var.f196570q, "onCloseInvalidApplyMic " + qVar);
                        if (qVar != null && (W0 = x7Var.W0()) != null) {
                            ((dk2.r4) W0).s(1, 2, null, qVar.f390703a, qVar.f390708f, null);
                        }
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f419377g, "skip closeInvalidMicApply, " + qVar.f390706d + " is linking mic");
                }
            }
            i17 = i18;
        }
    }

    public abstract ej2.j c();

    public void d() {
        android.view.View view = this.f419374d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveBaseVisitorApplyPanelWidget", "emptyViewHide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveBaseVisitorApplyPanelWidget", "emptyViewHide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f419379i.setVisibility(0);
        android.widget.TextView textView = this.f419380m;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.view.View view2 = this.f419382o;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveBaseVisitorApplyPanelWidget", "emptyViewHide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveBaseVisitorApplyPanelWidget", "emptyViewHide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f419381n;
        if (view3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveBaseVisitorApplyPanelWidget", "emptyViewHide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveBaseVisitorApplyPanelWidget", "emptyViewHide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f419384q.setText(this.f419374d.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dvt, java.lang.Integer.valueOf(this.f419385r.size())));
    }

    public void e() {
        this.f419379i.setVisibility(8);
        android.widget.TextView textView = this.f419380m;
        if (textView != null) {
            textView.setVisibility(0);
        }
        android.view.View view = this.f419382o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveBaseVisitorApplyPanelWidget", "emptyViewShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveBaseVisitorApplyPanelWidget", "emptyViewShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f419381n;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveBaseVisitorApplyPanelWidget", "emptyViewShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveBaseVisitorApplyPanelWidget", "emptyViewShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view3 = this.f419374d;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveBaseVisitorApplyPanelWidget", "emptyViewShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveBaseVisitorApplyPanelWidget", "emptyViewShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public abstract void f();

    /* JADX WARN: Removed duplicated region for block: B:18:0x0055 A[Catch: all -> 0x00af, TryCatch #0 {, blocks: (B:4:0x0019, B:5:0x0024, B:7:0x002a, B:9:0x003a, B:11:0x0044, B:14:0x004a, B:18:0x0055, B:19:0x0057, B:25:0x0061), top: B:3:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0024 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g() {
        /*
            r14 = this;
            java.util.ArrayList r0 = r14.f419386s
            r0.clear()
            java.util.ArrayList r0 = r14.f419386s
            gk2.e r1 = r14.f419375e
            java.lang.Class<mm2.o4> r2 = mm2.o4.class
            androidx.lifecycle.c1 r1 = r1.a(r2)
            mm2.o4 r1 = (mm2.o4) r1
            java.util.List r1 = r1.f410851o
            java.lang.String r2 = "<get-linkMicUserList>(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r2)
            monitor-enter(r1)
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Laf
            r2.<init>()     // Catch: java.lang.Throwable -> Laf
            java.util.Iterator r3 = r1.iterator()     // Catch: java.lang.Throwable -> Laf
            r4 = 0
            r5 = r4
        L24:
            boolean r6 = r3.hasNext()     // Catch: java.lang.Throwable -> Laf
            if (r6 == 0) goto L65
            java.lang.Object r6 = r3.next()     // Catch: java.lang.Throwable -> Laf
            r7 = r6
            km2.q r7 = (km2.q) r7     // Catch: java.lang.Throwable -> Laf
            long r8 = r7.A     // Catch: java.lang.Throwable -> Laf
            r10 = 0
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            r9 = 1
            if (r8 <= 0) goto L52
            long r10 = c01.id.c()     // Catch: java.lang.Throwable -> Laf
            long r12 = r7.A     // Catch: java.lang.Throwable -> Laf
            int r8 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r8 <= 0) goto L52
            java.lang.String r8 = r7.f390703a     // Catch: java.lang.Throwable -> Laf
            if (r8 != 0) goto L4a
            java.lang.String r8 = ""
        L4a:
            boolean r8 = r14.l(r8)     // Catch: java.lang.Throwable -> Laf
            if (r8 != 0) goto L52
            r8 = r9
            goto L53
        L52:
            r8 = r4
        L53:
            if (r8 == 0) goto L57
            int r5 = r5 + 1
        L57:
            boolean r7 = r7.f390710h     // Catch: java.lang.Throwable -> Laf
            if (r7 != 0) goto L5e
            if (r8 != 0) goto L5e
            goto L5f
        L5e:
            r9 = r4
        L5f:
            if (r9 == 0) goto L24
            r2.add(r6)     // Catch: java.lang.Throwable -> Laf
            goto L24
        L65:
            monitor-exit(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r3 = kz5.d0.q(r2, r3)
            r1.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
        L75:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L8a
            java.lang.Object r3 = r2.next()
            km2.q r3 = (km2.q) r3
            vi2.i r4 = new vi2.i
            r4.<init>(r3)
            r1.add(r4)
            goto L75
        L8a:
            r0.addAll(r1)
            java.lang.String r0 = r14.f419377g
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "fillSearchLinkUserList timeOutSize: "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r2 = " applyRealSize: "
            r1.append(r2)
            java.util.ArrayList r2 = r14.f419386s
            int r2 = r2.size()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            return
        Laf:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nj2.n.g():void");
    }

    public final yh2.m h() {
        yh2.m mVar = this.f419387t;
        if (mVar != null) {
            return mVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
        throw null;
    }

    public final ej2.j i() {
        return (ej2.j) ((jz5.n) this.f419378h).mo141623x754a37bb();
    }

    public abstract java.lang.String j();

    public final void k(int i17, km2.q hungupUser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hungupUser, "hungupUser");
        int j17 = h().j(hungupUser);
        if (j17 == -1 || j17 >= h().c().size()) {
            return;
        }
        hungupUser.z();
        gk2.e eVar = this.f419375e;
        if (eVar != null) {
            ((mm2.o4) eVar.a(mm2.o4.class)).O7(hungupUser);
        }
        zh2.e eVar2 = this.f419376f;
        if (eVar2 != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.u7) eVar2).b(hungupUser);
        }
    }

    public final boolean l(java.lang.String userId) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userId, "userId");
        java.util.List list = ((mm2.o4) this.f419375e.a(mm2.o4.class)).f410860v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-audienceLinkMicUserList>(...)");
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                java.lang.String str = ((km2.q) obj).f390703a;
                if (str == null) {
                    str = "";
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, userId)) {
                    break;
                }
            }
        }
        return obj != null;
    }

    public void m(long j17) {
        java.util.List list;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3;
        java.util.ArrayList arrayList4;
        r45.il4 il4Var;
        java.lang.String str = this.f419377g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyPanelUpdate applyList:");
        gk2.e eVar = this.f419375e;
        java.lang.Long l17 = null;
        sb6.append(eVar != null ? ((mm2.o4) eVar.a(mm2.o4.class)).f410851o : null);
        sb6.append(" micSettingSwitchFlag:");
        gk2.e eVar2 = this.f419375e;
        if (eVar2 != null && (il4Var = ((mm2.o4) eVar2.a(mm2.o4.class)).U) != null) {
            l17 = java.lang.Long.valueOf(il4Var.f458663e);
        }
        sb6.append(l17);
        sb6.append(" micSetting:");
        sb6.append(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        gk2.e eVar3 = this.f419375e;
        if (eVar3 != null) {
            mm2.o4 o4Var = (mm2.o4) eVar3.a(mm2.o4.class);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            nj2.k kVar = nj2.k.f419371d;
            zl2.r4 r4Var = zl2.r4.f555483a;
            if (r4Var.x2(j17)) {
                java.util.List list2 = o4Var.f410851o;
                if (list2 != null) {
                    synchronized (list2) {
                        arrayList4 = new java.util.ArrayList();
                        for (java.lang.Object obj : list2) {
                            km2.q qVar = (km2.q) obj;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qVar);
                            if (((java.lang.Boolean) kVar.mo149xb9724478(qVar, 2)).booleanValue()) {
                                arrayList4.add(obj);
                            }
                        }
                    }
                    arrayList5.addAll(arrayList4);
                    java.util.List list3 = o4Var.f410851o;
                    if (list3 != null) {
                        list3.removeAll(arrayList4);
                    }
                    java.util.List list4 = o4Var.f410855q;
                    if (list4 != null) {
                        list4.removeAll(arrayList4);
                    }
                }
            } else if (r4Var.y2(j17)) {
                java.util.List list5 = o4Var.f410851o;
                if (list5 != null) {
                    synchronized (list5) {
                        arrayList3 = new java.util.ArrayList();
                        for (java.lang.Object obj2 : list5) {
                            km2.q qVar2 = (km2.q) obj2;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qVar2);
                            if (((java.lang.Boolean) kVar.mo149xb9724478(qVar2, 1)).booleanValue()) {
                                arrayList3.add(obj2);
                            }
                        }
                    }
                    arrayList5.addAll(arrayList3);
                    java.util.List list6 = o4Var.f410851o;
                    if (list6 != null) {
                        list6.removeAll(arrayList3);
                    }
                    java.util.List list7 = o4Var.f410855q;
                    if (list7 != null) {
                        list7.removeAll(arrayList3);
                    }
                }
            } else if (r4Var.w2(j17)) {
                java.util.List list8 = o4Var.f410851o;
                if (list8 != null) {
                    synchronized (list8) {
                        arrayList2 = new java.util.ArrayList();
                        for (java.lang.Object obj3 : list8) {
                            km2.q qVar3 = (km2.q) obj3;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qVar3);
                            if (((java.lang.Boolean) kVar.mo149xb9724478(qVar3, 4)).booleanValue()) {
                                arrayList2.add(obj3);
                            }
                        }
                    }
                    arrayList5.addAll(arrayList2);
                    java.util.List list9 = o4Var.f410851o;
                    if (list9 != null) {
                        list9.removeAll(arrayList2);
                    }
                    java.util.List list10 = o4Var.f410855q;
                    if (list10 != null) {
                        list10.removeAll(arrayList2);
                    }
                }
            } else if (r4Var.z2(j17) && (list = o4Var.f410851o) != null) {
                synchronized (list) {
                    arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj4 : list) {
                        km2.q qVar4 = (km2.q) obj4;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qVar4);
                        if (((java.lang.Boolean) kVar.mo149xb9724478(qVar4, 16)).booleanValue()) {
                            arrayList.add(obj4);
                        }
                    }
                }
                arrayList5.addAll(arrayList);
                java.util.List list11 = o4Var.f410851o;
                if (list11 != null) {
                    list11.removeAll(arrayList);
                }
                java.util.List list12 = o4Var.f410855q;
                if (list12 != null) {
                    list12.removeAll(arrayList);
                }
            }
            b(arrayList5);
            f();
            java.util.ArrayList arrayList6 = this.f419385r;
            if (arrayList6 == null || arrayList6.isEmpty()) {
                e();
            } else {
                d();
                h().f().m8146xced61ae5();
            }
            android.view.View view = i().f334834d;
            if (view != null && view.getVisibility() == 0) {
                g();
                ej2.j i17 = i();
                java.util.ArrayList dataList = this.f419386s;
                i17.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
                java.util.ArrayList arrayList7 = i17.f334842l;
                arrayList7.clear();
                arrayList7.addAll(dataList);
                i().a().m8146xced61ae5();
            }
        }
    }

    public void n() {
        java.lang.String str;
        km2.q qVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBind linkMicUserList:");
        gk2.e eVar = this.f419375e;
        sb6.append(eVar != null ? ((mm2.o4) eVar.a(mm2.o4.class)).f410851o : null);
        sb6.append(' ');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f419377g, sb6.toString());
        i().c();
        if (eVar != null) {
            m(((mm2.o4) eVar.a(mm2.o4.class)).U.f458662d);
            f();
            java.util.ArrayList arrayList = this.f419385r;
            if (arrayList == null || arrayList.isEmpty()) {
                e();
                return;
            }
            d();
            h().f().m8146xced61ae5();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.ArrayList<in5.c> arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                if (((in5.c) obj) instanceof vi2.j) {
                    arrayList2.add(obj);
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            for (in5.c cVar : arrayList2) {
                vi2.j jVar = cVar instanceof vi2.j ? (vi2.j) cVar : null;
                if (jVar == null || (qVar = jVar.f519085d) == null || (str = qVar.f390705c) == null) {
                    str = "";
                }
                arrayList3.add(str);
            }
            linkedList.addAll(arrayList3);
        }
    }

    public void o(boolean z17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f419377g, "keyboardChange show:" + z17 + " height:" + i17);
        ej2.j i18 = i();
        i18.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i18.f334833c, "keyboardChange show:" + z17 + " height:" + i17);
        if (z17) {
            android.view.View view = i18.f334838h;
            android.widget.TextView textView = i18.f334840j;
            if (view != null && textView != null) {
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                int marginEnd = ((android.view.ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd();
                int measuredWidth = textView.getMeasuredWidth();
                android.view.ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(marginEnd, measuredWidth + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart());
                ofInt.setDuration(300L);
                ofInt.addUpdateListener(new ej2.g(view));
                ofInt.addListener(new ej2.h(textView));
                ofInt.start();
            }
            android.view.View view2 = i18.f334834d;
            if (view2 != null) {
                view2.postDelayed(new ej2.f(i18), 100L);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator translationX;
        android.view.ViewPropertyAnimator listener;
        android.view.ViewPropertyAnimator duration;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveBaseVisitorApplyPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.jjh) {
            g();
            ej2.j i17 = i();
            java.util.ArrayList dataList = this.f419386s;
            i17.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
            java.util.ArrayList arrayList2 = i17.f334842l;
            arrayList2.clear();
            arrayList2.addAll(dataList);
            ej2.j i18 = i();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = i18.f334841k;
            if (c1163xf1deaba4 != null) {
                c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(i18.f334831a.getContext()));
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = i18.f334841k;
            if (c1163xf1deaba42 != null) {
                c1163xf1deaba42.mo7960x6cab2c8d(i18.a());
            }
            i18.a().m8146xced61ae5();
            android.widget.EditText editText = i18.f334835e;
            if (editText != null) {
                editText.postDelayed(new ej2.i(i18), 200L);
            }
            ej2.n nVar = (ej2.n) i18;
            android.view.View view2 = nVar.f334834d;
            if (view2 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/mic/search/FinderLiveVisitorApplySearchWidget", "animateShowSearchPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/search/FinderLiveVisitorApplySearchWidget", "animateShowSearchPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view3 = nVar.f334834d;
            if (view3 != null && (animate = view3.animate()) != null && (translationX = animate.translationX(0.0f)) != null && (listener = translationX.setListener(null)) != null && (duration = listener.setDuration(200L)) != null) {
                duration.start();
            }
            fj2.s.c(fj2.s.f344716a, ml2.q2.f409369w, null, null, 0, 0, 30, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveBaseVisitorApplyPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void p(long j17) {
        r45.il4 il4Var;
        r45.il4 il4Var2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMicSettingChanged micSetting:[");
        java.lang.Long l17 = null;
        gk2.e eVar = this.f419375e;
        sb6.append((eVar == null || (il4Var2 = ((mm2.o4) eVar.a(mm2.o4.class)).U) == null) ? null : java.lang.Long.valueOf(il4Var2.f458662d));
        sb6.append(':');
        if (eVar != null && (il4Var = ((mm2.o4) eVar.a(mm2.o4.class)).U) != null) {
            l17 = java.lang.Long.valueOf(il4Var.f458663e);
        }
        sb6.append(l17);
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f419377g, sb6.toString());
        m(j17);
    }

    public void q() {
        android.view.View view = i().f334834d;
        if (view != null && view.getVisibility() == 0) {
            i().a().m8146xced61ae5();
            return;
        }
        if (this.f419375e != null) {
            f();
            h().f().m8146xced61ae5();
        }
        h().f().m8146xced61ae5();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0165 A[EDGE_INSN: B:135:0x0165->B:136:0x0165 BREAK  A[LOOP:3: B:123:0x013b->B:145:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[LOOP:3: B:123:0x013b->B:145:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099 A[EDGE_INSN: B:58:0x0099->B:59:0x0099 BREAK  A[LOOP:1: B:46:0x006f->B:68:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[LOOP:1: B:46:0x006f->B:68:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r(boolean r9, km2.q r10) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nj2.n.r(boolean, km2.q):void");
    }
}
