package com.tencent.mm.plugin.appbrand.jsapi.finder;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0005H\u0007¨\u0006\n"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/finder/OpenFinderChattingUIProxy$FinderChattingUITask", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Landroidx/lifecycle/x;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "onActivityStopped", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class OpenFinderChattingUIProxy$FinderChattingUITask extends com.tencent.mm.plugin.appbrand.ipc.v implements androidx.lifecycle.x {
    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest) {
        java.lang.Throwable th6;
        java.lang.String str;
        int i17;
        com.tencent.mm.ui.MMActivity activityContext;
        androidx.lifecycle.o mo133getLifecycle;
        kotlin.jvm.internal.o.e(appBrandProxyUIProcessTask$ProcessRequest, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.finder.OpenFinderChattingUIProxy.OpenFinderChattingUIRequest");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(((com.tencent.mm.plugin.appbrand.jsapi.finder.OpenFinderChattingUIProxy$OpenFinderChattingUIRequest) appBrandProxyUIProcessTask$ProcessRequest).getReqData());
            str = jSONObject.optString("userName");
            kotlin.jvm.internal.o.f(str, "optString(...)");
            try {
                i17 = jSONObject.optInt("sourceType");
            } catch (java.lang.Throwable th7) {
                th6 = th7;
                com.tencent.mars.xlog.Log.printErrStackTrace("OpenFinderChattingUIProxy", th6, "parse data failed", new java.lang.Object[0]);
                i17 = -1;
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                ya2.e1 e1Var = ya2.e1.f460472a;
                com.tencent.mm.ui.MMActivity activityContext2 = getActivityContext();
                kotlin.jvm.internal.o.f(activityContext2, "getActivityContext(...)");
                e1Var.l(activityContext2, str, i17);
                activityContext = getActivityContext();
                if (activityContext != null) {
                    return;
                } else {
                    return;
                }
            }
        } catch (java.lang.Throwable th8) {
            th6 = th8;
            str = "";
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1 e1Var2 = ya2.e1.f460472a;
        com.tencent.mm.ui.MMActivity activityContext22 = getActivityContext();
        kotlin.jvm.internal.o.f(activityContext22, "getActivityContext(...)");
        e1Var2.l(activityContext22, str, i17);
        activityContext = getActivityContext();
        if (activityContext != null || (mo133getLifecycle = activityContext.mo133getLifecycle()) == null) {
            return;
        }
        mo133getLifecycle.a(this);
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_STOP)
    public final void onActivityStopped() {
        finishProcess(null);
    }
}
