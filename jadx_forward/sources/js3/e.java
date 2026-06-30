package js3;

/* loaded from: classes5.dex */
public class e implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        java.lang.String b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).a().b(1, "MailApp", "MailAppEnterMailAppUrlAndroid");
        java.lang.String b18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).a().b(1, "MailApp", "MailAppRedirectUrAndroid");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273972b != 1 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).a().b(1, "MailApp", "ShowMailAppRecommend"), 0) == 1;
        android.os.Bundle bundle = new android.os.Bundle();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
            b17 = b17.replace("http:", "https:");
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b18)) {
            b18 = b18.replace("http:", "https:");
        }
        bundle.putString("mail_app_enter_url", b17);
        bundle.putString("mail_app_download_url", b18);
        bundle.putBoolean("mail_app_show_recommend", z17);
        rVar.a(bundle);
    }
}
