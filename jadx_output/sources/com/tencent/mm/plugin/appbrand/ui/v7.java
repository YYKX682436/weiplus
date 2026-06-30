package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class v7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle f90277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.HalfScreenConfig f90278e;

    public v7(com.tencent.mm.plugin.appbrand.ui.AppBrandUI appBrandUI, com.tencent.mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle weAppOpenDeclarePromptBundle, com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig) {
        this.f90277d = weAppOpenDeclarePromptBundle;
        this.f90278e = halfScreenConfig;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenHeaderTipsListener weAppHalfScreenHeaderTipsListener;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUI", "handleDeclarePrompt: onClick");
        java.lang.String str = com.tencent.mm.sdk.platformtools.x2.f193072b;
        com.tencent.mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle weAppOpenDeclarePromptBundle = this.f90277d;
        com.tencent.mm.ipcinvoker.d0.d(str, new com.tencent.mm.plugin.appbrand.ui.AppBrandUIDeclarePromptIPC.IPCDeclarePromptCallbackParam(weAppOpenDeclarePromptBundle.f74986d, false, weAppOpenDeclarePromptBundle.f74987e), com.tencent.mm.plugin.appbrand.ui.AppBrandUIDeclarePromptIPC.class, new com.tencent.mm.plugin.appbrand.ui.u7(this));
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig = this.f90278e;
        if (halfScreenConfig == null || !halfScreenConfig.c() || (weAppHalfScreenHeaderTipsListener = halfScreenConfig.S) == null) {
            return;
        }
        weAppHalfScreenHeaderTipsListener.a();
    }
}
