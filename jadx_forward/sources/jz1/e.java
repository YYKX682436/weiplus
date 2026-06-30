package jz1;

@j95.b
/* loaded from: classes13.dex */
public class e extends i95.w implements dy1.u {
    public static final java.util.Map D;
    public static final java.util.Map E;
    public static volatile jz1.e F;
    public final java.lang.String[] A;
    public final yj0.b B;
    public final yj0.d C;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.ref.WeakReference f384176m;

    /* renamed from: x, reason: collision with root package name */
    public int f384187x;

    /* renamed from: y, reason: collision with root package name */
    public int f384188y;

    /* renamed from: z, reason: collision with root package name */
    public long f384189z;

    /* renamed from: d, reason: collision with root package name */
    public final jz1.m f384170d = new jz1.m(this);

    /* renamed from: e, reason: collision with root package name */
    public final uz1.a f384171e = new uz1.a();

    /* renamed from: f, reason: collision with root package name */
    public final uz1.a f384172f = new uz1.a();

    /* renamed from: g, reason: collision with root package name */
    public final uz1.b f384173g = new uz1.b(com.p314xaae8f345.mm.R.id.pha);

    /* renamed from: h, reason: collision with root package name */
    public final uz1.b f384174h = new uz1.b(com.p314xaae8f345.mm.R.id.ph9);

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f384175i = new java.util.WeakHashMap();

    /* renamed from: n, reason: collision with root package name */
    public boolean f384177n = true;

    /* renamed from: o, reason: collision with root package name */
    public final uz1.a f384178o = new uz1.a();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Map f384179p = new java.util.HashMap();

    /* renamed from: q, reason: collision with root package name */
    public final uz1.a f384180q = new uz1.a();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.Map f384181r = new java.util.WeakHashMap();

    /* renamed from: s, reason: collision with root package name */
    public boolean f384182s = true;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f384183t = new java.util.ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f384184u = new java.util.ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public float f384185v = 0.0f;

    /* renamed from: w, reason: collision with root package name */
    public int f384186w = 0;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        D = hashMap;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        E = hashMap2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(android.util.Pair.create("setAlpha", "(F)V"));
        arrayList.add(android.util.Pair.create("setVisibility", "(I)V"));
        hashMap.put("android/view/View", arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(android.util.Pair.create("onScroll", "(Landroid/widget/AbsListView;III)V"));
        arrayList2.add(android.util.Pair.create("onScrollStateChanged", "(Landroid/widget/AbsListView;I)V"));
        hashMap2.put("android/widget/AbsListView$OnScrollListener", arrayList2);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(android.util.Pair.create("onScrollChange", "(Landroid/view/View;IIII)V"));
        hashMap2.put("android/view/View$OnScrollChangeListener", arrayList3);
    }

    private e() {
        new java.util.ArrayList();
        this.A = new java.lang.String[]{"live_room_card", "live_gift_thing", "transpose_video_button", "live_square_room_card", "live_square_room_card_special_column", "profile_feed_card", "profile_feed_like_tabulation", "cluster_feature_card"};
        this.B = new jz1.f(this);
        this.C = new jz1.g(this);
    }

    public static jz1.e Di() {
        if (F == null) {
            synchronized (jz1.e.class) {
                if (F == null) {
                    F = new jz1.e();
                }
            }
        }
        return F;
    }

    public static void wi(final jz1.e eVar, android.view.View view, final int i17, final int i18) {
        eVar.getClass();
        if (view == null) {
            return;
        }
        sz1.i.a(new java.lang.Runnable() { // from class: jz1.e$$q
            @Override // java.lang.Runnable
            public final void run() {
                jz1.e.this.fj(1, i17, i18);
            }
        });
    }

    public void Ai(android.view.View view) {
        if (view == null) {
            return;
        }
        if (u46.l.c(uy1.a.m(view), "order_card")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("enricwu_test", "[addMonitor] order_card, hash : %d", java.lang.Integer.valueOf(view.hashCode()));
        }
        final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(view);
        sz1.i.d(new java.lang.Runnable() { // from class: jz1.e$$j
            @Override // java.lang.Runnable
            public final void run() {
                android.view.View view2;
                jz1.e eVar = jz1.e.this;
                eVar.getClass();
                java.lang.ref.WeakReference weakReference2 = weakReference;
                if (weakReference2 == null || (view2 = (android.view.View) weakReference2.get()) == null) {
                    return;
                }
                uz1.a aVar = eVar.f384171e;
                if (aVar.m170825xde2d761f(view2)) {
                    return;
                }
                java.lang.Number number = (java.lang.Number) ((java.util.HashMap) eVar.f384179p).get(uy1.a.m(view2));
                if (number != null && number.intValue() > 50) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.ViewExposeMonitor", "viewId : %s add too much, please check or contact enricwu!", uy1.a.m(view2));
                    if (sz1.a.j() && !u46.a.b(eVar.A, uy1.a.m(view2))) {
                        iz5.a.h(java.lang.String.format("viewId : %s add too much, please check or contact enricwu!", uy1.a.m(view2)));
                        throw null;
                    }
                    eVar.Zi(uy1.a.m(view2));
                }
                aVar.add(view2);
                eVar.Ri(view2);
                eVar.Vi(1, 0L);
            }
        }, 251L);
    }

    public void Bi(android.view.View view, final dy1.t tVar) {
        if (view == null || tVar == null) {
            return;
        }
        if (u46.l.c(uy1.a.m(view), "order_card")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("enricwu_test", "[addMonitor2] order_card, hash : %d", java.lang.Integer.valueOf(view.hashCode()));
        }
        final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(view);
        sz1.i.d(new java.lang.Runnable() { // from class: jz1.e$$p
            @Override // java.lang.Runnable
            public final void run() {
                android.view.View view2;
                jz1.e eVar = jz1.e.this;
                eVar.getClass();
                java.lang.ref.WeakReference weakReference2 = weakReference;
                if (weakReference2 == null || (view2 = (android.view.View) weakReference2.get()) == null) {
                    return;
                }
                uz1.a aVar = eVar.f384171e;
                boolean m170825xde2d761f = aVar.m170825xde2d761f(view2);
                dy1.t tVar2 = tVar;
                uz1.b bVar = eVar.f384173g;
                if (m170825xde2d761f) {
                    bVar.d(view2, tVar2);
                    return;
                }
                java.lang.Number number = (java.lang.Number) ((java.util.HashMap) eVar.f384179p).get(uy1.a.m(view2));
                if (number != null && number.intValue() > 50) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.ViewExposeMonitor", "viewId : %s add too much, please check or contact enricwu!", uy1.a.m(view2));
                    if (sz1.a.j() && !u46.a.b(eVar.A, uy1.a.m(view2))) {
                        iz5.a.h(java.lang.String.format("viewId : %s add too much, please check or contact enricwu!", uy1.a.m(view2)));
                        throw null;
                    }
                    eVar.Zi(uy1.a.m(view2));
                }
                aVar.add(view2);
                bVar.d(view2, tVar2);
                eVar.Ri(view2);
                eVar.Vi(1, 0L);
            }
        }, 251L);
    }

    public final long Ni(android.view.View view) {
        if (view == null) {
            return 0L;
        }
        long g17 = uy1.a.g(view, "view_exp_min_time", 0L);
        if (g17 > 0 || cy1.a.Ui().f306219f == null) {
            return g17;
        }
        return 0L;
    }

    public final void Ri(android.view.View view) {
        android.view.View h17;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c;
        if (view == null || (h17 = sz1.a.h(view)) == null) {
            return;
        }
        if (h17.getClass().getSimpleName().equals("DecorView") && (h17 instanceof android.widget.FrameLayout) && (h17 instanceof android.view.ViewGroup) && !(h17 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) && h17.getTag(com.p314xaae8f345.mm.R.id.jqa) == null) {
            try {
                jz1.l lVar = new jz1.l(this, h17.getContext());
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Float.valueOf(2.0E-9f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(lVar, arrayList.toArray(), "com/tencent/mm/plugin/datareport/monitor/adapter/view/expose/ViewExposeMonitor", "addAssistMonitorView", "(Landroid/view/View;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                lVar.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(lVar, "com/tencent/mm/plugin/datareport/monitor/adapter/view/expose/ViewExposeMonitor", "addAssistMonitorView", "(Landroid/view/View;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(4);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(lVar, arrayList2.toArray(), "com/tencent/mm/plugin/datareport/monitor/adapter/view/expose/ViewExposeMonitor", "addAssistMonitorView", "(Landroid/view/View;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                lVar.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(lVar, "com/tencent/mm/plugin/datareport/monitor/adapter/view/expose/ViewExposeMonitor", "addAssistMonitorView", "(Landroid/view/View;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((android.view.ViewGroup) h17).addView(lVar, new android.view.ViewGroup.LayoutParams(0, 0));
                h17.setTag(com.p314xaae8f345.mm.R.id.jqa, java.lang.Boolean.TRUE);
            } catch (java.lang.Error e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.ViewExposeMonitor", "[addAssistantView] fail, view : " + h17 + ", Error : " + e17.getMessage());
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.ViewExposeMonitor", "[addAssistantView] fail, view : " + h17 + ", Exception : " + e18.getMessage());
            }
        }
        java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.p17);
        if (tag != null && (tag instanceof android.view.View.OnAttachStateChangeListener)) {
            view.removeOnAttachStateChangeListener((android.view.View.OnAttachStateChangeListener) tag);
        }
        jz1.h hVar = new jz1.h(this);
        view.addOnAttachStateChangeListener(hVar);
        view.setTag(com.p314xaae8f345.mm.R.id.p17, hVar);
        java.util.List bj6 = bj(view, h17, 0);
        if (bj6 != null) {
            java.util.ArrayList arrayList3 = (java.util.ArrayList) bj6;
            if (arrayList3.size() > 0) {
                java.util.Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    android.view.View view2 = (android.view.View) it.next();
                    if (!(view2 instanceof android.widget.ScrollView) && !(view2 instanceof android.widget.ListView)) {
                        if (view2 instanceof p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) {
                            p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) view2;
                            if (c1190x18d3c3fe != null) {
                                java.lang.Object tag2 = c1190x18d3c3fe.getTag(com.p314xaae8f345.mm.R.id.p1u);
                                if (tag2 != null && (tag2 instanceof p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener)) {
                                    c1190x18d3c3fe.m8314x7cd807d6((p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener) tag2);
                                }
                                jz1.j jVar = new jz1.j(this);
                                c1190x18d3c3fe.m8289xa5a25773(jVar);
                                c1190x18d3c3fe.setTag(com.p314xaae8f345.mm.R.id.p1u, jVar);
                            }
                        } else if (view2 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) {
                            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) view2;
                            if (c1163xf1deaba4 != null) {
                                java.lang.Object tag3 = c1163xf1deaba4.getTag(com.p314xaae8f345.mm.R.id.lqd);
                                if (tag3 != null && (tag3 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.w2)) {
                                    c1163xf1deaba4.V0((p012xc85e97e9.p103xe821e364.p104xd1075a44.w2) tag3);
                                }
                                jz1.i iVar = new jz1.i(this);
                                c1163xf1deaba4.i(iVar);
                                c1163xf1deaba4.setTag(com.p314xaae8f345.mm.R.id.lqd, iVar);
                            }
                        } else if ((view2 instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) && (c2678xa407981c = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) view2) != null) {
                            java.lang.Object tag4 = c2678xa407981c.getTag(com.p314xaae8f345.mm.R.id.f564619w7);
                            if (tag4 != null && (tag4 instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.e)) {
                                com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.e eVar = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.e) tag4;
                                java.util.List list = c2678xa407981c.f125817m;
                                if (list != null) {
                                    ((java.util.ArrayList) list).remove(eVar);
                                }
                            }
                            jz1.k kVar = new jz1.k(this, c2678xa407981c);
                            c2678xa407981c.a(kVar);
                            c2678xa407981c.setTag(com.p314xaae8f345.mm.R.id.f564619w7, kVar);
                        }
                    }
                }
            }
        }
    }

    public void Ui(java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        if (!this.f384177n && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            this.f384177n = true;
        }
        if (!ty1.a.a().c(new hz1.a(obj))) {
            this.f384176m = new java.lang.ref.WeakReference(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.ViewExposeMonitor", "[pageChange] page : " + obj);
        }
        sz1.i.a(new java.lang.Runnable() { // from class: jz1.e$$i
            @Override // java.lang.Runnable
            public final void run() {
                jz1.e.this.cj(2);
            }
        });
    }

    public void Vi(int i17, long j17) {
        jz1.m mVar = this.f384170d;
        mVar.f384235d = i17;
        sz1.i.f495473a.mo50300x3fa464aa(mVar);
        sz1.i.d(mVar, j17);
    }

    public final void Zi(java.lang.String str) {
        android.view.View view;
        if (u46.l.e(str)) {
            return;
        }
        uz1.a aVar = this.f384171e;
        aVar.iterator();
        while (true) {
            if (!aVar.hasNext()) {
                view = null;
                break;
            } else {
                view = (android.view.View) aVar.next();
                if (u46.l.c(uy1.a.m(view), str)) {
                    break;
                }
            }
        }
        if (view != null) {
            cy1.a.Ui().Mj(view);
        }
    }

    public void aj(android.view.View view) {
        if (view == null) {
            return;
        }
        if (u46.l.c(uy1.a.m(view), "order_card")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("enricwu_test", "[removeMonitor] order_card, hash : %d", java.lang.Integer.valueOf(view.hashCode()));
        }
        final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(view);
        sz1.i.d(new java.lang.Runnable() { // from class: jz1.e$$c
            @Override // java.lang.Runnable
            public final void run() {
                android.view.View view2;
                jz1.e eVar = jz1.e.this;
                eVar.getClass();
                java.lang.ref.WeakReference weakReference2 = weakReference;
                if (weakReference2 == null || (view2 = (android.view.View) weakReference2.get()) == null) {
                    return;
                }
                eVar.f384171e.e(view2);
                eVar.Vi(1, 0L);
            }
        }, 251L);
    }

    public final java.util.List bj(android.view.View view, android.view.View view2, int i17) {
        java.util.List bj6;
        if (view != null && view2 != null) {
            boolean z17 = true;
            int i18 = i17 + 1;
            if (i18 <= 99 && view != view2) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (!(view instanceof android.widget.ScrollView) && !(view instanceof android.widget.ListView) && !(view instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) && !(view instanceof p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) && !(view instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c)) {
                    z17 = false;
                }
                if (z17) {
                    arrayList.add(view);
                }
                java.lang.Object parent = view.getParent();
                if (parent != null && (parent instanceof android.view.View) && (bj6 = bj((android.view.View) parent, view2, i18)) != null && bj6.size() > 0) {
                    arrayList.addAll(bj6);
                }
                return arrayList;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.ViewExposeMonitor", "[searchScrollableViews] deep : " + i18);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0364  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [int] */
    /* JADX WARN: Type inference failed for: r17v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void cj(final int r20) {
        /*
            Method dump skipped, instructions count: 1465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jz1.e.cj(int):void");
    }

    public void fj(final int i17, int i18, int i19) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (i18 == -1 || java.lang.Math.abs(i18 - this.f384187x) > 300) {
            if ((i19 == -1 || java.lang.Math.abs(i19 - this.f384188y) > 300) && currentTimeMillis - this.f384189z > 300) {
                if (i18 != -1) {
                    this.f384187x = i18;
                }
                if (i19 != -1) {
                    this.f384188y = i19;
                }
                this.f384189z = currentTimeMillis;
                sz1.i.a(new java.lang.Runnable() { // from class: jz1.e$$f
                    @Override // java.lang.Runnable
                    public final void run() {
                        jz1.e.this.cj(i17);
                    }
                });
            }
        }
    }

    public final void hj(android.view.View view, int i17) {
        if (view != null || this.f384182s) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = uy1.a.o(view) ? uy1.a.m(view) : "";
            objArr[1] = java.lang.Integer.valueOf(view.hashCode());
            objArr[2] = java.lang.Integer.valueOf(view.getId());
            objArr[3] = view instanceof android.widget.TextView ? ((android.widget.TextView) view).getText() : "";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.ViewExposeMonitor", "[viewExpose] viewId : %s, hash : %d, resId : %d, text : %s", objArr);
            java.util.Iterator it = ((java.util.ArrayList) this.f384184u).iterator();
            while (it.hasNext()) {
                ((dy1.t) it.next()).B(view, i17);
            }
            if (((java.util.WeakHashMap) this.f384175i).get(view) != null) {
                java.util.Iterator it6 = ((java.util.ArrayList) this.f384183t).iterator();
                if (it6.hasNext()) {
                    p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it6.next());
                    throw null;
                }
            }
            dy1.t tVar = (dy1.t) this.f384173g.c(view);
            if (tVar != null) {
                tVar.B(view, i17);
            }
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(this.f384174h.c(view));
        }
    }

    public final void ij(android.view.View view, int i17) {
        if (view != null || this.f384182s) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = uy1.a.o(view) ? uy1.a.m(view) : "";
            objArr[1] = java.lang.Integer.valueOf(view.hashCode());
            objArr[2] = java.lang.Integer.valueOf(view.getId());
            objArr[3] = view instanceof android.widget.TextView ? ((android.widget.TextView) view).getText() : "";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.ViewExposeMonitor", "[viewUnExpose] viewId : %s, hash : %d, resId : %d, text : %s", objArr);
            java.util.Iterator it = ((java.util.ArrayList) this.f384184u).iterator();
            while (it.hasNext()) {
                ((dy1.t) it.next()).E(view, i17);
            }
            if (((java.util.WeakHashMap) this.f384175i).get(view) != null) {
                java.util.Iterator it6 = ((java.util.ArrayList) this.f384183t).iterator();
                if (it6.hasNext()) {
                    p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it6.next());
                    throw null;
                }
            }
            dy1.t tVar = (dy1.t) this.f384173g.c(view);
            if (tVar != null) {
                tVar.E(view, i17);
            }
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(this.f384174h.c(view));
        }
    }
}
