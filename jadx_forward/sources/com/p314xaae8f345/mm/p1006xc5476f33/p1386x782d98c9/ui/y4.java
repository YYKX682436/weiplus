package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes12.dex */
public class y4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13474xf9906714 f181262d;

    public y4(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13474xf9906714 activityC13474xf9906714) {
        this.f181262d = activityC13474xf9906714;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13474xf9906714 activityC13474xf9906714 = this.f181262d;
        if (itemId == 0) {
            ve4.g.a(26);
            int i18 = activityC13474xf9906714.f180853x;
            java.lang.String valueOf = i18 != 0 ? java.lang.String.valueOf(i18) : "--";
            r45.hh7 hh7Var = activityC13474xf9906714.f180842m;
            new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.f3().b(activityC13474xf9906714, valueOf, hh7Var != null ? java.lang.String.valueOf(hh7Var.f457708e) : "__", activityC13474xf9906714.f180849t, new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.o4(activityC13474xf9906714));
            return;
        }
        if (itemId == 1) {
            ve4.g.a(27);
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13474xf9906714.M;
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.f3 f3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.f3();
            int i27 = activityC13474xf9906714.f180853x;
            java.lang.String valueOf2 = i27 != 0 ? java.lang.String.valueOf(i27) : "--";
            r45.hh7 hh7Var2 = activityC13474xf9906714.f180842m;
            f3Var.b(activityC13474xf9906714, valueOf2, hh7Var2 != null ? java.lang.String.valueOf(hh7Var2.f457708e) : "0", activityC13474xf9906714.f180849t, new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.n4(activityC13474xf9906714));
            return;
        }
        if (itemId == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.ExdeviceProfileUI", "ap: start to del: %s", activityC13474xf9906714.f180837e);
            gm0.j1.n().f354821b.g(new p32.i(activityC13474xf9906714.f180837e, activityC13474xf9906714.G));
            return;
        }
        if (itemId == 3) {
            db5.e1.H(activityC13474xf9906714.mo55332x76847179(), activityC13474xf9906714.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c5l), null, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.x4(this), null);
            return;
        }
        if (itemId != 4) {
            if (itemId != 5) {
                return;
            }
            ve4.g.a(41);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", activityC13474xf9906714.B);
            j45.l.j(activityC13474xf9906714, "webview", ".ui.tools.WebViewUI", intent, null);
            return;
        }
        activityC13474xf9906714.A = true;
        ve4.g.a(10);
        q32.c cj6 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.cj();
        java.lang.String str = activityC13474xf9906714.f180839g;
        java.lang.String str2 = activityC13474xf9906714.f180837e;
        cj6.getClass();
        gm0.j1.n().f354821b.g(new p32.o(str2, str, 3, ""));
    }
}
