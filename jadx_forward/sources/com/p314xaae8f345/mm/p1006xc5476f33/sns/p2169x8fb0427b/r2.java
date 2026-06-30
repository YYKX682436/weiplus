package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* loaded from: classes4.dex */
public class r2 extends l75.n0 implements p94.q0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f247654e = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.q2.f247639t, "snsTagInfo2")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f247655d;

    public r2(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.q2.f247639t, "snsTagInfo2", null);
        this.f247655d = k0Var;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.q2 D0(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBySnsTagId", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSelectBegin", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSelectBegin", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        android.database.Cursor f17 = this.f247655d.f("select *, rowid from snsTagInfo2 where tagId = ? ", new java.lang.String[]{"" + j17}, 2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.q2 q2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.q2();
        if (f17.moveToFirst()) {
            q2Var.mo9015xbf5d97fd(f17);
        }
        f17.close();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBySnsTagId", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        return q2Var;
    }

    public android.database.Cursor J0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCursor", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSelectBegin", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSelectBegin", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        android.database.Cursor B = this.f247655d.B("select *, rowid from snsTagInfo2 where tagId > 5", null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCursor", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        return B;
    }

    public java.util.List L0(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMembersBySnsTagId", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.q2 D0 = D0(j17);
        java.lang.String str = D0.f69152x693306bd;
        if (str == null || str.equals("")) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMembersBySnsTagId", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
            return arrayList;
        }
        java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(D0.f69152x693306bd.split(","));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMembersBySnsTagId", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        return P1;
    }

    public boolean P0(java.lang.String str, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isInTagList", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.q2 D0 = D0(j17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(D0.f69152x693306bd)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isInTagList", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
            return false;
        }
        boolean contains = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(D0.f69152x693306bd.split(",")).contains(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isInTagList", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        return contains;
    }

    public boolean W0() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSnsTagExits", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        android.database.Cursor J0 = J0();
        if (J0 != null) {
            i17 = J0.getCount();
            J0.close();
        } else {
            i17 = 0;
        }
        boolean z17 = i17 > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSnsTagExits", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        return z17;
    }

    public boolean b1(long j17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isTagNameExist", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select tagId, tagName, count, rowid from snsTagInfo2 where tagId > 5 AND  tagName  =\"");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBirefSelect", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBirefSelect", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str);
        sb6.append(str);
        sb6.append("\" AND  tagId != ");
        sb6.append(j17);
        android.database.Cursor f17 = this.f247655d.f(sb6.toString(), null, 2);
        boolean moveToFirst = f17.moveToFirst();
        f17.close();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isTagNameExist", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        return moveToFirst;
    }

    public boolean d1(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.q2 q2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("replace", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        long j17 = q2Var.f69153x29d92ad0;
        if (j17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replace", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isTagIdExist", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSelectBegin", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSelectBegin", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        android.database.Cursor f17 = this.f247655d.f("select *, rowid from snsTagInfo2 where tagId = ? ", new java.lang.String[]{"" + j17}, 2);
        boolean moveToFirst = f17.moveToFirst();
        f17.close();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isTagIdExist", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        if (moveToFirst) {
            super.mo11260x413cb2b4(q2Var);
        } else {
            super.mo880xb970c2b9(q2Var);
        }
        mo142179xf35bbb4(q2Var.f69153x29d92ad0 + "", 0, q2Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replace", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        return true;
    }

    @Override // l75.n0
    /* renamed from: replace */
    public /* bridge */ /* synthetic */ boolean mo11260x413cb2b4(l75.f0 f0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("replace", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        boolean d17 = d1((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.q2) f0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replace", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        return d17;
    }

    public int y0(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("delBySnsTagId", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        int mo70514xb06685ab = this.f247655d.mo70514xb06685ab("snsTagInfo2", " tagId = ? ", new java.lang.String[]{"" + j17});
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("delBySnsTagId", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        return mo70514xb06685ab;
    }

    public java.util.List z0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAllId", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        android.database.Cursor D = this.f247655d.D("snsTagInfo2", new java.lang.String[]{"tagId"}, null, null, null, null, null, 2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (D.moveToNext()) {
            arrayList.add(java.lang.Long.valueOf(D.getLong(0)));
        }
        D.close();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAllId", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
        return arrayList;
    }
}
