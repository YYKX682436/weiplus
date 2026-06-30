package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class m1 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.floatball.s1 f78121a;

    public m1(com.tencent.mm.plugin.appbrand.floatball.t1 t1Var, com.tencent.mm.plugin.appbrand.floatball.s1 s1Var) {
        this.f78121a = s1Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVoIP1v1FloatBallHelper", "showVOIPTip, has shown tip");
        com.tencent.mm.sdk.platformtools.o4.L().G("has_shown_appbrand_voip_1v1_tip", true);
        com.tencent.mm.plugin.appbrand.floatball.s1 s1Var = this.f78121a;
        if (s1Var != null) {
            s1Var.a();
        }
    }
}
