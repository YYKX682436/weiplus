package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes8.dex */
public final class u90 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f209657e = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t90.f209604x, "FinderLocalOperation")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f209658d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u90(l75.k0 db6) {
        super(db6, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t90.f209604x, "FinderLocalOperation", dm.u4.f321818n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t90.f209604x;
        this.f209658d = db6;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: insert */
    public boolean mo880xb970c2b9(l75.f0 f0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t90 item = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t90) f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        boolean mo880xb970c2b9 = super.mo880xb970c2b9(item);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLocalOperationStorage", "insert " + item.f68554x88be67a1 + ", ret:" + mo880xb970c2b9);
        return mo880xb970c2b9;
    }

    public final java.util.List y0() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor B = this.f209658d.B("select * from FinderLocalOperation", null);
        if (B != null) {
            while (B.moveToNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t90 t90Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t90();
                t90Var.mo9015xbf5d97fd(B);
                arrayList.add(t90Var);
            }
            B.close();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLocalOperationStorage", "getAllData size:" + arrayList.size());
        return arrayList;
    }
}
