package com.tencent.mm.plugin.appbrand.launching;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0007\u001a\u00020\u0006H\u0014J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0014R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/launching/jc;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "", "shouldOverrideExitAnimation", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "Lcom/tencent/mm/plugin/appbrand/ui/q9;", "d", "Lcom/tencent/mm/plugin/appbrand/ui/q9;", "weakNetReloadButtonContainer", "e", "Z", "closeByHomeButton", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class jc extends com.tencent.mm.plugin.appbrand.ipc.v {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private com.tencent.mm.plugin.appbrand.ui.q9 weakNetReloadButtonContainer;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean closeByHomeButton;

    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(final com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest) {
        if (!(appBrandProxyUIProcessTask$ProcessRequest instanceof com.tencent.mm.plugin.appbrand.launching.ShowFallbackErrorReloadUIRequest)) {
            finishProcess(null);
            return;
        }
        android.view.View.OnClickListener onClickListener = new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.appbrand.launching.ShowFallbackErrorReloadUITask$handleRequest$reloadListener$1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.tencent.mm.ui.MMActivity activityContext;
                com.tencent.mm.ui.MMActivity activityContext2;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/appbrand/launching/ShowFallbackErrorReloadUITask$handleRequest$reloadListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest2 = com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest.this;
                com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC initConfig = ((com.tencent.mm.plugin.appbrand.launching.ShowFallbackErrorReloadUIRequest) appBrandProxyUIProcessTask$ProcessRequest2).getInitConfig();
                initConfig.f47269b2 = ((com.tencent.mm.plugin.appbrand.launching.ShowFallbackErrorReloadUIRequest) appBrandProxyUIProcessTask$ProcessRequest2).getStatObject();
                com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel a17 = k91.h0.a(initConfig);
                java.lang.String str = ((com.tencent.mm.plugin.appbrand.launching.ShowFallbackErrorReloadUIRequest) appBrandProxyUIProcessTask$ProcessRequest2).getInitConfig().f47277w;
                kotlin.jvm.internal.o.f(str, "getWxaLaunchInstanceId(...)");
                a17.M = new com.tencent.mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle(str, wg1.b.f445716i.h());
                a17.d();
                com.tencent.mm.plugin.appbrand.launching.precondition.x xVar = com.tencent.mm.plugin.appbrand.launching.precondition.x.f85032a;
                final com.tencent.mm.plugin.appbrand.launching.jc jcVar = this;
                activityContext = jcVar.getActivityContext();
                ((com.tencent.mm.plugin.appbrand.launching.a) xVar).a(activityContext, a17);
                activityContext2 = jcVar.getActivityContext();
                activityContext2.mo133getLifecycle().a(new androidx.lifecycle.f() { // from class: com.tencent.mm.plugin.appbrand.launching.ShowFallbackErrorReloadUITask$handleRequest$reloadListener$1.2
                    @Override // androidx.lifecycle.f, androidx.lifecycle.h
                    public void onStop(androidx.lifecycle.y owner) {
                        kotlin.jvm.internal.o.g(owner, "owner");
                        com.tencent.mm.plugin.appbrand.launching.jc.this.finishProcess(null);
                    }
                });
                yj0.a.h(this, "com/tencent/mm/plugin/appbrand/launching/ShowFallbackErrorReloadUITask$handleRequest$reloadListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        };
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) getActivityContext().findViewById(android.R.id.content);
        boolean z17 = true;
        com.tencent.mm.ui.v9.c(getActivityContext().getWindow(), !com.tencent.mm.ui.bk.C());
        com.tencent.mm.ui.v9.f(getActivityContext(), b3.l.getColor(getActivityContext(), com.tencent.mm.R.color.f478491c));
        android.view.View.inflate(getActivityContext(), com.tencent.mm.R.layout.dhg, viewGroup);
        kotlin.jvm.internal.o.d(viewGroup);
        com.tencent.mm.plugin.appbrand.ui.q9 q9Var = new com.tencent.mm.plugin.appbrand.ui.q9(onClickListener, viewGroup);
        com.tencent.mm.plugin.appbrand.launching.ShowFallbackErrorReloadUIRequest showFallbackErrorReloadUIRequest = (com.tencent.mm.plugin.appbrand.launching.ShowFallbackErrorReloadUIRequest) appBrandProxyUIProcessTask$ProcessRequest;
        java.lang.String retryMsg = showFallbackErrorReloadUIRequest.getRetryMsg();
        if (retryMsg != null && retryMsg.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            q9Var.f89961d = showFallbackErrorReloadUIRequest.getRetryMsg();
            android.widget.TextView textView = (android.widget.TextView) q9Var.f89960c.getValue();
            if (textView != null) {
                textView.setText(q9Var.f89961d);
            }
        }
        this.weakNetReloadButtonContainer = q9Var;
        com.tencent.mm.plugin.appbrand.page.t a17 = com.tencent.mm.plugin.appbrand.page.v.f87153a.a(com.tencent.mm.plugin.appbrand.task.x0.WASERVICE);
        com.tencent.mm.ui.MMActivity activityContext = getActivityContext();
        kotlin.jvm.internal.o.f(activityContext, "getActivityContext(...)");
        mi1.i iVar = (mi1.i) a17.a(activityContext, mi1.i.class);
        if (iVar != null) {
            viewGroup.addView(iVar, new android.view.ViewGroup.LayoutParams(-1, getActivityContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479621aw)));
            iVar.setStyleColor(com.tencent.mm.ui.bk.C() ? -1 : -16777216);
            iVar.setHomeButtonOnClickListener(new com.tencent.mm.plugin.appbrand.launching.ic(this));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        xi1.o oVar = newConfig.orientation == 2 ? xi1.o.LANDSCAPE_SENSOR : xi1.o.PORTRAIT;
        com.tencent.mm.plugin.appbrand.ui.q9 q9Var = this.weakNetReloadButtonContainer;
        if (q9Var != null) {
            if (q9Var != null) {
                q9Var.a(oVar);
            } else {
                kotlin.jvm.internal.o.o("weakNetReloadButtonContainer");
                throw null;
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public boolean shouldOverrideExitAnimation() {
        if (!this.closeByHomeButton) {
            return false;
        }
        getActivityContext().overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477746a7);
        return true;
    }
}
