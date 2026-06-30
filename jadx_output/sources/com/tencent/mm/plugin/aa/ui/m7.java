package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class m7 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.PaylistAAUI f72741a;

    public m7(com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI) {
        this.f72741a = paylistAAUI;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.PaylistAAUI", "onInterrupt: %s", obj);
        com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI = this.f72741a;
        paylistAAUI.hideLoading();
        if (obj == null || !(obj instanceof r45.a)) {
            com.tencent.mm.plugin.aa.ui.PaylistAAUI.j7(paylistAAUI, obj == null ? "" : obj.toString());
            return;
        }
        r45.a aVar = (r45.a) obj;
        java.lang.String str = aVar.f369568e;
        java.lang.String str2 = aVar.f369569f;
        java.lang.String str3 = aVar.f369570g;
        androidx.appcompat.app.AppCompatActivity context = paylistAAUI.getContext();
        com.tencent.mm.ui.widget.dialog.a aVar2 = new com.tencent.mm.ui.widget.dialog.a();
        aVar2.f211729s = str;
        aVar2.f211732v = str3;
        aVar2.E = new com.tencent.mm.plugin.aa.ui.l7(this, aVar);
        aVar2.f211733w = str2;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar2);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar2.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        j0Var.show();
    }
}
