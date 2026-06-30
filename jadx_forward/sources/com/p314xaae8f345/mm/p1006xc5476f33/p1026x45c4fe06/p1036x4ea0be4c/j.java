package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c;

/* loaded from: classes4.dex */
public class j extends dm.t {

    /* renamed from: z, reason: collision with root package name */
    public static final l75.e0 f158374z;

    static {
        java.lang.String[] strArr = {dm.i4.f66875xa013b0d5, "fetchType"};
        f158374z = dm.t.m125498x3593deb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.j.class);
        java.lang.String str = " PRIMARY KEY ( ";
        for (int i17 = 0; i17 < 2; i17++) {
            str = str + ", " + strArr[i17];
        }
        java.lang.String str2 = str.replaceFirst(",", "") + " )";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        l75.e0 e0Var = f158374z;
        sb6.append(e0Var.f398489e);
        sb6.append(",");
        sb6.append(str2);
        e0Var.f398489e = sb6.toString();
    }

    @Override // dm.t, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f158374z;
    }
}
