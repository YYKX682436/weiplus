package a82;

/* loaded from: classes12.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a82.v0 f2175d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a82.w0 f2176e;

    public u0(a82.w0 w0Var, a82.v0 v0Var) {
        this.f2176e = w0Var;
        this.f2175d = v0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        a82.w0.a(this.f2176e, this.f2175d, false);
    }

    public java.lang.String toString() {
        return super.toString() + "|retryJob";
    }
}
