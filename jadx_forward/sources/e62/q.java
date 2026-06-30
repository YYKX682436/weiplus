package e62;

/* loaded from: classes15.dex */
public final class q extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: r, reason: collision with root package name */
    public static volatile e62.q f331338r;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f331339d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f331341f;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.reflect.Field f331347o;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f331340e = java.util.Collections.synchronizedMap(new java.util.LinkedHashMap());

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f331343h = "";

    /* renamed from: i, reason: collision with root package name */
    public int f331344i = 0;

    /* renamed from: m, reason: collision with root package name */
    public final l52.j f331345m = new e62.o(this);

    /* renamed from: n, reason: collision with root package name */
    public final e62.f f331346n = new e62.p(this);

    /* renamed from: p, reason: collision with root package name */
    public int f331348p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f331349q = 0;

    /* renamed from: g, reason: collision with root package name */
    public final e62.m f331342g = new e62.m();

    public q() {
        try {
            java.lang.reflect.Field declaredField = android.widget.AbsListView.class.getDeclaredField("mMotionY");
            this.f331347o = declaredField;
            declaredField.setAccessible(true);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.SnsMonitor", e17, "SnsMonitor, crash: %s", e17.getMessage());
        }
    }

    public static e62.q a() {
        if (f331338r == null) {
            synchronized (e62.q.class) {
                if (f331338r == null) {
                    f331338r = new e62.q();
                }
            }
        }
        return f331338r;
    }

    public static boolean c(java.lang.String str) {
        if ("com.tencent.mm.plugin.sns.ui.SnsTimeLineUI".equals(str) || "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI".equals(str)) {
            return true;
        }
        return "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3".equals(str) || "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI".equals(str);
    }

    public final e62.j b(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        java.util.Map map = this.f331340e;
        if (!map.containsKey(str)) {
            if ("com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI".equals(str) || "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI".equals(str)) {
                java.lang.String str2 = "123_" + java.lang.System.currentTimeMillis();
                this.f331343h = str2;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.SnsMonitor", "curTimeSessionId %s", str2);
            }
            map.put(str, new e62.j());
        }
        return (e62.j) map.get(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(int r6, java.lang.String r7, android.app.Activity r8) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e62.q.d(int, java.lang.String, android.app.Activity):void");
    }

    public final void e(android.view.ViewGroup viewGroup) {
        try {
            this.f331349q = ((java.lang.Integer) this.f331347o.get(viewGroup)).intValue() - this.f331348p;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.SnsMonitor", e17, "SnsMonitor, beginFlingState, crash: %s", e17.getMessage());
        }
    }

    public void f(java.lang.String str) {
        java.util.List list;
        java.util.List list2;
        if (8 == g52.a.a()) {
            java.util.Iterator it = this.f331340e.values().iterator();
            while (it.hasNext()) {
                ((e62.j) it.next()).d();
            }
        } else {
            e62.j b17 = b(str);
            if (b17 != null) {
                b17.d();
            }
        }
        e62.m mVar = this.f331342g;
        mVar.getClass();
        xj0.a h17 = xj0.a.h();
        java.util.Map map = mVar.f331308b;
        yj0.d dVar = mVar.f331313g;
        h17.q(map, dVar);
        mVar.f331307a = null;
        xj0.a h18 = xj0.a.h();
        java.util.List list3 = mVar.f331310d;
        yj0.b bVar = mVar.f331314h;
        h18.getClass();
        java.util.Map map2 = yj0.a.f544172a;
        if (list3 != null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) list3;
            if (!arrayList.isEmpty() && bVar != null) {
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    android.util.Pair pair = (android.util.Pair) it6.next();
                    java.lang.String str2 = "Undefined|" + ((java.lang.String) pair.first) + "|" + ((java.lang.String) pair.second);
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) yj0.a.f544172a;
                    yj0.e eVar = (yj0.e) concurrentHashMap.get(str2);
                    if (eVar != null && (list2 = eVar.f544174b) != null) {
                        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) list2;
                        if (!copyOnWriteArrayList.isEmpty() && copyOnWriteArrayList.contains(bVar)) {
                            copyOnWriteArrayList.remove(bVar);
                            if (copyOnWriteArrayList.isEmpty() && ((java.util.concurrent.CopyOnWriteArrayList) eVar.f544173a).isEmpty()) {
                                concurrentHashMap.remove(str2);
                            }
                        }
                    }
                }
            }
        }
        xj0.a h19 = xj0.a.h();
        java.util.Map map3 = mVar.f331311e;
        h19.getClass();
        java.util.Map map4 = yj0.a.f544172a;
        if (map3 != null && bVar != null) {
            for (java.util.Map.Entry entry : ((java.util.HashMap) map3).entrySet()) {
                java.lang.String str3 = (java.lang.String) entry.getKey();
                java.util.List<android.util.Pair> list4 = (java.util.List) entry.getValue();
                if (list4 != null) {
                    for (android.util.Pair pair2 : list4) {
                        java.lang.String str4 = str3 + "_EXEC_|" + ((java.lang.String) pair2.first) + "|" + ((java.lang.String) pair2.second);
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) yj0.a.f544172a;
                        yj0.e eVar2 = (yj0.e) concurrentHashMap2.get(str4);
                        if (eVar2 != null && (list = eVar2.f544174b) != null) {
                            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = (java.util.concurrent.CopyOnWriteArrayList) list;
                            if (!copyOnWriteArrayList2.isEmpty() && copyOnWriteArrayList2.contains(bVar)) {
                                copyOnWriteArrayList2.remove(bVar);
                                if (copyOnWriteArrayList2.isEmpty() && ((java.util.concurrent.CopyOnWriteArrayList) eVar2.f544173a).isEmpty()) {
                                    concurrentHashMap2.remove(str4);
                                }
                            }
                        }
                    }
                }
            }
        }
        mVar.f331309c = null;
        xj0.a.h().o(mVar.f331312f, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.va6 va6Var;
        if (i17 == 0 && i18 == 0 && (((com.p314xaae8f345.mm.p944x882e457a.o) m1Var.mo47948x7f0c4558()).f152244b.f152233a instanceof r45.ua6)) {
            r45.ua6 ua6Var = (r45.ua6) ((com.p314xaae8f345.mm.p944x882e457a.o) m1Var.mo47948x7f0c4558()).f152244b.f152233a;
            e62.j b17 = b(this.f331339d);
            if (b17 != null) {
                java.lang.String session = ua6Var.A + "";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.SnsMonitor", "SnsMonitor, monitor, session:%s", session);
                boolean C = m1Var instanceof p94.d0 ? ((p94.d0) m1Var).C() : false;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
                l52.f fVar = b17.f331301d;
                if (fVar == null || (va6Var = fVar.f398120g) == null) {
                    return;
                }
                java.lang.String str2 = va6Var.f469584o;
                if (android.text.TextUtils.isEmpty(str2)) {
                    fVar.f398120g.f469584o = session;
                } else {
                    fVar.f398120g.f469584o = str2 + "#" + session;
                }
                java.lang.ref.WeakReference weakReference = fVar.f398137x;
                if (weakReference != null) {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) weakReference.get();
                    if (!(viewGroup instanceof android.widget.ListView) || C) {
                        return;
                    }
                    android.widget.ListView listView = (android.widget.ListView) viewGroup;
                    int count = listView.getCount() - 2;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FeedMonitor", "SnsMonitor, monitor, size:%d header:%d", java.lang.Integer.valueOf(count), java.lang.Integer.valueOf(listView.getHeaderViewsCount()));
                    java.lang.String str3 = fVar.f398120g.f469585p;
                    if (android.text.TextUtils.isEmpty(str3)) {
                        fVar.f398120g.f469585p = count + "";
                        return;
                    }
                    fVar.f398120g.f469585p = str3 + "#" + count;
                }
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/expt/hellhound/ext/sns/SnsMonitor", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/expt/hellhound/ext/sns/SnsMonitor", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/expt/hellhound/ext/sns/SnsMonitor", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/expt/hellhound/ext/sns/SnsMonitor", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
