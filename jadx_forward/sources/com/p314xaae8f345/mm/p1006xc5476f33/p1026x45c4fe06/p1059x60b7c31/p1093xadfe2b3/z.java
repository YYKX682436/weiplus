package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3;

/* loaded from: classes.dex */
public class z {

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.z f163096b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f163097a = new java.util.concurrent.ConcurrentHashMap();

    public void a(java.lang.String str, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f163097a;
        if (concurrentHashMap.containsKey(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppStoreListenerManager", "appId already exists");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppStoreListenerManager", "add listener appId: %s", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.y yVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1093xadfe2b3.y(str, rVar);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Di(yVar);
        concurrentHashMap.put(str, yVar);
    }

    public void b(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppStoreListenerManager", "remove listener appId: %s", str);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f163097a;
        q80.a0 a0Var = (q80.a0) concurrentHashMap.get(str);
        if (a0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppStoreListenerManager", "listener not found for appId: %s", str);
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).ak(a0Var);
            concurrentHashMap.remove(str);
        }
    }
}
