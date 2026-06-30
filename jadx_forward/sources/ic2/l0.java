package ic2;

/* loaded from: classes8.dex */
public final class l0 implements ya2.u1, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: q, reason: collision with root package name */
    public static final android.util.SparseArray f371870q = new android.util.SparseArray();

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArraySet f371871r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.util.HashSet f371872s;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f371873d = jz5.h.b(ic2.f0.f371860d);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f371874e;

    /* renamed from: f, reason: collision with root package name */
    public ic2.a f371875f;

    /* renamed from: g, reason: collision with root package name */
    public int f371876g;

    /* renamed from: h, reason: collision with root package name */
    public int f371877h;

    /* renamed from: i, reason: collision with root package name */
    public final int f371878i;

    /* renamed from: m, reason: collision with root package name */
    public final int f371879m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f371880n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Runnable f371881o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Runnable f371882p;

    static {
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = new java.util.concurrent.CopyOnWriteArraySet();
        copyOnWriteArraySet.add(new ic2.p0());
        f371871r = copyOnWriteArraySet;
        f371872s = new java.util.HashSet();
    }

    public l0() {
        com.p314xaae8f345.mm.app.w.INSTANCE.a(new ic2.d0(this));
        this.f371874e = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f371878i = 3;
        this.f371879m = ma1.i.f72803x366c91de;
        this.f371880n = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("finder_sync_thread", new ic2.j0(this));
        this.f371881o = new ic2.e0(this);
        this.f371882p = new ic2.k0(this);
    }

    public void b(int i17, ya2.x1 handler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        android.util.SparseArray sparseArray = f371870q;
        if (((java.util.HashSet) sparseArray.get(i17)) == null) {
            sparseArray.append(i17, new java.util.HashSet());
        }
        ((java.util.HashSet) sparseArray.get(i17)).add(handler);
    }

    public final void c() {
        int i17 = this.f371877h;
        int i18 = this.f371878i;
        java.util.HashSet hashSet = f371872s;
        if (i17 >= i18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SyncExtension", "checkLoop finderAliveUI " + hashSet.size() + " sync_fail_count " + this.f371877h + " so ignore checkloop");
        }
        if (hashSet.size() > 0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f371880n;
            java.lang.Runnable runnable = this.f371882p;
            n3Var.mo50300x3fa464aa(runnable);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            n3Var.mo50297x7c4d7ca2(runnable, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209544x);
        }
    }

    public void d(java.util.List cmdItemList, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdItemList, "cmdItemList");
        java.util.Iterator it = cmdItemList.iterator();
        while (it.hasNext()) {
            r45.hx0 hx0Var = (r45.hx0) it.next();
            java.util.Iterator it6 = f371871r.iterator();
            while (it6.hasNext()) {
                ((ya2.x1) it6.next()).j7(hx0Var, i17, i18);
            }
            java.util.HashSet hashSet = (java.util.HashSet) f371870q.get(hx0Var.m75939xb282bd08(0));
            if (hashSet != null) {
                synchronized (hashSet) {
                    java.util.Iterator it7 = hashSet.iterator();
                    while (it7.hasNext()) {
                        ((ya2.x1) it7.next()).j7(hx0Var, i17, i18);
                    }
                }
            }
        }
    }

    public void e(int i17, int i18) {
        ya2.u1.a(this, i17, i18, null, null, 8, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(int r23, int r24, r45.qt2 r25, ya2.t1 r26) {
        /*
            Method dump skipped, instructions count: 2062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ic2.l0.f(int, int, r45.qt2, ya2.t1):void");
    }

    public final void g(int i17, ya2.t1 t1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L02;
        r45.vs2 vs2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L03;
        r45.vs2 vs2Var2;
        java.util.Iterator it;
        java.util.Iterator it6;
        if (t1Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0 aj0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.f207973a;
        boolean z17 = aj0Var.F() == 1;
        zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L04 = nk6.L0("FinderEntrance");
            L0 = L04 != null ? L04.u1() : null;
        } else {
            L0 = nk6.L0("FinderEntrance");
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fillRedDotArgs args=" + t1Var + ",copyReddot=" + z17 + ",finderEntranceCtrlInfo=" + L0);
        if (L0 != null && L0.f65874xb5f7102a == null && aj0Var.G() == 1) {
            sb6.append(",throw redDot!");
            L0 = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SyncExtension", sb6.toString());
        if ((t1Var.f542071a.length() == 0) && L0 != null) {
            java.lang.String str = L0.f65880x11c19d58;
            if (str == null) {
                str = "";
            }
            t1Var.f542071a = str;
        }
        java.util.LinkedList linkedList = t1Var.f542072b;
        if (L0 != null) {
            java.util.Iterator it7 = linkedList.iterator();
            int i19 = 0;
            while (true) {
                if (!it7.hasNext()) {
                    i19 = -1;
                    break;
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(L0.f65880x11c19d58, ((r45.vs2) it7.next()).f470023h)) {
                    break;
                } else {
                    i19++;
                }
            }
            if (i19 < 0) {
                ya2.w1.a(linkedList, L0);
                java.lang.String str2 = L0.f65882x5364c75d;
                if (str2 != null) {
                    nk6.z("FinderEntrance", str2, L0);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L05 = nk6.L0("FinderMentionEntrance");
        if (L05 != null) {
            java.util.Iterator it8 = linkedList.iterator();
            int i27 = 0;
            while (true) {
                if (!it8.hasNext()) {
                    i27 = -1;
                    break;
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(L05.f65880x11c19d58, ((r45.vs2) it8.next()).f470023h)) {
                    break;
                } else {
                    i27++;
                }
            }
            if (i27 < 0) {
                ya2.w1.a(linkedList, L05);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L06 = nk6.L0("TLFollow");
        if (L06 != null) {
            java.util.Iterator it9 = linkedList.iterator();
            int i28 = 0;
            while (true) {
                if (!it9.hasNext()) {
                    i28 = -1;
                    break;
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(L06.f65880x11c19d58, ((r45.vs2) it9.next()).f470023h)) {
                    break;
                } else {
                    i28++;
                }
            }
            if (i28 < 0) {
                ya2.w1.a(linkedList, L06);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L07 = nk6.L0("TLRecommendTab");
        if (L07 != null) {
            java.util.Iterator it10 = linkedList.iterator();
            int i29 = 0;
            while (true) {
                if (!it10.hasNext()) {
                    i29 = -1;
                    break;
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(L07.f65880x11c19d58, ((r45.vs2) it10.next()).f470023h)) {
                    break;
                } else {
                    i29++;
                }
            }
            if (i29 < 0) {
                ya2.w1.a(linkedList, L07);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L08 = nk6.L0("finder_tl_hot_tab");
        if (L08 != null) {
            java.util.Iterator it11 = linkedList.iterator();
            int i37 = 0;
            while (true) {
                if (!it11.hasNext()) {
                    i37 = -1;
                    break;
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(L08.f65880x11c19d58, ((r45.vs2) it11.next()).f470023h)) {
                    break;
                } else {
                    i37++;
                }
            }
            if (i37 < 0) {
                ya2.w1.a(linkedList, L08);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L09 = nk6.L0("finder_tl_nearby_tab");
        if (L09 != null) {
            java.util.Iterator it12 = linkedList.iterator();
            int i38 = 0;
            while (true) {
                if (!it12.hasNext()) {
                    i38 = -1;
                    break;
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(L09.f65880x11c19d58, ((r45.vs2) it12.next()).f470023h)) {
                    break;
                } else {
                    i38++;
                }
            }
            if (i38 < 0) {
                ya2.w1.a(linkedList, L09);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L010 = nk6.L0("finder_tl_city_tab");
        if (L010 != null) {
            java.util.Iterator it13 = linkedList.iterator();
            int i39 = 0;
            while (true) {
                if (!it13.hasNext()) {
                    i39 = -1;
                    break;
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(L010.f65880x11c19d58, ((r45.vs2) it13.next()).f470023h)) {
                    break;
                } else {
                    i39++;
                }
            }
            if (i39 < 0) {
                ya2.w1.a(linkedList, L010);
            }
        }
        for (java.lang.String str3 : r26.n0.f0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.f207973a.s(), new java.lang.String[]{";"}, false, 0, 6, null)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L011 = nk6.L0(str3);
            if (L011 != null) {
                java.util.Iterator it14 = linkedList.iterator();
                int i47 = 0;
                while (true) {
                    if (!it14.hasNext()) {
                        i47 = -1;
                        break;
                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(L011.f65880x11c19d58, ((r45.vs2) it14.next()).f470023h)) {
                        break;
                    } else {
                        i47++;
                    }
                }
                boolean z18 = i47 >= 0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SyncExtension", "[FINDER_REDDOT_SYNC_PATH_LIST] path=" + str3 + " isExist=" + z18 + " ctrlInfo=" + hc2.u0.e(L011.f65874xb5f7102a));
                if (!z18) {
                    ya2.w1.a(linkedList, L011);
                }
            }
        }
        java.util.Iterator it15 = ((java.util.ArrayList) ((ey2.c2) ((xy2.n) pf5.u.f435469a.e(zy2.b6.class).c(xy2.n.class))).N6()).iterator();
        while (it15.hasNext()) {
            int intValue = ((java.lang.Number) it15.next()).intValue();
            java.util.Iterator it16 = nk6.f(intValue, g92.b.f351302e.T0()).iterator();
            while (it16.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) it16.next();
                java.util.Iterator it17 = linkedList.iterator();
                int i48 = 0;
                while (true) {
                    if (!it17.hasNext()) {
                        it = it15;
                        it6 = it16;
                        i48 = -1;
                        break;
                    } else {
                        it = it15;
                        it6 = it16;
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jbVar.f65882x5364c75d, ((r45.vs2) it17.next()).f470036x)) {
                            break;
                        }
                        i48++;
                        it16 = it6;
                        it15 = it;
                    }
                }
                boolean z19 = i48 >= 0;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[FINDER_REDDOT_SYNC_PATH_LIST] type=");
                sb7.append(intValue);
                sb7.append(" isExist=");
                sb7.append(z19);
                sb7.append(" ctrlInfo=");
                r45.vs2 vs2Var3 = jbVar.f65874xb5f7102a;
                sb7.append(vs2Var3 != null ? hc2.u0.e(vs2Var3) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SyncExtension", sb7.toString());
                if (!z19) {
                    ya2.w1.a(linkedList, jbVar);
                }
                it16 = it6;
                it15 = it;
            }
        }
        if ((t1Var.f542073c.length() == 0) && (L03 = nk6.L0("NearbyEntrance")) != null && (vs2Var2 = L03.f65874xb5f7102a) != null) {
            java.lang.String str4 = vs2Var2.f470023h;
            if (str4 == null) {
                str4 = "";
            }
            t1Var.f542073c = str4;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L012 = nk6.L0("FinderLiveEntrance");
        if (L012 != null && (vs2Var = L012.f65874xb5f7102a) != null) {
            java.lang.String str5 = vs2Var.f470023h;
            t1Var.f542073c = str5 != null ? str5 : "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L013 = nk6.L0("NearbyEntrance");
        java.util.LinkedList linkedList2 = t1Var.f542074d;
        if (L013 != null) {
            java.util.Iterator it18 = linkedList2.iterator();
            int i49 = 0;
            while (true) {
                if (!it18.hasNext()) {
                    i49 = -1;
                    break;
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(L013.f65880x11c19d58, ((r45.vs2) it18.next()).f470023h)) {
                    break;
                } else {
                    i49++;
                }
            }
            if (i49 < 0) {
                ya2.w1.a(linkedList2, L013);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L014 = nk6.L0("NearbyFeedTab");
        if (L014 != null) {
            java.util.Iterator it19 = linkedList2.iterator();
            int i57 = 0;
            while (true) {
                if (!it19.hasNext()) {
                    i57 = -1;
                    break;
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(L014.f65880x11c19d58, ((r45.vs2) it19.next()).f470023h)) {
                    break;
                } else {
                    i57++;
                }
            }
            if (i57 < 0) {
                ya2.w1.a(linkedList2, L014);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L015 = nk6.L0("NearbyLiveTab");
        if (L015 != null) {
            java.util.Iterator it20 = linkedList2.iterator();
            int i58 = 0;
            while (true) {
                if (!it20.hasNext()) {
                    i58 = -1;
                    break;
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(L015.f65880x11c19d58, ((r45.vs2) it20.next()).f470023h)) {
                    break;
                } else {
                    i58++;
                }
            }
            if (i58 < 0) {
                ya2.w1.a(linkedList2, L015);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L016 = nk6.L0("NearbyPeopleTab");
        if (L016 != null) {
            java.util.Iterator it21 = linkedList2.iterator();
            int i59 = 0;
            while (true) {
                if (!it21.hasNext()) {
                    i59 = -1;
                    break;
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(L016.f65880x11c19d58, ((r45.vs2) it21.next()).f470023h)) {
                    break;
                } else {
                    i59++;
                }
            }
            if (i59 < 0) {
                ya2.w1.a(linkedList2, L016);
            }
        }
        ae2.b2 b2Var = ae2.b2.f84994a;
        for (java.lang.String str6 : r26.n0.f0((java.lang.CharSequence) ((lb2.j) ((jz5.n) ae2.b2.f85020u).mo141623x754a37bb()).r(), new java.lang.String[]{";"}, false, 0, 6, null)) {
            if ((str6.length() > 0) && (L02 = nk6.L0(str6)) != null) {
                java.util.Iterator it22 = linkedList2.iterator();
                int i66 = 0;
                while (true) {
                    if (!it22.hasNext()) {
                        i66 = -1;
                        break;
                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(L02.f65880x11c19d58, ((r45.vs2) it22.next()).f470023h)) {
                        break;
                    } else {
                        i66++;
                    }
                }
                boolean z27 = i66 >= 0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SyncExtension", "[FINDER_LIVE_REDDOT_SYNC_PATH_LIST] path=" + str6 + " isExist=" + z27 + " ctrlInfo=" + hc2.u0.e(L02.f65874xb5f7102a));
                if (!z27) {
                    ya2.w1.a(linkedList2, L02);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L017 = nk6.L0("FinderSnsDeliveryEntrance");
        java.util.LinkedList linkedList3 = t1Var.f542075e;
        if (L017 != null) {
            java.util.Iterator it23 = linkedList3.iterator();
            int i67 = 0;
            while (true) {
                if (!it23.hasNext()) {
                    i18 = -1;
                    break;
                } else {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(L017.f65880x11c19d58, ((r45.vs2) it23.next()).f470023h)) {
                        i18 = i67;
                        break;
                    }
                    i67++;
                }
            }
            if (i18 < 0) {
                ya2.w1.a(linkedList3, L017);
            }
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("scene=");
        sb8.append(i17);
        sb8.append(" FINDER_REDDOT_SYNC_PATH_LIST=");
        sb8.append(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.f207973a.s());
        sb8.append(" FINDER_LIVE_REDDOT_SYNC_PATH_LIST=");
        ae2.b2 b2Var2 = ae2.b2.f84994a;
        sb8.append((java.lang.String) ((lb2.j) ((jz5.n) ae2.b2.f85020u).mo141623x754a37bb()).r());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SyncExtension", sb8.toString());
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("[fillRedDotArgs] scene=");
        sb9.append(i17);
        sb9.append(" finderCtrlInfoList=");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it24 = linkedList.iterator();
        while (it24.hasNext()) {
            arrayList.add(((r45.vs2) it24.next()).f470023h);
        }
        sb9.append(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SyncExtension", sb9.toString());
        java.lang.StringBuilder sb10 = new java.lang.StringBuilder("[fillRedDotArgs] scene=");
        sb10.append(i17);
        sb10.append(" nearbyCtrlInfoList=");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList2, 10));
        java.util.Iterator it25 = linkedList2.iterator();
        while (it25.hasNext()) {
            arrayList2.add(((r45.vs2) it25.next()).f470023h);
        }
        sb10.append(arrayList2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SyncExtension", sb10.toString());
        java.lang.StringBuilder sb11 = new java.lang.StringBuilder("[fillRedDotArgs] scene=");
        sb11.append(i17);
        sb11.append(" snsCtrlInfoList=");
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(linkedList3, 10));
        java.util.Iterator it26 = linkedList3.iterator();
        while (it26.hasNext()) {
            arrayList3.add(((r45.vs2) it26.next()).f470023h);
        }
        sb11.append(arrayList3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SyncExtension", sb11.toString());
        k(linkedList);
        k(linkedList2);
        k(linkedList3);
    }

    public long h(int i17) {
        ic2.a aVar;
        r45.gl0 gl0Var;
        r45.gl0 gl0Var2;
        long j17 = 0;
        if (i17 == 24) {
            ic2.a aVar2 = this.f371875f;
            if (aVar2 != null) {
                r45.hl0 hl0Var = aVar2.f371837a;
                aVar = (hl0Var == null || (gl0Var = (r45.gl0) hl0Var.m75936x14adae67(11)) == null || gl0Var.m75939xb282bd08(0) != 1) ? false : true ? aVar2 : null;
                if (aVar != null) {
                    j17 = aVar.f371848l;
                }
            }
        } else if (i17 != 25) {
            j17 = -1;
        } else {
            ic2.a aVar3 = this.f371875f;
            if (aVar3 != null) {
                r45.hl0 hl0Var2 = aVar3.f371837a;
                aVar = (hl0Var2 == null || (gl0Var2 = (r45.gl0) hl0Var2.m75936x14adae67(15)) == null || gl0Var2.m75939xb282bd08(0) != 1) ? false : true ? aVar3 : null;
                if (aVar != null) {
                    j17 = aVar.f371849m;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SyncExtension", "getEntranceReportTime type=" + i17 + " socialHotSpot,discovery tab sync time = " + j17);
        return j17;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0314  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(boolean r25, int r26, r45.zy2 r27, r45.az2 r28) {
        /*
            Method dump skipped, instructions count: 1125
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ic2.l0.i(boolean, int, r45.zy2, r45.az2):void");
    }

    public final boolean j(int i17) {
        java.lang.String v17 = gm0.j1.u().c().v(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_SYNC_MERGE_SCENE_STRING_SYNC, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v17);
        java.util.Set X0 = kz5.n0.X0(r26.n0.f0(r26.n0.W(r26.n0.Z(v17, "]"), "["), new java.lang.String[]{","}, false, 0, 6, null));
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(X0, 10));
        java.util.Iterator it = X0.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) it.next())));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SyncExtension", "[isMergeScene] mergeSet=" + arrayList);
        return arrayList.isEmpty() ^ true ? arrayList.contains(java.lang.Integer.valueOf(i17)) : i17 == 13 || i17 == 14 || i17 == 15 || i17 == 16 || i17 == 17 || i17 == 18 || i17 == 19 || i17 == 20 || i17 == 22 || i17 == 23;
    }

    public final void k(java.util.LinkedList linkedList) {
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.vs2 vs2Var = (r45.vs2) it.next();
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = vs2Var.f470034v;
            if (gVar != null) {
                r45.vs2 vs2Var2 = new r45.vs2();
                vs2Var2.f470034v = gVar;
                java.util.LinkedList<r45.f03> show_infos = vs2Var.f470022g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(show_infos, "show_infos");
                for (r45.f03 f03Var : show_infos) {
                    java.util.LinkedList linkedList3 = vs2Var2.f470022g;
                    r45.f03 f03Var2 = new r45.f03();
                    f03Var2.f455425i = f03Var.f455425i;
                    linkedList3.add(f03Var2);
                }
                linkedList2.add(vs2Var2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SyncExtension", "[optCtrlInfoReport] " + hc2.u0.e(vs2Var2));
            } else {
                linkedList2.add(vs2Var);
            }
        }
        linkedList.clear();
        linkedList.addAll(linkedList2);
    }

    public void l(int i17, ya2.x1 handler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        java.util.HashSet hashSet = (java.util.HashSet) f371870q.get(i17);
        if (hashSet != null) {
            hashSet.remove(handler);
        }
    }

    public final java.lang.String m(int i17) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        ya2.u1.f542087o1.getClass();
        jz5.l[] lVarArr = ya2.s1.f542066b;
        for (int i18 = 0; i18 < 14; i18++) {
            jz5.l lVar = lVarArr[i18];
            if ((((java.lang.Number) lVar.f384366d).intValue() & i17) != 0) {
                stringBuffer.append(((java.lang.String) lVar.f384367e) + " ,");
            }
        }
        java.lang.String stringBuffer2 = stringBuffer.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stringBuffer2, "toString(...)");
        return stringBuffer2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r5 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        if (((r6 == null || (r6 = (r45.gl0) r6.m75936x14adae67(11)) == null || r6.m75939xb282bd08(0) != 1) ? false : true) != false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean n(int r9) {
        /*
            r8 = this;
            r0 = 24
            java.lang.String r1 = "updateEntranceReportTime type="
            java.lang.String r2 = "Finder.SyncExtension"
            r3 = 1
            r4 = 0
            r5 = 0
            if (r9 == r0) goto L5a
            r0 = 25
            if (r9 == r0) goto L12
            goto La2
        L12:
            ic2.a r0 = r8.f371875f
            if (r0 == 0) goto L2e
            r45.hl0 r6 = r0.f371837a
            if (r6 == 0) goto L2b
            r7 = 15
            com.tencent.mm.protobuf.f r6 = r6.m75936x14adae67(r7)
            r45.gl0 r6 = (r45.gl0) r6
            if (r6 == 0) goto L2b
            int r6 = r6.m75939xb282bd08(r5)
            if (r6 != r3) goto L2b
            r5 = r3
        L2b:
            if (r5 == 0) goto L2e
            goto L2f
        L2e:
            r0 = r4
        L2f:
            if (r0 != 0) goto L32
            goto L38
        L32:
            long r5 = android.os.SystemClock.uptimeMillis()
            r0.f371849m = r5
        L38:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r9 = " socialHotSpot,discovery tab social hot sync time = "
            r0.append(r9)
            ic2.a r9 = r8.f371875f
            if (r9 == 0) goto L4f
            long r4 = r9.f371849m
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
        L4f:
            r0.append(r4)
            java.lang.String r9 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r9)
            return r3
        L5a:
            ic2.a r0 = r8.f371875f
            if (r0 == 0) goto L77
            r45.hl0 r6 = r0.f371837a
            if (r6 == 0) goto L73
            r7 = 11
            com.tencent.mm.protobuf.f r6 = r6.m75936x14adae67(r7)
            r45.gl0 r6 = (r45.gl0) r6
            if (r6 == 0) goto L73
            int r6 = r6.m75939xb282bd08(r5)
            if (r6 != r3) goto L73
            goto L74
        L73:
            r3 = r5
        L74:
            if (r3 == 0) goto L77
            goto L78
        L77:
            r0 = r4
        L78:
            if (r0 != 0) goto L7b
            goto L81
        L7b:
            long r6 = android.os.SystemClock.uptimeMillis()
            r0.f371848l = r6
        L81:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r9 = " socialHotSpot,discovery tab sync time = "
            r0.append(r9)
            ic2.a r9 = r8.f371875f
            if (r9 == 0) goto L98
            long r3 = r9.f371848l
            java.lang.Long r4 = java.lang.Long.valueOf(r3)
        L98:
            r0.append(r4)
            java.lang.String r9 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r9)
        La2:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ic2.l0.n(int):boolean");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (((java.lang.Boolean) ((jz5.n) this.f371873d).mo141623x754a37bb()).booleanValue()) {
            return;
        }
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.cgi.NetSceneFinderSync");
        db2.d6 d6Var = (db2.d6) m1Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = d6Var.f309477g;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSyncRequest");
        int m75939xb282bd08 = ((r45.zy2) fVar).m75939xb282bd08(1);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("errType ");
        sb6.append(i17);
        sb6.append(", errCode ");
        sb6.append(i18);
        sb6.append(", errMsg ");
        sb6.append(str);
        sb6.append(", cmdList=");
        com.p314xaae8f345.mm.p944x882e457a.n nVar = oVar.f152244b;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = nVar.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSyncResponse");
        java.util.LinkedList m75941xfb821914 = ((r45.az2) fVar2).m75941xfb821914(6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getCmdList(...)");
        sb6.append(m75941xfb821914.size());
        sb6.append(", (curSelector,selector) (");
        sb6.append(this.f371876g);
        sb6.append(',');
        sb6.append(m75939xb282bd08);
        sb6.append("), continueFlag ");
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar3 = nVar.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSyncResponse");
        sb6.append(((r45.az2) fVar3).m75939xb282bd08(2));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SyncExtension", sb6.toString());
        boolean z17 = i17 == 0 && i18 == 0;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar4 = oVar.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar4, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSyncRequest");
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar5 = nVar.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar5, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSyncResponse");
        i(z17, d6Var.f309479i, (r45.zy2) fVar4, (r45.az2) fVar5);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SyncExtension", "[onSceneEnd] cost=" + (android.os.SystemClock.uptimeMillis() - uptimeMillis) + "ms");
    }
}
