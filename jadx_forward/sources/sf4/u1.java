package sf4;

/* loaded from: classes4.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public static final sf4.u1 f489116a = new sf4.u1();

    /* renamed from: b, reason: collision with root package name */
    public static final sf4.x f489117b = new sf4.x();

    /* renamed from: c, reason: collision with root package name */
    public static int f489118c;

    /* renamed from: d, reason: collision with root package name */
    public static int f489119d;

    /* renamed from: e, reason: collision with root package name */
    public static int f489120e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f489121f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Map f489122g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Set f489123h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.List f489124i;

    /* renamed from: j, reason: collision with root package name */
    public static int f489125j;

    /* renamed from: k, reason: collision with root package name */
    public static sf4.o1 f489126k;

    /* renamed from: l, reason: collision with root package name */
    public static volatile java.lang.String f489127l;

    /* renamed from: m, reason: collision with root package name */
    public static volatile java.lang.Long f489128m;

    /* renamed from: n, reason: collision with root package name */
    public static long f489129n;

    /* renamed from: o, reason: collision with root package name */
    public static long f489130o;

    /* renamed from: p, reason: collision with root package name */
    public static long f489131p;

    static {
        java.util.Map synchronizedMap = java.util.Collections.synchronizedMap(new java.util.HashMap());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(synchronizedMap, "synchronizedMap(...)");
        f489121f = synchronizedMap;
        java.util.Map synchronizedMap2 = java.util.Collections.synchronizedMap(new java.util.HashMap());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(synchronizedMap2, "synchronizedMap(...)");
        f489122g = synchronizedMap2;
        java.util.Set synchronizedSet = java.util.Collections.synchronizedSet(new java.util.HashSet());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(synchronizedSet, "synchronizedSet(...)");
        f489123h = synchronizedSet;
        java.util.List synchronizedList = java.util.Collections.synchronizedList(new java.util.LinkedList());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(synchronizedList, "synchronizedList(...)");
        f489124i = synchronizedList;
        f489125j = 3;
        f489126k = new sf4.o1(new java.util.ArrayList(), 0, 0, null, false, 16, null);
    }

    public static final void a(sf4.u1 u1Var, java.lang.String str) {
        u1Var.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.StoryVideoPreloadMgr", "onVideoSourceChange: " + str, new java.lang.Object[0]);
        if4.h hVar = (if4.h) f489121f.get(str);
        if (hVar != null) {
            u1Var.d(hVar);
            nf4.o b17 = ef4.k0.f333992a.b(hVar);
            b17.f66549x799e9d9e = 0;
            b17.f66552x78351860 = 0;
            ef4.w.f334001t.k().D0(b17);
            com.p314xaae8f345.mm.vfs.w6.h(b17.f66550xf1e9b966);
        }
    }

    public static void b(sf4.u1 u1Var, java.util.List videoItemList, int i17, int i18, java.lang.Object obj) {
        int intValue;
        java.lang.Object obj2;
        int i19 = 0;
        if ((i18 & 2) != 0) {
            i17 = 0;
        }
        u1Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoItemList, "videoItemList");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.StoryVideoPreloadMgr", "addPreloadVideo withList " + videoItemList.size(), new java.lang.Object[0]);
        boolean h17 = u1Var.h();
        sf4.x xVar = f489117b;
        int i27 = xVar.f489142b;
        int g17 = u1Var.g();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryVideoPreloadMgr", "addPreloadVideo withList, isGoodNetwork:" + h17 + ", isBadNetwork:" + (1 <= g17 && g17 <= i27) + ", currentSpeed:" + u1Var.g() + " preloadRunningSet " + f489124i.size() + " downloadExpect " + i17);
        int i28 = xVar.f489142b;
        int g18 = u1Var.g();
        java.util.List list = 1 <= g18 && g18 <= i28 ? xVar.f489144d : xVar.f489143c;
        synchronized (videoItemList) {
            java.util.Iterator it = videoItemList.iterator();
            while (it.hasNext()) {
                if4.h hVar = (if4.h) it.next();
                sf4.u1 u1Var2 = f489116a;
                if (u1Var2.j(hVar)) {
                    if (i17 > 0) {
                        intValue = i17;
                    } else {
                        intValue = ((java.lang.Number) (i19 < list.size() ? list.get(i19) : kz5.n0.i0(list))).intValue();
                    }
                    int n17 = u1Var2.n(i19);
                    ef4.k0 k0Var = ef4.k0.f333992a;
                    java.lang.String a17 = k0Var.a(hVar.f372788c, hVar.f372791f.f471556f);
                    int c17 = u1Var2.c(a17, hVar.f372791f, intValue, u1Var2.h());
                    nf4.o b17 = k0Var.b(hVar);
                    java.util.Iterator it6 = f489124i.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = it6.next();
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((sf4.q1) obj2).f489106c, a17)) {
                                break;
                            }
                        }
                    }
                    if (obj2 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryVideoPreloadMgr", "addPreloadVideo withList, " + a17 + ", already prealoding!");
                    } else {
                        if (!b17.u0() && (b17.f66549x799e9d9e / b17.f66552x78351860) * 100 < c17) {
                            if (f489116a.k(hVar, c17, n17, new sf4.q1(0, i19, hVar, intValue, n17))) {
                                i19++;
                            }
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryVideoPreloadMgr", "addPreloadVideo withList, " + a17 + ", already reach cache size! cacheSize:" + b17.f66549x799e9d9e + ", totalSize:" + b17.f66552x78351860 + ", cachePercent:" + ((b17.f66549x799e9d9e / b17.f66552x78351860) * 100));
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryVideoPreloadMgr", "finish addPreloadVideo withList, total pull video task:" + i19 + " preloadRunningSet " + f489124i.size());
    }

    public static boolean l(sf4.u1 u1Var, java.util.List groupItems, int i17, int i18, boolean z17, int i19, java.lang.Object obj) {
        int i27;
        if4.f fVar;
        if4.h hVar;
        boolean z18 = (i19 & 8) != 0 ? true : z17;
        u1Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupItems, "groupItems");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryVideoPreloadMgr", "setPreloadQueueFromGallery, galleryItems size:" + groupItems.size() + ", positionV:" + i17 + "  positionH:" + i18 + ", skipPosition:" + z18);
        sf4.o1 o1Var = f489126k;
        o1Var.getClass();
        if (!(!o1Var.b(groupItems) && o1Var.f489072b == i18 && o1Var.f489071a == i17)) {
            if (i17 >= 0 && i18 >= 0 && i17 < groupItems.size() && i18 < ((java.util.List) groupItems.get(i17)).size() && (fVar = (if4.f) ((java.util.List) groupItems.get(i17)).get(i18)) != null && (hVar = fVar.f372780e) != null) {
                f489129n = hVar.f372787b;
            }
            f489130o = 0L;
            f489125j = 0;
            f489126k = new sf4.o1(groupItems, i17, i18, f489126k, z18);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            synchronized (groupItems) {
                int i28 = 0;
                for (java.lang.Object obj2 : groupItems) {
                    int i29 = i28 + 1;
                    if (i28 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    java.util.List list = (java.util.List) obj2;
                    if (i28 >= i17 && list.size() > 0) {
                        arrayList.add(java.lang.Integer.valueOf(((if4.f) list.get(0)).f372780e.f372786a));
                    }
                    i28 = i29;
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (i17 < groupItems.size() && i18 < ((java.util.List) groupItems.get(i17)).size()) {
                int size = ((java.util.List) groupItems.get(i17)).size();
                while (i18 < size) {
                    arrayList2.add(java.lang.Integer.valueOf(((if4.f) ((java.util.List) groupItems.get(i17)).get(i18)).f372780e.f372786a));
                    i18++;
                }
            }
            java.util.List list2 = f489124i;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj3 : list2) {
                sf4.q1 q1Var = (sf4.q1) obj3;
                if ((arrayList.contains(java.lang.Integer.valueOf(q1Var.f489104a.f372786a)) || arrayList2.contains(java.lang.Integer.valueOf(q1Var.f489104a.f372786a))) ? false : true) {
                    arrayList3.add(obj3);
                }
            }
            synchronized (arrayList3) {
                java.util.Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    f489116a.d(((sf4.q1) it.next()).f489104a);
                }
            }
            f489118c = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_story_preload_strategy, 1);
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_story_preload_speed_good, 450);
            int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_story_preload_speed_bad, 200);
            f489119d = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_story_preload_force_preload, 0);
            f489120e = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_story_preload_force_canload, 100);
            sf4.x xVar = f489117b;
            xVar.f489141a = Ni;
            xVar.f489142b = Ni2;
            int g17 = u1Var.g();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryVideoPreloadMgr", "setPreloadQueueFromGallery clicfg_story_preload_strategy " + f489118c + " clicfg_story_preload_speed_good:" + Ni + " clicfg_story_preload_speed_bad:" + Ni2 + " clicfg_story_preload_force_preload " + f489119d + "  clicfg_story_preload_force_canload: " + f489120e + " speed:" + g17);
            if (g17 > 0 && (i27 = f489120e) > 0 && g17 < i27) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.StoryVideoPreloadMgr", "setPreloadQueueFromGallery speed too low then pass " + g17 + " clicfg_story_preload_force_canload: " + f489120e);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.addAll(f489124i);
                java.util.Iterator it6 = linkedList.iterator();
                while (it6.hasNext()) {
                    u1Var.d(((sf4.q1) it6.next()).f489104a);
                }
            }
        }
        return false;
    }

    public final int c(java.lang.String str, r45.xe6 xe6Var, int i17, boolean z17) {
        int max;
        float f17 = xe6Var.f471573z;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryVideoPreloadMgr", "calcPreloadPercent, cacheSecondsDowngrade:" + i17 + ", mediaId:" + str + ", duration:" + f17 + ", isGoodNetwork:" + z17 + " media:" + xe6Var.f471573z);
        int i18 = z17 ? 5 : 3;
        sf4.x xVar = f489117b;
        if (f17 <= 0.0f) {
            xVar.getClass();
            max = 30;
        } else {
            max = (f17 > ((float) i18) || i17 > 0) ? (int) ((java.lang.Math.max(3, i17) / f17) * 100.0d) : 100;
        }
        xVar.getClass();
        if (max > 30) {
            return max;
        }
        xVar.getClass();
        return 30;
    }

    public final void d(if4.h videoItem) {
        java.lang.String b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoItem, "videoItem");
        java.lang.String str = videoItem.f372791f.f471556f;
        int i17 = videoItem.f372788c;
        if (str == null) {
            b17 = "story_local_video_" + i17;
        } else {
            b17 = com.p314xaae8f345.mm.p947xba6de98f.i2.b("storyvideo", i17, "story", str);
        }
        java.lang.Object obj = null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
            b17 = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryVideoPreloadMgr", "cancelPreloadTask, videoItem:" + b17);
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(b17);
        java.util.List list = f489124i;
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((sf4.q1) next).f489106c, b17)) {
                obj = next;
                break;
            }
        }
        sf4.q1 q1Var = (sf4.q1) obj;
        if (q1Var != null) {
            list.remove(q1Var);
            int i18 = f489125j;
            if (i18 > 0) {
                f489125j = i18 - 1;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005b, code lost:
    
        if (r5 >= 30) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(if4.h r5) {
        /*
            r4 = this;
            java.lang.String r0 = "item"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "checkPreLoad "
            r0.<init>(r1)
            r0.append(r5)
            r1 = 32
            r0.append(r1)
            java.lang.String r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.a()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.StoryVideoPreloadMgr"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            boolean r0 = r4.i(r5)
            r2 = 0
            if (r0 == 0) goto L35
            java.lang.String r5 = "checkPreLoad checkCanPlay isLocalVideo"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r5)
            r4.m(r2)
            return
        L35:
            ef4.k0 r0 = ef4.k0.f333992a
            nf4.o r5 = r0.b(r5)
            boolean r0 = r5.u0()
            r3 = 1
            if (r0 == 0) goto L43
            goto L5d
        L43:
            int r0 = r5.f66552x78351860
            if (r0 > 0) goto L48
            goto L5e
        L48:
            int r5 = r5.f66549x799e9d9e
            float r5 = (float) r5
            float r0 = (float) r0
            float r5 = r5 / r0
            r0 = 100
            float r0 = (float) r0
            float r5 = r5 * r0
            sf4.x r0 = sf4.u1.f489117b
            r0.getClass()
            r0 = 30
            float r0 = (float) r0
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 < 0) goto L5e
        L5d:
            r2 = r3
        L5e:
            if (r2 != r3) goto L69
            java.lang.String r5 = "checkPreLoad checkCanPlay true"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r5)
            r4.m(r3)
            return
        L69:
            int r5 = sf4.u1.f489119d
            if (r5 != r3) goto L70
            r4.m(r3)
        L70:
            java.lang.String r5 = "nothing can checkPreLoad"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sf4.u1.e(if4.h):void");
    }

    public final dn.o f(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryVideoPreloadMgr", "createVideoPreloadCDNTask, mediaId:" + str + ", path:" + str3 + ", url:" + str2 + ", preloadPercent:" + i17 + ", connectionCount:" + i18);
        dn.o oVar = new dn.o();
        oVar.f323318d = "task_StoryVideoPreloadMgr";
        oVar.f69601xaca5bdda = str;
        oVar.M1 = str2;
        oVar.Y = 2;
        oVar.H1 = 2;
        oVar.Z = 6;
        oVar.V1 = i17;
        oVar.f69608x6ac8fea7 = i17;
        oVar.f323342y0 = 4;
        oVar.f69595x6d25b0d9 = str3;
        oVar.f323320f = new sf4.t1();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        oVar.f323329p0 = new sf4.s1(android.os.SystemClock.elapsedRealtime());
        oVar.f323339x0 = i18;
        oVar.f69592xf1ebe47b = 20302;
        oVar.f69610x4f5245a8 = ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).Ai(2, str3);
        return oVar;
    }

    public final int g() {
        return ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37745x9208c81b(2);
    }

    public final boolean h() {
        return g() >= f489117b.f489141a;
    }

    public final boolean i(if4.h hVar) {
        if (hVar.a()) {
            return true;
        }
        ef4.k0 k0Var = ef4.k0.f333992a;
        long k17 = com.p314xaae8f345.mm.vfs.w6.k(k0Var.d(hVar.f372791f));
        java.lang.String str = hVar.f372789d;
        if (k17 > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryVideoPreloadMgr", "isLocalVideo video downloadDone " + hVar.f372791f.A + " username:" + str);
            return true;
        }
        if (!k0Var.b(hVar).u0()) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryVideoPreloadMgr", " isLocalVideo video download finish " + hVar.f372791f.A + " username:" + str);
        return true;
    }

    public final boolean j(if4.h hVar) {
        java.lang.String b17;
        if (i(hVar) || hVar.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryVideoPreloadMgr", "addPreloadVideo fail, " + hVar + " isLocalVideo or fake video");
            return false;
        }
        int i17 = hVar.f372788c;
        java.lang.String str = hVar.f372791f.f471556f;
        if (str == null) {
            b17 = "story_local_video_" + i17;
        } else {
            b17 = com.p314xaae8f345.mm.p947xba6de98f.i2.b("storyvideo", i17, "story", str);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
            b17 = null;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(hVar.f372791f.f471556f) && !r26.i0.q(f489127l, b17, false, 2, null)) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryVideoPreloadMgr", "addPreloadVideo:" + b17 + ", already request preload or url " + hVar.f372791f.f471556f);
        return false;
    }

    public final synchronized boolean k(if4.h videoItem, int i17, int i18, sf4.q1 taskInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoItem, "videoItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskInfo, "taskInfo");
        int i19 = 0;
        if (!videoItem.a() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(videoItem.f372791f.f471556f)) {
            if (i(videoItem)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryVideoPreloadMgr", "preloadVideoWithPercent, isLocalVideo: " + videoItem.f372791f.f471556f);
                return false;
            }
            java.lang.String str = videoItem.f372791f.f471556f;
            java.lang.String str2 = taskInfo.f489106c;
            nf4.o b17 = ef4.k0.f333992a.b(videoItem);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryVideoPreloadMgr", "preloadVideoWithPercent, " + str2 + ", " + i17 + ", playingMediaId:" + f489127l + ", " + b17.f66550xf1e9b966 + ", " + str + "  videoCache " + b17);
            if (str2 == null || r26.i0.q(f489127l, str2, false, 2, null)) {
                return false;
            }
            java.lang.String str3 = videoItem.f372789d;
            java.lang.String i27 = com.p314xaae8f345.mm.vfs.w6.i(ef4.c0.f333971a.a(str3).concat("video/"), true);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i27);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryVideoLogic", "get story video dir %s username %s", i27, str3);
            com.p314xaae8f345.mm.vfs.w6.u(i27);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            java.lang.String field_filePath = b17.f66550xf1e9b966;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_filePath, "field_filePath");
            dn.o f17 = f(str2, str, field_filePath, i17, i18);
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(f17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryVideoPreloadMgr", "preloadVideoWithPercent:" + f17 + ", currentSpeed:" + g());
            f489121f.put(str2, videoItem);
            f489122g.put(str2, java.lang.Integer.valueOf(i17));
            java.util.Iterator it = f489124i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i19 = -1;
                    break;
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((sf4.q1) it.next()).f489106c, taskInfo.f489106c)) {
                    break;
                }
                i19++;
            }
            if (i19 > 0) {
                f489124i.set(i19, taskInfo);
            } else {
                f489124i.add(taskInfo);
            }
            f489123h.remove(str2);
            return true;
        }
        return false;
    }

    public final void m(boolean z17) {
        java.lang.String str;
        java.util.List list;
        boolean z18;
        int i17;
        java.lang.Object obj;
        java.util.List list2;
        int i18;
        int i19;
        boolean h17 = h();
        sf4.x xVar = f489117b;
        int i27 = xVar.f489142b;
        int g17 = g();
        boolean z19 = 1 <= g17 && g17 <= i27;
        int g18 = g();
        if (z17 && g18 > 0 && (i19 = f489120e) > 0 && g18 < i19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.StoryVideoPreloadMgr", "speed too low then pass " + g18 + " clicfg_story_preload_force_canload: " + f489120e + " callerFrom " + com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.a());
            return;
        }
        int i28 = 3;
        int i29 = z19 ? 1 : 3;
        if (f489118c == 1) {
            i29 = 1;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startPreloadQueue, isGoodNetwork:");
        sb6.append(h17);
        sb6.append(", isBadNetwork:");
        sb6.append(z19);
        sb6.append(", currentSpeed:");
        sb6.append(g());
        sb6.append(" preloadRunningSet ");
        java.util.List list3 = f489124i;
        sb6.append(list3.size());
        sb6.append(" maxTaskNum ");
        sb6.append(i29);
        java.lang.String str2 = " totalPreLoadOneItemSelect ";
        sb6.append(" totalPreLoadOneItemSelect ");
        sb6.append(f489125j);
        sb6.append(" checkNet ");
        sb6.append(z17);
        sb6.append(" callerFrom ");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryVideoPreloadMgr", sb6.toString());
        int i37 = xVar.f489142b;
        int g19 = g();
        java.util.List list4 = 1 <= g19 && g19 <= i37 ? xVar.f489144d : xVar.f489143c;
        int i38 = 0;
        while (list3.size() < i29 && i38 < list4.size() && f489125j < i28) {
            int intValue = ((java.lang.Number) list4.get(i38)).intValue();
            int n17 = n(i38);
            while (true) {
                sf4.o1 o1Var = f489126k;
                jz5.l lVar = null;
                int i39 = 0;
                while (true) {
                    java.util.List list5 = o1Var.f489080j;
                    if (i39 >= list5.size() || lVar != null) {
                        break;
                    }
                    try {
                        i18 = o1Var.f489077g;
                        list2 = list4;
                    } catch (java.lang.Exception e17) {
                        e = e17;
                        list2 = list4;
                    }
                    try {
                    } catch (java.lang.Exception e18) {
                        e = e18;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GroupData.StoryVideoPreloadMgr", e, "error on produce", new java.lang.Object[0]);
                        lVar = null;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GroupData.StoryVideoPreloadMgr", "produceVideoItem walkVertical:" + o1Var.f489075e + "  walkHorizontal:" + o1Var.f489076f + " positionV:" + o1Var.f489071a + " positionH:" + o1Var.f489072b + ", ret:" + lVar);
                        i39++;
                        list4 = list2;
                    }
                    if (i18 > o1Var.f489074d) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GroupData.StoryVideoPreloadMgr", "stop preload now " + o1Var.f489077g);
                        lVar = null;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GroupData.StoryVideoPreloadMgr", "produceVideoItem walkVertical:" + o1Var.f489075e + "  walkHorizontal:" + o1Var.f489076f + " positionV:" + o1Var.f489071a + " positionH:" + o1Var.f489072b + ", ret:" + lVar);
                        i39++;
                        list4 = list2;
                    } else {
                        lVar = (jz5.l) ((yz5.a) list5.get(i18 % list5.size())).mo152xb9724478();
                        o1Var.f489077g++;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GroupData.StoryVideoPreloadMgr", "produceVideoItem walkVertical:" + o1Var.f489075e + "  walkHorizontal:" + o1Var.f489076f + " positionV:" + o1Var.f489071a + " positionH:" + o1Var.f489072b + ", ret:" + lVar);
                        i39++;
                        list4 = list2;
                    }
                }
                list = list4;
                z18 = false;
                if (lVar == null) {
                    i17 = i29;
                    str = str2;
                    break;
                }
                if4.h hVar = (if4.h) lVar.f384366d;
                java.lang.Object obj2 = lVar.f384367e;
                sf4.q1 q1Var = (sf4.q1) obj2;
                java.lang.String str3 = q1Var.f489106c;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("try preload mediaId ");
                sb7.append(str3);
                sb7.append(" videoItem:");
                sb7.append(hVar);
                sb7.append(" pos:");
                sb7.append(obj2);
                sb7.append("  groupinfo ");
                sf4.o1 o1Var2 = f489126k;
                sb7.append("positionV:" + o1Var2.f489071a + ", positionH:" + o1Var2.f489072b + ", walkVertical:" + o1Var2.f489075e + ", walkHorizontal:" + o1Var2.f489076f);
                sb7.append(" quota:");
                sb7.append(intValue);
                sb7.append("  fromTag:startPreLoad");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryVideoPreloadMgr", sb7.toString());
                java.util.Iterator it = list3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((sf4.q1) obj).f489106c, str3)) {
                            break;
                        }
                    }
                }
                sf4.q1 q1Var2 = (sf4.q1) obj;
                if (q1Var2 == null || intValue > q1Var2.f489105b) {
                    if ((str3.length() == 0 ? null : str3) != null) {
                        int c17 = c(str3, hVar.f372791f, intValue, h());
                        nf4.o b17 = ef4.k0.f333992a.b(hVar);
                        i17 = i29;
                        if (b17.u0()) {
                            str = str2;
                        } else {
                            str = str2;
                            if ((b17.f66549x799e9d9e / b17.f66552x78351860) * 100 < c17) {
                                if (k(hVar, c17, n17, q1Var)) {
                                    q1Var.f489105b = intValue;
                                    z18 = true;
                                    break;
                                } else {
                                    list4 = list;
                                    i29 = i17;
                                    str2 = str;
                                }
                            }
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryVideoPreloadMgr", "pull preload video, " + str3 + ", already reach cache size! cacheSize:" + b17.f66549x799e9d9e + ", totalSize:" + b17.f66552x78351860 + ", cachePercent:" + ((b17.f66549x799e9d9e / b17.f66552x78351860) * 100) + "  fromTag:startPreLoad");
                        i29 = i17;
                        str2 = str;
                        list4 = list;
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryVideoPreloadMgr", "no need add quota " + intValue + " cur:" + q1Var2.f489105b + " fromTag:startPreLoad");
                }
                list4 = list;
            }
            if (!z18) {
                break;
            }
            i38++;
            f489125j++;
            i29 = i17;
            str2 = str;
            i28 = 3;
            list4 = list;
        }
        str = str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryVideoPreloadMgr", "startPreloadQueue finish loop preload queue, current queue size: " + list3.size() + ", pullPreloadTaskNum:0, preloadVideoNum:" + i38 + " preloadRunningSet " + list3.size() + str + f489125j + ' ');
    }

    public final int n(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryVideoPreloadMgr", "taskConnectionCount: " + i17);
        sf4.x xVar = f489117b;
        java.util.List list = xVar.f489145e;
        if (i17 >= list.size()) {
            i17 = xVar.f489145e.size() - 1;
        }
        return ((java.lang.Number) list.get(i17)).intValue();
    }
}
