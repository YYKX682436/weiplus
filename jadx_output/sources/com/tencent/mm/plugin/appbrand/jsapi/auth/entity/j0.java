package com.tencent.mm.plugin.appbrand.jsapi.auth.entity;

/* loaded from: classes7.dex */
public final class j0 implements com.tencent.mm.plugin.appbrand.jsapi.auth.entity.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m0 f79508a;

    public j0(com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m0 m0Var) {
        this.f79508a = m0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.entity.o
    public final void a(android.app.Activity activity, java.lang.String appId) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(appId, "appId");
        com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m0 m0Var = this.f79508a;
        m0Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("0", appId);
        intent.putExtra("extra_call_by_appbrand", true);
        boolean z17 = activity instanceof com.tencent.mm.ui.MMActivity;
        int i17 = m0Var.f79525g;
        com.tencent.mm.plugin.appbrand.jsapi.auth.entity.n nVar = m0Var.f79522d;
        if (z17) {
            nVar.a(com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m.f79515f);
            j45.l.w((com.tencent.mm.ui.MMActivity) activity, ".plugin.webview.ui.tools.CreateAvatarUI", intent, i17, new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.f0(m0Var));
        } else if (activity instanceof com.tencent.mm.plugin.appbrand.ui.AppBrandUI) {
            nVar.a(com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m.f79515f);
            nf.g.a(activity).f(new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.g0(m0Var));
            j45.l.v(activity, ".plugin.webview.ui.tools.CreateAvatarUI", intent, i17);
        }
    }
}
