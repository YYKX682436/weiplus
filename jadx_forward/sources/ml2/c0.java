package ml2;

/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final ml2.x0 f408840a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.ref.WeakReference f408841b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.ref.WeakReference f408842c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f408843d;

    /* renamed from: i, reason: collision with root package name */
    public boolean f408848i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.reflect.Method f408852m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.reflect.Method f408853n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.reflect.Method f408854o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f408855p;

    /* renamed from: q, reason: collision with root package name */
    public final ml2.a0 f408856q;

    /* renamed from: r, reason: collision with root package name */
    public final ml2.b0 f408857r;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f408844e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f408845f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f408846g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f408847h = new java.util.HashMap();

    /* renamed from: j, reason: collision with root package name */
    public ml2.x1 f408849j = ml2.x1.f409735f;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f408850k = "";

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String[] f408851l = {com.p314xaae8f345.p457x3304c6.C3964x9fa34f55.f15753xdc29ea5a, "temp_6"};

    public c0(ml2.x0 x0Var) {
        this.f408840a = x0Var;
        try {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2669x49b0bd5a.C21846xfa0c4744 c21846xfa0c4744 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2669x49b0bd5a.C21846xfa0c4744.f39422x4fbc8495;
            java.lang.Class cls = java.lang.Integer.TYPE;
            java.lang.reflect.Method declaredMethod = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2669x49b0bd5a.C21846xfa0c4744.class.getDeclaredMethod("monitor", android.view.View.class, java.lang.Object.class, cls, cls);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredMethod, "getDeclaredMethod(...)");
            this.f408852m = declaredMethod;
            declaredMethod.setAccessible(true);
            java.lang.reflect.Method declaredMethod2 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2669x49b0bd5a.C21846xfa0c4744.class.getDeclaredMethod("registerListener", e62.e.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredMethod2, "getDeclaredMethod(...)");
            this.f408853n = declaredMethod2;
            declaredMethod2.setAccessible(true);
            java.lang.reflect.Method declaredMethod3 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2669x49b0bd5a.C21846xfa0c4744.class.getDeclaredMethod("unregisterListener", e62.e.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredMethod3, "getDeclaredMethod(...)");
            this.f408854o = declaredMethod3;
            declaredMethod3.setAccessible(true);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HABBYGE-MALI.HellFeedSingleExposure", "init crash: " + e17.getMessage());
        }
        this.f408856q = new ml2.a0(this);
        this.f408857r = new ml2.b0(this);
    }

    public final void a() {
        java.util.HashMap hashMap = this.f408845f;
        if (!hashMap.isEmpty()) {
            java.util.Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                java.lang.Object value = ((java.util.Map.Entry) it.next()).getValue();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "<get-value>(...)");
                ml2.x0 x0Var = this.f408840a;
            }
        }
    }

    public final void b() {
        java.util.HashMap hashMap = this.f408845f;
        if (!hashMap.isEmpty()) {
            java.util.Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                java.lang.Object value = ((java.util.Map.Entry) it.next()).getValue();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "<get-value>(...)");
                ml2.f0 f0Var = (ml2.f0) value;
                ml2.x0 x0Var = this.f408840a;
                if (x0Var != null) {
                    ((ml2.b) x0Var).a(f0Var, true);
                }
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void c(com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf r86, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de r87, ml2.x1 r88, java.lang.String r89) {
        /*
            Method dump skipped, instructions count: 1883
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ml2.c0.c(com.tencent.mm.view.recyclerview.WxRecyclerAdapter, androidx.recyclerview.widget.LinearLayoutManager, ml2.x1, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(zy2.m5 m5Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de, ml2.x1 x1Var, java.lang.String str) {
        int i17;
        java.lang.String m76197x6c03c64c;
        java.lang.String str2;
        java.lang.String m76184x8010e5e4;
        int w17 = c1162x665295de.w();
        int y17 = c1162x665295de.y();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.q) m5Var).f207352e.f207067z;
        int i18 = 1;
        boolean z17 = !arrayList2.isEmpty();
        ml2.x0 x0Var = this.f408840a;
        java.util.HashMap hashMap = this.f408847h;
        if (z17 && w17 <= y17) {
            while (true) {
                if (c1162x665295de.mo7935xa188593e(w17) != null && arrayList2.size() > w17) {
                    java.lang.Object obj = arrayList2.get(w17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                    r45.mu2 mu2Var = (r45.mu2) obj;
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) mu2Var.m75936x14adae67(0);
                    java.lang.String str3 = "";
                    if (c19782x23db1cfa == null || (m76197x6c03c64c = c19782x23db1cfa.m76197x6c03c64c()) == null) {
                        i17 = i18;
                    } else {
                        if (hashMap.containsKey(m76197x6c03c64c)) {
                            i17 = i18;
                            str2 = m76197x6c03c64c;
                        } else {
                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) mu2Var.m75936x14adae67(0);
                            int i19 = (c19782x23db1cfa2 == null || c19782x23db1cfa2.m76177x2220c3f4() != i18) ? 0 : i18;
                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) mu2Var.m75936x14adae67(0);
                            str2 = m76197x6c03c64c;
                            ml2.h0 h0Var = new ml2.h0(mu2Var, w17, m76197x6c03c64c, x1Var, str, i19, (c19782x23db1cfa3 == null || (m76184x8010e5e4 = c19782x23db1cfa3.m76184x8010e5e4()) == null) ? "" : m76184x8010e5e4);
                            hashMap.put(str2, h0Var);
                            if (x0Var != null) {
                                i17 = 1;
                                ((ml2.b) x0Var).b(h0Var, true);
                            } else {
                                i17 = 1;
                            }
                        }
                        str3 = str2;
                    }
                    arrayList.add(str3);
                } else {
                    i17 = i18;
                }
                if (w17 == y17) {
                    break;
                }
                w17++;
                i18 = i17;
            }
        }
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
            java.util.Map.Entry entry = (java.util.Map.Entry) next;
            if (!arrayList.contains(entry.getKey())) {
                it.remove();
                if (x0Var != null) {
                    java.lang.Object value = entry.getValue();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "<get-value>(...)");
                }
            }
        }
        arrayList.clear();
    }
}
