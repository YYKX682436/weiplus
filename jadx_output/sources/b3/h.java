package b3;

/* loaded from: classes13.dex */
public abstract class h {
    public static android.content.Intent a(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, java.lang.String str, android.os.Handler handler, int i17) {
        return ((i17 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i17 & 1) : context.registerReceiver(broadcastReceiver, intentFilter, b3.l.obtainAndCheckReceiverPermission(context), handler);
    }

    public static android.content.ComponentName b(android.content.Context context, android.content.Intent intent) {
        return context.startForegroundService(intent);
    }
}
