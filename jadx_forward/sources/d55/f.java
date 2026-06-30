package d55;

/* loaded from: classes12.dex */
public class f implements android.content.ServiceConnection {
    public f(d55.g gVar) {
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        d55.o0.a(4, "MicroMsg.recovery.callback", "onServiceConnected");
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        d55.o0.a(4, "MicroMsg.recovery.callback", "onServiceDisconnected");
    }
}
