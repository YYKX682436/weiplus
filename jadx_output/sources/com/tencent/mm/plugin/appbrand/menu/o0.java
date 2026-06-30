package com.tencent.mm.plugin.appbrand.menu;

/* loaded from: classes7.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f85986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f85987e;

    public o0(com.tencent.mm.plugin.appbrand.menu.p0 p0Var, com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.page.n7 n7Var) {
        this.f85986d = o6Var;
        this.f85987e = n7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        rh1.c V2 = this.f85986d.V2();
        if (V2 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.MenuDelegate_Star", "performItemClick, no float ball helper");
            return;
        }
        com.tencent.mm.plugin.multitask.i1 i1Var = (com.tencent.mm.plugin.multitask.i1) ((com.tencent.mm.plugin.multitask.j0) i95.n0.c(com.tencent.mm.plugin.multitask.j0.class));
        if (i1Var.Di()) {
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = V2.f300077a;
            boolean z17 = multiTaskInfo != null && i1Var.cj(multiTaskInfo);
            V2.B(!z17);
            i17 = z17 ? 60 : 59;
        } else {
            V2.B(true);
            i17 = 29;
        }
        int i18 = i17;
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f85987e;
        com.tencent.mm.plugin.appbrand.report.v0.e(n7Var.getAppId(), n7Var.X1(), i18, "", com.tencent.mm.sdk.platformtools.t8.i1(), 1, 0);
    }
}
