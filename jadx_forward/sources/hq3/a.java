package hq3;

/* loaded from: classes12.dex */
public abstract class a {
    public static long a() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static final boolean b(int i17, int i18) {
        return (i17 & i18) > 0;
    }
}
