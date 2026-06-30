package org.p3343x72743996.net;

/* renamed from: org.chromium.net.ThreadStatsUid */
/* loaded from: classes12.dex */
public class C29557xfa58e37b {

    /* renamed from: sClearThreadStatsUid */
    private static final java.lang.reflect.Method f74314x182e2395;

    /* renamed from: sSetThreadStatsUid */
    private static final java.lang.reflect.Method f74315x24ed202a;

    static {
        try {
            f74315x24ed202a = android.net.TrafficStats.class.getMethod("setThreadStatsUid", java.lang.Integer.TYPE);
            f74314x182e2395 = android.net.TrafficStats.class.getMethod("clearThreadStatsUid", new java.lang.Class[0]);
        } catch (java.lang.NoSuchMethodException | java.lang.SecurityException e17) {
            throw new java.lang.RuntimeException("Unable to get TrafficStats methods", e17);
        }
    }

    /* renamed from: clear */
    public static void m153653x5a5b64d() {
        try {
            f74314x182e2395.invoke(null, new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException e17) {
            throw new java.lang.RuntimeException("TrafficStats.clearThreadStatsUid failed", e17);
        } catch (java.lang.reflect.InvocationTargetException e18) {
            throw new java.lang.RuntimeException("TrafficStats.clearThreadStatsUid failed", e18);
        }
    }

    public static void set(int i17) {
        try {
            f74315x24ed202a.invoke(null, java.lang.Integer.valueOf(i17));
        } catch (java.lang.IllegalAccessException e17) {
            throw new java.lang.RuntimeException("TrafficStats.setThreadStatsUid failed", e17);
        } catch (java.lang.reflect.InvocationTargetException e18) {
            throw new java.lang.RuntimeException("TrafficStats.setThreadStatsUid failed", e18);
        }
    }
}
