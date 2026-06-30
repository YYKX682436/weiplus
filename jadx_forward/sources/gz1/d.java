package gz1;

/* loaded from: classes13.dex */
public final class d extends gz1.e implements nz1.b {

    /* renamed from: d, reason: collision with root package name */
    public static final gz1.d f359247d = new gz1.d();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f359248e = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.List f359249f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f359250g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f359251h = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f359252i = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.Map f359253m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String f359254n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String f359255o;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f359256p;

    /* renamed from: q, reason: collision with root package name */
    public static java.lang.Boolean f359257q;

    /* renamed from: r, reason: collision with root package name */
    public static boolean f359258r;

    /* renamed from: s, reason: collision with root package name */
    public static java.lang.Boolean f359259s;

    /* renamed from: t, reason: collision with root package name */
    public static final gz1.c f359260t;

    static {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        f359253m = linkedHashMap;
        f359254n = "doResume";
        f359255o = "doPause";
        f359258r = true;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new android.util.Pair("doResume", "()V"));
        arrayList.add(new android.util.Pair("doPause", "()V"));
        linkedHashMap.put("com/tencent/mm/ui/chatting/ChattingUIFragment", arrayList);
        f359260t = new gz1.c();
    }

    @Override // nz1.b
    public void F(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, boolean z17) {
        if (componentCallbacksC1101xa17d4670 != null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f359250g;
            if (concurrentHashMap.containsKey(java.lang.Integer.valueOf(componentCallbacksC1101xa17d4670.m7479x8cdac1b()))) {
                gz1.b bVar = (gz1.b) concurrentHashMap.get(java.lang.Integer.valueOf(componentCallbacksC1101xa17d4670.m7479x8cdac1b()));
                if (bVar != null) {
                    bVar.f359236b = z17;
                }
            } else {
                concurrentHashMap.put(java.lang.Integer.valueOf(componentCallbacksC1101xa17d4670.m7479x8cdac1b()), new gz1.b(new java.lang.ref.WeakReference(componentCallbacksC1101xa17d4670), z17));
            }
            if (!componentCallbacksC1101xa17d4670.m7491x1edc854d() || h(componentCallbacksC1101xa17d4670)) {
                return;
            }
            if (z17) {
                s(componentCallbacksC1101xa17d4670);
                d(componentCallbacksC1101xa17d4670);
            } else {
                b(componentCallbacksC1101xa17d4670);
                p(componentCallbacksC1101xa17d4670, false);
            }
        }
    }

    @Override // nz1.b
    public void L(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        if (componentCallbacksC1101xa17d4670 != null) {
            java.lang.String simpleName = componentCallbacksC1101xa17d4670.getClass().getSimpleName();
            if (componentCallbacksC1101xa17d4670 instanceof com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83) {
                com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = ((com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83) componentCallbacksC1101xa17d4670).f292654p;
                simpleName = java.lang.String.valueOf(abstractActivityC22579xbed01a37 != null ? abstractActivityC22579xbed01a37.getClass().getSimpleName() : null);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.FragmentEventMonitor", "[onFragmentDestroy] " + simpleName + ' ' + componentCallbacksC1101xa17d4670.m7479x8cdac1b());
            int m7479x8cdac1b = componentCallbacksC1101xa17d4670.m7479x8cdac1b();
            f359250g.remove(java.lang.Integer.valueOf(m7479x8cdac1b));
            ((java.util.ArrayList) f359249f).remove(java.lang.Integer.valueOf(m7479x8cdac1b));
            o(componentCallbacksC1101xa17d4670, gz1.a.f359233h, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if ((r0 != null && r0.f359243i) != false) goto L20;
     */
    @Override // nz1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void N(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L46
            boolean r0 = r4.h(r5)
            if (r0 != 0) goto L46
            boolean r0 = r4.l(r5)
            if (r0 == 0) goto L46
            boolean r0 = r5 instanceof com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83
            r1 = 1
            if (r0 == 0) goto L41
            java.util.concurrent.ConcurrentHashMap r0 = gz1.d.f359251h
            int r2 = r5.m7479x8cdac1b()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r0 = r0.containsKey(r2)
            r2 = 0
            if (r0 != 0) goto L40
            java.util.concurrent.ConcurrentHashMap r0 = gz1.d.f359250g
            int r3 = r5.m7479x8cdac1b()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r0.get(r3)
            gz1.b r0 = (gz1.b) r0
            if (r0 == 0) goto L3c
            boolean r0 = r0.f359243i
            if (r0 != r1) goto L3c
            r0 = r1
            goto L3d
        L3c:
            r0 = r2
        L3d:
            if (r0 == 0) goto L40
            goto L41
        L40:
            r1 = r2
        L41:
            if (r1 == 0) goto L46
            r4.s(r5)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gz1.d.N(androidx.fragment.app.Fragment):void");
    }

    @Override // gz1.e
    public void a(android.app.Activity activity) {
        gz1.b bVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f359251h;
        if (!concurrentHashMap.containsKey(java.lang.Integer.valueOf(activity.hashCode())) || (bVar = (gz1.b) f359250g.get(concurrentHashMap.get(java.lang.Integer.valueOf(activity.hashCode())))) == null) {
            return;
        }
        bVar.f359243i = true;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) bVar.f359235a.get();
        if (componentCallbacksC1101xa17d4670 != null) {
            gz1.d dVar = f359247d;
            if (dVar.l(componentCallbacksC1101xa17d4670)) {
                dVar.s(componentCallbacksC1101xa17d4670);
            }
        }
    }

    public final void b(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        for (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46702 : g(componentCallbacksC1101xa17d4670)) {
            gz1.d dVar = f359247d;
            if (!dVar.l(componentCallbacksC1101xa17d46702)) {
                dVar.p(componentCallbacksC1101xa17d46702, false);
            }
        }
    }

    @Override // nz1.b
    public void c(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        if (componentCallbacksC1101xa17d4670 == null || h(componentCallbacksC1101xa17d4670)) {
            return;
        }
        p(componentCallbacksC1101xa17d4670, false);
    }

    public final void d(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        for (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46702 : g(componentCallbacksC1101xa17d4670)) {
            gz1.d dVar = f359247d;
            if (dVar.l(componentCallbacksC1101xa17d46702)) {
                dVar.s(componentCallbacksC1101xa17d46702);
            }
        }
    }

    public final void e(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, boolean z17) {
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5564x7cb2bbe0 c5564x7cb2bbe0 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5564x7cb2bbe0();
        am.ee eeVar = c5564x7cb2bbe0.f135884g;
        eeVar.f88086a = componentCallbacksC1101xa17d4670;
        eeVar.getClass();
        c5564x7cb2bbe0.e();
        if (!z17) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5800xa2e7a513 c5800xa2e7a513 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5800xa2e7a513();
            am.vm vmVar = c5800xa2e7a513.f136109g;
            vmVar.f89735a = componentCallbacksC1101xa17d4670;
            vmVar.f89736b = java.lang.System.currentTimeMillis();
            c5800xa2e7a513.e();
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5801x3757a97e c5801x3757a97e = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5801x3757a97e();
        am.wm wmVar = c5801x3757a97e.f136110g;
        wmVar.f89834a = componentCallbacksC1101xa17d4670;
        if ((componentCallbacksC1101xa17d4670 instanceof com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83) && (abstractActivityC22579xbed01a37 = ((com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83) componentCallbacksC1101xa17d4670).f292654p) != null) {
            wmVar.f89835b = abstractActivityC22579xbed01a37.getClass().getName();
            wmVar.f89836c = abstractActivityC22579xbed01a37.getClass().getSimpleName();
            wmVar.f89837d = !lk5.s.b(abstractActivityC22579xbed01a37);
        }
        wmVar.f89838e = java.lang.System.currentTimeMillis();
        c5801x3757a97e.e();
    }

    public final boolean f(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        gz1.b bVar = (gz1.b) f359250g.get(java.lang.Integer.valueOf(componentCallbacksC1101xa17d4670.m7479x8cdac1b()));
        return bVar != null && bVar.f359236b && !bVar.f359237c && bVar.f359246l;
    }

    public final java.util.List g(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        kz5.p0 p0Var = kz5.p0.f395529d;
        try {
            if (!componentCallbacksC1101xa17d4670.m7481x7a6e8df6()) {
                return p0Var;
            }
            java.util.List<p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670> m7675x1626d96d = componentCallbacksC1101xa17d4670.m7437x54c0aef7().m7675x1626d96d();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m7675x1626d96d, "getFragments(...)");
            return m7675x1626d96d;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.FragmentEventMonitor", "getChildFragmentErr " + e17);
            return p0Var;
        }
    }

    public final boolean h(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b("ChattingUIFragment", componentCallbacksC1101xa17d4670.getClass().getSimpleName());
    }

    @Override // nz1.b
    public void i(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, boolean z17) {
        if (componentCallbacksC1101xa17d4670 == null || h(componentCallbacksC1101xa17d4670)) {
            return;
        }
        u(componentCallbacksC1101xa17d4670, z17);
        if (!componentCallbacksC1101xa17d4670.m7491x1edc854d() || h(componentCallbacksC1101xa17d4670)) {
            return;
        }
        if (z17) {
            b(componentCallbacksC1101xa17d4670);
            p(componentCallbacksC1101xa17d4670, false);
        } else {
            s(componentCallbacksC1101xa17d4670);
            d(componentCallbacksC1101xa17d4670);
        }
    }

    @Override // nz1.b
    public void j(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37;
        if (componentCallbacksC1101xa17d4670 == null || h(componentCallbacksC1101xa17d4670)) {
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f359250g;
        java.lang.Object obj = concurrentHashMap.get(java.lang.Integer.valueOf(componentCallbacksC1101xa17d4670.m7479x8cdac1b()));
        if (obj == null) {
            obj = new gz1.b(new java.lang.ref.WeakReference(componentCallbacksC1101xa17d4670), true);
            concurrentHashMap.put(java.lang.Integer.valueOf(componentCallbacksC1101xa17d4670.m7479x8cdac1b()), obj);
        }
        if ((componentCallbacksC1101xa17d4670 instanceof com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83) && (abstractActivityC22579xbed01a37 = ((com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83) componentCallbacksC1101xa17d4670).f292654p) != null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = f359251h;
            if (!concurrentHashMap2.containsKey(java.lang.Integer.valueOf(abstractActivityC22579xbed01a37.hashCode()))) {
                concurrentHashMap2.put(java.lang.Integer.valueOf(abstractActivityC22579xbed01a37.hashCode()), java.lang.Integer.valueOf(componentCallbacksC1101xa17d4670.m7479x8cdac1b()));
            }
            ((gz1.b) obj).f359242h = !lk5.s.b(abstractActivityC22579xbed01a37);
        }
        o(componentCallbacksC1101xa17d4670, gz1.a.f359229d, true);
    }

    public final boolean k(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = componentCallbacksC1101xa17d4670.mo7430x19263085();
        if (!((mo7430x19263085 != null && (mo7430x19263085 instanceof com.p314xaae8f345.mm.ui.vas.p2744xac1f0fa0.ActivityC22590xcda336c8)) ? ((com.p314xaae8f345.mm.ui.vas.p2744xac1f0fa0.ActivityC22590xcda336c8) mo7430x19263085).f292680e : false) || (componentCallbacksC1101xa17d4670 instanceof com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.FragmentEventMonitor", "isFilterFragment fragment {" + componentCallbacksC1101xa17d4670 + '}');
        return true;
    }

    public final boolean l(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7453x12a9d210 = componentCallbacksC1101xa17d4670.m7453x12a9d210();
        return m7453x12a9d210 != null ? f(m7453x12a9d210) && !m7453x12a9d210.m7483xdf9b8f74() && m7453x12a9d210.m7491x1edc854d() && f(componentCallbacksC1101xa17d4670) && !componentCallbacksC1101xa17d4670.m7483xdf9b8f74() && componentCallbacksC1101xa17d4670.m7491x1edc854d() : f(componentCallbacksC1101xa17d4670) && !componentCallbacksC1101xa17d4670.m7483xdf9b8f74() && componentCallbacksC1101xa17d4670.m7491x1edc854d();
    }

    @Override // nz1.b
    public void m(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        if (componentCallbacksC1101xa17d4670 != null) {
            o(componentCallbacksC1101xa17d4670, gz1.a.f359232g, true);
        }
    }

    public final void n(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, boolean z17) {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46702;
        java.util.ArrayList arrayList = (java.util.ArrayList) f359249f;
        java.util.Iterator it = arrayList.iterator();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            if (intValue != componentCallbacksC1101xa17d4670.m7479x8cdac1b()) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = f359250g;
                gz1.b bVar = (gz1.b) concurrentHashMap.get(java.lang.Integer.valueOf(intValue));
                if (bVar != null && bVar.f359238d && (componentCallbacksC1101xa17d46702 = (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) bVar.f359235a.get()) != null) {
                    gz1.d dVar = f359247d;
                    if (dVar.l(componentCallbacksC1101xa17d46702)) {
                        java.util.ArrayList arrayList3 = (java.util.ArrayList) bVar.f359244j;
                        if (arrayList3.contains(java.lang.Integer.valueOf(componentCallbacksC1101xa17d4670.m7479x8cdac1b())) && z17) {
                            arrayList3.remove(java.lang.Integer.valueOf(componentCallbacksC1101xa17d4670.m7479x8cdac1b()));
                            if (arrayList3.isEmpty()) {
                                gz1.b bVar2 = (gz1.b) concurrentHashMap.get(java.lang.Integer.valueOf(componentCallbacksC1101xa17d4670.m7479x8cdac1b()));
                                if (bVar2 != null && bVar2.f359241g) {
                                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5555x505c412f c5555x505c412f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5555x505c412f();
                                    am.vd vdVar = c5555x505c412f.f135875g;
                                    vdVar.f89724a = componentCallbacksC1101xa17d4670;
                                    vdVar.f89725b = true;
                                    c5555x505c412f.e();
                                }
                                bVar.f359238d = false;
                                arrayList2.add(java.lang.Integer.valueOf(intValue));
                                dVar.r(componentCallbacksC1101xa17d46702, true);
                            }
                        }
                    }
                }
            }
        }
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            arrayList.remove(java.lang.Integer.valueOf(((java.lang.Number) it6.next()).intValue()));
        }
    }

    public final void o(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, gz1.a aVar, boolean z17) {
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37;
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5798x1ea1fa0f c5798x1ea1fa0f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5798x1ea1fa0f();
            am.tm tmVar = c5798x1ea1fa0f.f136107g;
            tmVar.f89552a = componentCallbacksC1101xa17d4670;
            if ((componentCallbacksC1101xa17d4670 instanceof com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83) && (abstractActivityC22579xbed01a37 = ((com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83) componentCallbacksC1101xa17d4670).f292654p) != null) {
                tmVar.f89553b = abstractActivityC22579xbed01a37.getClass().getName();
                tmVar.f89554c = abstractActivityC22579xbed01a37.getClass().getSimpleName();
                tmVar.f89555d = !lk5.s.b(abstractActivityC22579xbed01a37);
            }
            tmVar.f89556e = java.lang.System.currentTimeMillis();
            c5798x1ea1fa0f.e();
            return;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = f359248e;
        if (ordinal == 1) {
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((gy1.c) it.next()).D2(componentCallbacksC1101xa17d4670);
            }
            e(componentCallbacksC1101xa17d4670, true);
            return;
        }
        if (ordinal == 2) {
            java.util.Iterator it6 = copyOnWriteArrayList.iterator();
            while (it6.hasNext()) {
                ((gy1.c) it6.next()).w8(componentCallbacksC1101xa17d4670);
            }
            e(componentCallbacksC1101xa17d4670, false);
            return;
        }
        if (ordinal != 3) {
            if (ordinal != 4) {
                return;
            }
            java.util.Iterator it7 = copyOnWriteArrayList.iterator();
            while (it7.hasNext()) {
            }
            return;
        }
        java.util.Iterator it8 = copyOnWriteArrayList.iterator();
        while (it8.hasNext()) {
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5799x221755cf c5799x221755cf = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5799x221755cf();
        am.um umVar = c5799x221755cf.f136108g;
        umVar.f89639a = componentCallbacksC1101xa17d4670;
        umVar.f89640b = java.lang.System.currentTimeMillis();
        c5799x221755cf.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0088 A[Catch: Exception -> 0x0104, TryCatch #0 {Exception -> 0x0104, blocks: (B:3:0x0004, B:5:0x0016, B:7:0x001a, B:10:0x0023, B:12:0x0029, B:14:0x0033, B:16:0x0037, B:18:0x003f, B:19:0x0042, B:21:0x004f, B:23:0x0056, B:25:0x0060, B:27:0x0064, B:28:0x0066, B:30:0x0070, B:33:0x007d, B:37:0x0088, B:39:0x008e, B:40:0x00a4, B:42:0x00a8, B:44:0x00ac, B:45:0x00bc, B:47:0x00c0, B:49:0x00d6, B:51:0x00de, B:53:0x00ee, B:56:0x00f3, B:61:0x0100, B:65:0x00fe), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fe A[Catch: Exception -> 0x0104, TryCatch #0 {Exception -> 0x0104, blocks: (B:3:0x0004, B:5:0x0016, B:7:0x001a, B:10:0x0023, B:12:0x0029, B:14:0x0033, B:16:0x0037, B:18:0x003f, B:19:0x0042, B:21:0x004f, B:23:0x0056, B:25:0x0060, B:27:0x0064, B:28:0x0066, B:30:0x0070, B:33:0x007d, B:37:0x0088, B:39:0x008e, B:40:0x00a4, B:42:0x00a8, B:44:0x00ac, B:45:0x00bc, B:47:0x00c0, B:49:0x00d6, B:51:0x00de, B:53:0x00ee, B:56:0x00f3, B:61:0x0100, B:65:0x00fe), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gz1.d.p(androidx.fragment.app.Fragment, boolean):void");
    }

    public final void q(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        if (f359256p) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f359250g;
            gz1.b bVar = (gz1.b) concurrentHashMap.get(java.lang.Integer.valueOf(fragment.m7479x8cdac1b()));
            if (bVar == null) {
                bVar = new gz1.b(new java.lang.ref.WeakReference(fragment), true);
                concurrentHashMap.put(java.lang.Integer.valueOf(fragment.m7479x8cdac1b()), bVar);
            }
            bVar.f359246l = false;
            u(fragment, true);
            b(fragment);
            p(fragment, z17);
        }
    }

    public final void r(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, boolean z17) {
        java.lang.Integer num;
        gz1.b bVar;
        java.lang.ref.WeakReference weakReference;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46702;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f359250g;
        gz1.b bVar2 = (gz1.b) concurrentHashMap.get(java.lang.Integer.valueOf(componentCallbacksC1101xa17d4670.m7479x8cdac1b()));
        if (bVar2 != null) {
            java.util.List list = f359249f;
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = f359252i;
            gz1.d dVar = f359247d;
            if (z17 && bVar2.f359242h && !copyOnWriteArrayList.isEmpty()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7453x12a9d210 = componentCallbacksC1101xa17d4670.m7453x12a9d210(); m7453x12a9d210 != null; m7453x12a9d210 = m7453x12a9d210.m7453x12a9d210()) {
                    arrayList.add(m7453x12a9d210);
                }
                java.util.List g17 = dVar.g(componentCallbacksC1101xa17d4670);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = copyOnWriteArrayList.iterator();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
                while (it.hasNext()) {
                    java.lang.Integer num2 = (java.lang.Integer) it.next();
                    gz1.b bVar3 = (gz1.b) concurrentHashMap.get(num2);
                    if (bVar3 != null && (weakReference = bVar3.f359235a) != null && (componentCallbacksC1101xa17d46702 = (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) weakReference.get()) != null && (bVar3.f359239e || bVar3.f359240f)) {
                        int m7479x8cdac1b = componentCallbacksC1101xa17d4670.m7479x8cdac1b();
                        if (num2 == null || num2.intValue() != m7479x8cdac1b) {
                            if (!g17.contains(componentCallbacksC1101xa17d46702) && dVar.l(componentCallbacksC1101xa17d46702) && (!arrayList.contains(componentCallbacksC1101xa17d46702) || ((componentCallbacksC1101xa17d4670 instanceof com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83) && (componentCallbacksC1101xa17d46702 instanceof com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83)))) {
                                bVar3.f359238d = true;
                                java.util.ArrayList arrayList3 = (java.util.ArrayList) bVar3.f359244j;
                                if (!arrayList3.contains(java.lang.Integer.valueOf(componentCallbacksC1101xa17d4670.m7479x8cdac1b()))) {
                                    arrayList3.add(java.lang.Integer.valueOf(componentCallbacksC1101xa17d4670.m7479x8cdac1b()));
                                }
                                java.util.ArrayList arrayList4 = (java.util.ArrayList) list;
                                if (!arrayList4.contains(java.lang.Integer.valueOf(componentCallbacksC1101xa17d46702.m7479x8cdac1b()))) {
                                    arrayList4.add(java.lang.Integer.valueOf(componentCallbacksC1101xa17d46702.m7479x8cdac1b()));
                                }
                                if (!bVar3.f359240f || bVar3.f359239e) {
                                    arrayList2.add(componentCallbacksC1101xa17d46702);
                                } else {
                                    bVar3.f359240f = false;
                                    it.remove();
                                }
                            }
                        }
                    }
                }
                java.util.Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    dVar.p((p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) it6.next(), false);
                }
                arrayList2.clear();
            }
            if (bVar2.f359238d && ((java.util.ArrayList) bVar2.f359244j).isEmpty()) {
                bVar2.f359238d = false;
                ((java.util.ArrayList) list).remove(java.lang.Integer.valueOf(componentCallbacksC1101xa17d4670.m7479x8cdac1b()));
            }
            if (bVar2.f359239e || bVar2.f359238d) {
                return;
            }
            java.lang.String simpleName = componentCallbacksC1101xa17d4670.getClass().getSimpleName();
            if (componentCallbacksC1101xa17d4670 instanceof com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83) {
                com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = ((com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83) componentCallbacksC1101xa17d4670).f292654p;
                simpleName = abstractActivityC22579xbed01a37 != null ? abstractActivityC22579xbed01a37.getClass().getSimpleName() : null;
            }
            if (!dVar.k(componentCallbacksC1101xa17d4670)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.FragmentEventMonitor", "[onResume] " + simpleName);
                dVar.o(componentCallbacksC1101xa17d4670, gz1.a.f359230e, bVar2.f359242h);
                bVar2.f359239e = true;
                bVar2.f359246l = true;
            }
            if (copyOnWriteArrayList.contains(java.lang.Integer.valueOf(componentCallbacksC1101xa17d4670.m7479x8cdac1b())) || copyOnWriteArrayList.size() < 0) {
                return;
            }
            if ((!copyOnWriteArrayList.isEmpty()) && (num = (java.lang.Integer) copyOnWriteArrayList.get(0)) != null && (bVar = (gz1.b) concurrentHashMap.get(java.lang.Integer.valueOf(num.intValue()))) != null) {
                bVar.f359245k = java.lang.Integer.valueOf(componentCallbacksC1101xa17d4670.m7479x8cdac1b());
            }
            copyOnWriteArrayList.add(0, java.lang.Integer.valueOf(componentCallbacksC1101xa17d4670.m7479x8cdac1b()));
        }
    }

    public final void s(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        r(componentCallbacksC1101xa17d4670, false);
    }

    public final void t(gy1.c listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = f359248e;
        if (copyOnWriteArrayList.contains(listener)) {
            return;
        }
        copyOnWriteArrayList.add(listener);
    }

    public final void u(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, boolean z17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f359250g;
        gz1.b bVar = (gz1.b) concurrentHashMap.get(java.lang.Integer.valueOf(componentCallbacksC1101xa17d4670.m7479x8cdac1b()));
        if (bVar != null) {
            bVar.f359237c = z17;
        }
        java.util.Iterator it = g(componentCallbacksC1101xa17d4670).iterator();
        while (it.hasNext()) {
            gz1.b bVar2 = (gz1.b) concurrentHashMap.get(java.lang.Integer.valueOf(((p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) it.next()).m7479x8cdac1b()));
            if (bVar2 != null) {
                bVar2.f359237c = z17;
            }
        }
    }
}
