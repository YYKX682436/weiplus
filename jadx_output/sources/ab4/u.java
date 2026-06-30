package ab4;

/* loaded from: classes4.dex */
public class u extends ab4.d0 {
    public java.lang.String F;
    public java.lang.String G;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public float f2893J;
    public float K;
    public int L;
    public java.lang.String M;
    public java.lang.String N;
    public java.lang.String P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public java.lang.String U = "";
    public java.lang.String V = "";
    public java.lang.String W = "";
    public ab4.d0 X;
    public float Y;
    public java.lang.String Z;

    /* renamed from: l1, reason: collision with root package name */
    public java.lang.String f2894l1;

    /* renamed from: p0, reason: collision with root package name */
    public float f2895p0;

    /* renamed from: p1, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f2896p1;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String f2897x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f2898x1;

    /* renamed from: y0, reason: collision with root package name */
    public java.lang.String f2899y0;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f2900y1;

    @Override // ab4.d0
    public java.util.List a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAllChildrenCompInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageCompentBtnInfo");
        java.util.ArrayList arrayList = new java.util.ArrayList(super.a());
        ab4.d0 d0Var = this.X;
        if (d0Var != null) {
            arrayList.add(d0Var);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAllChildrenCompInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageCompentBtnInfo");
        return arrayList;
    }
}
