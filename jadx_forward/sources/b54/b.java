package b54;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b54.b f99628a = new b54.b();

    public final void a(int i17, long j17, java.lang.String str, java.lang.String str2, yz5.l lVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("requestAppointment", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.AppointmentHelper");
        int i18 = (i17 < 0 || i17 > 2) ? 3 : 0;
        if (str == null || str.length() == 0) {
            i18 = 4;
        }
        int i19 = j17 > 0 ? i18 : 2;
        if (i19 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AppointmentHelper", "there is error");
            if (lVar != null) {
                lVar.mo146xb9724478(new jz5.o(java.lang.Integer.valueOf(i19), -1, -1));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestAppointment", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.AppointmentHelper");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e m69779x9cf0d20b = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b();
        if (str2 == null) {
            str2 = "";
        }
        m69779x9cf0d20b.m69995xf8a91a27(str, j17, i17, str2, new b54.a(lVar));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestAppointment", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.AppointmentHelper");
    }
}
