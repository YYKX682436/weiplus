package s65;

/* loaded from: classes11.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f485020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s65.m0 f485021e;

    public k0(s65.m0 m0Var, long j17) {
        this.f485021e = m0Var;
        this.f485020d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        long max = java.lang.Math.max(0L, this.f485020d);
        s65.m0 m0Var = this.f485021e;
        m0Var.f485028b += max;
        m0Var.a(false);
    }
}
