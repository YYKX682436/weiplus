package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes10.dex */
public final class a3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jv2.i f211718a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3 f211719b;

    public a3(jv2.i iVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3 q3Var) {
        this.f211718a = iVar;
        this.f211719b = q3Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.String b17;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        kz5.p0 p0Var = kz5.p0.f395529d;
        if (fVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MusicUni.DrawerPresenter", "loadMoreLevel2Comments resp null");
            return new jz5.l(-2, p0Var);
        }
        if (fVar.f152148a != 0 || fVar.f152149b != 0 || fVar.f152151d == null) {
            return fVar.f152149b == -4032 ? new jz5.l(-1, p0Var) : new jz5.l(0, p0Var);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadMoreLevel2Comments after lastBuffer ");
        jv2.i iVar = this.f211718a;
        if (iVar.f383756d.u0().m76078x44e5026c() == null) {
            b17 = "null";
        } else {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m76078x44e5026c = iVar.f383756d.u0().m76078x44e5026c();
            b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(m76078x44e5026c != null ? m76078x44e5026c.g() : null);
        }
        sb6.append(b17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicUni.DrawerPresenter", sb6.toString());
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87> comment_info = ((r45.z03) fVar.f152151d).f473098d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(comment_info, "comment_info");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(comment_info, 10));
        for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87 : comment_info) {
            hv2.c cVar = hv2.c.f366820a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19781xd1c47b87);
            if (this.f211719b.f211904h == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
                throw null;
            }
            arrayList.add(cVar.b(c19781xd1c47b87, r3.f376663f, iVar.mo2128x1ed62e84()));
        }
        return new jz5.l(0, arrayList);
    }
}
