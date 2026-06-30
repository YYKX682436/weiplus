package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb;

/* loaded from: classes9.dex */
public final class x {
    public x(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static final void a(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.x xVar, java.util.ArrayList arrayList, boolean z17, java.lang.String str) {
        xVar.getClass();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj : arrayList) {
            java.lang.Long valueOf = java.lang.Long.valueOf(((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.y) obj).f149256e);
            java.lang.Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new java.util.ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((java.util.List) obj2).add(obj);
        }
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            for (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.y yVar : (java.lang.Iterable) entry.getValue()) {
                wu5.c cVar = yVar.f149258g;
                if (cVar != null) {
                    cVar.cancel(true);
                }
                ku5.u0 u0Var = ku5.t0.f394148d;
                com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.w wVar = new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.w(yVar, z17, str);
                long longValue = yVar.f149255d ^ z17 ? ((java.lang.Number) entry.getKey()).longValue() : 0L;
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                yVar.f149258g = t0Var.w(wVar, longValue, null);
            }
        }
    }
}
