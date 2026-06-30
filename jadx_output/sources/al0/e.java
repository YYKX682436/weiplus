package al0;

/* loaded from: classes12.dex */
public class e extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        int intExtra;
        java.lang.String action = intent.getAction();
        if (com.tencent.mm.sdk.platformtools.t8.K0(action) || (intExtra = intent.getIntExtra("pid", 0)) == 0) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("processName");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) || !stringExtra.equals(com.tencent.mm.sdk.platformtools.t8.W(com.tencent.mm.sdk.platformtools.x2.f193071a, intExtra))) {
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
