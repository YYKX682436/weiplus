package com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29;

/* loaded from: classes4.dex */
public abstract class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.LinkedList f178862a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedList f178863b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f178864c = false;

    public static void a(java.lang.String str) {
        d();
        if (b(str)) {
            return;
        }
        f178862a.addFirst(str);
        if (q02.b.b() == null) {
            return;
        }
        q02.a aVar = new q02.a();
        aVar.f67416x28d45f97 = str;
        aVar.f67417x15b870c = java.lang.System.currentTimeMillis();
        q02.b.b().mo880xb970c2b9(aVar);
    }

    public static boolean b(java.lang.String str) {
        d();
        return f178863b.contains(str) || f178862a.contains(str);
    }

    public static java.util.LinkedList c() {
        d();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.addAll(f178862a);
        linkedList.addAll(f178863b);
        return linkedList;
    }

    public static void d() {
        if (f178864c) {
            return;
        }
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.s0.class) {
            if (f178864c) {
                return;
            }
            java.util.LinkedList a17 = q02.b.a();
            if (a17 != null) {
                java.util.Iterator it = a17.iterator();
                while (it.hasNext()) {
                    q02.a aVar = (q02.a) it.next();
                    java.lang.String str = aVar.f67416x28d45f97;
                    if (aVar.f67418x10a0fed7 == 1) {
                        java.util.LinkedList linkedList = f178863b;
                        if (!linkedList.contains(aVar.f67416x28d45f97)) {
                            linkedList.add(aVar.f67416x28d45f97);
                        }
                    } else {
                        java.util.LinkedList linkedList2 = f178862a;
                        if (!linkedList2.contains(aVar.f67416x28d45f97)) {
                            linkedList2.add(aVar.f67416x28d45f97);
                        }
                    }
                }
            }
            f178864c = true;
        }
    }

    public static void e(java.lang.String str) {
        d();
        f178863b.remove(str);
        f178862a.remove(str);
        if (q02.b.b() == null) {
            return;
        }
        q02.c b17 = q02.b.b();
        b17.getClass();
        b17.m145253xb158737d("DownloadTaskItem", java.lang.String.format("delete from %s where %s=\"%s\"", "DownloadTaskItem", "appId", str));
    }
}
