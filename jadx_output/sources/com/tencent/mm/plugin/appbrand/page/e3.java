package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class e3 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f86557d;

    public e3(com.tencent.mm.plugin.appbrand.page.h3 h3Var, com.tencent.mm.plugin.appbrand.page.n7 n7Var) {
        this.f86557d = n7Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f86557d;
        com.tencent.mm.plugin.appbrand.report.v0.e(n7Var.getAppId(), n7Var.X1(), 38, "", com.tencent.mm.sdk.platformtools.t8.i1(), 1, 0);
    }
}
