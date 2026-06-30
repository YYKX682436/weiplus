package com.tencent.mm.minigame;

/* loaded from: classes7.dex */
public final class q implements com.tencent.shadow.core.common.IWVAFirstFrameCallbackDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f69133a;

    public q(java.lang.ref.WeakReference weakReference) {
        this.f69133a = weakReference;
    }

    @Override // com.tencent.shadow.core.common.IWVAFirstFrameCallbackDelegate
    public void onFirstFrameRendered() {
        com.tencent.mars.xlog.Log.i("WVA.JsApiOperateWVA", "firstFrame: onFirstFrameRendered callback success!!!");
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) this.f69133a.get();
        if (c0Var != null) {
            c0Var.g("WVAOnFirstFrameEvent", "");
        } else {
            com.tencent.mars.xlog.Log.w("WVA.JsApiOperateWVA", "firstFrame: AppBrandService already GC'ed or null, skip dispatch!");
        }
    }
}
