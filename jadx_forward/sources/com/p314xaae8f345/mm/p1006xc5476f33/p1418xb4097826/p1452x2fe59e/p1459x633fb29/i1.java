package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1 f189463a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f189464b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f189465c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.List f189466d = java.util.Collections.synchronizedList(new java.util.ArrayList());

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f189467e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f189468f = new java.util.concurrent.ConcurrentHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(java.lang.String userName, java.lang.String noticeId, r45.h32 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeId, "noticeId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f189464b;
        synchronized (concurrentHashMap) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedLiveNoticeCache", "[add] userName:" + userName + " id: " + info.m75945x2fec8307(4) + " status: " + info.m75939xb282bd08(1));
            if (concurrentHashMap.containsKey(userName)) {
                java.util.ArrayList arrayList = (java.util.ArrayList) concurrentHashMap.get(userName);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.f1 f1Var = null;
                if (arrayList != null) {
                    java.util.Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.f1) next).f189379a.m75945x2fec8307(4), noticeId)) {
                            f1Var = next;
                            break;
                        }
                    }
                    f1Var = f1Var;
                }
                if (f1Var == null || !f1Var.a()) {
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = f189464b;
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) concurrentHashMap2.get(userName);
                    if (arrayList2 != null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.m0.a(arrayList2).remove(f1Var);
                    }
                    java.util.ArrayList arrayList3 = (java.util.ArrayList) concurrentHashMap2.get(userName);
                    if (arrayList3 != null) {
                        arrayList3.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.f1(info, 0L, 2, null));
                    }
                }
            } else {
                concurrentHashMap.put(userName, new java.util.ArrayList());
                java.util.ArrayList arrayList4 = (java.util.ArrayList) concurrentHashMap.get(userName);
                if (arrayList4 != null) {
                    arrayList4.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.f1(info, 0L, 2, null));
                }
            }
        }
    }

    public final void b(java.lang.String userName, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f189465c;
        synchronized (concurrentHashMap) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedLiveNoticeCache", "[add] userName:".concat(userName));
            concurrentHashMap.put(userName, new dk2.sg(info, 0L, 2, null));
        }
    }

    public final r45.le0 c(long j17, boolean z17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f189468f;
        java.lang.Integer num = (java.lang.Integer) concurrentHashMap.get(java.lang.Long.valueOf(j17));
        r45.le0 le0Var = (r45.le0) f189467e.get(java.lang.Long.valueOf(j17));
        if (le0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedLiveNoticeCache", "getDiagnosisData null");
            return null;
        }
        if (z17) {
            return le0Var;
        }
        int m75939xb282bd08 = le0Var.m75939xb282bd08(2);
        if (num != null && num.intValue() == m75939xb282bd08) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedLiveNoticeCache", "getDiagnosisData lastIndex: " + num);
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedLiveNoticeCache", "getDiagnosisData feedId: " + j17 + ", text: " + le0Var.m75945x2fec8307(1) + ", index: " + le0Var.m75939xb282bd08(2));
        concurrentHashMap.put(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(le0Var.m75939xb282bd08(2)));
        return le0Var;
    }

    public final r45.h32 d(java.lang.String userName) {
        r45.h32 h32Var;
        r45.h32 h32Var2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f189464b;
        synchronized (concurrentHashMap) {
            java.util.ArrayList arrayList = (java.util.ArrayList) concurrentHashMap.get(userName);
            h32Var = null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.f1 f1Var = arrayList != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.f1) kz5.n0.Z(arrayList) : null;
            java.util.ArrayList<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.f1> arrayList2 = (java.util.ArrayList) concurrentHashMap.get(userName);
            if (arrayList2 != null) {
                for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.f1 f1Var2 : arrayList2) {
                    int i17 = 0;
                    int m75939xb282bd08 = f1Var2.f189379a.m75939xb282bd08(0);
                    if (f1Var != null && (h32Var2 = f1Var.f189379a) != null) {
                        i17 = h32Var2.m75939xb282bd08(0);
                    }
                    if (m75939xb282bd08 < i17) {
                        f1Var = f1Var2;
                    }
                }
            }
            if (f1Var != null) {
                if (f1Var.a()) {
                    h32Var = f1Var.f189379a;
                } else {
                    java.util.ArrayList arrayList3 = (java.util.ArrayList) f189464b.get(userName);
                    if (arrayList3 != null) {
                        arrayList3.remove(f1Var);
                    }
                }
            }
        }
        return h32Var;
    }

    public final r45.h32 e(java.lang.String userName, java.lang.String noticeId) {
        r45.h32 h32Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.f1 f1Var;
        r45.h32 h32Var2;
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeId, "noticeId");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f189464b;
        synchronized (concurrentHashMap) {
            java.util.ArrayList arrayList = (java.util.ArrayList) concurrentHashMap.get(userName);
            h32Var = null;
            if (arrayList != null) {
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.f1) obj).f189379a.m75945x2fec8307(4), noticeId)) {
                        break;
                    }
                }
                f1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.f1) obj;
            } else {
                f1Var = null;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("[get] userName:");
            sb6.append(userName);
            sb6.append(" id: ");
            sb6.append(noticeId);
            sb6.append(" status: ");
            sb6.append((f1Var == null || (h32Var2 = f1Var.f189379a) == null) ? -1 : h32Var2.m75939xb282bd08(1));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedLiveNoticeCache", sb6.toString());
            if (f1Var != null) {
                if (f1Var.a()) {
                    h32Var = f1Var.f189379a;
                } else {
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) f189464b.get(userName);
                    if (arrayList2 != null) {
                        arrayList2.remove(f1Var);
                    }
                }
            }
        }
        return h32Var;
    }

    public final dk2.sg f(java.lang.String userName) {
        dk2.sg sgVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f189465c;
        synchronized (concurrentHashMap) {
            dk2.sg sgVar2 = (dk2.sg) concurrentHashMap.get(userName);
            sgVar = null;
            if (sgVar2 != null) {
                if (!(java.lang.System.currentTimeMillis() - sgVar2.f315616b < 600000)) {
                    f189464b.remove(userName);
                    sgVar2 = null;
                }
                sgVar = sgVar2;
            }
        }
        return sgVar;
    }
}
