package b54;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b54.b f18095a = new b54.b();

    public final void a(int i17, long j17, java.lang.String str, java.lang.String str2, yz5.l lVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestAppointment", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.AppointmentHelper");
        int i18 = (i17 < 0 || i17 > 2) ? 3 : 0;
        if (str == null || str.length() == 0) {
            i18 = 4;
        }
        int i19 = j17 > 0 ? i18 : 2;
        if (i19 != 0) {
            com.tencent.mars.xlog.Log.e("SnsAd.AppointmentHelper", "there is error");
            if (lVar != null) {
                lVar.invoke(new jz5.o(java.lang.Integer.valueOf(i19), -1, -1));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestAppointment", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.AppointmentHelper");
            return;
        }
        com.tencent.mm.plugin.sns.model.AdLandingPagesProxy adLandingPagesProxy = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance();
        if (str2 == null) {
            str2 = "";
        }
        adLandingPagesProxy.sendAppointmentReq(str, j17, i17, str2, new b54.a(lVar));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestAppointment", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.AppointmentHelper");
    }
}
