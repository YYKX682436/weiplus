package com.tencent.mm.plugin.appbrand.wxassistant;

/* loaded from: classes7.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f92223d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.os.Bundle bundle, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f92223d = bundle;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.wxassistant.k(this.f92223d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.appbrand.wxassistant.k kVar = (com.tencent.mm.plugin.appbrand.wxassistant.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        kVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy weAppOpenUICallbackIPCProxy;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.appbrand.wxassistant.v vVar = new com.tencent.mm.plugin.appbrand.wxassistant.v(context);
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) this.f92223d.getParcelable("KEY_INIT_CONFIG");
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = (com.tencent.mm.plugin.appbrand.report.AppBrandStatObject) this.f92223d.getParcelable("KEY_STAT_OBJECT");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("launch appId:");
        sb6.append(appBrandInitConfigWC != null ? appBrandInitConfigWC.f77278d : null);
        sb6.append(" statObject:");
        sb6.append(appBrandStatObject != null ? new java.lang.Integer(appBrandStatObject.f87790f) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWxAssistantLogic", sb6.toString());
        if (appBrandInitConfigWC != null && appBrandStatObject != null) {
            appBrandInitConfigWC.f47269b2 = appBrandStatObject;
            vVar.j(null, appBrandInitConfigWC);
        }
        com.tencent.mm.plugin.appbrand.wxassistant.n nVar = com.tencent.mm.plugin.appbrand.wxassistant.n.f92236a;
        android.view.View view = vVar.getView();
        nVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWxAssistantLogic", "attachVirtualDisplay");
        android.util.DisplayMetrics displayMetrics = com.tencent.mm.sdk.platformtools.x2.f193075e.getDisplayMetrics();
        int i17 = displayMetrics.widthPixels;
        int i18 = displayMetrics.heightPixels;
        com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.a aVar2 = new com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.a();
        com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.c cVar = new com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.c();
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        com.tencent.mm.plugin.appbrand.wxassistant.d dVar = com.tencent.mm.plugin.appbrand.wxassistant.d.f92189d;
        android.hardware.display.VirtualDisplay.Callback callback = com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.k.f92294b;
        if (i17 != 0 && i18 != 0) {
            android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) context2.getSystemService("display");
            android.util.DisplayMetrics displayMetrics2 = context2.getResources().getDisplayMetrics();
            cVar.resize(i17, i18);
            android.hardware.display.VirtualDisplay createVirtualDisplay = displayManager.createVirtualDisplay("flutter-vd#110", i17, i18, displayMetrics2.densityDpi, cVar.getSurface(), 0, com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.k.f92294b, null);
            if (createVirtualDisplay != null) {
                new com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.k(context2, aVar2, createVirtualDisplay, view, cVar, dVar, 110, null);
            }
        }
        if (appBrandInitConfigWC != null && (weAppOpenUICallbackIPCProxy = appBrandInitConfigWC.f77313z2) != null) {
            weAppOpenUICallbackIPCProxy.f84476d.a(new com.tencent.mm.ipcinvoker.type.IPCVoid());
        }
        return jz5.f0.f302826a;
    }
}
