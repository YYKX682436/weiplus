package ow;

/* loaded from: classes11.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final ow.t f430798a = new ow.t();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f430799b;

    /* renamed from: c, reason: collision with root package name */
    public static int f430800c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f430801d;

    public static final com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.e a(ow.t tVar) {
        tVar.getClass();
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k c17 = com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.g0.f300446c.c(2147483647L, 1);
        java.util.LinkedList linkedList = c17.f300531d;
        int size = linkedList != null ? linkedList.size() : 0;
        jz5.l e17 = tVar.e(c17);
        java.util.List list = (java.util.List) e17.f384366d;
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j jVar = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j) e17.f384367e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BrandEcsNotifyCacheMgr", "[BRS]getMainEntryNotifyData list size = " + size);
        return tVar.c(jVar, list, null);
    }

    public static final com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.e b(ow.t tVar, com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k kVar) {
        tVar.getClass();
        java.util.LinkedList linkedList = kVar.f300531d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BrandEcsNotifyCacheMgr", "[BRS]getTiledNotifyCacheData list size = " + (linkedList != null ? linkedList.size() : 0));
        jz5.l e17 = tVar.e(kVar);
        return tVar.c((com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j) e17.f384367e, (java.util.List) e17.f384366d, kVar);
    }

    public final com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.e c(com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j jVar, java.util.List list, com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k kVar) {
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.e eVar = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.e();
        if (jVar != null) {
            eVar.f300414f = jVar;
        }
        if (kVar != null) {
            eVar.f300412d = kVar;
        }
        if (!list.isEmpty()) {
            eVar.f300413e.addAll(list);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BrandEcsNotifyCacheMgr", "[BRS]buildBSNotifyCache add success BSContactInfo size = " + list.size());
        }
        return eVar;
    }

    public final com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.c d(com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23516x65d494ce contactInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contactInfo, "contactInfo");
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.c cVar = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.c();
        java.lang.String m86814x6bf53a6c = contactInfo.m86814x6bf53a6c();
        if (m86814x6bf53a6c != null) {
            if (!(m86814x6bf53a6c.length() > 0)) {
                m86814x6bf53a6c = null;
            }
            if (m86814x6bf53a6c != null) {
                cVar.f300390d = m86814x6bf53a6c;
            }
        }
        java.lang.String m86813x80025a04 = contactInfo.m86813x80025a04();
        if (m86813x80025a04 != null) {
            java.lang.String str = m86813x80025a04.length() > 0 ? m86813x80025a04 : null;
            if (str != null) {
                cVar.f300391e = str;
            }
        }
        java.lang.Boolean m86816x16286b96 = contactInfo.m86816x16286b96();
        if (m86816x16286b96 != null) {
            cVar.f300392f = m86816x16286b96.booleanValue();
        }
        java.lang.Boolean m86818x3f84a618 = contactInfo.m86818x3f84a618();
        if (m86818x3f84a618 != null) {
            cVar.f300393g = m86818x3f84a618.booleanValue();
        }
        java.lang.Boolean m86817xb9a62e63 = contactInfo.m86817xb9a62e63();
        if (m86817xb9a62e63 != null) {
            cVar.f300394h = m86817xb9a62e63.booleanValue();
        }
        return cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    public final jz5.l e(com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k kVar) {
        ?? r07;
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.c cVar;
        java.util.LinkedList msgList = kVar.f300531d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(msgList, "msgList");
        java.util.List V = kz5.n0.V(msgList);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) V).iterator();
        while (it.hasNext()) {
            java.lang.String str = ((com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j) it.next()).f300508f;
            if (str != null) {
                arrayList.add(str);
            }
        }
        java.util.List<java.lang.String> Q = kz5.n0.Q(arrayList);
        if (!Q.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BrandEcsNotifyCacheMgr", "[BRS]userNames SIZE -> " + Q.size());
            r07 = new java.util.ArrayList();
            for (java.lang.String str2 : Q) {
                try {
                    cVar = f430798a.d(zv.q.f557612a.d(str2));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BrandEcsNotifyCacheMgr", "[BRS]batchGetAndConvertToBSContact: success，userName = " + str2);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("BrandEcsNotifyCacheMgr", e17, "[BRS]batchGetAndConvertToBSContact: failure，userName = " + str2, new java.lang.Object[0]);
                    cVar = null;
                }
                if (cVar != null) {
                    r07.add(cVar);
                }
            }
        } else {
            r07 = kz5.p0.f395529d;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k c17 = com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.g0.f300446c.c(2147483647L, 1);
        java.util.LinkedList linkedList = c17.f300531d;
        int size = linkedList != null ? linkedList.size() : 0;
        java.util.LinkedList linkedList2 = c17.f300531d;
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j jVar = linkedList2 != null ? (com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j) kz5.n0.Z(linkedList2) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BrandEcsNotifyCacheMgr", "[BRS]getCommonNotifyData mainEntryNotifyList size = " + size + ", bsContactList size -> " + r07.size());
        return new jz5.l(r07, jVar);
    }
}
