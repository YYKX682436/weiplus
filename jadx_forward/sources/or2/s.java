package or2;

/* loaded from: classes10.dex */
public final class s extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f429204d;

    /* renamed from: e, reason: collision with root package name */
    public or2.i f429205e;

    /* renamed from: f, reason: collision with root package name */
    public int f429206f;

    /* renamed from: g, reason: collision with root package name */
    public final android.os.Handler f429207g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f429208h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f429209i;

    /* renamed from: m, reason: collision with root package name */
    public long f429210m;

    /* renamed from: n, reason: collision with root package name */
    public int f429211n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f429212o;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        if (r6 < r5) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00aa, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
    
        if (r6 < r5) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008f, code lost:
    
        if (r6 < r5) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a0, code lost:
    
        if (r6 < r5) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a8, code lost:
    
        if (r6 < r5) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: or2.s.<init>(java.lang.String):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        java.lang.String str;
        boolean z17;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae882;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/performance/FinderFpsScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        boolean z18 = this.f429212o;
        boolean z19 = this.f429209i;
        if (!z18 && !z19) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/performance/FinderFpsScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
            return;
        }
        if (z19 && !this.f429208h) {
            this.f429208h = true;
            android.content.Context context = recyclerView.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.view.Window window = ((android.app.Activity) context).getWindow();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(window, "getWindow(...)");
            int a17 = 1000 / or2.k.a(window);
            java.lang.Object layoutManager = recyclerView.getLayoutManager();
            rx2.x xVar = layoutManager instanceof rx2.x ? (rx2.x) layoutManager : null;
            if (xVar != null) {
                xVar.k(new or2.q(a17, this));
            }
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            if (n3.x0.b(recyclerView)) {
                recyclerView.addOnAttachStateChangeListener(new or2.p(recyclerView, this));
            } else {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                if (this.f429211n > 0) {
                    jSONObject.put("avgScrollCostMs", a06.d.c((((float) this.f429210m) * 1.0f) / r8));
                    or2.o.f429197a.a(this.f429204d, jSONObject);
                }
                or2.o.f429197a.b(or2.j.f429190b);
            }
        }
        android.content.Context context2 = recyclerView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type android.app.Activity");
        android.view.Window window2 = ((android.app.Activity) context2).getWindow();
        if (i17 == 0) {
            str = "(Landroidx/recyclerview/widget/RecyclerView;I)V";
            if (recyclerView.mo7958x54496c8e() == 0) {
                recyclerView.post(new or2.r(this));
            }
        } else if ((i17 == 1 || i17 == 2) && this.f429206f == 0) {
            or2.i iVar = this.f429205e;
            if (iVar != null) {
                iVar.a();
            }
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = or2.u.f429214a;
            or2.u.f429215b--;
            or2.u.f429217d--;
            java.lang.String str3 = this.f429204d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(window2);
            android.os.Handler handler = this.f429207g;
            java.lang.Object tag = recyclerView.getTag(com.p314xaae8f345.mm.R.id.tcy);
            java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
            str = "(Landroidx/recyclerview/widget/RecyclerView;I)V";
            or2.i iVar2 = new or2.i(str3, recyclerView, window2, handler, bool != null ? bool.booleanValue() : false, this.f429209i);
            android.content.Context context3 = recyclerView.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
            or2.h hVar = iVar2.f429185i;
            long j17 = hVar.f429168h;
            long j18 = 0;
            if (hVar.f429167g <= 0) {
                hVar.f429167g = java.lang.System.nanoTime();
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                iVar2.f429186j = hVar.f429167g;
                iVar2.f429188l = true;
                cw2.da S6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nb0) pf5.u.f435469a.e(zy2.b6.class).c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nb0.class))).S6(context3);
                if (S6 != null) {
                    cw2.wa f212140n = S6.getF212140n();
                    if (f212140n != null && (c14989xf862ae882 = f212140n.f305632f) != null) {
                        j18 = c14989xf862ae882.getFeedId();
                    }
                    hVar.f429175o = j18;
                    cw2.wa f212140n2 = S6.getF212140n();
                    if (f212140n2 == null || (c14989xf862ae88 = f212140n2.f305632f) == null || (str2 = hc2.b0.g(c14989xf862ae88, 0, 1, null)) == null) {
                        str2 = "";
                    }
                    hVar.f429176p = str2;
                }
                iVar2.f429179c.addOnFrameMetricsAvailableListener(iVar2, iVar2.f429180d);
            }
            this.f429205e = iVar2;
            if (z19) {
                ((v40.u) ((c50.t0) i95.n0.c(c50.t0.class))).f514729e = java.lang.System.currentTimeMillis();
            }
        } else {
            str = "(Landroidx/recyclerview/widget/RecyclerView;I)V";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onScrollStateChanged newState:");
        sb6.append(i17);
        sb6.append(" lastState:");
        sb6.append(this.f429206f);
        sb6.append(" dropFrameCount:");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = or2.u.f429214a;
        sb6.append(or2.u.f429215b);
        sb6.append(" dropFramesIncreaseCount:");
        sb6.append(or2.u.f429216c);
        sb6.append(" dropFramesIncreaseCountInRuntime:");
        sb6.append(or2.u.f429217d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PerformanceDelegator", sb6.toString());
        this.f429206f = i17;
        yj0.a.h(this, "com/tencent/mm/plugin/finder/performance/FinderFpsScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", str);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        int i19;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/performance/FinderFpsScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        int i27 = this.f429206f;
        if (i27 == 1 || i27 == 2) {
            int i28 = 100;
            if (or2.u.f429215b > 0) {
                while (true) {
                    int i29 = i28 - 1;
                    if (i28 <= 0) {
                        break;
                    }
                    try {
                        java.lang.Thread.sleep(1L);
                    } catch (java.lang.Throwable unused) {
                    }
                    i28 = i29;
                }
            } else if (or2.u.f429216c > 0 && (i19 = or2.u.f429217d) >= 0) {
                int max = (int) (100 * (1 - ((java.lang.Math.max(i19, 0) * 1.0f) / or2.u.f429216c)));
                while (true) {
                    int i37 = max - 1;
                    if (max <= 0) {
                        break;
                    }
                    try {
                        java.lang.Thread.sleep(1L);
                    } catch (java.lang.Throwable unused2) {
                    }
                    max = i37;
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/performance/FinderFpsScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
