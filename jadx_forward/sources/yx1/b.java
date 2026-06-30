package yx1;

/* loaded from: classes13.dex */
public class b extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.os.Handler f549356a;

    public b(yx1.c cVar, android.os.Handler handler) {
        this.f549356a = handler;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.INotificationManagerInvocationHandler", "run on my handler");
            this.f549356a.handleMessage(message);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.INotificationManagerInvocationHandler", "protect succ");
        }
    }
}
