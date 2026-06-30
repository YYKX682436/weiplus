package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09;

/* loaded from: classes7.dex */
public final class t1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1 f175968a = new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f175969b;

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f175970c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.v3 f175971d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.g3 f175972e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f175973f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f175974g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f175975h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.v0 f175976i;

    /* renamed from: j, reason: collision with root package name */
    public static final jz5.g f175977j;

    static {
        new java.util.concurrent.atomic.AtomicBoolean(false);
        f175969b = new java.util.concurrent.atomic.AtomicBoolean(false);
        f175970c = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.a1.f175716d);
        f175971d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.v3(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.g(), 900L);
        f175972e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.g3("webcached", 900L);
        new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.k1();
        f175973f = new java.util.HashMap();
        f175974g = ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).Zi();
        f175975h = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_biz_preload_scene_fix_flutter, 1) == 1;
        f175976i = new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.v0();
        f175977j = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.e1.f175752d);
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1 t1Var, android.os.Bundle bundle, yz5.p pVar) {
        java.lang.Object obj;
        t1Var.getClass();
        boolean z17 = bundle.getBoolean(ya.b.f77504xbb80cbe3);
        long j17 = bundle.getLong("start");
        long j18 = bundle.getLong("end");
        boolean z18 = bundle.getBoolean("mount");
        java.lang.Object y0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.y0(z17, j17, j18, z18, false, 16, null);
        if (!z17) {
            pVar.mo149xb9724478(y0Var, new r45.cf());
            return;
        }
        r45.cf cfVar = new r45.cf();
        cfVar.mo11468x92b714fd(bundle.getByteArray("response"));
        if (z18) {
            java.util.LinkedList linkedList = cfVar.f453048d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                r45.i9 i9Var = (r45.i9) next;
                java.lang.String str = i9Var != null ? i9Var.f458355d : null;
                if (!(str == null || str.length() == 0)) {
                    arrayList.add(next);
                }
            }
            java.util.Iterator it6 = arrayList.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                java.lang.Object next2 = it6.next();
                java.lang.String Url = ((r45.i9) next2).f458355d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Url, "Url");
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.d(Url), bundle.getString(dm.i4.f66865x76d1ec5a))) {
                    obj = next2;
                    break;
                }
            }
            linkedList.clear();
            linkedList.add((r45.i9) obj);
        }
        pVar.mo149xb9724478(y0Var, cfVar);
    }

    public static final void b(java.lang.String url, int i17, int i18, java.lang.String userName, java.lang.Object... params) {
        java.util.HashMap hashMap;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.l0 l0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.l0(4);
        l0Var.a(url);
        l0Var.a(java.lang.Integer.valueOf(i17));
        l0Var.a(userName);
        l0Var.b(params);
        java.util.ArrayList d17 = kz5.c0.d(l0Var.d(new java.lang.Object[l0Var.c()]));
        java.lang.String str = java.util.ArrayList.class.getCanonicalName() + "_addToPreload";
        synchronized (com.p314xaae8f345.mm.sdk.p2603x2137b148.ca.f274039a) {
            hashMap = com.p314xaae8f345.mm.sdk.p2603x2137b148.ca.f274040b;
            p3325xe03a0797.p3326xc267989b.r2 r2Var = (p3325xe03a0797.p3326xc267989b.r2) hashMap.get(str);
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            java.util.HashMap hashMap2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.ca.f274041c;
            if (!hashMap2.containsKey(str)) {
                hashMap2.put(str, new java.util.LinkedList());
            }
            java.lang.Object obj = hashMap2.get(str);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type java.util.LinkedList<T of com.tencent.mm.sdk.platformtools.MMBatchRunKt.batchRun$lambda$1$lambda$0>");
            ((java.util.LinkedList) obj).add(d17);
        }
        hashMap.put(str, p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.c1(1000L, str, null, i18), 2, null));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean e(int r9) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.e(int):boolean");
    }

    public static final void k(int i17) {
        boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.k0.a().getBoolean("preload_webview", true);
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UseNewProfile", "//mppagefastopen webview false");
        }
        if (z17) {
            java.lang.String str = (java.lang.String) ((jz5.n) f175970c).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "<get-PROCESS_NAME>(...)");
            com.p314xaae8f345.mm.p794xb0fa9b5e.f.a(str, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2(i17), com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.l1.f175870d, null);
        }
    }

    public static final void m(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        java.lang.String PROCESS_MAIN = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PROCESS_MAIN, "PROCESS_MAIN");
        com.p314xaae8f345.mm.p794xb0fa9b5e.f.a(PROCESS_MAIN, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(url), com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.m1.f175892d, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0555  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean r(android.content.Context r28, java.lang.String r29, int r30, boolean r31, int r32, int r33, android.content.Intent r34, int r35, zq1.z r36, boolean r37, int r38, java.lang.Object r39) {
        /*
            Method dump skipped, instructions count: 1420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.r(android.content.Context, java.lang.String, int, boolean, int, int, android.content.Intent, int, zq1.z, boolean, int, java.lang.Object):boolean");
    }

    public final java.lang.String c(java.lang.String str, android.content.Intent intent) {
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
        intent.putExtra("bizEnterId", currentTimeMillis);
        java.lang.String b17 = !r26.n0.D(str, "clicktime", false, 2, null) ? hy4.i.b(str, "clicktime", java.lang.String.valueOf(currentTimeMillis)) : str;
        return !r26.n0.D(str, "enterid", false, 2, null) ? hy4.i.b(b17, "enterid", java.lang.String.valueOf(currentTimeMillis)) : b17;
    }

    public final void d(java.util.List list, int i17, int i18, int i19) {
        boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.k0.a().getBoolean("preload_data", true);
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UseNewProfile", "//mppagefastopen data false");
        }
        if (z17) {
            n(list, i17, i18, i19, new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d1(list, i17));
        }
    }

    public final boolean f(r45.i9 i9Var, int i17) {
        java.util.LinkedList<r45.vm6> linkedList;
        r45.vm6 f17 = is1.l.f(i17);
        java.lang.String str = i9Var.f458358g;
        if (!(str == null || r26.n0.N(str))) {
            return true;
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.j(f17) || (linkedList = i9Var.f458368t) == null) {
            return false;
        }
        for (r45.vm6 vm6Var : linkedList) {
            int i18 = vm6Var.f469905d;
            int i19 = f17.f469905d;
            java.lang.String str2 = vm6Var.f469915q;
            java.lang.String str3 = f17.f469915q;
            if (i18 == i19 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, str3)) {
                return vm6Var.f469906e >= f17.f469906e;
            }
        }
        return false;
    }

    public final void g(int i17, java.lang.String netType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(netType, "netType");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreloadLogic", "checkTmplVer");
        java.lang.String PROCESS_MAIN = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PROCESS_MAIN, "PROCESS_MAIN");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("openScene", i17);
        bundle.putString(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56087x98abae37, netType);
        com.p314xaae8f345.mm.p794xb0fa9b5e.f.a(PROCESS_MAIN, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.g1.f175777d, null);
    }

    public final void h(java.lang.Object context, java.lang.String url, r45.zb5 session, java.lang.String brandUserName, yz5.q callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(brandUserName, "brandUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(context);
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.y0 y0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.y0(false, java.lang.System.currentTimeMillis(), java.lang.System.currentTimeMillis(), false, false, 16, null);
        boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.k0.a().getBoolean("preload_data_null", false);
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UseNewProfile", "//mppagefastopen data null");
        }
        if (z17) {
            y0Var.f176011a = true;
            callback.mo147xb9724478(weakReference, y0Var, new r45.i9());
            return;
        }
        if (r26.n0.N(url) || !hy4.i.p(url)) {
            callback.mo147xb9724478(weakReference, y0Var, new r45.i9());
            return;
        }
        int i17 = session.f473418g;
        java.lang.Object obj = null;
        if (r26.n0.N(url)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PreloadLogic", "[findAppMsgContextInCache] url is null, return");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.v0 v0Var = f175976i;
            if (v0Var.b(url, i17)) {
                obj = v0Var.a(url);
            }
        }
        if (obj != null) {
            y0Var.f176011a = true;
            y0Var.f176015e = true;
            callback.mo147xb9724478(weakReference, y0Var, obj);
        } else {
            java.lang.String a17 = hy4.i.a(url, session);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z0(a17, session.f473418g, brandUserName));
            n(linkedList, session.f473419h, 0, 0, new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.i1(callback, weakReference, a17, session));
        }
    }

    public final java.util.concurrent.ConcurrentHashMap i() {
        return (java.util.concurrent.ConcurrentHashMap) ((jz5.n) f175977j).mo141623x754a37bb();
    }

    public final int j(int i17) {
        if (i17 == 0) {
            return e(102) ? 5 : 0;
        }
        if (i17 == 5 || i17 == 10 || i17 == 7 || i17 == 8 || i17 == 16 || i17 == 17) {
            return e(102) ? 5 : 4;
        }
        return -1;
    }

    public final void l(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        f175976i.getClass();
        java.lang.String k17 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.k(url);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) f175971d.d(k17);
        if (o4Var != null) {
            o4Var.W(k17);
            o4Var.W(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.d(url));
        }
    }

    public final void n(java.util.List list, int i17, int i18, int i19, yz5.p pVar) {
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z0) it.next()).f176018a);
        }
        bundle.putStringArrayList("urls", new java.util.ArrayList<>(arrayList));
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            arrayList2.add(java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z0) it6.next()).f176019b));
        }
        bundle.putIntegerArrayList("tmplTypes", new java.util.ArrayList<>(arrayList2));
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it7 = list.iterator();
        while (it7.hasNext()) {
            arrayList3.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z0) it7.next()).f176020c);
        }
        bundle.putStringArrayList("userNames", new java.util.ArrayList<>(arrayList3));
        bundle.putInt("openScene", i17);
        bundle.putInt("strip", i18);
        bundle.putInt("stripType", i19);
        if (((km0.c) gm0.j1.p().a()).a()) {
            o(bundle, new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.n1(pVar));
        } else {
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.x0.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.o1(pVar));
        }
    }

    public final void o(android.os.Bundle bundle, yz5.l lVar) {
        long j17;
        int i17;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17;
        long j18;
        int i18;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() % 100;
        java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList("urls");
        if (stringArrayList != null && stringArrayList.size() == 1) {
            java.lang.String str = stringArrayList.get(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "get(...)");
            java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.d(str);
            if (i().containsKey(d17)) {
                java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = (java.util.concurrent.ConcurrentLinkedDeque) i().get(d17);
                if (concurrentLinkedDeque != null) {
                    concurrentLinkedDeque.add(lVar);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreloadLogic", "terry trace cgi mounted:" + d17 + '#' + currentTimeMillis2);
                return;
            }
        }
        java.util.ArrayList<java.lang.Integer> integerArrayList = bundle.getIntegerArrayList("tmplTypes");
        java.util.ArrayList<java.lang.String> stringArrayList2 = bundle.getStringArrayList("userNames");
        int i19 = bundle.getInt("openScene");
        int i27 = bundle.getInt("strip", 0);
        int i28 = bundle.getInt("stripType", 0);
        java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z0> linkedList = new java.util.LinkedList();
        if (stringArrayList != null) {
            int size = stringArrayList.size();
            int i29 = 0;
            while (i29 < size) {
                java.lang.String str2 = stringArrayList.get(i29);
                if (str2 == null || str2.length() == 0) {
                    j18 = currentTimeMillis;
                    i18 = size;
                } else {
                    i18 = size;
                    java.lang.String str3 = stringArrayList.get(i29);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "get(...)");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(integerArrayList);
                    j18 = currentTimeMillis;
                    java.lang.Integer num = integerArrayList.get(i29);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(num, "get(...)");
                    int intValue = num.intValue();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringArrayList2);
                    java.lang.String str4 = stringArrayList2.get(i29);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "get(...)");
                    linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z0(str3, intValue, str4));
                    java.lang.String str5 = stringArrayList.get(i29);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str5, "get(...)");
                    java.lang.String d18 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.d(str5);
                    i().put(d18, new java.util.concurrent.ConcurrentLinkedDeque());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreloadLogic", "terry trace cgi send:" + d18 + '#' + currentTimeMillis2);
                }
                i29++;
                size = i18;
                currentTimeMillis = j18;
            }
            j17 = currentTimeMillis;
            i17 = 35;
        } else {
            j17 = currentTimeMillis;
            i17 = 35;
        }
        r45.bf bfVar = new r45.bf();
        bfVar.f452249f = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e.f270810a.b();
        bfVar.f452250g = ((java.lang.Number) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.f176021a).mo141623x754a37bb()).longValue();
        bfVar.f452248e = new java.util.LinkedList();
        bfVar.f452251h = i27;
        bfVar.f452252i = i28;
        bfVar.f452253m = is1.l.h(true);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z0 z0Var : linkedList) {
            java.lang.String str6 = z0Var.f176018a;
            com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
            int i37 = (Bi == null || (n17 = Bi.n(z0Var.f176020c, true)) == null) ? 0 : n17.r2() ? 1 : 2;
            r45.gr5 gr5Var = new r45.gr5();
            gr5Var.f457036d = str6;
            gr5Var.f457037e = 0;
            gr5Var.f457038f = i19;
            gr5Var.f457039g = i37;
            r45.i9 a17 = f175976i.a(str6);
            if (a17 != null) {
                gr5Var.f457037e = a17.f458359h;
                if (!f175968a.f(a17, z0Var.f176019b)) {
                    gr5Var.f457037e = 0;
                }
            }
            arrayList.add(gr5Var);
        }
        bfVar.f452248e.addAll(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreloadLogic", "[batchSyncAppMsgContext]urlList ReqInfoList:%d openScene=" + i19, java.lang.Integer.valueOf(bfVar.f452248e.size()));
        kz5.n0.g0(kz5.n0.S0(linkedList), null, null, null, 0, null, com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.j1.f175855d, 31, null);
        java.util.LinkedList TypeInfoList = bfVar.f452253m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(TypeInfoList, "TypeInfoList");
        java.util.Iterator it = TypeInfoList.iterator();
        while (it.hasNext()) {
            int i38 = ((r45.p20) it.next()).f464209d;
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar2 = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar2.f152200d = 2594;
        lVar2.f152199c = "/cgi-bin/mmbiz-bin/batchgetappmsg";
        lVar2.f152201e = 0;
        lVar2.f152202f = 0;
        lVar2.f152197a = bfVar;
        lVar2.f152198b = new r45.cf();
        ax4.a.b(908, (i19 == 0 || i19 != 90) ? i17 : 34, bfVar.f452248e.size(), true);
        com.p314xaae8f345.mm.p944x882e457a.z2.d(lVar2.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.q1(j17, currentTimeMillis2, lVar, stringArrayList), true);
    }

    public final void p(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreloadLogic", "start in preCreate");
        g(i17, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e.f270810a.b());
        k(-1);
        java.lang.String PROCESS_MAIN = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PROCESS_MAIN, "PROCESS_MAIN");
        com.p314xaae8f345.mm.p794xb0fa9b5e.f.a(PROCESS_MAIN, null, com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.f1.f175765d, null);
        f175976i.getClass();
        f175971d.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreloadLogic", "clear() isOk:true");
        is1.l lVar = is1.l.f375956a;
        ((ku5.t0) ku5.t0.f394148d).h(is1.f.f375946d, "tmplPreload");
    }

    public final java.lang.Object q(java.util.List list, int i17, java.lang.Object obj) {
        return list.size() > i17 ? list.get(i17) : obj;
    }

    public final int s(int i17) {
        if (i17 == 0) {
            return 2;
        }
        if (i17 == 1) {
            return 13;
        }
        if (i17 == 2) {
            return 14;
        }
        if (i17 == 90) {
            return 1;
        }
        if (i17 != 92) {
            return i17 != 126 ? 0 : 6;
        }
        return 2;
    }
}
