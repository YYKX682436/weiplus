package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes4.dex */
public final class ab0 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f207929e = {l75.n0.m145250x3fdc6f77(so2.i4.f491955p, "FinderOrAliasDeletingInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f207930d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab0(l75.k0 db6) {
        super(db6, so2.i4.f491955p, "FinderOrAliasDeletingInfo", dm.y4.f322727g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = so2.i4.f491955p;
        this.f207930d = db6;
    }

    public final java.util.LinkedList y0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderOrAliasDeletingInfoStorage", "getAllDeletingInfo");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        android.database.Cursor B = this.f207930d.B("select * , rowid from FinderOrAliasDeletingInfo", null);
        while (B.moveToNext()) {
            try {
                so2.i4 i4Var = new so2.i4();
                i4Var.mo9015xbf5d97fd(B);
                linkedList.add(i4Var);
            } finally {
            }
        }
        vz5.b.a(B, null);
        return linkedList;
    }
}
