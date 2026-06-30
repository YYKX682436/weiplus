package t81;

/* loaded from: classes4.dex */
public class f extends dm.p9 implements qj1.d {

    /* renamed from: x, reason: collision with root package name */
    public static final java.lang.String[] f497891x;

    /* renamed from: y, reason: collision with root package name */
    public static final l75.e0 f497892y;

    static {
        java.lang.String[] strArr = {"appId", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811};
        f497891x = strArr;
        f497892y = dm.p9.m125400x3593deb(t81.f.class);
        java.lang.String str = " PRIMARY KEY ( ";
        for (java.lang.String str2 : strArr) {
            str = str + ", " + str2;
        }
        java.lang.String str3 = str.replaceFirst(",", "") + " )";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        l75.e0 e0Var = f497892y;
        sb6.append(e0Var.f398489e);
        sb6.append(",");
        sb6.append(str3);
        e0Var.f398489e = sb6.toString();
    }

    @Override // dm.p9, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f497892y;
    }

    @Override // qj1.d
    /* renamed from: getKeys */
    public java.lang.String[] mo49271xfb81966a() {
        return f497891x;
    }
}
