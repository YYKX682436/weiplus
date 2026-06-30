package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585;

/* loaded from: classes7.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.b0 f170693a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.b0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f170694b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f170695c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f170696d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f170697e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f170698f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f170699g;

    static {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        f170694b = concurrentHashMap;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = new java.util.concurrent.ConcurrentHashMap();
        f170695c = concurrentHashMap2;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = new java.util.concurrent.ConcurrentHashMap();
        f170696d = concurrentHashMap3;
        f170697e = new java.util.concurrent.ConcurrentHashMap();
        f170698f = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0 x0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0.WAGAME;
        concurrentHashMap2.put(x0Var, new java.util.concurrent.ConcurrentLinkedQueue());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0 x0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0.WASERVICE;
        concurrentHashMap2.put(x0Var2, new java.util.concurrent.ConcurrentLinkedQueue());
        concurrentHashMap3.put(x0Var, new java.util.concurrent.ConcurrentLinkedQueue());
        concurrentHashMap3.put(x0Var2, new java.util.concurrent.ConcurrentLinkedQueue());
        concurrentHashMap.put(x0Var, new java.util.HashSet());
        concurrentHashMap.put(x0Var2, new java.util.HashSet());
        f170699g = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MicroMsg.AppBrandProcessPreloader[applaunch][preload]");
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6 x6Var, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.v1 v1Var) {
        boolean z17;
        boolean z18;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.y1.d()) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.d.a()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "[PreloadWAGameABTest] forcePreload");
            }
            z17 = true;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "[PreloadWAGameABTest] hardcode disable preload for remote debug");
            z17 = false;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "preloadNextRuntimeForWAGame disable preload");
            c(2, x6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0.WAGAME);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(915, 32);
            return;
        }
        if (!ha1.m.a()) {
            java.util.LinkedHashMap linkedHashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.f165742b;
            synchronized (linkedHashMap) {
                java.util.Iterator it = linkedHashMap.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z18 = false;
                        break;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) it.next();
                    if (o6Var != null && o6Var.q2()) {
                        z18 = true;
                        break;
                    }
                }
            }
            if (z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "preloadNextRuntimeForWAGame skip by hasRunningGames[TRUE]");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(915, 31);
                c(2, x6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0.WAGAME);
                return;
            }
        }
        try {
            i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0.WAGAME, x6Var, v1Var);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", e17, "preloadNextRuntimeOnUiThreadForWAGame exception.", new java.lang.Object[0]);
        }
        c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6.Q != x6Var ? 2 : 1, x6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0.WAGAME);
    }

    public static synchronized boolean b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0 x0Var) {
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.class) {
            if (!m(x0Var)) {
                return true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 h17 = h(x0Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 g17 = g(x0Var);
            if (x0Var == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0.WAGAME) {
                return h17 == null;
            }
            if (x0Var != com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0.WASERVICE) {
                throw new java.lang.IllegalStateException("not supported type: " + x0Var.name());
            }
            if (h17 != null && g17 != null) {
                r3 = false;
            }
            return r3;
        }
    }

    public static void c(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6 x6Var, final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0 x0Var) {
        java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.d0> linkedList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "preInit finished level:%d scene:%s, type:%s", java.lang.Integer.valueOf(i17), x6Var, x0Var);
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.C12596x96aa9e2c c12596x96aa9e2c = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.C12596x96aa9e2c) f170697e.get(x0Var);
        if (c12596x96aa9e2c != null) {
            c12596x96aa9e2c.getClass();
            c12596x96aa9e2c.f170517m = android.os.SystemClock.elapsedRealtime();
            new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.task.r$$b
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.C12596x96aa9e2c c12596x96aa9e2c2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.C12596x96aa9e2c.this;
                    if (c12596x96aa9e2c2 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "[PreloadProfile]AppBrandPreloadProfiler == null");
                        return;
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[PreloadProfile] ");
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0 x0Var2 = x0Var;
                    objArr[0] = x0Var2 == null ? "Unknown" : x0Var2.name();
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.z1("Preload for [%s]Type | ", objArr));
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    long j17 = c12596x96aa9e2c2.f170511d;
                    if (j17 == com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
                        j17 = -1;
                    }
                    objArr2[0] = java.lang.Long.valueOf(j17);
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.z1("Preload request at [%d] | ", objArr2));
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.z1("Process prepared cost [%s]ms | ", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.d(c12596x96aa9e2c2.f170511d, "req", c12596x96aa9e2c2.f170515h, "proc")));
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.z1("Trans-thread prepared cost [%s]ms | ", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.d(c12596x96aa9e2c2.f170515h, "proc", c12596x96aa9e2c2.f170516i, "start")));
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.z1("Preload prepared cost [%s]ms | ", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.d(c12596x96aa9e2c2.f170516i, "start", c12596x96aa9e2c2.f170517m, "end")));
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.z1("All cost [%s]ms | ", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.d(c12596x96aa9e2c2.f170511d, "req", c12596x96aa9e2c2.f170517m, "end")));
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.z1("level [%d] | ", java.lang.Integer.valueOf(c12596x96aa9e2c2.f170512e)));
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.z1("mem usage [%d]mb", 0));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", sb6.toString());
                }
            }.run();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(915, x0Var == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0.WAGAME ? 6 : 1);
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.class) {
            if (i17 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0 x0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0.WASERVICE;
                if (x0Var == x0Var2 && g(x0Var) == null) {
                    f170693a.b(x0Var2, 1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.e0.PRELOADED);
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = f170694b;
                    linkedList = new java.util.LinkedList((java.util.Collection) concurrentHashMap.get(x0Var));
                    ((java.util.HashSet) concurrentHashMap.get(x0Var)).clear();
                }
            }
            f170693a.b(x0Var, i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.e0.PRELOADED);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = f170694b;
            linkedList = new java.util.LinkedList((java.util.Collection) concurrentHashMap2.get(x0Var));
            ((java.util.HashSet) concurrentHashMap2.get(x0Var)).clear();
        }
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.d0 d0Var : linkedList) {
            if (d0Var != null) {
                d0Var.mo50152xb03baf04();
            }
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6.Q == x6Var) {
            return;
        }
        android.os.Looper.getMainLooper().getQueue().addIdleHandler(new android.os.MessageQueue.IdleHandler() { // from class: com.tencent.mm.plugin.appbrand.task.r$$c
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0 x0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0.this;
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.f170698f) {
                    return false;
                }
                try {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v.f168686a.b(x0Var3);
                    android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    java.util.LinkedList linkedList2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1.f172995u;
                    if (linkedList2.isEmpty()) {
                        if (context == null) {
                            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                        }
                        linkedList2.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1(context, null));
                    }
                    android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    java.util.LinkedList linkedList3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.q.f173381m;
                    if (linkedList3.isEmpty()) {
                        if (context2 == null) {
                            context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                        }
                        linkedList3.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.q(context2));
                    }
                    java.util.LinkedList linkedList4 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.c0.f158558b;
                    if (!(!linkedList4.isEmpty())) {
                        linkedList4.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.c0.f158557a.a());
                    }
                    return false;
                } finally {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.f170698f = true;
                }
            }
        });
    }

    public static java.lang.String d(long j17, java.lang.String str, long j18, java.lang.String str2) {
        if (j17 != com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697 && j18 != com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
            return java.lang.String.valueOf(j18 - j17);
        }
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = str;
        objArr[1] = j17 == com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697 ? "?" : "ok";
        objArr[2] = str2;
        objArr[3] = j18 != com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697 ? "ok" : "?";
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.z1("Unknown(%s=%s,%s=%s)", objArr);
    }

    public static synchronized com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0[] e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0[] x0VarArr;
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.class) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f170696d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0 x0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0.WASERVICE;
            boolean z17 = true;
            boolean z18 = concurrentHashMap.contains(x0Var) && !((java.util.Queue) concurrentHashMap.get(x0Var)).isEmpty();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0 x0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0.WAGAME;
            boolean z19 = concurrentHashMap.contains(x0Var2) && !((java.util.Queue) concurrentHashMap.get(x0Var2)).isEmpty();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (z18) {
                arrayList.add(x0Var);
            }
            if (z19) {
                arrayList.add(x0Var2);
            }
            if (arrayList.size() > 2) {
                z17 = false;
            }
            iz5.a.g(null, z17);
            x0VarArr = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0[]) arrayList.toArray(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0[0]);
        }
        return x0VarArr;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0 x0Var) {
        iz5.a.e(x0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0.NIL);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0 x0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0.WAGAME;
        g0Var.A(915, x0Var == x0Var2 ? 12 : 10);
        java.util.Queue queue = (java.util.Queue) f170696d.get(x0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (queue == null || queue.isEmpty()) ? null : (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) queue.poll();
        if (c0Var != null) {
            g0Var.A(915, x0Var == x0Var2 ? 7 : 2);
        }
        return c0Var;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0 x0Var) {
        iz5.a.e(x0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0.NIL);
        java.util.Queue queue = (java.util.Queue) f170695c.get(x0Var);
        if (queue == null || queue.isEmpty()) {
            return null;
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) queue.peek();
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0 x0Var) {
        iz5.a.e(x0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0.NIL);
        java.util.Queue queue = (java.util.Queue) f170696d.get(x0Var);
        if (queue == null || queue.isEmpty()) {
            return null;
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) queue.peek();
    }

    public static void i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0 x0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6 x6Var, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.v1 v1Var) {
        java.util.Queue queue = (java.util.Queue) f170696d.get(x0Var);
        java.util.Objects.requireNonNull(queue);
        java.util.Queue queue2 = queue;
        if (!queue2.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "preload services skipped cause already cached");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(915, 34);
            return;
        }
        java.lang.String.format(java.util.Locale.ENGLISH, "AppBrandProcessPreloader.preloadService(%s %s)", x0Var, x6Var);
        java.lang.Class cls = x0Var.f170745d;
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) new d56.b(cls, cls).c().f308165b;
        yVar.L0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e8.b());
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6.Q == x6Var) {
            yVar.G1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0.PreloadBeforeRuntimeInit, v1Var);
        } else {
            yVar.F1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0.PreloadOnProcessCreated);
        }
        if (yVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) yVar).c2(x6Var);
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_appbrand_pause_js_thread_for_preload_enable, 0) == 1) {
            long Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_appbrand_pause_js_thread_for_preload_delay_ms, 0);
            if (Ni > 0) {
                yVar.r1(Ni);
            }
        }
        if (x0Var == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0.WAGAME) {
            f170699g.putLong("KEY_PRELOAD_WAGAME", yVar.B0());
        }
        queue2.add(yVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "preloadService done in request[%s], scene[%s]", x0Var, x6Var);
    }

    public static void j(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0 x0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.d0 d0Var, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.C12596x96aa9e2c c12596x96aa9e2c, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6 x6Var, int i17) {
        k(x0Var, d0Var, z17, c12596x96aa9e2c, x6Var, i17, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008f A[Catch: all -> 0x00dc, TryCatch #0 {, blocks: (B:7:0x0027, B:9:0x0039, B:11:0x003f, B:12:0x004e, B:14:0x005c, B:16:0x0063, B:17:0x0065, B:23:0x008f, B:24:0x009a, B:36:0x006d, B:38:0x0073, B:40:0x0077, B:41:0x007d, B:44:0x0083, B:46:0x005f), top: B:6:0x0027 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0 r17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.d0 r18, boolean r19, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.C12596x96aa9e2c r20, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6 r21, int r22, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.v1 r23) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.k(com.tencent.mm.plugin.appbrand.task.x0, com.tencent.mm.plugin.appbrand.task.d0, boolean, com.tencent.mm.plugin.appbrand.task.AppBrandPreloadProfiler, com.tencent.mm.plugin.appbrand.service.x6, int, com.tencent.luggage.sdk.jsapi.component.service.v1):void");
    }

    public static void l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0 x0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.C12596x96aa9e2c c12596x96aa9e2c, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6 x6Var, int i17, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.v1 v1Var) {
        if (c12596x96aa9e2c == null) {
            c12596x96aa9e2c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.C12596x96aa9e2c();
        }
        c12596x96aa9e2c.f170512e = i17;
        f170697e.put(x0Var, c12596x96aa9e2c);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(915, x0Var == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0.WAGAME ? 5 : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "TRACE_ORDER:AppBrandProcessPreloader.java");
        if (i17 == 0) {
            c(i17, x6Var, x0Var);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.y yVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.y(x0Var, x6Var, v1Var, i17);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6.Q != x6Var) {
            ((ku5.t0) ku5.t0.f394148d).b(yVar, "MicroMsg.AppBrandProcessPreloader[applaunch][preload]_ComponentsPreloadWorker");
            cf.i.b("preload AppBrandUI classes", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.z(c12596x96aa9e2c));
            cf.i.b("preload UIUtils.isFoldableDevice", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.RunnableC12622x345e2f());
        } else if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            yVar.run();
        } else {
            ((ku5.t0) ku5.t0.f394148d).b(yVar, "MicroMsg.AppBrandProcessPreloader[applaunch][preload]_ComponentsPreloadWorker");
        }
    }

    public static synchronized boolean m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0 x0Var) {
        boolean z17;
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.class) {
            z17 = f170693a.a(x0Var) == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.e0.PRELOADED;
        }
        return z17;
    }

    public static synchronized void n(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0 x0Var) {
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.class) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "reset() %s", android.util.Log.getStackTraceString(new java.lang.Throwable()));
            f170693a.c(x0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.e0.NOT_PRELOAD);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cf A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0 r11, int r12, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.d0 r13, java.lang.String r14) {
        /*
            java.lang.Class<com.tencent.mm.plugin.appbrand.task.r> r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.class
            monitor-enter(r0)
            com.tencent.mm.plugin.appbrand.task.b0 r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.f170693a     // Catch: java.lang.Throwable -> Ld0
            java.util.Map r2 = r1.f170527a     // Catch: java.lang.Throwable -> Ld0
            java.util.EnumMap r2 = (java.util.EnumMap) r2     // Catch: java.lang.Throwable -> Ld0
            java.lang.Object r2 = r2.get(r11)     // Catch: java.lang.Throwable -> Ld0
            com.tencent.mm.plugin.appbrand.task.c0 r2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.c0) r2     // Catch: java.lang.Throwable -> Ld0
            if (r2 == 0) goto L14
            com.tencent.mm.plugin.appbrand.task.e0 r3 = r2.f170529b     // Catch: java.lang.Throwable -> Ld0
            goto L16
        L14:
            com.tencent.mm.plugin.appbrand.task.e0 r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.e0.NOT_PRELOAD     // Catch: java.lang.Throwable -> Ld0
        L16:
            r4 = 2
            if (r2 == 0) goto L1c
            int r5 = r2.f170528a     // Catch: java.lang.Throwable -> Ld0
            goto L1d
        L1c:
            r5 = r4
        L1d:
            java.lang.String r6 = "MicroMsg.AppBrandProcessPreloader[applaunch][preload]"
            java.lang.String r7 = "Checking shouldWaitPreloading.. mCurrentPreloadState is [%s], sCacheServices.size[%d], sCachePageView.size[%d], message[%s]"
            r8 = 4
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> Ld0
            r9 = 0
            r8[r9] = r2     // Catch: java.lang.Throwable -> Ld0
            java.util.concurrent.ConcurrentHashMap r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.f170696d     // Catch: java.lang.Throwable -> Ld0
            java.lang.Object r2 = r2.get(r11)     // Catch: java.lang.Throwable -> Ld0
            java.util.Queue r2 = (java.util.Queue) r2     // Catch: java.lang.Throwable -> Ld0
            int r2 = r2.size()     // Catch: java.lang.Throwable -> Ld0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> Ld0
            r10 = 1
            r8[r10] = r2     // Catch: java.lang.Throwable -> Ld0
            java.util.concurrent.ConcurrentHashMap r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.f170695c     // Catch: java.lang.Throwable -> Ld0
            java.lang.Object r2 = r2.get(r11)     // Catch: java.lang.Throwable -> Ld0
            java.util.Queue r2 = (java.util.Queue) r2     // Catch: java.lang.Throwable -> Ld0
            int r2 = r2.size()     // Catch: java.lang.Throwable -> Ld0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> Ld0
            r8[r4] = r2     // Catch: java.lang.Throwable -> Ld0
            if (r14 != 0) goto L50
            java.lang.String r14 = ""
        L50:
            r2 = 3
            r8[r2] = r14     // Catch: java.lang.Throwable -> Ld0
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r7, r8)     // Catch: java.lang.Throwable -> Ld0
            com.tencent.mm.plugin.appbrand.task.e0 r14 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.e0.PRELOADING     // Catch: java.lang.Throwable -> Ld0
            if (r3 != r14) goto L84
            if (r12 > r5) goto L84
            if (r12 >= r4) goto L66
            com.tencent.mm.plugin.appbrand.service.c0 r12 = h(r11)     // Catch: java.lang.Throwable -> Ld0
            if (r12 == 0) goto L66
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld0
            return r9
        L66:
            java.util.concurrent.ConcurrentHashMap r12 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.f170694b     // Catch: java.lang.Throwable -> Ld0
            java.lang.Object r12 = r12.get(r11)     // Catch: java.lang.Throwable -> Ld0
            java.util.HashSet r12 = (java.util.HashSet) r12     // Catch: java.lang.Throwable -> Ld0
            r12.add(r13)     // Catch: java.lang.Throwable -> Ld0
            java.util.concurrent.ConcurrentHashMap r12 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.f170697e     // Catch: java.lang.Throwable -> Ld0
            java.lang.Object r11 = r12.get(r11)     // Catch: java.lang.Throwable -> Ld0
            com.tencent.mm.plugin.appbrand.task.AppBrandPreloadProfiler r11 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.C12596x96aa9e2c) r11     // Catch: java.lang.Throwable -> Ld0
            r11.getClass()     // Catch: java.lang.Throwable -> Ld0
            long r12 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Ld0
            r11.f170518n = r12     // Catch: java.lang.Throwable -> Ld0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld0
            return r10
        L84:
            boolean r12 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.d.a()     // Catch: java.lang.Throwable -> Ld0
            if (r12 == 0) goto Lc4
            com.tencent.mm.plugin.appbrand.task.e0 r12 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.e0.NOT_PRELOAD     // Catch: java.lang.Throwable -> Ld0
            if (r3 != r12) goto La4
            java.lang.String r12 = "MicroMsg.AppBrandProcessPreloader[applaunch][preload]"
            java.lang.String r2 = "[ForcePreload] wait preload (not preload currently)"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r12, r2)     // Catch: java.lang.Throwable -> Ld0
            java.util.concurrent.ConcurrentHashMap r12 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.f170694b     // Catch: java.lang.Throwable -> Ld0
            java.lang.Object r12 = r12.get(r11)     // Catch: java.lang.Throwable -> Ld0
            java.util.HashSet r12 = (java.util.HashSet) r12     // Catch: java.lang.Throwable -> Ld0
            r12.add(r13)     // Catch: java.lang.Throwable -> Ld0
            r1.c(r11, r14)     // Catch: java.lang.Throwable -> Ld0
            goto Lc2
        La4:
            boolean r12 = b(r11)     // Catch: java.lang.Throwable -> Ld0
            if (r12 == 0) goto Lc4
            java.lang.String r12 = "MicroMsg.AppBrandProcessPreloader[applaunch][preload]"
            java.lang.String r2 = "[ForcePreload] wait preload (preloaded)"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r12, r2)     // Catch: java.lang.Throwable -> Ld0
            n(r11)     // Catch: java.lang.Throwable -> Ld0
            java.util.concurrent.ConcurrentHashMap r12 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.f170694b     // Catch: java.lang.Throwable -> Ld0
            java.lang.Object r12 = r12.get(r11)     // Catch: java.lang.Throwable -> Ld0
            java.util.HashSet r12 = (java.util.HashSet) r12     // Catch: java.lang.Throwable -> Ld0
            r12.add(r13)     // Catch: java.lang.Throwable -> Ld0
            r1.c(r11, r14)     // Catch: java.lang.Throwable -> Ld0
        Lc2:
            r12 = r10
            goto Lc5
        Lc4:
            r12 = r9
        Lc5:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld0
            if (r12 == 0) goto Lcf
            com.tencent.mm.plugin.appbrand.service.x6 r12 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6.f170352g
            r13 = 0
            l(r11, r13, r12, r4, r13)
            return r10
        Lcf:
            return r9
        Ld0:
            r11 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld0
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.o(com.tencent.mm.plugin.appbrand.task.x0, int, com.tencent.mm.plugin.appbrand.task.d0, java.lang.String):boolean");
    }

    public static km5.d p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0 x0Var) {
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.class) {
            if (f170693a.a(x0Var) != com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.e0.PRELOADING) {
                return pq5.h.a();
            }
            pq5.g a17 = pq5.h.a();
            km5.n nVar = (km5.n) a17.f390889r;
            nVar.b();
            ((java.util.HashSet) f170694b.get(x0Var)).add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.a0(nVar));
            return a17;
        }
    }
}
