package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class x7 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle f90333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.HalfScreenConfig f90334e;

    public x7(com.tencent.mm.plugin.appbrand.ui.AppBrandUI appBrandUI, com.tencent.mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle weAppOpenDeclarePromptBundle, com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig) {
        this.f90333d = weAppOpenDeclarePromptBundle;
        this.f90334e = halfScreenConfig;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenHeaderTipsListener weAppHalfScreenHeaderTipsListener;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUI", "handleDeclarePrompt: onCancel");
        java.lang.String str = com.tencent.mm.sdk.platformtools.x2.f193072b;
        com.tencent.mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle weAppOpenDeclarePromptBundle = this.f90333d;
        com.tencent.mm.ipcinvoker.d0.d(str, new com.tencent.mm.plugin.appbrand.ui.AppBrandUIDeclarePromptIPC.IPCDeclarePromptCallbackParam(weAppOpenDeclarePromptBundle.f74986d, true, weAppOpenDeclarePromptBundle.f74987e), com.tencent.mm.plugin.appbrand.ui.AppBrandUIDeclarePromptIPC.class, new com.tencent.mm.plugin.appbrand.ui.w7(this));
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig = this.f90334e;
        if (halfScreenConfig == null || !halfScreenConfig.c() || (weAppHalfScreenHeaderTipsListener = halfScreenConfig.S) == null) {
            return;
        }
        weAppHalfScreenHeaderTipsListener.a();
    }
}
