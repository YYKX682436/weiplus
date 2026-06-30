package hq5;

/* loaded from: classes12.dex */
public final class j extends com.p314xaae8f345.mm.app.s2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq5.m f364769d;

    public j(hq5.m mVar) {
        this.f364769d = mVar;
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
        android.app.Notification.Builder builder;
        java.util.List i17 = kz5.c0.i(1, 2, 6, 15, 7, 8);
        hq5.m mVar = this.f364769d;
        if (!i17.contains(java.lang.Integer.valueOf(mVar.f364780g))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(mVar.f364777d, "onAppBackground() called, state: " + mVar.f364780g);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(mVar.f364777d, "onAppBackground() called, showNotification");
        try {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            if (context == null) {
                return;
            }
            android.content.Intent intent = new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2694xe7814c81.ActivityC22353x5623e3da.class);
            pf5.j0.a(intent, hq5.u0.class);
            android.app.PendingIntent activity = android.app.PendingIntent.getActivity(context, 0, intent, 201326592);
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                android.app.NotificationManager T6 = mVar.T6(context);
                if (T6.getNotificationChannel("WeDropPushChannel") == null) {
                    T6.createNotificationChannel(new android.app.NotificationChannel("WeDropPushChannel", "WeDropPushChannel", 4));
                }
                builder = new android.app.Notification.Builder(context, "WeDropPushChannel");
            } else {
                builder = new android.app.Notification.Builder(context);
            }
            builder.setContentTitle(context.getString(mVar.f364779f ? com.p314xaae8f345.mm.R.C30867xcad56011.f573222nt1 : com.p314xaae8f345.mm.R.C30867xcad56011.f573221nt0)).setStyle(new android.app.Notification.BigTextStyle().bigText("")).setSmallIcon(com.p314xaae8f345.mm.R.C30861xcebc809e.c7v).setAutoCancel(true).setContentIntent(activity).setWhen(java.lang.System.currentTimeMillis());
            mVar.T6(context).notify(mVar.f364778e, builder.build());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(mVar.f364777d, e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
        hq5.m mVar = this.f364769d;
        try {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            if (context != null) {
                mVar.T6(context).cancel(mVar.f364778e);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(mVar.f364777d, e17, "", new java.lang.Object[0]);
        }
    }
}
