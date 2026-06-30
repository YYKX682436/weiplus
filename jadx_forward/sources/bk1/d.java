package bk1;

/* loaded from: classes4.dex */
public final class d {
    public d(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.app.Activity srcActivity, java.lang.Class dstActivityClass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcActivity, "srcActivity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dstActivityClass, "dstActivityClass");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPrivacyManagePage", "start");
        android.content.Intent intent = new android.content.Intent(srcActivity, (java.lang.Class<?>) dstActivityClass);
        ak1.f.c(intent, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1204xed412388.p1205xbf8a9d65.C12718xe1f0c9d6.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(srcActivity, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/privacy/manage/AppBrandPrivacyManagePage$Companion", "start", "(Landroid/app/Activity;Ljava/lang/Class;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        srcActivity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(srcActivity, "com/tencent/mm/plugin/appbrand/ui/privacy/manage/AppBrandPrivacyManagePage$Companion", "start", "(Landroid/app/Activity;Ljava/lang/Class;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
