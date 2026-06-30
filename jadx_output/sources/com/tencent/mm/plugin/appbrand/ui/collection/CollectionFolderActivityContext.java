package com.tencent.mm.plugin.appbrand.ui.collection;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/collection/CollectionFolderActivityContext;", "Lcom/tencent/mm/plugin/appbrand/ui/launcher/FolderActivityContextWithLifecycle;", "Ll75/q0;", "Lcom/tencent/mm/ui/MMActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Lcom/tencent/mm/ui/MMActivity;)V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class CollectionFolderActivityContext extends com.tencent.mm.plugin.appbrand.ui.launcher.FolderActivityContextWithLifecycle implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f89652d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionFolderActivityContext(com.tencent.mm.ui.MMActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f89652d = "CollectionFolderActivityContext";
    }

    @Override // zj1.a
    public void H3(boolean z17) {
        androidx.fragment.app.Fragment fragment;
        java.lang.String str;
        android.content.Intent intent;
        android.content.Intent intent2;
        if (a().isFinishing()) {
            return;
        }
        if ((z17 ? com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList.class : com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherBlankPage.class).isInstance(a().getSupportFragmentManager().findFragmentById(android.R.id.content))) {
            return;
        }
        a().removeAllOptionMenu();
        if (z17) {
            a().showActionbarLine();
        } else {
            a().hideActionbarLine();
        }
        androidx.fragment.app.i2 beginTransaction = a().getSupportFragmentManager().beginTransaction();
        if (z17) {
            fragment = new com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList();
        } else {
            java.lang.String string = a().getString(com.tencent.mm.R.string.f490263q0);
            java.lang.String string2 = a().getString(com.tencent.mm.R.string.f490083kf);
            com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherBlankPage appBrandLauncherBlankPage = new com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherBlankPage();
            android.os.Bundle bundle = new android.os.Bundle(2);
            bundle.putString("extra_title", string);
            bundle.putString("extra_tip", string2);
            appBrandLauncherBlankPage.setArguments(bundle);
            fragment = appBrandLauncherBlankPage;
        }
        beginTransaction.k(android.R.id.content, fragment, null);
        beginTransaction.e();
        com.tencent.mm.plugin.appbrand.appusage.z5 z5Var = (com.tencent.mm.plugin.appbrand.appusage.z5) i95.n0.c(com.tencent.mm.plugin.appbrand.appusage.z5.class);
        com.tencent.mm.ui.MMActivity a17 = a();
        if (a17 == null || (intent2 = a17.getIntent()) == null || (str = intent2.getStringExtra("extra_enter_scene_note")) == null) {
            str = "";
        }
        com.tencent.mm.ui.MMActivity a18 = a();
        java.lang.String str2 = this.f89652d;
        if (a18 != null && (intent = a18.getIntent()) != null) {
            int intExtra = intent.getIntExtra("extra_enter_scene", -1);
            com.tencent.mars.xlog.Log.i(str2, "EnterScene = " + intExtra);
            if (intExtra == 1 || intExtra == 3 || intExtra == 4) {
                com.tencent.mm.plugin.appbrand.report.v0.h(intExtra, str);
            }
        }
        if (z17) {
            z5Var.remove(this);
        } else {
            z5Var.add(str2 + ".WORKER", this);
        }
        if (z17) {
            com.tencent.mm.plugin.appbrand.task.h0 h0Var = com.tencent.mm.plugin.appbrand.task.u0.f89199h;
            com.tencent.mm.plugin.appbrand.task.u0 a19 = h0Var.a();
            com.tencent.luggage.sdk.processes.LuggageServiceType luggageServiceType = com.tencent.luggage.sdk.processes.LuggageServiceType.f47626e;
            com.tencent.mm.plugin.appbrand.service.x6 x6Var = com.tencent.mm.plugin.appbrand.service.x6.f88825p;
            a19.P(luggageServiceType, x6Var);
            h0Var.a().P(com.tencent.luggage.sdk.processes.LuggageServiceType.f47627f, x6Var);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.launcher.FolderActivityContextWithLifecycle
    public void b(android.content.Intent intent) {
        android.view.View findViewById = a().findViewById(android.R.id.content);
        if (findViewById != null) {
            findViewById.setBackgroundColor(-855310);
        }
        H3(true);
        if (intent != null) {
            com.tencent.mm.plugin.appbrand.appusage.t5.a(com.tencent.mm.plugin.appbrand.appusage.v5.f76600a, intent.getIntExtra("extra_get_usage_reason", 7), intent.getIntExtra("extra_get_usage_prescene", 0), null, 4, null);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.launcher.FolderActivityContextWithLifecycle
    public void onActivityDidResume() {
        a().setMMTitle(com.tencent.mm.R.string.f490263q0);
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.launcher.FolderActivityContextWithLifecycle
    public void onActivityWillDestroy() {
        super.onActivityWillDestroy();
        ((com.tencent.mm.plugin.appbrand.appusage.z5) i95.n0.c(com.tencent.mm.plugin.appbrand.appusage.z5.class)).remove(this);
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        if (((com.tencent.mm.plugin.appbrand.appusage.z5) i95.n0.c(com.tencent.mm.plugin.appbrand.appusage.z5.class)).getCount() > 0) {
            a().runOnUiThread(new xj1.y(this));
        }
    }
}
