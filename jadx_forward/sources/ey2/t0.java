package ey2;

/* loaded from: classes2.dex */
public final class t0 extends pf5.o0 {

    /* renamed from: m, reason: collision with root package name */
    public int f339040m;

    /* renamed from: n, reason: collision with root package name */
    public int f339041n;

    /* renamed from: o, reason: collision with root package name */
    public int f339042o;

    /* renamed from: p, reason: collision with root package name */
    public int f339043p;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f339035e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f339036f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f339037g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f339038h = jz5.h.b(ey2.s0.f339030d);

    /* renamed from: i, reason: collision with root package name */
    public final r45.nx2 f339039i = new r45.nx2();

    /* renamed from: q, reason: collision with root package name */
    public volatile int f339044q = -1;

    /* renamed from: r, reason: collision with root package name */
    public boolean f339045r = true;

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void V6(ey2.t0 r18, java.lang.String r19, int r20, int r21, int r22, java.util.List r23, java.util.ArrayList r24, com.p314xaae8f345.mm.p2495xc50a8b8b.g r25, boolean r26, boolean r27, int r28, java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ey2.t0.V6(ey2.t0, java.lang.String, int, int, int, java.util.List, java.util.ArrayList, com.tencent.mm.protobuf.g, boolean, boolean, int, java.lang.Object):void");
    }

    public final ey2.o0 N6(int i17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f339035e;
        if (concurrentHashMap.get(java.lang.Integer.valueOf(i17)) == null) {
            concurrentHashMap.put(java.lang.Integer.valueOf(i17), new ey2.o0(i17, true));
        }
        java.lang.Object obj = concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        return (ey2.o0) obj;
    }

    public final com.p314xaae8f345.mm.p2621x8fb0427b.u3 O6(int i17) {
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 35 ? i17 != 39 ? com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TAB_TIP_FRIEND_INT : com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TAB_TIP_NATIVE_DRAMA_INT : com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TAB_TIP_LBS_FULLSCREEN_INT : com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TAB_TIP_MACHINE_INT : com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TAB_TIP_FOLLOW_INT : com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TAB_TIP_LBS_INT : com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TAB_TIP_FRIEND_INT;
    }

    public final java.util.concurrent.ConcurrentHashMap P6() {
        return (java.util.concurrent.ConcurrentHashMap) ((jz5.n) this.f339038h).mo141623x754a37bb();
    }

    public final int Q6() {
        int i17 = 4;
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LAST_TAB_TYPE_INT_SYNC, 4);
        zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = nk6.L0("FinderEntrance");
        boolean z17 = L0 != null;
        if (!R6(r17) && !z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.TlTabStateVM", "[getTargetEnterTabType] no autoRefresh... hasEntranceCtrlInfo=" + z17 + " lastExitTabType=" + r17 + " defaultServerTabType=4");
            return r17;
        }
        int c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ta.f187412a.c("Finder.TlTabStateVM", nk6, "FinderEntrance");
        if (c17 == -100) {
            i17 = r17;
        } else if (c17 != -1) {
            i17 = c17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.TlTabStateVM", "[getTargetEnterTabType] autoRefresh... ret=" + i17 + " hasEntranceCtrlInfo=" + z17 + " lastExitTabType=" + r17 + " defaultServerTabType=4 isAtAppPush=" + N6(i17).f338985l);
        boolean z18 = L0 != null && L0.Y0("FinderEntrance");
        if (!R6(i17) && z18) {
            ey2.o0 N6 = N6(i17);
            N6.f338981h = -1L;
            N6.a(ey2.q0.f339005e);
        }
        return i17;
    }

    public final boolean R6(int i17) {
        return S6(N6(i17));
    }

    public final boolean S6(ey2.o0 cache) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cache, "cache");
        ey2.q0 q0Var = cache.f338983j;
        if (q0Var == ey2.q0.f339005e) {
            return true;
        }
        if (q0Var == ey2.q0.f339004d || q0Var == ey2.q0.f339007g) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - cache.f338981h;
            if (this.f339044q == -1) {
                this.f339044q = ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.P1().r()).intValue();
            }
            if (currentTimeMillis > this.f339044q) {
                cache.a(ey2.q0.f339006f);
                return true;
            }
        } else {
            if (q0Var == ey2.q0.f339008h) {
                long currentTimeMillis2 = java.lang.System.currentTimeMillis() - cache.f338982i;
                if (this.f339044q == -1) {
                    this.f339044q = ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.P1().r()).intValue();
                }
                if (currentTimeMillis2 <= this.f339044q) {
                    return false;
                }
                cache.a(ey2.q0.f339006f);
                return true;
            }
            if (q0Var == ey2.q0.f339006f) {
                return true;
            }
        }
        cache.a(ey2.q0.f339007g);
        return false;
    }

    public final void T6(int i17) {
        ey2.o0 N6 = N6(i17);
        N6.a(ey2.q0.f339004d);
        N6.f338981h = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.TlTabStateVM", "[markUnFocusTabType] tabType=" + i17);
    }

    public final void U6() {
        W6(4, ey2.p0.f338997e);
        this.f339035e.clear();
        this.f339036f.clear();
        this.f339037g.clear();
    }

    public final void W6(int i17, ey2.p0 source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.TlTabStateVM", "[storeLastTabType] tabType=" + i17 + " source=" + source);
        if (source == ey2.p0.f338996d) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LAST_TAB_TYPE_INT_SYNC, java.lang.Integer.valueOf(i17));
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LAST_TAB_TYPE_RED_DOT_INT_SYNC, -1);
        }
    }

    public final void X6(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.U2() && (abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) P6().get(java.lang.Integer.valueOf(i18))) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.TlTabStateVM", "updateFirstUnreadFeed fail,source:" + i17 + " tabType=" + i18 + ",feed=" + abstractC14490x69736cb5 + " exist!");
        }
    }

    @Override // pf5.e, p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        super.mo528x82b764cd();
    }
}
