package oy1;

/* loaded from: classes13.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Integer f431445b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.Integer f431446c;

    /* renamed from: d, reason: collision with root package name */
    public static oy1.l f431447d;

    /* renamed from: e, reason: collision with root package name */
    public static oy1.l f431448e;

    /* renamed from: a, reason: collision with root package name */
    public static final oy1.p f431444a = new oy1.p();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Set f431449f = kz5.p1.e("cgi_report_fake_session_out");

    public final int a() {
        if (f431446c == null) {
            f431446c = java.lang.Integer.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sdk_cgi_report_aff_bizid_config, 0));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiReportService", "aff bizId config = [" + f431446c + ']');
        }
        java.lang.Integer num = f431446c;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int b() {
        if (f431445b == null) {
            f431445b = java.lang.Integer.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sdk_cgi_report_open_aff_config, 1));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiReportService", "open aff cgi report = [" + f431445b + ']');
        }
        java.lang.Integer num = f431445b;
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    public final void c(int i17, java.util.List reportInfoList, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportInfoList, "reportInfoList");
        if (b() == 2 || b() == 3) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                oy1.l lVar = f431447d;
                if (lVar != null) {
                    lVar.c(i17, reportInfoList, z17);
                    return;
                }
                return;
            }
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("other_process_add_msg_id", i17);
            bundle.putSerializable("other_process_add_msg", new java.util.ArrayList(reportInfoList));
            bundle.putBoolean("other_process_add_msg_is_collect", z17);
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str, bundle, oy1.o.class, null);
            return;
        }
        int a17 = a();
        boolean z18 = false;
        if (a17 != 0 && ((a17 >> i17) & 1) == 1) {
            z18 = true;
        }
        if (!z18) {
            oy1.q0.f431452d.e(i17, reportInfoList, z17);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiReportService", "bizId=" + i17 + " hit affBizIdConfig, use AffCgiReporter");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            oy1.l lVar2 = f431448e;
            if (lVar2 != null) {
                lVar2.c(i17, reportInfoList, z17);
                return;
            }
            return;
        }
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putInt("other_process_add_msg_id", i17);
        bundle2.putSerializable("other_process_add_msg", new java.util.ArrayList(reportInfoList));
        bundle2.putBoolean("other_process_add_msg_is_collect", z17);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str2, bundle2, oy1.o.class, null);
    }
}
