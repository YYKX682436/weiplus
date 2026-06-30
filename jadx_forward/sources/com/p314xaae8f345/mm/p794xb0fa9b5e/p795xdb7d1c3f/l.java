package com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f;

/* loaded from: classes7.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f149887a = new java.util.WeakHashMap();

    public static void a(java.lang.String str, java.lang.Object obj, java.lang.Class cls, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        boolean z17;
        try {
            z17 = rk0.a.a(cls, mk0.a.class);
        } catch (java.lang.Exception unused) {
            z17 = false;
        }
        boolean z18 = z17 || rVar == null;
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str, new com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.C10747xff81be48(cls.getName(), obj), z18 ? com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.h.class : com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.g.class, rVar == null ? null : new com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.f(z18, rVar));
    }

    public static java.lang.Object b(java.lang.String str, java.lang.Object obj, java.lang.Class cls) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.C10747xff81be48 c10747xff81be48 = (com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.C10747xff81be48) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(str, new com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.C10747xff81be48(cls.getName(), obj), com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.j.class);
        if (c10747xff81be48 != null) {
            return c10747xff81be48.f149877e;
        }
        rk0.c.d("IPC.XIPCInvoker", "sync invoke error, wrapper parcelable data is null!", new java.lang.Object[0]);
        return null;
    }

    public static void c(com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar2;
        if (rVar == null) {
            return;
        }
        java.util.Map map = f149887a;
        synchronized (map) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.WeakHashMap) map).remove(rVar);
            rVar2 = weakReference == null ? null : (com.p314xaae8f345.mm.p794xb0fa9b5e.r) weakReference.get();
        }
        if (rVar2 != null) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.h(rVar2);
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.h(rVar);
    }
}
