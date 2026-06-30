package mn1;

/* loaded from: classes12.dex */
public class s implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.LinkedBlockingQueue f411415d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mn1.e f411416e;

    public s(mn1.e eVar, java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue) {
        this.f411416e = eVar;
        this.f411415d = linkedBlockingQueue;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "startSendRequestSessionResponse.onNotifyWorker";
    }

    @Override // java.lang.Runnable
    public void run() {
        mn1.u uVar;
        java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = this.f411415d;
        while (true) {
            mn1.e eVar = this.f411416e;
            if (eVar.f411381k || mn1.e.N) {
                return;
            }
            try {
                uVar = (mn1.u) linkedBlockingQueue.poll(500L, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.lang.Exception unused) {
                uVar = null;
            }
            linkedBlockingQueue.size();
            if (uVar != null) {
                eVar.b(uVar.f411418a, uVar.f411420c, uVar.f411421d, uVar.f411419b);
            }
        }
    }
}
