package df2;

/* loaded from: classes15.dex */
public final class cp extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f311437d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f311438e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp(java.lang.String str, int i17) {
        super(2);
        this.f311437d = str;
        this.f311438e = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String fileName = (java.lang.String) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportAssetsLoad: ");
        sb6.append(fileName);
        sb6.append(", type:");
        sb6.append(intValue);
        sb6.append(", liveId:");
        java.lang.String str = this.f311437d;
        sb6.append(str);
        sb6.append(", mode:");
        int i17 = this.f311438e;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LivePAGReportController", sb6.toString());
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6527x5fbaafa3 c6527x5fbaafa3 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6527x5fbaafa3();
        c6527x5fbaafa3.f138798d = c6527x5fbaafa3.b("PagFileName", fileName, true);
        c6527x5fbaafa3.f138799e = c6527x5fbaafa3.b("LiveId", str, true);
        c6527x5fbaafa3.f138800f = i17;
        c6527x5fbaafa3.f138801g = intValue;
        c6527x5fbaafa3.f138802h = c6527x5fbaafa3.b("ResourceName", fileName, true);
        c6527x5fbaafa3.k();
        return jz5.f0.f384359a;
    }
}
