package kj;

/* loaded from: classes12.dex */
public class p implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.MessageQueue.IdleHandler f389792d;

    public p(android.os.MessageQueue.IdleHandler idleHandler) {
        this.f389792d = idleHandler;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        android.os.Handler handler = kj.q.f389795g;
        java.lang.Runnable runnable = kj.q.f389796h;
        kj.q.f389793e.getClass();
        handler.postDelayed(runnable, 2000);
        boolean queueIdle = this.f389792d.queueIdle();
        kj.q.f389795g.removeCallbacks(kj.q.f389796h);
        return queueIdle;
    }
}
