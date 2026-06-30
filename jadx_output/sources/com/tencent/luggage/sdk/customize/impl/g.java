package com.tencent.luggage.sdk.customize.impl;

/* loaded from: classes3.dex */
public class g implements com.tencent.mm.plugin.appbrand.jsapi.r1 {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.r1
    public void N(android.content.Context context, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.appbrand.jsapi.q1 q1Var) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.luggage.sdk.customize.impl.FullSdkExternalToolsHelper$SimpleWebViewActivity.class);
        intent.putExtra("_url_", str);
        if (!(context instanceof android.app.Activity)) {
            intent.addFlags(268435456);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/luggage/sdk/customize/impl/FullSdkExternalToolsHelper", "openWebViewActivity", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/plugin/appbrand/jsapi/IExternalToolsHelper$SimpleWebViewLaunchParams;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/luggage/sdk/customize/impl/FullSdkExternalToolsHelper", "openWebViewActivity", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/plugin/appbrand/jsapi/IExternalToolsHelper$SimpleWebViewLaunchParams;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
