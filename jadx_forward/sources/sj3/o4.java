package sj3;

/* loaded from: classes14.dex */
public class o4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f490204d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sj3.a5 f490205e;

    public o4(sj3.a5 a5Var, boolean z17) {
        this.f490205e = a5Var;
        this.f490204d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        sj3.a5 a5Var = this.f490205e;
        a5Var.A.m67074xdd7d58e5(this.f490204d);
        a5Var.y();
    }
}
