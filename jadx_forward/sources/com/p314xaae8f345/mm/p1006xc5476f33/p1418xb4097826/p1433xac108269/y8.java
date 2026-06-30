package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes3.dex */
public final class y8 {

    /* renamed from: f, reason: collision with root package name */
    public static int f184270f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f184271g;

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8 f184265a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f184266b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f184267c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f184268d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f184269e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public static final long f184272h = 1552;

    public static void e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8 y8Var, java.lang.String id6, java.lang.String stage, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, boolean z17, boolean z18, boolean z19, int i17, java.lang.Object obj) {
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
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stage, "stage");
            java.util.HashMap hashMap = f184266b;
            java.util.ArrayList arrayList = (java.util.ArrayList) hashMap.get(id6);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(stage, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184093f.f184073b)) {
                f184268d.put(id6, java.lang.Boolean.valueOf(z19));
            }
            if (y8Var.f(id6) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(stage, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184102o.f184073b)) {
                z17 = false;
            }
            java.lang.String b17 = y8Var.b(id6, stage, arrayList);
            boolean a17 = y8Var.a(id6, b17, z18, arrayList);
            int i18 = 2;
            if (!z17) {
                if (!arrayList.isEmpty()) {
                    r45.nd6 nd6Var = (r45.nd6) kz5.n0.Z(arrayList);
                    if (nd6Var != null && nd6Var.m75939xb282bd08(3) == 1) {
                        r45.nd6 nd6Var2 = (r45.nd6) kz5.n0.k0(arrayList);
                        if (nd6Var2 != null && nd6Var2.m75939xb282bd08(3) == 2) {
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
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w8.f184191a.a(nd6Var3, arrayList, a17);
            arrayList.add(nd6Var3);
            hashMap.put(id6, arrayList);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveFlowStats", "tag, stage:" + b17 + ", isStart:" + z17 + ", isEnd:" + a17);
            if (a17) {
                ((ku5.t0) ku5.t0.f394148d).k(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x8(id6), 0);
            }
        }
    }

    public final boolean a(java.lang.String str, java.lang.String str2, boolean z17, java.util.ArrayList arrayList) {
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b((java.lang.Boolean) f184268d.get(str), java.lang.Boolean.TRUE)) {
            return z17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.r8 r8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184088a;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184099l.f184073b)) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r45.nd6 nd6Var = (r45.nd6) it.next();
                java.lang.String m75945x2fec8307 = nd6Var.m75945x2fec8307(1);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.r8 r8Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184088a;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75945x2fec8307, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184096i.f184073b) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(nd6Var.m75945x2fec8307(1), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184098k.f184073b)) {
                    return true;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.r8 r8Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184088a;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184096i.f184073b) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184098k.f184073b)) {
            return false;
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            java.lang.String m75945x2fec83072 = ((r45.nd6) it6.next()).m75945x2fec8307(1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.r8 r8Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184088a;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75945x2fec83072, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184099l.f184073b)) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String b(java.lang.String str, java.lang.String str2, java.util.ArrayList arrayList) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.r8 r8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184088a;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184099l.f184073b)) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.String m75945x2fec8307 = ((r45.nd6) it.next()).m75945x2fec8307(1);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.r8 r8Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184088a;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75945x2fec8307, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184099l.f184073b)) {
                    return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184101n.f184073b;
                }
            }
        }
        return str2;
    }

    public final synchronized void c(java.lang.String id6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        f184266b.remove(id6);
        f184268d.remove(id6);
        f184269e.remove(id6);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveFlowStats", "clear id:".concat(id6));
    }

    public final void d(int i17) {
        long j17 = f184272h;
        if (i17 < 10) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(j17, 82L);
            return;
        }
        if (i17 < 50) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(j17, 83L);
            return;
        }
        if (i17 < 200) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(j17, 84L);
            return;
        }
        if (i17 < 500) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(j17, 85L);
            return;
        }
        if (i17 < 1000) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(j17, 86L);
        } else if (i17 < 5000) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(j17, 87L);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(j17, 88L);
        }
    }

    public final boolean f(java.lang.String str) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f184269e;
        if (!concurrentHashMap.containsKey(str)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.f9 f9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.f9) concurrentHashMap.get(str);
        return !(f9Var != null && (f9Var.f183706a > 0L ? 1 : (f9Var.f183706a == 0L ? 0 : -1)) == 0);
    }
}
