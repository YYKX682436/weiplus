package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class te implements ck5.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.ue f74226d;

    public te(com.tencent.mm.plugin.account.ui.ue ueVar) {
        this.f74226d = ueVar;
    }

    @Override // ck5.e
    public void R5(java.lang.String str) {
        db5.e1.i(this.f74226d.f74252e, com.tencent.mm.R.string.it9, com.tencent.mm.R.string.itb);
    }

    @Override // ck5.e
    public void c1(java.lang.String str) {
        com.tencent.mm.plugin.account.ui.ue ueVar = this.f74226d;
        com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI regByMobileRegAIOUI = ueVar.f74252e;
        int i17 = com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI.Y;
        regByMobileRegAIOUI.f73578v = com.tencent.mm.sdk.platformtools.c5.h(regByMobileRegAIOUI.X6());
        com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI regByMobileRegAIOUI2 = ueVar.f74252e;
        regByMobileRegAIOUI2.f73577u = com.tencent.mm.sdk.platformtools.c5.a(regByMobileRegAIOUI2.f73571o);
        java.lang.String str2 = ueVar.f74252e.f73577u + ueVar.f74252e.f73578v;
        ueVar.f74252e.hideVKB();
        com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI regByMobileRegAIOUI3 = ueVar.f74252e;
        if (c71.b.a(regByMobileRegAIOUI3, regByMobileRegAIOUI3.f73581y.getText().toString())) {
            com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI regByMobileRegAIOUI4 = ueVar.f74252e;
            if (regByMobileRegAIOUI4.N) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(regByMobileRegAIOUI4.f73572p)) {
                    com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI regByMobileRegAIOUI5 = ueVar.f74252e;
                    regByMobileRegAIOUI5.f73572p = u11.b.d(regByMobileRegAIOUI5.f73571o);
                }
                c71.b.c(ueVar.f74252e, ueVar.f74252e.getString(ueVar.f74252e.f73572p.equalsIgnoreCase("cn") ? com.tencent.mm.R.string.gbd : com.tencent.mm.R.string.gbe, com.tencent.mm.sdk.platformtools.m2.d(), ueVar.f74252e.f73572p, "reg", 1, 0), 30847, false);
                return;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(regByMobileRegAIOUI4.H)) {
                ueVar.f74252e.U6(str2);
            } else {
                ueVar.f74252e.c7();
            }
        }
    }

    @Override // ck5.e
    public void w0(java.lang.String str) {
        db5.e1.i(this.f74226d.f74252e, com.tencent.mm.R.string.it_, com.tencent.mm.R.string.itb);
    }
}
