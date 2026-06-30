package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs;

/* loaded from: classes7.dex */
public class e1 implements lk1.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.j1 f162942d;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.j1 j1Var) {
        this.f162942d = j1Var;
    }

    @Override // lk1.b
    public void j(int i17, java.lang.String str, lk1.a aVar) {
        if (i17 == 0) {
            this.f162942d.f162967g.j(i17, str, aVar);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.d dVar = this.f162942d.f162968h;
        dVar.getClass();
        java.util.HashMap hashMap = new java.util.HashMap(2);
        hashMap.put("errCode", java.lang.Integer.valueOf(i17));
        hashMap.put("errStr", str);
        synchronized (dVar) {
            dVar.p(dVar.f162931i);
            dVar.t(hashMap);
            dVar.m();
        }
    }
}
