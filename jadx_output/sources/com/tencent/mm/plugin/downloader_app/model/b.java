package com.tencent.mm.plugin.downloader_app.model;

/* loaded from: classes8.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f97255a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f97256b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f97257c = new java.lang.Object();

    public static void a(java.lang.String str) {
        synchronized (f97257c) {
            java.util.Map map = f97256b;
            java.lang.Integer num = (java.lang.Integer) ((java.util.HashMap) map).get(str);
            if (num == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.DownloadNotificationManager", "No notification id found");
                return;
            }
            ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).f(num.intValue());
            com.tencent.mars.xlog.Log.i("MicroMsg.DownloadNotificationManager", "cancelNotification, id = " + num);
            ((java.util.HashMap) map).remove(str);
            ((java.util.HashMap) f97255a).remove(str);
        }
    }

    public static android.app.PendingIntent b(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI.class);
        intent.putExtra("appId", str);
        intent.putExtra("view_task", true);
        intent.putExtra("from_scene", 1);
        return android.app.PendingIntent.getActivity(com.tencent.mm.sdk.platformtools.x2.f193071a, (int) java.lang.System.currentTimeMillis(), intent, fp.g0.a(0));
    }
}
