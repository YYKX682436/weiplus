package r9;

/* loaded from: classes15.dex */
public final class e0 extends android.os.Handler implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final r9.d0 f474890d;

    public e0(r9.d0 d0Var) {
        this.f474890d = d0Var;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        this.f474890d.f();
    }

    @Override // java.lang.Runnable
    public void run() {
        sendEmptyMessage(0);
    }
}
