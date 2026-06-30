package hc2;

/* loaded from: classes10.dex */
public abstract class k0 {
    public static boolean a(long j17, int i17, int i18, int i19, java.lang.Object obj) {
        int i27 = (i19 & 1) != 0 ? 1970 : i17;
        int i28 = (i19 & 2) != 0 ? 2900 : i18;
        if (j17 <= 0) {
            return false;
        }
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(i27, 0, 1, 0, 0, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        long timeInMillis = calendar.getTimeInMillis();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.set(i28, 0, 1, 0, 0, 0);
        calendar2.set(14, 0);
        calendar2.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        return timeInMillis <= j17 && j17 <= calendar2.getTimeInMillis();
    }
}
