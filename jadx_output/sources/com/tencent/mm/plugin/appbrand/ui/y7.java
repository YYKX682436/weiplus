package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class y7 implements android.content.DialogInterface.OnShowListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.HalfScreenConfig f90350d;

    public y7(com.tencent.mm.plugin.appbrand.ui.AppBrandUI appBrandUI, com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig) {
        this.f90350d = halfScreenConfig;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenHeaderTipsListener weAppHalfScreenHeaderTipsListener;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUI", "handleDeclarePrompt: onShow");
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig = this.f90350d;
        if (halfScreenConfig == null || !halfScreenConfig.c() || (weAppHalfScreenHeaderTipsListener = halfScreenConfig.S) == null) {
            return;
        }
        weAppHalfScreenHeaderTipsListener.b();
    }
}
