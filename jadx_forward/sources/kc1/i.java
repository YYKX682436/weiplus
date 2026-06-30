package kc1;

/* loaded from: classes14.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kc1.f f387834d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f387835e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f387836f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kc1.j f387837g;

    public i(kc1.j jVar, kc1.f fVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17) {
        this.f387837g = jVar;
        this.f387834d = fVar;
        this.f387835e = e9Var;
        this.f387836f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        kc1.c cVar;
        kc1.f fVar = this.f387834d;
        fVar.getClass();
        com.p314xaae8f345.mm.p2825x7e128009.C22958xbc43cdfb c22958xbc43cdfb = kc1.f.f387825d.f387826a;
        kc1.c cVar2 = kc1.c.ResultOK;
        kc1.c cVar3 = kc1.c.ResultInited;
        if (c22958xbc43cdfb == null) {
            ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
            p05.a3 a3Var = p05.a3.f431972a;
            ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
            p05.e5.a();
            kc1.f.f387825d.f387826a = new com.p314xaae8f345.mm.p2825x7e128009.C22958xbc43cdfb(p05.r3.a(p05.r3.f432207a, null, false, null, 7, null));
            cVar = cVar2;
        } else {
            cVar = cVar3;
        }
        int a17 = fVar.a(cVar);
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put("errCode", java.lang.Integer.valueOf(a17));
        this.f387835e.a(this.f387836f, this.f387837g.p(cVar == cVar2 ? "ok:init ok" : cVar == cVar3 ? "fail: already init" : cVar == kc1.c.ResultInitFail ? "fail:init fail" : "fail:undefine error", hashMap));
    }
}
