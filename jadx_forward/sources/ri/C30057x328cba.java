package ri;

/* renamed from: ri.n$$h */
/* loaded from: classes12.dex */
public final /* synthetic */ class C30057x328cba implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f477482a;

    public /* synthetic */ C30057x328cba(rh.c1 c1Var) {
        this.f477482a = c1Var;
    }

    @Override // wh.t0
    /* renamed from: accept */
    public final void mo40853xab27b508(java.lang.Object obj) {
        qh.b bVar = (qh.b) obj;
        final rh.c1 c1Var = this.f477482a;
        if ((c1Var instanceof gi.w0) && ((gi.w0) c1Var).P() && bVar.f444854n >= java.lang.Math.max(gi.d.f353539n, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d)) {
            final java.lang.String str = c1Var.f476870s;
            java.util.List list = ri.p.f477492a;
            if ((str.equals("module") || str.equals("biz")) && ((gi.w0) c1Var).O()) {
                c1Var.q(new wh.t0() { // from class: ri.p$$l
                    @Override // wh.t0
                    /* renamed from: accept */
                    public final void mo40853xab27b508(java.lang.Object obj2) {
                        final qh.b bVar2 = (qh.b) obj2;
                        final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
                        final rh.c1 c1Var2 = rh.c1.this;
                        gi.w0 w0Var = (gi.w0) c1Var2;
                        if ("ExplicitBgPoll".equals(w0Var.z())) {
                            atomicBoolean.set(true);
                        }
                        if (!"ExcessiveCpu".equals(w0Var.z()) || (bVar2.e() > 15 && c1Var2.s() > 2)) {
                            if (!atomicBoolean.get()) {
                                if (!(mm.o.a() || mm.o.e() || mm.m.f410058f.h())) {
                                    return;
                                }
                            }
                            final java.lang.String str2 = str;
                            c1Var2.u(uh.g.class, new wh.t0() { // from class: ri.p$$n
                                @Override // wh.t0
                                /* renamed from: accept */
                                public final void mo40853xab27b508(java.lang.Object obj3) {
                                    java.lang.String str3;
                                    java.lang.String str4;
                                    long j17;
                                    long j18;
                                    long j19;
                                    int i17;
                                    long j27;
                                    java.lang.String str5;
                                    rh.o2 t17;
                                    int i18;
                                    long j28;
                                    java.lang.String str6;
                                    rh.o2 o2Var = (rh.o2) obj3;
                                    final rh.c1 c1Var3 = rh.c1.this;
                                    rh.k1 k1Var = (rh.k1) c1Var3.w(rh.k1.class);
                                    if (k1Var == null || !k1Var.y()) {
                                        return;
                                    }
                                    gi.u0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (uh.g) o2Var.f477019c, c1Var3);
                                    java.util.concurrent.atomic.AtomicBoolean atomicBoolean2 = atomicBoolean;
                                    boolean z17 = atomicBoolean2.get();
                                    final qh.b bVar3 = bVar2;
                                    rh.d3 d3Var = o2Var.f477019c;
                                    if (!z17 || (((uh.g) d3Var).d() * 3600000.0d) / bVar3.f444854n >= 200.0d) {
                                        final long e17 = bVar3.e();
                                        int c17 = bVar3.c();
                                        int d17 = bVar3.d();
                                        int i19 = bVar3.f444850j;
                                        java.lang.String str7 = (java.lang.String) ri.i.h(bVar3).f404625a;
                                        final java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                                        linkedHashMap.put("work-id", java.lang.Integer.valueOf(c1Var3.hashCode()));
                                        linkedHashMap.put("cpu-core-num", java.lang.Integer.valueOf(wh.m.o()));
                                        linkedHashMap.put("cpu-load-prc", java.lang.Integer.valueOf(c1Var3.s()));
                                        linkedHashMap.put("cpu-load-nor", java.lang.Integer.valueOf(c1Var3.A()));
                                        gi.w0 w0Var2 = (gi.w0) c1Var3;
                                        java.util.List o17 = w0Var2.o();
                                        java.lang.String str8 = "";
                                        if (o17 == null || o17.isEmpty()) {
                                            str3 = "";
                                            str4 = str3;
                                            j17 = 0;
                                            j18 = 0;
                                            j19 = 0;
                                        } else {
                                            java.lang.String str9 = "";
                                            str3 = str9;
                                            j17 = 0;
                                            int i27 = 0;
                                            j19 = 0;
                                            while (i27 < o17.size()) {
                                                rh.o2 o2Var2 = (rh.o2) o17.get(i27);
                                                com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc c4635xec0343cc = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) o2Var2.f477019c;
                                                java.util.List list2 = o17;
                                                java.lang.String str10 = c4635xec0343cc.f134093f;
                                                long longValue = j17 + ((java.lang.Long) c4635xec0343cc.f134094g.f477085a).longValue();
                                                com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc c4635xec0343cc2 = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) o2Var2.f477019c;
                                                if (c4635xec0343cc2.f134095h.f477093a.isEmpty()) {
                                                    j28 = longValue;
                                                    str6 = "";
                                                } else {
                                                    j28 = longValue;
                                                    str6 = ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesSnapshot) c4635xec0343cc2.f134095h.f477093a.get(0)).f134099c;
                                                }
                                                if (i27 == 0) {
                                                    str9 = ri.i.g(str10);
                                                    str3 = ri.i.i(str6, -1);
                                                    j19 = c4635xec0343cc2.f134095h.f477093a.isEmpty() ? 0L : ((java.lang.Long) ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesSnapshot) c4635xec0343cc2.f134095h.f477093a.get(0)).f477085a).longValue();
                                                }
                                                i27++;
                                                o17 = list2;
                                                j17 = j28;
                                            }
                                            linkedHashMap.put("cpu-load-uid", java.lang.Integer.valueOf(((int) ((((float) j17) * 10.0f) / ((float) bVar3.f444854n))) * 100));
                                            str4 = str9;
                                            j18 = 0;
                                        }
                                        if (j17 != j18 || (t17 = c1Var3.t(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.class)) == null) {
                                            i17 = 0;
                                            j27 = j17;
                                            str5 = str3;
                                        } else {
                                            com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc c4635xec0343cc3 = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) t17.f477019c;
                                            if (c4635xec0343cc3.f134095h.f477093a.size() > 0) {
                                                i18 = 0;
                                                str8 = ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesSnapshot) c4635xec0343cc3.f134095h.f477093a.get(0)).f134099c;
                                            } else {
                                                i18 = 0;
                                            }
                                            if (c4635xec0343cc3.f134095h.f477093a.size() > 0) {
                                                j18 = ((java.lang.Long) ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesSnapshot) c4635xec0343cc3.f134095h.f477093a.get(i18)).f477085a).longValue();
                                            }
                                            j27 = ((java.lang.Long) c4635xec0343cc3.f134094g.f477085a).longValue();
                                            j19 = j18;
                                            i17 = i18;
                                            str5 = str8;
                                        }
                                        java.lang.String str11 = str5;
                                        int i28 = i17;
                                        c1Var3.u(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.class, new wh.t0() { // from class: ri.p$$b
                                            @Override // wh.t0
                                            /* renamed from: accept */
                                            public final void mo40853xab27b508(java.lang.Object obj4) {
                                                java.util.Map map;
                                                java.util.Map linkedHashMap2;
                                                boolean z18;
                                                rh.o2 o2Var3 = (rh.o2) obj4;
                                                boolean z19 = false;
                                                int i29 = 0;
                                                int i37 = 0;
                                                while (true) {
                                                    int size = ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) o2Var3.f477019c).f134095h.f477093a.size();
                                                    map = linkedHashMap;
                                                    if (i29 >= size || i37 >= 4) {
                                                        break;
                                                    }
                                                    com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesEntry threadJiffiesEntry = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesEntry) ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) o2Var3.f477019c).f134095h.f477093a.get(i29);
                                                    if (!threadJiffiesEntry.f134100d) {
                                                        java.lang.String str12 = threadJiffiesEntry.f134099c;
                                                        int i38 = threadJiffiesEntry.f134098b;
                                                        long longValue2 = ((java.lang.Long) threadJiffiesEntry.f477085a).longValue();
                                                        map.put("top" + i37 + "-thread", ri.i.i(str12, i38));
                                                        map.put("top" + i37 + "-jiffy", java.lang.Long.valueOf(longValue2 / e17));
                                                        map.put("top" + i37 + "-stat", threadJiffiesEntry.f134101e);
                                                        map.put("top" + i37 + "-tid", java.lang.Integer.valueOf(i38));
                                                        i37++;
                                                    }
                                                    i29++;
                                                }
                                                ob0.c3 c3Var = (ob0.c3) i95.n0.c(ob0.c3.class);
                                                rh.c1 c1Var4 = c1Var3;
                                                gi.w0 w0Var3 = (gi.w0) c1Var4;
                                                java.lang.String moduleName = w0Var3.z();
                                                ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.q) c3Var).getClass();
                                                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moduleName, "moduleName");
                                                boolean z27 = true;
                                                if (r26.i0.p("Finder", moduleName, true) || r26.i0.p("FinderNearby", moduleName, true) || r26.i0.p("FinderShare", moduleName, true)) {
                                                    linkedHashMap2 = new java.util.LinkedHashMap();
                                                    linkedHashMap2.put("RenderThread", kz5.c0.k("RenderThread"));
                                                    linkedHashMap2.put("mali", kz5.c0.k("mali-"));
                                                    linkedHashMap2.put("TPDecoder", kz5.c0.k("TPDecoder#"));
                                                    linkedHashMap2.put("TVKDL", kz5.c0.k("TVKDL-"));
                                                    linkedHashMap2.put("XNet", kz5.c0.k("XNet"));
                                                    linkedHashMap2.put("mars", kz5.c0.k("mars::"));
                                                    linkedHashMap2.put("UI", kz5.c0.k("com.tencent.mm"));
                                                    linkedHashMap2.put("ThreadPool", kz5.c0.k("[GT]ColdPool#", "[GT]HotPool#"));
                                                    linkedHashMap2.put("HeapTaskDaemon", kz5.c0.k("HeapTaskDaemon"));
                                                } else {
                                                    linkedHashMap2 = kz5.q0.f395534d;
                                                }
                                                for (final java.util.Map.Entry entry : linkedHashMap2.entrySet()) {
                                                    java.lang.String str13 = (java.lang.String) entry.getKey();
                                                    java.util.Iterator it = ((java.util.List) entry.getValue()).iterator();
                                                    long j29 = 0;
                                                    while (it.hasNext()) {
                                                        long N = w0Var3.N((java.lang.String) it.next(), z27, z19);
                                                        if (N >= 0) {
                                                            j29 += N;
                                                        }
                                                    }
                                                    qh.b bVar4 = bVar3;
                                                    long j37 = bVar4.f444854n;
                                                    int i39 = (int) ((j37 > 0 ? ((float) (j29 * 10)) / ((float) j37) : 0.0f) * 100.0f);
                                                    java.util.Iterator it6 = ((java.util.List) entry.getValue()).iterator();
                                                    long j38 = 0;
                                                    while (it6.hasNext()) {
                                                        long N2 = w0Var3.N((java.lang.String) it6.next(), z27, z27);
                                                        if (N2 >= 0) {
                                                            j38 += N2;
                                                        }
                                                    }
                                                    long j39 = bVar4.f444854n;
                                                    int i47 = (int) ((j39 > 0 ? ((float) (j38 * 10)) / ((float) j39) : 0.0f) * 100.0f);
                                                    map.put("cpu-load-" + str13, java.lang.Integer.valueOf(i47));
                                                    if (i39 > i47) {
                                                        map.put("cpu-load-all-" + str13, java.lang.Integer.valueOf(i39));
                                                        jz5.g gVar = mm.o.f410069a;
                                                        if (mm.l.c()) {
                                                            rh.c1 m17 = c1Var4.m();
                                                            m17.u(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.class, new wh.t0() { // from class: ri.p$$h
                                                                @Override // wh.t0
                                                                /* renamed from: accept */
                                                                public final void mo40853xab27b508(java.lang.Object obj5) {
                                                                    boolean z28;
                                                                    java.util.Iterator it7 = ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) ((rh.o2) obj5).f477019c).f134095h.f477093a.iterator();
                                                                    while (it7.hasNext()) {
                                                                        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesSnapshot threadJiffiesSnapshot = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesSnapshot) it7.next();
                                                                        java.util.Iterator it8 = ((java.util.List) entry.getValue()).iterator();
                                                                        while (true) {
                                                                            if (!it8.hasNext()) {
                                                                                z28 = false;
                                                                                break;
                                                                            }
                                                                            if (threadJiffiesSnapshot.f134099c.startsWith((java.lang.String) it8.next())) {
                                                                                z28 = true;
                                                                                break;
                                                                            }
                                                                        }
                                                                        if (!z28) {
                                                                            it7.remove();
                                                                        }
                                                                    }
                                                                }
                                                            });
                                                            qh.u uVar = new qh.u();
                                                            uVar.i();
                                                            java.lang.StringBuilder sb6 = uVar.f444920a;
                                                            sb6.append((java.lang.Object) "| ThreadLoad: '");
                                                            sb6.append((java.lang.Object) ri.i.c(c1Var4));
                                                            uVar.a("'\n");
                                                            new ri.m().a(m17, uVar);
                                                            uVar.f();
                                                            uVar.d();
                                                            z18 = true;
                                                            ap.a.a(1, "errPowerStats", null, null, "ThreadLoad", str13, java.lang.String.valueOf(i39), java.lang.String.valueOf(i39));
                                                            z27 = z18;
                                                            z19 = false;
                                                        }
                                                    }
                                                    z18 = true;
                                                    z27 = z18;
                                                    z19 = false;
                                                }
                                            }
                                        });
                                        wh.n1 n1Var = k1Var.f476968k;
                                        if (n1Var == null || !n1Var.l()) {
                                            linkedHashMap.put("power-profile", "non-supported");
                                        } else {
                                            linkedHashMap.put("power-profile", "supported");
                                            linkedHashMap.put("resType", wh.n1.f527374f);
                                            linkedHashMap.put("ver", 2);
                                            linkedHashMap.put("dice-stat", java.lang.Boolean.valueOf(mm.m.f410058f.h()));
                                            linkedHashMap.put("dice-comp", java.lang.Boolean.valueOf(mm.m.f410059g.h()));
                                            linkedHashMap.put("dice-test", java.lang.Boolean.valueOf(mm.o.e()));
                                            uh.g gVar = (uh.g) d3Var;
                                            java.util.Map b17 = gi.u0.b(n1Var, gVar, c1Var3, new m3.a() { // from class: ri.p$$c
                                                @Override // m3.a
                                                /* renamed from: accept */
                                                public final void mo3938xab27b508(java.lang.Object obj4) {
                                                    java.util.Map map = (java.util.Map) obj4;
                                                    java.lang.Object obj5 = map.get("power");
                                                    if (obj5 instanceof java.lang.Double) {
                                                        map.put("powerAvg", java.lang.Double.valueOf(uh.i.p((((java.lang.Double) obj5).doubleValue() * 3600000.0d) / qh.b.this.f444854n, 2)));
                                                    }
                                                }
                                            });
                                            java.util.Map B = wh.m.B(b17, new ri.C30067x337574());
                                            java.util.ArrayList arrayList = new java.util.ArrayList();
                                            java.util.Iterator it = ((java.util.LinkedHashMap) B).entrySet().iterator();
                                            int i29 = i28;
                                            while (it.hasNext()) {
                                                java.lang.String str12 = (java.lang.String) ((java.util.Map.Entry) it.next()).getKey();
                                                if (!str12.startsWith("power-total")) {
                                                    arrayList.add(str12);
                                                    i29++;
                                                    if (i29 >= 3) {
                                                        break;
                                                    }
                                                }
                                            }
                                            linkedHashMap.putAll(b17);
                                            linkedHashMap.put("power-ranks", arrayList);
                                            final double d18 = gVar.d();
                                            if (d18 <= 0.0d) {
                                                return;
                                            }
                                            c1Var3.u(gi.j.class, new wh.t0() { // from class: ri.p$$e
                                                @Override // wh.t0
                                                /* renamed from: accept */
                                                public final void mo40853xab27b508(java.lang.Object obj4) {
                                                    rh.o2 o2Var3 = (rh.o2) obj4;
                                                    float floatValue = ((java.lang.Float) ((gi.j) o2Var3.f477019c).f353595f.f477085a).floatValue();
                                                    if (((java.lang.Float) ((gi.j) o2Var3.f477017a).f353595f.f477085a).floatValue() <= 0.0f || ((java.lang.Float) ((gi.j) o2Var3.f477018b).f353595f.f477085a).floatValue() <= 0.0f || floatValue > 0.0f) {
                                                        return;
                                                    }
                                                    android.os.BatteryManager batteryManager = (android.os.BatteryManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("batterymanager");
                                                    int intProperty = batteryManager.getIntProperty(1);
                                                    int intProperty2 = batteryManager.getIntProperty(4);
                                                    if (intProperty <= 0 || intProperty2 <= 0) {
                                                        return;
                                                    }
                                                    float f17 = ((intProperty / intProperty2) * 100.0f) / 1000.0f;
                                                    java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                                                    double d19 = f17;
                                                    double d27 = ((floatValue * (-1.0d)) / 100.0d) * d19;
                                                    linkedHashMap2.put("power", java.lang.Double.valueOf(uh.i.p(d27, 2)));
                                                    double doubleValue = (java.lang.Double.valueOf(d27).doubleValue() * 3600000.0d) / qh.b.this.f444854n;
                                                    linkedHashMap2.put("powerAvg", java.lang.Double.valueOf(uh.i.p(doubleValue, 2)));
                                                    linkedHashMap2.put("capacity", java.lang.Double.valueOf(uh.i.p(d19, 2)));
                                                    linkedHashMap2.put(ya.b.f77487x44fa364, java.lang.Float.valueOf(floatValue * (-1.0f)));
                                                    double d28 = d18;
                                                    double d29 = 0.0d;
                                                    if (d28 > 0.0d && doubleValue > 0.0d) {
                                                        d29 = d27 / d28;
                                                    }
                                                    linkedHashMap2.put("ratio", java.lang.Double.valueOf(uh.i.p(d29, 2)));
                                                    linkedHashMap.put("power-capacity", linkedHashMap2);
                                                }
                                            });
                                            c1Var3.C(rh.r1.class, new wh.t0() { // from class: ri.p$$f
                                                @Override // wh.t0
                                                /* renamed from: accept */
                                                public final void mo40853xab27b508(java.lang.Object obj4) {
                                                    rh.b3 b3Var = (rh.b3) obj4;
                                                    rh.c1 c1Var4 = rh.c1.this;
                                                    qh.f0 f0Var = c1Var4.f476862k;
                                                    if (f0Var != null) {
                                                        java.lang.Boolean c18 = pj.i.c(f0Var.d());
                                                        java.lang.Boolean d19 = pj.i.d(c1Var4.f476862k.d());
                                                        if (c18 == null || d19 == null) {
                                                            return;
                                                        }
                                                        android.os.Bundle bundle = c1Var4.f476860i;
                                                        int i37 = bundle.getBoolean("extra_batt_curr_rectify", false) ? 1 : (d19.booleanValue() ? 1 : -1) * (c18.booleanValue() ? 1000 : 1);
                                                        double d27 = b3Var.f476845d;
                                                        double d28 = b3Var.f476849h;
                                                        if (d27 * d28 <= 0.0d || b3Var.f476846e * d28 <= 0.0d || b3Var.f476848g * d28 <= 0.0d || b3Var.f476847f * d28 <= 0.0d) {
                                                            return;
                                                        }
                                                        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                                                        double d29 = i37;
                                                        double d37 = b3Var.f476849h / d29;
                                                        qh.b bVar4 = bVar3;
                                                        double d38 = d37 * ((((float) bVar4.f444854n) * 1.0f) / 3600000.0f);
                                                        linkedHashMap2.put("power", java.lang.Double.valueOf(uh.i.p(d38, 2)));
                                                        double d39 = (3600000.0d * d38) / bVar4.f444854n;
                                                        linkedHashMap2.put("powerAvg", java.lang.Double.valueOf(uh.i.p(d39, 2)));
                                                        linkedHashMap2.put("currAvg", java.lang.Double.valueOf(uh.i.p(b3Var.f476849h / d29, 2)));
                                                        linkedHashMap2.put("currMin", java.lang.Double.valueOf(uh.i.p(b3Var.f476848g / d29, 2)));
                                                        linkedHashMap2.put("currMax", java.lang.Double.valueOf(uh.i.p(b3Var.f476847f / d29, 2)));
                                                        linkedHashMap2.put("currFst", java.lang.Double.valueOf(uh.i.p(b3Var.f476845d / d29, 2)));
                                                        linkedHashMap2.put("currLst", java.lang.Double.valueOf(uh.i.p(b3Var.f476846e / d29, 2)));
                                                        linkedHashMap2.put("currCnt", java.lang.Integer.valueOf(b3Var.f476843b));
                                                        double d47 = d18;
                                                        linkedHashMap2.put("ratio", java.lang.Double.valueOf(uh.i.p((d47 <= 0.0d || d39 <= 0.0d) ? 0.0d : d38 / d47, 2)));
                                                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                                        long[] longArray = bundle.getLongArray("extra_batt_curr_list");
                                                        if (longArray != null) {
                                                            for (long j29 : longArray) {
                                                                arrayList2.add(java.lang.Long.valueOf(j29));
                                                            }
                                                        }
                                                        linkedHashMap2.put("sample", arrayList2);
                                                        linkedHashMap.put("power-currency", linkedHashMap2);
                                                    }
                                                }
                                            });
                                        }
                                        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                                        rh.b3 B2 = c1Var3.B(rh.t1.class);
                                        if (B2 != null) {
                                            double d19 = B2.f476849h;
                                            if (d19 > 0.0d && d19 != 2.147483647E9d) {
                                                double d27 = B2.f476848g;
                                                if (d27 > 0.0d && d27 != 2.147483647E9d) {
                                                    double d28 = B2.f476847f;
                                                    if (d28 > 0.0d && d28 != 2.147483647E9d) {
                                                        double d29 = B2.f476845d;
                                                        if (d29 > 0.0d && d29 != 2.147483647E9d) {
                                                            double d37 = B2.f476846e;
                                                            if (d37 > 0.0d && d37 != 2.147483647E9d) {
                                                                linkedHashMap2.put("battAvg", java.lang.Double.valueOf(uh.i.p(d19, 2)));
                                                                linkedHashMap2.put("battMin", java.lang.Double.valueOf(uh.i.p(B2.f476848g, 2)));
                                                                linkedHashMap2.put("battMax", java.lang.Double.valueOf(uh.i.p(B2.f476847f, 2)));
                                                                linkedHashMap2.put("battFst", java.lang.Double.valueOf(uh.i.p(B2.f476845d, 2)));
                                                                linkedHashMap2.put("battLst", java.lang.Double.valueOf(uh.i.p(B2.f476846e, 2)));
                                                                linkedHashMap2.put("battInc", java.lang.Double.valueOf(uh.i.p(B2.f476847f - B2.f476845d, 2)));
                                                                linkedHashMap2.put("battDif", java.lang.Double.valueOf(uh.i.p(B2.f476847f - B2.f476848g, 2)));
                                                                linkedHashMap2.put("battCnt", java.lang.Integer.valueOf(B2.f476843b));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        rh.b3 B3 = c1Var3.B(rh.c2.class);
                                        if (android.os.Build.VERSION.SDK_INT >= 29 && B3 != null) {
                                            double d38 = B3.f476849h;
                                            if (d38 > 0.0d && B3.f476848g > 0.0d && B3.f476847f > 0.0d && B3.f476845d > 0.0d && B3.f476846e > 0.0d) {
                                                linkedHashMap2.put("statAvg", java.lang.Double.valueOf(uh.i.p(d38, 2)));
                                                linkedHashMap2.put("statMin", java.lang.Double.valueOf(uh.i.p(B3.f476848g, 2)));
                                                linkedHashMap2.put("statMax", java.lang.Double.valueOf(uh.i.p(B3.f476847f, 2)));
                                                linkedHashMap2.put("statFst", java.lang.Double.valueOf(uh.i.p(B3.f476845d, 2)));
                                                linkedHashMap2.put("statLst", java.lang.Double.valueOf(uh.i.p(B3.f476846e, 2)));
                                                linkedHashMap2.put("statInc", java.lang.Double.valueOf(uh.i.p(B3.f476847f - B3.f476845d, 2)));
                                                linkedHashMap2.put("statDif", java.lang.Double.valueOf(uh.i.p(B3.f476847f - B3.f476848g, 2)));
                                                linkedHashMap2.put("statCnt", java.lang.Integer.valueOf(B3.f476843b));
                                            }
                                        }
                                        linkedHashMap.put("power-temp", linkedHashMap2);
                                        if ("ExplicitBgPoll".equals(w0Var2.z())) {
                                            linkedHashMap.put("poll-count", java.lang.Integer.valueOf(c1Var3.f476860i.getInt("poll_count")));
                                        }
                                        if ("ExplicitBg".equals(w0Var2.z())) {
                                            c1Var3.u(mm.a0.class, new wh.t0() { // from class: ri.p$$g
                                                @Override // wh.t0
                                                /* renamed from: accept */
                                                public final void mo40853xab27b508(java.lang.Object obj4) {
                                                    rh.o2 o2Var3 = (rh.o2) obj4;
                                                    java.lang.Number number = ((mm.a0) o2Var3.f477019c).f409997d.f477085a;
                                                    java.util.Map map = linkedHashMap;
                                                    map.put("notify-push-count", number);
                                                    mm.a0 a0Var = (mm.a0) o2Var3.f477019c;
                                                    map.put("notify-push-during", a0Var.f409998e.f477085a);
                                                    map.put("notify-net-count", a0Var.f409999f.f477085a);
                                                    map.put("notify-net-during", a0Var.f410000g.f477085a);
                                                    map.put("notify-msg-count", a0Var.f410001h.f477085a);
                                                    map.put("notify-msg-during", a0Var.f410002i.f477085a);
                                                    map.put("notify-lightPush-during", a0Var.f410003j.f477085a);
                                                }
                                            });
                                        }
                                        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.q) ((ob0.r2) i95.n0.c(ob0.r2.class))).Vi(str2, w0Var2, linkedHashMap);
                                        java.lang.String str13 = atomicBoolean2.get() ? "Exception" : "Stats";
                                        java.lang.String str14 = "avgPower" + ri.i.c(c1Var3) + str13;
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.BatteryReporter", "#reportHeathStats: " + str14);
                                        ri.s.b(0, 5, str4, ri.s.a(linkedHashMap), c17, d17, str14, j27 / e17, ri.i.i(str11, -1), j19 / e17, "duringMin", e17, str7, "", (long) bVar3.f444842b, (long) bVar3.f444845e, (long) i19, "");
                                    }
                                }
                            });
                        }
                    }
                });
            }
        }
    }
}
