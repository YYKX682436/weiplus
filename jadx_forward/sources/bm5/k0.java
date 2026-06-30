package bm5;

/* loaded from: classes11.dex */
public abstract class k0 {
    public static final void a(android.content.Context context, android.content.Intent intent, android.widget.RemoteViews remoteViews, java.lang.String description, java.lang.String str, java.lang.String channelId, boolean z17, boolean z18) {
        z2.k0 k0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(description, "description");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(channelId, "channelId");
        intent.setFlags(268435456);
        if (str != null) {
            intent.setClassName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageName(), str);
        }
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 0, intent, fp.g0.a(134217728));
        if (remoteViews != null) {
            k0Var = new z2.k0(context, channelId);
            k0Var.f550999j = 1;
            k0Var.f551008s = "call";
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            android.app.Notification notification = k0Var.D;
            notification.when = currentTimeMillis;
            k0Var.f550996g = activity;
            notification.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.c7v;
            k0Var.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572064xr));
            k0Var.e(description);
            k0Var.h(2, true);
            k0Var.h(16, true);
            if (!fp.h.c(31) || com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getApplicationInfo().targetSdkVersion < 31) {
                k0Var.f551012w = remoteViews;
                k0Var.f551013x = remoteViews;
            } else if (fp.e0.b()) {
                k0Var.f551012w = remoteViews;
                k0Var.f551013x = remoteViews;
                k0Var.l(new z2.q0());
            } else if (ip.b.a()) {
                k0Var.f551012w = remoteViews;
                k0Var.f551013x = remoteViews;
            }
        } else {
            k0Var = new z2.k0(context, channelId);
            k0Var.f550999j = 1;
            k0Var.f551008s = "reminder";
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            android.app.Notification notification2 = k0Var.D;
            notification2.when = currentTimeMillis2;
            k0Var.f550996g = activity;
            notification2.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.c7v;
            k0Var.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572064xr));
            k0Var.e(description);
            k0Var.h(2, true);
            k0Var.h(16, true);
        }
        if (z18) {
            if (fp.h.c(34)) {
                java.lang.Object systemService = context.getSystemService("notification");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                if (!((android.app.NotificationManager) systemService).canUseFullScreenIntent()) {
                    android.content.Intent data = new android.content.Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT").setData(android.net.Uri.parse("package:" + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b));
                    data.addFlags(268435456);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(data);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/util/FullscreenIntentActivityUtil", "callNormalNotification", "(Landroid/content/Context;Landroid/content/Intent;Landroid/widget/RemoteViews;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(context, "com/tencent/mm/util/FullscreenIntentActivityUtil", "callNormalNotification", "(Landroid/content/Context;Landroid/content/Intent;Landroid/widget/RemoteViews;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
                k0Var.i(activity, true);
            } else {
                k0Var.i(activity, true);
            }
        }
        android.app.Notification b17 = k0Var.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "build(...)");
        if (z17) {
            b17.flags |= 4;
        }
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) mo3.f.f411939a).n(41, b17, true);
    }
}
