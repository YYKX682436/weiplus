package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5;

/* loaded from: classes5.dex */
public final class s1 {
    public s1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final boolean a(long j17, long j18, java.lang.String udrProjectId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(udrProjectId, "udrProjectId");
        if (j17 == 0) {
            return true;
        }
        java.util.Map map = com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.q1.f129054a;
        java.util.Map map2 = com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.q1.f129054a;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = map2.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (((1 << ((java.lang.Number) entry.getKey()).intValue()) & j17) != 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x Ui = ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Ui(udrProjectId, ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.u1) entry2.getValue()).f129085a);
            long j19 = Ui != null ? Ui.f299123e : 0L;
            if (j19 <= 0 || ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.u1) entry2.getValue()).f129086b == 0 || j19 < ((long) ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.u1) entry2.getValue()).f129086b)) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(linkedHashMap2.size());
        java.util.Iterator it6 = linkedHashMap2.entrySet().iterator();
        while (it6.hasNext()) {
            arrayList.add(((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.u1) ((java.util.Map.Entry) it6.next()).getValue()).f129085a);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        kz5.n0.O0(arrayList, arrayList2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.NativeDependLibHelper", "check for depend libs, bit flag: " + j17 + ", checkList: " + arrayList2);
        if (arrayList2.isEmpty()) {
            return true;
        }
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(arrayList2.size());
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference(java.lang.Boolean.TRUE);
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.p pVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.p();
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q qVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q();
        qVar.c(udrProjectId);
        java.util.LinkedList linkedList = qVar.f299081e;
        if (linkedList != null) {
            linkedList.addAll(arrayList2);
        }
        java.util.LinkedList linkedList2 = pVar.f299078d;
        if (linkedList2 != null) {
            linkedList2.add(qVar);
        }
        ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Ai(pVar, new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.r1(atomicReference, countDownLatch));
        try {
            if (!countDownLatch.await(j18, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.NativeDependLibHelper", "download timeout");
                return false;
            }
        } catch (java.lang.InterruptedException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.NativeDependLibHelper", "await got exception: " + e17);
            atomicReference.set(java.lang.Boolean.FALSE);
        }
        java.lang.Object obj = atomicReference.get();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        return ((java.lang.Boolean) obj).booleanValue();
    }

    public final boolean b(java.lang.String libName, long j17, java.lang.String udrProjectId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(libName, "libName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(udrProjectId, "udrProjectId");
        java.util.Map map = com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.q1.f129054a;
        java.util.Map map2 = com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.q1.f129054a;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : map2.entrySet()) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.u1) entry.getValue()).f129085a, libName)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(linkedHashMap.size());
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Long.valueOf(1 << ((java.lang.Number) ((java.util.Map.Entry) it.next()).getKey()).intValue()));
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (!arrayList.isEmpty()) {
            return a(((java.lang.Number) arrayList.get(0)).longValue(), j17, udrProjectId);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.NativeDependLibHelper", "haven't match any lib for this libName: ".concat(libName));
        return false;
    }
}
