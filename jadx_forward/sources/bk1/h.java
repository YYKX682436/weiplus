package bk1;

/* loaded from: classes4.dex */
public final class h implements vl1.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bk1.w f102840a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1204xed412388.p1205xbf8a9d65.C12718xe1f0c9d6 f102841b;

    public h(bk1.w wVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1204xed412388.p1205xbf8a9d65.C12718xe1f0c9d6 c12718xe1f0c9d6) {
        this.f102840a = wVar;
        this.f102841b = c12718xe1f0c9d6;
    }

    @Override // vl1.n
    public final void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, android.view.View view, int i17, long j17) {
        k91.v5 v5Var;
        bk1.y yVar = (bk1.y) kz5.n0.a0(this.f102840a.f102888d, i17);
        java.lang.String str = (yVar == null || (v5Var = yVar.f102892a) == null) ? null : v5Var.f68924xdec927b;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandPrivacyManagePage", "onItemClick, position: " + i17 + ", username is empty");
            return;
        }
        bk1.d dVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1204xed412388.p1205xbf8a9d65.C12718xe1f0c9d6.f171461e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1204xed412388.p1205xbf8a9d65.C12718xe1f0c9d6 c12718xe1f0c9d6 = this.f102841b;
        c12718xe1f0c9d6.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPrivacyManagePage", "openSetting, username: " + str);
        android.content.Intent intent = new android.content.Intent(ak1.f.d(c12718xe1f0c9d6), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257.class);
        intent.putExtra("key_username", str);
        intent.putExtra("key_app_authorize_jsapi", false);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c12718xe1f0c9d6, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/privacy/manage/AppBrandPrivacyManagePage", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.y9.f35025x24728b, "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        c12718xe1f0c9d6.mo7585xa4df9991((android.content.Intent) arrayList.get(0));
        yj0.a.f(c12718xe1f0c9d6, "com/tencent/mm/plugin/appbrand/ui/privacy/manage/AppBrandPrivacyManagePage", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.y9.f35025x24728b, "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
