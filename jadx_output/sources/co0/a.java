package co0;

/* loaded from: classes3.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final void a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderLiveVisitorPlayCore clear, core size:");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = co0.b.f43710f2;
        sb6.append(concurrentHashMap.size());
        com.tencent.mars.xlog.Log.i("FinderLiveVisitorPlayCore", sb6.toString());
        com.tencent.mm.sdk.platformtools.Log.c("FinderLiveVisitorPlayCore", "FinderLiveVisitorPlayCore clear", new java.lang.Object[0]);
        kz2.b.f313858a.d("FinderLiveVisitorPlayCore", "FinderLiveVisitorPlayCore clear, core size:" + concurrentHashMap.size());
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            ((co0.b) entry.getValue()).T0(false);
            ((co0.b) entry.getValue()).m0();
        }
        co0.b.f43710f2.clear();
    }

    public final co0.b b(long j17) {
        kz2.b bVar = kz2.b.f313858a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" create ");
        sb6.append(j17);
        sb6.append(' ');
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = co0.b.f43710f2;
        co0.b bVar2 = (co0.b) concurrentHashMap.get(java.lang.Long.valueOf(j17));
        sb6.append(bVar2 != null ? java.lang.Integer.valueOf(bVar2.hashCode()) : null);
        bVar.d("FinderLiveVisitorPlayCore", sb6.toString());
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.lang.Object obj = concurrentHashMap.get(valueOf);
        java.lang.Object obj2 = obj;
        if (obj == null) {
            co0.b bVar3 = new co0.b();
            synchronized (concurrentHashMap) {
                co0.b bVar4 = (co0.b) concurrentHashMap.get(java.lang.Long.valueOf(j17));
                if (bVar4 != null) {
                    bVar4.T0(false);
                    bVar4.m0();
                }
                concurrentHashMap.put(java.lang.Long.valueOf(j17), bVar3);
            }
            bVar3.f43711d2 = j17;
            ((b92.m2) ((zy2.n8) i95.n0.c(zy2.n8.class))).Ai(j17, true);
            com.tencent.mars.xlog.Log.i("FinderLiveVisitorPlayCore", "FinderLiveVisitorPlayCore create instance:" + java.lang.Integer.valueOf(bVar3.hashCode()) + ", liveId:" + j17 + ", core size:" + concurrentHashMap.size());
            java.lang.Object putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, bVar3);
            obj2 = bVar3;
            if (putIfAbsent != null) {
                obj2 = putIfAbsent;
            }
        }
        return (co0.b) obj2;
    }

    public final co0.b c(long j17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = co0.b.f43710f2;
        co0.b bVar = (co0.b) concurrentHashMap.get(java.lang.Long.valueOf(j17));
        if (bVar == null) {
            com.tencent.mars.xlog.Log.i("FinderLiveVisitorPlayCore", "FinderLiveVisitorPlayCore get liveId:" + j17 + " instance is empty, core size:" + concurrentHashMap.size());
        }
        return bVar;
    }

    public final void d(long j17, boolean z17) {
        mn0.b0 b0Var;
        kz2.b.f313858a.d("FinderLiveVisitorPlayCore", " releaseInstance " + j17 + " stopPlay:" + z17);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = co0.b.f43710f2;
        co0.b bVar = (co0.b) concurrentHashMap.remove(java.lang.Long.valueOf(j17));
        if (z17) {
            if (bVar != null) {
                bVar.T0(false);
            }
            if (bVar != null && (b0Var = bVar.R1.f282409a) != null) {
                ((mn0.y) b0Var).w();
            }
        }
        if (bVar != null) {
            bVar.m0();
        }
        ((b92.m2) ((zy2.n8) i95.n0.c(zy2.n8.class))).Ai(j17, false);
        com.tencent.mars.xlog.Log.i("FinderLiveVisitorPlayCore", "FinderLiveVisitorPlayCore releaseInstance instance:" + bVar + ", liveId:" + j17 + ", core size:" + concurrentHashMap.size());
    }

    public final void e(long j17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = co0.b.f43710f2;
        co0.b bVar = (co0.b) concurrentHashMap.remove(java.lang.Long.valueOf(j17));
        com.tencent.mars.xlog.Log.i("FinderLiveVisitorPlayCore", "releaseWithoutLiveId " + j17 + " core: " + bVar);
        a();
        if (bVar != null) {
            concurrentHashMap.put(java.lang.Long.valueOf(j17), bVar);
        }
    }
}
