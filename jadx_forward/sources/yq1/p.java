package yq1;

/* loaded from: classes7.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f545982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f545983e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f545984f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f545985g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f545986h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yq1.z f545987i;

    public p(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.Object[] objArr, yq1.z zVar) {
        this.f545982d = str;
        this.f545983e = i17;
        this.f545984f = i18;
        this.f545985g = str2;
        this.f545986h = objArr;
        this.f545987i = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            java.lang.String str = this.f545982d;
            int i17 = this.f545983e;
            int i18 = this.f545984f;
            java.lang.String str2 = this.f545985g;
            java.lang.Object[] objArr = this.f545986h;
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.b(str, i17, i18, str2, java.util.Arrays.copyOf(objArr, objArr.length));
        } catch (java.lang.Exception e17) {
            this.f545987i.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BrandServiceImpl", "addToPreload ex %s", e17.getMessage());
        }
    }
}
