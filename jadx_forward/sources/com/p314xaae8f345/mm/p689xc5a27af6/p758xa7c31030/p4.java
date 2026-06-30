package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030;

/* loaded from: classes12.dex */
public final class p4 implements uq3.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f149162a;

    public p4(java.lang.String str) {
        this.f149162a = str;
    }

    public void a(java.lang.Object any) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(any, "any");
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.l3 l3Var = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.r4.f149191h;
        java.util.Map a17 = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.l3.a(l3Var);
        java.lang.String str = this.f149162a;
        synchronized (a17) {
            long longValue = any instanceof java.lang.Number ? ((java.lang.Number) any).longValue() : any.hashCode();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.FeatureService", "leakInspect release: " + longValue + ", type=" + any.getClass().getName());
            java.util.Map map = (java.util.Map) com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.l3.a(l3Var).get(str);
            if (map != null) {
            }
        }
    }

    public uq3.e b(java.lang.Object any) {
        uq3.e eVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(any, "any");
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.l3 l3Var = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.r4.f149191h;
        java.util.Map a17 = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.l3.a(l3Var);
        java.lang.String str = this.f149162a;
        synchronized (a17) {
            long longValue = any instanceof java.lang.Number ? ((java.lang.Number) any).longValue() : any.hashCode();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.FeatureService", "leakInspect track: " + longValue + ", type=" + any.getClass().getName());
            java.util.Map a18 = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.l3.a(l3Var);
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
