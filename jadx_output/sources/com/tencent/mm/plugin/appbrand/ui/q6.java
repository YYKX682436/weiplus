package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes9.dex */
public class q6 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.w6 f89952a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandProcessShareMessageProxyUI f89953b;

    public q6(com.tencent.mm.plugin.appbrand.ui.AppBrandProcessShareMessageProxyUI appBrandProcessShareMessageProxyUI, com.tencent.mm.plugin.appbrand.ui.w6 w6Var) {
        this.f89953b = appBrandProcessShareMessageProxyUI;
        this.f89952a = w6Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public void a(boolean z17, java.lang.String str, int i17) {
        this.f89953b.hideVKB();
        this.f89952a.b(z17, str, i17);
    }
}
