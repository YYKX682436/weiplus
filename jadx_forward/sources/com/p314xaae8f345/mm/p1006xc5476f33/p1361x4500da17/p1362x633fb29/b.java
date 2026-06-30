package com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29;

/* loaded from: classes8.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f178788a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f178789b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f178790c = new java.lang.Object();

    public static void a(java.lang.String str) {
        synchronized (f178790c) {
            java.util.Map map = f178789b;
            java.lang.Integer num = (java.lang.Integer) ((java.util.HashMap) map).get(str);
            if (num == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadNotificationManager", "No notification id found");
                return;
            }
            ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).f(num.intValue());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadNotificationManager", "cancelNotification, id = " + num);
            ((java.util.HashMap) map).remove(str);
            ((java.util.HashMap) f178788a).remove(str);
        }
    }

    public static android.app.PendingIntent b(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.ActivityC13242xdf6880d5.class);
        intent.putExtra("appId", str);
        intent.putExtra("view_task", true);
        intent.putExtra("from_scene", 1);
        return android.app.PendingIntent.getActivity(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (int) java.lang.System.currentTimeMillis(), intent, fp.g0.a(0));
    }
}
