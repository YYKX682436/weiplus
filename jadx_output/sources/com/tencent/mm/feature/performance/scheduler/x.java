package com.tencent.mm.feature.performance.scheduler;

/* loaded from: classes9.dex */
public final class x {
    public x(kotlin.jvm.internal.i iVar) {
    }

    public static final void a(com.tencent.mm.feature.performance.scheduler.x xVar, java.util.ArrayList arrayList, boolean z17, java.lang.String str) {
        xVar.getClass();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj : arrayList) {
            java.lang.Long valueOf = java.lang.Long.valueOf(((com.tencent.mm.feature.performance.scheduler.y) obj).f67723e);
            java.lang.Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new java.util.ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((java.util.List) obj2).add(obj);
        }
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            for (com.tencent.mm.feature.performance.scheduler.y yVar : (java.lang.Iterable) entry.getValue()) {
                wu5.c cVar = yVar.f67725g;
                if (cVar != null) {
                    cVar.cancel(true);
                }
                ku5.u0 u0Var = ku5.t0.f312615d;
                com.tencent.mm.feature.performance.scheduler.w wVar = new com.tencent.mm.feature.performance.scheduler.w(yVar, z17, str);
                long longValue = yVar.f67722d ^ z17 ? ((java.lang.Number) entry.getKey()).longValue() : 0L;
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                yVar.f67725g = t0Var.w(wVar, longValue, null);
            }
        }
    }
}
