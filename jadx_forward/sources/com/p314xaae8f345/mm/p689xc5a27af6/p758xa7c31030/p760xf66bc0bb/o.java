package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb;

/* loaded from: classes9.dex */
public final class o extends ph.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.q f149237b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.q qVar) {
        super(true);
        this.f149237b = qVar;
    }

    @Override // ph.f, ph.g
    public boolean g(ph.c batteryState, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(batteryState, "batteryState");
        java.lang.String str = z17 ? "android.intent.action.ACTION_POWER_CONNECTED" : "android.intent.action.ACTION_POWER_DISCONNECTED";
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.q qVar = this.f149237b;
        java.util.ArrayList arrayList = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.r.f149241g;
        qVar.getClass();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            java.lang.Long valueOf = java.lang.Long.valueOf(((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.r) next).f149243d);
            java.lang.Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new java.util.ArrayList();
                linkedHashMap.put(valueOf, obj);
            }
            ((java.util.List) obj).add(next);
        }
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            for (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.r rVar : (java.lang.Iterable) entry.getValue()) {
                wu5.c cVar = rVar.f149245f;
                if (cVar != null) {
                    cVar.cancel(true);
                }
                ku5.u0 u0Var = ku5.t0.f394148d;
                com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.p pVar = new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.p(rVar, z17, str);
                long longValue = z17 ? ((java.lang.Number) entry.getKey()).longValue() : 0L;
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                rVar.f149245f = t0Var.w(pVar, longValue, null);
            }
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.d.a(str);
        return !this.f435796a;
    }
}
