package av4;

/* loaded from: classes15.dex */
public final class p0 implements fe0.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f14322a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f14323b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f14324c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f14325d;

    public p0(nw4.k kVar, nw4.y2 y2Var, java.lang.String str, java.lang.String str2) {
        this.f14322a = kVar;
        this.f14323b = y2Var;
        this.f14324c = str;
        this.f14325d = str2;
    }

    public final void a(java.lang.String str, boolean z17, java.lang.String str2, android.os.Bundle bundle) {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.StartAdQRScanJSApi", "onClickDirect qr onFinish, isSuccess is " + z17 + ", errMsg is " + str2 + ", url is " + str);
            nw4.y2 y2Var = this.f14323b;
            nw4.k kVar = this.f14322a;
            if (z17) {
                kVar.f340863d.e(y2Var.f341013c, "startAdQRScan:ok", null);
            } else {
                if (com.tencent.mm.sdk.platformtools.t8.D0(str2, "inValid QRCode")) {
                    kVar.f340863d.e(y2Var.f341013c, "startAdQRScan:failed. QR Type error", null);
                    return;
                }
                ((ee0.l) ((fe0.r3) i95.n0.c(fe0.r3.class))).wi(this.f14324c, 3, this.f14325d, bundle != null ? bundle.getInt("qr_url_type_key") : 0);
                kVar.f340863d.e(y2Var.f341013c, "startAdQRScan:failed", null);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.StartAdQRScanJSApi", "onFinish, exp is " + th6);
        }
    }
}
