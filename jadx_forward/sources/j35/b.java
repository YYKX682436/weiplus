package j35;

/* loaded from: classes11.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f379032a;

    /* renamed from: b, reason: collision with root package name */
    public static final android.content.BroadcastReceiver f379033b = new j35.c();

    public static void a(final android.app.Activity activity) {
        if (activity == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AlarmPermissionHelper", "checkExactAlarmPermission, activity is null");
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.c() || android.os.Build.VERSION.SDK_INT < 31 || activity.getApplicationInfo().targetSdkVersion < 31) {
            return;
        }
        android.app.AlarmManager alarmManager = (android.app.AlarmManager) activity.getSystemService("alarm");
        if (alarmManager == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AlarmPermissionHelper", "am is null");
            return;
        }
        if (alarmManager.canScheduleExactAlarms()) {
            return;
        }
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_enable_request_exact_alarm_permission, false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlarmPermissionHelper", "skip request schedule exact alarm permission");
            return;
        }
        if (java.lang.System.currentTimeMillis() - j35.u.f("android.permission.SCHEDULE_EXACT_ALARM", 161) < 60000) {
            return;
        }
        if (j35.u.f("android.permission.SCHEDULE_EXACT_ALARM", 161) != 0 && !z2.h.b(activity, "android.permission.SCHEDULE_EXACT_ALARM")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlarmPermissionHelper", "user disable request schedule exact alarm permission");
        } else {
            if (f379032a) {
                return;
            }
            f379032a = true;
            db5.e1.C(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574231mv2), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new android.content.DialogInterface.OnClickListener() { // from class: j35.b$$a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlarmPermissionHelper", "need request schedule exact alarm permission");
                    android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.app.action.SCHEDULE_EXACT_ALARM_PERMISSION_STATE_CHANGED");
                    android.content.BroadcastReceiver broadcastReceiver = j35.b.f379033b;
                    android.app.Activity activity2 = activity;
                    activity2.registerReceiver(broadcastReceiver, intentFilter, 2);
                    android.content.Intent intent = new android.content.Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(activity2, arrayList.toArray(), "com/tencent/mm/pluginsdk/permission/AlarmPermissionHelper", "lambda$checkExactAlarmPermission$0", "(Landroid/app/Activity;Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activity2.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(activity2, "com/tencent/mm/pluginsdk/permission/AlarmPermissionHelper", "lambda$checkExactAlarmPermission$0", "(Landroid/app/Activity;Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    j35.u.m("android.permission.SCHEDULE_EXACT_ALARM", 161);
                    j35.b.f379032a = false;
                }
            }, new j35.DialogInterfaceOnClickListenerC28997x2d1840());
        }
    }
}
