package dh4;

/* loaded from: classes15.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f314039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dh4.f0 f314040e;

    public c0(dh4.f0 f0Var, int i17) {
        this.f314040e = f0Var;
        this.f314039d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f314040e.f(this.f314039d - 1);
    }
}
