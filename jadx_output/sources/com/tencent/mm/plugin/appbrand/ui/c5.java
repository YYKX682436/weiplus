package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class c5 {
    public c5(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.content.Context context, android.content.Intent intent) {
        android.os.Bundle bundle;
        kotlin.jvm.internal.o.g(context, "context");
        android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherFolderUI.class);
        if (!(context instanceof android.app.Activity)) {
            intent2.addFlags(268435456);
        }
        if (intent == null || (bundle = intent.getExtras()) == null) {
            bundle = android.os.Bundle.EMPTY;
        }
        intent2.putExtras(bundle);
        intent2.putExtra("KEY_MODE", 2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandLauncherFolderUI$Companion", "startCollectionList", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/appbrand/ui/AppBrandLauncherFolderUI$Companion", "startCollectionList", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void b(android.content.Context context, android.content.Intent intent) {
        android.os.Bundle bundle;
        kotlin.jvm.internal.o.g(context, "context");
        android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherFolderUI.class);
        if (!(context instanceof android.app.Activity)) {
            intent2.addFlags(268435456);
        }
        if (intent == null || (bundle = intent.getExtras()) == null) {
            bundle = android.os.Bundle.EMPTY;
        }
        intent2.putExtras(bundle);
        intent2.putExtra("KEY_MODE", 1);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandLauncherFolderUI$Companion", "startRecentsList", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/appbrand/ui/AppBrandLauncherFolderUI$Companion", "startRecentsList", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
