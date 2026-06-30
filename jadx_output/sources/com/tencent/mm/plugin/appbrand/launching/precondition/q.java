package com.tencent.mm.plugin.appbrand.launching.precondition;

/* loaded from: classes7.dex */
public final class q extends com.tencent.mm.plugin.appbrand.launching.a {
    @Override // com.tencent.mm.plugin.appbrand.launching.a
    public boolean d(android.content.Context context, com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel) {
        android.app.Activity a17 = q75.a.a(context);
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI.class);
        if (a17 == null) {
            intent.addFlags(268435456);
        } else {
            com.tencent.mm.plugin.appbrand.launching.precondition.e0.e(intent, (android.app.Activity) context);
        }
        intent.putExtra("extra_from_mm", false);
        intent.putExtra("extra_launch_parcel", launchParcel);
        intent.putExtra("extra_launch_source_context", context.getClass().getName());
        intent.putExtra("extra_launch_source_process_name", bm5.f1.a());
        if (a17 != null && (a17 instanceof com.tencent.mm.plugin.appbrand.ui.AppBrandUI) && !(a17 instanceof com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI) && launchParcel.f84910o.f87790f == 1090) {
            new com.tencent.mm.plugin.appbrand.launching.precondition.ClientLaunchEntry$1Observer(this, context, new java.lang.ref.WeakReference(a17));
        }
        if (launchParcel.f84921x != null) {
            int flags = intent.getFlags();
            try {
                intent.setFlags((-268435457) & flags);
                com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate activityStarterIpcDelegate = launchParcel.f84921x;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(activityStarterIpcDelegate, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/launching/precondition/ClientLaunchEntry", "startWithParcel", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/launching/params/LaunchParcel;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activityStarterIpcDelegate.b((android.content.Intent) arrayList.get(0));
                yj0.a.f(activityStarterIpcDelegate, "com/tencent/mm/plugin/appbrand/launching/precondition/ClientLaunchEntry", "startWithParcel", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/launching/params/LaunchParcel;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (java.lang.Exception unused) {
                intent.setFlags(flags);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/launching/precondition/ClientLaunchEntry", "startWithParcel", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/launching/params/LaunchParcel;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/appbrand/launching/precondition/ClientLaunchEntry", "startWithParcel", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/launching/params/LaunchParcel;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        } else if (a17 != null) {
            int i17 = launchParcel.A;
            if (i17 < 0) {
                i17 = -1;
            }
            a17.startActivityForResult(intent, i17, null);
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(context, arrayList3.toArray(), "com/tencent/mm/plugin/appbrand/launching/precondition/ClientLaunchEntry", "startWithParcel", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/launching/params/LaunchParcel;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/appbrand/launching/precondition/ClientLaunchEntry", "startWithParcel", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/launching/params/LaunchParcel;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return true;
    }
}
