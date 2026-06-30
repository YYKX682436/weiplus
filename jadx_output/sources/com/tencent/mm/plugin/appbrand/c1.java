package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class c1 extends com.tencent.mm.app.w6 {
    @Override // com.tencent.mm.app.w6, com.tencent.mm.app.v6
    public void onActivityStarted(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        if ((activity instanceof com.tencent.mm.plugin.appbrand.ui.AppBrandUI) && com.tencent.xweb.WebView.y0()) {
            com.tencent.mm.sdk.platformtools.o4.M("MicroMsg.AppBrandPersistentRuntimeConfig").putBoolean("KEY_XWEB_INSTALLED", com.tencent.xweb.a3.k(2003));
        }
    }
}
