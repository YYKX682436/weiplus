package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes7.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.v f158107d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f158108e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f158109f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.r f158110g;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.v vVar, java.util.List list, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.r rVar) {
        this.f158107d = vVar;
        this.f158108e = list;
        this.f158109f = z17;
        this.f158110g = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List xi6 = this.f158107d.xi(Integer.MAX_VALUE, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.y5.DESC);
        if (xi6 == null) {
            xi6 = kz5.p0.f395529d;
        }
        java.util.List list = this.f158108e;
        boolean z17 = this.f158109f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.v vVar = this.f158107d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.r rVar = this.f158110g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[collection] reorderWithCallback, before calculateDiff oldList.size=");
        sb6.append(xi6.size());
        sb6.append(" reorderList.size= ");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
        sb6.append(list.size());
        sb6.append(' ');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCollectionStorageExport[collection]", sb6.toString());
        if (z17 && xi6.size() != list.size()) {
            if (rVar != null) {
                rVar.c();
                return;
            }
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.c0 a17 = p012xc85e97e9.p103xe821e364.p104xd1075a44.h0.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.o3(xi6, list), true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCollectionStorageExport[collection]", "[collection] reorderWithCallback, after calculateDiff oldList.size=" + xi6.size() + " reorderList.size= " + list.size() + ' ');
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l.class);
        java.util.List S0 = kz5.n0.S0(xi6);
        java.util.List S02 = kz5.n0.S0(list);
        lVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(S0);
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f(0);
        lVar.m134976x2690a4ac();
        synchronized (lVar.f158033d) {
            a17.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.h(c19767x257d7f, S0, S02, rVar, lVar, arrayList));
        }
        boolean z18 = c19767x257d7f.f38864x6ac9171 > 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCollectionStorageExport[collection]", "[collection] reorderWithCallback, changed = " + z18);
        if (z18) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2.class)).n0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4.class, list, null);
        }
        vVar.f158117d.set(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCollectionStorageExport[collection]", "[collection] reorderWithCallback, before run callback");
        if (rVar != null) {
            rVar.c();
        }
    }
}
