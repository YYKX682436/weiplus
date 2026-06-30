package s65;

/* loaded from: classes11.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f485023d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s65.m0 f485024e;

    public l0(s65.m0 m0Var, long j17) {
        this.f485024e = m0Var;
        this.f485023d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        long max = java.lang.Math.max(0L, this.f485023d);
        s65.m0 m0Var = this.f485024e;
        m0Var.f485029c += max;
        m0Var.a(false);
    }
}
