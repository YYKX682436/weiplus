package com.tencent.mm.plugin.downloader_app.model;

/* loaded from: classes4.dex */
public abstract class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.LinkedList f97329a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedList f97330b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f97331c = false;

    public static void a(java.lang.String str) {
        d();
        if (b(str)) {
            return;
        }
        f97329a.addFirst(str);
        if (q02.b.b() == null) {
            return;
        }
        q02.a aVar = new q02.a();
        aVar.field_appId = str;
        aVar.field_modifyTime = java.lang.System.currentTimeMillis();
        q02.b.b().insert(aVar);
    }

    public static boolean b(java.lang.String str) {
        d();
        return f97330b.contains(str) || f97329a.contains(str);
    }

    public static java.util.LinkedList c() {
        d();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.addAll(f97329a);
        linkedList.addAll(f97330b);
        return linkedList;
    }

    public static void d() {
        if (f97331c) {
            return;
        }
        synchronized (com.tencent.mm.plugin.downloader_app.model.s0.class) {
            if (f97331c) {
                return;
            }
            java.util.LinkedList a17 = q02.b.a();
            if (a17 != null) {
                java.util.Iterator it = a17.iterator();
                while (it.hasNext()) {
                    q02.a aVar = (q02.a) it.next();
                    java.lang.String str = aVar.field_appId;
                    if (aVar.field_status == 1) {
                        java.util.LinkedList linkedList = f97330b;
                        if (!linkedList.contains(aVar.field_appId)) {
                            linkedList.add(aVar.field_appId);
                        }
                    } else {
                        java.util.LinkedList linkedList2 = f97329a;
                        if (!linkedList2.contains(aVar.field_appId)) {
                            linkedList2.add(aVar.field_appId);
                        }
                    }
                }
            }
            f97331c = true;
        }
    }

    public static void e(java.lang.String str) {
        d();
        f97330b.remove(str);
        f97329a.remove(str);
        if (q02.b.b() == null) {
            return;
        }
        q02.c b17 = q02.b.b();
        b17.getClass();
        b17.execSQL("DownloadTaskItem", java.lang.String.format("delete from %s where %s=\"%s\"", "DownloadTaskItem", "appId", str));
    }
}
