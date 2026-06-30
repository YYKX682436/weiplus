package g73;

/* loaded from: classes15.dex */
public final class o extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.os.Looper looper) {
        super(looper);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(looper, "looper");
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        boolean z17;
        g73.o0.f350844d.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HandOffService", "do fix handoff");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = g73.o0.f350847g;
        if (!concurrentHashMap.isEmpty()) {
            for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260) entry.getValue()).getHandOffType() == 1 && !(entry.getValue() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16088x98e700b2)) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        if (z17) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry entry2 : concurrentHashMap.entrySet()) {
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260) entry2.getValue()).getHandOffType() == 1 && !(entry2.getValue() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16088x98e700b2)) {
                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HandOffService", "in launcherUI, handoff not clear[exist:" + linkedHashMap.size() + "]! try to fix...");
            if (!linkedHashMap.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HandOffService", "in launcherUI, handoff exist, send all list");
                java.util.Iterator it = linkedHashMap.keySet().iterator();
                while (it.hasNext()) {
                    concurrentHashMap.remove((java.lang.String) it.next());
                }
                java.util.Collection values = concurrentHashMap.values();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
                g73.o0.f350853p.e(values);
            }
        }
    }
}
