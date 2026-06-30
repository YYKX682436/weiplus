package c.t.m.p134x35c0ce.c;

/* loaded from: classes12.dex */
public class n {
    public static boolean a(android.os.Handler handler) {
        return a(handler == null ? null : handler.getLooper());
    }

    public static boolean a(android.os.Looper looper) {
        return looper != null && looper.getThread().isAlive();
    }

    public static boolean a(android.os.Handler handler, int i17, long j17) {
        return a(handler, handler == null ? null : handler.obtainMessage(i17), j17);
    }

    public static boolean a(android.os.Handler handler, android.os.Message message, long j17) {
        if (message == null || !a(handler)) {
            return false;
        }
        return handler.sendMessageDelayed(message, j17);
    }
}
