package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public class dg implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f162289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162290e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yc1.q f162291f;

    public dg(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.eg egVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str, yc1.q qVar) {
        this.f162289d = lVar;
        this.f162290e = str;
        this.f162291f = qVar;
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        if (bVar == u81.b.SUSPEND || bVar == u81.b.DESTROYED) {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = uh1.t0.f509437b;
            mf1.i a17 = uh1.s0.f509434a.a(str);
            if (a17 == null) {
                return;
            }
            java.lang.String str2 = this.f162290e;
            a17.f(a17.a(str2));
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, "interrupted");
            hashMap.put("socketTaskId", str2);
            hashMap.put("state", "close");
            java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
            yc1.p pVar = new yc1.p();
            pVar.p(this.f162289d);
            pVar.r(jSONObject);
            yc1.q qVar = this.f162291f;
            pVar.n(qVar.f542294g.a(str2));
            qVar.f542294g.b(str2);
        }
    }
}
