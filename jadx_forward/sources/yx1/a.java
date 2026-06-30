package yx1;

/* loaded from: classes13.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f549355d;

    public a(yx1.d dVar, java.lang.Runnable runnable) {
        this.f549355d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.INotificationManagerInvocationHandler", "run on my runnable");
            this.f549355d.run();
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.INotificationManagerInvocationHandler", "protect succ");
        }
    }
}
