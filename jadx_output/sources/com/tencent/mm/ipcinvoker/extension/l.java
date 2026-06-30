package com.tencent.mm.ipcinvoker.extension;

/* loaded from: classes7.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f68354a = new java.util.WeakHashMap();

    public static void a(java.lang.String str, java.lang.Object obj, java.lang.Class cls, com.tencent.mm.ipcinvoker.r rVar) {
        boolean z17;
        try {
            z17 = rk0.a.a(cls, mk0.a.class);
        } catch (java.lang.Exception unused) {
            z17 = false;
        }
        boolean z18 = z17 || rVar == null;
        com.tencent.mm.ipcinvoker.d0.d(str, new com.tencent.mm.ipcinvoker.extension.XIPCInvoker$WrapperParcelable(cls.getName(), obj), z18 ? com.tencent.mm.ipcinvoker.extension.h.class : com.tencent.mm.ipcinvoker.extension.g.class, rVar == null ? null : new com.tencent.mm.ipcinvoker.extension.f(z18, rVar));
    }

    public static java.lang.Object b(java.lang.String str, java.lang.Object obj, java.lang.Class cls) {
        com.tencent.mm.ipcinvoker.extension.XIPCInvoker$WrapperParcelable xIPCInvoker$WrapperParcelable = (com.tencent.mm.ipcinvoker.extension.XIPCInvoker$WrapperParcelable) com.tencent.mm.ipcinvoker.d0.f(str, new com.tencent.mm.ipcinvoker.extension.XIPCInvoker$WrapperParcelable(cls.getName(), obj), com.tencent.mm.ipcinvoker.extension.j.class);
        if (xIPCInvoker$WrapperParcelable != null) {
            return xIPCInvoker$WrapperParcelable.f68344e;
        }
        rk0.c.d("IPC.XIPCInvoker", "sync invoke error, wrapper parcelable data is null!", new java.lang.Object[0]);
        return null;
    }

    public static void c(com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.ipcinvoker.r rVar2;
        if (rVar == null) {
            return;
        }
        java.util.Map map = f68354a;
        synchronized (map) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.WeakHashMap) map).remove(rVar);
            rVar2 = weakReference == null ? null : (com.tencent.mm.ipcinvoker.r) weakReference.get();
        }
        if (rVar2 != null) {
            com.tencent.mm.ipcinvoker.d0.h(rVar2);
        }
        com.tencent.mm.ipcinvoker.d0.h(rVar);
    }
}
