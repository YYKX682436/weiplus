package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes7.dex */
public class e2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.debugger.l2 f77739d;

    public e2(com.tencent.mm.plugin.appbrand.debugger.l2 l2Var) {
        this.f77739d = l2Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.appbrand.debugger.k2 k2Var = this.f77739d.f77798v;
        if (k2Var != null) {
            com.tencent.mm.plugin.appbrand.debugger.g1 g1Var = ((com.tencent.mm.plugin.appbrand.debugger.c1) k2Var).f77639a;
            g1Var.destroy();
            com.tencent.mm.plugin.appbrand.x0.g(g1Var.f77755i.getAppId(), com.tencent.mm.plugin.appbrand.w0.CLOSE);
            if (g1Var.f77755i.t3() != null) {
                g1Var.f77755i.t3().l0();
            }
        }
    }
}
