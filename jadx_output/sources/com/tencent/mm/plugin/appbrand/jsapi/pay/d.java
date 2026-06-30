package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes7.dex */
public final class d implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayUtils$ProxyMMActivityResultTask f82593a;

    public d(com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayUtils$ProxyMMActivityResultTask appBrandJsApiPayUtils$ProxyMMActivityResultTask) {
        this.f82593a = appBrandJsApiPayUtils$ProxyMMActivityResultTask;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.ui.MMActivity activityContext;
        com.tencent.mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayUtils$ProxyMMActivityResultTask appBrandJsApiPayUtils$ProxyMMActivityResultTask = this.f82593a;
        activityContext = appBrandJsApiPayUtils$ProxyMMActivityResultTask.getActivityContext();
        activityContext.setResult(i18, intent);
        appBrandJsApiPayUtils$ProxyMMActivityResultTask.finishProcess(null);
        appBrandJsApiPayUtils$ProxyMMActivityResultTask.mHasActivityResult = true;
        return true;
    }
}
