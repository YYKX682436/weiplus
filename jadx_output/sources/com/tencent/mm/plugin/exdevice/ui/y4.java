package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class y4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI f99729d;

    public y4(com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI exdeviceProfileUI) {
        this.f99729d = exdeviceProfileUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI exdeviceProfileUI = this.f99729d;
        if (itemId == 0) {
            ve4.g.a(26);
            int i18 = exdeviceProfileUI.f99320x;
            java.lang.String valueOf = i18 != 0 ? java.lang.String.valueOf(i18) : "--";
            r45.hh7 hh7Var = exdeviceProfileUI.f99309m;
            new com.tencent.mm.plugin.exdevice.model.f3().b(exdeviceProfileUI, valueOf, hh7Var != null ? java.lang.String.valueOf(hh7Var.f376175e) : "__", exdeviceProfileUI.f99316t, new com.tencent.mm.plugin.exdevice.ui.o4(exdeviceProfileUI));
            return;
        }
        if (itemId == 1) {
            ve4.g.a(27);
            int i19 = com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI.M;
            com.tencent.mm.plugin.exdevice.model.f3 f3Var = new com.tencent.mm.plugin.exdevice.model.f3();
            int i27 = exdeviceProfileUI.f99320x;
            java.lang.String valueOf2 = i27 != 0 ? java.lang.String.valueOf(i27) : "--";
            r45.hh7 hh7Var2 = exdeviceProfileUI.f99309m;
            f3Var.b(exdeviceProfileUI, valueOf2, hh7Var2 != null ? java.lang.String.valueOf(hh7Var2.f376175e) : "0", exdeviceProfileUI.f99316t, new com.tencent.mm.plugin.exdevice.ui.n4(exdeviceProfileUI));
            return;
        }
        if (itemId == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Sport.ExdeviceProfileUI", "ap: start to del: %s", exdeviceProfileUI.f99304e);
            gm0.j1.n().f273288b.g(new p32.i(exdeviceProfileUI.f99304e, exdeviceProfileUI.G));
            return;
        }
        if (itemId == 3) {
            db5.e1.H(exdeviceProfileUI.getContext(), exdeviceProfileUI.getString(com.tencent.mm.R.string.c5l), null, true, new com.tencent.mm.plugin.exdevice.ui.x4(this), null);
            return;
        }
        if (itemId != 4) {
            if (itemId != 5) {
                return;
            }
            ve4.g.a(41);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", exdeviceProfileUI.B);
            j45.l.j(exdeviceProfileUI, "webview", ".ui.tools.WebViewUI", intent, null);
            return;
        }
        exdeviceProfileUI.A = true;
        ve4.g.a(10);
        q32.c cj6 = com.tencent.mm.plugin.exdevice.model.l3.cj();
        java.lang.String str = exdeviceProfileUI.f99306g;
        java.lang.String str2 = exdeviceProfileUI.f99304e;
        cj6.getClass();
        gm0.j1.n().f273288b.g(new p32.o(str2, str, 3, ""));
    }
}
