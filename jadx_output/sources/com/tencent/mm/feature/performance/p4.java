package com.tencent.mm.feature.performance;

/* loaded from: classes12.dex */
public final class p4 implements uq3.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f67629a;

    public p4(java.lang.String str) {
        this.f67629a = str;
    }

    public void a(java.lang.Object any) {
        kotlin.jvm.internal.o.g(any, "any");
        com.tencent.mm.feature.performance.l3 l3Var = com.tencent.mm.feature.performance.r4.f67658h;
        java.util.Map a17 = com.tencent.mm.feature.performance.l3.a(l3Var);
        java.lang.String str = this.f67629a;
        synchronized (a17) {
            long longValue = any instanceof java.lang.Number ? ((java.lang.Number) any).longValue() : any.hashCode();
            com.tencent.mars.xlog.Log.w("MicroMsg.proc.FeatureService", "leakInspect release: " + longValue + ", type=" + any.getClass().getName());
            java.util.Map map = (java.util.Map) com.tencent.mm.feature.performance.l3.a(l3Var).get(str);
            if (map != null) {
            }
        }
    }

    public uq3.e b(java.lang.Object any) {
        uq3.e eVar;
        kotlin.jvm.internal.o.g(any, "any");
        com.tencent.mm.feature.performance.l3 l3Var = com.tencent.mm.feature.performance.r4.f67658h;
        java.util.Map a17 = com.tencent.mm.feature.performance.l3.a(l3Var);
        java.lang.String str = this.f67629a;
        synchronized (a17) {
            long longValue = any instanceof java.lang.Number ? ((java.lang.Number) any).longValue() : any.hashCode();
            com.tencent.mars.xlog.Log.w("MicroMsg.proc.FeatureService", "leakInspect track: " + longValue + ", type=" + any.getClass().getName());
            java.util.Map a18 = com.tencent.mm.feature.performance.l3.a(l3Var);
            java.lang.Object obj = a18.get(str);
            if (obj == null) {
                obj = new java.util.LinkedHashMap();
                a18.put(str, obj);
            }
            eVar = new uq3.e(longValue, any);
            ((java.util.Map) obj).put(java.lang.Long.valueOf(longValue), eVar);
        }
        return eVar;
    }
}
