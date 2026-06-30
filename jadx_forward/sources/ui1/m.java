package ui1;

/* loaded from: classes7.dex */
public class m implements ui1.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ui1.o f509596a;

    public m(ui1.o oVar) {
        this.f509596a = oVar;
    }

    @Override // ui1.y
    public void a(int i17, java.util.ArrayList arrayList, int i18, boolean z17) {
        boolean z18;
        ui1.o oVar = this.f509596a;
        java.lang.String str = oVar.f509602f;
        r45.h24 h24Var = oVar.f509603g;
        int size = h24Var.f457307e.size();
        ui1.t tVar = oVar.f509613t;
        java.lang.String str2 = oVar.f509602f;
        java.lang.String str3 = oVar.f509605i;
        java.lang.String str4 = oVar.f509604h;
        if (size > 1) {
            str = (arrayList == null ? java.util.Collections.emptyList() : arrayList).size() > 0 ? (java.lang.String) arrayList.get(0) : str2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJsApiUserAuth", "response.jsapi_scope %s, scopeAcc %s, appId %s, api %s", h24Var.f457315p, str, str4, str3);
            java.lang.String str5 = h24Var.f457315p;
            if (str5 == null) {
                ((ui1.f) tVar.f509616a).mo32123x3d6f0539();
                return;
            }
            z18 = str5.equals(str);
        } else {
            z18 = true;
        }
        if (i17 != 1) {
            if (i17 == 2) {
                ui1.t.b(oVar.f509613t, oVar.f509606m, str, 2, z18, z17, new ui1.l(this));
                ui1.t.f509615d.f(str4, str3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJsApiUserAuth", "requestUserAuth, user deny, appId %s, api %s", str4, str3);
                return;
            } else {
                if (i17 != 3) {
                    return;
                }
                ui1.t.f509615d.f(str4, str3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJsApiUserAuth", "requestUserAuth, user cancel, appId %s, api %s", str4, str3);
                ((ui1.f) tVar.f509616a).mo32123x3d6f0539();
                return;
            }
        }
        ui1.t.b(oVar.f509613t, oVar.f509606m, str, 1, z18, z17, new ui1.k(this, z18));
        if (!z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJsApiUserAuth", "requestUserAuth appId %s, api %s , target scope:%s, accept scope:%s, deny!", str4, str3, str2, str);
            tVar.f509616a.b(null);
            return;
        }
        if (str2.equals("scope.voip")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y mComponent = oVar.f509601e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mComponent, "mComponent");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
            if (!L.getBoolean("has_ever_show_wmpf_voip_call_in_scope_auth_notify_bottom_sheet", false)) {
                fl1.g2 m48800x14ed3266 = mComponent.t3().m48800x14ed3266();
                android.content.Context mo50352x76847179 = mComponent.mo50352x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo50352x76847179, "getContext(...)");
                ((fl1.c0) m48800x14ed3266).c(new ui1.e0(mo50352x76847179));
                L.putBoolean("has_ever_show_wmpf_voip_call_in_scope_auth_notify_bottom_sheet", true);
            }
        }
        ui1.t.f509615d.e(str4, str3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJsApiUserAuth", "requestUserAuth, user confirm, appId %s, api %s", str4, str3);
    }
}
