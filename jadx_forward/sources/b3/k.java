package b3;

/* loaded from: classes13.dex */
public abstract class k {
    public static android.content.Intent a(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, java.lang.String str, android.os.Handler handler, int i17) {
        return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i17);
    }
}
