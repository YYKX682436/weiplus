package com.tencent.mm.plugin.appbrand.wxassistant;

/* loaded from: classes5.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.wxassistant.j f92213d = new com.tencent.mm.plugin.appbrand.wxassistant.j();

    @Override // java.lang.Runnable
    public final void run() {
        if (com.tencent.mm.plugin.appbrand.wxassistant.c4.f92156a) {
            return;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(context)) {
            kotlin.jvm.internal.o.d(context);
            com.tencent.mm.plugin.appbrand.wxassistant.w3 w3Var = new com.tencent.mm.plugin.appbrand.wxassistant.w3(context, com.tencent.mm.plugin.appbrand.wxassistant.a4.f92129d, com.tencent.mm.plugin.appbrand.wxassistant.b4.f92142d);
            try {
                w3Var.f92335i.addView(w3Var, w3Var.f92334h);
            } catch (java.lang.Throwable unused) {
            }
            com.tencent.mm.plugin.appbrand.wxassistant.c4.f92157b = w3Var;
            com.tencent.mm.plugin.appbrand.wxassistant.c4.f92156a = true;
            return;
        }
        kotlin.jvm.internal.o.d(context);
        android.content.Intent intent = new android.content.Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", android.net.Uri.parse("package:" + context.getPackageName()));
        intent.setFlags(268435456);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/wxassistant/WxAssistantWindowLogic", "requestPermission", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/appbrand/wxassistant/WxAssistantWindowLogic", "requestPermission", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
