package av4;

/* loaded from: classes15.dex */
public final class p0 implements fe0.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f95855a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f95856b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f95857c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f95858d;

    public p0(nw4.k kVar, nw4.y2 y2Var, java.lang.String str, java.lang.String str2) {
        this.f95855a = kVar;
        this.f95856b = y2Var;
        this.f95857c = str;
        this.f95858d = str2;
    }

    public final void a(java.lang.String str, boolean z17, java.lang.String str2, android.os.Bundle bundle) {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.StartAdQRScanJSApi", "onClickDirect qr onFinish, isSuccess is " + z17 + ", errMsg is " + str2 + ", url is " + str);
            nw4.y2 y2Var = this.f95856b;
            nw4.k kVar = this.f95855a;
            if (z17) {
                kVar.f422396d.e(y2Var.f422546c, "startAdQRScan:ok", null);
            } else {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str2, "inValid QRCode")) {
                    kVar.f422396d.e(y2Var.f422546c, "startAdQRScan:failed. QR Type error", null);
                    return;
                }
                ((ee0.l) ((fe0.r3) i95.n0.c(fe0.r3.class))).wi(this.f95857c, 3, this.f95858d, bundle != null ? bundle.getInt("qr_url_type_key") : 0);
                kVar.f422396d.e(y2Var.f422546c, "startAdQRScan:failed", null);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.StartAdQRScanJSApi", "onFinish, exp is " + th6);
        }
    }
}
