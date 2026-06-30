package m91;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final m91.f f406484a = new m91.f();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f406485b = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.LinkedHashMap f406486c = new java.util.LinkedHashMap(5, 0.7f, true);

    static {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.h.f274254a = m91.a.f406474d;
    }

    public static final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        java.util.LinkedHashMap linkedHashMap = f406486c;
        synchronized (linkedHashMap) {
        }
    }

    public static final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        java.util.LinkedHashMap linkedHashMap = f406486c;
        synchronized (linkedHashMap) {
        }
        tx5.j.d(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54063x6bbae3b4, new java.lang.Object[]{runtime.f156336n});
    }

    public java.lang.String a() {
        java.lang.String str;
        m91.c cVar;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e8.f157048a;
        linkedList.add(new jz5.l("weapp_lib_version_int", java.lang.Integer.valueOf(interfaceC11702x4ae7c33 != null ? interfaceC11702x4ae7c33.i() : -1)));
        if (interfaceC11702x4ae7c33 == null || (str = interfaceC11702x4ae7c33.W0()) == null) {
            str = com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
        }
        linkedList.add(new jz5.l("weapp_lib_version_str", str));
        java.util.LinkedHashMap linkedHashMap = f406486c;
        synchronized (linkedHashMap) {
            if (linkedHashMap.size() > 0) {
                java.util.Iterator it = linkedHashMap.keySet().iterator();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                while (true) {
                    java.lang.Object next = it.next();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
                    cVar = (m91.c) next;
                    if (!it.hasNext()) {
                        break;
                    }
                    sb6.append(cVar.f406476d);
                    sb6.append(',');
                }
                linkedList.add(new jz5.l("weapp_id", cVar.f406476d));
                linkedList.add(new jz5.l("weapp_name", cVar.f406477e));
                linkedList.add(new jz5.l("weapp_version", java.lang.Integer.valueOf(cVar.f406479g)));
                linkedList.add(new jz5.l("weapp_service_type", java.lang.Integer.valueOf(cVar.f406480h)));
                linkedList.add(new jz5.l("weapp_render_backend", java.lang.Integer.valueOf(cVar.f406481i)));
                java.lang.String sb7 = sb6.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sb7);
                java.lang.String substring = sb7.substring(0, java.lang.Math.max(r26.n0.O(sb7, ',', 0, false, 6, null), 0));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                if (!android.text.TextUtils.isEmpty(substring)) {
                    linkedList.add(new jz5.l("weapp_other_ids", substring));
                }
            }
        }
        java.lang.String m95797x14f51cd8 = com.p314xaae8f345.p2936x80def495.C25579xc4c9f3e9.m95797x14f51cd8();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m95797x14f51cd8, "version(...)");
        linkedList.add(new jz5.l("weapp_skyline_version", r26.i0.t(m95797x14f51cd8, ";", "_", false)));
        linkedList.add(new jz5.l("liteav_version", com.p314xaae8f345.p420x6236cc6.C3877x3eb9c7a0.m31902xdb46aa5d()));
        linkedList.add(new jz5.l("flutter_revision", a03.h.b()));
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            jz5.l lVar = (jz5.l) it6.next();
            java.lang.String str2 = (java.lang.String) lVar.f384366d;
            java.lang.Object obj = lVar.f384367e;
            sb8.append(str2);
            sb8.append(':');
            sb8.append(obj.toString());
            sb8.append(';');
        }
        java.lang.String sb9 = sb8.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb9, "toString(...)");
        return sb9;
    }
}
