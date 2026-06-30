package mv2;

/* loaded from: classes10.dex */
public final class p implements mv2.n {
    @Override // mv2.n
    public java.util.List a() {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        mv2.q.c(mv2.q.f413151a, gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_OPEN_UPLOAD_DRAFT_STRING_SYNC, "").toString(), arrayList);
        cu2.n Oj = ((c61.l7) i95.n0.c(c61.l7.class)).Oj();
        Oj.getClass();
        java.util.ArrayList<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80> arrayList2 = new java.util.ArrayList();
        android.database.Cursor f17 = Oj.f303961i.f("SELECT * FROM FinderDraftItem  WHERE " + Oj.f303957e + " ORDER BY " + Oj.f303956d + ".localId DESC", null, 2);
        while (f17.moveToNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80();
            x80Var.mo9015xbf5d97fd(f17);
            arrayList2.add(x80Var);
        }
        f17.close();
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var2 : arrayList2) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x80Var2.f66241x844f7c1) && ((i17 = x80Var2.f66239xf8be237e) == 1 || i17 == 0)) {
                mv2.q qVar = mv2.q.f413151a;
                java.lang.String field_postIntent = x80Var2.f66241x844f7c1;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_postIntent, "field_postIntent");
                mv2.q.c(qVar, field_postIntent, arrayList);
            }
            mv2.q.b(mv2.q.f413151a, x80Var2.t0(), arrayList);
        }
        return arrayList;
    }

    @Override // mv2.n
    /* renamed from: name */
    public java.lang.String mo148464x337a8b() {
        return "draftFileClaimer";
    }
}
