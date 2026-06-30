package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class q6 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.PaylistAAUI f72779a;

    public q6(com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI) {
        this.f72779a = paylistAAUI;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.PaylistAAUI", "aapay failed: %s", obj);
        com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI = this.f72779a;
        paylistAAUI.hideLoading();
        if (obj == null) {
            dp.a.makeText(paylistAAUI, paylistAAUI.getString(com.tencent.mm.R.string.f489752ap), 1).show();
            return;
        }
        if (!(obj instanceof r45.a)) {
            if (!(obj instanceof java.lang.String) || obj.toString().equalsIgnoreCase("ok")) {
                return;
            }
            dp.a.makeText(paylistAAUI, obj.toString(), 1).show();
            return;
        }
        r45.a aVar = (r45.a) obj;
        java.lang.String str = aVar.f369568e;
        java.lang.String str2 = aVar.f369569f;
        java.lang.String str3 = aVar.f369570g;
        com.tencent.mm.ui.widget.dialog.a aVar2 = new com.tencent.mm.ui.widget.dialog.a();
        aVar2.f211729s = str;
        aVar2.f211732v = str3;
        aVar2.E = new com.tencent.mm.plugin.aa.ui.p6(this, aVar);
        aVar2.f211733w = str2;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(paylistAAUI, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar2);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar2.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        j0Var.show();
    }
}
