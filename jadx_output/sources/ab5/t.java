package ab5;

/* loaded from: classes9.dex */
public abstract class t implements ab5.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ab5.z f2980a;

    public t(ab5.z zVar) {
        this.f2980a = zVar;
    }

    @Override // ab5.y
    public android.view.View a() {
        return null;
    }

    @Override // ab5.y
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        boolean z17 = false;
        ab5.z zVar = this.f2980a;
        switch (itemId) {
            case 2:
                com.tencent.mm.sdk.platformtools.u3.i(new ab5.r(this), 100L);
                break;
            case 3:
                com.tencent.mm.sdk.platformtools.u3.i(new ab5.s(this), 100L);
                break;
            case 4:
                zVar.f2985a.u();
                break;
            case 5:
                if (!com.tencent.mm.sdk.platformtools.t8.K0(zVar.f2989e)) {
                    ab5.c0.d(zVar.f2986b, zVar.f2989e, true);
                    if (!zVar.f2993i) {
                        zVar.c(zVar.f2992h, 4);
                        break;
                    } else {
                        ab5.z.a(zVar, 6);
                        break;
                    }
                }
                break;
            case 6:
                if (!com.tencent.mm.sdk.platformtools.t8.K0(zVar.f2989e)) {
                    ab5.c0.d(zVar.f2986b, zVar.f2989e, false);
                    if (!zVar.f2993i) {
                        zVar.c(zVar.f2992h, 2);
                        break;
                    } else {
                        ab5.z.a(zVar, 1);
                        break;
                    }
                }
                break;
            case 7:
                android.content.Context context = zVar.f2986b;
                com.tencent.mm.plugin.appbrand.config.WxaExposedParams wxaExposedParams = zVar.f2988d;
                zVar.getClass();
                if (wxaExposedParams != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandServiceActionSheet", "exportUrlParams : %s", wxaExposedParams.toString());
                    java.lang.String str = wxaExposedParams.f77481g;
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("key_username", str);
                        intent.putExtra("key_from_scene", 4);
                        intent.putExtra("key_scene_exposed_params", wxaExposedParams);
                        j45.l.j(context, "appbrand", ".ui.AppBrandProfileUI", intent, null);
                        zVar.c(zVar.f2992h, 1);
                        break;
                    }
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandServiceActionSheet", "exportUrlParams is null");
                    break;
                }
                break;
            case 8:
                zVar.getClass();
                android.content.Intent intent2 = new android.content.Intent();
                com.tencent.mm.plugin.appbrand.config.WxaExposedParams wxaExposedParams2 = zVar.f2988d;
                java.lang.String str2 = wxaExposedParams2.f77478d;
                java.lang.String d17 = (str2 == null || !str2.equals(zVar.d())) ? zVar.d() : "";
                k91.z5 z5Var = new k91.z5();
                z5Var.f305863a = str2;
                z5Var.f305872j = 10;
                z5Var.f305873k = wxaExposedParams2.f77488q;
                z5Var.f305877o = d17;
                intent2.putExtra("rawUrl", com.tencent.mm.plugin.appbrand.v9.a(z5Var.a()));
                intent2.putExtra("forceHideShare", true);
                j45.l.j(zVar.f2986b, "webview", ".ui.tools.WebViewUI", intent2, null);
                break;
        }
        z17 = true;
        if (z17) {
            zVar.f2985a.u();
        }
    }
}
