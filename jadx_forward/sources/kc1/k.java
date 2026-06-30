package kc1;

/* loaded from: classes14.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kc1.f f387838d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f387839e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f387840f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kc1.l f387841g;

    public k(kc1.l lVar, kc1.f fVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17) {
        this.f387841g = lVar;
        this.f387838d = fVar;
        this.f387839e = e9Var;
        this.f387840f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        kc1.c cVar;
        kc1.f fVar = this.f387838d;
        fVar.f387828c.clear();
        com.p314xaae8f345.mm.p2825x7e128009.C22958xbc43cdfb c22958xbc43cdfb = kc1.f.f387825d.f387826a;
        kc1.c cVar2 = kc1.c.ResultOK;
        kc1.c cVar3 = kc1.c.ResultStopFail;
        if (c22958xbc43cdfb != null) {
            c22958xbc43cdfb.a();
            kc1.f.f387825d.f387826a = null;
            cVar = cVar2;
        } else {
            cVar = cVar3;
        }
        int a17 = fVar.a(cVar);
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put("errCode", java.lang.Integer.valueOf(a17));
        this.f387839e.a(this.f387840f, this.f387841g.p(cVar == cVar2 ? "ok:stop ok" : cVar == cVar3 ? "fail:stop fail" : "fail:undefine error", hashMap));
    }
}
