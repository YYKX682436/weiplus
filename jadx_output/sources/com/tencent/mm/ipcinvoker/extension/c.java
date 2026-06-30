package com.tencent.mm.ipcinvoker.extension;

/* loaded from: classes7.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Object f68345a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f68346b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f68347c = new java.util.HashMap();

    public static void a(com.tencent.mm.ipcinvoker.extension.a aVar) {
        if (aVar == null) {
            return;
        }
        synchronized (f68345a) {
            java.util.List list = f68346b;
            if (((java.util.LinkedList) list).contains(aVar)) {
                return;
            }
            ((java.util.HashMap) f68347c).put(aVar.getName(), aVar);
            ((java.util.LinkedList) list).add(aVar);
        }
    }

    public static com.tencent.mm.ipcinvoker.extension.a b(java.lang.Object obj) {
        synchronized (f68345a) {
            for (com.tencent.mm.ipcinvoker.extension.a aVar : f68346b) {
                if (aVar.a(obj)) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public static java.lang.Object c(java.lang.String str, android.os.Parcel parcel) {
        com.tencent.mm.ipcinvoker.extension.a aVar;
        synchronized (f68345a) {
            aVar = (com.tencent.mm.ipcinvoker.extension.a) ((java.util.HashMap) f68347c).get(str);
        }
        if (aVar != null) {
            return aVar.b(parcel);
        }
        rk0.c.d("Luggage.ObjectTypeTransfer", "Get transferClass '%s' return null", str);
        return null;
    }

    public static void d(java.lang.Object obj, android.os.Parcel parcel) {
        com.tencent.mm.ipcinvoker.extension.a b17 = b(obj);
        if (b17 != null) {
            b17.c(obj, parcel);
        }
    }
}
