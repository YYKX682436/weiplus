package qj;

/* loaded from: classes12.dex */
public class b extends android.os.Handler {
    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        super.handleMessage(message);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SyncBarrierWatchDogPlus", "mainHandler handleMessage, msg = %s", message.toString());
        int i17 = message.arg1;
        if (i17 == 0) {
            qj.c.f445391b++;
        } else if (i17 == 1) {
            qj.c.f445391b = 0;
        }
    }
}
