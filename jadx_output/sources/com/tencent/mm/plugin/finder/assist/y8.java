package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes3.dex */
public final class y8 {

    /* renamed from: f, reason: collision with root package name */
    public static int f102737f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f102738g;

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.y8 f102732a = new com.tencent.mm.plugin.finder.assist.y8();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f102733b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f102734c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f102735d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f102736e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public static final long f102739h = 1552;

    public static void e(com.tencent.mm.plugin.finder.assist.y8 y8Var, java.lang.String id6, java.lang.String stage, com.tencent.mm.protobuf.g gVar, boolean z17, boolean z18, boolean z19, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            gVar = null;
        }
        if ((i17 & 8) != 0) {
            z17 = false;
        }
        if ((i17 & 16) != 0) {
            z18 = false;
        }
        if ((i17 & 32) != 0) {
            z19 = false;
        }
        synchronized (y8Var) {
            kotlin.jvm.internal.o.g(id6, "id");
            kotlin.jvm.internal.o.g(stage, "stage");
            java.util.HashMap hashMap = f102733b;
            java.util.ArrayList arrayList = (java.util.ArrayList) hashMap.get(id6);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
            }
            if (kotlin.jvm.internal.o.b(stage, com.tencent.mm.plugin.finder.assist.t8.f102560f.f102540b)) {
                f102735d.put(id6, java.lang.Boolean.valueOf(z19));
            }
            if (y8Var.f(id6) && !kotlin.jvm.internal.o.b(stage, com.tencent.mm.plugin.finder.assist.t8.f102569o.f102540b)) {
                z17 = false;
            }
            java.lang.String b17 = y8Var.b(id6, stage, arrayList);
            boolean a17 = y8Var.a(id6, b17, z18, arrayList);
            int i18 = 2;
            if (!z17) {
                if (!arrayList.isEmpty()) {
                    r45.nd6 nd6Var = (r45.nd6) kz5.n0.Z(arrayList);
                    if (nd6Var != null && nd6Var.getInteger(3) == 1) {
                        r45.nd6 nd6Var2 = (r45.nd6) kz5.n0.k0(arrayList);
                        if (nd6Var2 != null && nd6Var2.getInteger(3) == 2) {
                        }
                    }
                }
                return;
            }
            arrayList.clear();
            r45.nd6 nd6Var3 = new r45.nd6();
            nd6Var3.set(0, id6);
            nd6Var3.set(1, b17);
            nd6Var3.set(2, java.lang.Long.valueOf(c01.id.a()));
            if (z17) {
                i18 = 1;
            } else if (!a17) {
                i18 = 0;
            }
            nd6Var3.set(3, java.lang.Integer.valueOf(i18));
            nd6Var3.set(4, gVar);
            com.tencent.mm.plugin.finder.assist.w8.f102658a.a(nd6Var3, arrayList, a17);
            arrayList.add(nd6Var3);
            hashMap.put(id6, arrayList);
            com.tencent.mars.xlog.Log.i("Finder.LiveFlowStats", "tag, stage:" + b17 + ", isStart:" + z17 + ", isEnd:" + a17);
            if (a17) {
                ((ku5.t0) ku5.t0.f312615d).k(new com.tencent.mm.plugin.finder.assist.x8(id6), 0);
            }
        }
    }

    public final boolean a(java.lang.String str, java.lang.String str2, boolean z17, java.util.ArrayList arrayList) {
        if (!kotlin.jvm.internal.o.b((java.lang.Boolean) f102735d.get(str), java.lang.Boolean.TRUE)) {
            return z17;
        }
        com.tencent.mm.plugin.finder.assist.r8 r8Var = com.tencent.mm.plugin.finder.assist.t8.f102555a;
        if (kotlin.jvm.internal.o.b(str2, com.tencent.mm.plugin.finder.assist.t8.f102566l.f102540b)) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r45.nd6 nd6Var = (r45.nd6) it.next();
                java.lang.String string = nd6Var.getString(1);
                com.tencent.mm.plugin.finder.assist.r8 r8Var2 = com.tencent.mm.plugin.finder.assist.t8.f102555a;
                if (kotlin.jvm.internal.o.b(string, com.tencent.mm.plugin.finder.assist.t8.f102563i.f102540b) || kotlin.jvm.internal.o.b(nd6Var.getString(1), com.tencent.mm.plugin.finder.assist.t8.f102565k.f102540b)) {
                    return true;
                }
            }
        }
        com.tencent.mm.plugin.finder.assist.r8 r8Var3 = com.tencent.mm.plugin.finder.assist.t8.f102555a;
        if (!kotlin.jvm.internal.o.b(str2, com.tencent.mm.plugin.finder.assist.t8.f102563i.f102540b) && !kotlin.jvm.internal.o.b(str2, com.tencent.mm.plugin.finder.assist.t8.f102565k.f102540b)) {
            return false;
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            java.lang.String string2 = ((r45.nd6) it6.next()).getString(1);
            com.tencent.mm.plugin.finder.assist.r8 r8Var4 = com.tencent.mm.plugin.finder.assist.t8.f102555a;
            if (kotlin.jvm.internal.o.b(string2, com.tencent.mm.plugin.finder.assist.t8.f102566l.f102540b)) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String b(java.lang.String str, java.lang.String str2, java.util.ArrayList arrayList) {
        com.tencent.mm.plugin.finder.assist.r8 r8Var = com.tencent.mm.plugin.finder.assist.t8.f102555a;
        if (kotlin.jvm.internal.o.b(str2, com.tencent.mm.plugin.finder.assist.t8.f102566l.f102540b)) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.String string = ((r45.nd6) it.next()).getString(1);
                com.tencent.mm.plugin.finder.assist.r8 r8Var2 = com.tencent.mm.plugin.finder.assist.t8.f102555a;
                if (kotlin.jvm.internal.o.b(string, com.tencent.mm.plugin.finder.assist.t8.f102566l.f102540b)) {
                    return com.tencent.mm.plugin.finder.assist.t8.f102568n.f102540b;
                }
            }
        }
        return str2;
    }

    public final synchronized void c(java.lang.String id6) {
        kotlin.jvm.internal.o.g(id6, "id");
        f102733b.remove(id6);
        f102735d.remove(id6);
        f102736e.remove(id6);
        com.tencent.mars.xlog.Log.i("Finder.LiveFlowStats", "clear id:".concat(id6));
    }

    public final void d(int i17) {
        long j17 = f102739h;
        if (i17 < 10) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(j17, 82L);
            return;
        }
        if (i17 < 50) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(j17, 83L);
            return;
        }
        if (i17 < 200) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(j17, 84L);
            return;
        }
        if (i17 < 500) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(j17, 85L);
            return;
        }
        if (i17 < 1000) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(j17, 86L);
        } else if (i17 < 5000) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(j17, 87L);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(j17, 88L);
        }
    }

    public final boolean f(java.lang.String str) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f102736e;
        if (!concurrentHashMap.containsKey(str)) {
            return false;
        }
        com.tencent.mm.plugin.finder.assist.f9 f9Var = (com.tencent.mm.plugin.finder.assist.f9) concurrentHashMap.get(str);
        return !(f9Var != null && (f9Var.f102173a > 0L ? 1 : (f9Var.f102173a == 0L ? 0 : -1)) == 0);
    }
}
