package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class n5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.p5 f86907d;

    public n5(com.tencent.mm.plugin.appbrand.page.p5 p5Var) {
        this.f86907d = p5Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        if (i17 != -1) {
            return;
        }
        com.tencent.mm.plugin.appbrand.page.q5 q5Var = this.f86907d.f86996d;
        com.tencent.mm.plugin.appbrand.page.d5 d5Var = q5Var.f87036e;
        java.lang.String str = q5Var.f87034c;
        com.tencent.mm.plugin.appbrand.page.wd wdVar = q5Var.f87033b;
        com.tencent.mm.plugin.appbrand.page.u4 u4Var = q5Var.f87032a;
        int i18 = com.tencent.mm.plugin.appbrand.page.d5.f86522p1;
        d5Var.q0(str, wdVar, u4Var, true);
    }
}
