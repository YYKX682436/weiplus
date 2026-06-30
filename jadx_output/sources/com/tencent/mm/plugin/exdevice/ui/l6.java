package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class l6 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI f99557d;

    public l6(com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI exdeviceRankInfoUI) {
        this.f99557d = exdeviceRankInfoUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI exdeviceRankInfoUI = this.f99557d;
        if (exdeviceRankInfoUI.f99351y != null && i17 == 0) {
            exdeviceRankInfoUI.P = true;
            ve4.g.a(10);
            q32.c cj6 = com.tencent.mm.plugin.exdevice.model.l3.cj();
            java.lang.String str = exdeviceRankInfoUI.f99349w;
            java.lang.String str2 = exdeviceRankInfoUI.f99351y.field_username;
            cj6.getClass();
            gm0.j1.n().f273288b.g(new p32.o(str2, str, 3, ""));
        }
    }
}
