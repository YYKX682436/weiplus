package df2;

/* loaded from: classes10.dex */
public final class lt extends if2.b {

    /* renamed from: y1, reason: collision with root package name */
    public static yz5.a f312236y1;
    public in5.c A;
    public p3325xe03a0797.p3326xc267989b.r2 B;
    public final java.util.LinkedList C;
    public mm2.o6 D;
    public p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 E;
    public android.widget.FrameLayout F;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22641xff2656ea G;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 H;
    public android.widget.TextView I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.ViewGroup f312237J;
    public if2.d0 K;
    public boolean L;
    public final android.view.View.OnLayoutChangeListener M;
    public boolean N;
    public p3325xe03a0797.p3326xc267989b.r2 P;
    public android.animation.ValueAnimator Q;
    public android.animation.ValueAnimator R;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 S;
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.q1 T;
    public final java.util.HashMap U;
    public jz5.l V;

    /* renamed from: m, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f312238m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22800xb2c6317b f312239n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f312240o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f312241p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f312242q;

    /* renamed from: r, reason: collision with root package name */
    public in5.c f312243r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f312244s;

    /* renamed from: t, reason: collision with root package name */
    public int f312245t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.Object f312246u;

    /* renamed from: v, reason: collision with root package name */
    public long f312247v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f312248w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.ArrayList f312249x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.ArrayList f312250y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.ArrayList f312251z;
    public static final java.lang.String W = c50.l0.f120143a;
    public static final java.lang.String X = c50.l0.f120144b;
    public static final int Y = 50;
    public static final int Z = 90;

    /* renamed from: p0, reason: collision with root package name */
    public static final int f312231p0 = 1;

    /* renamed from: x0, reason: collision with root package name */
    public static final java.util.HashMap f312233x0 = new java.util.HashMap();

    /* renamed from: y0, reason: collision with root package name */
    public static final int f312235y0 = 40;

    /* renamed from: l1, reason: collision with root package name */
    public static final int f312230l1 = 108;

    /* renamed from: p1, reason: collision with root package name */
    public static final int f312232p1 = 108;

    /* renamed from: x1, reason: collision with root package name */
    public static final int f312234x1 = 65535;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f312244s = "";
        this.f312245t = -1;
        this.f312246u = new java.lang.Object();
        this.f312249x = new java.util.ArrayList();
        this.f312250y = new java.util.ArrayList();
        this.f312251z = new java.util.ArrayList();
        this.C = new java.util.LinkedList();
        this.M = new df2.ps(this);
        this.U = new java.util.HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:219:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x083d  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x085f  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x086c  */
    /* JADX WARN: Removed duplicated region for block: B:352:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x082b  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0695  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Z6(df2.lt r49, android.content.Context r50, dk2.h r51) {
        /*
            Method dump skipped, instructions count: 2248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.lt.Z6(df2.lt, android.content.Context, dk2.h):void");
    }

    public static final void a7(df2.lt ltVar, java.lang.String str, r45.bm1 bm1Var) {
        android.view.ViewGroup viewGroup;
        java.lang.String str2;
        java.lang.Class cls;
        int i17;
        java.lang.String str3;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2437x36f002.C19498xba974aee c19498xba974aee;
        boolean z17;
        ltVar.getClass();
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.HashMap hashMap = ltVar.U;
        java.lang.Long l17 = (java.lang.Long) hashMap.get(bm1Var.m75945x2fec8307(0));
        if (currentTimeMillis - (l17 != null ? l17.longValue() : 0L) >= bm1Var.m75939xb282bd08(10) * 1000 && (viewGroup = ltVar.f312237J) != null) {
            if (str != null) {
                try {
                    ((yg0.u3) ((zg0.c3) i95.n0.c(zg0.c3.class))).getClass();
                    c19498xba974aee = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2437x36f002.C19498xba974aee.f269264a;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    str2 = "Finder.LivePromoteBannerController";
                    cls = zg0.c3.class;
                    i17 = 0;
                }
                if (c19498xba974aee.c(str)) {
                    ((yg0.u3) ((zg0.c3) i95.n0.c(zg0.c3.class))).getClass();
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2437x36f002.C19498xba974aee.f269265b.size() > 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewControllerPreloadMrg", "banner canPreload, do not cache more than 2 WebViewController!!!");
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    if (z17) {
                        zg0.q2 Ai = ((yg0.e4) ((zg0.g3) i95.n0.c(zg0.g3.class))).Ai(al5.l2.a(new android.content.MutableContextWrapper(viewGroup.getContext())), new zg0.k2(null, false, false, false, false, 0, false, 105, null), null);
                        java.lang.String m75945x2fec8307 = bm1Var.m75945x2fec8307(0);
                        if (m75945x2fec8307 == null) {
                            m75945x2fec8307 = "";
                        }
                        ltVar.V = new jz5.l(str, m75945x2fec8307);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", "banner cacheInfo set id: " + bm1Var.m75945x2fec8307(0) + " url " + str);
                        i95.m c17 = i95.n0.c(zg0.c3.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                        str2 = "Finder.LivePromoteBannerController";
                        cls = zg0.c3.class;
                        i17 = 0;
                        try {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2437x36f002.C19498xba974aee.a(c19498xba974aee, str, (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) Ai, true, -1, -1, 80, false, 64, null);
                            java.lang.String m75945x2fec83072 = bm1Var.m75945x2fec8307(0);
                            if (m75945x2fec83072 == null) {
                                m75945x2fec83072 = "";
                            }
                            hashMap.put(m75945x2fec83072, java.lang.Long.valueOf(currentTimeMillis));
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                            java.lang.Object[] objArr = new java.lang.Object[6];
                            java.lang.String m75945x2fec83073 = bm1Var.m75945x2fec8307(0);
                            if (m75945x2fec83073 == null) {
                                m75945x2fec83073 = "";
                            }
                            objArr[0] = m75945x2fec83073;
                            objArr[1] = 0;
                            objArr[2] = 0;
                            objArr[3] = 0;
                            objArr[4] = 0;
                            objArr[5] = 1;
                            g0Var.d(27755, objArr);
                            str3 = str2;
                        } catch (java.lang.Throwable th7) {
                            th = th7;
                            str3 = str2;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str3, th, "", new java.lang.Object[i17]);
                            ((yg0.u3) ((zg0.c3) i95.n0.c(cls))).wi();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "end load wv");
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "end load wv");
                    }
                }
            }
            str3 = "Finder.LivePromoteBannerController";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "end load wv");
        }
    }

    public static final void b7(df2.lt ltVar, java.util.ArrayList arrayList) {
        android.content.Context context;
        java.lang.String str;
        ltVar.getClass();
        ae2.in inVar = ae2.in.f85221a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.D4).mo141623x754a37bb()).r()).intValue() != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", "fetchSideBarInfo live side bar switch close!");
            pm0.v.b0(arrayList, df2.vr.f313158d);
            return;
        }
        if (ltVar.m7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", "disableSidebarBanner");
            pm0.v.b0(arrayList, df2.wr.f313238d);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = ltVar.f372632e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 c14353xe7c1f419 = ubVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419) ubVar : null;
        if (c14353xe7c1f419 != null ? c14353xe7c1f419.getIsPresentedInTimeLineUI() : false) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", "disable live side bar in mixed flow liveroom");
            pm0.v.b0(arrayList, df2.xr.f313333d);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", "fetchSideBarInfo, origin size:" + arrayList.size());
        android.view.ViewGroup viewGroup = ltVar.f312237J;
        if (viewGroup == null || (context = viewGroup.getContext()) == null) {
            return;
        }
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(pl2.x.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            dk2.h hVar = (dk2.h) it.next();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 m76506x42318aa0 = hVar.f315074d.m76506x42318aa0();
            if (m76506x42318aa0 != null && m76506x42318aa0.m77224x4236b52c() == 9) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("banner necessary_params:");
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = hVar.f315074d;
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 m76506x42318aa02 = c19786x6a1e2862.m76506x42318aa0();
                sb6.append(m76506x42318aa02 != null ? m76506x42318aa02.m77225xe7ed3fec() : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", sb6.toString());
                if (zl2.r4.f555483a.w1()) {
                    arrayList2.add(hVar);
                } else {
                    try {
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 m76506x42318aa03 = c19786x6a1e2862.m76506x42318aa0();
                        if (m76506x42318aa03 == null || (str = m76506x42318aa03.m77225xe7ed3fec()) == null) {
                            str = "";
                        }
                        hVar.f315076f = pm0.b0.h(android.util.Base64.decode(new org.json.JSONObject(str).optString("last_buffer"), 0));
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.LivePromoteBannerController", th6, "", new java.lang.Object[0]);
                        arrayList2.add(hVar);
                    }
                }
            }
        }
        if (hashMap.size() > 0) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("begin call netscene, size:");
            sb7.append(hashMap.size());
            sb7.append(", hashCodes:");
            java.util.Set keySet = hashMap.keySet();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet, "<get-keys>(...)");
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(keySet, 10));
            java.util.Iterator it6 = keySet.iterator();
            while (it6.hasNext()) {
                arrayList3.add(java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p944x882e457a.m1) it6.next()).hashCode()));
            }
            sb7.append(kz5.n0.g0(arrayList3, ",", null, null, 0, null, null, 62, null));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", sb7.toString());
            java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(hashMap.size());
            df2.yr yrVar = new df2.yr(hashMap, countDownLatch);
            gm0.j1.d().a(6479, yrVar);
            java.util.Set keySet2 = hashMap.keySet();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet2, "<get-keys>(...)");
            java.util.Iterator it7 = keySet2.iterator();
            while (it7.hasNext()) {
                gm0.j1.d().g((com.p314xaae8f345.mm.p944x882e457a.m1) it7.next());
            }
            countDownLatch.await();
            gm0.j1.d().q(6479, yrVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", "finish call netscene");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", "invalid size:" + arrayList2.size());
        arrayList.removeAll(arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c7(df2.lt r18, int r19) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.lt.c7(df2.lt, int):void");
    }

    public static final void d7(df2.lt ltVar) {
        ltVar.o7(null);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.t1 t1Var = ml2.t1.H1;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        zy2.zb.T8(zbVar, t1Var, linkedHashMap, b17, null, null, null, false, 120, null);
    }

    public static final void e7(df2.lt ltVar, dk2.h hVar, boolean z17) {
        android.view.ViewGroup viewGroup = ltVar.f312237J;
        if (viewGroup != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(viewGroup.getContext(), 1, true);
            h0Var.f391656d = k0Var;
            k0Var.f293405n = new df2.vs(viewGroup);
            k0Var.f293414s = new df2.ws(hVar, ltVar, z17, h0Var);
            k0Var.p(new df2.xs(ltVar));
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0) h0Var.f391656d).q(viewGroup.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dce), 17);
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0) h0Var.f391656d).v();
        }
    }

    public static final void f7(df2.lt ltVar, java.util.List list) {
        synchronized (ltVar.f312246u) {
            ((mm2.c1) ltVar.m56788xbba4bfc0(mm2.c1.class)).f410335f3.clear();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", "result or jump_infos size is %d", java.lang.Integer.valueOf(list.size()));
            if (!list.isEmpty()) {
                ((mm2.c1) ltVar.m56788xbba4bfc0(mm2.c1.class)).f410335f3.addAll(list);
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    dk2.h hVar = (dk2.h) it.next();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", "wording:%s, businessType:%d, jumpType:%d, extInfo:%s", hVar.f315074d.m76523x98b23862(), java.lang.Integer.valueOf(hVar.f315074d.m76480xe2ee1ca3()), java.lang.Integer.valueOf(hVar.f315074d.m76503x92bc3c07()), hVar.f315074d.m76489xefafd82());
                }
            }
        }
    }

    public static final void g7(df2.lt ltVar, java.util.Set set, dk2.h hVar, com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725) {
        mm2.o6 o6Var = new mm2.o6(mm2.p6.f410886f, new df2.or(set, hVar, o4Var, ltVar, c19792x256d2725), new df2.pr(ltVar), null, 8, null);
        mm2.w6 w6Var = (mm2.w6) ltVar.m56788xbba4bfc0(mm2.w6.class);
        w6Var.getClass();
        pm0.v.X(new mm2.r6(w6Var, o6Var));
        ltVar.D = o6Var;
    }

    public final void h7(dk2.h hVar) {
        java.lang.String str;
        r45.bm1 bm1Var;
        if (hVar == null || (bm1Var = hVar.f315078h) == null || (str = bm1Var.m75945x2fec8307(0)) == null) {
            str = "";
        }
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        java.util.ArrayList arrayList = this.f312251z;
        if (arrayList.contains(str)) {
            return;
        }
        java.lang.String n76 = n7(hVar, 1);
        android.view.ViewGroup viewGroup = this.f312237J;
        if ((viewGroup != null && viewGroup.getVisibility() == 8) && f312234x1 == 65535 && android.text.TextUtils.isEmpty(this.f312244s)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", "reportBannerAction 1");
            t7(n76);
            arrayList.add(str);
        } else if (android.text.TextUtils.isEmpty(this.f312244s)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", "reportBannerAction 2");
            t7(n76);
            arrayList.add(str);
        } else {
            if (r26.i0.q(this.f312244s, str, false, 2, null)) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", "reportBannerAction 3");
            t7(n76);
            arrayList.add(str);
        }
    }

    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 i7(java.lang.String str, java.lang.String str2, final int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(str);
        if (!(str2 == null || str2.length() == 0)) {
            int L = r26.n0.L(f0Var, str2, 0, false, 6, null);
            f0Var.c(new android.text.style.StyleSpan() { // from class: com.tencent.mm.plugin.finder.live.controller.LivePromoteBannerController$generateMMSS$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // android.text.style.StyleSpan, android.text.style.CharacterStyle
                public void updateDrawState(android.text.TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    com.p314xaae8f345.mm.ui.bk.r0(textPaint, 0.8f);
                    int i18 = i17;
                    if (i18 == -1 || textPaint == null) {
                        return;
                    }
                    textPaint.setColor(i18);
                }
            }, L, str2.length() + L, 33);
        }
        return f0Var;
    }

    @Override // if2.b, if2.m0
    public boolean k() {
        return ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).f410334f2 != 2;
    }

    public final java.lang.String k7(java.lang.String str, int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (str == null) {
            str = "";
        }
        jSONObject.putOpt("bannerid", str);
        jSONObject.putOpt("type", java.lang.Integer.valueOf(i17));
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    public final int l7(dk2.h hVar) {
        r45.bm1 bm1Var;
        r45.bm1 bm1Var2;
        r45.bm1 bm1Var3;
        r45.bm1 bm1Var4;
        boolean z17 = false;
        if ((hVar == null || (bm1Var4 = hVar.f315078h) == null || bm1Var4.m75939xb282bd08(15) != 1) ? false : true) {
            if ((hVar == null || (bm1Var3 = hVar.f315078h) == null || bm1Var3.m75939xb282bd08(1) != 1) ? false : true) {
                return 4;
            }
        }
        if ((hVar == null || (bm1Var2 = hVar.f315078h) == null || bm1Var2.m75939xb282bd08(15) != 1) ? false : true) {
            return 3;
        }
        if (hVar != null && (bm1Var = hVar.f315078h) != null && bm1Var.m75939xb282bd08(1) == 1) {
            z17 = true;
        }
        return z17 ? 2 : 1;
    }

    public final boolean m7() {
        dk2.ef efVar = dk2.ef.f314905a;
        km2.n nVar = dk2.ef.H;
        if (nVar == null) {
            return false;
        }
        r45.ta4 e17 = nVar.e();
        return e17 != null && e17.m75933x41a8a7f2(33);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        if ((r2 != null && r2.m77224x4236b52c() == 29) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String n7(dk2.h r8, int r9) {
        /*
            r7 = this;
            r0 = 0
            r1 = 1
            if (r8 == 0) goto L11
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r2 = r8.f315074d
            if (r2 == 0) goto L11
            int r2 = r2.m76503x92bc3c07()
            r3 = 3
            if (r2 != r3) goto L11
            r2 = r1
            goto L12
        L11:
            r2 = r0
        L12:
            if (r2 == 0) goto L2a
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r2 = r8.f315074d
            com.tencent.mm.protocal.protobuf.NativeInfo r2 = r2.m76506x42318aa0()
            if (r2 == 0) goto L26
            int r2 = r2.m77224x4236b52c()
            r3 = 29
            if (r2 != r3) goto L26
            r2 = r1
            goto L27
        L26:
            r2 = r0
        L27:
            if (r2 == 0) goto L2a
            goto L2b
        L2a:
            r1 = r0
        L2b:
            r2 = 0
            if (r1 == 0) goto L9b
            java.lang.String r1 = ""
            if (r8 == 0) goto L42
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r3 = r8.f315074d
            if (r3 == 0) goto L42
            com.tencent.mm.protocal.protobuf.NativeInfo r3 = r3.m76506x42318aa0()
            if (r3 == 0) goto L42
            java.lang.String r3 = r3.m77225xe7ed3fec()
            if (r3 != 0) goto L43
        L42:
            r3 = r1
        L43:
            java.lang.String r4 = "jump native necessary_params:%s"
            java.lang.Object[] r5 = new java.lang.Object[]{r3}
            java.lang.String r6 = "Finder.LivePromoteBannerController"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r4, r5)
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L54
            r4.<init>(r3)     // Catch: org.json.JSONException -> L54
            goto L5b
        L54:
            r3 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r0]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r6, r3, r1, r4)
            r4 = r2
        L5b:
            if (r4 == 0) goto L64
            java.lang.String r3 = "queryWord"
            java.lang.String r3 = r4.optString(r3, r1)
            goto L65
        L64:
            r3 = r2
        L65:
            if (r3 != 0) goto L68
            r3 = r1
        L68:
            if (r8 == 0) goto L72
            r45.bm1 r8 = r8.f315078h
            if (r8 == 0) goto L72
            java.lang.String r2 = r8.m75945x2fec8307(r0)
        L72:
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            if (r2 != 0) goto L7a
            goto L7b
        L7a:
            r1 = r2
        L7b:
            java.lang.String r0 = "bannerid"
            r8.putOpt(r0, r1)
            java.lang.String r0 = "type"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8.putOpt(r0, r9)
            java.lang.String r9 = "search_word"
            r8.putOpt(r9, r3)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "toString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r8, r9)
            goto La9
        L9b:
            if (r8 == 0) goto La5
            r45.bm1 r8 = r8.f315078h
            if (r8 == 0) goto La5
            java.lang.String r2 = r8.m75945x2fec8307(r0)
        La5:
            java.lang.String r8 = r7.k7(r2, r9)
        La9:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.lt.n7(dk2.h, int):java.lang.String");
    }

    public final void o7(yz5.a aVar) {
        android.content.Context context;
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = this.E;
        android.view.ViewGroup viewGroup = c1073x7e08a787 != null ? (android.view.ViewGroup) c1073x7e08a787.findViewById(com.p314xaae8f345.mm.R.id.r2k) : null;
        android.view.ViewGroup viewGroup2 = this.f312237J;
        int[] t17 = viewGroup2 != null ? pm0.v.t(viewGroup2) : null;
        int[] t18 = viewGroup != null ? pm0.v.t(viewGroup) : null;
        int width = viewGroup != null ? viewGroup.getWidth() : 0;
        int height = viewGroup != null ? viewGroup.getHeight() : 0;
        android.view.ViewGroup viewGroup3 = this.f312237J;
        if (viewGroup3 == null || (context = viewGroup3.getContext()) == null) {
            return;
        }
        int i17 = context.getResources().getDisplayMetrics().widthPixels;
        float b17 = i65.a.b(context, 414);
        float f17 = i17;
        android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat((b17 <= f17 || b17 <= 0.0f || f17 <= 0.0f) ? 1.0f : f17 / b17, 0.2f).setDuration(300L);
        duration.addUpdateListener(new df2.zr(viewGroup, t17, t18, this, width, height));
        duration.addListener(new df2.as(this, aVar));
        this.Q = duration;
        duration.start();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        super.mo14860x9606ce3f();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveEnd */
    public void mo56792x5aa1a970() {
        super.mo56792x5aa1a970();
        if2.d0 d0Var = this.K;
        if (d0Var != null) {
            d0Var.d(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var = this.S;
        if (e3Var != null) {
            e3Var.h();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveMsg */
    public void mo14867x5aa1c816(r45.r71 r71Var) {
        super.mo14867x5aa1c816(r71Var);
        if (((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).f410341g3 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = this.f372632e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = ubVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) ubVar : null;
            if (k0Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.n(k0Var, null, null, new df2.lr(this, null), 3, null);
            }
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.P;
        if ((r2Var == null || ((p3325xe03a0797.p3326xc267989b.c3) r2Var).mo143975x62a56b47()) ? false : true) {
            p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.P;
            if ((r2Var2 == null || ((p3325xe03a0797.p3326xc267989b.c3) r2Var2).A()) ? false : true) {
                return;
            }
        }
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        this.P = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new df2.qr(this, null), 2, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        android.content.Intent intent;
        byte[] byteArrayExtra;
        android.content.Intent intent2;
        super.mo14863x39a513b7(hc1Var);
        y7();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6 = N6();
        if (N6 != null && (intent = N6.getIntent()) != null && (byteArrayExtra = intent.getByteArrayExtra("FINDER_JUMP_INFO_WITH_OUTSIDE")) != null) {
            if (!(!(byteArrayExtra.length == 0))) {
                byteArrayExtra = null;
            }
            if (byteArrayExtra != null) {
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N62 = N6();
                if (N62 != null && (intent2 = N62.getIntent()) != null) {
                    intent2.removeExtra("FINDER_JUMP_INFO_WITH_OUTSIDE");
                }
                com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new r45.uc1().mo11468x92b714fd(byteArrayExtra);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderJumpInfoWithOutside");
                r45.uc1 uc1Var = (r45.uc1) mo11468x92b714fd;
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) uc1Var.m75936x14adae67(1);
                if (c19786x6a1e2862 == null) {
                    c19786x6a1e2862 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
                }
                dk2.h hVar = new dk2.h(c19786x6a1e2862);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> m75941xfb821914 = uc1Var.m75941xfb821914(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObjects(...)");
                for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 : m75941xfb821914) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
                    arrayList.add(new km2.m(c19792x256d2725));
                }
                hVar.f315075e.addAll(arrayList);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = this.f372632e;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = ubVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) ubVar : null;
                this.f312238m = k0Var != null ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.n(k0Var, null, null, new df2.ss(this, hVar, null), 3, null) : null;
            }
        }
        z7();
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [com.tencent.mm.plugin.finder.live.controller.LivePromoteBannerController$initView$5] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        android.content.Context context;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        ae2.in inVar = ae2.in.f85221a;
        ((lb2.k) ae2.in.f85463y6).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", "onViewMount value=");
        if (((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).M7()) {
            return;
        }
        android.content.Context context2 = pluginLayout.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        if (((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).getIntent().hasExtra("KEY_MINI_APP_AD_FLOW_INFO")) {
            return;
        }
        this.f312237J = (android.view.ViewGroup) S6(com.p314xaae8f345.mm.R.id.fj9);
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) T6(com.p314xaae8f345.mm.R.id.r2p, com.p314xaae8f345.mm.R.id.r2q);
        this.E = c1073x7e08a787;
        android.widget.TextView textView = c1073x7e08a787 != null ? (android.widget.TextView) c1073x7e08a787.findViewById(com.p314xaae8f345.mm.R.id.c9z) : null;
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7872 = this.E;
        android.widget.TextView textView2 = c1073x7e08a7872 != null ? (android.widget.TextView) c1073x7e08a7872.findViewById(com.p314xaae8f345.mm.R.id.obc) : null;
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7873 = this.E;
        android.widget.TextView textView3 = c1073x7e08a7873 != null ? (android.widget.TextView) c1073x7e08a7873.findViewById(com.p314xaae8f345.mm.R.id.nqr) : null;
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7874 = this.E;
        android.widget.ImageView imageView = c1073x7e08a7874 != null ? (android.widget.ImageView) c1073x7e08a7874.findViewById(com.p314xaae8f345.mm.R.id.bys) : null;
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7875 = this.E;
        android.widget.TextView textView4 = c1073x7e08a7875 != null ? (android.widget.TextView) c1073x7e08a7875.findViewById(com.p314xaae8f345.mm.R.id.r59) : null;
        android.view.ViewGroup viewGroup = this.f312237J;
        if (viewGroup != null && (context = viewGroup.getContext()) != null) {
            d92.f fVar = d92.f.f309003a;
            d92.f.a(fVar, context, textView2, 20.0f, 0.0f, 8, null);
            d92.f.a(fVar, context, textView3, 15.0f, 0.0f, 8, null);
            android.widget.TextView textView5 = textView4;
            d92.f.a(fVar, context, textView, 17.0f, 0.0f, 8, null);
            d92.f.a(fVar, context, textView5, 14.0f, 0.0f, 8, null);
            if (textView3 != null) {
                java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m5b);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                java.lang.String string2 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m5h);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                textView3.setText(i7(string, string2, -1));
            }
            if (textView5 != null) {
                java.lang.String string3 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m5f);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                java.lang.String string4 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m5h);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
                textView5.setText(i7(string3, string4, android.graphics.Color.parseColor("#667B3413")));
            }
            if (textView != null) {
                com.p314xaae8f345.mm.ui.fk.a(textView);
            }
            if (textView2 != null) {
                com.p314xaae8f345.mm.ui.fk.a(textView2);
            }
        }
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7876 = this.E;
        if (c1073x7e08a7876 != null) {
            c1073x7e08a7876.setOnClickListener(df2.cs.f311441d);
        }
        if (textView != null) {
            textView.setOnClickListener(new df2.es(this));
        }
        if (imageView != null) {
            imageView.setOnClickListener(new df2.fs(this));
        }
        android.view.ViewGroup viewGroup2 = this.f312237J;
        if (viewGroup2 != null) {
            viewGroup2.addOnLayoutChangeListener(this.M);
            this.f312239n = (com.p314xaae8f345.mm.p2776x373aa5.C22800xb2c6317b) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.f564885af4);
            this.H = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.mw7);
            android.widget.TextView textView6 = (android.widget.TextView) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.mw8);
            this.I = textView6;
            if (textView6 != null) {
                textView6.setTextSize(0, i65.a.a(viewGroup2.getContext(), 14.0f));
            }
            this.G = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22641xff2656ea) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.k3t);
            this.F = (android.widget.FrameLayout) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.k3u);
            com.p314xaae8f345.mm.p2776x373aa5.C22800xb2c6317b c22800xb2c6317b = this.f312239n;
            if (c22800xb2c6317b != null) {
                c22800xb2c6317b.m7963x830bc99d(false);
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22800xb2c6317b c22800xb2c6317b2 = this.f312239n;
            if (c22800xb2c6317b2 != null) {
                c22800xb2c6317b2.m7965x440a0e9(0);
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22800xb2c6317b c22800xb2c6317b3 = this.f312239n;
            if (c22800xb2c6317b3 != null) {
                c22800xb2c6317b3.m82657xc1df1650(true);
            }
            android.content.Context context3 = viewGroup2.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd8 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8(context3);
            c15415x74224fd8.f214172x = 160.0f;
            c15415x74224fd8.f93414u = 0;
            c15415x74224fd8.m8091xc21abdf5(false);
            c15415x74224fd8.Q(0);
            com.p314xaae8f345.mm.p2776x373aa5.C22800xb2c6317b c22800xb2c6317b4 = this.f312239n;
            if (c22800xb2c6317b4 != null) {
                c22800xb2c6317b4.mo7967x900dcbe1(c15415x74224fd8);
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22800xb2c6317b c22800xb2c6317b5 = this.f312239n;
            if (c22800xb2c6317b5 != null) {
                c22800xb2c6317b5.m82660x737778f5(new df2.hs(this));
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22800xb2c6317b c22800xb2c6317b6 = this.f312239n;
            if (c22800xb2c6317b6 != null) {
                c22800xb2c6317b6.setOnTouchListener(new df2.is(this));
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22800xb2c6317b c22800xb2c6317b7 = this.f312239n;
            if (c22800xb2c6317b7 != null) {
                c22800xb2c6317b7.m82659xe31da15c(new df2.js(this));
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22800xb2c6317b c22800xb2c6317b8 = this.f312239n;
            android.view.ViewGroup.LayoutParams layoutParams = c22800xb2c6317b8 != null ? c22800xb2c6317b8.getLayoutParams() : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            layoutParams.width = i65.a.b(viewGroup2.getContext(), f312230l1);
            layoutParams.height = i65.a.b(viewGroup2.getContext(), f312235y0);
            com.p314xaae8f345.mm.p2776x373aa5.C22800xb2c6317b c22800xb2c6317b9 = this.f312239n;
            if (c22800xb2c6317b9 != null) {
                c22800xb2c6317b9.setLayoutParams(layoutParams);
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22800xb2c6317b c22800xb2c6317b10 = this.f312239n;
            if (c22800xb2c6317b10 != null) {
                c22800xb2c6317b10.m82656xa1396c43(false);
            }
            df2.ks ksVar = new df2.ks(this, new in5.s() { // from class: com.tencent.mm.plugin.finder.live.controller.LivePromoteBannerController$initView$5
                @Override // in5.s
                /* renamed from: getItemConvert */
                public in5.r mo43555xf2bb75ea(int type) {
                    return new cl2.j();
                }
            }, this.f312250y);
            ksVar.f374638o = new df2.ms(this, viewGroup2);
            ksVar.f374637n = new df2.ns(this);
            this.f312240o = ksVar;
            android.widget.FrameLayout frameLayout = this.F;
            if (frameLayout != null) {
                frameLayout.setOnClickListener(new df2.os(this, viewGroup2));
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22800xb2c6317b c22800xb2c6317b11 = this.f312239n;
            if (c22800xb2c6317b11 != null) {
                c22800xb2c6317b11.mo7960x6cab2c8d(this.f312240o);
            }
            if2.d0 d0Var = new if2.d0(viewGroup2, this);
            this.K = d0Var;
            this.f372636i = new df2.bs(d0Var);
            d0Var.d(8);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.f566313fi3), "finder_live_more_banner");
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) pluginLayout).mo11219xd0598cf8() == 0) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.f566313fi3), new df2.ts(this));
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.f566313fi3), 8, 25561);
            }
            android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).setMarginEnd((int) (U6() ? viewGroup2.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db) : viewGroup2.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn)));
            android.view.View findViewById = viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.f566313fi3);
            if (((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).O7()) {
                findViewById.setPadding(findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight(), 0);
            }
        }
        if (!((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).T5) {
            ((yg0.u3) ((zg0.c3) i95.n0.c(zg0.c3.class))).wi();
        }
        android.content.Context context4 = pluginLayout.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context4, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context4 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context4).a(pl2.x.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        if (((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).a8()) {
            y7();
        }
        z7();
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        android.content.Intent intent;
        kn0.p pVar;
        android.content.Context context;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        this.U.clear();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", "unMount");
        android.view.ViewGroup viewGroup = this.f312237J;
        if (viewGroup != null && (context = viewGroup.getContext()) != null) {
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            pl2.x xVar = (pl2.x) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(pl2.x.class);
            if (!xVar.f438216f) {
                in5.c cVar = this.A;
                dk2.h hVar = cVar instanceof dk2.h ? (dk2.h) cVar : null;
                if (hVar != null && xVar.f438219i.contains(hVar)) {
                    pl2.s sVar = xVar.f438217g;
                    if (sVar != null) {
                        sVar.k();
                    }
                    xVar.O6(false);
                }
            }
        }
        in0.q e17 = dk2.ef.f314905a.e();
        boolean z17 = ((e17 == null || (pVar = e17.D) == null) ? false : pVar.f391122i) && ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).f410403q5 == 3;
        ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).getClass();
        if (!z17 && !((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).T5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", "landscape click don't clear webview controller");
            zg0.c3 c3Var = (zg0.c3) i95.n0.c(zg0.c3.class);
            if (c3Var != null) {
                ((yg0.u3) c3Var).wi();
            }
        }
        this.f312242q = false;
        this.f312241p = false;
        this.f312247v = 0L;
        this.f312245t = -1;
        this.f312243r = null;
        this.A = null;
        this.f312244s = "";
        this.f312249x.clear();
        this.f312251z.clear();
        this.f312250y.clear();
        this.L = false;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f312240o;
        if (c22848x6ddd90cf != null) {
            c22848x6ddd90cf.m8146xced61ae5();
        }
        f312236y1 = null;
        this.f312248w = false;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6 = N6();
        if (N6 != null && (intent = N6.getIntent()) != null) {
            intent.removeExtra("FINDER_JUMP_INFO_WITH_OUTSIDE");
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.B;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.P;
        if (r2Var2 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var3 = this.f312238m;
        if (r2Var3 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var3, null, 1, null);
        }
        ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).f410353i3 = false;
        android.view.ViewGroup viewGroup2 = this.f312237J;
        if (viewGroup2 != null) {
            viewGroup2.removeOnLayoutChangeListener(this.M);
        }
        this.f312237J = null;
        this.f312239n = null;
        this.F = null;
        this.E = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.K = null;
        this.f312240o = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var = this.S;
        if (e3Var != null) {
            e3Var.h();
        }
        android.animation.ValueAnimator valueAnimator = this.Q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator valueAnimator2 = this.R;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    public final boolean p7(dk2.h hVar) {
        java.lang.String str;
        boolean z17;
        r45.bm1 bm1Var = hVar != null ? hVar.f315078h : null;
        rl2.f fVar = (rl2.f) ((jz5.n) ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).f148534y).mo141623x754a37bb();
        if (bm1Var == null || (str = bm1Var.m75945x2fec8307(0)) == null) {
            str = "";
        }
        fVar.getClass();
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        if (fVar.f478728f.contains(str)) {
            return true;
        }
        synchronized (fVar) {
            ce2.f fVar2 = new ce2.f();
            fVar2.f67661xb1c9dc67 = str;
            z17 = fVar.get(fVar2, new java.lang.String[0]);
        }
        return z17;
    }

    public final boolean q7(dk2.h hVar) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 m76506x42318aa0;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 m76506x42318aa02;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28623;
        if ((hVar == null || (c19786x6a1e28623 = hVar.f315074d) == null || c19786x6a1e28623.m76503x92bc3c07() != 3) ? false : true) {
            if ((hVar == null || (c19786x6a1e28622 = hVar.f315074d) == null || (m76506x42318aa02 = c19786x6a1e28622.m76506x42318aa0()) == null || m76506x42318aa02.m77224x4236b52c() != 5) ? false : true) {
                return true;
            }
            if ((hVar == null || (c19786x6a1e2862 = hVar.f315074d) == null || (m76506x42318aa0 = c19786x6a1e2862.m76506x42318aa0()) == null || m76506x42318aa0.m77224x4236b52c() != 9) ? false : true) {
                return true;
            }
        }
        return false;
    }

    public final boolean r7(int i17) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        java.util.ArrayList arrayList = this.f312250y;
        if (arrayList.size() <= 0) {
            return false;
        }
        java.lang.Object obj = arrayList.get(i17 % arrayList.size());
        dk2.h hVar = obj instanceof dk2.h ? (dk2.h) obj : null;
        if (!((hVar == null || (c19786x6a1e2862 = hVar.f315074d) == null || c19786x6a1e2862.m76503x92bc3c07() != 3) ? false : true)) {
            return false;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 m76506x42318aa0 = hVar.f315074d.m76506x42318aa0();
        return m76506x42318aa0 != null && m76506x42318aa0.m77224x4236b52c() == 28;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[LOOP:0: B:2:0x0006->B:37:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s7() {
        /*
            r9 = this;
            java.util.ArrayList r0 = r9.f312250y
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L55
            java.lang.Object r1 = r0.next()
            r5 = r1
            in5.c r5 = (in5.c) r5
            boolean r6 = r5 instanceof dk2.h
            if (r6 == 0) goto L1e
            r7 = r5
            dk2.h r7 = (dk2.h) r7
            goto L1f
        L1e:
            r7 = r2
        L1f:
            if (r7 == 0) goto L2e
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r7 = r7.f315074d
            if (r7 == 0) goto L2e
            int r7 = r7.m76503x92bc3c07()
            r8 = 3
            if (r7 != r8) goto L2e
            r7 = r3
            goto L2f
        L2e:
            r7 = r4
        L2f:
            if (r7 == 0) goto L51
            if (r6 == 0) goto L36
            r2 = r5
            dk2.h r2 = (dk2.h) r2
        L36:
            if (r2 == 0) goto L4c
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r2 = r2.f315074d
            if (r2 == 0) goto L4c
            com.tencent.mm.protocal.protobuf.NativeInfo r2 = r2.m76506x42318aa0()
            if (r2 == 0) goto L4c
            int r2 = r2.m77224x4236b52c()
            r5 = 29
            if (r2 != r5) goto L4c
            r2 = r3
            goto L4d
        L4c:
            r2 = r4
        L4d:
            if (r2 == 0) goto L51
            r2 = r3
            goto L52
        L51:
            r2 = r4
        L52:
            if (r2 == 0) goto L6
            r2 = r1
        L55:
            if (r2 == 0) goto L58
            goto L59
        L58:
            r3 = r4
        L59:
            if (r3 == 0) goto L6b
            java.lang.Class<tg0.o1> r0 = tg0.o1.class
            i95.m r0 = i95.n0.c(r0)
            tg0.o1 r0 = (tg0.o1) r0
            sg0.y3 r0 = (sg0.y3) r0
            r0.getClass()
            su4.r2.o()
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.lt.s7():void");
    }

    public final void t7(java.lang.String actionResult) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", "reportBannerAction  result:%s", actionResult);
        if (zl2.r4.f555483a.w1()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.N, actionResult, null, 4, null);
        } else {
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            r0Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionResult, "actionResult");
            ml2.r0.hj(r0Var, ml2.b4.M, actionResult, 0L, null, null, null, null, null, 252, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x009b, code lost:
    
        if ((r10 != null && r10.m76784x5db1b11() == 0) != false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u7() {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.lt.u7():void");
    }

    public final void v7() {
        android.content.Context context;
        r45.bm1 bm1Var;
        android.view.ViewGroup viewGroup;
        android.view.ViewGroup viewGroup2;
        android.view.ViewGroup viewGroup3;
        android.view.ViewGroup viewGroup4;
        android.view.ViewGroup viewGroup5 = this.f312237J;
        if (viewGroup5 == null || (context = viewGroup5.getContext()) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3(context);
        this.S = e3Var;
        e3Var.f(com.p314xaae8f345.mm.R.C30864xbddafb2a.br9);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var2 = this.S;
        if (e3Var2 != null) {
            e3Var2.a();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var3 = this.S;
        java.lang.String str = null;
        android.widget.TextView textView = (e3Var3 == null || (viewGroup4 = e3Var3.f213508y) == null) ? null : (android.widget.TextView) viewGroup4.findViewById(com.p314xaae8f345.mm.R.id.c9z);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var4 = this.S;
        android.widget.TextView textView2 = (e3Var4 == null || (viewGroup3 = e3Var4.f213508y) == null) ? null : (android.widget.TextView) viewGroup3.findViewById(com.p314xaae8f345.mm.R.id.f568589nc4);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var5 = this.S;
        android.widget.TextView textView3 = (e3Var5 == null || (viewGroup2 = e3Var5.f213508y) == null) ? null : (android.widget.TextView) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.nqr);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var6 = this.S;
        android.widget.TextView textView4 = (e3Var6 == null || (viewGroup = e3Var6.f213508y) == null) ? null : (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.r59);
        if (textView != null) {
            textView.setOnClickListener(new df2.ys(this));
        }
        d92.f fVar = d92.f.f309003a;
        d92.f.a(fVar, context, textView2, 20.0f, 0.0f, 8, null);
        d92.f.a(fVar, context, textView3, 15.0f, 0.0f, 8, null);
        d92.f.a(fVar, context, textView, 17.0f, 0.0f, 8, null);
        d92.f.a(fVar, context, textView4, 14.0f, 0.0f, 8, null);
        if (textView3 != null) {
            java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m5b);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.lang.String string2 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m5h);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            textView3.setText(i7(string, string2, -1));
        }
        if (textView4 != null) {
            java.lang.String string3 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m5a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
            java.lang.String string4 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m5h);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
            textView4.setText(i7(string3, string4, android.graphics.Color.parseColor("#997B3413")));
        }
        if (textView2 != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView2);
        }
        if (textView != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var7 = this.S;
        if (e3Var7 != null) {
            e3Var7.i();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var8 = this.S;
        if (e3Var8 != null) {
            e3Var8.f213501r = new df2.zs(this);
        }
        in5.c cVar = this.f312243r;
        dk2.h hVar = cVar instanceof dk2.h ? (dk2.h) cVar : null;
        if (hVar != null && (bm1Var = hVar.f315078h) != null) {
            str = bm1Var.m75945x2fec8307(0);
        }
        t7(k7(str, 6));
    }

    public final void w7(java.lang.String query) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        su4.j2 j2Var = new su4.j2();
        android.view.ViewGroup viewGroup = this.f312237J;
        j2Var.f494471a = viewGroup != null ? viewGroup.getContext() : null;
        j2Var.f494472b = 130;
        j2Var.f494474d = query;
        j2Var.f494473c = 0;
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        j2Var.f494475e = su4.r2.f(130);
        j2Var.f494476f = true;
        j2Var.f494478h = true;
        j2Var.f494479i = false;
        j2Var.B = true;
        j2Var.A = false;
        j2Var.f494484n = 2;
        j2Var.f494491u = false;
        j2Var.f494485o = i65.a.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
        j2Var.f494486p = false;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
        x7();
    }

    public final void x7() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.B;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        if (this.f312250y.size() > 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = this.f372632e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = ubVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) ubVar : null;
            this.B = k0Var != null ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.n(k0Var, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new df2.ft(this, null), 2, null) : null;
        } else {
            com.p314xaae8f345.mm.p2776x373aa5.C22800xb2c6317b c22800xb2c6317b = this.f312239n;
            if (c22800xb2c6317b != null) {
                c22800xb2c6317b.m82658x69a99e53(true);
            }
            this.B = null;
        }
    }

    public final void y7() {
        if (this.f312241p) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", "startPollingBannerData is done");
            return;
        }
        if (!this.f312249x.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", "bannerJumpInfosList is not empty, return");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", "startPollingBannerData");
        this.f312241p = true;
        r45.hy2 hy2Var = new r45.hy2();
        dk2.ef efVar = dk2.ef.f314905a;
        dk2.ef.f314925k.e(3, hy2Var, new df2.jt(this, r45.iy2.class), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x07e3 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:479:0x027b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z7() {
        /*
            Method dump skipped, instructions count: 2020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.lt.z7():void");
    }
}
