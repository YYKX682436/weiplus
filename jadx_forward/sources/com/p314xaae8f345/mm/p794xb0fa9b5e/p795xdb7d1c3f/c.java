package com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f;

/* loaded from: classes7.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Object f149878a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f149879b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f149880c = new java.util.HashMap();

    public static void a(com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.a aVar) {
        if (aVar == null) {
            return;
        }
        synchronized (f149878a) {
            java.util.List list = f149879b;
            if (((java.util.LinkedList) list).contains(aVar)) {
                return;
            }
            ((java.util.HashMap) f149880c).put(aVar.mo46195xfb82e301(), aVar);
            ((java.util.LinkedList) list).add(aVar);
        }
    }

    public static com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.a b(java.lang.Object obj) {
        synchronized (f149878a) {
            for (com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.a aVar : f149879b) {
                if (aVar.a(obj)) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public static java.lang.Object c(java.lang.String str, android.os.Parcel parcel) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.a aVar;
        synchronized (f149878a) {
            aVar = (com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.a) ((java.util.HashMap) f149880c).get(str);
        }
        if (aVar != null) {
            return aVar.b(parcel);
        }
        rk0.c.d("Luggage.ObjectTypeTransfer", "Get transferClass '%s' return null", str);
        return null;
    }

    public static void d(java.lang.Object obj, android.os.Parcel parcel) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.a b17 = b(obj);
        if (b17 != null) {
            b17.c(obj, parcel);
        }
    }
}
