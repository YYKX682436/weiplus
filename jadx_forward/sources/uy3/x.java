package uy3;

/* loaded from: classes7.dex */
public final class x implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f513533d;

    public x(yz5.a aVar) {
        this.f513533d = aVar;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        android.os.Looper.myQueue().removeIdleHandler(this);
        this.f513533d.mo152xb9724478();
        return false;
    }
}
