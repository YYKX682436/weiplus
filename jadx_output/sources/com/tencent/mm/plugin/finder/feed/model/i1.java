package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.model.i1 f107930a = new com.tencent.mm.plugin.finder.feed.model.i1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f107931b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f107932c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.List f107933d = java.util.Collections.synchronizedList(new java.util.ArrayList());

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f107934e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f107935f = new java.util.concurrent.ConcurrentHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(java.lang.String userName, java.lang.String noticeId, r45.h32 info) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(noticeId, "noticeId");
        kotlin.jvm.internal.o.g(info, "info");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f107931b;
        synchronized (concurrentHashMap) {
            com.tencent.mars.xlog.Log.i("FinderFeedLiveNoticeCache", "[add] userName:" + userName + " id: " + info.getString(4) + " status: " + info.getInteger(1));
            if (concurrentHashMap.containsKey(userName)) {
                java.util.ArrayList arrayList = (java.util.ArrayList) concurrentHashMap.get(userName);
                com.tencent.mm.plugin.finder.feed.model.f1 f1Var = null;
                if (arrayList != null) {
                    java.util.Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it.next();
                        if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.finder.feed.model.f1) next).f107846a.getString(4), noticeId)) {
                            f1Var = next;
                            break;
                        }
                    }
                    f1Var = f1Var;
                }
                if (f1Var == null || !f1Var.a()) {
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = f107931b;
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) concurrentHashMap2.get(userName);
                    if (arrayList2 != null) {
                        kotlin.jvm.internal.m0.a(arrayList2).remove(f1Var);
                    }
                    java.util.ArrayList arrayList3 = (java.util.ArrayList) concurrentHashMap2.get(userName);
                    if (arrayList3 != null) {
                        arrayList3.add(new com.tencent.mm.plugin.finder.feed.model.f1(info, 0L, 2, null));
                    }
                }
            } else {
                concurrentHashMap.put(userName, new java.util.ArrayList());
                java.util.ArrayList arrayList4 = (java.util.ArrayList) concurrentHashMap.get(userName);
                if (arrayList4 != null) {
                    arrayList4.add(new com.tencent.mm.plugin.finder.feed.model.f1(info, 0L, 2, null));
                }
            }
        }
    }

    public final void b(java.lang.String userName, com.tencent.mm.protocal.protobuf.FinderObject info) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(info, "info");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f107932c;
        synchronized (concurrentHashMap) {
            com.tencent.mars.xlog.Log.i("FinderFeedLiveNoticeCache", "[add] userName:".concat(userName));
            concurrentHashMap.put(userName, new dk2.sg(info, 0L, 2, null));
        }
    }

    public final r45.le0 c(long j17, boolean z17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f107935f;
        java.lang.Integer num = (java.lang.Integer) concurrentHashMap.get(java.lang.Long.valueOf(j17));
        r45.le0 le0Var = (r45.le0) f107934e.get(java.lang.Long.valueOf(j17));
        if (le0Var == null) {
            com.tencent.mars.xlog.Log.i("FinderFeedLiveNoticeCache", "getDiagnosisData null");
            return null;
        }
        if (z17) {
            return le0Var;
        }
        int integer = le0Var.getInteger(2);
        if (num != null && num.intValue() == integer) {
            com.tencent.mars.xlog.Log.i("FinderFeedLiveNoticeCache", "getDiagnosisData lastIndex: " + num);
            return null;
        }
        com.tencent.mars.xlog.Log.i("FinderFeedLiveNoticeCache", "getDiagnosisData feedId: " + j17 + ", text: " + le0Var.getString(1) + ", index: " + le0Var.getInteger(2));
        concurrentHashMap.put(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(le0Var.getInteger(2)));
        return le0Var;
    }

    public final r45.h32 d(java.lang.String userName) {
        r45.h32 h32Var;
        r45.h32 h32Var2;
        kotlin.jvm.internal.o.g(userName, "userName");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f107931b;
        synchronized (concurrentHashMap) {
            java.util.ArrayList arrayList = (java.util.ArrayList) concurrentHashMap.get(userName);
            h32Var = null;
            com.tencent.mm.plugin.finder.feed.model.f1 f1Var = arrayList != null ? (com.tencent.mm.plugin.finder.feed.model.f1) kz5.n0.Z(arrayList) : null;
            java.util.ArrayList<com.tencent.mm.plugin.finder.feed.model.f1> arrayList2 = (java.util.ArrayList) concurrentHashMap.get(userName);
            if (arrayList2 != null) {
                for (com.tencent.mm.plugin.finder.feed.model.f1 f1Var2 : arrayList2) {
                    int i17 = 0;
                    int integer = f1Var2.f107846a.getInteger(0);
                    if (f1Var != null && (h32Var2 = f1Var.f107846a) != null) {
                        i17 = h32Var2.getInteger(0);
                    }
                    if (integer < i17) {
                        f1Var = f1Var2;
                    }
                }
            }
            if (f1Var != null) {
                if (f1Var.a()) {
                    h32Var = f1Var.f107846a;
                } else {
                    java.util.ArrayList arrayList3 = (java.util.ArrayList) f107931b.get(userName);
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
        com.tencent.mm.plugin.finder.feed.model.f1 f1Var;
        r45.h32 h32Var2;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(noticeId, "noticeId");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f107931b;
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
                    if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.finder.feed.model.f1) obj).f107846a.getString(4), noticeId)) {
                        break;
                    }
                }
                f1Var = (com.tencent.mm.plugin.finder.feed.model.f1) obj;
            } else {
                f1Var = null;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("[get] userName:");
            sb6.append(userName);
            sb6.append(" id: ");
            sb6.append(noticeId);
            sb6.append(" status: ");
            sb6.append((f1Var == null || (h32Var2 = f1Var.f107846a) == null) ? -1 : h32Var2.getInteger(1));
            com.tencent.mars.xlog.Log.i("FinderFeedLiveNoticeCache", sb6.toString());
            if (f1Var != null) {
                if (f1Var.a()) {
                    h32Var = f1Var.f107846a;
                } else {
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) f107931b.get(userName);
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
        kotlin.jvm.internal.o.g(userName, "userName");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f107932c;
        synchronized (concurrentHashMap) {
            dk2.sg sgVar2 = (dk2.sg) concurrentHashMap.get(userName);
            sgVar = null;
            if (sgVar2 != null) {
                if (!(java.lang.System.currentTimeMillis() - sgVar2.f234083b < 600000)) {
                    f107931b.remove(userName);
                    sgVar2 = null;
                }
                sgVar = sgVar2;
            }
        }
        return sgVar;
    }
}
