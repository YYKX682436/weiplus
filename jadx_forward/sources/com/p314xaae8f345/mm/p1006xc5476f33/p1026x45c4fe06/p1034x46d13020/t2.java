package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes7.dex */
public final class t2 extends dm.h0 {

    /* renamed from: v, reason: collision with root package name */
    public static final java.lang.String[] f158100v;

    /* renamed from: w, reason: collision with root package name */
    public static final l75.e0 f158101w;

    static {
        java.lang.String[] strArr = {dm.i4.f66875xa013b0d5, "versionType"};
        f158100v = strArr;
        f158101w = dm.h0.m125020x3593deb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.t2.class);
        java.lang.String str = " PRIMARY KEY ( ";
        for (java.lang.String str2 : strArr) {
            str = str + ", " + str2;
        }
        java.lang.String str3 = str.replaceFirst(",", "") + " )";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        l75.e0 e0Var = f158101w;
        sb6.append(e0Var.f398489e);
        sb6.append(",");
        sb6.append(str3);
        e0Var.f398489e = sb6.toString();
    }

    @Override // dm.h0, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f158101w;
    }
}
