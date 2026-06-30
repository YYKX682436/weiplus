package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class f3 implements com.tencent.mm.ui.widget.dialog.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f86606a;

    public f3(com.tencent.mm.plugin.appbrand.page.h3 h3Var, com.tencent.mm.plugin.appbrand.page.n7 n7Var) {
        this.f86606a = n7Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.b1
    public void a() {
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f86606a;
        com.tencent.mm.plugin.appbrand.report.v0.e(n7Var.getAppId(), n7Var.X1(), 37, "", com.tencent.mm.sdk.platformtools.t8.i1(), 1, 0);
    }
}
