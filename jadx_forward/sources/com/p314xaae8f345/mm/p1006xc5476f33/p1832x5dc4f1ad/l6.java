package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad;

@j95.b
/* loaded from: classes7.dex */
public final class l6 extends i95.w implements com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.h4 {
    public jc3.v Ai(java.lang.String bizName, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.EnumC16420x48ed1900 type) {
        jc3.v pVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.k6.f229593a[type.ordinal()];
        if (i17 == 1) {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = ee3.q.f333186a;
            java.util.HashMap hashMap = ee3.q.f333188c;
            if (hashMap.containsKey(bizName)) {
                pVar = (ee3.p) hashMap.get(bizName);
                if (pVar == null) {
                    hashMap.remove(bizName);
                    pVar = new ee3.p(bizName);
                    hashMap.put(bizName, pVar);
                }
            } else {
                pVar = new ee3.p(bizName);
                hashMap.put(bizName, pVar);
            }
        } else {
            if (i17 != 2) {
                return null;
            }
            java.util.concurrent.atomic.AtomicInteger atomicInteger2 = ee3.q.f333186a;
            java.util.HashMap hashMap2 = ee3.q.f333189d;
            if (hashMap2.containsKey(bizName)) {
                pVar = (ee3.m) hashMap2.get(bizName);
                if (pVar == null) {
                    hashMap2.remove(bizName);
                    pVar = new ee3.m(bizName);
                    hashMap2.put(bizName, pVar);
                }
            } else {
                pVar = new ee3.m(bizName);
                hashMap2.put(bizName, pVar);
            }
        }
        return pVar;
    }

    public java.lang.String Bi(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.EnumC16420x48ed1900 type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.k6.f229593a[type.ordinal()];
        if (i17 == 1) {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = ee3.q.f333186a;
            return java.lang.String.valueOf(ee3.q.f333186a.incrementAndGet());
        }
        if (i17 != 2) {
            return null;
        }
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = ee3.q.f333186a;
        return java.lang.String.valueOf(ee3.q.f333187b.incrementAndGet());
    }

    public jc3.v wi(java.lang.String bizName, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.EnumC16420x48ed1900 type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.k6.f229593a[type.ordinal()];
        if (i17 == 1) {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = ee3.q.f333186a;
            java.util.HashMap hashMap = ee3.q.f333188c;
            if (hashMap.containsKey(bizName)) {
                return (jc3.v) hashMap.get(bizName);
            }
            return null;
        }
        if (i17 != 2) {
            return null;
        }
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = ee3.q.f333186a;
        java.util.HashMap hashMap2 = ee3.q.f333189d;
        if (hashMap2.containsKey(bizName)) {
            return (jc3.v) hashMap2.get(bizName);
        }
        return null;
    }
}
