package com.tencent.mm.ipcinvoker;

/* loaded from: classes7.dex */
public abstract class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f68408a = new java.util.concurrent.ConcurrentHashMap();

    public static java.lang.Object a(java.lang.Class cls, java.lang.Class cls2) {
        try {
            if (!cls2.isAssignableFrom(cls)) {
                rk0.c.b("IPC.ObjectStore", "%s isAssignableFrom %s return false", cls2, cls);
                return null;
            }
            if (!cls.isAnnotationPresent(mk0.b.class)) {
                return qk0.c.c(cls, cls2);
            }
            java.lang.String name = cls.getName();
            java.util.Map map = f68408a;
            com.tencent.mm.ipcinvoker.extension.e eVar = (com.tencent.mm.ipcinvoker.extension.e) ((java.util.concurrent.ConcurrentHashMap) map).get(name);
            if (eVar == null) {
                eVar = new com.tencent.mm.ipcinvoker.extension.e(cls);
                ((java.util.concurrent.ConcurrentHashMap) map).put(name, eVar);
            }
            if (eVar.f68348a == null) {
                synchronized (eVar) {
                    if (eVar.f68348a == null) {
                        eVar.f68348a = qk0.c.b(eVar.f68349b);
                    }
                }
            }
            return eVar.f68348a;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static java.lang.Object b(java.lang.String str, java.lang.Class cls) {
        try {
            java.lang.Class<?> cls2 = java.lang.Class.forName(str);
            if (!cls.isAssignableFrom(cls2)) {
                rk0.c.b("IPC.ObjectStore", "%s isAssignableFrom %s return false", cls, cls2);
                return null;
            }
            if (!cls2.isAnnotationPresent(mk0.b.class)) {
                return qk0.c.d(str, cls);
            }
            java.util.Map map = f68408a;
            com.tencent.mm.ipcinvoker.extension.e eVar = (com.tencent.mm.ipcinvoker.extension.e) ((java.util.concurrent.ConcurrentHashMap) map).get(str);
            if (eVar == null) {
                eVar = new com.tencent.mm.ipcinvoker.extension.e(cls2);
                ((java.util.concurrent.ConcurrentHashMap) map).put(str, eVar);
            }
            if (eVar.f68348a == null) {
                synchronized (eVar) {
                    if (eVar.f68348a == null) {
                        eVar.f68348a = qk0.c.b(eVar.f68349b);
                    }
                }
            }
            return eVar.f68348a;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
