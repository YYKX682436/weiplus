package cu2;

/* loaded from: classes2.dex */
public final class n extends l75.n0 {

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f303954n = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80.P, "FinderDraftItem")};

    /* renamed from: o, reason: collision with root package name */
    public static final int f303955o = 1;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f303956d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f303957e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f303958f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f303959g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f303960h;

    /* renamed from: i, reason: collision with root package name */
    public final l75.k0 f303961i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f303962m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(l75.k0 _db) {
        super(_db, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80.P, "FinderDraftItem", dm.d4.f317873u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(_db, "_db");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.w80 w80Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80.N;
        this.f303956d = "FinderDraftItem";
        this.f303961i = _db;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.kj0 kj0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.lj0.f208676a;
        java.util.ArrayList b17 = kj0Var.b(kz5.c0.i(1, 2, 4));
        this.f303962m = b17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.clear();
        java.util.Iterator it = b17.iterator();
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next();
            if ((num.intValue() & 1) != 0 && (num.intValue() & 2) == 0 && (num.intValue() & 4) == 0) {
                arrayList.add(num);
            }
        }
        this.f303958f = kj0Var.a(arrayList, "localFlag");
        arrayList.clear();
        java.util.Iterator it6 = this.f303962m.iterator();
        while (it6.hasNext()) {
            java.lang.Integer num2 = (java.lang.Integer) it6.next();
            if ((num2.intValue() & 1) != 0 || (num2.intValue() & 2) != 0) {
                arrayList.add(num2);
            }
        }
        this.f303959g = kj0Var.a(arrayList, "localFlag");
        this.f303957e = "(markDeleted=0)";
        this.f303960h = "dbversion=" + f303955o;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderDraftStorage", "CONDITION_POST " + this.f303958f + "； NOT_DELETED (markDeleted=0)");
    }

    public static boolean y0(cu2.n nVar, long j17, boolean z17, int i17, java.lang.Object obj) {
        nVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderDraftStorage", "deleteByLocalId " + j17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        sb6.append(j17);
        return nVar.f303961i.mo70514xb06685ab("FinderDraftItem", "localId=?", new java.lang.String[]{sb6.toString()}) > 0;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 D0(long j17) {
        android.database.Cursor f17 = this.f303961i.f("SELECT * FROM FinderDraftItem  WHERE " + this.f303957e + " AND " + this.f303956d + ".localId=" + j17, null, 2);
        if (!f17.moveToFirst()) {
            f17.close();
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80();
        x80Var.mo9015xbf5d97fd(f17);
        f17.close();
        return x80Var;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 J0(long j17) {
        if (j17 == 0) {
            return null;
        }
        android.database.Cursor f17 = this.f303961i.f("SELECT * FROM FinderDraftItem  WHERE " + this.f303956d + ".objectId=" + j17, null, 2);
        if (!f17.moveToFirst()) {
            f17.close();
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80();
        x80Var.mo9015xbf5d97fd(f17);
        f17.close();
        return x80Var;
    }

    public final long L0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 draftItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftItem, "draftItem");
        draftItem.w0();
        if (draftItem.f66234xddef18be == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderDraftStorage", "insertNewDraft but field_finderItem is null");
            return -1L;
        }
        long cj6 = ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).cj();
        draftItem.f66236x88be67a1 = cj6;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderDraftStorage", "new draft rowId " + this.f303961i.l(this.f303956d, dm.i4.f66867x2a5c95c7, draftItem.mo9763xeb27878e()) + ' ' + pm0.b0.g(draftItem) + " localID: " + cj6);
        return cj6;
    }

    public final void P0(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 D0 = D0(j17);
        if (D0 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderDraftStorage", "markDeleted, " + D0.v0());
            D0.f66237x922d48c7 = 1;
            W0(j17, D0);
        }
    }

    public final boolean W0(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 draftItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftItem, "draftItem");
        draftItem.w0();
        android.content.ContentValues mo9763xeb27878e = draftItem.mo9763xeb27878e();
        mo9763xeb27878e.remove("rowid");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        sb6.append(j17);
        return this.f303961i.p("FinderDraftItem", mo9763xeb27878e, "localId=?", new java.lang.String[]{sb6.toString()}) > 0;
    }

    public final boolean z0(long j17) {
        if (j17 == 0) {
            return true;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        sb6.append(j17);
        return this.f303961i.mo70514xb06685ab("FinderDraftItem", "objectId=?", new java.lang.String[]{sb6.toString()}) > 0;
    }
}
