package sx5;

/* loaded from: classes13.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f495290d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sx5.a1 f495291e;

    public u(sx5.a1 a1Var, java.lang.Runnable runnable) {
        this.f495291e = a1Var;
        this.f495290d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f495291e.D1) {
            this.f495290d.run();
        }
    }
}
