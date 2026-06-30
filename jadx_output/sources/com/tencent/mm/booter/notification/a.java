package com.tencent.mm.booter.notification;

/* loaded from: classes11.dex */
public abstract class a {
    public int a(com.tencent.mm.booter.notification.NotificationItem notificationItem, qm.z zVar) {
        com.tencent.mm.booter.notification.NotificationItem notificationItem2;
        java.lang.String str;
        java.lang.CharSequence charSequence;
        java.lang.CharSequence charSequence2;
        int i17 = -1;
        if (notificationItem == null) {
            return -1;
        }
        synchronized (notificationItem) {
            int i18 = notificationItem.f63458d;
            if (i18 == -1) {
                i18 = pm.f.f356752a.h(notificationItem.f63462h, notificationItem.f63465n);
            }
            notificationItem.f63458d = i18;
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            if (context == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NotificationItem", "error, show notification but MMApplicationContext.getContext() == null");
            } else if (notificationItem.f63460f == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NotificationItem", "error, show notification but mNotification == null");
            } else {
                pm.g gVar = pm.f.f356752a;
                java.lang.String str2 = notificationItem.f63462h;
                gVar.getClass();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    java.util.Iterator it = gVar.iterator();
                    while (it.hasNext()) {
                        notificationItem2 = (com.tencent.mm.booter.notification.NotificationItem) it.next();
                        if (notificationItem2 != null && (str = notificationItem2.f63462h) != null && str.equals(str2)) {
                            break;
                        }
                    }
                }
                notificationItem2 = null;
                if (notificationItem2 != null) {
                    pm.f.f356752a.f356753d = notificationItem2.f63458d;
                }
                if (notificationItem2 != null && (charSequence = notificationItem2.f63460f.tickerText) != null && (charSequence2 = notificationItem.f63460f.tickerText) != null && charSequence.equals(charSequence2)) {
                    notificationItem.f63460f.tickerText = ((java.lang.Object) notificationItem.f63460f.tickerText) + " ";
                }
                pm.g gVar2 = pm.f.f356752a;
                com.tencent.mm.booter.notification.NotificationItem j17 = gVar2.j(notificationItem);
                if (j17 != null) {
                    gVar2.d(new z2.n1(com.tencent.mm.sdk.platformtools.x2.f193071a), j17.f63458d);
                }
                if (android.os.Build.VERSION.SDK_INT >= 31) {
                    android.app.Notification notification = notificationItem.f63460f;
                    int c17 = zVar == null ? 0 : zVar.c() - gVar2.e();
                    notification.number = c17;
                    notificationItem.f63467p = c17;
                } else {
                    notificationItem.f63467p = com.tencent.mm.booter.notification.h0.a(notificationItem.f63460f, zVar);
                }
                mm.w.e("launcher");
                notificationItem.a(context);
                i17 = notificationItem.f63458d;
            }
        }
        return i17;
    }
}
