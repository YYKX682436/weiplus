package com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d;

/* loaded from: classes12.dex */
public class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f178124d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f178125e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 f178126f;

    public l1(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e1, java.lang.String str, java.lang.String str2) {
        this.f178126f = abstractActivityC13156x6363e8e1;
        this.f178124d = str;
        this.f178125e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f178124d;
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(str);
        ix1.b bVar = new ix1.b();
        java.lang.String str2 = this.f178125e;
        bVar.f376872s = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) ? r6Var.m82467xfb82e301() : str2;
        bVar.f376873t = hx1.b.d((float) r6Var.C());
        bVar.f376856l = nx1.d.q().k();
        bVar.f376860p = 5;
        bVar.f376861q = true;
        bVar.f376874u = o35.a.f(str, str2);
        bVar.f376859o = r6Var.C();
        bVar.f376844a = hx1.b.a(bVar.toString(), 18);
        r45.gp0 gp0Var = new r45.gp0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e1 = this.f178126f;
        abstractActivityC13156x6363e8e1.f178049z = gp0Var;
        abstractActivityC13156x6363e8e1.f178049z.h0(8);
        abstractActivityC13156x6363e8e1.f178049z.e0(bVar.f376844a);
        abstractActivityC13156x6363e8e1.f178049z.i0(bVar.f376874u);
        r45.gp0 gp0Var2 = abstractActivityC13156x6363e8e1.f178049z;
        bVar.f376858n = gp0Var2;
        bVar.f376862r = hx1.b.c(gp0Var2);
        nx1.d q17 = nx1.d.q();
        q17.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(bVar);
        if (q17.e(arrayList)) {
            abstractActivityC13156x6363e8e1.f7();
        } else {
            com.p314xaae8f345.mm.vfs.w6.c(str, bVar.f376862r);
            nx1.d.q().r(bVar, abstractActivityC13156x6363e8e1.f178036m.c(), true, true, false, true, false);
        }
        abstractActivityC13156x6363e8e1.k7(true, 100L);
        abstractActivityC13156x6363e8e1.j7(1, 0L);
    }
}
