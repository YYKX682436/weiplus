package com.tencent.mm.plugin.appbrand.ipc;

/* loaded from: classes7.dex */
public abstract class v implements com.tencent.mm.ui.da {
    private com.tencent.mm.plugin.appbrand.ipc.e0 mProxyUI;

    /* JADX WARN: Multi-variable type inference failed */
    public final void attach(com.tencent.mm.plugin.appbrand.ipc.e0 e0Var) {
        this.mProxyUI = e0Var;
        if (this instanceof androidx.lifecycle.x) {
            getActivityContext().mo133getLifecycle().a((androidx.lifecycle.x) this);
        }
    }

    public final void finishProcess(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        runOnUiThread(new com.tencent.mm.plugin.appbrand.ipc.s(this, appBrandProxyUIProcessTask$ProcessResult));
    }

    public final com.tencent.mm.ui.MMActivity getActivityContext() {
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI appBrandProcessProxyUI = (com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI) this.mProxyUI;
        appBrandProcessProxyUI.getClass();
        return appBrandProcessProxyUI;
    }

    public com.tencent.mm.plugin.appbrand.ipc.AppBrandTaskProxyUI getAppBrandTaskProxyUI() {
        com.tencent.mm.plugin.appbrand.ipc.e0 e0Var = this.mProxyUI;
        if (e0Var instanceof com.tencent.mm.plugin.appbrand.ipc.AppBrandTaskProxyUI) {
            return (com.tencent.mm.plugin.appbrand.ipc.AppBrandTaskProxyUI) e0Var;
        }
        return null;
    }

    public final java.lang.String getString(int i17) {
        return com.tencent.mm.sdk.platformtools.x2.f193075e.getString(i17);
    }

    public abstract void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest);

    public final boolean isProcessTerminated() {
        com.tencent.mm.plugin.appbrand.ipc.e0 e0Var = this.mProxyUI;
        if (e0Var == null) {
            return true;
        }
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI appBrandProcessProxyUI = (com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI) e0Var;
        return appBrandProcessProxyUI.activityHasDestroyed() || appBrandProcessProxyUI.isFinishing() || appBrandProcessProxyUI.f78353i;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
    }

    public void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    public boolean onInterceptFinishActivityAction() {
        return false;
    }

    public void onProcessInterrupted() {
    }

    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
    }

    public final void runOnUiThread(java.lang.Runnable runnable) {
        com.tencent.mm.plugin.appbrand.ipc.e0 e0Var = this.mProxyUI;
        if (e0Var == null) {
            return;
        }
        e0Var.runOnUiThread(runnable);
    }

    public final void sendResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        com.tencent.mm.plugin.appbrand.ipc.e0 e0Var = this.mProxyUI;
        if (e0Var != null) {
            ((com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI) e0Var).U6(appBrandProxyUIProcessTask$ProcessResult);
        }
    }

    public boolean shouldOverrideExitAnimation() {
        return false;
    }

    public final void startActivity(java.lang.String str, java.lang.String str2) {
        j45.l.h(getActivityContext(), str, str2);
    }

    public final void startActivityForResult(java.lang.String str, java.lang.String str2, android.content.Intent intent, int i17) {
        getActivityContext().mmSetOnActivityResultCallback(this);
        j45.l.n(getActivityContext(), str, str2, intent, i17);
    }

    public final void startActivityForResult(android.content.Intent intent, int i17) {
        getActivityContext().mmSetOnActivityResultCallback(this);
        getActivityContext().startActivityForResult(intent, i17);
    }
}
