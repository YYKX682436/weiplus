package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1;

/* loaded from: classes9.dex */
public class h implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.m f262431a;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.m mVar) {
        this.f262431a = mVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        if (list == null || list.size() <= 0) {
            return null;
        }
        int size = list.size();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.m mVar = this.f262431a;
        mVar.f262460d = linkedList;
        for (int i17 = 0; i17 < size; i17++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) list.get(i17);
            if (c19091x9511676c.v0()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankcardLogoHelper", "ignore balance!!");
            } else {
                mVar.f262460d.add(c19091x9511676c.f69223x58802fcb);
            }
        }
        if (mVar.f262460d.size() <= 0) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankcardLogoHelper", "need fetch bank logo, %s", java.lang.Integer.valueOf(mVar.f262460d.size()));
        km5.b b17 = km5.u.b();
        ss4.f fVar = new ss4.f(mVar.f262460d);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(1650, new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.g(this, b17));
        gm0.j1.i();
        gm0.j1.n().f354821b.g(fVar);
        b17.b();
        return null;
    }
}
