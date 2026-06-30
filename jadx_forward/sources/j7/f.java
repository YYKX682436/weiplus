package j7;

/* loaded from: classes13.dex */
public class f extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j7.g f379538a;

    public f(j7.g gVar) {
        this.f379538a = gVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        j7.g gVar = this.f379538a;
        boolean z17 = gVar.f379541f;
        gVar.f379541f = gVar.i(context);
        if (z17 != this.f379538a.f379541f) {
            if (android.util.Log.isLoggable("ConnectivityMonitor", 3)) {
                boolean z18 = this.f379538a.f379541f;
            }
            j7.g gVar2 = this.f379538a;
            com.p147xb1cd08cc.p148x5de23a5.q qVar = (com.p147xb1cd08cc.p148x5de23a5.q) gVar2.f379540e;
            if (!gVar2.f379541f) {
                qVar.getClass();
                return;
            }
            synchronized (qVar.f125513b) {
                qVar.f125512a.b();
            }
        }
    }
}
