package u81;

/* loaded from: classes7.dex */
public class j implements java.lang.Runnable {
    public j(u81.f0 f0Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Looper.myQueue().addIdleHandler(new u81.i(this));
    }
}
