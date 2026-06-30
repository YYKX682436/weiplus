package pv5;

/* loaded from: classes11.dex */
public class a implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pv5.b f440154d;

    public a(pv5.b bVar) {
        this.f440154d = bVar;
    }

    @Override // android.content.ServiceConnection
    public void onBindingDied(android.content.ComponentName componentName) {
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        android.content.ServiceConnection serviceConnection;
        pv5.b bVar = this.f440154d;
        android.content.Context context = bVar.f440155a;
        if (context == null || (serviceConnection = bVar.f440156b) == null) {
            return;
        }
        try {
            context.unbindService(serviceConnection);
        } catch (java.lang.Throwable unused) {
        }
    }
}
