package a82;

/* loaded from: classes12.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a82.v0 f83708d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a82.w0 f83709e;

    public u0(a82.w0 w0Var, a82.v0 v0Var) {
        this.f83709e = w0Var;
        this.f83708d = v0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        a82.w0.a(this.f83709e, this.f83708d, false);
    }

    /* renamed from: toString */
    public java.lang.String m835x9616526c() {
        return super.toString() + "|retryJob";
    }
}
