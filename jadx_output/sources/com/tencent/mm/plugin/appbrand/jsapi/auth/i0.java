package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes5.dex */
public final class i0 extends com.tencent.mm.plugin.appbrand.jsapi.auth.l0 {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f79582b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(android.content.Context context) {
        super(null);
        kotlin.jvm.internal.o.g(context, "context");
        this.f79582b = context;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.l0
    public void a() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        android.content.Context context = this.f79582b;
        if (context instanceof android.app.Activity) {
            int i17 = com.tencent.mm.plugin.appbrand.ui.AppBrandAuthRealNameProxyEmptyUI.f89283d;
            android.app.Activity context2 = (android.app.Activity) context;
            kotlin.jvm.internal.o.g(context2, "context");
            android.content.Intent intent = new android.content.Intent(context2, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.ui.AppBrandAuthRealNameProxyEmptyUI.class);
            intent.putExtra("action", "startRealNameVerify");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandAuthRealNameProxyEmptyUI$Companion", "startRealNameVerify", "(Landroid/app/Activity;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/mm/plugin/appbrand/ui/AppBrandAuthRealNameProxyEmptyUI$Companion", "startRealNameVerify", "(Landroid/app/Activity;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
