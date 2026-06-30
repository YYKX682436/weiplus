package fo5;

/* loaded from: classes11.dex */
public final class l1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f346551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f346552e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ er4.r f346553f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(android.content.Context context, java.lang.String str, er4.r rVar) {
        super(1);
        this.f346551d = context;
        this.f346552e = str;
        this.f346553f = rVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        android.content.Intent intent = (android.content.Intent) obj;
        if (intent != null) {
            android.content.Context context = this.f346551d;
            java.lang.String otherUserName = this.f346552e;
            er4.r rVar = this.f346553f;
            qo5.b bVar = qo5.b.f447196a;
            boolean z17 = rVar == er4.r.MP_ROOM_TYPE_VIDEO;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(otherUserName, "otherUserName");
            android.widget.RemoteViews b17 = bVar.b(otherUserName, z17, false);
            android.widget.RemoteViews b18 = bVar.b(otherUserName, z17, true);
            java.lang.String h17 = mx3.i0.h(otherUserName);
            boolean b19 = nq4.f.f420547a.b();
            if (b19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPVoIPNotificationHelper", "Enable Bluetooth QuickAccept, use silent channel");
                java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("notification");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                android.app.NotificationManager notificationManager = (android.app.NotificationManager) systemService;
                java.lang.String str2 = h17 + "_silent";
                int i17 = android.os.Build.VERSION.SDK_INT;
                if (i17 >= 26) {
                    android.app.NotificationChannel notificationChannel = notificationManager.getNotificationChannel(h17);
                    android.app.NotificationChannel notificationChannel2 = new android.app.NotificationChannel(str2, notificationChannel.getName(), notificationChannel.getImportance());
                    str = null;
                    notificationChannel2.setSound(null, null);
                    notificationChannel2.setDescription(notificationChannel.getDescription());
                    notificationChannel2.setLockscreenVisibility(notificationChannel.getLockscreenVisibility());
                    notificationChannel2.enableLights(notificationChannel.shouldShowLights());
                    notificationChannel2.setLightColor(notificationChannel.getLightColor());
                    notificationChannel2.enableVibration(notificationChannel.shouldVibrate());
                    notificationChannel2.setVibrationPattern(notificationChannel.getVibrationPattern());
                    notificationChannel2.setGroup(notificationChannel.getGroup());
                    notificationChannel2.setBypassDnd(notificationChannel.canBypassDnd());
                    notificationChannel2.setShowBadge(notificationChannel.canShowBadge());
                    if (i17 >= 29) {
                        notificationChannel2.setAllowBubbles(notificationChannel.canBubble());
                    }
                    notificationManager.createNotificationChannel(notificationChannel2);
                } else {
                    str = null;
                }
                h17 = str2;
            } else {
                str = null;
                if (b19) {
                    throw new jz5.j();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPVoIPNotificationHelper", "Use origin channel");
            }
            android.app.PendingIntent activity = r26.i0.p(android.os.Build.MANUFACTURER, "vivo", true) ? android.app.PendingIntent.getActivity(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 0, intent, fp.g0.a(134217728) | 67108864) : android.app.PendingIntent.getActivity(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 0, intent, fp.g0.a(134217728));
            z2.k0 k0Var = new z2.k0(context, h17);
            k0Var.f550999j = 1;
            k0Var.f551008s = "call";
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            android.app.Notification notification = k0Var.D;
            notification.when = currentTimeMillis;
            k0Var.f550996g = activity;
            notification.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.c7v;
            k0Var.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572064xr));
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.f575003kc3 : com.p314xaae8f345.mm.R.C30867xcad56011.f575002kc2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(otherUserName, true);
            java.lang.String d17 = n17 != null ? n17.d1() : str;
            ((sg3.a) v0Var).getClass();
            k0Var.e(c01.a2.e(d17) + string);
            k0Var.h(2, true);
            k0Var.h(16, true);
            if (!fp.h.c(31) || com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getApplicationInfo().targetSdkVersion < 31) {
                k0Var.f551012w = b17;
                k0Var.f551013x = b18;
            } else if (fp.e0.b()) {
                k0Var.f551012w = b17;
                k0Var.f551013x = b18;
                k0Var.l(new z2.q0());
            } else if (ip.b.a()) {
                k0Var.f551012w = b17;
                k0Var.f551013x = b18;
            }
            if (fp.h.c(34)) {
                java.lang.Object systemService2 = context.getSystemService("notification");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService2, "null cannot be cast to non-null type android.app.NotificationManager");
                if (((android.app.NotificationManager) systemService2).canUseFullScreenIntent()) {
                    k0Var.i(activity, true);
                } else {
                    android.content.Intent data = new android.content.Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT").setData(android.net.Uri.parse("package:" + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b));
                    data.addFlags(268435456);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(data);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/voipmp/v2/notify/VoIPMPVoIPNotificationHelper", "voipNotify", "(Landroid/content/Context;Ljava/lang/String;ZLandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(context, "com/tencent/mm/voipmp/v2/notify/VoIPMPVoIPNotificationHelper", "voipNotify", "(Landroid/content/Context;Ljava/lang/String;ZLandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            } else {
                k0Var.i(activity, true);
            }
            android.app.Notification b27 = k0Var.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b27, "build(...)");
            b27.flags |= 4;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPVoIPNotificationHelper", "voip notify it ");
            ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) mo3.f.f411939a).n(41, b27, true);
            qo5.b.f447199d = java.lang.System.currentTimeMillis();
            if (mx3.f0.j() && fp.e0.g()) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.grantUriPermission("com.android.systemui", com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.vfs.r6.j(new java.io.File(mx3.i0.j(otherUserName).h()))), 1);
            }
            qo5.b.f447200e.m43071x58998cd();
            com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.k kVar = com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.k.f258810b;
            er4.k kVar2 = er4.k.VoIPMPIlinkSDKStatTypeNotifyAction;
            er4.j jVar = new er4.j();
            jVar.f337637d = er4.z.ACTION_TYPE_INCOMING_SHOW_NOTIFICATION;
            jVar.f337643m[1] = true;
            kVar.a(kVar2, jVar);
        }
        return jz5.f0.f384359a;
    }
}
