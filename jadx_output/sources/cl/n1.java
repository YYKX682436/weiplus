package cl;

/* loaded from: classes7.dex */
public class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl.q1 f42705d;

    public n1(cl.q1 q1Var) {
        this.f42705d = q1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.concurrent.Future future = this.f42705d.f42745c;
        if (future != null) {
            future.cancel(false);
        }
    }
}
