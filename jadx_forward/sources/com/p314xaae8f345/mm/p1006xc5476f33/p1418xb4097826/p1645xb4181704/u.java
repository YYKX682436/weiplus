package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes10.dex */
public final class u implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 f211951a;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 o0Var) {
        this.f211951a = o0Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        java.lang.String b17;
        com.p314xaae8f345.mm.p944x882e457a.f fVar2 = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", "loadMoreData resp null");
            return new java.util.ArrayList();
        }
        if (fVar2.f152148a != 0 || fVar2.f152149b != 0 || (fVar = fVar2.f152151d) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", "loadMoreData: it.errType:" + fVar2.f152148a + "t.errCode :" + fVar2.f152149b + ' ');
            return new java.util.ArrayList();
        }
        this.f211951a.l(((r45.z03) fVar).f473101g == 1);
        this.f211951a.f211866r = ((r45.z03) fVar2.f152151d).f473102h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadMoreData after lastBuffer ");
        if (this.f211951a.f211866r == null) {
            b17 = "null";
        } else {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f211951a.f211866r;
            b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(gVar != null ? gVar.g() : null);
        }
        sb6.append(b17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", sb6.toString());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 o0Var = this.f211951a;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87> comment_info = ((r45.z03) fVar2.f152151d).f473098d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(comment_info, "comment_info");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(comment_info, 10));
        for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87 : comment_info) {
            hv2.b bVar = hv2.b.f366819a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19781xd1c47b87);
            if (o0Var.f211861m == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
                throw null;
            }
            arrayList2.add(bVar.a(c19781xd1c47b87, r6.f376656f));
        }
        arrayList.addAll(arrayList2);
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0.a(this.f211951a, arrayList);
    }
}
