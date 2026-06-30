package mv2;

/* loaded from: classes10.dex */
public final class o implements mv2.n {
    @Override // mv2.n
    public java.util.List a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((c61.l7) i95.n0.c(c61.l7.class)).Pj().D0().iterator();
        while (it.hasNext()) {
            mv2.q.b(mv2.q.f413151a, (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it.next(), arrayList);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.f90 Pj = ((c61.l7) i95.n0.c(c61.l7.class)).Pj();
        Pj.getClass();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        android.database.Cursor f17 = Pj.f208293f.f("SELECT * FROM FinderFeedItem  WHERE localFlag IN (64);", null, 2);
        while (f17.moveToNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079();
            c14994x9b99c079.mo9015xbf5d97fd(f17);
            arrayList2.add(c14994x9b99c079);
        }
        f17.close();
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            mv2.q.b(mv2.q.f413151a, (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it6.next(), arrayList);
        }
        return arrayList;
    }

    @Override // mv2.n
    /* renamed from: name */
    public java.lang.String mo148464x337a8b() {
        return "unsentFileClaimer";
    }
}
