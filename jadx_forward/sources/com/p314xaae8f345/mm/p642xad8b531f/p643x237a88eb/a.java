package com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb;

/* loaded from: classes11.dex */
public abstract class a {
    public int a(com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.C10313x2dcd4ebe c10313x2dcd4ebe, qm.z zVar) {
        com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.C10313x2dcd4ebe c10313x2dcd4ebe2;
        java.lang.String str;
        java.lang.CharSequence charSequence;
        java.lang.CharSequence charSequence2;
        int i17 = -1;
        if (c10313x2dcd4ebe == null) {
            return -1;
        }
        synchronized (c10313x2dcd4ebe) {
            int i18 = c10313x2dcd4ebe.f144991d;
            if (i18 == -1) {
                i18 = pm.f.f438285a.h(c10313x2dcd4ebe.f144995h, c10313x2dcd4ebe.f144998n);
            }
            c10313x2dcd4ebe.f144991d = i18;
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            if (context == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NotificationItem", "error, show notification but MMApplicationContext.getContext() == null");
            } else if (c10313x2dcd4ebe.f144993f == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NotificationItem", "error, show notification but mNotification == null");
            } else {
                pm.g gVar = pm.f.f438285a;
                java.lang.String str2 = c10313x2dcd4ebe.f144995h;
                gVar.getClass();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    java.util.Iterator it = gVar.iterator();
                    while (it.hasNext()) {
                        c10313x2dcd4ebe2 = (com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.C10313x2dcd4ebe) it.next();
                        if (c10313x2dcd4ebe2 != null && (str = c10313x2dcd4ebe2.f144995h) != null && str.equals(str2)) {
                            break;
                        }
                    }
                }
                c10313x2dcd4ebe2 = null;
                if (c10313x2dcd4ebe2 != null) {
                    pm.f.f438285a.f438286d = c10313x2dcd4ebe2.f144991d;
                }
                if (c10313x2dcd4ebe2 != null && (charSequence = c10313x2dcd4ebe2.f144993f.tickerText) != null && (charSequence2 = c10313x2dcd4ebe.f144993f.tickerText) != null && charSequence.equals(charSequence2)) {
                    c10313x2dcd4ebe.f144993f.tickerText = ((java.lang.Object) c10313x2dcd4ebe.f144993f.tickerText) + " ";
                }
                pm.g gVar2 = pm.f.f438285a;
                com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.C10313x2dcd4ebe j17 = gVar2.j(c10313x2dcd4ebe);
                if (j17 != null) {
                    gVar2.d(new z2.n1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), j17.f144991d);
                }
                if (android.os.Build.VERSION.SDK_INT >= 31) {
                    android.app.Notification notification = c10313x2dcd4ebe.f144993f;
                    int c17 = zVar == null ? 0 : zVar.c() - gVar2.e();
                    notification.number = c17;
                    c10313x2dcd4ebe.f145000p = c17;
                } else {
                    c10313x2dcd4ebe.f145000p = com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.h0.a(c10313x2dcd4ebe.f144993f, zVar);
                }
                mm.w.e("launcher");
                c10313x2dcd4ebe.a(context);
                i17 = c10313x2dcd4ebe.f144991d;
            }
        }
        return i17;
    }
}
