package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class j5 implements db5.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI f89803a;

    public j5(com.tencent.mm.plugin.appbrand.ui.k5 k5Var, com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI appBrandLauncherUI) {
        this.f89803a = appBrandLauncherUI;
    }

    @Override // db5.a1
    public boolean onFinish(java.lang.CharSequence charSequence) {
        java.lang.String str;
        java.lang.String str2;
        if (android.text.TextUtils.isEmpty(charSequence)) {
            return false;
        }
        java.lang.String charSequence2 = charSequence.toString();
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if ((charSequence2 == null ? "" : charSequence2).endsWith("@app")) {
            str2 = charSequence2;
            str = null;
        } else {
            str = charSequence2;
            str2 = null;
        }
        appBrandStatObject.f87790f = 1001;
        ((com.tencent.mm.plugin.appbrand.launching.a) com.tencent.mm.plugin.appbrand.launching.precondition.x.f85032a).b(this.f89803a, str2, str, null, 0, 0, appBrandStatObject, null, null);
        return true;
    }
}
