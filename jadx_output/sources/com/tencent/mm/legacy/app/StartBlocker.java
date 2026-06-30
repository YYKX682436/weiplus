package com.tencent.mm.legacy.app;

/* loaded from: classes.dex */
public class StartBlocker {
    private static final java.util.List<java.lang.Object> sBlockers = new java.util.ArrayList();

    public static android.app.PendingIntent shouldBlock(android.content.Context context) {
        java.util.Iterator<java.lang.Object> it = sBlockers.iterator();
        while (it.hasNext()) {
            android.support.v4.media.f.a(it.next());
            try {
                throw null;
                break;
            } catch (java.lang.Exception unused) {
            }
        }
        return null;
    }
}
