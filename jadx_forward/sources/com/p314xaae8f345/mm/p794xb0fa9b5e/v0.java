package com.p314xaae8f345.mm.p794xb0fa9b5e;

/* loaded from: classes7.dex */
public abstract class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f149941a = new java.util.concurrent.ConcurrentHashMap();

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
            java.util.Map map = f149941a;
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.e eVar = (com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.e) ((java.util.concurrent.ConcurrentHashMap) map).get(name);
            if (eVar == null) {
                eVar = new com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.e(cls);
                ((java.util.concurrent.ConcurrentHashMap) map).put(name, eVar);
            }
            if (eVar.f149881a == null) {
                synchronized (eVar) {
                    if (eVar.f149881a == null) {
                        eVar.f149881a = qk0.c.b(eVar.f149882b);
                    }
                }
            }
            return eVar.f149881a;
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
            java.util.Map map = f149941a;
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.e eVar = (com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.e) ((java.util.concurrent.ConcurrentHashMap) map).get(str);
            if (eVar == null) {
                eVar = new com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.e(cls2);
                ((java.util.concurrent.ConcurrentHashMap) map).put(str, eVar);
            }
            if (eVar.f149881a == null) {
                synchronized (eVar) {
                    if (eVar.f149881a == null) {
                        eVar.f149881a = qk0.c.b(eVar.f149882b);
                    }
                }
            }
            return eVar.f149881a;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
