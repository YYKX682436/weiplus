package ab5;

/* loaded from: classes9.dex */
public abstract class t implements ab5.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ab5.z f84513a;

    public t(ab5.z zVar) {
        this.f84513a = zVar;
    }

    @Override // ab5.y
    public android.view.View a() {
        return null;
    }

    @Override // ab5.y
    /* renamed from: onMMMenuItemSelected */
    public void mo1049x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        boolean z17 = false;
        ab5.z zVar = this.f84513a;
        switch (itemId) {
            case 2:
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new ab5.r(this), 100L);
                break;
            case 3:
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new ab5.s(this), 100L);
                break;
            case 4:
                zVar.f84518a.u();
                break;
            case 5:
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zVar.f84522e)) {
                    ab5.c0.d(zVar.f84519b, zVar.f84522e, true);
                    if (!zVar.f84526i) {
                        zVar.c(zVar.f84525h, 4);
                        break;
                    } else {
                        ab5.z.a(zVar, 6);
                        break;
                    }
                }
                break;
            case 6:
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zVar.f84522e)) {
                    ab5.c0.d(zVar.f84519b, zVar.f84522e, false);
                    if (!zVar.f84526i) {
                        zVar.c(zVar.f84525h, 2);
                        break;
                    } else {
                        ab5.z.a(zVar, 1);
                        break;
                    }
                }
                break;
            case 7:
                android.content.Context context = zVar.f84519b;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11832x1f85bd26 c11832x1f85bd26 = zVar.f84521d;
                zVar.getClass();
                if (c11832x1f85bd26 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandServiceActionSheet", "exportUrlParams : %s", c11832x1f85bd26.m50144x9616526c());
                    java.lang.String str = c11832x1f85bd26.f159014g;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("key_username", str);
                        intent.putExtra("key_from_scene", 4);
                        intent.putExtra("key_scene_exposed_params", c11832x1f85bd26);
                        j45.l.j(context, "appbrand", ".ui.AppBrandProfileUI", intent, null);
                        zVar.c(zVar.f84525h, 1);
                        break;
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandServiceActionSheet", "exportUrlParams is null");
                    break;
                }
                break;
            case 8:
                zVar.getClass();
                android.content.Intent intent2 = new android.content.Intent();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11832x1f85bd26 c11832x1f85bd262 = zVar.f84521d;
                java.lang.String str2 = c11832x1f85bd262.f159011d;
                java.lang.String d17 = (str2 == null || !str2.equals(zVar.d())) ? zVar.d() : "";
                k91.z5 z5Var = new k91.z5();
                z5Var.f387396a = str2;
                z5Var.f387405j = 10;
                z5Var.f387406k = c11832x1f85bd262.f159021q;
                z5Var.f387410o = d17;
                intent2.putExtra("rawUrl", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v9.a(z5Var.a()));
                intent2.putExtra("forceHideShare", true);
                j45.l.j(zVar.f84519b, "webview", ".ui.tools.WebViewUI", intent2, null);
                break;
        }
        z17 = true;
        if (z17) {
            zVar.f84518a.u();
        }
    }
}
