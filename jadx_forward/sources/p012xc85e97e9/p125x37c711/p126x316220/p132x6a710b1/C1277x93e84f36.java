package p012xc85e97e9.p125x37c711.p126x316220.p132x6a710b1;

/* renamed from: androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver */
/* loaded from: classes13.dex */
public class C1277x93e84f36 extends android.content.BroadcastReceiver {
    static {
        a5.a0.e("ForceStopRunnable$Rcvr");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
            return;
        }
        int i17 = ((a5.z) a5.a0.c()).f82974b;
        k5.f.c(context);
    }
}
