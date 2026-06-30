package ld1;

/* loaded from: classes7.dex */
public class g implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y f399596a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f399597b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f399598c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ld1.h f399599d;

    public g(ld1.h hVar, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar, int i17, java.lang.String str) {
        this.f399599d = hVar;
        this.f399596a = yVar;
        this.f399597b = i17;
        this.f399598c = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.er5 er5Var = (r45.er5) obj;
        if (er5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.JsApiReportPageData", "reportwxaappexpose cgi failed, null response");
            this.f399596a.a(this.f399597b, this.f399599d.o("fail:cgi fail"));
            return null;
        }
        int i17 = er5Var.f76492x92037252.f458492d;
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.JsApiReportPageData", "reportwxaappexpose cgi failed, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), er5Var.f76492x92037252.f458493e);
            this.f399596a.a(this.f399597b, this.f399599d.o("fail:cgi fail"));
            return null;
        }
        java.lang.String str = this.f399598c;
        int i18 = er5Var.f455227d;
        android.util.SparseIntArray sparseIntArray = ld1.d.f399592a;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            android.util.SparseIntArray sparseIntArray2 = ld1.d.f399592a;
            synchronized (sparseIntArray2) {
                sparseIntArray2.put(str.hashCode(), i18);
            }
        }
        this.f399596a.a(this.f399597b, this.f399599d.o("ok"));
        return null;
    }
}
