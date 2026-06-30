package androidx.work.impl.utils;

/* loaded from: classes13.dex */
public class ForceStopRunnable$BroadcastReceiver extends android.content.BroadcastReceiver {
    static {
        a5.a0.e("ForceStopRunnable$Rcvr");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
            return;
        }
        int i17 = ((a5.z) a5.a0.c()).f1441b;
        k5.f.c(context);
    }
}
