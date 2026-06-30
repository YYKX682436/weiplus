package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class v7 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f8 f192411a;

    public v7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f8 f8Var) {
        this.f192411a = f8Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        java.lang.String b17;
        com.p314xaae8f345.mm.p944x882e457a.f fVar2 = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FavListDrawerPresenter", "refreshData resp null");
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.m7(false, null, null, null);
        }
        if (fVar2.f152148a != 0 || fVar2.f152149b != 0 || (fVar = fVar2.f152151d) == null) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.m7(false, null, null, null);
        }
        this.f192411a.f188245f = ((r45.b61) fVar).f452074e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f8 f8Var = this.f192411a;
        r45.b61 b61Var = (r45.b61) fVar2.f152151d;
        f8Var.f188246g = b61Var.f452076g;
        f8Var.f188247h = b61Var.f452078i;
        f8Var.f188248i = b61Var.f452079m;
        f8Var.f188249m = b61Var.f452081o;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refreshData: lastBuffer=");
        if (this.f192411a.f188245f == null) {
            b17 = "null";
        } else {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f192411a.f188245f;
            b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(gVar != null ? gVar.g() : null);
        }
        sb6.append(b17);
        sb6.append(", totalCount=");
        sb6.append(this.f192411a.f188246g);
        sb6.append(", snsFavCount=");
        sb6.append(this.f192411a.f188247h);
        sb6.append(", commentFavCount: ");
        sb6.append(this.f192411a.f188248i);
        sb6.append(", fromMySnsFingerLikeCount: ");
        sb6.append(this.f192411a.f188249m);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FavListDrawerPresenter", sb6.toString());
        this.f192411a.f(((r45.b61) fVar2.f152151d).f452075f == 1);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 g17 = c01.z1.g();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("contact: ");
        sb7.append(g17 == null);
        sb7.append(", canShowLikeEdu:false");
        this.f192411a.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FavListDrawerPresenter", sb7.toString());
        linkedList.addAll(((r45.b61) fVar2.f152151d).f452073d);
        r45.b61 b61Var2 = (r45.b61) fVar2.f152151d;
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.m7(true, linkedList, b61Var2.f452080n, b61Var2.f452082p);
    }
}
