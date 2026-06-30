package ri1;

/* loaded from: classes4.dex */
public class b extends dm.sc implements qj1.d {
    public static final l75.e0 A = dm.sc.m125496x3593deb(ri1.b.class);
    public static final java.lang.String[] B;

    /* renamed from: z, reason: collision with root package name */
    public static final java.lang.String[] f477556z;

    static {
        java.lang.String[] strArr = {"appId", "commLibVersionId", "appVersionId", "pageURL"};
        f477556z = strArr;
        java.lang.String str = " PRIMARY KEY ( ";
        for (java.lang.String str2 : strArr) {
            str = str + ", " + str2;
        }
        java.lang.String str3 = str.replaceFirst(",", "") + " )";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        l75.e0 e0Var = A;
        sb6.append(e0Var.f398489e);
        sb6.append(",");
        sb6.append(str3);
        e0Var.f398489e = sb6.toString();
        B = new java.lang.String[]{l75.n0.m145250x3fdc6f77(e0Var, "WxaAppWebRenderingCacheAccessStatsTable")};
    }

    @Override // dm.sc, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return A;
    }

    @Override // qj1.d
    /* renamed from: getKeys */
    public java.lang.String[] mo49271xfb81966a() {
        return f477556z;
    }
}
