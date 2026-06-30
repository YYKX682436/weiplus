package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public final class e7 implements com.p314xaae8f345.mm.vfs.e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.vfs.e7 f294444a = new com.p314xaae8f345.mm.vfs.e7();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f294445b = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f294446c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f294447d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String[] f294448e = new java.lang.String[0];

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f294449f = new java.util.concurrent.ConcurrentHashMap();

    public final void b(java.lang.String fsName, com.p314xaae8f345.mm.vfs.n1 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fsName, "fsName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f294449f;
        if (!concurrentHashMap.containsKey(fsName)) {
            concurrentHashMap.put(fsName, new java.util.ArrayList());
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) concurrentHashMap.get(fsName);
        if (arrayList != null) {
            arrayList.add(callback);
        }
    }

    public final java.lang.String c(java.lang.String fsName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fsName, "fsName");
        com.p314xaae8f345.mm.vfs.k1 k1Var = (com.p314xaae8f345.mm.vfs.k1) f294446c.get(fsName);
        if (k1Var == null) {
            return null;
        }
        if (k1Var.f294558b == null) {
            k1Var.f294558b = k1Var.f294557a.a(com.p314xaae8f345.mm.vfs.a3.f294314a.c());
        }
        return k1Var.f294558b;
    }
}
