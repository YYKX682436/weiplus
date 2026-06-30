package com.tencent.mm.plugin.datareport.monitor.adapter.page;

/* loaded from: classes13.dex */
public class a extends dz1.a implements cz1.b, gy1.c, ez1.a {
    public final com.tencent.mm.sdk.event.IListener B;
    public final com.tencent.mm.sdk.event.IListener C;
    public final com.tencent.mm.sdk.platformtools.r2 D;

    /* renamed from: o, reason: collision with root package name */
    public lz1.a f96743o;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.o4 f96740i = com.tencent.mm.sdk.platformtools.o4.M("mmkv_key_page_event_monitor");

    /* renamed from: m, reason: collision with root package name */
    public final hz1.b f96741m = new hz1.b();

    /* renamed from: n, reason: collision with root package name */
    public boolean f96742n = false;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f96744p = new java.util.ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public hz1.a f96745q = null;

    /* renamed from: r, reason: collision with root package name */
    public int f96746r = 0;

    /* renamed from: s, reason: collision with root package name */
    public final vz1.b f96747s = new vz1.b();

    /* renamed from: t, reason: collision with root package name */
    public hz1.a f96748t = null;

    /* renamed from: u, reason: collision with root package name */
    public hz1.a f96749u = null;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.Map f96750v = new java.util.HashMap();

    /* renamed from: w, reason: collision with root package name */
    public hz1.a f96751w = null;

    /* renamed from: x, reason: collision with root package name */
    public int f96752x = -1;

    /* renamed from: y, reason: collision with root package name */
    public boolean f96753y = false;

    /* renamed from: z, reason: collision with root package name */
    public int f96754z = 0;
    public final com.tencent.mm.sdk.platformtools.n3 A = sz1.i.e(new com.tencent.mm.sdk.platformtools.k3() { // from class: com.tencent.mm.plugin.datareport.monitor.adapter.page.a$$b
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(android.os.Message message) {
            com.tencent.mm.plugin.datareport.monitor.adapter.page.a aVar = com.tencent.mm.plugin.datareport.monitor.adapter.page.a.this;
            aVar.getClass();
            switch (message.what) {
                case 1001:
                    try {
                        nm5.d dVar = (nm5.d) message.obj;
                        aVar.Q(((java.lang.Long) dVar.a(0)).longValue(), ((java.lang.Boolean) dVar.a(1)).booleanValue(), ((java.lang.Boolean) dVar.a(2)).booleanValue(), ((java.lang.Boolean) dVar.a(3)).booleanValue());
                    } catch (java.lang.Exception e17) {
                        if (sz1.a.j()) {
                            throw e17;
                        }
                        com.tencent.mars.xlog.Log.e("Amoeba.PageEventMonitor", "[handleMessage] MSG_APP_IN throw Exception : " + e17.getMessage() + ", stackTrace : " + sz1.a.f(e17.getStackTrace()));
                        pz1.a.b(e17.getMessage() + ":" + sz1.a.f(e17.getStackTrace()));
                    }
                    return false;
                case 1002:
                    try {
                        nm5.b bVar = (nm5.b) message.obj;
                        aVar.R(((java.lang.Long) bVar.a(0)).longValue(), (java.lang.Boolean) bVar.a(1));
                    } catch (java.lang.Exception e18) {
                        if (sz1.a.j()) {
                            throw e18;
                        }
                        com.tencent.mars.xlog.Log.e("Amoeba.PageEventMonitor", "[handleMessage] MSG_APP_OUT throw Exception : " + e18.getMessage() + ", stackTrace : " + sz1.a.f(e18.getStackTrace()));
                        pz1.a.b(e18.getMessage() + ":" + sz1.a.f(e18.getStackTrace()));
                    }
                    return false;
                case 1003:
                    try {
                        java.lang.Object obj = message.obj;
                        if (obj != null) {
                            nm5.b bVar2 = (nm5.b) obj;
                            aVar.c0((hz1.a) bVar2.a(0), ((java.lang.Long) bVar2.a(1)).longValue());
                        }
                    } catch (java.lang.Exception e19) {
                        if (sz1.a.j()) {
                            throw e19;
                        }
                        com.tencent.mars.xlog.Log.e("Amoeba.PageEventMonitor", "[handleMessage] MSG_PAGE_RESUME throw Exception : " + e19.getMessage() + ", stackTrace : " + sz1.a.f(e19.getStackTrace()));
                        pz1.a.b(e19.getMessage() + ":" + sz1.a.f(e19.getStackTrace()));
                    }
                    return false;
                case 1004:
                    try {
                        aVar.U();
                    } catch (java.lang.Exception e27) {
                        if (sz1.a.j()) {
                            throw e27;
                        }
                        com.tencent.mars.xlog.Log.e("Amoeba.PageEventMonitor", "[handleMessage] MSG_CHECK_OP_PAGE_EVENT throw Exception : " + e27.getMessage() + ", stackTrace : " + sz1.a.f(e27.getStackTrace()));
                        pz1.a.b(e27.getMessage() + ":" + sz1.a.f(e27.getStackTrace()));
                    }
                    return false;
                case 1005:
                    try {
                        java.lang.Object obj2 = message.obj;
                        if (obj2 != null) {
                            nm5.c cVar = (nm5.c) obj2;
                            aVar.X(((java.lang.Integer) cVar.a(1)).intValue(), (hz1.a) cVar.a(0), ((java.lang.Long) cVar.a(2)).longValue());
                        }
                    } catch (java.lang.Exception e28) {
                        if (sz1.a.j()) {
                            throw e28;
                        }
                        com.tencent.mars.xlog.Log.e("Amoeba.PageEventMonitor", "[handleMessage] MSG_FRAGMENT_EVENT throw Exception : " + e28.getMessage() + ", stackTrace : " + sz1.a.f(e28.getStackTrace()));
                        pz1.a.b(e28.getMessage() + ":" + sz1.a.f(e28.getStackTrace()));
                    }
                    return false;
                case 1006:
                    try {
                        java.lang.Object obj3 = message.obj;
                        if (obj3 != null) {
                            nm5.b bVar3 = (nm5.b) obj3;
                            hz1.a aVar2 = (hz1.a) bVar3.a(0);
                            java.lang.Long l17 = (java.lang.Long) bVar3.a(1);
                            java.util.Map map = aVar.f96750v;
                            java.lang.Long l18 = (java.lang.Long) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(aVar2.f286287a));
                            if (l18 == null || l18.longValue() <= l17.longValue()) {
                                ((java.util.HashMap) map).remove(java.lang.Integer.valueOf(aVar2.f286287a));
                                uy1.a.a(aVar2);
                                sy1.f fVar = cy1.a.Ui().f224690m;
                                if (fVar != null) {
                                    fVar.a(aVar2);
                                }
                            }
                        }
                    } catch (java.lang.Exception e29) {
                        if (sz1.a.j()) {
                            throw e29;
                        }
                        com.tencent.mars.xlog.Log.e("Amoeba.PageEventMonitor", "[handleMessage] MSG_CLEAR_PAGE throw Exception : " + e29.getMessage() + ", stackTrace : " + sz1.a.f(e29.getStackTrace()));
                        pz1.a.b(e29.getMessage() + ":" + sz1.a.f(e29.getStackTrace()));
                    }
                    return false;
                default:
                    return false;
            }
        }
    });

    public a() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.B = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.OnPageChanegeEvent>(a0Var) { // from class: com.tencent.mm.plugin.datareport.monitor.adapter.page.PageEventMonitor$1
            {
                this.__eventId = -160926713;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.OnPageChanegeEvent onPageChanegeEvent) {
                java.util.HashMap hashMap = new java.util.HashMap();
                am.an anVar = onPageChanegeEvent.f54581g;
                java.util.HashMap hashMap2 = anVar.f6169f;
                if (hashMap2 != null && hashMap2.size() > 0) {
                    for (java.lang.Object obj : anVar.f6169f.keySet()) {
                        java.lang.Object obj2 = anVar.f6169f.get(obj);
                        if (obj != null && (obj instanceof java.lang.String) && obj2 != null) {
                            hashMap.put((java.lang.String) obj, obj2);
                        }
                    }
                }
                int i17 = anVar.f6164a;
                java.lang.String str = anVar.f6165b;
                int i18 = anVar.f6166c;
                int i19 = anVar.f6167d;
                int i27 = anVar.f6168e;
                boolean z17 = anVar.f6170g;
                boolean z18 = anVar.f6171h;
                com.tencent.mm.plugin.datareport.monitor.adapter.page.a aVar = com.tencent.mm.plugin.datareport.monitor.adapter.page.a.this;
                aVar.getClass();
                if (!u46.l.e(str) && i18 > 0) {
                    com.tencent.mars.xlog.Log.i("Amoeba.PageEventMonitor", "[pageChange] eventType " + i17 + ", pageName : " + str + ", pageHash : " + i18 + ", pageId : " + i19 + ", bizGroupId : " + i27 + ", isSubPage : " + z17 + ", isFlutterPage : " + z18);
                    hz1.a c17 = aVar.f96741m.c(i18);
                    if (c17 == null) {
                        c17 = new hz1.a(i18, str, str);
                    }
                    c17.f286292f = z17;
                    c17.f286295i = z18;
                    com.tencent.mm.sdk.platformtools.n3 n3Var = aVar.A;
                    java.lang.String str2 = c17.f286289c;
                    int i28 = c17.f286287a;
                    if (z17) {
                        if (i17 == 0) {
                            sy1.f fVar = cy1.a.Ui().f224690m;
                            if (fVar != null && !ty1.a.a().c(c17)) {
                                if (i19 > 0) {
                                    str2 = java.lang.String.valueOf(i19);
                                }
                                fVar.j(i28, str2);
                            }
                            android.os.Message obtainMessage = n3Var.obtainMessage(1005);
                            obtainMessage.obj = nm5.j.d(c17, 0, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                            n3Var.sendMessage(obtainMessage);
                        } else if (i17 == 1) {
                            android.os.Message obtainMessage2 = n3Var.obtainMessage(1005);
                            obtainMessage2.obj = nm5.j.d(c17, 1, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                            n3Var.sendMessage(obtainMessage2);
                        }
                    } else if (i17 == 0) {
                        sy1.f fVar2 = cy1.a.Ui().f224690m;
                        if (fVar2 != null && !ty1.a.a().c(c17)) {
                            if (i19 > 0) {
                                str2 = java.lang.String.valueOf(i19);
                            }
                            fVar2.j(i28, str2);
                        }
                        android.os.Message obtainMessage3 = n3Var.obtainMessage(1003);
                        obtainMessage3.obj = nm5.j.c(c17, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                        n3Var.sendMessage(obtainMessage3);
                    }
                }
                return false;
            }
        };
        this.C = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FixVasLogicEvent>(a0Var) { // from class: com.tencent.mm.plugin.datareport.monitor.adapter.page.PageEventMonitor$2
            {
                this.__eventId = 1510902591;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FixVasLogicEvent fixVasLogicEvent) {
                am.vd vdVar;
                androidx.fragment.app.Fragment fragment;
                com.tencent.mm.autogen.events.FixVasLogicEvent fixVasLogicEvent2 = fixVasLogicEvent;
                if (fixVasLogicEvent2 == null || (fragment = (vdVar = fixVasLogicEvent2.f54342g).f8191a) == null) {
                    return false;
                }
                boolean z17 = vdVar.f8192b;
                com.tencent.mm.plugin.datareport.monitor.adapter.page.a aVar = com.tencent.mm.plugin.datareport.monitor.adapter.page.a.this;
                aVar.getClass();
                androidx.fragment.app.FragmentActivity activity = fragment instanceof com.tencent.mm.ui.vas.VASCommonFragment ? ((com.tencent.mm.ui.vas.VASCommonFragment) fragment).f211121p : z17 ? fragment.getActivity() : null;
                if (activity == null || aVar.D.k(java.lang.Integer.valueOf(activity.hashCode()))) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i("Amoeba.PageEventMonitor", "[%s] fix vas logic fragment[%s] activity [%s %d] lastPage[%s]", "fix_vas_logic_event", fragment, activity, java.lang.Integer.valueOf(activity.hashCode()), aVar.f96741m.e());
                aVar.P(activity, java.lang.System.currentTimeMillis());
                return false;
            }
        };
        this.D = new com.tencent.mm.sdk.platformtools.r2(10);
    }

    @Override // gy1.c
    public void D2(androidx.fragment.app.Fragment fragment) {
        hz1.a d17;
        android.view.View view;
        com.tencent.mars.xlog.Log.i("Amoeba.PageEventMonitor", "[onFragmentResume] fragment : " + fragment);
        if (fragment == null || !cy1.a.Ui().oj()) {
            return;
        }
        android.content.ComponentCallbacks componentCallbacks = fragment instanceof com.tencent.mm.ui.vas.VASCommonFragment ? ((com.tencent.mm.ui.vas.VASCommonFragment) fragment).f211121p : null;
        hz1.b bVar = this.f96741m;
        if (componentCallbacks != null) {
            d17 = bVar.d(componentCallbacks, true);
            d17.f286292f = sz1.a.l(fragment);
            tz1.a.a(componentCallbacks);
        } else {
            d17 = bVar.d(fragment, true);
            tz1.a.a(fragment);
        }
        if (d17 == null) {
            return;
        }
        androidx.fragment.app.FragmentActivity activity = fragment.getActivity();
        com.tencent.mars.xlog.Log.i("Amoeba.PageEventMonitor", "[fragmentAppear] page : %s, isInVasNow : %b", d17, java.lang.Boolean.valueOf((activity != null && (activity instanceof com.tencent.mm.ui.vas.launcher.VASLauncher)) ? ((com.tencent.mm.ui.vas.launcher.VASLauncher) activity).f211147e : false));
        if (d17.f286292f) {
            final jz1.e Di = jz1.e.Di();
            android.content.ComponentCallbacks componentCallbacks2 = componentCallbacks != null ? componentCallbacks : fragment;
            Di.getClass();
            if (!ty1.a.a().c(new hz1.a(componentCallbacks2))) {
                Di.f302645o.add(componentCallbacks2);
                com.tencent.mars.xlog.Log.i("Amoeba.ViewExposeMonitor", "[subPageIn] subPage : " + componentCallbacks2);
            }
            sz1.i.a(new java.lang.Runnable() { // from class: jz1.e$$h
                @Override // java.lang.Runnable
                public final void run() {
                    jz1.e.this.cj(2);
                }
            });
        } else {
            jz1.e.Di().Ui(componentCallbacks != null ? componentCallbacks : fragment);
        }
        sy1.f fVar = cy1.a.Ui().f224690m;
        if (fVar != null && !ty1.a.a().c(d17)) {
            fVar.j(d17.f286287a, uy1.a.k(d17) <= 0 ? d17.f286289c : java.lang.String.valueOf(uy1.a.k(d17)));
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.A;
        android.os.Message obtainMessage = n3Var.obtainMessage(1005);
        obtainMessage.obj = nm5.j.d(d17, 0, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        n3Var.sendMessage(obtainMessage);
        vz1.a aVar = new vz1.a() { // from class: com.tencent.mm.plugin.datareport.monitor.adapter.page.a$$a
            @Override // vz1.a
            public final void a(java.lang.Object obj) {
                com.tencent.mm.plugin.datareport.monitor.adapter.page.a aVar2 = com.tencent.mm.plugin.datareport.monitor.adapter.page.a.this;
                aVar2.getClass();
                if (obj instanceof hz1.a) {
                    aVar2.V((hz1.a) obj, java.lang.System.currentTimeMillis());
                }
            }
        };
        vz1.b bVar2 = this.f96747s;
        bVar2.a(componentCallbacks, d17, aVar);
        bVar2.a(fragment, d17, new vz1.a() { // from class: com.tencent.mm.plugin.datareport.monitor.adapter.page.a$$d
            @Override // vz1.a
            public final void a(java.lang.Object obj) {
                com.tencent.mm.plugin.datareport.monitor.adapter.page.a aVar2 = com.tencent.mm.plugin.datareport.monitor.adapter.page.a.this;
                aVar2.getClass();
                if (obj instanceof hz1.a) {
                    aVar2.V((hz1.a) obj, java.lang.System.currentTimeMillis());
                }
            }
        });
        if (ty1.a.a().c(d17) || (view = fragment.getView()) == null) {
            return;
        }
        this.f96754z = fragment.hashCode();
        final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(fragment);
        view.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.datareport.monitor.adapter.page.a$$e
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.datareport.monitor.adapter.page.a aVar2 = com.tencent.mm.plugin.datareport.monitor.adapter.page.a.this;
                aVar2.getClass();
                androidx.fragment.app.Fragment fragment2 = (androidx.fragment.app.Fragment) weakReference.get();
                if (fragment2 == null || fragment2.hashCode() != aVar2.f96754z) {
                    return;
                }
                lk.a.a(fragment2);
            }
        }, 5000L);
    }

    @Override // dz1.a, nz1.b
    public void L(androidx.fragment.app.Fragment fragment) {
        hz1.a d17;
        com.tencent.mars.xlog.Log.i("Amoeba.PageEventMonitor", "[onDestroy] fragment : " + fragment);
        if (fragment == null || !cy1.a.Ui().oj() || (d17 = this.f96741m.d(fragment, true)) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Amoeba.PageEventMonitor", "[fragmentDestroy] page : " + d17);
        uy1.a.p(fragment);
        V(d17, java.lang.System.currentTimeMillis());
    }

    @Override // ez1.a
    public void Na(long j17, boolean z17, android.app.Activity activity) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[handleAppIn] activity : ");
        sb6.append(activity != null ? activity.getClass().getSimpleName() : null);
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
        Y(j17, z17, activity, this.f245094f, this.f245095g);
        this.f245094f = false;
        this.f245095g = false;
    }

    @Override // dz1.a
    public void O(android.app.Activity activity) {
        super.O(activity);
        final hz1.a d17 = this.f96741m.d(activity, true);
        this.A.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.datareport.monitor.adapter.page.a$$g
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.datareport.monitor.adapter.page.a.this.f96751w = d17;
            }
        });
    }

    public final void P(android.app.Activity activity, long j17) {
        android.view.View h17;
        gz1.d dVar;
        androidx.fragment.app.Fragment fragment;
        if (activity == null || !cy1.a.Ui().oj()) {
            return;
        }
        this.f96753y = false;
        tz1.a.a(activity);
        jz1.e.Di().Ui(activity);
        cy1.a Ui = cy1.a.Ui();
        Ui.getClass();
        android.view.Window window = activity.getWindow();
        if (window != null) {
            Ui.f224693p = new java.lang.ref.WeakReference(window);
        }
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            vy1.b j18 = uy1.a.j(activity, false);
            java.util.Map map = j18 == null ? null : j18.f441426e;
            if (map != null) {
                for (java.lang.String str : map.keySet()) {
                    sb6.append("|");
                    sb6.append(str);
                    sb6.append(":");
                    java.lang.Object obj = map.get(str);
                    java.util.Objects.requireNonNull(obj);
                    sb6.append(android.util.Base64.encodeToString(obj.toString().getBytes(java.nio.charset.StandardCharsets.UTF_8), 0));
                }
            }
            com.tencent.mm.sdk.platformtools.o4 o4Var = this.f96740i;
            o4Var.putString("mmkv_key_op_page_events", o4Var.getString("mmkv_key_op_page_events", "") + ";2," + j17 + "," + activity.getTaskId() + "," + activity.getClass().getSimpleName() + "," + activity.hashCode() + "," + uy1.a.k(activity) + "," + uy1.a.b(activity) + "," + ((java.lang.Object) sb6));
            return;
        }
        final hz1.a d17 = this.f96741m.d(activity, true);
        if (d17 == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Amoeba.PageEventMonitor", "[activityResumed] page : " + d17);
        gz1.d dVar2 = gz1.d.f277714d;
        if (gz1.d.f277723p) {
            if (gz1.d.f277726s == null) {
                gz1.d.f277726s = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_data_report_sdk_close_open_fragment_magic_window, true));
                com.tencent.mars.xlog.Log.i("Amoeba.FragmentEventMonitor", "isFilterMagicWindowDevice : " + gz1.d.f277726s);
            }
            java.lang.Boolean bool = gz1.d.f277726s;
            if ((bool != null ? bool.booleanValue() : false) && com.tencent.mm.ui.bk.v0() && com.tencent.mm.ui.bk.P(activity)) {
                com.tencent.mars.xlog.Log.i("Amoeba.FragmentEventMonitor", "onFragmentActivityResume " + activity.getClass().getSimpleName() + " isExpandStatus");
            } else {
                com.tencent.mars.xlog.Log.i("Amoeba.FragmentEventMonitor", "onFragmentActivityResume ".concat(activity.getClass().getSimpleName()));
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = gz1.d.f277719i.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    dVar = gz1.d.f277714d;
                    if (!hasNext) {
                        break;
                    }
                    gz1.b bVar = (gz1.b) gz1.d.f277717g.get((java.lang.Integer) it.next());
                    if (bVar != null && (fragment = (androidx.fragment.app.Fragment) bVar.f277702a.get()) != null && !dVar.k(fragment) && fragment.getContext() != null) {
                        android.content.Context context = fragment.getContext();
                        if ((context != null ? context.hashCode() : 0) != activity.hashCode()) {
                            bVar.f277707f = true;
                            arrayList.add(fragment);
                        }
                    }
                }
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    dVar.p((androidx.fragment.app.Fragment) it6.next(), false);
                }
                arrayList.clear();
                dVar2.a(activity);
            }
        }
        sy1.f fVar = cy1.a.Ui().f224690m;
        if (fVar != null && !ty1.a.a().c(d17)) {
            fVar.j(d17.f286287a, uy1.a.k(d17) <= 0 ? d17.f286289c : java.lang.String.valueOf(uy1.a.k(d17)));
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.A;
        android.os.Message obtainMessage = n3Var.obtainMessage(1003);
        obtainMessage.obj = nm5.j.c(d17, java.lang.Long.valueOf(j17));
        n3Var.sendMessage(obtainMessage);
        this.f96747s.a(activity, d17, new vz1.a() { // from class: com.tencent.mm.plugin.datareport.monitor.adapter.page.a$$i
            @Override // vz1.a
            public final void a(java.lang.Object obj2) {
                com.tencent.mm.plugin.datareport.monitor.adapter.page.a aVar = com.tencent.mm.plugin.datareport.monitor.adapter.page.a.this;
                aVar.getClass();
                aVar.V(d17, java.lang.System.currentTimeMillis());
            }
        });
        if (ty1.a.a().c(d17) || (h17 = sz1.a.h(activity)) == null) {
            return;
        }
        this.f96754z = activity.hashCode();
        final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(activity);
        h17.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.datareport.monitor.adapter.page.a$$j
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.datareport.monitor.adapter.page.a aVar = com.tencent.mm.plugin.datareport.monitor.adapter.page.a.this;
                aVar.getClass();
                android.app.Activity activity2 = (android.app.Activity) weakReference.get();
                if (activity2 == null || activity2.hashCode() != aVar.f96754z) {
                    return;
                }
                lk.a.a(activity2);
            }
        }, 5000L);
    }

    public final void Q(long j17, boolean z17, boolean z18, boolean z19) {
        boolean z27;
        java.util.List list;
        boolean z28;
        if (this.f96743o == null || this.f96742n) {
            return;
        }
        this.f96742n = true;
        hz1.a aVar = this.f96748t;
        java.util.List list2 = this.f96744p;
        hz1.b bVar = this.f96741m;
        if (aVar == null) {
            list = list2;
            z27 = false;
        } else {
            hz1.a aVar2 = this.f96749u;
            z27 = (aVar2 == null || aVar.f286297k == aVar2.f286297k) ? false : true;
            com.tencent.mars.xlog.Log.i("Amoeba.PageEventMonitor", "[checkAndFixPageStackWhenAppIn] isTaskChange : " + z27 + ", mLastResumedPage : " + this.f96749u + ", mCurStartedPage : " + this.f96748t + ", isSubjectiveToBack : " + z18 + ", isEnterRecntApps : " + z19);
            int i17 = this.f96748t.f286297k;
            bVar.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.ArrayList) bVar.f286303a.a(false)).iterator();
            while (it.hasNext()) {
                hz1.a aVar3 = (hz1.a) it.next();
                if (aVar3.f286297k == i17) {
                    aVar3.f286298l = false;
                    arrayList.add(aVar3);
                }
            }
            if (!arrayList.isEmpty()) {
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    hz1.a aVar4 = (hz1.a) it6.next();
                    int i18 = aVar4.f286297k;
                    hz1.a aVar5 = this.f96748t;
                    java.util.Iterator it7 = it6;
                    if (i18 == aVar5.f286297k && !aVar4.f286292f && !aVar4.d(aVar5)) {
                        aVar4.f286299m = this.f96748t.f286297k != bVar.f286305c && (z18 || z19);
                        if (!u46.l.e(aVar4.f286300n)) {
                            aVar4.f286300n = "app_switch";
                        }
                        if (aVar4.f286299m) {
                            com.tencent.mars.xlog.Log.i("Amoeba.PageEventMonitor", "[checkAndFixPageStack] background mutil task, stackPage : " + aVar4.f286289c);
                        }
                    }
                    it6 = it7;
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it8 = ((java.util.ArrayList) list2).iterator();
            while (it8.hasNext()) {
                nm5.b bVar2 = (nm5.b) it8.next();
                if (bVar2 != null) {
                    java.util.List list3 = list2;
                    arrayList2.add((hz1.a) bVar2.a(0));
                    hz1.a aVar6 = (hz1.a) bVar2.a(0);
                    if (aVar6 != null) {
                        int i19 = aVar6.f286297k;
                        int i27 = this.f96748t.f286297k;
                        if (i19 != i27) {
                            it8.remove();
                        } else if (!aVar6.f286292f) {
                            aVar6.f286299m = i27 != bVar.f286305c && (z18 || z19);
                            if (!u46.l.e(aVar6.f286300n)) {
                                aVar6.f286300n = "app_switch";
                            }
                            if (aVar6.f286299m) {
                                com.tencent.mars.xlog.Log.i("Amoeba.PageEventMonitor", "[checkAndFixPageStack] background mutil task, backgroundEventBufferPage : " + aVar6.f286289c);
                            }
                        }
                    }
                    list2 = list3;
                }
            }
            list = list2;
            hz1.a aVar7 = this.f96748t;
            if (!aVar7.f286292f) {
                aVar7.f286299m = aVar7.f286297k != bVar.f286305c && (z18 || z19);
                if (!u46.l.e(aVar7.f286300n)) {
                    this.f96748t.f286300n = "app_switch";
                }
                if (this.f96748t.f286299m) {
                    com.tencent.mars.xlog.Log.i("Amoeba.PageEventMonitor", "[checkAndFixPageStack] background mutil task, mCurStartedPage : " + this.f96748t.f286289c);
                }
            }
            if (!z18 && !z19) {
                if (u46.l.c(this.f96748t.f286289c, "LauncherUI")) {
                    this.f96753y = true;
                }
                if (sz1.a.k(this.f96748t.f286289c)) {
                    hz1.a aVar8 = this.f96748t;
                    aVar8.f286299m = false;
                    aVar8.f286300n = "screen_switch";
                    com.tencent.mm.sdk.platformtools.o4 o4Var = this.f96740i;
                    java.lang.String string = o4Var.getString("FINDER_LASTEST_ENTER_METHOD", "");
                    if (!u46.l.e(string)) {
                        try {
                            java.lang.String[] split = string.split(",");
                            if (java.lang.Boolean.parseBoolean(split[1])) {
                                this.f96748t.f286301o = "mutil_task";
                            } else {
                                this.f96748t.f286301o = split[0];
                            }
                        } catch (java.lang.Exception unused) {
                        }
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    java.lang.String str = this.f96748t.f286300n;
                    sb6.append(str != null ? str : "");
                    sb6.append(",");
                    sb6.append(this.f96748t.f286299m);
                    o4Var.putString("FINDER_LASTEST_ENTER_METHOD", sb6.toString());
                }
            }
            if (z27) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                if (!arrayList.isEmpty()) {
                    java.util.Iterator it9 = arrayList.iterator();
                    while (it9.hasNext()) {
                        hz1.a aVar9 = (hz1.a) it9.next();
                        if (aVar9.f286297k == this.f96748t.f286297k) {
                            java.util.Iterator it10 = arrayList2.iterator();
                            while (true) {
                                if (it10.hasNext()) {
                                    if (((hz1.a) it10.next()).d(aVar9)) {
                                        z28 = false;
                                        break;
                                    }
                                } else {
                                    z28 = true;
                                    break;
                                }
                            }
                            if (z28 && !aVar9.f286298l) {
                                arrayList3.add(aVar9);
                            }
                        }
                    }
                }
                hz1.a e17 = bVar.e();
                sy1.f fVar = cy1.a.Ui().f224690m;
                if (fVar != null) {
                    if (e17 != null) {
                        fVar.k(e17, j17);
                    } else {
                        fVar.k(this.f96748t, j17);
                    }
                }
                ((lz1.b) this.f96743o).b(j17, z17, true);
                this.f96746r = 0;
                this.f96745q = null;
                if (!arrayList3.isEmpty()) {
                    for (int size = arrayList3.size() - 1; size >= 0; size--) {
                        hz1.a aVar10 = (hz1.a) arrayList3.get(size);
                        if (aVar10 != null && this.f96745q == null) {
                            S(aVar10, j17);
                        }
                    }
                    java.util.Iterator it11 = arrayList3.iterator();
                    while (it11.hasNext()) {
                        hz1.a aVar11 = (hz1.a) it11.next();
                        ((lz1.b) this.f96743o).i(aVar11, j17);
                        if (aVar11.d(e17)) {
                            ((lz1.b) this.f96743o).f(aVar11, j17, false);
                        }
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.i("Amoeba.PageEventMonitor", "[appBackToFront] time : " + j17 + ", isTaskChange : " + z27 + ", processName : " + ((km0.c) gm0.j1.p().a()).f308987a);
        if (!z27) {
            ((lz1.b) this.f96743o).b(j17, z17, false);
        }
        java.util.ArrayList arrayList4 = (java.util.ArrayList) list;
        if (arrayList4.isEmpty()) {
            return;
        }
        java.util.Iterator it12 = arrayList4.iterator();
        while (it12.hasNext()) {
            nm5.b bVar3 = (nm5.b) it12.next();
            hz1.a aVar12 = (hz1.a) bVar3.a(0);
            if (aVar12 != null) {
                int intValue = ((java.lang.Integer) bVar3.a(1)).intValue();
                if (intValue == 0) {
                    W(aVar12);
                    bVar.a(aVar12);
                    ((lz1.b) this.f96743o).f(aVar12, j17, true);
                } else if (intValue == 1) {
                    if (aVar12.f286302p != this.f96748t.f286287a) {
                        ((lz1.b) this.f96743o).g(aVar12, j17, true);
                    }
                } else if (intValue == 2) {
                    c0(aVar12, j17);
                }
                com.tencent.mars.xlog.Log.i("Amoeba.PageEventMonitor", "[appBackToFront] replenish, eventType : %d, page : %s", java.lang.Integer.valueOf(intValue), aVar12.f286289c);
            }
        }
        arrayList4.clear();
    }

    public final void R(long j17, java.lang.Boolean bool) {
        if (this.f96743o == null || !this.f96742n) {
            return;
        }
        this.f96742n = false;
        com.tencent.mars.xlog.Log.i("Amoeba.PageEventMonitor", "[appFrontToBack] time : " + j17);
        ((lz1.b) this.f96743o).c(j17, bool.booleanValue());
        java.util.Iterator it = ((java.util.ArrayList) this.f96741m.f286303a.a(false)).iterator();
        while (it.hasNext()) {
            ((hz1.a) it.next()).f286298l = true;
        }
    }

    public final void S(hz1.a aVar, long j17) {
        int b17;
        if (aVar != null && (b17 = uy1.a.b(aVar)) > 0) {
            int i17 = this.f96746r;
            if (i17 == 0) {
                ((lz1.b) this.f96743o).d(aVar, j17);
                this.f96746r = b17;
                this.f96745q = aVar;
            } else if (b17 != i17) {
                ((lz1.b) this.f96743o).e(this.f96745q, j17);
                ((lz1.b) this.f96743o).d(aVar, j17);
                this.f96746r = b17;
                this.f96745q = aVar;
            }
        }
    }

    public final void T(hz1.a aVar, long j17) {
        hz1.a aVar2;
        hz1.a aVar3;
        if (aVar == null || (aVar2 = this.f96745q) == null || !aVar2.d(aVar)) {
            return;
        }
        ((lz1.b) this.f96743o).e(aVar, j17);
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f96741m.b(true);
        if (!arrayList.isEmpty()) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                aVar3 = (hz1.a) it.next();
                if (!aVar3.d(this.f96745q) && (r3 = uy1.a.b(aVar3)) > 0) {
                    break;
                }
            }
        }
        int i17 = 0;
        aVar3 = null;
        if (aVar3 == null) {
            this.f96746r = 0;
            this.f96745q = null;
        } else {
            ((lz1.b) this.f96743o).d(aVar3, j17);
            this.f96746r = i17;
            this.f96745q = aVar3;
        }
    }

    public final void U() {
        int i17;
        int i18;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mm.sdk.platformtools.o4 o4Var = this.f96740i;
            java.lang.String string = o4Var.getString("mmkv_key_op_page_events", "");
            if (u46.l.e(string)) {
                return;
            }
            o4Var.putString("mmkv_key_op_page_events", "");
            for (java.lang.String str : string.split(";")) {
                try {
                    java.lang.String[] split = str.split(",");
                    try {
                        i17 = java.lang.Integer.parseInt(split[5]);
                    } catch (java.lang.Exception unused) {
                        i17 = 0;
                    }
                    try {
                        i18 = java.lang.Integer.parseInt(split[6]);
                    } catch (java.lang.Exception unused2) {
                        i18 = 0;
                    }
                    java.util.HashMap hashMap = new java.util.HashMap();
                    char c17 = 1;
                    try {
                        java.lang.String[] split2 = split[7].split("\\|");
                        int length = split2.length;
                        int i19 = 0;
                        while (i19 < length) {
                            java.lang.String str2 = split2[i19];
                            if (!u46.l.e(str2)) {
                                java.lang.String[] split3 = str2.split(":");
                                hashMap.put(split3[0], new java.lang.String(android.util.Base64.decode(split3[c17], 0), java.nio.charset.StandardCharsets.UTF_8));
                            }
                            i19++;
                            c17 = 1;
                        }
                    } catch (java.lang.Exception unused3) {
                    }
                    int parseInt = java.lang.Integer.parseInt(split[4]);
                    java.lang.String str3 = split[3];
                    uy1.a.s(new hz1.a(parseInt, str3, str3), hashMap);
                    jz1.e.Di().f302644n = false;
                    if (java.lang.Integer.parseInt(split[0]) == 2) {
                        a0(java.lang.Long.parseLong(split[1]), split[3], java.lang.Integer.parseInt(split[4]), i17, i18, java.lang.Integer.parseInt(split[2]));
                    } else if (java.lang.Integer.parseInt(split[0]) == 3) {
                        b0(java.lang.Long.parseLong(split[1]), split[3], java.lang.Integer.parseInt(split[4]), i17, i18, java.lang.Integer.parseInt(split[2]));
                    }
                } catch (java.lang.Exception unused4) {
                }
            }
        }
    }

    public final void V(final hz1.a aVar, final long j17) {
        if (aVar == null) {
            return;
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.A;
        n3Var.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.datareport.monitor.adapter.page.a$$f
            @Override // java.lang.Runnable
            public final void run() {
                hz1.a aVar2;
                com.tencent.mm.plugin.datareport.monitor.adapter.page.a aVar3 = com.tencent.mm.plugin.datareport.monitor.adapter.page.a.this;
                hz1.b bVar = aVar3.f96741m;
                hz1.c cVar = bVar.f286303a;
                java.util.Iterator it = ((java.util.ArrayList) cVar.a(true)).iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    aVar2 = aVar;
                    if (!hasNext) {
                        break;
                    }
                    hz1.a aVar4 = (hz1.a) it.next();
                    if (aVar2.d(aVar4)) {
                        cVar.b(aVar4);
                    }
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) bVar.f286304b;
                java.util.Iterator it6 = copyOnWriteArrayList.iterator();
                while (it6.hasNext()) {
                    hz1.a aVar5 = (hz1.a) it6.next();
                    if (aVar5.d(aVar2)) {
                        arrayList.add(aVar5);
                    }
                }
                java.util.Iterator it7 = arrayList.iterator();
                while (it7.hasNext()) {
                    copyOnWriteArrayList.remove((hz1.a) it7.next());
                }
                lz1.a aVar6 = aVar3.f96743o;
                boolean z17 = aVar2.f286292f;
                long j18 = j17;
                ((lz1.b) aVar6).g(aVar2, j18, z17);
                ((lz1.b) aVar3.f96743o).j(aVar2, j18);
                aVar3.T(aVar2, j18);
            }
        });
        android.os.Message obtainMessage = n3Var.obtainMessage(1006);
        obtainMessage.obj = nm5.j.c(aVar, java.lang.Long.valueOf(j17));
        n3Var.sendMessageDelayed(obtainMessage, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
    }

    public final void W(hz1.a aVar) {
        int i17;
        int i18;
        vy1.b j17;
        if (aVar == null) {
            return;
        }
        vy1.b j18 = uy1.a.j(aVar, false);
        ty1.b bVar = null;
        boolean e17 = u46.l.e(j18 == null ? null : j18.f441423b);
        java.lang.String str = aVar.f286289c;
        if (e17 && (j17 = uy1.a.j(aVar, true)) != null && !u46.l.e(str)) {
            j17.f441423b = str;
        }
        vy1.b j19 = uy1.a.j(aVar, true);
        if (j19 != null && !u46.l.e(null)) {
            j19.f441424c = null;
        }
        ty1.a a17 = ty1.a.a();
        if (u46.l.e(str)) {
            a17.getClass();
        } else {
            bVar = (ty1.b) ((java.util.HashMap) a17.f423044a).get(str);
        }
        if (bVar != null) {
            vy1.b j27 = uy1.a.j(aVar, true);
            if (j27 != null && (i18 = bVar.f423051a) > 0) {
                j27.f441422a = i18;
            }
            vy1.b j28 = uy1.a.j(aVar, true);
            if (j28 != null && (i17 = bVar.f423052b) > 0) {
                j28.f441425d = i17;
            }
            uy1.a.t(aVar, bVar.f423054d, 0, bVar.f423055e, false, false);
        }
    }

    public final void X(int i17, hz1.a aVar, long j17) {
        if (aVar == null || this.f96743o == null || !cy1.a.Ui().oj()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Amoeba.PageEventMonitor", "[fragmentEvent] eventType " + i17 + ", page : " + aVar);
        if (!aVar.f286292f) {
            if (i17 == 0) {
                c0(aVar, j17);
                return;
            }
            return;
        }
        if (ty1.a.a().c(aVar)) {
            return;
        }
        if (this.f96742n) {
            if (i17 == 0) {
                W(aVar);
                this.f96741m.a(aVar);
                ((lz1.b) this.f96743o).f(aVar, j17, true);
                return;
            } else {
                if (i17 == 1) {
                    ((lz1.b) this.f96743o).g(aVar, j17, true);
                    return;
                }
                return;
            }
        }
        java.util.List list = this.f96744p;
        if (i17 == 0) {
            ((java.util.ArrayList) list).add(nm5.j.c(aVar, 0));
        } else if (i17 == 1) {
            ((java.util.ArrayList) list).add(nm5.j.c(aVar, 1));
        }
    }

    public void Y(long j17, boolean z17, android.app.Activity activity, boolean z18, boolean z19) {
        if (cy1.a.Ui().oj()) {
            com.tencent.mars.xlog.Log.i("Amoeba.PageEventMonitor", "[onAppIn]");
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.A;
            android.os.Message obtainMessage = n3Var.obtainMessage(1001);
            obtainMessage.obj = nm5.j.e(java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19));
            n3Var.sendMessage(obtainMessage);
            final jz1.e Di = jz1.e.Di();
            Di.getClass();
            sz1.i.c(new java.lang.Runnable() { // from class: jz1.e$$b
                @Override // java.lang.Runnable
                public final void run() {
                    jz1.e eVar = jz1.e.this;
                    if (eVar.f302649s) {
                        return;
                    }
                    eVar.f302649s = true;
                    uz1.a aVar = eVar.f302639f;
                    aVar.iterator();
                    while (aVar.hasNext()) {
                        eVar.hj((android.view.View) aVar.next(), 3);
                    }
                    eVar.cj(3);
                }
            });
            if (activity == null || this.f96742n) {
                return;
            }
            this.f96748t = this.f96741m.d(activity, true);
        }
    }

    public void Z(long j17, boolean z17, android.app.Activity activity, boolean z18) {
        if (cy1.a.Ui().oj()) {
            com.tencent.mars.xlog.Log.i("Amoeba.PageEventMonitor", "[onAppOut] isSubjectiveToBack : " + z18);
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.A;
            android.os.Message obtainMessage = n3Var.obtainMessage(1002);
            obtainMessage.obj = nm5.j.c(java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(z17));
            n3Var.sendMessage(obtainMessage);
            final jz1.e Di = jz1.e.Di();
            Di.getClass();
            sz1.i.a(new java.lang.Runnable() { // from class: jz1.e$$r
                @Override // java.lang.Runnable
                public final void run() {
                    jz1.e eVar = jz1.e.this;
                    if (eVar.f302649s) {
                        uz1.a aVar = eVar.f302639f;
                        aVar.iterator();
                        while (aVar.hasNext()) {
                            eVar.ij((android.view.View) aVar.next(), 3);
                        }
                        uz1.a aVar2 = eVar.f302647q;
                        aVar2.iterator();
                        while (aVar2.hasNext()) {
                            eVar.ij((android.view.View) aVar2.next(), 3);
                        }
                        ((java.util.ArrayList) aVar2.f432151d).clear();
                        ((java.util.WeakHashMap) eVar.f302648r).clear();
                        eVar.f302649s = false;
                    }
                }
            });
        }
    }

    public void a0(final long j17, java.lang.String str, int i17, int i18, int i19, int i27) {
        sy1.f fVar;
        if (u46.l.e(str) || i17 <= 0) {
            return;
        }
        hz1.b bVar = this.f96741m;
        final hz1.a c17 = bVar.c(i17);
        if (c17 == null) {
            c17 = new hz1.a(i17, str, str);
            c17.f286297k = i27;
        }
        java.lang.String str2 = this.f245096h;
        if (this.f96751w == null && !u46.l.e(str2)) {
            java.lang.String[] split = str2.split("\\.");
            if (split.length > 0 && u46.l.c(str, split[split.length - 1])) {
                this.f96751w = c17;
                this.f245096h = null;
            }
        }
        if (this.f96751w == null && ((java.util.ArrayList) bVar.b(true)).size() <= 0 && i27 != bVar.f286305c) {
            c17.f286299m = true;
        }
        com.tencent.mars.xlog.Log.i("Amoeba.PageEventMonitor", "[onPageEventAppear] page : %s", c17.toString());
        vy1.b j18 = uy1.a.j(c17, true);
        if (j18 != null) {
            j18.f441422a = i18;
            j18.f441425d = i19;
            j18.f441423b = str;
        }
        if (!ty1.a.a().c(c17) && (fVar = cy1.a.Ui().f224690m) != null) {
            fVar.j(c17.f286287a, uy1.a.k(c17) <= 0 ? c17.f286289c : java.lang.String.valueOf(uy1.a.k(c17)));
        }
        sz1.i.b(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.datareport.monitor.adapter.page.a$$c
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.datareport.monitor.adapter.page.a aVar = com.tencent.mm.plugin.datareport.monitor.adapter.page.a.this;
                java.util.Map map = aVar.f96750v;
                hz1.a aVar2 = c17;
                java.lang.Integer valueOf = java.lang.Integer.valueOf(aVar2.f286287a);
                long j19 = j17;
                ((java.util.HashMap) map).put(valueOf, java.lang.Long.valueOf(j19));
                aVar.c0(aVar2, j19);
            }
        });
    }

    public void b0(final long j17, java.lang.String str, int i17, int i18, int i19, int i27) {
        if (u46.l.e(str) || i17 <= 0) {
            com.tencent.mars.xlog.Log.i("Amoeba.PageEventMonitor", "[onPageEventDisappear] 1 age : %s, hash : %d", str, java.lang.Integer.valueOf(i17));
            return;
        }
        final hz1.a c17 = this.f96741m.c(i17);
        if (c17 == null) {
            com.tencent.mars.xlog.Log.i("Amoeba.PageEventMonitor", "[onPageEventDisappear] 2 page : %s, hash : %d", str, java.lang.Integer.valueOf(i17));
        } else if (uy1.a.j(c17, false) == null) {
            com.tencent.mars.xlog.Log.i("Amoeba.PageEventMonitor", "[onPageEventDisappear] 3 page : %s, hash : %d", str, java.lang.Integer.valueOf(i17));
        } else {
            com.tencent.mars.xlog.Log.i("Amoeba.PageEventMonitor", "[onPageEventDisappear] page : %s", c17.toString());
            sz1.i.b(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.datareport.monitor.adapter.page.a$$l
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.datareport.monitor.adapter.page.a aVar = com.tencent.mm.plugin.datareport.monitor.adapter.page.a.this;
                    hz1.b bVar = aVar.f96741m;
                    hz1.a e17 = bVar.e();
                    hz1.a aVar2 = c17;
                    long j18 = j17;
                    if (e17 != null && e17.d(aVar2)) {
                        java.util.Iterator it = ((java.util.ArrayList) bVar.b(true)).iterator();
                        hz1.a aVar3 = null;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            hz1.a aVar4 = (hz1.a) it.next();
                            if (aVar3 == null || !aVar3.d(aVar2)) {
                                aVar3 = aVar4;
                            } else {
                                sy1.f fVar = cy1.a.Ui().f224690m;
                                if (fVar != null && !ty1.a.a().c(aVar2)) {
                                    fVar.j(aVar2.f286287a, uy1.a.k(aVar2) <= 0 ? aVar2.f286289c : java.lang.String.valueOf(uy1.a.k(aVar2)));
                                }
                                aVar.c0(aVar4, j18);
                            }
                        }
                    }
                    aVar.V(aVar2, j18);
                }
            });
        }
    }

    @Override // ez1.a
    public void b7(long j17, boolean z17, android.app.Activity activity) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[handleAppOut] activity : ");
        sb6.append(activity != null ? activity.getClass().getSimpleName() : null);
        com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", sb6.toString());
        if (this.f245092d) {
            com.tencent.mars.xlog.Log.i("Amoeba.PageLifecycleAdapter", "[onSubjectiveToBack]");
            this.f245094f = true;
        }
        Z(j17, z17, activity, this.f245094f);
    }

    public final void c0(hz1.a aVar, long j17) {
        java.lang.String str;
        hz1.b bVar;
        boolean z17;
        boolean z18;
        hz1.a aVar2;
        boolean z19;
        boolean z27;
        int i17;
        int i18;
        hz1.a aVar3;
        boolean z28;
        int i19;
        hz1.a aVar4;
        int i27;
        if (aVar == null || this.f96743o == null) {
            return;
        }
        if (aVar.d(this.f96748t)) {
            aVar.f286299m = this.f96748t.f286299m;
            this.f96748t = null;
        }
        hz1.a aVar5 = this.f96751w;
        boolean z29 = aVar5 != null && aVar5.f286297k == aVar.f286297k;
        boolean z37 = aVar.f286299m;
        java.lang.String str2 = "";
        com.tencent.mm.sdk.platformtools.o4 o4Var = this.f96740i;
        hz1.b bVar2 = this.f96741m;
        java.lang.String str3 = aVar.f286289c;
        if (!z37 && (aVar4 = this.f96749u) != null && (i27 = aVar.f286297k) != aVar4.f286297k && !z29 && this.f96752x == -1) {
            aVar.f286299m = i27 != bVar2.f286305c;
            if (sz1.a.k(str3)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.String str4 = aVar.f286300n;
                if (str4 == null) {
                    str4 = "";
                }
                sb6.append(str4);
                sb6.append(",");
                sb6.append(aVar.f286299m);
                o4Var.putString("FINDER_LASTEST_ENTER_METHOD", sb6.toString());
            }
        }
        int i28 = bVar2.f286305c;
        if (i28 <= 0 || (i28 > (i19 = aVar.f286297k) && i19 > 0)) {
            int i29 = aVar.f286297k;
            bVar2.f286305c = i29;
            hz1.a.f286285q = i29;
        }
        this.f96749u = aVar;
        if (ty1.a.a().c(aVar) || uy1.a.c(aVar, "page_is_filter", false)) {
            return;
        }
        this.f96751w = null;
        int i37 = this.f96752x;
        if (i37 != -1) {
            if (i37 == 0) {
                aVar.f286300n = "mini_float";
                aVar.f286299m = false;
                if (sz1.a.k(str3)) {
                    java.lang.String string = o4Var.getString("FINDER_LASTEST_ENTER_METHOD", "");
                    if (!u46.l.e(string)) {
                        try {
                            java.lang.String[] split = string.split(",");
                            if (java.lang.Boolean.parseBoolean(split[1])) {
                                aVar.f286301o = "mutil_task";
                            } else {
                                aVar.f286301o = split[0];
                            }
                        } catch (java.lang.Exception unused) {
                        }
                    }
                } else {
                    aVar.f286301o = "mini_float";
                }
                i18 = -1;
            } else {
                if (i37 == 1) {
                    aVar.f286300n = "content_float";
                    aVar.f286299m = false;
                    java.util.Iterator it = ((java.util.ArrayList) bVar2.b(false)).iterator();
                    while (it.hasNext()) {
                        aVar3 = (hz1.a) it.next();
                        if (sz1.a.k(aVar3.f286289c) || u46.l.c(aVar3.f286289c, "FinderShareFeedRelUI")) {
                            z28 = true;
                            break;
                        }
                    }
                    aVar3 = null;
                    z28 = false;
                    if (!z28 || aVar3 == null) {
                        aVar.f286301o = "content_float";
                    } else if (aVar3.f286299m) {
                        aVar.f286301o = "mutil_task";
                    } else {
                        aVar.f286301o = aVar3.f286300n;
                    }
                } else if (i37 == 3) {
                    java.util.Iterator it6 = ((java.util.ArrayList) bVar2.b(false)).iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            i17 = -1;
                            break;
                        }
                        hz1.a aVar6 = (hz1.a) it6.next();
                        if (sz1.a.k(aVar6.f286289c)) {
                            i17 = aVar6.f286297k;
                            break;
                        }
                    }
                    if (i17 != -1) {
                        java.util.Iterator it7 = ((java.util.ArrayList) bVar2.b(false)).iterator();
                        while (it7.hasNext()) {
                            hz1.a aVar7 = (hz1.a) it7.next();
                            if (aVar7.f286297k == i17) {
                                aVar7.f286300n = "finder_icon";
                                aVar7.f286301o = "finder_icon";
                                aVar7.f286299m = false;
                            }
                        }
                    }
                    if (sz1.a.k(str3)) {
                        aVar.f286300n = "finder_icon";
                        aVar.f286301o = "finder_icon";
                        aVar.f286299m = false;
                    }
                }
                i18 = -1;
            }
            this.f96752x = i18;
        }
        if (!this.f96742n) {
            ((java.util.ArrayList) this.f96744p).add(nm5.j.c(aVar, 2));
            com.tencent.mars.xlog.Log.e("Amoeba.PageEventMonitor", "[pageResume] now is background, page : %s", aVar);
            return;
        }
        hz1.a e17 = bVar2.e();
        hz1.c cVar = bVar2.f286303a;
        if (e17 == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            java.util.Iterator it8 = ((java.util.ArrayList) cVar.a(false)).iterator();
            while (it8.hasNext()) {
                java.util.Iterator it9 = it8;
                hz1.a aVar8 = (hz1.a) it8.next();
                sb7.append(aVar8.f286289c);
                sb7.append("_");
                sb7.append(aVar8.f286288b);
                sb7.append("_");
                sb7.append(aVar8.f286298l);
                sb7.append(", ");
                str2 = str2;
                it8 = it9;
                bVar2 = bVar2;
            }
            str = str2;
            bVar = bVar2;
            z17 = false;
            objArr[0] = sb7.toString();
            com.tencent.mars.xlog.Log.e("Amoeba.PageEventMonitor", "[pageResume] lastPage is null, mPageStack : %s", objArr);
        } else {
            str = "";
            bVar = bVar2;
            z17 = false;
        }
        if (!uy1.a.c(aVar, "page_is_filter_same", z17) && e17 != null && e17.d(aVar)) {
            com.tencent.mars.xlog.Log.e("Amoeba.PageEventMonitor", "[pageResume] same page, page : %s, lastPage : %s", aVar, e17);
            if (sz1.a.k(str3)) {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                java.lang.String str5 = aVar.f286300n;
                sb8.append(str5 == null ? str : str5);
                sb8.append(",");
                sb8.append(aVar.f286299m);
                o4Var.putString("FINDER_LASTEST_ENTER_METHOD", sb8.toString());
                return;
            }
            return;
        }
        W(aVar);
        com.tencent.mars.xlog.Log.i("Amoeba.PageEventMonitor", "[pageResume] page : %s, lastPage : %s, time : %d", aVar, e17, java.lang.Long.valueOf(j17));
        boolean z38 = aVar.f286293g;
        if (e17 != null) {
            ((lz1.b) this.f96743o).g(e17, j17, false);
            if (z38 && e17.f286293g) {
                java.util.Iterator it10 = ((java.util.ArrayList) cVar.a(true)).iterator();
                while (true) {
                    if (!it10.hasNext()) {
                        break;
                    }
                    hz1.a aVar9 = (hz1.a) it10.next();
                    if (!aVar9.f286298l) {
                        cVar.b(aVar9);
                        break;
                    }
                }
                ((lz1.b) this.f96743o).j(e17, j17);
                T(e17, j17);
            }
        }
        if (cVar.c() > 0) {
            java.util.Iterator it11 = ((java.util.ArrayList) cVar.a(true)).iterator();
            while (it11.hasNext()) {
                hz1.a aVar10 = (hz1.a) it11.next();
                if (aVar.d(aVar10) && !aVar10.f286298l) {
                    z18 = true;
                    break;
                }
            }
        }
        z18 = false;
        if (cVar.c() > 0) {
            java.util.Iterator it12 = ((java.util.ArrayList) cVar.a(false)).iterator();
            while (it12.hasNext()) {
                aVar2 = (hz1.a) it12.next();
                if (!aVar2.f286298l) {
                    break;
                }
            }
        }
        aVar2 = null;
        if (!z38 || (z18 && aVar.d(aVar2))) {
            hz1.b bVar3 = bVar;
            if (z18) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.HashMap hashMap = new java.util.HashMap();
                java.util.Iterator it13 = ((java.util.ArrayList) cVar.a(true)).iterator();
                while (it13.hasNext()) {
                    hz1.a aVar11 = (hz1.a) it13.next();
                    if (aVar.d(aVar11)) {
                        break;
                    }
                    if (!aVar11.f286298l) {
                        arrayList.add(aVar11);
                        java.util.List list = (java.util.List) hashMap.get(java.lang.Integer.valueOf(aVar11.f286297k));
                        if (list == null) {
                            list = new java.util.ArrayList();
                            hashMap.put(java.lang.Integer.valueOf(aVar11.f286297k), list);
                        }
                        list.add(aVar11);
                    }
                }
                java.util.Iterator it14 = hashMap.keySet().iterator();
                while (it14.hasNext()) {
                    int intValue = ((java.lang.Integer) it14.next()).intValue();
                    java.util.List list2 = (java.util.List) hashMap.get(java.lang.Integer.valueOf(intValue));
                    if (intValue == bVar3.f286305c || list2.size() <= 1) {
                        java.util.Iterator it15 = list2.iterator();
                        while (it15.hasNext()) {
                            cVar.b((hz1.a) it15.next());
                        }
                    } else {
                        java.util.Iterator it16 = list2.iterator();
                        while (it16.hasNext()) {
                            ((hz1.a) it16.next()).f286298l = true;
                        }
                    }
                }
                if (arrayList.size() > 0) {
                    java.util.Iterator it17 = arrayList.iterator();
                    while (it17.hasNext()) {
                        hz1.a aVar12 = (hz1.a) it17.next();
                        ((lz1.b) this.f96743o).j(aVar12, j17);
                        T(aVar12, j17);
                    }
                }
                ((lz1.b) this.f96743o).f(aVar, j17, false);
            } else {
                java.util.Iterator it18 = ((java.util.ArrayList) cVar.a(true)).iterator();
                while (true) {
                    if (it18.hasNext()) {
                        if (((hz1.a) it18.next()).d(aVar)) {
                            z19 = true;
                            break;
                        }
                    } else {
                        z19 = false;
                        break;
                    }
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                if (z19) {
                    java.util.Iterator it19 = ((java.util.ArrayList) cVar.a(false)).iterator();
                    while (it19.hasNext()) {
                        hz1.a aVar13 = (hz1.a) it19.next();
                        int i38 = aVar13.f286297k;
                        if (i38 > 0 && i38 != bVar3.f286305c && i38 == aVar.f286297k) {
                            aVar13.f286298l = false;
                            arrayList2.add(aVar13);
                        }
                        if (aVar13.d(aVar)) {
                            break;
                        }
                    }
                }
                if (arrayList2.isEmpty()) {
                    z27 = false;
                } else {
                    z27 = true;
                    for (int size = arrayList2.size() - 1; size >= 0; size--) {
                        hz1.a aVar14 = (hz1.a) arrayList2.get(size);
                        if (aVar14 != null && this.f96745q == null) {
                            S(aVar14, j17);
                        }
                    }
                    java.util.Iterator it20 = arrayList2.iterator();
                    while (it20.hasNext()) {
                        hz1.a aVar15 = (hz1.a) it20.next();
                        aVar15.f286299m = aVar.f286299m;
                        ((lz1.b) this.f96743o).i(aVar15, j17);
                        if (aVar15.d(aVar)) {
                            ((lz1.b) this.f96743o).f(aVar15, j17, false);
                        }
                    }
                }
                if (!z27) {
                    bVar3.f(aVar);
                    S(aVar, j17);
                    ((lz1.b) this.f96743o).i(aVar, j17);
                    ((lz1.b) this.f96743o).f(aVar, j17, false);
                }
            }
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.HashMap hashMap2 = new java.util.HashMap();
            java.util.Iterator it21 = ((java.util.ArrayList) cVar.a(true)).iterator();
            while (it21.hasNext()) {
                hz1.a aVar16 = (hz1.a) it21.next();
                if (!aVar16.f286298l) {
                    arrayList3.add(aVar16);
                    java.util.List list3 = (java.util.List) hashMap2.get(java.lang.Integer.valueOf(aVar16.f286297k));
                    if (list3 == null) {
                        list3 = new java.util.ArrayList();
                        hashMap2.put(java.lang.Integer.valueOf(aVar16.f286297k), list3);
                    }
                    list3.add(aVar16);
                }
            }
            java.util.Iterator it22 = hashMap2.keySet().iterator();
            while (it22.hasNext()) {
                int intValue2 = ((java.lang.Integer) it22.next()).intValue();
                java.util.List list4 = (java.util.List) hashMap2.get(java.lang.Integer.valueOf(intValue2));
                hz1.b bVar4 = bVar;
                if (intValue2 == bVar4.f286305c || list4.size() <= 1) {
                    java.util.Iterator it23 = list4.iterator();
                    while (it23.hasNext()) {
                        cVar.b((hz1.a) it23.next());
                    }
                } else {
                    java.util.Iterator it24 = list4.iterator();
                    while (it24.hasNext()) {
                        ((hz1.a) it24.next()).f286298l = true;
                    }
                }
                bVar = bVar4;
            }
            hz1.b bVar5 = bVar;
            if (arrayList3.size() > 0) {
                java.util.Iterator it25 = arrayList3.iterator();
                while (it25.hasNext()) {
                    hz1.a aVar17 = (hz1.a) it25.next();
                    ((lz1.b) this.f96743o).j(aVar17, j17);
                    T(aVar17, j17);
                }
            }
            this.f96745q = null;
            this.f96746r = 0;
            ((lz1.b) this.f96743o).h();
            bVar5.f(aVar);
            S(aVar, j17);
            ((lz1.b) this.f96743o).i(aVar, j17);
            ((lz1.b) this.f96743o).f(aVar, j17, false);
        }
        if (sz1.a.k(str3)) {
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            java.lang.String str6 = aVar.f286300n;
            sb9.append(str6 == null ? str : str6);
            sb9.append(",");
            sb9.append(aVar.f286299m);
            o4Var.putString("FINDER_LASTEST_ENTER_METHOD", sb9.toString());
        }
    }

    @Override // dz1.a, mz1.c
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        super.onActivityCreated(activity, bundle);
        com.tencent.mars.xlog.Log.i("Amoeba.PageEventMonitor", "[onActivityCreated] activity : " + activity);
        try {
            ey1.c cVar = (ey1.c) activity.getClass().getAnnotation(ey1.c.class);
            if (cVar == null) {
                return;
            }
            int scene = cVar.scene();
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(scene);
            sb6.append(',');
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(java.lang.System.currentTimeMillis());
            g0Var.kvStat(13312, sb6.toString());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AnnotationReportParser", "[onCreate] throw Exception : " + e17.getMessage());
        }
    }

    @Override // dz1.a, mz1.c
    public void onActivityDestroyed(android.app.Activity activity) {
        hz1.b bVar;
        hz1.a d17;
        androidx.fragment.app.FragmentManager supportFragmentManager;
        java.util.List<androidx.fragment.app.Fragment> fragments;
        super.onActivityDestroyed(activity);
        com.tencent.mars.xlog.Log.i("Amoeba.PageEventMonitor", "[onActivityDestroyed] activity : " + activity);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (cy1.a.Ui().oj() && (d17 = (bVar = this.f96741m).d(activity, true)) != null) {
            com.tencent.mars.xlog.Log.i("Amoeba.PageEventMonitor", "[activityDestroy] page : " + d17);
            uy1.a.p(activity);
            V(d17, currentTimeMillis);
            if ((activity instanceof androidx.fragment.app.FragmentActivity) && (supportFragmentManager = ((androidx.fragment.app.FragmentActivity) activity).getSupportFragmentManager()) != null && (fragments = supportFragmentManager.getFragments()) != null && fragments.size() > 0) {
                for (androidx.fragment.app.Fragment fragment : fragments) {
                    hz1.a d18 = bVar.d(fragment, true);
                    if (d18 != null) {
                        com.tencent.mars.xlog.Log.i("Amoeba.PageEventMonitor", "[activityDestroy] subPage : " + d18);
                        uy1.a.p(fragment);
                        V(d18, currentTimeMillis);
                    }
                }
            }
            this.D.put(java.lang.Integer.valueOf(activity.hashCode()), 0);
        }
    }

    @Override // dz1.a, mz1.c
    public void onActivityPaused(android.app.Activity activity) {
        super.onActivityPaused(activity);
        com.tencent.mars.xlog.Log.i("Amoeba.PageEventMonitor", "[onActivityPaused] activity : " + activity);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (cy1.a.Ui().oj()) {
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                hz1.a d17 = this.f96741m.d(activity, true);
                if (d17 == null) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("Amoeba.PageEventMonitor", "[activityPaused] page : " + d17);
                if (ty1.a.a().c(d17)) {
                    return;
                }
                lk.a.a(activity);
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            vy1.b j17 = uy1.a.j(activity, false);
            java.util.Map map = j17 == null ? null : j17.f441426e;
            if (map != null) {
                for (java.lang.String str : map.keySet()) {
                    sb6.append("|");
                    sb6.append(str);
                    sb6.append(":");
                    java.lang.Object obj = map.get(str);
                    java.util.Objects.requireNonNull(obj);
                    sb6.append(android.util.Base64.encodeToString(obj.toString().getBytes(java.nio.charset.StandardCharsets.UTF_8), 0));
                }
            }
            com.tencent.mm.sdk.platformtools.o4 o4Var = this.f96740i;
            o4Var.putString("mmkv_key_op_page_events", o4Var.getString("mmkv_key_op_page_events", "") + ";3," + currentTimeMillis + "," + activity.getTaskId() + "," + activity.getClass().getSimpleName() + "," + activity.hashCode() + "," + uy1.a.k(activity) + "," + uy1.a.b(activity) + "," + ((java.lang.Object) sb6));
        }
    }

    @Override // dz1.a, mz1.c
    public void onActivityResumed(android.app.Activity activity) {
        super.onActivityResumed(activity);
        com.tencent.mars.xlog.Log.i("Amoeba.PageEventMonitor", "[onActivityResumed] activity : " + activity);
        P(activity, java.lang.System.currentTimeMillis());
    }

    @Override // dz1.a, mz1.c
    public void onActivityStarted(android.app.Activity activity) {
        super.onActivityStarted(activity);
        com.tencent.mars.xlog.Log.i("Amoeba.PageEventMonitor", "[onActivityStarted] activity : " + activity);
        final hz1.a d17 = this.f96741m.d(activity, true);
        if (this.f96753y && sz1.a.k(d17.f286289c)) {
            d17.f286299m = false;
            d17.f286301o = d17.f286300n;
            d17.f286300n = "screen_switch";
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String str = d17.f286300n;
            if (str == null) {
                str = "";
            }
            sb6.append(str);
            sb6.append(",");
            sb6.append(d17.f286299m);
            this.f96740i.putString("FINDER_LASTEST_ENTER_METHOD", sb6.toString());
        }
        this.A.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.datareport.monitor.adapter.page.a$$k
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.datareport.monitor.adapter.page.a aVar = com.tencent.mm.plugin.datareport.monitor.adapter.page.a.this;
                if (aVar.f96742n) {
                    return;
                }
                aVar.f96748t = d17;
            }
        });
    }

    @Override // dz1.a, mz1.c
    public void onActivityStopped(android.app.Activity activity) {
        super.onActivityStopped(activity);
        com.tencent.mars.xlog.Log.i("Amoeba.PageEventMonitor", "[onActivityStopped] activity : " + activity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [com.tencent.mm.ui.vas.VASActivity] */
    @Override // gy1.c
    public void w8(androidx.fragment.app.Fragment fragment) {
        hz1.a d17;
        com.tencent.mars.xlog.Log.i("Amoeba.PageEventMonitor", "[onFragmentPause] fragment : " + fragment);
        if (fragment == null || !cy1.a.Ui().oj()) {
            return;
        }
        androidx.fragment.app.Fragment fragment2 = fragment instanceof com.tencent.mm.ui.vas.VASCommonFragment ? ((com.tencent.mm.ui.vas.VASCommonFragment) fragment).f211121p : null;
        hz1.b bVar = this.f96741m;
        if (fragment2 != null) {
            d17 = bVar.d(fragment2, false);
            d17.f286292f = sz1.a.l(fragment);
        } else {
            d17 = bVar.d(fragment, false);
        }
        if (d17 == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Amoeba.PageEventMonitor", "[fragmentDisappear] page [%s] ", d17);
        if (d17.f286292f) {
            final jz1.e Di = jz1.e.Di();
            if (fragment2 != null) {
                fragment = fragment2;
            }
            Di.getClass();
            if (!ty1.a.a().c(new hz1.a(fragment))) {
                Di.f302645o.e(fragment);
                com.tencent.mars.xlog.Log.i("Amoeba.ViewExposeMonitor", "[subPageOut] subPage : " + fragment);
            }
            sz1.i.a(new java.lang.Runnable() { // from class: jz1.e$$k
                @Override // java.lang.Runnable
                public final void run() {
                    jz1.e.this.cj(2);
                }
            });
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.A;
        android.os.Message obtainMessage = n3Var.obtainMessage(1005);
        obtainMessage.obj = nm5.j.d(d17, 1, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        n3Var.sendMessage(obtainMessage);
    }
}
