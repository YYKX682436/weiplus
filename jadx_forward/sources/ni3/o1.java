package ni3;

/* loaded from: classes10.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f419187a;

    /* renamed from: b, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f419188b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f419189c;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f419190d;

    /* renamed from: e, reason: collision with root package name */
    public yr2.k f419191e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa f419192f;

    /* renamed from: g, reason: collision with root package name */
    public cw2.f8 f419193g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.concurrent.ConcurrentHashMap f419194h;

    /* renamed from: i, reason: collision with root package name */
    public long f419195i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f419196j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f419197k;

    /* renamed from: l, reason: collision with root package name */
    public final ni3.b1 f419198l;

    public o1() {
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        this.f419187a = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a);
        this.f419196j = new java.util.concurrent.CopyOnWriteArrayList();
        this.f419197k = new java.util.concurrent.CopyOnWriteArrayList();
        this.f419198l = new ni3.b1();
    }

    public static final void a(ni3.o1 o1Var) {
        java.lang.String mo56696x9040359a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = o1Var.f419194h;
        java.lang.Object obj = null;
        if (concurrentHashMap == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sourceLife");
            throw null;
        }
        ni3.p0 p0Var = (ni3.p0) concurrentHashMap.get(java.lang.Long.valueOf(o1Var.f419195i));
        if (p0Var == null) {
            return;
        }
        ni3.o0 o0Var = p0Var.f419204b;
        int i17 = o0Var.f419183d;
        yr2.k kVar = o1Var.f419191e;
        if (kVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("model");
            throw null;
        }
        int i18 = kVar.f546218b;
        int i19 = kVar.f546219c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkPlayFeed pos:");
        sb6.append(i17);
        sb6.append(' ');
        sb6.append(o0Var);
        sb6.append(" checkRange[");
        sb6.append(java.lang.Math.max(0, i17 - i18));
        sb6.append(", ");
        int i27 = i17 + i19;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa = o1Var.f419192f;
        if (c13920xa5f564aa == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(ya.b.f77502x92235c1b);
            throw null;
        }
        sb6.append(java.lang.Math.min(i27, c13920xa5f564aa.size()));
        sb6.append(", ] ");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StrategyAsyncMonitor", sb6.toString());
        cw2.f8 f8Var = o1Var.f419193g;
        if (f8Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoCore");
            throw null;
        }
        android.content.Context context = o1Var.f419190d;
        if (context == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("context");
            throw null;
        }
        cw2.da S6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) f8Var.f305233h).S6(context);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = S6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) S6 : null;
        if (c15188xd8bd4bd == null || (mo56696x9040359a = c15188xd8bd4bd.mo56696x9040359a()) == null) {
            return;
        }
        boolean A0 = cu2.x.c(cu2.x.f303982a, mo56696x9040359a, false, false, false, 10, null).A0();
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(p0Var.f419205c.f419253b);
        if (A0 && j17) {
            return;
        }
        ek4.s Di = ((cf0.z) ((df0.s) i95.n0.c(df0.s.class))).Di();
        Di.getClass();
        if (Di.f335218a.containsKey(mo56696x9040359a)) {
            return;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = o1Var.f419196j;
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((ni3.j1) next).f419150a.f419203a.mo2128x1ed62e84() == p0Var.f419203a.mo2128x1ed62e84()) {
                obj = next;
                break;
            }
        }
        ni3.j1 j1Var = (ni3.j1) obj;
        if (j1Var != null) {
            j1Var.f419151b++;
        } else {
            j1Var = new ni3.j1(p0Var, 0);
            copyOnWriteArrayList.add(j1Var);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("StrategyAsyncMonitor", "Async.handleCheckFail " + j1Var);
    }

    public static final void b(ni3.o1 o1Var) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = o1Var.f419194h;
        if (concurrentHashMap == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sourceLife");
            throw null;
        }
        ni3.p0 p0Var = (ni3.p0) concurrentHashMap.get(java.lang.Long.valueOf(o1Var.f419195i));
        if (p0Var == null) {
            return;
        }
        ni3.o0 o0Var = p0Var.f419204b;
        int i17 = o0Var.f419183d;
        yr2.k kVar = o1Var.f419191e;
        if (kVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("model");
            throw null;
        }
        int i18 = kVar.f546218b;
        int i19 = kVar.f546219c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkPreloadFeed pos:");
        sb6.append(i17);
        sb6.append(' ');
        sb6.append(o0Var);
        sb6.append(" checkRange[");
        sb6.append(java.lang.Math.max(0, i17 - i18));
        sb6.append(", ");
        int i27 = i17 + i19;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa = o1Var.f419192f;
        if (c13920xa5f564aa == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(ya.b.f77502x92235c1b);
            throw null;
        }
        sb6.append(java.lang.Math.min(i27, c13920xa5f564aa.size()));
        sb6.append("] ");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StrategyAsyncMonitor", sb6.toString());
        cw2.f8 f8Var = o1Var.f419193g;
        if (f8Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoCore");
            throw null;
        }
        android.content.Context context = o1Var.f419190d;
        if (context == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("context");
            throw null;
        }
        cw2.da S6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) f8Var.f305233h).S6(context);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = S6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) S6 : null;
        if (c15188xd8bd4bd == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa2 = o1Var.f419192f;
        if (c13920xa5f564aa2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(ya.b.f77502x92235c1b);
            throw null;
        }
        java.util.List V0 = kz5.n0.V0(c13920xa5f564aa2);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = o1Var.f419194h;
        if (concurrentHashMap2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sourceLife");
            throw null;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        int i28 = 0;
        for (int i29 = i17 - 1; i28 < i18 && i29 >= 0; i29--) {
            so2.j5 j5Var = (so2.j5) ((java.util.ArrayList) V0).get(i29);
            if (d(j5Var) != null) {
                ni3.p0 p0Var2 = (ni3.p0) concurrentHashMap2.get(java.lang.Long.valueOf(j5Var.mo2128x1ed62e84()));
                if (p0Var2 != null) {
                    linkedHashMap.put(java.lang.Long.valueOf(j5Var.mo2128x1ed62e84()), p0Var2);
                }
                i28++;
            }
        }
        int i37 = 0;
        while (true) {
            i17++;
            if (i37 >= i19) {
                break;
            }
            java.util.ArrayList arrayList = (java.util.ArrayList) V0;
            if (i17 >= arrayList.size()) {
                break;
            }
            so2.j5 j5Var2 = (so2.j5) arrayList.get(i17);
            if (d(j5Var2) != null) {
                ni3.p0 p0Var3 = (ni3.p0) concurrentHashMap2.get(java.lang.Long.valueOf(j5Var2.mo2128x1ed62e84()));
                if (p0Var3 != null) {
                    linkedHashMap.put(java.lang.Long.valueOf(j5Var2.mo2128x1ed62e84()), p0Var3);
                }
                i37++;
            }
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("checkPreloadFeed player:");
        sb7.append(c15188xd8bd4bd.m61380xe56ce956());
        sb7.append(" list: ");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(linkedHashMap.size());
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList2.add(((ni3.p0) ((java.util.Map.Entry) it.next()).getValue()).m149667x9616526c());
        }
        sb7.append(kz5.n0.g0(arrayList2, " ", null, null, 0, null, null, 62, null));
        sb7.append(" context:");
        android.content.Context context2 = o1Var.f419190d;
        if (context2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("context");
            throw null;
        }
        sb7.append(context2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StrategyAsyncMonitor", sb7.toString());
        if (c15188xd8bd4bd.mo58787xc00617a4()) {
            cw2.e0 bufferProgressConsumer = c15188xd8bd4bd.getBufferProgressConsumer();
            if (bufferProgressConsumer != null && bufferProgressConsumer.f305197f) {
                for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
                    if (((java.lang.Number) entry.getKey()).longValue() == o1Var.f419195i) {
                        return;
                    }
                    if (((ni3.p0) entry.getValue()).f419209g.f419264a && !((ni3.p0) entry.getValue()).f419209g.f419265b) {
                        return;
                    }
                    so2.i3 c17 = cu2.x.c(cu2.x.f303982a, ((ni3.p0) entry.getValue()).f419205c.f419252a, false, false, false, 10, null);
                    boolean A0 = c17.A0();
                    boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(((ni3.p0) entry.getValue()).f419205c.f419253b);
                    if (!A0 || !j17) {
                        if (c17.f68968x799e9d9e < ((ni3.p0) entry.getValue()).f419209g.f419267d.f419269a || !j17) {
                            c(o1Var, ni3.l1.f419160d, (ni3.p0) entry.getValue(), "target:[" + ((ni3.p0) entry.getValue()).f419210h.f419267d.f419269a + ", " + ((ni3.p0) entry.getValue()).f419210h.f419267d.f419270b + "]result:[" + c17.f68968x799e9d9e + "]isExist:" + j17);
                            return;
                        }
                    }
                }
                for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
                    if (((java.lang.Number) entry2.getKey()).longValue() == o1Var.f419195i) {
                        return;
                    }
                    if (((ni3.p0) entry2.getValue()).f419210h.f419264a && !((ni3.p0) entry2.getValue()).f419210h.f419265b) {
                        return;
                    }
                    so2.i3 c18 = cu2.x.c(cu2.x.f303982a, ((ni3.p0) entry2.getValue()).f419205c.f419252a, false, false, false, 10, null);
                    boolean A02 = c18.A0();
                    boolean j18 = com.p314xaae8f345.mm.vfs.w6.j(((ni3.p0) entry2.getValue()).f419205c.f419253b);
                    if (!A02 || !j18) {
                        float ceil = (float) java.lang.Math.ceil((((float) c18.f68968x799e9d9e) * 100.0f) / ((float) c18.f68989x78351860));
                        if (ceil < ((ni3.p0) entry2.getValue()).f419210h.f419267d.f419270b || !j18) {
                            c(o1Var, ni3.l1.f419161e, (ni3.p0) entry2.getValue(), "target:[" + ((ni3.p0) entry2.getValue()).f419210h.f419267d.f419269a + ", " + ((ni3.p0) entry2.getValue()).f419210h.f419267d.f419270b + "]result:[" + c18.f68968x799e9d9e + ", " + ceil + "]isExist:" + j18 + " cacheState:" + c18.f68988x29d3a50c);
                            return;
                        }
                    }
                }
            }
        }
    }

    public static final void c(ni3.o1 o1Var, ni3.l1 l1Var, ni3.p0 p0Var, java.lang.String str) {
        java.lang.Object obj;
        java.util.Iterator it = o1Var.f419197k.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ni3.k1 k1Var = (ni3.k1) obj;
            if (k1Var.f419155b.f419203a.mo2128x1ed62e84() == p0Var.f419203a.mo2128x1ed62e84() && k1Var.f419154a == l1Var) {
                break;
            }
        }
        ni3.k1 k1Var2 = (ni3.k1) obj;
        if (k1Var2 != null) {
            k1Var2.f419156c++;
        } else {
            k1Var2 = new ni3.k1(l1Var, p0Var, 0, str);
            o1Var.f419197k.add(k1Var2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("StrategyAsyncMonitor", "async.handleCheckFail " + k1Var2);
    }

    public static final so2.j5 d(so2.j5 j5Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        if (j5Var.h() == 4) {
            boolean z17 = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = z17 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
            if ((abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null || !feedObject.m59347x965c8f17()) ? false : true) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = z17 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
                if (abstractC14490x69736cb52 != null && abstractC14490x69736cb52.getNeedToPreload()) {
                    return j5Var;
                }
            }
        }
        return null;
    }

    public final void e() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var;
        if (this.f419189c) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StrategyAsyncMonitor", "startMonitorAsync");
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f419188b;
        boolean z17 = false;
        if (r2Var2 != null && r2Var2.a()) {
            z17 = true;
        }
        if (z17 && (r2Var = this.f419188b) != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f419188b = p3325xe03a0797.p3326xc267989b.l.d(this.f419187a, null, null, new ni3.n1(this, null), 3, null);
        this.f419189c = true;
    }

    public final void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StrategyAsyncMonitor", "stopMonitor isLooping:" + this.f419189c);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f419188b;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f419189c = false;
    }
}
