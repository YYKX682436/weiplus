package ab4;

/* loaded from: classes4.dex */
public class x0 extends ab4.d0 {
    public float G;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f84440J;
    public int K;
    public int L;
    public java.lang.String F = "";
    public java.lang.String H = "";
    public java.lang.String M = "";
    public final java.util.List N = new java.util.ArrayList();

    /* renamed from: equals */
    public boolean m1029xb2c87fbf(java.lang.Object obj) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdlandingRadarChartInfo");
        boolean z17 = true;
        if (obj == this) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdlandingRadarChartInfo");
            return true;
        }
        if (!(obj instanceof ab4.x0)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdlandingRadarChartInfo");
            return false;
        }
        ab4.x0 x0Var = (ab4.x0) obj;
        java.lang.String str2 = x0Var.F;
        if (str2 != null ? str2.equals(this.F) : this.F == null) {
            if (x0Var.G == this.G && ((str = x0Var.H) != null ? str.equals(this.H) : this.H == null) && x0Var.I == this.I && x0Var.f84440J == this.f84440J && x0Var.K == this.K && x0Var.L == this.L) {
                java.util.List list = x0Var.N;
                java.util.List list2 = this.N;
                if (list != null ? ((java.util.ArrayList) list).equals(list2) : list2 == null) {
                    java.lang.String str3 = x0Var.M;
                    if (str3 != null) {
                    }
                }
            }
        }
        z17 = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdlandingRadarChartInfo");
        return z17;
    }

    /* renamed from: hashCode */
    public int m1030x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdlandingRadarChartInfo");
        int hashCode = super.hashCode();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdlandingRadarChartInfo");
        return hashCode;
    }
}
