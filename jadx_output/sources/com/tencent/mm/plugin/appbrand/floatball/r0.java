package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class r0 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.floatball.v0 f78138a;

    public r0(com.tencent.mm.plugin.appbrand.floatball.w0 w0Var, com.tencent.mm.plugin.appbrand.floatball.v0 v0Var) {
        this.f78138a = v0Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVOIPFloatBallHelper", "showVOIPTip, has shown tip");
        com.tencent.mm.sdk.platformtools.o4.L().G("has_shown_appbrand_voip_tip", true);
        com.tencent.mm.plugin.appbrand.floatball.v0 v0Var = this.f78138a;
        if (v0Var != null) {
            v0Var.a();
        }
    }
}
