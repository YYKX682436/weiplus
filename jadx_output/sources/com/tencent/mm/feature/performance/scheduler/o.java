package com.tencent.mm.feature.performance.scheduler;

/* loaded from: classes9.dex */
public final class o extends ph.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.performance.scheduler.q f67704b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.feature.performance.scheduler.q qVar) {
        super(true);
        this.f67704b = qVar;
    }

    @Override // ph.f, ph.g
    public boolean g(ph.c batteryState, boolean z17) {
        kotlin.jvm.internal.o.g(batteryState, "batteryState");
        java.lang.String str = z17 ? "android.intent.action.ACTION_POWER_CONNECTED" : "android.intent.action.ACTION_POWER_DISCONNECTED";
        com.tencent.mm.feature.performance.scheduler.q qVar = this.f67704b;
        java.util.ArrayList arrayList = com.tencent.mm.feature.performance.scheduler.r.f67708g;
        qVar.getClass();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            java.lang.Long valueOf = java.lang.Long.valueOf(((com.tencent.mm.feature.performance.scheduler.r) next).f67710d);
            java.lang.Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new java.util.ArrayList();
                linkedHashMap.put(valueOf, obj);
            }
            ((java.util.List) obj).add(next);
        }
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            for (com.tencent.mm.feature.performance.scheduler.r rVar : (java.lang.Iterable) entry.getValue()) {
                wu5.c cVar = rVar.f67712f;
                if (cVar != null) {
                    cVar.cancel(true);
                }
                ku5.u0 u0Var = ku5.t0.f312615d;
                com.tencent.mm.feature.performance.scheduler.p pVar = new com.tencent.mm.feature.performance.scheduler.p(rVar, z17, str);
                long longValue = z17 ? ((java.lang.Number) entry.getKey()).longValue() : 0L;
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                rVar.f67712f = t0Var.w(pVar, longValue, null);
            }
        }
        com.tencent.mm.feature.performance.scheduler.d.a(str);
        return !this.f354263a;
    }
}
