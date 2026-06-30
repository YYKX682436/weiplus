package cl;

/* loaded from: classes7.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f42826d;

    public y0(cl.q0 q0Var, java.lang.Object obj) {
        this.f42826d = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((com.eclipsesource.mmv8.Releasable) this.f42826d).release();
    }
}
