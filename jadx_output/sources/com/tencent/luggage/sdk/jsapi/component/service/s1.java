package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes5.dex */
public final class s1 {
    public s1(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(long j17, long j18, java.lang.String udrProjectId) {
        kotlin.jvm.internal.o.g(udrProjectId, "udrProjectId");
        if (j17 == 0) {
            return true;
        }
        java.util.Map map = com.tencent.luggage.sdk.jsapi.component.service.q1.f47521a;
        java.util.Map map2 = com.tencent.luggage.sdk.jsapi.component.service.q1.f47521a;
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
            com.tencent.wechat.aff.udr.x Ui = ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Ui(udrProjectId, ((com.tencent.luggage.sdk.jsapi.component.service.u1) entry2.getValue()).f47552a);
            long j19 = Ui != null ? Ui.f217590e : 0L;
            if (j19 <= 0 || ((com.tencent.luggage.sdk.jsapi.component.service.u1) entry2.getValue()).f47553b == 0 || j19 < ((long) ((com.tencent.luggage.sdk.jsapi.component.service.u1) entry2.getValue()).f47553b)) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(linkedHashMap2.size());
        java.util.Iterator it6 = linkedHashMap2.entrySet().iterator();
        while (it6.hasNext()) {
            arrayList.add(((com.tencent.luggage.sdk.jsapi.component.service.u1) ((java.util.Map.Entry) it6.next()).getValue()).f47552a);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        kz5.n0.O0(arrayList, arrayList2);
        com.tencent.mars.xlog.Log.i("Luggage.NativeDependLibHelper", "check for depend libs, bit flag: " + j17 + ", checkList: " + arrayList2);
        if (arrayList2.isEmpty()) {
            return true;
        }
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(arrayList2.size());
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference(java.lang.Boolean.TRUE);
        com.tencent.wechat.aff.udr.p pVar = new com.tencent.wechat.aff.udr.p();
        com.tencent.wechat.aff.udr.q qVar = new com.tencent.wechat.aff.udr.q();
        qVar.c(udrProjectId);
        java.util.LinkedList linkedList = qVar.f217548e;
        if (linkedList != null) {
            linkedList.addAll(arrayList2);
        }
        java.util.LinkedList linkedList2 = pVar.f217545d;
        if (linkedList2 != null) {
            linkedList2.add(qVar);
        }
        ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Ai(pVar, new com.tencent.luggage.sdk.jsapi.component.service.r1(atomicReference, countDownLatch));
        try {
            if (!countDownLatch.await(j18, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                com.tencent.mars.xlog.Log.e("Luggage.NativeDependLibHelper", "download timeout");
                return false;
            }
        } catch (java.lang.InterruptedException e17) {
            com.tencent.mars.xlog.Log.e("Luggage.NativeDependLibHelper", "await got exception: " + e17);
            atomicReference.set(java.lang.Boolean.FALSE);
        }
        java.lang.Object obj = atomicReference.get();
        kotlin.jvm.internal.o.f(obj, "get(...)");
        return ((java.lang.Boolean) obj).booleanValue();
    }

    public final boolean b(java.lang.String libName, long j17, java.lang.String udrProjectId) {
        kotlin.jvm.internal.o.g(libName, "libName");
        kotlin.jvm.internal.o.g(udrProjectId, "udrProjectId");
        java.util.Map map = com.tencent.luggage.sdk.jsapi.component.service.q1.f47521a;
        java.util.Map map2 = com.tencent.luggage.sdk.jsapi.component.service.q1.f47521a;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : map2.entrySet()) {
            if (kotlin.jvm.internal.o.b(((com.tencent.luggage.sdk.jsapi.component.service.u1) entry.getValue()).f47552a, libName)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(linkedHashMap.size());
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Long.valueOf(1 << ((java.lang.Number) ((java.util.Map.Entry) it.next()).getKey()).intValue()));
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!arrayList.isEmpty()) {
            return a(((java.lang.Number) arrayList.get(0)).longValue(), j17, udrProjectId);
        }
        com.tencent.mars.xlog.Log.e("Luggage.NativeDependLibHelper", "haven't match any lib for this libName: ".concat(libName));
        return false;
    }
}
