package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes10.dex */
public final class a90 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.a90 f207926a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.a90();

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 a(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 b17 = b(j17);
        if (b17 != null && b17.f66238x2327e25f != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderDraftLogic", "deleteRemoteDraft localId:" + j17 + ", objectId:" + b17.f66238x2327e25f);
            new db2.c0(b17.f66238x2327e25f, b17.t0().m59299x6bf53a6c()).l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y80(b17, j17));
        }
        return b17;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 b(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderDraftLogic", "deleteLocalDraft localId:" + j17);
        cu2.n Oj = ((c61.l7) i95.n0.c(c61.l7.class)).Oj();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var = null;
        android.database.Cursor f17 = Oj.f303961i.f("SELECT * FROM FinderDraftItem  WHERE " + Oj.f303956d + ".localId=" + j17, null, 2);
        if (f17.moveToFirst()) {
            x80Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80();
            x80Var.mo9015xbf5d97fd(f17);
            f17.close();
        } else {
            f17.close();
        }
        cu2.n.y0(((c61.l7) i95.n0.c(c61.l7.class)).Oj(), j17, false, 2, null);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5464x5322afbe c5464x5322afbe = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5464x5322afbe();
        am.ab abVar = c5464x5322afbe.f135803g;
        abVar.f87677a = 110;
        abVar.f87678b = j17;
        c5464x5322afbe.e();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5463x73bc5a05 c5463x73bc5a05 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5463x73bc5a05();
        am.za zaVar = c5463x73bc5a05.f135802g;
        zaVar.f90082a = j17;
        zaVar.f90083b = 2;
        c5463x73bc5a05.e();
        return x80Var;
    }
}
