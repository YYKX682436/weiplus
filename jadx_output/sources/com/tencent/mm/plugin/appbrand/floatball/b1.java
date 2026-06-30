package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class b1 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.floatball.j1 f78071a;

    public b1(com.tencent.mm.plugin.appbrand.floatball.k1 k1Var, com.tencent.mm.plugin.appbrand.floatball.j1 j1Var) {
        this.f78071a = j1Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", "showVOIPTip, has shown tip");
        com.tencent.mm.sdk.platformtools.o4.L().G("has_shown_appbrand_video_tip", true);
        com.tencent.mm.plugin.appbrand.floatball.j1 j1Var = this.f78071a;
        if (j1Var != null) {
            com.tencent.mm.plugin.appbrand.floatball.a1 a1Var = (com.tencent.mm.plugin.appbrand.floatball.a1) j1Var;
            a1Var.f78067b.A0(a1Var.f78066a);
        }
    }
}
