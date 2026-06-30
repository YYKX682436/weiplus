package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes4.dex */
public final class z4 extends dm.l2 {

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f166992r;

    /* renamed from: s, reason: collision with root package name */
    public static final l75.e0 f166993s = dm.l2.m125190x3593deb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z4.class);

    static {
        java.lang.String[] strArr = {"appId", "versionType"};
        f166992r = strArr;
        java.lang.String str = " PRIMARY KEY (";
        for (java.lang.String str2 : strArr) {
            str = str + ", " + str2;
        }
        java.lang.String str3 = str.replaceFirst(",", "") + " )";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        l75.e0 e0Var = f166993s;
        sb6.append(e0Var.f398489e);
        sb6.append(",");
        sb6.append(str3);
        e0Var.f398489e = sb6.toString();
    }

    @Override // dm.l2, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f166993s;
    }
}
