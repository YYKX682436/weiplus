package bk1;

/* loaded from: classes4.dex */
public final class h implements vl1.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bk1.w f21307a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandPrivacyManagePage f21308b;

    public h(bk1.w wVar, com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandPrivacyManagePage appBrandPrivacyManagePage) {
        this.f21307a = wVar;
        this.f21308b = appBrandPrivacyManagePage;
    }

    @Override // vl1.n
    public final void a(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, int i17, long j17) {
        k91.v5 v5Var;
        bk1.y yVar = (bk1.y) kz5.n0.a0(this.f21307a.f21355d, i17);
        java.lang.String str = (yVar == null || (v5Var = yVar.f21359a) == null) ? null : v5Var.field_username;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandPrivacyManagePage", "onItemClick, position: " + i17 + ", username is empty");
            return;
        }
        bk1.d dVar = com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandPrivacyManagePage.f89928e;
        com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandPrivacyManagePage appBrandPrivacyManagePage = this.f21308b;
        appBrandPrivacyManagePage.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPrivacyManagePage", "openSetting, username: " + str);
        android.content.Intent intent = new android.content.Intent(ak1.f.d(appBrandPrivacyManagePage), (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.class);
        intent.putExtra("key_username", str);
        intent.putExtra("key_app_authorize_jsapi", false);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(appBrandPrivacyManagePage, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/privacy/manage/AppBrandPrivacyManagePage", com.tencent.mm.plugin.appbrand.jsapi.y9.NAME, "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        appBrandPrivacyManagePage.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(appBrandPrivacyManagePage, "com/tencent/mm/plugin/appbrand/ui/privacy/manage/AppBrandPrivacyManagePage", com.tencent.mm.plugin.appbrand.jsapi.y9.NAME, "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
