package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage;

/* loaded from: classes7.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f85584d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f85585e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.AppBrandStatObject f85586f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject) {
        super(0);
        this.f85584d = context;
        this.f85585e = appBrandInitConfigWC;
        this.f85586f = appBrandStatObject;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = com.tencent.mm.plugin.appbrand.ui.t7.a() || com.tencent.mm.plugin.appbrand.ui.t7.g();
        android.content.Context context = this.f85584d;
        android.content.Intent intent = new android.content.Intent();
        java.lang.Class cls = z17 ? com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI4MM.class : com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI.class;
        android.content.Context context2 = this.f85584d;
        intent.setClass(context2, cls);
        boolean z18 = context2 instanceof android.app.Activity;
        if (!z18) {
            intent.addFlags(268435456);
        }
        intent.putExtra("key_launch_app_client_version", com.tencent.mm.sdk.platformtools.z.f193112h);
        intent.putExtra("key_appbrand_init_config", this.f85585e);
        intent.putExtra("key_appbrand_stat_object", this.f85586f);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/FunctionalLaunchInterceptor$shouldInterceptLaunch$2$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/appbrand/luggage/export/functionalpage/FunctionalLaunchInterceptor$shouldInterceptLaunch$2$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        android.app.Activity activity = z18 ? (android.app.Activity) context2 : null;
        if (activity != null) {
            activity.overridePendingTransition(0, 0);
        }
        return jz5.f0.f302826a;
    }
}
