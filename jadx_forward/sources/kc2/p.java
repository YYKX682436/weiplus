package kc2;

/* loaded from: classes15.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kc2.q f388000d;

    public p(kc2.q qVar) {
        this.f388000d = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        kc2.q qVar = this.f388000d;
        qVar.e(concurrentHashMap, linkedList, linkedList2);
        int i17 = 0;
        if (!concurrentHashMap.isEmpty()) {
            java.util.Iterator it = concurrentHashMap.entrySet().iterator();
            int i18 = 0;
            while (it.hasNext()) {
                int intValue = ((java.lang.Number) ((java.util.Map.Entry) it.next()).getValue()).intValue();
                kc2.l[] lVarArr = kc2.l.f387985d;
                if (intValue == 1) {
                    i18++;
                }
            }
            i17 = i18;
        }
        qVar.f388009g = i17;
        concurrentHashMap.forEach(new kc2.o(qVar));
        qVar.f388008f.clear();
        qVar.f388008f.addAll(linkedList);
        qVar.f388010h.clear();
        qVar.f388010h.addAll(linkedList2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(qVar.f388005c, "updateBusinessInfo businessCnt=" + qVar.f388009g + ",businessSeq=" + qVar.f388008f);
    }
}
