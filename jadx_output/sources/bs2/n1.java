package bs2;

/* loaded from: classes2.dex */
public abstract class n1 {

    /* renamed from: w, reason: collision with root package name */
    public static final bs2.e0 f23905w = new bs2.e0(null);

    /* renamed from: x, reason: collision with root package name */
    public static final jz5.g f23906x = jz5.h.b(bs2.d0.f23824d);

    /* renamed from: a, reason: collision with root package name */
    public final int f23907a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore f23908b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f23909c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f23910d;

    /* renamed from: e, reason: collision with root package name */
    public final bs2.c f23911e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f23912f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f23913g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f23914h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f23915i;

    /* renamed from: j, reason: collision with root package name */
    public r45.fx2 f23916j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f23917k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f23918l;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f23919m;

    /* renamed from: n, reason: collision with root package name */
    public long f23920n;

    /* renamed from: o, reason: collision with root package name */
    public final bs2.s0 f23921o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f23922p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f23923q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.concurrent.locks.Condition f23924r;

    /* renamed from: s, reason: collision with root package name */
    public final bs2.b0 f23925s;

    /* renamed from: t, reason: collision with root package name */
    public db2.n3 f23926t;

    /* renamed from: u, reason: collision with root package name */
    public final bs2.g0 f23927u;

    /* renamed from: v, reason: collision with root package name */
    public final bs2.g0 f23928v;

    public n1(int i17, com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore core) {
        kotlin.jvm.internal.o.g(core, "core");
        this.f23907a = i17;
        this.f23908b = core;
        java.lang.String str = "Finder.TabPreloadWorker#" + i17;
        this.f23909c = str;
        this.f23911e = new bs2.c(str);
        this.f23912f = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.f23913g = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f23914h = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f23915i = jz5.h.b(bs2.c1.f23822d);
        this.f23916j = core.S6();
        this.f23917k = true;
        this.f23918l = jz5.h.b(bs2.h1.f23858d);
        this.f23919m = jz5.h.b(bs2.g1.f23844d);
        this.f23921o = new bs2.s0(this);
        this.f23922p = jz5.h.b(new bs2.b1(this));
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        this.f23923q = reentrantLock;
        this.f23924r = reentrantLock.newCondition();
        this.f23925s = new bs2.b0(this, i17);
        this.f23927u = new bs2.g0(false);
        this.f23928v = new bs2.g0(false);
    }

    public static final void a(bs2.n1 n1Var, db2.c3 c3Var, bs2.h0 h0Var, int i17, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar) {
        boolean z17;
        boolean z18;
        int i18;
        long j17;
        int i19;
        r45.xs2 xs2Var;
        r45.xs2 xs2Var2;
        n1Var.getClass();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) t70Var.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f306225a;
            z18 = false;
        }
        int i27 = n1Var.f23907a;
        if (z18 && i27 == 4) {
            if (com.tencent.mm.plugin.finder.storage.aj0.f126440a.K() ? ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.z70.f128432a.d(t70Var, "视频号推荐页预加载信息展示", java.lang.Boolean.FALSE, new com.tencent.mm.plugin.finder.storage.u70("FINDER_PRELOAD_FEED_COPY_SWITCH_ON"))).booleanValue() : ((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.aj0.f126452g).getValue()).r()).booleanValue()) {
                pm0.v.X(new bs2.l1(c3Var));
            }
        }
        long j18 = n1Var.f23920n;
        java.lang.String str2 = n1Var.f23909c;
        if (j18 != 0 && ((java.lang.Boolean) ((jz5.n) n1Var.f23918l).getValue()).booleanValue() && c3Var.getList(1) != null) {
            long j19 = n1Var.f23920n;
            java.util.LinkedList list = c3Var.getList(1);
            kotlin.jvm.internal.o.f(list, "getObject(...)");
            com.tencent.mars.xlog.Log.i(str2, "setCacheWithPreload removeWaitingFeed " + pm0.v.u(n1Var.f23920n) + " suc=" + n1Var.v(j19, list));
        }
        bs2.b0 b0Var = n1Var.f23925s;
        b0Var.f23806b = c3Var;
        b0Var.f23813i = c3Var.getByteString(2);
        bs2.f0 f0Var = new bs2.f0();
        f0Var.f23837b = i17;
        if (jbVar == null || (xs2Var2 = jbVar.N) == null) {
            i18 = i27;
            j17 = 0;
        } else {
            long j27 = xs2Var2.getLong(3);
            i18 = i27;
            j17 = j27;
        }
        f0Var.f23836a = j17;
        f0Var.f23839d = (jbVar == null || (xs2Var = jbVar.N) == null) ? -1 : xs2Var.getInteger(17);
        f0Var.f23838c = 0L;
        b0Var.f23808d = f0Var;
        b0Var.f23807c = h0Var;
        bs2.h0 h0Var2 = bs2.h0.f23852o;
        if (h0Var == h0Var2) {
            com.tencent.mm.autogen.events.FinderNextTabPreloadEvent finderNextTabPreloadEvent = new com.tencent.mm.autogen.events.FinderNextTabPreloadEvent();
            i19 = i18;
            finderNextTabPreloadEvent.f54313g.f7892a = i19;
            finderNextTabPreloadEvent.e();
            if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f1if).getValue()).r()).booleanValue()) {
                return;
            }
        } else {
            i19 = i18;
        }
        boolean z19 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_preload_video_for_preload_refresh_enable, 1) == 1;
        com.tencent.mars.xlog.Log.i("FinderConfig", "[GET] isEnablePreloadVideoForPreloadStream=" + z19);
        if (z19) {
            boolean booleanValue = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127794kf).getValue()).r()).booleanValue();
            jz5.g gVar = n1Var.f23922p;
            if (!booleanValue || h0Var == h0Var2) {
                java.util.LinkedList list2 = c3Var.getList(1);
                kotlin.jvm.internal.o.f(list2, "getObject(...)");
                com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) kz5.n0.Z(list2);
                if (finderObject != null) {
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed p17 = cu2.u.f222441a.p(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, hc2.d0.d(i19)));
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    linkedList.addAll(p17.getFeedObject().getMediaList());
                    jz5.l lVar = new jz5.l(p17, kz5.n0.V0(linkedList));
                    java.util.LinkedList linkedList2 = new java.util.LinkedList();
                    linkedList2.add(lVar);
                    cs2.p pVar = (cs2.p) kz5.n0.Z(((ds2.b0) ((jz5.n) gVar).getValue()).e(new ek4.b(1, -1, hc2.d0.b(i19), i17 == 6 || i17 == 9 || i17 == 20 || i17 == 8 ? 2 : 5, 0L, null, 0, 112, null), com.tencent.mm.plugin.finder.storage.FeedData.Companion.b(p17.getFeedObject()), kz5.n0.V0(linkedList2), 1000));
                    if (pVar != null) {
                        java.lang.String str3 = pVar.f222092i2;
                        kotlin.jvm.internal.o.g(str3, "<set-?>");
                        c3Var.f227925p = str3;
                    }
                    com.tencent.mars.xlog.Log.i(str2, "setCacheWithPreload: preload mediaId=" + c3Var.f227925p);
                    return;
                }
                return;
            }
            int i28 = ((c61.l7) i95.n0.c(c61.l7.class)).ek().V;
            if (i28 < 1) {
                i28 = 1;
            }
            if (i28 <= 0) {
                com.tencent.mars.xlog.Log.w(str2, "setCacheWithPreload preload return for " + i28);
                return;
            }
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            java.util.LinkedList linkedList4 = new java.util.LinkedList();
            java.util.LinkedList list3 = c3Var.getList(1);
            if (list3 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : list3) {
                    com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) obj;
                    kotlin.jvm.internal.o.d(finderObject2);
                    if (hc2.o0.j(finderObject2) == 4) {
                        arrayList.add(obj);
                    }
                }
                if (!(!arrayList.isEmpty())) {
                    arrayList = null;
                }
                if (arrayList != null) {
                    int size = arrayList.size();
                    if (i28 > size) {
                        i28 = size;
                    }
                    int i29 = 0;
                    for (java.lang.Object obj2 : arrayList.subList(0, i28)) {
                        int i37 = i29 + 1;
                        if (i29 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = (com.tencent.mm.protocal.protobuf.FinderObject) obj2;
                        com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
                        kotlin.jvm.internal.o.d(finderObject3);
                        com.tencent.mm.plugin.finder.model.BaseFinderFeed p18 = cu2.u.f222441a.p(h90Var.a(finderObject3, hc2.d0.d(i19)));
                        linkedList3.add(p18);
                        java.util.LinkedList linkedList5 = new java.util.LinkedList();
                        linkedList5.addAll(p18.getFeedObject().getMediaList());
                        linkedList4.add(new jz5.l(p18, kz5.n0.V0(linkedList5)));
                        i29 = i37;
                    }
                }
            }
            if (linkedList3.isEmpty()) {
                return;
            }
            cs2.p pVar2 = (cs2.p) kz5.n0.Z(((ds2.b0) ((jz5.n) gVar).getValue()).e(new ek4.b(1, -1, hc2.d0.b(i19), i17 == 6 || i17 == 9 || i17 == 20 || i17 == 8 ? 2 : 5, 0L, null, 0, 112, null), com.tencent.mm.plugin.finder.storage.FeedData.Companion.b(((com.tencent.mm.plugin.finder.model.BaseFinderFeed) linkedList3.getFirst()).getFeedObject()), kz5.n0.V0(linkedList4), 1000));
            if (pVar2 != null) {
                java.lang.String str4 = pVar2.f222092i2;
                kotlin.jvm.internal.o.g(str4, "<set-?>");
                c3Var.f227925p = str4;
                pm0.v.V(0L, new bs2.m1(n1Var, linkedList3, pVar2));
            }
            com.tencent.mars.xlog.Log.i(str2, "setCacheWithPreload: new preload mediaId=" + c3Var.f227925p);
        }
    }

    public static /* synthetic */ void r(bs2.n1 n1Var, bs2.h0 h0Var, android.content.Intent intent, yz5.l lVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: preload");
        }
        if ((i17 & 2) != 0) {
            intent = null;
        }
        n1Var.q(h0Var, intent, lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static db2.c3 w(bs2.n1 r35, int r36, boolean r37, yz5.a r38, int r39, java.lang.Object r40) {
        /*
            Method dump skipped, instructions count: 1127
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bs2.n1.w(bs2.n1, int, boolean, yz5.a, int, java.lang.Object):db2.c3");
    }

    public void b() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f23923q;
        reentrantLock.lock();
        try {
            db2.n3 n3Var = this.f23926t;
            if (n3Var != null) {
                n3Var.b();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean c() {
        bs2.b0 b0Var = this.f23925s;
        if (b0Var.f23806b == null) {
            return false;
        }
        long c17 = c01.id.c() - b0Var.f23810f;
        com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore finderStreamTabPreloadCore = this.f23908b;
        int i17 = this.f23907a;
        boolean z17 = c17 <= finderStreamTabPreloadCore.O6(i17) || b0Var.f23810f == 0;
        com.tencent.mars.xlog.Log.i(this.f23909c, "checkCacheValid: isCacheValid = " + z17 + ", tabType = " + i17 + ", cache.lastTime = " + b0Var.f23810f);
        if (!z17) {
            e(true, "cacheInvalid");
        }
        return z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bs2.n1.d(java.lang.String):void");
    }

    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [bs2.f0, bs2.h0, db2.c3] */
    /* JADX WARN: Type inference failed for: r4v6 */
    public boolean e(boolean z17, java.lang.String source) {
        java.util.concurrent.locks.ReentrantLock reentrantLock;
        db2.c3 c3Var;
        boolean z18;
        java.lang.String str;
        ?? r47;
        boolean z19;
        int i17;
        java.lang.String str2;
        int i18;
        java.util.LinkedList list;
        bs2.b0 b0Var = this.f23925s;
        kotlin.jvm.internal.o.g(source, "source");
        java.util.concurrent.locks.ReentrantLock reentrantLock2 = this.f23923q;
        reentrantLock2.lock();
        try {
            c3Var = b0Var.f23806b;
            z18 = c3Var != null;
        } catch (java.lang.Throwable th6) {
            th = th6;
            reentrantLock = reentrantLock2;
        }
        try {
            if (z17) {
                if (c3Var != null && (list = c3Var.getList(1)) != null) {
                    b0Var.f23809e.addAll(list);
                    b0Var.f23812h++;
                    u(list);
                    pm0.v.X(new bs2.l0(this, list));
                }
                if (z18) {
                    bs2.o oVar = bs2.o.f23929a;
                    bs2.n nVar = bs2.n.f23899g;
                    bs2.h0 h0Var = b0Var.f23807c;
                    int i19 = this.f23907a;
                    bs2.f0 f0Var = b0Var.f23808d;
                    if (f0Var == null) {
                        f0Var = new bs2.f0();
                    }
                    r45.fx2 fx2Var = this.f23916j;
                    if (r26.i0.y(source, "newRedDotStatus=", false)) {
                        java.lang.String substring = source.substring(source.length() - 2);
                        kotlin.jvm.internal.o.f(substring, "substring(...)");
                        java.lang.Integer h17 = r26.h0.h(substring);
                        if (h17 != null) {
                            i18 = h17.intValue();
                            str = null;
                            reentrantLock = reentrantLock2;
                            i17 = 1;
                            oVar.a(nVar, h0Var, i19, f0Var, fx2Var, i18, source);
                        }
                    }
                    i18 = 0;
                    str = null;
                    reentrantLock = reentrantLock2;
                    i17 = 1;
                    oVar.a(nVar, h0Var, i19, f0Var, fx2Var, i18, source);
                } else {
                    reentrantLock = reentrantLock2;
                    str = null;
                    i17 = 1;
                }
                db2.c3 c3Var2 = b0Var.f23806b;
                if (c3Var2 == null || (str2 = c3Var2.f227925p) == null) {
                    str2 = "";
                }
                mn2.g4 g4Var = bs2.f.f23832c;
                if (kotlin.jvm.internal.o.b(str2, g4Var != null ? g4Var.n() : str)) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clearCache: source=cacheClear, cacheMedia=");
                    sb6.append(hc2.b0.g(bs2.f.f23833d, 0, i17, str));
                    sb6.append('.');
                    mn2.g4 g4Var2 = bs2.f.f23832c;
                    sb6.append(g4Var2 != null ? g4Var2.n() : str);
                    com.tencent.mars.xlog.Log.i("FinderPlayerPreloadCore", sb6.toString());
                    pm0.v.X(bs2.d.f23823d);
                }
            } else {
                reentrantLock = reentrantLock2;
                str = null;
                b0Var.f23812h = 0L;
            }
            if (z18) {
                java.lang.String str3 = this.f23909c;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("clear: source=");
                sb7.append(source);
                sb7.append(", tabType=");
                sb7.append(this.f23907a);
                sb7.append(" cache=");
                sb7.append(b0Var);
                sb7.append(" isRecycle=");
                r47 = str;
                z19 = z17;
                sb7.append(z19);
                com.tencent.mars.xlog.Log.i(str3, sb7.toString());
            } else {
                r47 = str;
                z19 = z17;
            }
            b0Var.f23806b = r47;
            b0Var.f23807c = r47;
            b0Var.f23808d = r47;
            if (z18 && z19 && b0Var.f23805a == 4) {
                pm0.v.X(new bs2.m0(this));
            }
            reentrantLock.unlock();
            return z18;
        } catch (java.lang.Throwable th7) {
            th = th7;
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        if (r11 <= 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long f() {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bs2.n1.f():long");
    }

    public bs2.h0 g() {
        return bs2.h0.f23848h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (r0.N.getInteger(17) != 1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r5.f23806b != null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final bs2.h0 h() {
        /*
            r8 = this;
            boolean r0 = r8.n()
            if (r0 == 0) goto L11
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.f23914h
            boolean r0 = r0.get()
            if (r0 != 0) goto L11
            bs2.h0 r0 = bs2.h0.f23854q
            return r0
        L11:
            zy2.fa r0 = r8.j()
            java.lang.String r1 = "FinderEntrance"
            com.tencent.mm.plugin.finder.extension.reddot.jb r0 = r0.L0(r1)
            r2 = 0
            if (r0 == 0) goto L23
            r45.f03 r1 = r0.I0(r1)
            goto L24
        L23:
            r1 = r2
        L24:
            if (r0 == 0) goto L31
            r45.xs2 r3 = r0.N
            if (r3 == 0) goto L31
            r4 = 9
            int r3 = r3.getInteger(r4)
            goto L32
        L31:
            r3 = -1
        L32:
            r4 = 17
            bs2.b0 r5 = r8.f23925s
            if (r0 == 0) goto L5c
            if (r1 == 0) goto L5c
            int r1 = r8.f23907a
            if (r1 != r3) goto L5c
            jz5.g r1 = bs2.n1.f23906x
            jz5.n r1 = (jz5.n) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r6 = 1
            if (r1 != 0) goto L57
            r45.xs2 r1 = r0.N
            int r1 = r1.getInteger(r4)
            if (r1 != r6) goto L5c
        L57:
            db2.c3 r1 = r5.f23806b
            if (r1 != 0) goto L5c
            goto L5d
        L5c:
            r6 = 0
        L5d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r7 = "getOutsidePreloadSource: isRedDotPreload = "
            r1.<init>(r7)
            r1.append(r6)
            java.lang.String r7 = ", redDotTabType="
            r1.append(r7)
            r1.append(r3)
            java.lang.String r3 = ", redDotExt.pre_load="
            r1.append(r3)
            if (r0 == 0) goto L83
            r45.xs2 r3 = r0.N
            if (r3 == 0) goto L83
            int r3 = r3.getInteger(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L84
        L83:
            r3 = r2
        L84:
            r1.append(r3)
            java.lang.String r3 = ", cache.resp="
            r1.append(r3)
            db2.c3 r3 = r5.f23806b
            r1.append(r3)
            java.lang.String r3 = ", tipsId="
            r1.append(r3)
            if (r0 == 0) goto L9a
            java.lang.String r2 = r0.field_tipsId
        L9a:
            r1.append(r2)
            java.lang.String r2 = ", redDotObjectId="
            r1.append(r2)
            if (r0 == 0) goto Lae
            r45.xs2 r0 = r0.N
            if (r0 == 0) goto Lae
            r2 = 3
            long r2 = r0.getLong(r2)
            goto Lb0
        Lae:
            r2 = 0
        Lb0:
            java.lang.String r0 = pm0.v.u(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = r8.f23909c
            com.tencent.mars.xlog.Log.i(r1, r0)
            if (r6 == 0) goto Lc5
            bs2.h0 r0 = bs2.h0.f23846f
            goto Lc9
        Lc5:
            bs2.h0 r0 = r8.g()
        Lc9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bs2.n1.h():bs2.h0");
    }

    public final int i(bs2.h0 source) {
        kotlin.jvm.internal.o.g(source, "source");
        switch (source.ordinal()) {
            case 0:
            case 2:
                return 6;
            case 1:
                return 7;
            case 3:
                return 5;
            case 4:
                return 8;
            case 5:
                return 0;
            case 6:
                return 17;
            case 7:
            default:
                return 9;
            case 8:
                return 20;
        }
    }

    public final zy2.fa j() {
        return (zy2.fa) ((jz5.n) this.f23915i).getValue();
    }

    public final long k(int i17) {
        if (i17 == 1) {
            return 20L;
        }
        if (i17 == 2) {
            return 60L;
        }
        if (i17 == 3) {
            return 0L;
        }
        if (i17 == 4) {
            return 40L;
        }
        if (i17 != 35) {
            return i17 != 39 ? 0L : 100L;
        }
        return 80L;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(com.tencent.mm.plugin.finder.storage.FinderItem r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bs2.n1.l(com.tencent.mm.plugin.finder.storage.FinderItem, java.lang.String, java.lang.String):void");
    }

    public boolean m(bs2.h0 source, db2.c3 resp) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(resp, "resp");
        return true;
    }

    public final boolean n() {
        return this.f23908b.S6().getBoolean(32) && this.f23916j.getInteger(33) > 0;
    }

    public boolean o(bs2.h0 source, java.lang.String log) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(log, "log");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[isValid] isEnableScene=");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f23913g;
        sb6.append(atomicBoolean);
        sb6.append(" isBackground=");
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean2 = this.f23912f;
        sb6.append(atomicBoolean2);
        sb6.append(" isInFinder=");
        sb6.append(this.f23910d);
        sb6.append(" source=");
        sb6.append(source);
        sb6.append(' ');
        sb6.append(log);
        com.tencent.mars.xlog.Log.i(this.f23909c, sb6.toString());
        return (source == bs2.h0.f23846f || source == bs2.h0.f23850m || source == bs2.h0.f23848h || source == bs2.h0.f23851n || source == bs2.h0.f23854q) ? (this.f23910d || !atomicBoolean.get() || atomicBoolean2.get()) ? false : true : this.f23910d && atomicBoolean.get() && !atomicBoolean2.get();
    }

    public void p(int i17, r45.fx2 serverConfig) {
        kotlin.jvm.internal.o.g(serverConfig, "serverConfig");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[performServerConfigChanged] fromTabType=");
        sb6.append(i17);
        sb6.append(" serverConfig=");
        sb6.append("[" + serverConfig.getInteger(0) + ", " + serverConfig.getInteger(1) + ", " + serverConfig.getInteger(2) + ", " + serverConfig.getInteger(3) + ", " + serverConfig.getInteger(4) + ", " + serverConfig.getInteger(5) + ", " + serverConfig.getInteger(6) + ", " + serverConfig.getInteger(7) + ", " + serverConfig.getInteger(8) + ", " + serverConfig.getInteger(9) + ", " + serverConfig.getInteger(10) + ", " + serverConfig.getInteger(11) + ", " + serverConfig.getInteger(12) + ", " + serverConfig.getInteger(13) + ", " + serverConfig.getInteger(14) + ", " + serverConfig.getInteger(15) + ", " + serverConfig.getBoolean(16) + ", new: " + serverConfig.getInteger(20) + ", " + serverConfig.getInteger(21) + ", " + serverConfig.getInteger(22) + ", " + serverConfig.getInteger(23) + ", valid: " + serverConfig.getInteger(24) + ", " + serverConfig.getInteger(25) + ", " + serverConfig.getInteger(26) + ", " + serverConfig.getInteger(27) + ", tabPrefetch:" + serverConfig.getInteger(30) + ", frontend_prefetch_switch:" + serverConfig.getBoolean(32) + " frontend_prefetch_interval_sec:" + serverConfig.getInteger(33) + " reddot_frontend_prefetch_switch:" + serverConfig.getBoolean(35) + ']');
        com.tencent.mars.xlog.Log.i(this.f23909c, sb6.toString());
        this.f23916j = serverConfig;
    }

    public void q(bs2.h0 source, android.content.Intent intent, yz5.l call) {
        java.util.concurrent.locks.ReentrantLock reentrantLock;
        int i17;
        r45.xs2 xs2Var;
        r45.xs2 xs2Var2;
        r45.xs2 xs2Var3;
        r45.xs2 xs2Var4;
        java.lang.String nk6;
        java.lang.String str;
        java.lang.String str2;
        java.util.LinkedList list;
        bs2.b0 b0Var = this.f23925s;
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(call, "call");
        boolean V6 = this.f23908b.V6(source);
        java.lang.String str3 = this.f23909c;
        if (!V6) {
            com.tencent.mars.xlog.Log.w(str3, "isEnable=false source=" + source);
            call.invoke(bs2.i0.f23861e);
            return;
        }
        if (!o(source, "")) {
            com.tencent.mars.xlog.Log.w(str3, "isValid=false source=" + source);
            call.invoke(bs2.i0.f23862f);
            return;
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock2 = this.f23923q;
        reentrantLock2.lock();
        try {
            bs2.g0 g0Var = this.f23927u;
            if (g0Var.f23842a) {
                com.tencent.mars.xlog.Log.w(str3, "isLoading=true source=" + source);
                call.invoke(bs2.i0.f23860d);
                reentrantLock2.unlock();
                return;
            }
            g0Var.f23842a = true;
            g0Var.f23843b = source;
            int i18 = i(source);
            boolean z17 = b0Var.f23806b != null;
            com.tencent.mm.protobuf.g gVar = b0Var.f23813i;
            int i19 = this.f23907a;
            if (gVar == null) {
                java.lang.Object m17 = gm0.j1.u().c().m(hc2.d0.c(i19), "");
                kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.String");
                gVar = com.tencent.mm.protobuf.g.b(com.tencent.mm.sdk.platformtools.t8.h((java.lang.String) m17));
            }
            com.tencent.mm.protobuf.g gVar2 = gVar;
            db2.c3 c3Var = b0Var.f23806b;
            java.util.LinkedList linkedList = (c3Var == null || (list = c3Var.getList(1)) == null) ? new java.util.LinkedList() : new java.util.LinkedList(list);
            com.tencent.mm.plugin.finder.extension.reddot.jb L0 = j().L0("FinderEntrance");
            if (i18 == 0 && (i19 == 1 || i19 == 3)) {
                try {
                    java.util.List b17 = hc2.v.b(hc2.f0.d(hc2.v.a(com.tencent.mm.plugin.finder.feed.model.internal.m0.f108015e.a(i19).f108034d, null, 0, true, false, false, 0, 118, null), com.tencent.mm.plugin.finder.model.BaseFinderFeed.class), i19);
                    java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(b17, 10));
                    java.util.Iterator it = ((java.util.ArrayList) b17).iterator();
                    while (it.hasNext()) {
                        arrayList.add(((com.tencent.mm.plugin.finder.model.BaseFinderFeed) it.next()).getFeedObject().getFeedObject());
                    }
                    linkedList.addAll(arrayList);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append("preload: tabType=");
                    sb6.append(i19);
                    sb6.append(", unreadList=");
                    sb6.append(linkedList.size());
                    sb6.append(" first=");
                    com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) kz5.n0.k0(linkedList);
                    sb6.append(pm0.v.u(finderObject != null ? finderObject.getId() : 0L));
                    sb6.append("(thread=");
                    sb6.append(java.lang.Thread.currentThread());
                    sb6.append(')');
                    com.tencent.mars.xlog.Log.i(str3, sb6.toString());
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    reentrantLock = reentrantLock2;
                    reentrantLock.unlock();
                    throw th;
                }
            }
            try {
                if (e(true, "nextPreload") && source != bs2.h0.f23851n) {
                    bs2.g.a(bs2.g.f23841a, 0, 0, 3, 2, false, 0, false, 115, null);
                }
                r45.qt2 qt2Var = new r45.qt2();
                qt2Var.set(5, java.lang.Integer.valueOf(((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).bl(i19)));
                bs2.h0 h0Var = bs2.h0.f23851n;
                if (source == h0Var) {
                    qt2Var.set(2, com.tencent.mm.plugin.finder.viewmodel.component.ny.L1.a(i19));
                    if (intent == null || (nk6 = intent.getStringExtra("key_context_id")) == null) {
                        nk6 = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).nk();
                    }
                    qt2Var.set(1, nk6);
                    java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
                    if (Ri == null) {
                        Ri = "";
                    }
                    i17 = 0;
                    qt2Var.set(0, Ri);
                    if (intent == null || (str = intent.getStringExtra("key_extra_info")) == null) {
                        str = "";
                    }
                    qt2Var.set(11, str);
                    if (intent == null || (str2 = intent.getStringExtra("key_enter_source_info")) == null) {
                        str2 = "";
                    }
                    qt2Var.set(12, str2);
                } else {
                    i17 = 0;
                }
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append("preload: tabType=");
                sb7.append(i19);
                sb7.append(", hasCache=");
                sb7.append(z17);
                sb7.append(", consumeFlag=");
                sb7.append(z17 ? i17 : 1);
                sb7.append(", unread list size=");
                sb7.append(linkedList.size());
                sb7.append(", pullType=");
                sb7.append(i18);
                sb7.append(", source=");
                sb7.append(source);
                sb7.append(", cache=");
                sb7.append(b0Var);
                com.tencent.mars.xlog.Log.i(str3, sb7.toString());
                jx3.f.INSTANCE.idkeyStat(1421L, k(i19) + 11, 1L, false);
                bs2.o oVar = bs2.o.f23929a;
                if (source != h0Var) {
                    bs2.n nVar = bs2.n.f23897e;
                    int i27 = this.f23907a;
                    bs2.f0 f0Var = new bs2.f0();
                    f0Var.f23837b = i18;
                    f0Var.f23836a = (L0 == null || (xs2Var4 = L0.N) == null) ? 0L : xs2Var4.getLong(3);
                    f0Var.f23839d = (L0 == null || (xs2Var3 = L0.N) == null) ? -1 : xs2Var3.getInteger(17);
                    f0Var.f23838c = 0L;
                    bs2.o.b(oVar, nVar, source, i27, f0Var, this.f23916j, source.f23857e, null, 64, null);
                    db2.n3 n3Var = new db2.n3(this.f23907a, i18, gVar2, qt2Var, linkedList, true, false, false, 0, false, null, null, null, 8128, null);
                    n3Var.e(new fb2.f(), i17);
                    n3Var.e(new fb2.e(), 1);
                    n3Var.f228092t = new bs2.v0(z17, source, i18, this, n3Var);
                    n3Var.f228091s = new bs2.w0(this, source, n3Var, i18, L0, call);
                    n3Var.i();
                    this.f23926t = n3Var;
                    reentrantLock = reentrantLock2;
                } else {
                    reentrantLock = reentrantLock2;
                    try {
                        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c), null, null, new bs2.q0(call, this, source, gVar2, qt2Var, linkedList, z17, null), 3, null);
                        bs2.n nVar2 = bs2.n.f23896d;
                        int i28 = this.f23907a;
                        bs2.f0 f0Var2 = new bs2.f0();
                        f0Var2.f23837b = i18;
                        f0Var2.f23836a = (L0 == null || (xs2Var2 = L0.N) == null) ? 0L : xs2Var2.getLong(3);
                        f0Var2.f23839d = (L0 == null || (xs2Var = L0.N) == null) ? -1 : xs2Var.getInteger(17);
                        f0Var2.f23838c = 0L;
                        bs2.o.b(oVar, nVar2, source, i28, f0Var2, this.f23916j, 0, null, 96, null);
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                reentrantLock.unlock();
            } catch (java.lang.Throwable th8) {
                th = th8;
                reentrantLock = reentrantLock2;
                reentrantLock.unlock();
                throw th;
            }
        } catch (java.lang.Throwable th9) {
            th = th9;
            reentrantLock = reentrantLock2;
        }
    }

    public final boolean s(java.lang.String str) {
        if (this.f23907a != 4) {
            return false;
        }
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        boolean booleanValue = ((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127739hf).getValue()).r()).booleanValue();
        java.lang.String str2 = this.f23909c;
        if (booleanValue) {
            com.tencent.mars.xlog.Log.w(str2, "preloadRedDotFeed return for FINDER_FIND_PAGE_PRELOAD_ONE");
            return false;
        }
        if (!this.f23913g.get() && !this.f23908b.S6().getBoolean(35)) {
            com.tencent.mars.xlog.Log.i(str2, "preloadRedDotFeed: it is not enable scene! source=" + str);
            return false;
        }
        if (this.f23912f.get()) {
            com.tencent.mars.xlog.Log.i(str2, "preloadRedDotFeed: it is in background! source=" + str);
            return false;
        }
        if (this.f23910d) {
            com.tencent.mars.xlog.Log.i(str2, "preloadRedDotFeed: it is in finder, source=" + str);
            return false;
        }
        if (this.f23925s.f23806b != null) {
            com.tencent.mars.xlog.Log.i(str2, "preloadRedDotFeed: already has cache, source=" + str);
            return false;
        }
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = j().L0("FinderEntrance");
        if (L0 == null) {
            com.tencent.mars.xlog.Log.i(str2, "preloadRedDotFeed: entrance red dot is null, source=" + str);
            return false;
        }
        r45.xs2 xs2Var = L0.N;
        long j17 = xs2Var.getLong(3);
        java.lang.String string = xs2Var.getString(8);
        com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(j17);
        boolean z17 = h17 != null && h17.isUrlValid();
        if (!(f23905w.a(L0, "preloadRedDotFeed") && !z17)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preloadRedDotFeed: don't need preload, source=");
            sb6.append(str);
            sb6.append(", existCache=");
            sb6.append(h17 != null);
            sb6.append(", isUrlValid=");
            sb6.append(z17);
            sb6.append(", objectId=");
            sb6.append(pm0.v.u(j17));
            com.tencent.mars.xlog.Log.i(str2, sb6.toString());
            return false;
        }
        bs2.g0 g0Var = this.f23928v;
        if (g0Var.f23842a) {
            com.tencent.mars.xlog.Log.w(str2, "preloadRedDotFeed: isLoading=true source=" + str + ", objectId=" + pm0.v.u(j17));
            return false;
        }
        g0Var.f23842a = true;
        r45.sf6 sf6Var = new r45.sf6();
        sf6Var.set(0, java.lang.Long.valueOf(xs2Var.getLong(3)));
        sf6Var.set(1, xs2Var.getByteString(7));
        new db2.g4(j17, string, 0, 2, "", true, null, null, 0L, null, false, false, null, null, 10, null, false, sf6Var, null, null, null, null, 0, 0, null, null, false, null, null, 536715200, null).l().h(new bs2.y0(this, str));
        return true;
    }

    public final void t(db2.c3 resp, bs2.h0 source, int i17, bs2.f0 f0Var, long j17) {
        java.util.concurrent.locks.Condition condition = this.f23924r;
        bs2.g0 g0Var = this.f23927u;
        bs2.b0 b0Var = this.f23925s;
        kotlin.jvm.internal.o.g(resp, "resp");
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mars.xlog.Log.i(this.f23909c, "putCache: source=" + source + " pullType=" + i17);
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f23923q;
        reentrantLock.lock();
        try {
            b0Var.f23813i = resp.getByteString(2);
            b0Var.f23806b = resp;
            b0Var.f23807c = source;
            b0Var.f23808d = f0Var;
            b0Var.f23810f = j17;
        } finally {
            g0Var.f23842a = false;
            g0Var.f23843b = source;
            condition.signalAll();
            reentrantLock.unlock();
        }
    }

    public final void u(java.util.List list) {
        int i17;
        java.util.LinkedList list2;
        com.tencent.mars.xlog.Log.i(this.f23909c, "recycleObjects: size = " + list.size());
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            i17 = this.f23907a;
            if (!hasNext) {
                break;
            }
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) it.next();
            if (!bu2.j.f24534a.i(i17, finderObject.getId())) {
                r45.e13 e13Var = new r45.e13();
                e13Var.set(0, java.lang.Long.valueOf(finderObject.getId()));
                r45.dm2 object_extend = finderObject.getObject_extend();
                e13Var.set(4, object_extend != null ? object_extend.getString(62) : null);
                e13Var.set(1, finderObject.getObjectNonceId());
                e13Var.set(3, finderObject.getSessionBuffer());
                e13Var.set(2, java.lang.Integer.valueOf(i17));
                linkedList.add(e13Var);
            }
        }
        if (!linkedList.isEmpty()) {
            r45.qt2 qt2Var = new r45.qt2();
            qt2Var.set(5, java.lang.Integer.valueOf(((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).bl(i17)));
            db2.f fVar = new db2.f(linkedList, qt2Var);
            r45.kv0 kv0Var = (r45.kv0) fVar.f227966u.getCustom(1);
            if (kv0Var != null && (list2 = kv0Var.getList(7)) != null) {
                java.util.Iterator it6 = list.iterator();
                while (it6.hasNext()) {
                    com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) it6.next();
                    r45.fl2 fl2Var = new r45.fl2();
                    fl2Var.set(0, java.lang.Long.valueOf(finderObject2.getId()));
                    fl2Var.set(1, finderObject2.getSessionBuffer());
                    com.tencent.mars.xlog.Log.i("Finder.CgiCollectUnreadItem", "fillFinderBaseReqData: feedId = " + pm0.v.u(fl2Var.getLong(0)) + ", session_buffer = " + fl2Var.getString(1));
                    list2.add(fl2Var);
                }
            }
            fVar.l();
        }
    }

    public final boolean v(long j17, java.util.LinkedList linkedList) {
        if (!((java.lang.Boolean) ((jz5.n) this.f23919m).getValue()).booleanValue()) {
            return pm0.v.d0(linkedList, new bs2.f1(j17));
        }
        if (linkedList.size() > 1) {
            return pm0.v.d0(linkedList, new bs2.e1(j17));
        }
        return false;
    }

    public final void x(boolean z17, bs2.h0 source) {
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mars.xlog.Log.i(this.f23909c, "setLoading: load=" + z17);
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f23923q;
        reentrantLock.lock();
        try {
            bs2.g0 g0Var = this.f23927u;
            g0Var.f23842a = z17;
            g0Var.f23843b = source;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void y(bs2.h0 source, int i17) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(source, "source");
        bs2.b0 b0Var = this.f23925s;
        b0Var.f23807c = source;
        b0Var.getClass();
        b0Var.f23810f = source.f23857e == 2 ? b0Var.f23810f : c01.id.c();
        if (source == bs2.h0.f23846f) {
            b0Var.f23811g = c01.id.c();
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = b0Var.f23815k;
        int i18 = source.f23856d;
        concurrentHashMap.put(java.lang.Integer.valueOf(i18), new bs2.c0(b0Var.f23810f));
        r45.gt2 b17 = b0Var.b();
        java.util.LinkedList list = b17.getList(0);
        kotlin.jvm.internal.o.f(list, "getCaches(...)");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r45.ft2) obj).getInteger(2) == i18) {
                    break;
                }
            }
        }
        r45.ft2 ft2Var = (r45.ft2) obj;
        if (ft2Var == null) {
            ft2Var = new r45.ft2();
            b17.getList(0).add(ft2Var);
        }
        ft2Var.set(2, java.lang.Integer.valueOf(i18));
        ft2Var.set(1, java.lang.Long.valueOf(b0Var.f23810f));
        ft2Var.set(0, java.lang.Integer.valueOf(b0Var.f23805a));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_TIMELINE_PRELOAD_REFRESH_CACHE_STRING, com.tencent.mm.sdk.platformtools.t8.l(b17.toByteArray()));
        b0Var.a(b17, "storeTime");
        if (i17 != 4) {
            b0Var.c(0);
            return;
        }
        b0Var.c(b0Var.f23814j + 1);
        com.tencent.mars.xlog.Log.i(this.f23909c, "storeTime: cgi fail, cgiFailRetryCnt=" + b0Var.f23814j);
    }
}
