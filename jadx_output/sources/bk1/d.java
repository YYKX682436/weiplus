package bk1;

/* loaded from: classes4.dex */
public final class d {
    public d(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.app.Activity srcActivity, java.lang.Class dstActivityClass) {
        kotlin.jvm.internal.o.g(srcActivity, "srcActivity");
        kotlin.jvm.internal.o.g(dstActivityClass, "dstActivityClass");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPrivacyManagePage", "start");
        android.content.Intent intent = new android.content.Intent(srcActivity, (java.lang.Class<?>) dstActivityClass);
        ak1.f.c(intent, com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandPrivacyManagePage.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(srcActivity, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/privacy/manage/AppBrandPrivacyManagePage$Companion", "start", "(Landroid/app/Activity;Ljava/lang/Class;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        srcActivity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(srcActivity, "com/tencent/mm/plugin/appbrand/ui/privacy/manage/AppBrandPrivacyManagePage$Companion", "start", "(Landroid/app/Activity;Ljava/lang/Class;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
