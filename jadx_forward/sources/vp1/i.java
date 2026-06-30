package vp1;

/* loaded from: classes15.dex */
public final class i extends vp1.d {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f520423b;

    /* renamed from: c, reason: collision with root package name */
    public static int f520424c;

    /* renamed from: d, reason: collision with root package name */
    public static int f520425d;

    /* renamed from: e, reason: collision with root package name */
    public static int f520426e;

    /* renamed from: a, reason: collision with root package name */
    public static final vp1.i f520422a = new vp1.i();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f520427f = new java.util.LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Map f520428g = new java.util.LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public static final wp1.b f520429h = new wp1.b();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f520430i = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: j, reason: collision with root package name */
    public static final jz5.g f520431j = jz5.h.b(vp1.h.f520421d);

    /* renamed from: k, reason: collision with root package name */
    public static final jz5.g f520432k = jz5.h.b(vp1.g.f520420d);

    public static final void H(vp1.i iVar, r45.f83 f83Var, android.content.Intent intent) {
        iVar.getClass();
        r45.f83 V = iVar.V(f83Var.f455622h);
        if (V == null) {
            vp1.e[] eVarArr = vp1.e.f520418d;
            f83Var.f455630s = 2;
            f520427f.put(java.lang.Integer.valueOf(f83Var.f455622h), f83Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageLifecycleMonitor", "addActivityRecord  " + f83Var.f455619e + ' ' + f83Var.f455622h);
            V = f83Var;
        }
        iVar.Y("on_create", f83Var);
        wp1.b bVar = f520429h;
        bVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMSg.ActivityStackService", "onCreate " + V.f455623i + ' ' + V.f455618d + ' ' + V.f455622h);
        java.util.Map map = bVar.f529912a;
        if (!map.containsKey(java.lang.Integer.valueOf(V.f455623i))) {
            int i17 = V.f455623i;
            java.lang.String activityName = V.f455618d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(activityName, "activityName");
            if (!map.containsKey(java.lang.Integer.valueOf(i17))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMSg.ActivityStackService", "add taskAffinity [" + i17 + "] ");
                map.put(java.lang.Integer.valueOf(i17), new wp1.a(i17, activityName));
                bVar.f529914c = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(activityName, bVar.f529915d);
            }
        }
        bVar.f529915d = null;
        wp1.a aVar = (wp1.a) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(V.f455623i));
        if (aVar != null) {
            long j17 = V.f455625n;
            int i18 = V.f455621g;
            if (i18 != 0) {
                java.util.Stack stack = aVar.f529911b;
                boolean z17 = true;
                if (i18 == 1) {
                    java.util.Iterator it = stack.iterator();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        r45.f83 f83Var2 = (r45.f83) it.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f83Var2.f455618d, V.f455618d)) {
                            while (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar.a(), f83Var2)) {
                                aVar.b(j17, intent);
                            }
                            z17 = false;
                        }
                    }
                    if (z17) {
                        aVar.c(V, j17, intent);
                    }
                } else if (i18 == 2) {
                    if (!stack.isEmpty()) {
                        r45.f83 a17 = aVar.a();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17 != null ? a17.f455618d : null, V.f455618d)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActivityStackManager", "top is target activity");
                        }
                    }
                    aVar.c(V, j17, intent);
                } else if (i18 == 3) {
                    while (!stack.isEmpty()) {
                        aVar.b(j17, intent);
                    }
                    aVar.c(V, j17, intent);
                }
            } else {
                aVar.c(V, j17, intent);
            }
        }
        java.util.Iterator it6 = f520430i.iterator();
        while (it6.hasNext()) {
            ((up1.a) it6.next()).o(V, intent, f83Var.f455625n);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageLifecycleMonitor", "onActivityCreate [" + V.f455619e + "] " + V.f455623i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a9, code lost:
    
        if (r0.f529911b.isEmpty() == true) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void I(vp1.i r11, r45.f83 r12, android.content.Intent r13) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vp1.i.I(vp1.i, r45.f83, android.content.Intent):void");
    }

    public static final void J(vp1.i iVar, r45.f83 f83Var, android.content.Intent intent) {
        iVar.Y("on_pause", f83Var);
        r45.f83 V = iVar.V(f83Var.f455622h);
        if (V != null) {
            java.util.LinkedList linkedList = V.f455627p;
            java.util.ListIterator listIterator = linkedList.listIterator(linkedList.size());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(listIterator, "listIterator(...)");
            while (listIterator.hasPrevious()) {
                r45.g83 g83Var = (r45.g83) listIterator.previous();
                g83Var.f456519n = f83Var.f455625n;
                f520422a.U(V, g83Var, intent);
                listIterator.remove();
            }
            java.util.Iterator it = f520430i.iterator();
            while (it.hasNext()) {
                ((up1.a) it.next()).e(V, intent, f83Var.f455625n);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageLifecycleMonitor", "onActivityPause [" + V.f455619e + "] " + V.f455623i + ' ' + f83Var.f455625n);
        }
    }

    public static final void K(vp1.i iVar, r45.f83 f83Var, android.content.Intent intent) {
        iVar.Y("on_resume", f83Var);
        long j17 = f83Var.f455625n;
        wp1.b bVar = f520429h;
        bVar.getClass();
        int i17 = bVar.f529913b;
        int i18 = f83Var.f455623i;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = f520430i;
        if (i17 != i18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMSg.ActivityStackService", bVar.f529913b + " ---> " + f83Var.f455623i + " target activity = " + f83Var.f455619e);
            r45.f83 b17 = bVar.b();
            boolean z17 = bVar.f529914c;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stackChange ");
            sb6.append(b17 != null ? b17.f455619e : null);
            sb6.append(" ---> ");
            sb6.append(f83Var.f455619e);
            sb6.append("  ");
            sb6.append(b17 != null ? java.lang.Integer.valueOf(b17.f455623i) : null);
            sb6.append(" ---> ");
            sb6.append(java.lang.Integer.valueOf(f83Var.f455623i));
            sb6.append(" isCreateNewStack = ");
            sb6.append(z17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageLifecycleMonitor", sb6.toString());
            if (b17 != null) {
                java.util.Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((up1.a) it.next()).x(b17, f83Var, z17, intent, j17);
                }
            }
            bVar.f529913b = f83Var.f455623i;
            bVar.f529914c = false;
        }
        r45.f83 V = iVar.V(f83Var.f455622h);
        if (V != null) {
            java.util.Iterator it6 = copyOnWriteArrayList.iterator();
            while (it6.hasNext()) {
                ((up1.a) it6.next()).g(V, intent, f83Var.f455625n);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageLifecycleMonitor", "onActivityResume [" + V.f455619e + "] " + V.f455623i + ' ' + f83Var.f455625n);
        }
    }

    public static final void L(vp1.i iVar, r45.f83 f83Var, android.content.Intent intent) {
        iVar.Y("on_start", f83Var);
        r45.f83 V = iVar.V(f83Var.f455622h);
        if (V != null) {
            f520424c++;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                f520425d++;
            } else {
                f520426e++;
            }
            vp1.i iVar2 = f520422a;
            iVar2.e0();
            long j17 = f83Var.f455625n;
            boolean z17 = f520423b;
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = f520430i;
            if (!z17) {
                f520423b = true;
                r45.f83 V2 = iVar2.V(V.f455622h);
                if (V2 != null) {
                    java.util.Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((up1.a) it.next()).h(V2, intent, j17);
                    }
                }
                vp1.e[] eVarArr = vp1.e.f520418d;
                wp1.b bVar = f520429h;
                bVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMSg.ActivityStackService", "setStackPageEnterType 5");
                wp1.a aVar = (wp1.a) ((java.util.LinkedHashMap) bVar.f529912a).get(java.lang.Integer.valueOf(bVar.f529913b));
                if (aVar != null) {
                    java.util.Iterator it6 = aVar.f529911b.iterator();
                    while (it6.hasNext()) {
                        ((r45.f83) it6.next()).f455630s = 5;
                    }
                }
                iVar2.d0(false);
                for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) f520428g).entrySet()) {
                    ((java.lang.Number) entry.getKey()).intValue();
                    r45.g83 g83Var = (r45.g83) entry.getValue();
                    vp1.e[] eVarArr2 = vp1.e.f520418d;
                    g83Var.f456523r = 5;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageLifecycleMonitor", "on App In " + j17 + ' ' + bm5.f1.a());
            }
            java.util.Iterator it7 = copyOnWriteArrayList.iterator();
            while (it7.hasNext()) {
                ((up1.a) it7.next()).c(V, intent, f83Var.f455625n);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageLifecycleMonitor", "onActivityStart [" + V.f455619e + "] " + V.f455623i + " mActivityCount " + f520424c);
        }
    }

    public static final void M(vp1.i iVar, r45.f83 f83Var, android.content.Intent intent) {
        iVar.Y("on_stop", f83Var);
        r45.f83 V = iVar.V(f83Var.f455622h);
        if (V != null) {
            f520424c--;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                f520425d--;
            } else {
                f520426e--;
            }
            vp1.i iVar2 = f520422a;
            iVar2.e0();
            long j17 = f83Var.f455625n;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                iVar2.X().putLong("mmkv_key_mp_last_stop_time", j17);
            } else {
                iVar2.X().putLong("mmkv_key_op_last_stop_time", j17);
            }
            java.util.Iterator it = f520430i.iterator();
            while (it.hasNext()) {
                ((up1.a) it.next()).C(V, intent, f83Var.f455625n);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageLifecycleMonitor", "onActivityStop [" + V.f455619e + "] " + V.f455623i + " mActivityCount: " + f520424c);
        }
        int a07 = iVar.a0();
        int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() ? f520425d : f520426e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAppOut check: localCount=");
        sb6.append(i17);
        sb6.append(", otherCount=");
        sb6.append(a07);
        sb6.append(", changingConfig=");
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) f520427f;
        r45.f83 f83Var2 = (r45.f83) linkedHashMap.get(java.lang.Integer.valueOf(f83Var.f455622h));
        sb6.append(f83Var2 != null ? java.lang.Boolean.valueOf(f83Var2.f455626o) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageLifecycleMonitor", sb6.toString());
        if (i17 == 0) {
            r45.f83 f83Var3 = (r45.f83) linkedHashMap.get(java.lang.Integer.valueOf(f83Var.f455622h));
            if ((f83Var3 == null || f83Var3.f455626o) ? false : true) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 W = iVar.W();
                android.os.Message mo50288x733c63a2 = iVar.W().mo50288x733c63a2();
                mo50288x733c63a2.what = 10016;
                mo50288x733c63a2.obj = nm5.j.c(f83Var, intent);
                W.mo50311x7ab51103(mo50288x733c63a2, 100L);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b1, code lost:
    
        if (((r2 == null || r2.f455626o) ? false : true) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void N(vp1.i r15, r45.f83 r16, android.content.Intent r17) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vp1.i.N(vp1.i, r45.f83, android.content.Intent):void");
    }

    public static final void O(vp1.i iVar, r45.g83 g83Var, android.content.Intent intent) {
        iVar.getClass();
        r45.g83 g83Var2 = (r45.g83) ((java.util.LinkedHashMap) f520428g).get(java.lang.Integer.valueOf(g83Var.f456515g));
        if (g83Var2 != null) {
            r45.f83 V = iVar.V(g83Var.f456521p);
            wp1.b bVar = f520429h;
            if (V == null) {
                V = bVar.b();
            }
            if (V != null) {
                java.util.Iterator it = f520430i.iterator();
                while (it.hasNext()) {
                    ((up1.a) it.next()).A(V, g83Var2, intent, g83Var.f456519n);
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(V.f455619e);
                sb6.append(" [");
                sb6.append(g83Var2.f456513e);
                sb6.append("] ");
                sb6.append(g83Var2.f456518m);
                sb6.append(" parentActivity = ");
                sb6.append(g83Var2.f456514f);
                sb6.append(" topActivity ");
                r45.f83 b17 = bVar.b();
                sb6.append(b17 != null ? b17.f455618d : null);
                sb6.append(" on destroy");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageLifecycleMonitor", sb6.toString());
                f520422a.c0(g83Var2);
            }
        }
    }

    public static final void P(vp1.i iVar, r45.g83 g83Var, android.content.Intent intent) {
        java.util.LinkedList linkedList;
        r45.g83 Q = iVar.Q(g83Var);
        if (iVar.Z("on_resume", g83Var)) {
            r45.f83 V = iVar.V(g83Var.f456521p);
            if (V == null) {
                V = f520429h.a("on_resume");
            }
            if (V != null && (linkedList = V.f455627p) != null) {
                if (!linkedList.contains(Q)) {
                    Q.f456522q = linkedList.size();
                    linkedList.add(Q);
                }
                Q.f456514f = V.f455618d;
                Q.f456521p = V.f455622h;
            }
            if (V != null) {
                java.util.Iterator it = f520430i.iterator();
                while (it.hasNext()) {
                    ((up1.a) it.next()).f(V, Q, intent, g83Var.f456519n);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageLifecycleMonitor", V.f455619e + " [" + Q.f456513e + "] " + Q.f456518m + " parentActivity = " + Q.f456514f + " on resume " + g83Var.f456519n);
            }
        }
    }

    public static /* synthetic */ r45.g83 T(vp1.i iVar, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, java.lang.String str, java.lang.String str2, boolean z17, long j17, int i17, java.lang.Object obj) {
        return iVar.S(componentCallbacksC1101xa17d4670, (i17 & 2) != 0 ? "" : str, (i17 & 4) != 0 ? "" : str2, (i17 & 8) != 0 ? true : z17, j17);
    }

    @Override // vp1.d, up1.b
    public void B(android.app.Activity activity, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 W = W();
        android.os.Message mo50288x733c63a2 = W().mo50288x733c63a2();
        mo50288x733c63a2.what = 10007;
        mo50288x733c63a2.obj = nm5.j.c(f520422a.R(activity, j17), intent);
        W.mo50308x2936bf5f(mo50288x733c63a2);
    }

    @Override // vp1.d, up1.b
    public void G(java.lang.String activityName, int i17, long j17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityName, "activityName");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 W = W();
        android.os.Message mo50288x733c63a2 = W().mo50288x733c63a2();
        mo50288x733c63a2.what = 10014;
        mo50288x733c63a2.obj = nm5.j.e(activityName, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i18));
        W.mo50308x2936bf5f(mo50288x733c63a2);
    }

    public final r45.g83 Q(r45.g83 g83Var) {
        int i17 = g83Var.f456515g;
        java.util.Map map = f520428g;
        r45.g83 g83Var2 = (r45.g83) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(i17));
        if (g83Var2 != null) {
            return g83Var2;
        }
        vp1.e[] eVarArr = vp1.e.f520418d;
        g83Var.f456523r = 2;
        map.put(java.lang.Integer.valueOf(g83Var.f456515g), g83Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageLifecycleMonitor", "addFragmentRecord  " + g83Var.f456513e + ' ' + g83Var.f456515g);
        return g83Var;
    }

    public final r45.f83 R(android.app.Activity activity, long j17) {
        int i17;
        if (activity != null) {
            try {
                android.content.Intent intent = activity.getIntent();
                if (intent != null && intent.getComponent() != null) {
                    r45.f83 f83Var = new r45.f83();
                    f83Var.f455618d = activity.getClass().getName();
                    f83Var.f455619e = activity.getClass().getSimpleName();
                    f83Var.f455623i = activity.getTaskId();
                    f83Var.f455620f = "";
                    int flags = intent.getFlags();
                    if ((268435456 & flags) == 0) {
                        if ((536870912 & flags) != 0) {
                            i17 = 2;
                        } else if ((67108864 & flags) == 0) {
                            i17 = (flags & 524288) != 0 ? 3 : 0;
                        }
                        f83Var.f455621g = i17;
                        f83Var.f455622h = activity.hashCode();
                        f83Var.f455625n = j17;
                        f83Var.f455626o = activity.isChangingConfigurations();
                        f83Var.f455628q = bm5.f1.a();
                        return f83Var;
                    }
                    i17 = 1;
                    f83Var.f455621g = i17;
                    f83Var.f455622h = activity.hashCode();
                    f83Var.f455625n = j17;
                    f83Var.f455626o = activity.isChangingConfigurations();
                    f83Var.f455628q = bm5.f1.a();
                    return f83Var;
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return null;
    }

    public final r45.g83 S(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, java.lang.String str, java.lang.String str2, boolean z17, long j17) {
        r45.g83 g83Var = new r45.g83();
        g83Var.f456512d = componentCallbacksC1101xa17d4670.getClass().getName();
        g83Var.f456513e = componentCallbacksC1101xa17d4670.getClass().getSimpleName();
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = componentCallbacksC1101xa17d4670.mo7430x19263085();
        g83Var.f456514f = mo7430x19263085 != null ? mo7430x19263085.getClass().getName() : null;
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x192630852 = componentCallbacksC1101xa17d4670.mo7430x19263085();
        g83Var.f456521p = mo7430x192630852 != null ? mo7430x192630852.hashCode() : 0;
        g83Var.f456515g = componentCallbacksC1101xa17d4670.m7479x8cdac1b();
        g83Var.f456519n = j17;
        g83Var.f456517i = str;
        g83Var.f456520o = z17;
        g83Var.f456518m = str2;
        return g83Var;
    }

    public final void U(r45.f83 f83Var, r45.g83 g83Var, android.content.Intent intent) {
        if (Z("on_pause", g83Var)) {
            java.util.Iterator it = f520430i.iterator();
            while (it.hasNext()) {
                ((up1.a) it.next()).D(f83Var, g83Var, intent, g83Var.f456519n);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageLifecycleMonitor", f83Var.f455619e + " [" + g83Var.f456513e + "] " + g83Var.f456518m + " parentActivity = " + g83Var.f456514f + " on pause " + g83Var.f456519n);
        }
    }

    public final r45.f83 V(int i17) {
        return (r45.f83) ((java.util.LinkedHashMap) f520427f).get(java.lang.Integer.valueOf(i17));
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 W() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) f520432k).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 X() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) f520431j).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) mo141623x754a37bb;
    }

    public final void Y(java.lang.String str, r45.f83 f83Var) {
        jz5.f0 f0Var;
        r45.f83 f83Var2 = (r45.f83) ((java.util.LinkedHashMap) f520427f).get(java.lang.Integer.valueOf(f83Var.f455622h));
        if (f83Var2 != null) {
            vp1.j jVar = vp1.j.f520433a;
            int b17 = jVar.b(str);
            if (b17 != f83Var2.f455624m) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageLifecycleMonitor", "moveActivityStatus " + f83Var2.f455619e + ' ' + jVar.a(f83Var2.f455624m) + " --> " + str);
                f83Var2.f455624m = b17;
            }
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PageLifecycleMonitor", "moveActivityStatus err " + f83Var.f455619e + ' ' + f83Var.f455622h + " evenId " + str);
        }
    }

    public final boolean Z(java.lang.String str, r45.g83 g83Var) {
        jz5.f0 f0Var;
        r45.g83 g83Var2 = (r45.g83) ((java.util.LinkedHashMap) f520428g).get(java.lang.Integer.valueOf(g83Var.f456515g));
        if (g83Var2 != null) {
            vp1.j jVar = vp1.j.f520433a;
            int b17 = jVar.b(str);
            if (b17 != g83Var2.f456516h) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageLifecycleMonitor", "moveFragmentStatus " + g83Var2.f456513e + ' ' + jVar.a(g83Var2.f456516h) + " --> " + str);
                g83Var2.f456516h = b17;
                return true;
            }
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var != null) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PageLifecycleMonitor", "moveActivityStatus err " + g83Var.f456513e + ' ' + g83Var.f456515g + " evenId " + str);
        return false;
    }

    @Override // up1.b
    public void a(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 W = W();
        android.os.Message mo50288x733c63a2 = W().mo50288x733c63a2();
        mo50288x733c63a2.what = 10012;
        mo50288x733c63a2.obj = nm5.j.c(T(f520422a, fragment, null, null, false, j17, 14, null), intent);
        W.mo50308x2936bf5f(mo50288x733c63a2);
    }

    public final int a0() {
        int i17 = X().getInt(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() ? "mmkv_key_other_process_on_start" : "mmkv_key_main_process_on_start", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageLifecycleMonitor", bm5.f1.a() + ", other process start count " + i17);
        return i17;
    }

    @Override // up1.b
    public void b(android.app.Activity activity, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 W = W();
        android.os.Message mo50288x733c63a2 = W().mo50288x733c63a2();
        mo50288x733c63a2.what = 10001;
        mo50288x733c63a2.obj = nm5.j.c(f520422a.R(activity, j17), intent);
        W.mo50308x2936bf5f(mo50288x733c63a2);
    }

    public final void b0(r45.f83 f83Var, long j17, android.content.Intent intent) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("outStack [");
        sb6.append(f83Var != null ? f83Var.f455619e : null);
        sb6.append("] ");
        sb6.append(f83Var != null ? java.lang.Integer.valueOf(f83Var.f455623i) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageLifecycleMonitor", sb6.toString());
        if (f83Var != null) {
            java.util.Iterator it = f520430i.iterator();
            while (it.hasNext()) {
                ((up1.a) it.next()).m(f83Var, intent, j17);
            }
        }
    }

    public final void c0(r45.g83 g83Var) {
        java.util.Map map = f520428g;
        if (!map.containsKey(java.lang.Integer.valueOf(g83Var.f456515g))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PageLifecycleMonitor", "removeFragmentRecord err " + g83Var.f456513e + ' ' + g83Var.f456515g);
            return;
        }
        map.remove(java.lang.Integer.valueOf(g83Var.f456515g));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageLifecycleMonitor", "removeFragmentRecord  " + g83Var.f456513e + ' ' + g83Var.f456515g);
    }

    public final void d0(boolean z17) {
        java.util.ArrayList arrayList;
        wp1.b bVar = f520429h;
        wp1.a aVar = (wp1.a) ((java.util.LinkedHashMap) bVar.f529912a).get(java.lang.Integer.valueOf(bVar.f529913b));
        if (aVar != null) {
            arrayList = new java.util.ArrayList();
            for (r45.f83 f83Var : aVar.f529911b) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f83Var);
                arrayList.add(f83Var);
                if (z17) {
                    f83Var.f455631t++;
                } else {
                    f83Var.f455632u++;
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            java.util.Iterator it = f520430i.iterator();
            while (it.hasNext()) {
                ((up1.a) it.next()).E(arrayList, z17);
            }
        }
    }

    public final void e0() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            X().putInt("mmkv_key_main_process_on_start", f520425d);
        } else {
            X().putInt("mmkv_key_other_process_on_start", f520426e);
        }
    }

    @Override // vp1.d, up1.b
    public void i(android.app.Activity activity, boolean z17, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 W = W();
        android.os.Message mo50288x733c63a2 = W().mo50288x733c63a2();
        mo50288x733c63a2.what = 10010;
        mo50288x733c63a2.obj = nm5.j.c(f520422a.R(activity, j17), java.lang.Boolean.valueOf(z17));
        W.mo50308x2936bf5f(mo50288x733c63a2);
    }

    @Override // vp1.d, up1.b
    public void k(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment, java.lang.String vasName, java.lang.String vasSimpleName, boolean z17, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vasName, "vasName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vasSimpleName, "vasSimpleName");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 W = W();
        android.os.Message mo50288x733c63a2 = W().mo50288x733c63a2();
        mo50288x733c63a2.what = 10015;
        mo50288x733c63a2.obj = nm5.j.c(f520422a.S(fragment, vasName, vasSimpleName, z17, j17), intent);
        W.mo50308x2936bf5f(mo50288x733c63a2);
    }

    @Override // vp1.d, up1.b
    public void l(android.app.Activity activity, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 W = W();
        android.os.Message mo50288x733c63a2 = W().mo50288x733c63a2();
        mo50288x733c63a2.what = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6;
        mo50288x733c63a2.obj = nm5.j.c(f520422a.R(activity, j17), intent);
        W.mo50308x2936bf5f(mo50288x733c63a2);
    }

    @Override // up1.b
    public void n(android.app.Activity activity, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 W = W();
        android.os.Message mo50288x733c63a2 = W().mo50288x733c63a2();
        mo50288x733c63a2.what = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54055x82c2d261;
        mo50288x733c63a2.obj = nm5.j.c(f520422a.R(activity, j17), intent);
        W.mo50308x2936bf5f(mo50288x733c63a2);
    }

    @Override // vp1.d, up1.b
    public void p(android.app.Activity activity, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 W = W();
        android.os.Message mo50288x733c63a2 = W().mo50288x733c63a2();
        mo50288x733c63a2.what = 10002;
        mo50288x733c63a2.obj = nm5.j.c(f520422a.R(activity, j17), intent);
        W.mo50308x2936bf5f(mo50288x733c63a2);
    }

    @Override // up1.b
    public void r(android.app.Activity activity, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 W = W();
        android.os.Message mo50288x733c63a2 = W().mo50288x733c63a2();
        mo50288x733c63a2.what = 10005;
        mo50288x733c63a2.obj = nm5.j.c(f520422a.R(activity, j17), intent);
        W.mo50308x2936bf5f(mo50288x733c63a2);
    }

    @Override // vp1.d, up1.b
    public void t(android.app.Activity activity, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 W = W();
        android.os.Message mo50288x733c63a2 = W().mo50288x733c63a2();
        mo50288x733c63a2.what = 10008;
        mo50288x733c63a2.obj = nm5.j.c(f520422a.R(activity, j17), intent);
        W.mo50308x2936bf5f(mo50288x733c63a2);
    }

    @Override // vp1.d, up1.b
    public void u(android.app.Activity activity, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 W = W();
        android.os.Message mo50288x733c63a2 = W().mo50288x733c63a2();
        mo50288x733c63a2.what = 10000;
        mo50288x733c63a2.obj = nm5.j.d(f520422a.R(activity, j17), intent, java.lang.Long.valueOf(j17));
        W.mo50308x2936bf5f(mo50288x733c63a2);
    }

    @Override // up1.b
    public void v(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment, java.lang.String vasName, java.lang.String vasSimpleName, boolean z17, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vasName, "vasName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vasSimpleName, "vasSimpleName");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 W = W();
        android.os.Message mo50288x733c63a2 = W().mo50288x733c63a2();
        mo50288x733c63a2.what = 10011;
        mo50288x733c63a2.obj = nm5.j.c(f520422a.S(fragment, vasName, vasSimpleName, z17, j17), intent);
        W.mo50308x2936bf5f(mo50288x733c63a2);
    }

    @Override // up1.b
    public void w(android.app.Activity activity, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 W = W();
        android.os.Message mo50288x733c63a2 = W().mo50288x733c63a2();
        mo50288x733c63a2.what = 10009;
        mo50288x733c63a2.obj = nm5.j.c(f520422a.R(activity, j17), intent);
        W.mo50308x2936bf5f(mo50288x733c63a2);
    }

    @Override // vp1.d, up1.b
    public void y(android.app.Activity activity, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 W = W();
        android.os.Message mo50288x733c63a2 = W().mo50288x733c63a2();
        mo50288x733c63a2.what = 10006;
        mo50288x733c63a2.obj = nm5.j.c(f520422a.R(activity, j17), intent);
        W.mo50308x2936bf5f(mo50288x733c63a2);
    }

    @Override // vp1.d, up1.b
    public void z(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 W = W();
        android.os.Message mo50288x733c63a2 = W().mo50288x733c63a2();
        mo50288x733c63a2.what = 10013;
        mo50288x733c63a2.obj = nm5.j.c(T(f520422a, fragment, null, null, false, j17, 14, null), intent);
        W.mo50308x2936bf5f(mo50288x733c63a2);
    }
}
