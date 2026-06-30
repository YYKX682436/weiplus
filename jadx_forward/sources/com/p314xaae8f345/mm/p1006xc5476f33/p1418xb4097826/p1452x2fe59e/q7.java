package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class q7 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f8 f190333a;

    public q7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f8 f8Var) {
        this.f190333a = f8Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        java.lang.String b17;
        com.p314xaae8f345.mm.p944x882e457a.f fVar2 = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FavListDrawerPresenter", "loadMoreData resp null");
            return new java.util.LinkedList();
        }
        if (fVar2.f152148a != 0 || fVar2.f152149b != 0 || (fVar = fVar2.f152151d) == null) {
            return new java.util.LinkedList();
        }
        this.f190333a.f(((r45.b61) fVar).f452075f == 1);
        this.f190333a.f188245f = ((r45.b61) fVar2.f152151d).f452074e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadMoreData after lastBuffer ");
        if (this.f190333a.f188245f == null) {
            b17 = "null";
        } else {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f190333a.f188245f;
            b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(gVar != null ? gVar.g() : null);
        }
        sb6.append(b17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FavListDrawerPresenter", sb6.toString());
        return ((r45.b61) fVar2.f152151d).f452073d;
    }
}
