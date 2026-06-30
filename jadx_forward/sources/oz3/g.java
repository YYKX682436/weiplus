package oz3;

/* loaded from: classes.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final oz3.g f431802d = new oz3.g();

    public g() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17 = false;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_scan_code_enable_ocr_report_for_pay_code, 0) != 1) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        } else {
            z17 = true;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanPayCodeOcrReportReporter", "enablePayCodeOcrReport " + valueOf.booleanValue());
        return valueOf;
    }
}
