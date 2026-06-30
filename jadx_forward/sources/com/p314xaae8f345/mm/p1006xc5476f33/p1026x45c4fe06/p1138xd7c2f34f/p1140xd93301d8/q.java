package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8;

/* loaded from: classes7.dex */
public final class q extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a
    public boolean d(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc) {
        android.app.Activity a17 = q75.a.a(context);
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ActivityC12328x4aa1de9.class);
        if (a17 == null) {
            intent.addFlags(268435456);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.e0.e(intent, (android.app.Activity) context);
        }
        intent.putExtra("extra_from_mm", false);
        intent.putExtra("extra_launch_parcel", c12362x460991bc);
        intent.putExtra("extra_launch_source_context", context.getClass().getName());
        intent.putExtra("extra_launch_source_process_name", bm5.f1.a());
        if (a17 != null && (a17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a) && !(a17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12650x33e7e92d) && c12362x460991bc.f166443o.f169323f == 1090) {
            new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.C12363x889f917(this, context, new java.lang.ref.WeakReference(a17));
        }
        if (c12362x460991bc.f166454x != null) {
            int flags = intent.getFlags();
            try {
                intent.setFlags((-268435457) & flags);
                com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3933x11320b41 c3933x11320b41 = c12362x460991bc.f166454x;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(c3933x11320b41, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/launching/precondition/ClientLaunchEntry", "startWithParcel", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/launching/params/LaunchParcel;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                c3933x11320b41.b((android.content.Intent) arrayList.get(0));
                yj0.a.f(c3933x11320b41, "com/tencent/mm/plugin/appbrand/launching/precondition/ClientLaunchEntry", "startWithParcel", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/launching/params/LaunchParcel;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
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
            int i17 = c12362x460991bc.A;
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
