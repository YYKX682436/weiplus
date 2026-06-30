package al0;

/* loaded from: classes12.dex */
public class e extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        int intExtra;
        java.lang.String action = intent.getAction();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(action) || (intExtra = intent.getIntExtra("pid", 0)) == 0) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("processName");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) || !stringExtra.equals(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.W(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, intExtra))) {
            return;
        }
        java.lang.String stringExtra2 = intent.getStringExtra("traceMsg");
        long longExtra = intent.getLongExtra("tick", 0L);
        if ("com.tencent.mm.ACTION.note_tracemsg_lock".equals(action)) {
            al0.g.b(stringExtra, stringExtra2, longExtra);
        } else if ("com.tencent.mm.ACTION.note_tracemsg_unlock".equals(action)) {
            al0.g.c(stringExtra, stringExtra2, longExtra);
        }
    }
}
