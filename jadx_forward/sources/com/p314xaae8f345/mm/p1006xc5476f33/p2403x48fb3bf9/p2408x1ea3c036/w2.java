package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* loaded from: classes8.dex */
public class w2 implements td.c {

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 f264190c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.d f264191d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f264192e = new java.util.HashSet();

    public w2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.d dVar) {
        this.f264190c = e0Var;
        this.f264191d = dVar;
    }

    @Override // td.c
    public void a(java.lang.String str, td.e eVar) {
        eVar.a(td.d.PASS);
    }

    @Override // td.c
    public void b(java.lang.String str, td.e eVar) {
        java.util.HashSet hashSet = (java.util.HashSet) this.f264192e;
        boolean contains = hashSet.contains(str);
        td.d dVar = td.d.PASS;
        if (contains) {
            hashSet.remove(str);
            eVar.a(dVar);
            return;
        }
        java.lang.String u17 = this.f264190c.u();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.d dVar2 = this.f264191d;
        dVar2.getClass();
        o45.m b17 = o45.vf.b(str);
        if (!(dVar2.h(u17).d(b17 == null ? -1 : b17.f424511c) == 1)) {
            dVar = td.d.REJECT;
        }
        eVar.a(dVar);
    }
}
